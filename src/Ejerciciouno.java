import java.util.Scanner;


public class Ejerciciouno {

    
    public static boolean esNumeroPerfecto(int n) {
        if (n <= 1) {
            return false; 
        }
        int sumaDivisores = 0;
        for (int i = 1; i <= n / 2; i++) { 
            if (n % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == n;
    }

    
    public static void encontrarNumerosPerfectosEnRango(int inicio, int fin) {
        boolean encontrado = false;
        System.out.println("\nNúmeros perfectos en el rango " + inicio + "-" + fin + ":");
        for (int num = inicio; num <= fin; num++) {
            if (esNumeroPerfecto(num)) {
                System.out.println(num);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron números perfectos en este rango.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        try {
            
            System.out.print("Ingresa un número para verificar si es perfecto: ");
            int numero = scanner.nextInt();
            if (esNumeroPerfecto(numero)) {
                System.out.println(numero + " es un número perfecto.");
            } else {
                System.out.println(numero + " no es un número perfecto.");
            }

            
            System.out.print("\nIngresa el inicio del rango: ");
            int rangoInicio = scanner.nextInt();
            System.out.print("Ingresa el final del rango: ");
            int rangoFin = scanner.nextInt();

            if (rangoInicio > rangoFin) {
                System.out.println("El inicio del rango no puede ser mayor que el final del rango.");
            } else {
                encontrarNumerosPerfectosEnRango(rangoInicio, rangoFin);
            }
        } catch (Exception e) {
            System.out.println("Entrada no válida. Por favor, ingresa solo números enteros positivos.");
        } finally {
            scanner.close();
        }
    }
}

    


