import java.util.ArrayList;
public class StudentManager {
    StudentManager() {}
    private ArrayList<Student> students=new ArrayList<>();

    public void addStudent(Student stu){
        students.add(stu);
    }

    public void deleteStudent(int id){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId()==id){
                students.remove(i);
            }
        }
    }

    public Student findStudent(int id){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId()==id){
                return students.get(i);

            }
        }
        return null;

    }

    public boolean updateStudent(int id,double score){
        Student stu=findStudent(id);
        if(stu!=null){

                    stu.setScore(score);
                    return true;

        }
        return false;

    }

    public void showAllStudents(){
        for(Student stu:students){
            System.out.println("ID:"+stu.getId()+" Name:"+stu.getName()+"Age"+stu.getAge()+" Score:"+stu.getScore());
        }
    }

}
