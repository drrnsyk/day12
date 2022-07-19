package sg.edu.nuss.iss.d12workshop;

// define a class for item
public class Item {
    // attributes properties of the item
    private String itemName;
    private Integer quantity;

    // getters
    public String getItemName() {
        return itemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    // setters
    public void setItemName(String name) {
        this.itemName = name;
    }

    public void setQuantity (Integer qty) {
        this.quantity = qty;
    }
}
