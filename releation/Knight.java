public class Knight extends Horse{
    String title = "Айвенго";

    public String getTitle(){
        return title;
    }

    public void use() {
        //horse.setSpeed(speed);
        System.out.println(title + " скачет со скоростью " + this.getSpeed()+ " км/ч");
    }
}
