import java.util.ArrayList;
public class StudentManger {
    StudentManger() {}
    private ArrayList<Student> students=new ArrayList<>();

    public void addStudent(Student stu){
        students.add(stu);
    }
    public void showAllStudents(){
        for(Student stu:students){
            System.out.println("ID:"+stu.getId()+" Name:"+stu.getName()+"Age"+stu.getAge()+" Score:"+stu.getScore());
        }
    }

}
