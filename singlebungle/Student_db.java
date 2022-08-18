package singlebungle;

class Student {
    String name;
    int age;
    int height;
    int weight;
    Student() { }
    Student (String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public String toString() {
       String data = name + "\t" + age + "\t" + height + "\t" + weight;
       return data;
    }
}//end Student
class StudentExam extends Student{
    private String studnetNumber;
    StudentExam(String name, int age, int height, int weight, String studnetNumber){
        super(name,age,height,weight);
        this.studnetNumber = studnetNumber;
    }
    @Override
    public String toString() {
        String data = super.toString() + "\t" + this.studnetNumber;
        return data;
    }
}
//자식클래스
public class Student_db{
    public static void main(String args[]) {
        StudentExam se[]=new StudentExam[3];
        se[0]=new StudentExam("홍길동",15,171, 81, "201101");
        se[1]=new StudentExam("길동홍",13,183, 72, "201102");
        se[2]=new StudentExam("동홍길",16,175, 65, "201103");
        System.out.printf("%4s %5s %8s %8s %8s\n","이름","나이","키","몸무게"," 학번");
        for(StudentExam sm : se) System.out.println(sm.toString());
    }//end main()
}//end class
