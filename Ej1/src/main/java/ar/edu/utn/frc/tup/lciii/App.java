package ar.edu.utn.frc.tup.lciii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello List!
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

        int cantNumeros = scan.nextInt();

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < cantNumeros; i++) {
            lista.add(scan.nextInt());
        }
        int cantQueries = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < cantQueries; i++) {
            String query = scan.nextLine();
            if (query.equals("Insert")){
                int x = scan.nextInt();
                int y = scan.nextInt();
                if (scan.hasNextLine()) {
                    scan.nextLine();
                }
                lista.add(x,y);
            }
            else if (query.equals("Delete")){
                int aux = scan.nextInt();
                if (scan.hasNextLine()) {
                    scan.nextLine();
                }
                lista.remove(aux);
            }
        }
        scan.close();
        for (int i = 0; i < lista.size(); i++) {
            if(i < lista.size() -1){
                System.out.print(lista.get(i) + " ");
            }
            else {
                System.out.print(lista.get(i));
            }
        }
        System.out.println();
    }
}
