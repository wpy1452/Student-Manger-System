/*、成绩统计
* 从键盘输入 5 个学生的成绩，然后计算：

    总分
    平均分
    最高分
    最低分
    及格人数（≥60）
    优秀人数（≥90）
* */

//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        double[] score=new double[5];
//        double all=0;
//        double average;
//        double max;
//        double min;
//        int pass=0;
//        int excellent=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("输入成绩");
//        for (int i = 0; i < 5; i++) {
//            int n=sc.nextInt();
//            score[i]=n;
//            all+=n;
//        }
//        average=all/5;
//        max=score[0];
//        min=score[0];
//        for (int i = 1; i < 5; i++) {
//            if(score[i]>max){
//                max=score[i];
//            }
//            if(score[i]<min){
//                min=score[i];
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            if(score[i]>=60){
//                pass+=1;
//                if(score[i]>=90){
//                    excellent+=1;
//                }
//            }
//        }
//        System.out.println("总分"+all);
//        System.out.println("平均分"+average);
//        System.out.println("最高分"+max);
//        System.out.println("最低分"+min);
//        System.out.println("及格人数"+pass);
//        System.out.println("优秀人数"+excellent);
//
//    }
//}

//猜数字
//程序随机生成一个 1~100 的整数。
//
//用户不断输入数字进行猜测。
//
//猜大了 → 输出 猜大了
//猜小了 → 输出 猜小了
//猜对了 → 输出 恭喜你，猜对了！
//
//猜对之后程序结束。

//import java.util.Scanner;
//import java.util.Random;
//
//public class Main{
//    public static void main(String args[]){
//        Random random=new Random();
//        int n=random.nextInt(100)+1;
//        Scanner sc=new Scanner(System.in);
//        int num;
//        while(true){
//            num=sc.nextInt();
//            if(num>n){
//                System.out.println("大了");
//            }else if(num<n){
//                System.out.println("小了");
//            }else{
//                System.out.println("good");
//                break;
//            }
//
//        }
//    }
//}

//请输入5个整数：
//        10
//        20
//        30
//        40
//        50
//
//总和：150
//平均值：30.0
//最大值：50
//最小值：10
//


//import java.util.Scanner;
//public class Main{
//    static int getSum(int[] arr){
//        int num=0;
//        for(int i = 0; i < arr.length; i++){
//            num+=arr[i];
//        }
//        return num;
//    }
//
//    static double getAverage(int[] arr){
//        double num=0;
//        for(int i = 0; i < arr.length; i++){
//            num+=arr[i];
//        }
//        return num/arr.length;
//    }
//
//    static int getMax(int[] arr){
//        int num=arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i]>num){
//                num=arr[i];
//            }
//        }
//        return num;
//    }
//
//    static int getMin(int[] arr){
//        int num=arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i]<num){
//                num=arr[i];
//            }
//        }
//        return num;
//    }
//
//    public static void main(String[] args){
//        int[] arr=new int[5];
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<arr.length;i++){
//            int num=sc.nextInt();
//            arr[i]=num;
//        }
//        System.out.println("总和"+getSum(arr));
//        System.out.println("平均值"+getAverage(arr));
//        System.out.println("最大值"+getMax(arr));
//        System.out.println("最小值"+getMin(arr));
//    }
//}

//请输入5名学生的信息：
//
//姓名：张三
//成绩：80
//
//姓名：李四
//成绩：95
//
//姓名：王五
//成绩：72
//
//姓名：赵六
//成绩：88
//
//姓名：钱七
//成绩：91
//
//成绩最高的学生：李四
//最高成绩：95

//import java.util.Scanner;
//public class Main{
//    static int maxScore(int[] score){
//        int idx=0;
//        for(int i = 1; i<score.length; i++){
//            if(score[i] > score[idx]){
//                idx=i;
//            }
//        }
//        return idx;
//    }
//
//    public static void main(String[] args){
//        String[] stu=new String[5];
//        int[] score=new int[5];
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            stu[i]=sc.next();
//            score[i]=sc.nextInt();
//        }
//        int idx=maxScore(score);
//        System.out.println("成绩最高的学生："+stu[idx]);
//        System.out.println("最高成绩："+score[idx]);
//    }
//}
import java.util.Scanner;
public class Main{
    public static int inputInt(Scanner sc){
        while(true){
            try{
                int num=sc.nextInt();
                return num;
            }catch(Exception e){
                System.out.println("输入不合法");
                sc.next();
            }
        }
    }

    public static int inputAge(Scanner sc){
        while(true){
            try{
                int age=sc.nextInt();
                if(age<=0||age>100){
                    System.out.println("年龄输入错误,请重新输入");

                    continue;
                }
                return age;
            }catch(Exception e){
                System.out.println("输入不合法");
                sc.next();
            }
        }
    }

    public static void addStudent(Scanner sc,StudentManager manager){
        Student stu=new Student();
        System.out.println("print id");
        int id=inputInt(sc);
        stu.setId(id);
        System.out.println("print name");
        String name=sc.next();
        stu.setName(name);
        System.out.println("print age");
        int age=inputAge(sc);
        stu.setAge(age);
        while (true) {
            try {

                    System.out.println("print score");
                    double score=sc.nextDouble();
                    boolean setResult=stu.setScore(score);
                    if(!setResult){
                        System.out.println("成绩不符合要求");
                        continue;
                    }

                break;
            } catch (Exception e) {
                System.out.println("score error print");
                System.out.println("请重新输入");
                sc.next();
            }
        }

        if(!manager.addStudent(stu)){
            System.out.println("add failed");

        }else{
            System.out.println("add success");
        }
    }

    public static void deleteStudent(Scanner sc,StudentManager manager){
        System.out.println("print id");
        int deleteId=sc.nextInt();
        boolean deleteResult=manager.deleteStudent(deleteId);
        if(deleteResult){
            System.out.println("deleted");
        }else{
            System.out.println("failed");
        }
    }

    public static void findStudent(Scanner sc,StudentManager manager){
        System.out.println("print id");
        int findId=sc.nextInt();
        Student findStu=manager.findStudent(findId);
        if(findStu!=null){
            findStu.showInfo();
        }else{
            System.out.println("not found");
        }
    }

    public static void updateStudent(Scanner sc,StudentManager manager){
        System.out.println("print id");
        int updateId=sc.nextInt();
        if(manager.findStudent(updateId)==null){
            System.out.println("not found");
            return;
        }
        System.out.println("print score");
        double updateScore=sc.nextDouble();
        boolean updateResult=manager.updateStudent(updateId,updateScore);
        if(updateResult){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    public static void showAllStudent(StudentManager manager){
        manager.showAllStudents();
    }

    public static void showMenu(){
        System.out.println("========== 学生管理系统 ==========");
        System.out.println("1. 添加学生");
        System.out.println("2. 删除学生");
        System.out.println("3. 查询学生");
        System.out.println("4. 修改成绩");
        System.out.println("5. 显示所有学生");
        System.out.println("0. 退出系统");
        System.out.println("==================================");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentManager manager=new StudentManager();
        while(true){
            try{
                showMenu();

                int choice=sc.nextInt();

                switch(choice){
                    case 1:
                        addStudent(sc,manager);
                        break;
                    case 2:
                        deleteStudent(sc,manager);
                        break;
                    case 3:
                        findStudent(sc,manager);
                        break;
                    case 4:
                        updateStudent(sc,manager);

                        break;
                    case 5:
                        showAllStudent(manager);
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("error");
                }
            }catch(Exception e){
                System.out.println("error");
                System.out.println("请重新输入");
                sc.next();
            }







        }

    }
}
