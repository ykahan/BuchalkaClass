package InterfacesAndInnerAndAbstractClasses.AbstractClasses.Challenge;

public abstract class ListItem {
    private ListItem next;
    private ListItem previous;
    private Object value;

    public abstract int compareTo(ListItem otherItem);

    public ListItem(Object value){
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    protected void setNext(ListItem newListItem){
        if(this.next != null) {
            newListItem.next = this.next;
            this.next.previous = newListItem;
        }
        newListItem.previous = this;
        this.next = newListItem;
    }

    protected void setPrevious(ListItem newListItem){
        if(this.previous != null){
            newListItem.previous = this.previous;
            this.previous.next = newListItem;
        }
        newListItem.next = this;
        this.previous = newListItem;
    }

    public boolean hasNext(){
        if(next != null) return true;
        return false;
    }

    public boolean hasPrevious(){
        if(previous != null) return true;
        return false;
    }

    protected ListItem getNext() {
        return next;
    }

    protected ListItem getPrevious() {
        return previous;
    }

    protected Object getValue() {
        return value;
    }
}
