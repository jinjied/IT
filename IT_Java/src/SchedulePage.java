import java.util.ArrayList;
import java.util.List;

public class SchedulePage extends CRMObjectPage{
    // Each schedulePage should have a list containing the contacts
    private List<CRMObject> scheduleList = new ArrayList<>();

    // New a schedule into the list by a given name
    public void newSchedule(String name){
        scheduleList.add(new Schedule(name));
    }

    // New a contact into the list by given all the attributes
    public void newSchedule(String name, String time, String address, String context) {
        scheduleList.add(new Schedule(name, time, address, context));
    }

    // Constructor
    public SchedulePage() {
    }

    // Getter
    public List<CRMObject> getScheduleList() {
        return scheduleList;
    }

    // Sort the list by attribute name
    // (Not the required function of the clients)
    public List<CRMObject> sortName() {
        return super.sorter.sortName(this.scheduleList);
    }

    // Search the name of a schedule
    // (Using binary search to improve searching efficiency)
    public CRMObject searchName(String name) {
        return super.searcher.bSearchName(this, name);
    }

    // Remove a given schedule form the list
    public List<CRMObject> deleteContact(CRMObject schedule){
        this.getScheduleList().remove(schedule);
        return this.getContactList();
    }


    @Override
    public String toString() {
        return "SchedulePage{" +
                "scheduleList=" + scheduleList +
                '}';
    }
}
