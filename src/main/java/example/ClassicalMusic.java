package example;

public class ClassicalMusic implements Music{
    public void doMyInit(){
        System.out.println("Start init method");
    }
    public void doMyDestroy(){
        System.out.println("Start destroy method");
    }


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
