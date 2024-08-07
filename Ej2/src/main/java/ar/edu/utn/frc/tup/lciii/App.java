package ar.edu.utn.frc.tup.lciii;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello Map!
 *
 */
public class App 
{

    /**
     * This is the main program
     * 
     */
    public static void main( String[] args )
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        Scanner scan = new Scanner(System.in);

        Map<String, String> mapa = new HashMap<>();

        int cant = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < cant; i++) {
            String key = scan.nextLine();
            String value = scan.nextLine();
            mapa.put(key, value);
        }

        while (scan.hasNextLine()){
            String query = scan.nextLine();
            if(mapa.get(query) == null){
                System.out.println("Not found");
            }
            else {
                System.out.println(query + "=" + mapa.get(query));
            }
        }
    }
}
