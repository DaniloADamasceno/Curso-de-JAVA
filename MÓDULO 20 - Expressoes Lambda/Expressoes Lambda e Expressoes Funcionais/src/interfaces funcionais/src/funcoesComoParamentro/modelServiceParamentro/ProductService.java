package funcoesComoParamentro.modelServiceParamentro;

import funcoesComoParamentro.entitiesParametro.ProductParametro;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<ProductParametro> list, Predicate<ProductParametro> criterio) {
        double soma = 0.0;
        for (ProductParametro pParametro : list) {
            if (criterio.test(pParametro)); {
                soma += pParametro.getPrice();
            }
        }
        return soma;
    }
}
