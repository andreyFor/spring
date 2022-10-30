import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final Collection<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void add(Collection<Item> items) {
        this.items.addAll(items);
    }
    public Collection<Item> get() {
        return new ArrayList<>(items);
    }
//сделал
}