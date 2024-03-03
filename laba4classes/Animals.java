public class Animals extends Life {

    public Animals(){
        food = Type.Plants;
        type = Type.Animals;
        name="Животное";
        energy = 100;
        eatEnergy = consumption*energy+3;
        consumption = 0.5+eatEnergy*0.1;
        
        
    }

}

