package Arrays.Cellular_Phone_ArrayList_Challenge;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tName: ");
        sb.append(this.getName());
        sb.append("\n\tPhone Number: ");
        sb.append(this.getPhoneNumber());

        String output = sb.toString();
        sb = null;

        return output;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(String name, String number){
        return new Contact(name, number);
    }
}
