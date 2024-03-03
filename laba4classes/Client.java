public class Client {
    public static void main(String[] args) {
        int max = 7;
        Life energy = new Life();
        energy.energy = 1000000;
        energy.type = Type.Energy;
        energy.food = Type.Energy;
        energy.consumption = 0.0;
        energy.name = "Питательная среда";
        Animals Cow  = new Animals();
        Animals Wolf = new Animals();
        Animals Deer = new Animals();
        Cow.setConsumption(1.4);
        //Cow.setEatEnergy(70);
        Cow.energy = 1000;
        Cow.setFood(Type.Plants);
        Cow.name = "Травоядное";
        Wolf.setConsumption(2.4);
        //Wolf.setEatEnergy(35);
        Wolf.setFood(Type.Animals);
        Wolf.name = "Хищник";
        Deer.energy =600;
        Deer.setConsumption(2.8);
        //Deer.setEatEnergy(80);
        Deer.setFood(Type.Mushrooms);
        Deer.name = "Всеядное";
        EcoSystem Earth= new EcoSystem(max);
        Earth.collapse= 1500;
        Earth.collect[0]=new Bacteria();
        Earth.collect[1]=new Mushrooms();
        Earth.collect[2]=new Plants();
        Earth.collect[3]= Cow ;
        Earth.collect[4]= Wolf;
        Earth.collect[5]= Deer;
        Earth.collect[6]=energy;
        Earth.Start();
        int start = 10;
        int end = 30;          
        int b = (int)(Math.random()*(end-start+ 1)+ start);
        System.out.println(b);
        

    }
}
