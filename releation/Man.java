public class Man{
    private String title = "Richard";
    private Horse horse;
    public Horse getHorse() {
        return horse;
    }
    public void setHorse(Horse horse) {
        this.horse = horse;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void use() {
        //horse.setSpeed(speed);
        System.out.println(title + " скачет со скоростью " + horse.getSpeed()+ " км/ч");
    }
}
