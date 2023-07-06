package demo.product.service;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import zzq.interfaces.grpc.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
@GrpcService
public class ProductServiceImpl extends ProductServiceGrpc.ProductServiceImplBase {
    private final String dbUrl = "jdbc:mysql://localhost:3306/grpc?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";

    private final String dbUser = "root";
    private final String dbPassword = "zzq@12345";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addProduct(AddProductRequest request, StreamObserver<Empty> responseObserver) {
        Product product = request.getProduct();

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String sql = "INSERT INTO products (id, name, num, style, provider) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, product.getId());
            statement.setString(2, product.getName());
            statement.setInt(3, product.getNum());
            statement.setString(4, product.getStyle());
            statement.setString(5, product.getProvider());

            statement.executeUpdate();
            statement.close();

            log.info("商品已添加, 商品名称: " + product.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

    @Override
    public void getProduct(GetProductRequest request, StreamObserver<GetProductResponse> responseObserver) {
        long productId = request.getId();
        String productName = request.getName(); // 修改此处

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String sql = "SELECT * FROM products WHERE id = ? OR name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, productId);
            statement.setString(2, productName);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                int num = resultSet.getInt("num");
                String style = resultSet.getString("style");
                String provider = resultSet.getString("provider");

                Product product = Product.newBuilder()
                        .setId(id)
                        .setName(name)
                        .setNum(num)
                        .setStyle(style)
                        .setProvider(provider)
                        .build();

                GetProductResponse response = GetProductResponse.newBuilder()
                        .setProduct(product)
                        .build();

                responseObserver.onNext(response);
            } else {
                responseObserver.onNext(GetProductResponse.getDefaultInstance());
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        responseObserver.onCompleted();
    }

    // 通过ID获取商品数量，连接数据库操作
    private Product getProductById(long productId) {
        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String sql = "SELECT * FROM products WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, productId);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                int num = resultSet.getInt("num");
                String style = resultSet.getString("style");
                String provider = resultSet.getString("provider");

                return Product.newBuilder()
                        .setId(id)
                        .setName(name)
                        .setNum(num)
                        .setStyle(style)
                        .setProvider(provider)
                        .build();
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 更新商品数量
    @Override
    public void updateProductCount(UpdateProductCountRequest request, StreamObserver<Empty> responseObserver) {
        long productId = request.getId();
        int quantity = request.getQuantity();

        Product product = getProductById(productId);

        if (product != null) {
            int newQuantity = product.getNum() + quantity;

            updateProductQuantityInDatabase(productId, newQuantity);

            log.info("商品: " + product.getName() + " 数量已更新为: " + newQuantity);
        } else {
            log.warn("商品不存在，无法更新数量");
        }

        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

    private void updateProductQuantityInDatabase(long productId, int newQuantity) {
        // 在数据库中更新商品数量
        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String sql = "UPDATE products SET num = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, newQuantity);
            statement.setLong(2, productId);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

