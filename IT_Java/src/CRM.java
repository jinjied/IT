public class CRM {
    public static ProfilePage profileList = new ProfilePage();
    public static SchedulePage schedulePage = new SchedulePage();
    public static void main(String[] argc){
        profileList.newProfile("Stan");
        profileList.newProfile("Yanming","158***9082","158***com","Unimelb","Jim");
        schedulePage.newSchedule("meeting1", "1 Sep", "Home", "Stand-up meeting");
        schedulePage.newSchedule("meeting2", "3 Sep", "Home", "Stand-up meeting");
        schedulePage.newSchedule("meeting3", "5 Sep", "Home", "Stand-up meeting");

        System.out.println(profileList.toString());
        System.out.println(schedulePage.toString());
    }
}
