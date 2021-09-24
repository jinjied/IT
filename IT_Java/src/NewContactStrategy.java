public class NewContactStrategy implements INewStrategy {
    private Contact contact = null;

    public Contact newObject(String name){
        contact = new Contact(name);
        //System.out.println(contact);
        return contact;
    }

    public Contact newObject(String name, String phone, String email, String teamName, String remark) {
        contact = new Contact(name,phone,email,teamName,remark);
        //System.out.println(contact);
        return contact;
    }

    public NewContactStrategy() {
    }
}
