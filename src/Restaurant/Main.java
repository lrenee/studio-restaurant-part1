package Restaurant;

import java.util.HashMap;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Menu menu = new Menu();

        menu.addMenuItem(new MenuItem("Apple Pie", 5.99, "Flaky crust, Golden Delicious Apples, Cinnamon, Ice Cream", "Dessert", 11/14/2019, "New"));
        menu.addMenuItem(new MenuItem("Filet Mignon", 39.99, "6 oz Angus Beef, Mashed Potatoes, Asparagus", "Main Course", 11/14/2019, "New"));
        menu.addMenuItem(new MenuItem("Queso Fundido", 5.99, "Chorizo Sausage, Cotija Cheese, Peppers", "Appetizer", 11/14/2019, "New"));

        System.out.println(menu.getMenuItems());

    }
}
