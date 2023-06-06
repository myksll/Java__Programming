package practices.day31_practices.studentTask;

public class Student extends Person{

    private String studentId, fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {

        if(fieldOfStudy.isEmpty() || fieldOfStudy==null){
            System.err.println("FieldOfStudy should not be set null or empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
            if(schoolName.isEmpty() || schoolName==null){
                System.err.println("school name should not be set null or empty");
                System.exit(1);
            }
            this.schoolName =schoolName;
        }


     public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName()+" is studying on "+fieldOfStudy +" at " +schoolName);
    }

    @Override
    public String toString() {
        return   super.toString().replace("}","") +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +

                '}';
    }
}
