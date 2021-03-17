package Arrays_Second_Time.MobilePhoneChallenge;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contact> contacts = new ArrayList<>();

    public void storeNewContact(Contact contact){
        contacts.add(contact);
    }

    public void modifyName(Contact oldContact, Contact newContact){
        int index = contacts.indexOf(oldContact);
        if(index != -1){
            contacts.set(index, newContact);
        } else{
            System.out.println(oldContact + " not found");
        }
    }

    public void deleteName(Contact contact){
        int index = contacts.indexOf(contact);
        if(index != -1){
            contacts.remove(index);
        } else{
            System.out.println(contact + " not found.");
        }
    }

    public int findContact(Contact contact){
        return contacts.indexOf(contact);
    }

    public String getPhone(String name){
        int index = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(index).getName().equals(name)){
                index = i;
                break;
            }
        }
        if(index != -1) return contacts.get(index).getPhone();
        return null;
    }

    public String getName(String phone){
        int index = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(index).getPhone().equals(phone)){
                index = i;
                break;
            }
        }
        if(index != -1) return contacts.get(index).getName();
        return null;
    }
}
