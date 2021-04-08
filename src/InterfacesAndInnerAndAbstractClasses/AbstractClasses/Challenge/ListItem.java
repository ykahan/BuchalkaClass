package InterfacesAndInnerAndAbstractClasses.AbstractClasses.Challenge;

public abstract class ListItem {
    private ListItem next;
    private ListItem previous;
    private Object value;

    public ListItem(Object value){
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    private void setNext(ListItem newListItem){
        if(this.next != null) {
            newListItem.next = this.next;
            this.next.previous = newListItem;
        }
        newListItem.previous = this;
        this.next = newListItem;
    }

    private void setPrevious(ListItem newListItem){
        if(this.previous != null){
            newListItem.previous = this.previous;
            this.previous.next = newListItem;
        }
        newListItem.next = this;
        this.previous = newListItem;
    }
}
