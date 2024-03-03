public class EcoSystem extends Life{
    public int time;
    public double collapse;
    public Life[] collect;
    public EcoSystem(int max){
        time = 0;
        collapse=100;
        collect = new Life[max];
    }
    private void Time(){
        time+=1;
    }
    private void Info(){
        System.out.println("time:"+time);
    }

    public void eat(Life eater, int id){
        double costE=0;
        for (int k=0;k<collect.length;k++)
        {
            
            if (eater.food==collect[k].type && id != k && collect[k].life ==true)
            {
                collect[k].energy-=eater.eatEnergy*1.5;
                costE=eater.eatEnergy*1.3;
                eater.energy+=costE;
                break;
            }
            
            
        }
        if (costE == 0 && eater.type!=Type.Energy){
            eater.hungry += Math.exp(old);
        }else{
            old=0;
            hungry=0;
        }
    }
    public void Start(){
        for (int i=0;i<collapse;i++){
            Info();
            Time();
            for (int j=0;j<collect.length;j++)
            {
                collect[j].Step();
                
                if (collect[j].life==true){
                    eat(collect[j],j);
                    System.err.println(collect[j].name+" energy:"+collect[j].energy);
                }
            }
        }
        for (int j=0;j<collect.length;j++)
        {
            if (collect[j].life==true){
                System.err.println(collect[j].name+":"+collect[j].energy);
            }
        }
    }
}
