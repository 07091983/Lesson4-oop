import java.util.Comparator;

public class TeacherServiceComparator<T extends Teacher> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {
        int resultofComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultofComparing == 0) {
            resultofComparing = o1.getLastName().compareTo(o2.getFirstName());
            if (resultofComparing == 0) {
                return o1.getMiddleName().compareTo(o2.getMiddleName());

            }else {
                return resultofComparing;
            }

        } else {
            return resultofComparing;
        }
    }
    
}
