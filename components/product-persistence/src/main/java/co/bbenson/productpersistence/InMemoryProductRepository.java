package co.bbenson.productpersistence;

import co.bbenson.product.ProductRepository;
import co.bbenson.product.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    private List<Product> products = new ArrayList<>();

    public void save(Product product) {
        products.add(product);
    }

    public boolean exists(Product product) {
        return products
                .stream()
                .anyMatch(Predicate.isEqual(product));
    }
}
