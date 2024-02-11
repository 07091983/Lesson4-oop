public class TeacherView implements TeacherServiceView<Teacher>{

    @Override
    public void sendOnConcole(List<Teacher> list) {
        for (Teacher teacher: list) {
            System.out.println(teacher.getTeacherId());
        }
        
    }
    
}
