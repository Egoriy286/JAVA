public class Cat extends Animal{
    @Override 
    public String talk(){
        return "Мяу";
    }
    public void catchMouse(){
        System.out.println(" ловит мышь");
    }
}