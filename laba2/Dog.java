public class Dog extends Animal{
    @Override 
    public String talk(){
        return "Гав-гав!";
    }
    public void catchRun(){
        System.out.println(" бегает за мячем");
    }
}