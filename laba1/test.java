public class test {
    public static void main(String[] args) {
        try {
            
            System.out.println("Студент Монастырев Егорий: Введите целое число:");
            int number = System.in.read();
            char c = (char)number;
            System.out.print("Введенное число: "+c);

        }catch(Exception exception){
            System.out.println("fail"+ exception);
        }
    }
}
