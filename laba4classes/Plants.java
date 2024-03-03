public class Plants extends Life{
    public Plants(){
        hungry=0;
        type=Type.Plants;
        food = Type.Energy;
        name="Растения";
        energy = 1000;
        eatEnergy = 0.1*energy;
        consumption = 0.5+eatEnergy*0.02;
    }
}
