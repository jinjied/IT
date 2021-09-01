public class ScheduleFactory implements INewStrategy{
    private static ScheduleFactory ProfileFactory = new ScheduleFactory();
    private Schedule schedule = null;

    private ScheduleFactory(){
    }

    public static ScheduleFactory getInstance() {
        return ProfileFactory;
    }

    public Schedule newObject(String name){
        schedule = new Schedule(name);
        return schedule;
    }
    public Schedule newObject(String name, String time, String address, String context) {
        schedule = new Schedule(name,time,address,context);
        return schedule;
    }
}