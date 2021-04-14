package InterfacesAndInnerAndAbstractClasses.AbstractClasses.Challenge;

public class StringListItem extends ListItem{
    public StringListItem(Object value) {
        super(value);
    }

    public void addToList(){

    }

    @Override
    public int compareTo(ListItem otherItem) {
        String thisValue = (String) this.getValue();
        String otherValue = (String) otherItem.getValue();
        return thisValue.compareTo(otherValue);
    }
}
