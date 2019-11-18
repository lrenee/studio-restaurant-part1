package Restaurant;

import java.util.Date;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private int dateAdded;
    private String newItem;

    public MenuItem(String name, double price, String description, String category, Integer dateAdded, String newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.newItem = newItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        if (aCategory == "Appetizer" || aCategory == "appetizer" || aCategory == "Main Course" || aCategory == "main course" || aCategory == "dessert" || aCategory == "Dessert") {
            category = aCategory;
        } else {
            System.out.println("Invalid category.  Options are Appetizer, Main Course, or Dessert.");
        }
    }

    public Integer getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Integer aDateAdded) {
        dateAdded = aDateAdded;
    }

    public String getNewItem() {
        return newItem;
    }

    public void setNewItem(String aNewItem) {
        newItem = aNewItem;
    }

}
