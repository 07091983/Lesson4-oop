import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TeacherDecanatService {
    
    private StudentGroup studentGroup;

    public void removeTeacherByFIO(String firstName,String lastName, String middleName) {
        Iterator<Teacher> iterator = TeacherGroup.iterator();
        while (iterator.hasNext) {
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName) && teacher.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }        
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> studentlList = new ArrayList<>(TeacherDecanat.getTeacherList());
        Collections.sort(teacherList);
        return studentlList;
    }

    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> teacherlList = new ArrayList<>(TeacherDecanat.getTeacherList());
        teacherList.sort(new TeacherComparator<Teacher>());
        return teacherList;
    }
    
    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherDecanat.createTeacher(firstName, lastName, middleName);
    }
}

