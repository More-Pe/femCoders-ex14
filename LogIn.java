import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la constraseña sean correctos imprime en terminal: ¡Acceso concedido!

        String correctUsername = "Pepita";
        String correctPassword = "pepi123";
        Scanner login = new Scanner(System.in);
        System.out.println("------------------------------------Log In------------------------------------");
        String username;
        String password;
        do {
            System.out.print("Ingrese su nombre de usuario: ");
            username = login.nextLine();
            System.out.print("Ingrese su contraseña: ");
            password = login.nextLine();
            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                System.out.println("Datos incorrectos, por favor vuelve a intentar");
            }
        } while (!username.equals(correctUsername) || !password.equals(correctPassword));
        System.out.println("¡Acceso concedido!");
        login.close();
    }
}
