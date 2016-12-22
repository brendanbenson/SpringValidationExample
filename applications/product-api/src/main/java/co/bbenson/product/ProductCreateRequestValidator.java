package co.bbenson.product;

import co.bbenson.apierror.ApiErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ProductCreateRequestValidator implements Validator {
    private ProductRepository productRepository;

    @Autowired
    public ProductCreateRequestValidator(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return ProductCreateRequest.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ProductCreateRequest productCreateRequest = (ProductCreateRequest) target;

        if (productRepository.exists(productCreateRequest.toProduct())) {
            errors.reject(ApiErrorCode.ALREADY_EXISTS.getCode());
        }
    }
}
