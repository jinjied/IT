public class CRMTest {
    public static Profile profile1 = ProfileFactory.getInstance().getProfile("Jim");
    public static Profile profile2 = ProfileFactory.getInstance().getProfile("Yanming","158***9082",
            "158***@163.com", "unimelb","Jim");
    public static Schedule schedule1 = ScheduleFactory.getInstance().getProfile("meeting", "30 Aug",
            "Zoom", "Stand up meeting");
}
