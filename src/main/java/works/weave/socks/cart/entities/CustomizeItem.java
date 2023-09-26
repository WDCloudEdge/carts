package works.weave.socks.cart.entities;

public class CustomizeItem {

    private Item item;

    private String description;

    public CustomizeItem(Item item, String description) {
        this.item = item;
        this.description = description;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
