import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TeacherDecanat implements Iterable<Teacher>{

    private List<Teacher> teacherList;

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setStudentList(List<Student> studentList) {
        this.teacherList = teacherList;
    }


    public void createTeacher (String firstName, String lastName, String middleName) {

        teacherList.add(new Teacher(firstName, lastName, middleName));
    }

    @Override
    public Iterator<Teacher> Iterator() {
        return new TeacherDecanatIterator(this);
    }
    
}
