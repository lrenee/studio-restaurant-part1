package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date dateUpdated;
    private ArrayList<MenuItem> menuItem = new ArrayList<>();
    private String newMenuItem;

    public void addMenuItem(MenuItem aMenuItem) {
        menuItem.add(aMenuItem);
    };

    public ArrayList<String> getMenuItems() {
        ArrayList<String> menuItem = new ArrayList<>();

        for (MenuItem field : this.menuItem) {
            String lineItem = "";

            lineItem += field.getName() + "\t";
            lineItem += field.getPrice() + "\t";
            lineItem += field.getDescription() + "\t";
            lineItem += field.getCategory() + "\t";
            lineItem += field.getDateAdded() + "\t";
            lineItem += field.getNewItem();

            menuItem.add(lineItem);
        }
        return menuItem;

    }

}
