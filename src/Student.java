public class Student {
    
    // declare attribute
    
    protected String studentID;
    protected String studentName;
    protected String faculty;
    protected String major;

    public void enrollment() {
        System.out.println("enrollment");
    }

    public void payment() {
        System.out.println("payment by package");
    }

    public void addCours() {
        System.out.println("addCourse");
    }

    public void dropCourse() {
        System.out.println("dropCourse");
    }
}//end