package ReferenceTypesAndValueTypes;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceries = new ArrayList<>();

    public void addGroceries(String item) {
        groceries.add(item);
    }

    public void printList() {
        System.out.println("You have " + groceries.size() + " items on your list.");
        for (int i = 0; i < groceries.size(); i++) {
            System.out.println("Item #" + (i + 1) + ": " + groceries.get(i));
        }
    }

    public void changeItem(int index, String newItem) {
        System.out.println("Changing " + groceries.get(index) + " to " + newItem + ".");
        groceries.set(index, newItem);
    }

    public void removeItem(int index) {
        System.out.println("Removing " + groceries.get(index) + " from your list.");
        groceries.remove(index);
    }

    public String findItem(String item) {
        int position = groceries.indexOf(item);
        if (position > -1) return groceries.get(position);
        return null;
    }
}
