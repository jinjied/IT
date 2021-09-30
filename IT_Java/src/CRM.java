import java.io.IOException;
import java.util.List;

public class CRM {
    static Importer importer = new Importer();
    static CRMTest crmTest = new CRMTest();
    static Exporter exporter = new Exporter();
    static ContactPage contactPage = crmTest.loadContact();
    static SchedulePage schedulePage = crmTest.loadSchedule();
    public static void main(String[] argc) throws IOException {
        Contact contact1 = new Contact("Tianyu");
        contactPage.newContact(contact1);
//        System.out.println(schedulePage.toString());
//        System.out.println(schedulePage.sortName().toString());
//        System.out.println(schedulePage.bSearchAll("beeting3"));
//        System.out.println(contactPage.getContactList());
//
        //importer.loadCSV(contactPage.getContactList(),schedulePage.getScheduleList());
//        exporter.exportContact(contactPage.getContactList());
//        exporter.exportSchedule(schedulePage.getScheduleList());
////        System.out.println(contactPage.getContactList());
//        //System.out.println(schedulePage.deleteContact(contact1));
        System.out.println(contactPage.toString());
        contactPage.editContactName(contact1, "TianyuHuang");
        System.out.println(contactPage.toString());
    }
}
