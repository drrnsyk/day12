package sg.edu.nuss.iss.d12workshop;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    
}
