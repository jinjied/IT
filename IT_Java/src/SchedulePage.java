import java.util.ArrayList;
import java.util.List;

public class SchedulePage extends CRMObjectPage{
    private List<CRMObject> scheduleList = new ArrayList<>();

    public void newSchedule(String name){
        scheduleList.add(new Schedule(name));
    }

    public void newSchedule(String name, String time, String address, String context) {
        scheduleList.add(new Schedule(name, time, address, context));
    }

    public SchedulePage() {
    }

    public List<CRMObject> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<CRMObject> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public List<CRMObject> sortName() {
        return super.sorter.sortName(this.scheduleList);
    }

    @Override
    public String toString() {
        return "SchedulePage{" +
                "scheduleList=" + scheduleList +
                '}';
    }
}
