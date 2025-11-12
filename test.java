import java.io.*;

public class test {

    public static void main(String[] args)throws IOException {
        System.out.println("Hello, World!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String[] str =  br.readLine().split(" ");
            System.out.println("Input String: " + str);
        }
        
    }
}
