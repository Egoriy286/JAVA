public class Life extends Energy{
    public Type type;
    public double hungry=0;
    public Boolean life=true;
    public String name;
    public double consumption;
    public double getConsumption() {
        return consumption;
    }
    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
    public double old;
    public Type food;
    public Type getFood() {
        return food;
    }
    public void setFood(Type food) {
        this.food = food;
    }
    public double eatEnergy;
    public double getEatEnergy() {
        return eatEnergy;
    }
    public void setEatEnergy(double eatEnergy) {
        this.eatEnergy = eatEnergy;
    }
    void Life(){
        if (life == false){
            int start = 0;
            int end = 1000;          
            int b = (int)(Math.random()*(end-start+ 1)+ start);
            if( old<b && b<old+20){
                life = true;
                energy = 150;
                hungry=0;
                old =0;
            }
            
        }
        if (energy < consumption){
            life=false;
            //System.out.println(" dead ");
        }
    }
    public void Step(){
        energy-=consumption+hungry;
        old+=1;
        Life();
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
}
