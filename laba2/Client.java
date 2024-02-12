public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setTitle("Шарик");
        dog.setWeight(20);

        Cat cat = new Cat();
        cat.setTitle("Мурка");
        cat.setWeight(10);

        System.out.println(cat.getTitle() + " весит " + cat.getWeight());
        cat.catchMouse();
        System.out.println(cat.talk());

        System.out.println(dog.getTitle() + " весит " + dog.getWeight());
        dog.catchRun();
        System.out.println(dog.talk());

        System.out.println();
        //Animal animal = new Dog();
        //System.out.println(animal.talk());
        //animal = new Cat();
        //System.out.println(animal.talk());
        //Animal[] animals = new Animal[5];
        communicate(new Animal());
        communicate(dog);
        communicate(cat);
        communicate(new Cow());
        communicate(new Pig());
    }
    private static void communicate(Animal animal){
        System.out.println(animal.talk());
    }
}
