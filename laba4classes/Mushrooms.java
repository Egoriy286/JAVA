public class Mushrooms extends Life{
    public Mushrooms(){
        type = Type.Mushrooms;
        food = Type.Energy;
        name="Гриб";
        energy = 1000;
        eatEnergy = energy*0.1;
        consumption = 3+eatEnergy*0.08;
    }
}
