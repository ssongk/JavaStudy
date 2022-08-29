package singlebungle3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student{
    private String name;
    private String dept;
    private String s_number;
    private String avg;
    public Student(String name, String dept, String s_number, String avg){
        this.name = name;
        this.dept = dept;
        this.s_number = s_number;
        this.avg = avg;
    }
    public void get_info(){
        System.out.println("------------------------------");
        System.out.println("이름: "+this.name);
        System.out.println("학과: "+this.dept);
        System.out.println("학번: "+this.s_number);
        System.out.println("학점평균: "+this.avg);
    }
    public String get_name(){
        return this.name;
    }
    public void get_avg(){
        System.out.println("학점평균: "+this.avg);
    }
}

public class StudentListEx {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
        for(int i=0;i<4;i++){
            System.out.print(">> ");
            StringTokenizer st = new StringTokenizer(s.nextLine(),",");
            String name = st.nextToken();
            String dept = st.nextToken();
            String s_number = st.nextToken();;
            String avg = st.nextToken();
            Student stu = new Student(name, dept, s_number, avg);
            al.add(stu);
        }
        for(int i=0;i<4;i++){
            al.get(i).get_info();
        }
        while(true){
            System.out.println("------------------------------");
            System.out.print("학생 이름 >> ");
            String str = s.nextLine();
            if(str.equals("exit"))
                break;
            else{
                for(int i=0;i<4;i++){
                    if(str.equals(al.get(i).get_name())){
                        al.get(i).get_avg();
                        break;
                    }
                }
            }
        }
        s.close();
    }
}
