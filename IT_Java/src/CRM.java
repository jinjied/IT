public class CRM {
    public static ContactPage contactPage = new ContactPage();
    public static SchedulePage schedulePage = new SchedulePage();
    public static void main(String[] argc){
        contactPage.newContact("Stan");
        contactPage.newContact("Yanming","158***9082","158***com","Unimelb","Jim");
        contactPage.newContact("Banming","258***9082","958***com","Knimelb","Lim");
        contactPage.newContact("Canming","358***9082","858***com","Pnimelb","Nim");
        contactPage.newContact("Danming","458***9082","758***com","Qnimelb","Mim");
        schedulePage.newSchedule("meeting1", "1 Sep", "Home", "Stand-up meeting");
        schedulePage.newSchedule("meeting2", "3 Sep", "Home", "Stand-up meeting");
        schedulePage.newSchedule("meeting3", "5 Sep", "Home", "Stand-up meeting");

        System.out.println(contactPage.toString());
        System.out.println(schedulePage.toString());
        System.out.println(contactPage.sortName().toString());
        System.out.println(contactPage.searchName("yanming"));
    }
}
