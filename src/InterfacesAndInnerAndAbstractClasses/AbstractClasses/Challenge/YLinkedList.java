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

    public int getLength() {
        return length;
    }

    private boolean removeItemByValue(ListItem li) {
        boolean hasPrevious = li.hasPrevious();
        boolean hasNext = li.hasNext();
        ListItem next = li.getNext();
        ListItem previous = li.getPrevious();
        if (hasPrevious && hasNext) {
            previous.setNext(next);
            next.setPrevious(previous);
        } else if (hasPrevious) {
            previous.setNext(null);
        } else if (hasNext) {
            next.setPrevious(null);
            this.head = next;
        } else {
            this.head = null;
        }
        return true;
    }

    public boolean removeItemByValue(Object value) {
        boolean notNull = this.head != null;
        ListItem li = this.head;
        while (notNull) {
            if (li.getValue() == value) return removeItemByValue(li);
            li = li.getNext();
            notNull = li != null;
        }
        return false;
    }

    public boolean removeItemByIndex(int index) {
        if (index > -1 && index < this.length) {
            int current = 0;
            ListItem li = this.head;
            while (current < this.length) {
                if (current != index) {
                    li = li.getNext();
                    current++;
                } else {
                    return removeItemByValue(li);
                }
            }
        }
        return false;
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
            return;
        }
        ListItem currentItem = head;
        boolean continueLoop = currentItem.hasNext();
        while (continueLoop) {
            int location = currentItem.compareTo(newItem);
            if (location > 0) location = 1;
            if (location < 0) location = -1;
            switch (location) {
                case 0:
                    insertBefore(currentItem.getNext(), newItem);
                    insertAfter(currentItem, newItem);
                    continueLoop = false;
                    break;
                case -1:
                    insertAfter(currentItem.getPrevious(), newItem);
                    insertBefore(currentItem, newItem);
                    continueLoop = false;
                    break;
                case 1:
                    if (!currentItem.hasNext()) {
                        insertAfter(currentItem, newItem);
                        continueLoop = false;
                        break;
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
            length++;
            return true;
        }
        if (newItem.compareTo(head) < 1) {
            insertBefore(head, newItem);
            length++;
            head = newItem;
            return true;
        }
        if (!head.hasNext()) {
            insertAfter(head, newItem);
            length++;
            return true;
        }
        return false;
    }
}
