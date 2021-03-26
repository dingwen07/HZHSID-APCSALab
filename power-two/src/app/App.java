package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int base, pow;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input base and power: ");
        base = sc.nextInt();
        pow = sc.nextInt();
        sc.close();
        runCmd("/", "python -c print(" + base + "**" + pow + ")");
        System.out.println(Math.pow(base, pow));
    }

    public static String runCmd(String cmdpath, String cmd) {
        // log.info(cmd);
        String result = "";
        File dir = new File(cmdpath);
        try {
            Process ps = Runtime.getRuntime().exec(cmd, null, dir);

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream(), Charset.forName("GBK")));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                result += line + "\n";
            }

            br.close();
            // System.out.println("close ... ");
            ps.waitFor();
            // System.out.println("wait over ...");

            return result;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("child thread donn");
        return null;
    }
}
