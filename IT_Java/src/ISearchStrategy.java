import java.util.List;

public interface ISearchStrategy extends IStrategy{
    public CRMObject bSearchName(ContactPage contactPage, String name);
}
