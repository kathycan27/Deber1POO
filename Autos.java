import java.util.Arrays;
import java.util.Scanner;
public class Autos {
    String marca;
    String color;
    String modelo;
    int afabric=0;
    int numerov=0;
    String tipo;
    Scanner sc=new Scanner(System.in);
    //Metodo
   // Autos autos[]=new Autos[numerov];
    Autos autos[]=new Autos[5];
    public void auto()
    {
        System.out.println("indique el numero de autos a ingresar: ");
        numerov= Integer.parseInt(sc.next());
    }
    public void ingresarDatos()
    {


        for(int i=0; i<numerov; i++)
        {
            System.out.println("---------------Datos Vehiculo "+(i+1)+"---------------");
            autos[i]=new Autos();
            System.out.println("Cual es la marca de su vehiculo: ");
            marca=sc.next();
            autos[i].setMarca(marca);
            System.out.println("Cual es su modelo de vehiculo: ");
            modelo=sc.next();
            autos[i].setModelo(modelo);
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
    public void mostrarDatos()
    {
        for (Autos auto : autos) {
            
        }

        for(int j=0; j<numerov;j++)
        {
             
            System.out.println(" ----------- Vehiculo "+(j+1)+"-----------");
            System.out.println("Marca: "+autos[j].getMarca()+"\nModelo: "+autos[j].getModelo()+"\nColor: "+autos[j].getColor()+"\nAño: "+autos[j].getAfabric()+"\nTipo: "+autos[j].getTipo());
        }
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
