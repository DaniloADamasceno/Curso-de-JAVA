package function.utilFunction;

import function.entitiesFunction.ProductFunction;

import java.util.function.Function;

public class UpperCaseName implements Function<ProductFunction, String> {
    @Override
    public String apply(ProductFunction productFunction) {
        return productFunction.getName().toUpperCase();
    }
}
