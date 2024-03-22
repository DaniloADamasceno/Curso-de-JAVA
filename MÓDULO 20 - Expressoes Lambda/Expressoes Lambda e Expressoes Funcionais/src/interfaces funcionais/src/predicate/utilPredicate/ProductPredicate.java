package predicate.utilPredicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<predicate.entitiesPredicate.ProductPredicate> {
    @Override
    public boolean test(predicate.entitiesPredicate.ProductPredicate product) {
        return product.getPrice() >= 100;
    }
}
