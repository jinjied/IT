import java.util.ArrayList;
import java.util.List;

public class ContactPage extends CRMObjectPage{
    // Each contactPage should have a list containing the contacts
    private List<CRMObject> contactList = new ArrayList<>();

    // New a contact into the list by a given name
    public void newContact(String name){
        contactList.add(new CRMObject(name));
    }

    // New a contact into the list by given all the attributes
    public void newContact(String name, String phone, String email, String teamName, String remark) {
        contactList.add(new Contact(name,phone,email,teamName,remark));
    }

    // New a contact into the list by name and phone
    public void newContact(String name, String phone){
        contactList.add(new Contact(name, phone));
    }

    // Add a contact into the list by an existing contact
    public void newContact(CRMObject contact){
        contactList.add(contact);
    }

    // Constructor
    public ContactPage() {
    }

    // Getter
    public List<CRMObject> getContactList() {
        return contactList;
    }

    // Sort the list by attribute name
    // (Not the required function of the clients)
    public List<CRMObject> sortName() {
        return super.sorter.sortName(this.contactList);
    }

    // Sort the list by attribute phone
    // (Not the required function of the clients)
    public List<CRMObject> sortPhone() {
        return super.sorter.sortPhone(this.contactList);
    }

    // Sort the list by attribute email
    // (Not the required function of the clients)
    public List<CRMObject> sortEmail() {
        return super.sorter.sortEmail(this.contactList);
    }

    // Search the name of a contact
    // (Using binary search to improve searching efficiency)
    public CRMObject searchName(String name) {
        return super.searcher.bSearchName(this, name);
    }

    // Remove a given contact form the list
    public List<CRMObject> deleteContact(CRMObject contact){
        this.getContactList().remove(contact);
        return this.getContactList();
    }

    // Change the name of a contact
    public void editContactName(CRMObject contact, String name){
        for (CRMObject con: this.contactList) {
            if (contact.equals(con)){
                con.setName(name);
            }

        }
    }

    // ToString method
    @Override
    public String toString() {
        return "ContactPage{" +
                "contactList=" + contactList +
                '}';
    }
}
