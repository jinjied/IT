import java.util.List;

public class CRM {
    static CRMTest crmTest = new CRMTest();
    static ContactPage contactPage = crmTest.loadContact();
    static SchedulePage schedulePage = crmTest.loadSchedule();
    public static void main(String[] argc){
        Contact contact1 = new Contact("Tianyu");
        contactPage.newContact(contact1);
        System.out.println(schedulePage.toString());
        System.out.println(schedulePage.sortName().toString());
        System.out.println(schedulePage.bSearchAll("beeting3"));

//        System.out.println(contactPage.getContactList());
        //System.out.println(schedulePage.deleteContact(contact1));

    }
}
