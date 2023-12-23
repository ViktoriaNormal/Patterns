import java.util.List;

public class MenuIteratorList implements MenuIterator {

    private List<MenuItem> menuItems;
    private int position = 0;

    public MenuIteratorList(List<MenuItem> menuItems) {
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
        if (position != menuItems.size() - 1) {
            position++;
        }
        else {
            menuItems.remove(position - 1);
        }
    }
}
