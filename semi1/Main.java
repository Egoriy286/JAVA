import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

public class Main {
    public static void print(byte[] ar){
        for (int i=0;i<ar.length; i++){
            if (ar[i]!=13 && ar[i]!=32)
                System.out.print((char)ar[i]);
            else{
                break;
            }
        }
    }
    public static void main(String[] args) {
        try {
            byte[] buff = new byte[50];
            System.out.println("Student Monasturev Egoriy: Please Input Chislo:");
            System.in.read(buff);
            print(buff);
        }catch(Exception exception){
            System.out.println("fail"+ exception);
        }
    }
    //private static int readline(){
    //    
    //    String temp="";
    //    
    //    temp = System.console().readLine();
    //    try {
    //        int i = Integer.parseInt(temp);
    //        return i;
    //    } catch(NumberFormatException nfe) {
    //        System.err.println("Invalid Format!");
    //    }
    //    return 0;
    //}

}