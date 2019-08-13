public class CallStudent {
    public static void main(String[] args) {
        System.out.println("Hellowwwww");
        Student rusdee = new Student();
        System.out.println("Object rusdee = "+rusdee);
        rusdee.addCours();
        rusdee.dropCourse();
        rusdee.payment();
        rusdee.enrollment();
    }
}