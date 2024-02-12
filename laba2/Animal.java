public class Animal {
    private String title;
    private double weight;
    public String talk(){
        return "Не говорю вообще";
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
           
    }
    public void print(){
        System.out.println("title:  " + title);
        System.out.println("weight: " + weight);
    }
    
}
