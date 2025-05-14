import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        System.out.println("\n--------------------Ejercicio 1--------------------\n");
        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        int i = 0;
        while (i != 7){
            System.out.println(getRandomNumber(100));
            i++;
        }
        System.out.println(i);
        System.out.println("¡Salió el 7! ¡Adiós!");
        System.out.println("\n--------------------Ejercicio 2--------------------\n");
        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        int num = getRandomNumber(100);
        while (num <= 70) {
            System.out.println(num);
            num = getRandomNumber(100);
        }
        System.out.println(num);
        System.out.println("¡Salió un número mayor a 70! ¡Adiós!");
        System.out.println("\n--------------------Ejercicio 3--------------------\n");
        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber
        Scanner scanner = new Scanner(System.in);
        int numRandom = getRandomNumber(100);
        System.out.println("Elige un número del 1 al 100 y adivina: ");
        int numElegido;
        do {
            numElegido = scanner.nextInt();
            if (numElegido != numRandom){
                System.out.println("No has acertado ¡Inténtalo de nuevo!");
                if (numElegido > numRandom){
                    System.out.println("Elige un número menor.");
                } else{
                    System.out.println("Elige un número mayor.");
                }
            }
        } while (numElegido != numRandom);

        System.out.println("¡Felicidades, adivinaste!");
        scanner.close();
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
