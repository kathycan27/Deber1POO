import java.util.Scanner;
public class Autos {
    String marca;
    String color;
    int afabric=0;
    int numerov;
    String tipo;

    //Metodo


    public void ingresarDatos()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de vehiculos a ingresar: ");
        numerov=sc.nextInt();
        Autos autos[]=new Autos[numerov];
        for(int i=0; i<numerov; i++)
        {
            autos[i]=new Autos();
            System.out.println("Cual es la marca de su vehiculo: ");
            marca=sc.next();
            autos[i].setMarca(marca);
            System.out.println("Cual es el color de su vehiculo: ");
            color=sc.next();
            autos[i].setColor(color);
            System.out.println("Cual es el año de su vehiculo: ");
            afabric=sc.nextInt();
            autos[i].setAfabric(afabric);
            System.out.println("Cual es su tipo de vehiculo: ");
            tipo=sc.next();
            autos[i].setTipo(tipo);
        }



    }
    /*public void mostrarDatos()
    {
        for(int j=0; j<numerov;j++)
        {
            System.out.println(autos[j]);
        }
    }*/

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
