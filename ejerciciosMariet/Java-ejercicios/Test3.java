import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        int opciones;
      
    do {

    	System.out.println("Ingrese una opcion del 1 al 4");
        opciones = scanner.nextInt();
       switch (opciones) {
            case 1:
            Nombre_Apellido (scanner);
                break;
            case 2:
                correo_contraseña(scanner);
                break;
            case 3:
                usuario(scanner);
                break;
            case 4:
                System.out.println("Bye bye sapo");
                break;
            default:
                System.out.println("ERROR, prueba con otra opcion");
                break;
            
        } 
    	  
       
    }  
       
    while(opciones!=4); {
      
    	scanner.close();
    }
} 
      
    public static void Nombre_Apellido(Scanner scanner) {
    	
    	System.out.print("Truco ");
        String Truco = scanner.nextLine();
        
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
    }

    public static void correo_contraseña(Scanner scanner) {
    	
    	System.out.print("Truco ");
        String Truco = scanner.nextLine();
        
        System.out.print("Ingrese email: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contraseña = scanner.nextLine();
    }

    public static void usuario(Scanner scanner) {
        System.out.print("Ingrese el tipo de usuario (1 para administrador, 2 para cliente): ");
        int tipoUsuario = scanner.nextInt();
        if (tipoUsuario == 1) {
            System.out.println("Eres administrador");
        } else if (tipoUsuario == 2) {
            System.out.println("Eres cliente");
        } else {
            System.out.println("Invalido");
        }
    }
}

