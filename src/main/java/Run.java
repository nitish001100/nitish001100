class Student {

    private String empName;
    private int empId;


    public Student(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public Student(String empName) {
        this.empName = empName;
    }


    public Student(int empId) {
        this.empId = empId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "empName='" + empName + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }
}

public class Run {
    public static void main(String[] args) {
        Student student0 = new Student("Nitish", 100);
        Student student1 = new Student("Nitish");
        Student student2 = new Student(100);

        System.out.println(student0.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
