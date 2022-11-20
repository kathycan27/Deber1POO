import java.util.Scanner;
public class Autos {
    String marca;
    String color;
    int afabric=0;
    int numerov=0;
    String tipo;

    //Metodo

    public void ingresarDatos()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de vehiculos a ingresar: ");
        numerov=sc.nextInt();
        Autos autos[]=new Autos[numerov];


    }


//Getters and Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAfabric() {
        return afabric;
    }

    public void setAfabric(int afabric) {
        this.afabric = afabric;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumerov() {
        return numerov;
    }

    public void setNumerov(int numerov) {
        this.numerov = numerov;
    }
}
