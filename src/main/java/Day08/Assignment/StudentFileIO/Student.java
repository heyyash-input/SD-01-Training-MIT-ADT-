package Day08.Assignment.StudentFileIO;
//POJO:
public class Student {
//--------------------------------------------------------------------------------------------------------------
    private int stuId ;
    private String name ;
    private double marks ;
//--------------------------------------------------------------------------------------------------------------
    public Student(){
        System.out.println("--------Default Cons--------");
    }
//--------------------------------------------------------------------------------------------------------------
    public Student(int stuId, String name, double marks) {
        this.stuId = stuId;
        this.name = name;
        this.marks = marks;
    }
//--------------------------------------------------------------------------------------------------------------
    public void displayInfo (){
        System.out.println("Student details: " + stuId + name + marks );
    }
//--------------------------------------------------------------------------------------------------------------
    
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

//--------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
//--------------------------------------------------------------------------------------------------------------
}
