import java.util.ArrayList;
import java.util.List;

public class CRMObjectPage{
    protected Sorter sorter = new Sorter();
    protected Searcher searcher = new Searcher();

    private List<CRMObject> objectList = new ArrayList<>();

    public List<CRMObject> getContactList() {
        return objectList;
    }

    public List<CRMObject> sortName() {
        return sorter.sortName(this.objectList);
    }

    public List<CRMObject> sortPhone() {
        return sorter.sortPhone(this.objectList);
    }

    public List<CRMObject> sortEmail() {
        return sorter.sortEmail(this.objectList);
    }

    public CRMObject searchName(String name) {
        return searcher.bSearchName(this,name);
    }

    public int searchName1(String name) {
        return searcher.bSearchName1(this.sortName(),name);
    }

    public List<CRMObject> bSearchAll(String name) {
        return searcher.bSearchAll(this,name);
    }

    public List<CRMObject> deleteContact(CRMObject contact){
        this.getContactList().remove(contact);
        return this.getContactList();
    }

    @Override
    public String toString() {
        return "ContactPage{" +
                "contactList=" + objectList +
                '}';
    }
}
