package sg.edu.nuss.iss.d12workshop;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// this mapping is to tell when do you enter into this controller
@RequestMapping(path = {"/cart"})
public class CartController {

    // method for dynamic page
    @GetMapping(produces = {"text/html"})
    public String displayCart (Model model) {
        
        CartService cs = new CartService();
        List<Item> cartItems = cs.getCartItems();
        model.addAttribute("cartItems", cartItems); // attribute name

        // return html view
        return "cart";
    }

    // create a path variable method
    @GetMapping("{itemname}")
    public String filteredCart(
        @PathVariable(name="itemname", required=true) String itemname,
        Model model) {
        CartService cs = new CartService();
        List<Item> cartItems = cs.getCartItems();

        List<Item> filteredItems = new LinkedList<>();
        for (Item i : cartItems) {
            if (i.getItemName().contains(itemname))
                filteredItems.add(i);
        }

        model.addAttribute("cartItems", filteredItems);
        return "cart";
    }
    
}
