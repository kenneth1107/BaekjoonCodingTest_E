import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        String originalStr = br.readLine();

        StringBuilder reversedSb = new StringBuilder(originalStr);
        
        String reversedStr = reversedSb.reverse().toString();
        int result = originalStr.equals(reversedStr) ? 1 : 0;
        
        bw.write(result + "\n");


        bw.flush();
        bw.close();
        br.close();
    }
}