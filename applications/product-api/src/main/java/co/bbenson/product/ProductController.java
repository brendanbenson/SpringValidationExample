package co.bbenson.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProductController {
    private ProductCreateRequestValidator productCreateRequestValidator;
    private ProductRepository productRepository;

    @Autowired
    public ProductController(
            ProductCreateRequestValidator productCreateRequestValidator,
            ProductRepository productRepository
    ) {
        this.productCreateRequestValidator = productCreateRequestValidator;
        this.productRepository = productRepository;
    }

    @InitBinder("productCreateRequest")
    public void setupBinder(WebDataBinder binder) {
        binder.addValidators(productCreateRequestValidator);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public Product create(@Valid @RequestBody ProductCreateRequest productCreateRequest) {
        Product product = productCreateRequest.toProduct();

        productRepository.save(product);

        return product;
    }
}
