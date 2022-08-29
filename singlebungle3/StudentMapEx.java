package singlebungle3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentMapEx {
    public static void main(String[] args) {
        HashMap<String,Student> map = new HashMap<>();
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
            map.put(name, stu);
        }
        for(Student st : map.values()){
            st.get_info();
        }
        while(true){
            System.out.println("------------------------------");
            System.out.print("학생 이름 >> ");
            String str = s.nextLine();
            if(str.equals("exit"))
                break;
            if(map.containsKey(str)){
                map.get(str).get_avg();
            }                           
        }
        s.close();
    }
}
