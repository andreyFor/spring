import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class ShopService {
    private final Basket basket;
    private Map<Integer, Item> Items;
    private Map<Integer,Item> items;


    public ShopService(Basket basket) {
        this.basket = basket;
    }

    @PostConstruct
    public void init() {
        items = Map.of(
                1, new Item(1, "Смартфон", 30000),
                2, new Item(2, "компьютер", 120000),
                3, new Item(3, "утюг", 3400),
                4, new Item(4, "фен", 35000)


        );
    }

    public void add(List<Integer> ids) {
        basket.add(
                ids.stream()
                        .map(items::get)
                        .collect((Collectors.toList())
                        ));

    }


    public Collection<Item> get(List<Integer> ids) {
        return basket.get();
    }
    //сделал
}