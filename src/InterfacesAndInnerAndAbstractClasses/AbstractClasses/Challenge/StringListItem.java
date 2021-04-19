package InterfacesAndInnerAndAbstractClasses.AbstractClasses.Challenge;

public class StringListItem extends ListItem{
    public StringListItem(Object value) {
        super(value);
    }

    @Override
    public int compareTo(ListItem otherItem) {
        String thisValue = (String) this.getValue();
        thisValue = thisValue.toUpperCase();
        String otherValue = (String) otherItem.getValue();
        otherValue = otherValue.toUpperCase();
        int comp = thisValue.compareTo(otherValue);
        // neg if thisValue precedes otherValue
        // pos if thisValue follows otherValue
        // 0 if two values identical
        return comp;
    }
}
