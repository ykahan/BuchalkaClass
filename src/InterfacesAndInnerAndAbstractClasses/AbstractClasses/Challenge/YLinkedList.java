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

    private boolean removeItem(ListItem li) {
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
        this.length--;
        return true;
    }

//    public boolean removeItemByValue(Object value) {
//        boolean notNull = this.head != null;
//        ListItem li = this.head;
//        while (notNull) {
//            if (li.getValue() == value) return removeItemByValue(li);
//            li = li.getNext();
//            notNull = li != null;
//        }
//        return false;
//    }

    public boolean removeItemByIndex(int index) {
        if (index > -1 && index < this.length) {
            int current = 0;
            ListItem li = this.head;
            while (current < this.length) {
                if (current != index) {
                    li = li.getNext();
                    current++;
                } else {
                    return removeItem(li);
                }
            }
        }
        return false;
    }

    private void insertBefore(ListItem existingItem, ListItem newItem) {
        if (existingItem.hasPrevious()) {
            ListItem previousItem = existingItem.getPrevious();
            previousItem.setNext(newItem);
            newItem.setPrevious(previousItem);
        }
        existingItem.setPrevious(newItem);
        newItem.setNext(existingItem);
    }

    private void insertAfter(ListItem existingItem, ListItem newItem) {
        if (existingItem.hasNext()) {
            ListItem nextItem = existingItem.getNext();
            nextItem.setPrevious(newItem);
            newItem.setNext(nextItem);
        }
        existingItem.setNext(newItem);
        newItem.setPrevious(existingItem);
    }

    private boolean foundItem(ListItem newItem) {
        boolean found = false;
        ListItem currentItem = head;
        while (!found && currentItem != null) {
            found = currentItem.equals(newItem);
            currentItem = currentItem.getNext();
        }
        return found;
    }

    public void addItem(ListItem newItem) {
        if (addItemNearStartOfList(newItem)) {
            return;
        }
        ListItem currentItem = head;
        boolean continueLoop = currentItem.hasNext();
        while (continueLoop) {
            int location = currentItem.compareTo(newItem);
            if (location > 0) location = 1;  // new item earlier
            if (location < 0) location = -1;  // new item later
            switch (location) {
                case 0:
                    continueLoop = false;
                    break;
                case -1:
                    if (!currentItem.hasNext()) {
                        insertAfter(currentItem, newItem);
                        this.length++;
                        continueLoop = false;
                        break;
                    }
                    if (currentItem.getNext().compareTo(newItem) > 0) {
                        insertBefore(currentItem.getNext(), newItem);
                        this.length++;
                        continueLoop = false;
                        break;
                    } else {
                        currentItem = currentItem.getNext();
                        break;
                    }
                case 1:
                    if (!currentItem.hasNext()) {
                        insertBefore(currentItem, newItem);
                        length++;
                        continueLoop = false;
                    } else {
                        currentItem = currentItem.getNext();
                    }
                    break;
            }
        }
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

    @Override
    public String toString() {
        if (head != null) {
            int counter = 1;
            ListItem li = head;
            StringBuilder sb = new StringBuilder();
            sb.append("\t" + this.length + " ListItem Value(s):\n");
            for (int i = 0; i < this.length; i++) {
                Object value = li.getValue();
                sb.append("\t" + (i + 1) + ")\t" + (String) value + "\n");
                li = li.getNext();
            }
            return sb.toString();
        } else {
            return "No ListItems found";
        }
    }
}
