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
        this.next = newListItem;
    }

    protected void setPrevious(ListItem newListItem){
        this.previous = newListItem;
    }

    public boolean hasNext(){
        if(next == null) return false;
        if(next == this) return false;
        return true;
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
