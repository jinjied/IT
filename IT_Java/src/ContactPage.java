import java.util.ArrayList;
import java.util.List;

public class ContactPage {
    private NewContactStrategy NewContactStrategy = new NewContactStrategy();
    private ContactSortStrategy contactSortStrategy = new ContactSortStrategy();
    private ContactSearchStrategy contactSearchStrategy = new ContactSearchStrategy();

    private List<Contact> contactList = new ArrayList<>();

    public void newContact(String name){
        contactList.add(NewContactStrategy.newObject(name));
    }

    public void newContact(String name, String phone, String email, String teamName, String remark) {
        contactList.add(NewContactStrategy.newObject(name,phone,email,teamName,remark));
    }

    public void newContact(Contact contact){
        contactList.add(contact);
    }

    public ContactPage() {
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Contact> sortName() {
        return contactSortStrategy.sortName(this.contactList);
    }

    public List<Contact> sortPhone() {
        return contactSortStrategy.sortPhone(this.contactList);
    }

    public List<Contact> sortEmail() {
        return contactSortStrategy.sortEmail(this.contactList);
    }

    public Contact searchName(String name) {
        return contactSearchStrategy.bSearchName(this,name);
    }

    public List<Contact> deleteContact(Contact contact){
        this.getContactList().remove(contact);
        return this.getContactList();
    }

    @Override
    public String toString() {
        return "ContactPage{" +
                "contactList=" + contactList +
                '}';
    }
}
