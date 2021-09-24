public class CRM {
    public static ContactPage contactPage = new ContactPage();
    public static SchedulePage schedulePage = new SchedulePage();
    public static void main(String[] argc){
        contactPage.newProfile("Stan");
        contactPage.newProfile("Yanming","158***9082","158***com","Unimelb","Jim");
        contactPage.newProfile("Banming","258***9082","958***com","Knimelb","Lim");
        contactPage.newProfile("Canming","358***9082","858***com","Pnimelb","Nim");
        contactPage.newProfile("Danming","458***9082","758***com","Qnimelb","Mim");
        schedulePage.newSchedule("meeting1", "1 Sep", "Home", "Stand-up meeting");
        schedulePage.newSchedule("meeting2", "3 Sep", "Home", "Stand-up meeting");
        schedulePage.newSchedule("meeting3", "5 Sep", "Home", "Stand-up meeting");

        System.out.println(contactPage.toString());
        System.out.println(schedulePage.toString());
        System.out.println(contactPage.sortName().toString());
    }
}
