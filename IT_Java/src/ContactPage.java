import java.util.ArrayList;
import java.util.List;

public class ContactPage {
    private NewContactStrategy NewContactStrategy = new NewContactStrategy();
    private SortContactStrategy sortContactStrategy = new SortContactStrategy();
    private ContactSearchStrategy contactSearchStrategy = new ContactSearchStrategy();

    private List<Contact> contactList = new ArrayList<>();

    public void newContact(String name){
        contactList.add(NewContactStrategy.newObject(name));
    }

    public void newContact(String name, String phone, String email, String teamName, String remark) {
        contactList.add(NewContactStrategy.newObject(name,phone,email,teamName,remark));
    }

    public ContactPage() {
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Contact> sortName() {
        return sortContactStrategy.sortName(this.contactList);
    }

    public List<Contact> sortPhone() {
        return sortContactStrategy.sortPhone(this.contactList);
    }

    public List<Contact> sortEmail() {
        return sortContactStrategy.sortEmail(this.contactList);
    }

    public Contact searchName(String name) {
        return contactSearchStrategy.bSearchName(this,name);
    }

    @Override
    public String toString() {
        return "ContactPage{" +
                "contactList=" + contactList +
                '}';
    }
}
