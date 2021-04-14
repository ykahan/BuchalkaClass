package InterfacesAndInnerAndAbstractClasses.AbstractClasses.Challenge;

public class YLinkedList {
    private ListItem head;
    private Cursor cursor;
    private int length;

    public YLinkedList() {
        head = null;
        length = 0;
        cursor = new Cursor();
    }

    public int getLength(){
        return length;
    }

    private void insertBefore(ListItem existingItem, ListItem newItem) {
        existingItem.setPrevious(newItem);
        newItem.setNext(existingItem);
    }

    private void insertAfter(ListItem existingItem, ListItem newItem) {
        existingItem.setNext(newItem);
        newItem.setPrevious(existingItem);
    }

    public void addItem(ListItem newItem) {
        if (addItemNearStartOfList(newItem)) {
            length++;
            return;
        }
        ListItem currentItem = head;
        while (currentItem.hasNext()) {
            int location = currentItem.compareTo(newItem);
            if (location > 0) location = 1;
            if (location < 0) location = -1;
            switch (location) {
                case 0:
                    insertBefore(currentItem.getNext(), newItem);
                    insertAfter(currentItem, newItem);
                    return;
                case -1:
                    insertAfter(currentItem.getPrevious(), newItem);
                    insertBefore(currentItem, newItem);
                    return;
                case 1:
                    if (!currentItem.hasNext()) {
                        insertAfter(currentItem, newItem);
                        return;
                    } else {
                        currentItem = currentItem.getNext();
                    }
                    break;
            }
        }
        length++;
    }

    private boolean addItemNearStartOfList(ListItem newItem) {
        if (length == 0) {
            head = newItem;
            return true;
        }
        if (newItem.compareTo(head) < 1) {
            insertBefore(head, newItem);
            head = newItem;
            return true;
        }
        if (!head.hasNext()) {
            insertAfter(head, newItem);
            return true;
        }
        return false;
    }
}
