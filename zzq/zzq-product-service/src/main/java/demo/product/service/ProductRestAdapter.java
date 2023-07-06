package demo.product.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import zzq.interfaces.grpc.*;


@Slf4j
@Component
public class ProductRestAdapter {
    private final ProductServiceGrpc.ProductServiceBlockingStub productServiceStub;

    public ProductRestAdapter() {
        // 创建gRPC服务的连接
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        productServiceStub = ProductServiceGrpc.newBlockingStub(channel);
    }

    public void addProduct(Product product) {
        // 将REST请求转发到gRPC服务
        AddProductRequest request = AddProductRequest.newBuilder()
                .setProduct(product)
                .build();

        try {
            productServiceStub.addProduct(request);
            log.info("商品已添加, 商品名" + product.getName());
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }

    public int getProductCount(long productId, String productName) {
        GetProductRequest request = GetProductRequest.newBuilder()
                .setId(productId)
                .setName(productName)
                .build();
        try {
            GetProductResponse response = productServiceStub.getProduct(request);
            log.info("查询的商品数量为: "+response.getProduct().getNum());
            return response.getProduct().getNum();
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void updateProductQuantity(long productId, int quantity) {
        UpdateProductCountRequest request = UpdateProductCountRequest.newBuilder()
                .setId(productId)
                .setQuantity(quantity)
                .build();

        try {
            productServiceStub.updateProductCount(request);
            log.info("商品ID为: " + productId +" 的数量已更新: " +", 新数量：" + quantity);
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }
}

