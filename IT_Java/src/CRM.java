import java.util.List;

public class CRM {
    static CRMTest crmTest = new CRMTest();
    static ContactPage contactPage = crmTest.loadContact();
    //static List<Contact> contactPage = crmTest.loadContact();
    public static void main(String[] argc){
        Contact contact1 = new Contact("Tianyu");
        contactPage.newContact(contact1);
        System.out.println(contactPage.toString());
//        System.out.println(schedulePage.toString());
//        System.out.println(contactPage.sortName().toString());
        System.out.println(contactPage.searchName("Yanming"));

//        System.out.println(contactPage.getContactList());
        System.out.println(contactPage.deleteContact(contact1));

    }
}
