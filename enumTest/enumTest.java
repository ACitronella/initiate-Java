public class enumTest{
    public static void main(String[] args){
        Grade myGrade = Grade.D;
        System.out.println("My grade is " + myGrade + " = " + Grade.B );
    }
    public enum Grade{
        A(2, "ay"), B(3, "by"), C(4, "ct"), D(5, "dt"), F(6, "fy");
        
        
        
    }
}