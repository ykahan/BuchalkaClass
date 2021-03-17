package Arrays_Second_Time.MobilePhoneChallenge;

import java.util.ArrayList;

public class ContactsList {
    ArrayList<Contact> contacts = new ArrayList<>();


    public void storeNewContact(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(contact.getName())) {
                return;
            }
        }
        contacts.add(contact);
    }

    public void modifyName(Contact oldContact, Contact newContact) {
        int index = contacts.indexOf(oldContact);
        if (index != -1) {
            contacts.set(index, newContact);
        } else {
            System.out.println(oldContact + " not found");
        }
    }

    public void deleteContact(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(contact.getName())) contacts.remove(i);
            break;
        }
    }

    private int findContact(Contact contact) {
        return contacts.indexOf(contact);
    }

    public boolean searchForContactByName(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(contact.getName()))
                return true;
        }
        return false;
    }

    public int findContactByName(Contact contact){
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(contact.getName())) return (i + 1);
        }
        return -1;
    }

    public String getPhone(String name) {
        int index = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(index).getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index != -1) return contacts.get(index).getPhone();
        return null;
    }

    public String getName(String phone) {
        int index = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(index).getPhone().equals(phone)) {
                index = i;
                break;
            }
        }
        if (index != -1) return contacts.get(index).getName();
        return null;
    }

    @Override
    public String toString() {
        if (contacts.size() == 0) return "No contacts founds";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contacts.size(); i++) {
            sb.append((i + 1) + ") "
                    + contacts.get(i).getName() + ": "
                    + contacts.get(i).getPhone() + "\n");
        }
        return sb.toString();
    }

    public void modifyPhone(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(contact.getName())) {
                contacts.get(i).setPhone(contact.getPhone());
            }
            break;
        }
    }
}
