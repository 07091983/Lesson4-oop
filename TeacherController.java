import java.util.List;
import java.util.stream.Stream;

public class TeacherController implements TeacherServiceController<Teacher>{

    private final TeacherDecanatService teacherDecanatService = new TeacherDecanatService();

    private final StreamService streamService = new StreamService();

    private final TeacherView teacherView = new TeacherView();

    public void removeStudentByFIO(String firstName,String lastName, String middleName) {
        TeacherDecanatService.removeTeacherByFIO(firstName, lastName, middleName);
    }
    
    public List<Teacher> getSortedTeacerList() {
        List<Teacher> teacherList = teacherDecanatService.getSortedTeacherList();
        TeacherView.sendOnConcole(teacherList);
        return teacherList;

    }

    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> teacherList = teacherDecanatService.getSortedTeacherByFIO();
        teacherView.sendOnConcole(teacherList);
        return teacherList;
        
    }

    public List <Stream> getSortedStream(List <Stream> streamList) {
        return streamService.getSortedStream(streamList);
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherDecanatService.createTeacher(firstName, lastName, middleName);
      
        
    }

    
}
