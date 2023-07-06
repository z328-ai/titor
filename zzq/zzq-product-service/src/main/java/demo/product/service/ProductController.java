package demo.product.service;

import org.springframework.web.bind.annotation.*;
import zzq.interfaces.grpc.Product;

@RestController
@RequestMapping("/products")

public class ProductController {
    private final ProductRestAdapter productRestAdapter;

    public ProductController(ProductRestAdapter productRestAdapter) {
        this.productRestAdapter = productRestAdapter;
    }

    @PostMapping
    public void addProduct(Product product) {
        productRestAdapter.addProduct(product);
    }

    @GetMapping("/{id}")
    public int getProductCount(@PathVariable("id") long id) {
        return productRestAdapter.getProductCount(id, "");
    }

    @GetMapping("/name/{name}")
    public int getProductCount(@PathVariable("name") String name) {
        return productRestAdapter.getProductCount(0, name);
    }

    @PatchMapping("/{id}/{quantity}")
    public void updateProductQuantity(
            @PathVariable("id") long id,
            @PathVariable("quantity") int quantity
    ) {
        productRestAdapter.updateProductQuantity(id, quantity);
    }
}

