package co.bbenson.product;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

class ProductCreateRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String sku;
    @Min(0)
    private Integer price;

    public ProductCreateRequest() {
    }

    public ProductCreateRequest(String sku, String name, Integer price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getSku() {
        return sku;
    }

    public Product toProduct() {
        return new Product(
                getSku(),
                getName(),
                getPrice(),
                LocalDateTime.now()
        );
    }
}
