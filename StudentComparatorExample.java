import java.util.Comparator;
import java.util.TreeSet;

public class Student {
    private String studentRollNo;
    private String studentName;

    public Student(String studentRollNo, String studentName) {
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
    }

    public String getStudentRollNo() {
        return studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + "]";
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        String rollNo1 = s1.getStudentRollNo();
        String rollNo2 = s2.getStudentRollNo();

        int comp = rollNo1.substring(0, 1).compareTo(rollNo2.substring(0, 1));

        if (comp == 0) {
            comp = rollNo1.substring(3, 7).compareTo(rollNo2.substring(3, 7));
        }

        if (comp == 0) {
            comp = Integer.compare(Integer.parseInt(rollNo1.substring(8)), Integer.parseInt(rollNo2.substring(8)));
        }

        return comp;
    }
}


public class StudentComparatorExample {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentComparator());

        students.add(new Student("AB-2K21-1", "Alice"));
        students.add(new Student("CD-2K22-2", "Bob"));
        students.add(new Student("EF-2K22-1", "Charlie"));
        students.add(new Student("GH-2K21-3", "David"));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
