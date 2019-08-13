package Chep3;
public class Employee {
    static int id =1001;
    String name = "Rusdee";
    int age = 20;
    
    static void work(){
        System.out.println("work()");
    }
    
    void getSalary(){
         System.out.println("gatSalary()");
     }
    
    public static void main(String[] args){
        //call static attr & mothod
        //call non-static
        System.out.println("Id : "+id);
        work();
        
        Employee em = new Employee();
        System.out.println("Name : "+em.name);
        System.out.println("Age : "+em.age);
        em.getSalary(); 
    }
}
