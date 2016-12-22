package co.bbenson.product;

import java.time.LocalDateTime;

public class Product {
    private String sku;
    private String name;
    private Integer price;
    private LocalDateTime createdAt;

    public Product(String sku, String name, Integer price, LocalDateTime createdAt) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSku() {
        return sku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return sku != null ? sku.equals(product.sku) : product.sku == null;

    }

    @Override
    public int hashCode() {
        return sku != null ? sku.hashCode() : 0;
    }
}
