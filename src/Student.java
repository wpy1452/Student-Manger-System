public class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    public Student(int id, String name, int age, double score) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.score=score;
    }
    public Student() {}

    public double getScore() {
        return score;
    }

    public boolean setScore(double score) {
        if (score > 0 && score < 100) {
            this.score = score;
            return true;
        }
        return false;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo(){
        System.out.println("id:"+id+" name:"+name+" age:"+age+" score:"+score);
    }
}

