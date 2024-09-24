package pkg1;

class Human{
    public void job(){
         System.out.println("Worhing professional");
    }
}
class Teacher extends Human{
    public void job(){
         System.out.println("Teacher");
    }
}
class Doctor extends Human{
    public void job(){
         System.out.println("Doctor");
    }
}

public class J8 {
     public static void main(String[] args){
        Human amar=new Human();
        Teacher babu=new Teacher();
        Doctor chandra= new Doctor();
        Human dinesh=new Doctor();
        amar.job();
        babu.job();
        chandra.job();
        dinesh.job();
     }
}
