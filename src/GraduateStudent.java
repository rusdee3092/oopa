public class GraduateStudent extends Student {
    private String studyLevel;
    private String thesisAdviser;
    
public void oralExamination(){
        System.out.println("oralExamination");
    }        
public void thesisExamination(){
        System.out.println("oralExamination");
    }        

    @Override
    public void payment() {
         System.out.println("payment by credit");
    }
}//end class