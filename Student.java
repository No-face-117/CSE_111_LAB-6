// CSE-111 LAB - 5 TASK - 7     []
// T-7 A Student class !

public class Student {
    private static int student_count = 0;
    private static int cse_student_count = 0;
    private static int other_department_student_count = 0;
    private int student_ID = 0;
    private String name;
    private double cgpa;
    private String department = "CSE";
    
    public Student(String name_0, double cgpa_0){
        name = name_0;
        cgpa = cgpa_0;
        student_count ++;
        student_ID = student_count;
        cse_student_count ++;
    }
    
    public Student(String name_1, double cgpa_1, String department_0){
        name = name_1;
        cgpa = cgpa_1;
        student_count ++;
        student_ID = student_count;
        department = department_0;
        
        if(department.equals("CSE")){
            cse_student_count ++;
        }else{
            other_department_student_count ++;
        }
    }
    
    public void individualDetail(){
        System.out.println("ID : " + student_ID + "\nName : " + name + "\nCGPA : " + cgpa + "\nDepartment : " + department);
    }
    
    public static void printDetails(){
        System.out.println("Total Student(s) : " + student_count + "\nCSE Student(s) : " + cse_student_count + "\nOther Department Student(s) : " + other_department_student_count);
    }
}