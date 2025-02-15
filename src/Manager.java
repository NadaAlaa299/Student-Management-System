import java.util.*;

public class Manager {
    private List<Student> studentList = new ArrayList<>();
    private Set<Student> studentSet = new HashSet<>();
    private Map<Integer, Student> studentMap = new HashMap<>();
    private Queue<Student> studentQueue = new LinkedList<>();

    public void addStudent(Student student)
    {
        studentList.add(student);
        studentSet.add(student);
        studentMap.put(student.getId(), student);
        studentQueue.add(student);
    }

    public void removeStudent(int id)
    {
        Student student = studentMap.get(id);
        if (student != null)
        {
            studentList.remove(student);
            studentSet.remove(student);
            studentMap.remove(student);
            studentQueue.remove(student);
        }
    }

    public Student findStudent(int id) {
        return studentMap.get(id);
    }

    public void showStudents()
    {
        System.out.println("Students in List:");
        for (Student student:studentList)
        {
            System.out.println("Student ID: "+ student.getId());
            System.out.println("Student Name: "+ student.getName());
            System.out.println("Student Age: "+ student.getAge());
            System.out.println();
        }

        System.out.println("Students in Set:");
        for (Student student : studentSet) {
            System.out.println("Student ID: "+ student.getId());
            System.out.println("Student Name: "+ student.getName());
            System.out.println("Student Age: "+ student.getAge());
            System.out.println();
        }

        System.out.println("Students in Map:");
        studentMap.forEach((id, student) -> {
            System.out.println("Student ID: " + id + "\n" +"Student Name: " + student.getName() + "\n" + "Student Age: "+ student.getAge()+"\n");
        });

        System.out.println("Students in Queue:");
        for (Student student : studentQueue) {
            System.out.println("Student ID: "+ student.getId());
            System.out.println("Student Name: "+ student.getName());
            System.out.println("Student Age: "+ student.getAge());
            System.out.println();
        }
    }
}
