package InterfacesAndInnerAndAbstractClasses.InterfaceChallenge;

import java.util.List;

public interface ISaveable {
    List<String> returnValues();
    void populateFields(List<String> list);
    String toString();

}
