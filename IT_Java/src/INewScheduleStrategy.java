public class INewScheduleStrategy implements INewStrategy{
    public Schedule newObject(String name){
        Schedule schedule = ScheduleFactory.getInstance().newObject(name);
        System.out.println(schedule);
        return schedule;
    }

    public INewScheduleStrategy() {
    }
}
