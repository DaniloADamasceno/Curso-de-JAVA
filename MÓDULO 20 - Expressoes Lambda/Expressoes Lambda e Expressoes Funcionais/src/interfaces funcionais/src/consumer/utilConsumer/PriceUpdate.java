package consumer.utilConsumer;

import consumer.entitiesConsumer.ProductConsumer;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<ProductConsumer> {
    @Override
    public void accept(ProductConsumer pConsumer) {
        pConsumer.setPrice(pConsumer.getPrice() * 1.1);                                                // 10% de aumento

    }
}
