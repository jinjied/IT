import java.util.List;

public class Searcher{
    public CRMObject bSearchName(CRMObjectPage objectPage, String name){
            List<CRMObject> lst = objectPage.sortName();
            int l = 0, r = lst.size() - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                int res = name.compareTo(lst.get(m).getName());

                // Check if x is present at mid
                if (res == 0)
                    return lst.get(m);

                // If x greater, ignore left half
                if (res > 0)
                    l = m + 1;

                    // If x is smaller, ignore right half
                else
                    r = m - 1;
            }

            return null;
        }
    }
