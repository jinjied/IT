public class NewScheduleStrategy implements INewStrategy {
    private Schedule schedule = null;

    public Schedule newObject(String name){
        schedule = new Schedule(name);
        return schedule;
    }

    public Schedule newObject(String name, String time, String address, String context) {
        schedule = new Schedule(name,time,address,context);
        return schedule;
    }

    public NewScheduleStrategy() {
    }
}
