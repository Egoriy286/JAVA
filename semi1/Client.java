public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.print();
        Animal animal1 = new Animal();
        animal1.setTitle("Murka");
        animal1.setWeight(-200);
        animal1.print();
    }
}
