package consumer.utilConsumer;

import java.util.function.Consumer;
import consumer.entitiesConsumer.ProductConsumer;

public class PriceUpdate implements Consumer<ProductConsumer> {
    @Override
    public void accept(ProductConsumer pConsumer) {
        pConsumer.setPrice(pConsumer.getPrice() * 1.1);                                                // 10% de aumento

    }
}
