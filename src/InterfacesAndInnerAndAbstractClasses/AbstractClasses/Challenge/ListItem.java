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
//        if(this.next != null) {
//            this.next.previous = newListItem;
//        }
//        newListItem.previous = this;
//        this.next = newListItem;
        this.next = newListItem;
    }

    protected void setPrevious(ListItem newListItem){
//        if(this.previous != null){
//            this.previous.next = newListItem;
//            newListItem.previous = this.previous;
//        }
//        newListItem.next = this;
//        this.previous = newListItem;
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
