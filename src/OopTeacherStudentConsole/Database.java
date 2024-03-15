package OopTeacherStudentConsole;

public class Database {
    private static  Teacher[] teachers = new Teacher[30];
    private  static Student[] students = new Student[30];
    private static TeacherStudent[] teacherStudents = new TeacherStudent[50];
   private  static int studentIndex = 0;
   private  static int teacherIndex = 0;

    public static void addDataTeacher(Teacher teacher){
        teachers[teacherIndex++] = teacher;
        System.out.println("Muellim dataya elave edildi.");
    }
    public static void addDataStudent(Student student){
        students[studentIndex++] = student;
        System.out.println("Sagird dataya elave edildi.");
    }

    public static void showDataTeacher(){
        if(teacherIndex==0){
            System.out.println("Hal-Hazirda datada muellim yoxdur.");
        }
        for(Teacher teacher: teachers){
            if(teacher!=null){
                System.out.println(teacher.getName() + " " + teacher.getSurname());
            }
        }
    }
    public static void showDataStudent(){
        if(studentIndex==0){
            System.out.println("Hal-Hazirda datada sagird yoxdur.");
        }
        for(Student student: students){
            if(student!=null){
                System.out.println(student.getName() + " " + student.getSurname());
            }
        }
    }

}
