
public class Student {
    String name;int roll_no,marks;

    Student(String name,int roll_no,int marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public char getGrade() {
        if(marks >= 90) return 'A';
        else if(marks >= 75 && marks <= 89) return 'B';
        else if(marks >= 60 && marks <= 74) return 'C';
        else return 'D';
    }

    public static void main(String[] args) {

        Student stu1 = new Student("ashish",01,90);
        Student stu2 = new Student("vinay Sapru",02,67);
        Student stu3 = new Student("Bhargav Mitra",03,45);

        System.out.println(stu1.getName() + " get " + stu1.getMarks() + " and his Grade is : " + stu1.getGrade());
        System.out.println(stu2.getName() + " get " + stu2.getMarks() + " and his Grade is : " + stu2.getGrade());
        System.out.println(stu3.getName() + " get " + stu3.getMarks() + " and his Grade is : " + stu3.getGrade());
    }
}
