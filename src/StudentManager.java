import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
public class StudentManager {
    private ArrayList<Student> students=new ArrayList<>();

    public void saveToFile(){
        FileWriter fw;
        try{
            fw=new FileWriter("student.txt");
            for(Student s:students){
                fw.write(s.getId()+","+s.getName()+","+s.getAge()+","+s.getScore()+"\n");
            }
            fw.close();
        }catch(Exception e){
            System.out.println("异常");
        }
    }

    public void loadFromFile(){
        try {
            BufferedReader br=new BufferedReader(new FileReader("student.txt"));
            String line;
            while ((line=br.readLine())!=null){
                String[] data=line.split(",");
                int id=Integer.parseInt(data[0]);
                String name=data[1];
                int age=Integer.parseInt(data[2]);
                double score=Double.parseDouble(data[3]);
                Student student=new Student(id,name,age,score);
                this.students.add(student);
            }
            br.close();
        }catch(Exception e){
            System.out.println("异常");
        }
    }

    public boolean addStudent(Student stu){
        if(findStudent(stu.getId())!=null){
            return false;
        }else{
            students.add(stu);
            return true;
        }

    }

    public boolean deleteStudent(int id){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId()==id){
                students.remove(i);
                return true;
            }
        }
        return false;
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

                    if(stu.setScore(score)){
                        return true;
                    }


        }
        return false;

    }

    public void showAllStudents(){
        for(Student stu:students){
            System.out.println("ID:"+stu.getId()+" Name:"+stu.getName()+"Age"+stu.getAge()+" Score:"+stu.getScore());
        }
    }

}
