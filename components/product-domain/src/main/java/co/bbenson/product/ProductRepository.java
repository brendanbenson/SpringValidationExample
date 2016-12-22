package co.bbenson.product;

public interface ProductRepository {
    void save(Product product);
    boolean exists(Product product);
}
