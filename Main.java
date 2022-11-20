import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Autos a=new Autos();
    int numerov=0;
    int opcion=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------Bienvenidos a Vehiculos Michi-----------------");
        do {
            System.out.println("Escoga la accion que desee realizar \n 1 Ingresar Datos de Vehiculos \n 2 Mostrar Datos de Vehiculos \n 3 Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    a.auto();
                    a.ingresarDatos();
                    break;
                case 2:
                    System.out.println("Recuerde que de no haber ingresado datos previamente no existen datos a mostrar");
                    a.mostrarDatos();
                    break;
                default:
                    break;

            }

        }while(opcion<3);
        System.out.println("-------------------Gracias por ingresar-------------------");


    }
}
