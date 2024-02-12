public class Animal {
    private String title = "Someone animal";
    private double weight = 10;
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
