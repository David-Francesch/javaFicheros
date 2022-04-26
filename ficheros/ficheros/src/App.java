import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner sc= new Scanner(System.in);
        int opcion;
        boolean run = true;
       do {
        System.out.println("Que quieres hacer?");
        System.out.println("1. Leer fichero");
        System.out.println("2. Escribir fichero");
        System.out.println("3. Insertar fichero");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
            LeerFich();
            
            break;
            case 2:
            EscribirFich();
                break;
            case 3:
                run = false;
                break;
        
            default:
                break;
        }
       } while (run); 
        
    }

    public static void EscribirFich() {
        try {
            String frase = "42069";
            FileWriter w = new FileWriter("C:/Users/Alumno/Desktop/David_Francesch/Programacion/javaFicheros/test.txt");
            BufferedWriter wr = new BufferedWriter(w);
            wr.write(frase);
            wr.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public static void LeerFich() {
        try {
            String frase;
            FileReader r = new FileReader("C:/Users/Alumno/Desktop/David_Francesch/Programacion/javaFicheros/test.txt");
            BufferedReader br = new BufferedReader(r);
             while ((frase = br.readLine())!=null) {
                 System.out.println(frase);
             }
             br.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}

