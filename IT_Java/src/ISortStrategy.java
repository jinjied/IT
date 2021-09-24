import java.util.List;

public interface ISortStrategy extends IStrategy{
    public List<Contact> sortName(List<Contact> lst);
}
