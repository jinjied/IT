import java.util.ArrayList;
import java.util.List;

public class ContactPage {
    private NewContactStrategy NewContactStrategy = new NewContactStrategy();
    private SortContactStrategy sortContactStrategy = new SortContactStrategy();
    private List<Contact> contactList = new ArrayList<>();
    //private List<Schedule> scheduleList = new ArrayList<>();

    public void newProfile(String name){
        contactList.add(NewContactStrategy.newObject(name));
    }

    public void newProfile(String name, String phone, String email, String teamName, String remark) {
        contactList.add(NewContactStrategy.newObject(name,phone,email,teamName,remark));
    }

    public ContactPage() {
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Contact> sortName() {
        return sortContactStrategy.sort(this.contactList);
    }

    @Override
    public String toString() {
        return "ContactPage{" +
                "contactList=" + contactList +
                '}';
    }
}
