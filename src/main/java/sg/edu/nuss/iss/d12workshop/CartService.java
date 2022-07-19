package sg.edu.nuss.iss.d12workshop;

import java.util.LinkedList;
import java.util.List;

// service

public class CartService {
    
    public List<Item> getCartItems() {

        List<Item> listItem = new LinkedList<>();
        Item item = new Item();

        item.setItemName("Adidas Ultraboost");
        item.setQuantity(5);
        listItem.add(item);

        item = new Item();
        item.setItemName("Nike Flynit");
        item.setQuantity(10);
        listItem.add(item);

        return listItem;
    }
}
