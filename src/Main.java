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

public class Main{
    public static void main(String[] args){
        Student stu1=new Student(1001,"张三",15,100);
        Student stu2=new Student(1002,"李四",16,200);
        Student stu3=new Student(1003,"王五",16,34.2);
        StudentManager manager =new StudentManager();
        manager.addStudent(stu1);
        manager.addStudent(stu2);
        manager.addStudent(stu3);
        manager.showAllStudents();

        manager.deleteStudent(1002);
        manager.showAllStudents();
        Student findStu1=manager.findStudent(1001);
        Student findStu2=manager.findStudent(1005);
        if(findStu1!=null){
            findStu1.showInfo();
        }else{
            System.out.println("未找到此人");
        }
        if(findStu2!=null){
            findStu2.showInfo();
        }else{
            System.out.println("未找到此人");
        }

    }
}
