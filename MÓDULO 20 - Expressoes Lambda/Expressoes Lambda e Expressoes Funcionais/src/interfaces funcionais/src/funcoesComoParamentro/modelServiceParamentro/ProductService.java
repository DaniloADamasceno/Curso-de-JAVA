package funcoesComoParamentro.modelServiceParamentro;

import funcoesComoParamentro.entitiesParametro.ProductParameter;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<ProductParameter> list, Predicate<ProductParameter> criterio) {
        double sumFilter = 0.0;
        for (ProductParameter pParameterFilterSum : list) {
            if (criterio.test(pParameterFilterSum)) {
                sumFilter += pParameterFilterSum.getPrice();
            }
        }
        return sumFilter;
    }
}
