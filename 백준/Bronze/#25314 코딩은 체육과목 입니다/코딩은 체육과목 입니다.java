import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) / 4;
        System.out.print("long ".repeat(n) + "int");
    }
}