public class Runner extends Thread{
    String title;
    static int money = 20000;


    public static void main(String[] args) {
        System.out.println("Старт: "+Thread.activeCount());
        Runner runner = new Runner();
        runner.title = "Артур";
        Runner runner1 = new Runner();
        runner1.title = "Александр";
        runner.start();
        runner1.start();
        System.out.println("Финиш: "+Thread.activeCount());
    }

    @Override
    public void run(){
        //super.run();
        int c=0;

        while(c<10000){
            money=money-1;
            System.out.println(title+" потратил рубль. В кассе "+money);
            //System.out.println(title+" сделал шаг "+c);
            Thread.yield();
            /*try{
                //Thread.sleep(10);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            catch(Exception e){

            }*/
            System.out.println("Run: "+Thread.activeCount());
            c++;
        }

    }
}
