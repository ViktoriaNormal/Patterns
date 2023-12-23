import java.util.Vector;

public class MenuIteratorVector implements MenuIterator{

    private Vector<MenuItem> menuItems;
    private int position = 0;

    public MenuIteratorVector(Vector<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        return position < menuItems.size();
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    public void removeLast() {
        if (position > 0) {
            menuItems.remove(position - 1);
            position--;
        }
    }
}
