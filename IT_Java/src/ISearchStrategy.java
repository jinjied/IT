import java.util.List;

public interface ISearchStrategy extends IStrategy{
    public Contact bSearchName(ContactPage contactPage, String name);
}
