import java.util.Arrays;
import java.util.Scanner;
public class Autos {
    String marca;
    String color;
    int afabric=0;
    int numerov=0;
    String tipo;
    //Metodo
   // Autos autos[]=new Autos[numerov];
    Autos autos[]=new Autos[numerov];
    public void ingresarDatos()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de vehiculos a ingresar: ");
        numerov=sc.nextInt();

        for(int i=0; i<1; i++)
        {
            System.out.println("---------------Datos Vehiculo "+(i+1)+"---------------");
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
    public void mostrarDatos()
    {
        for (Autos auto : autos) {
            
        }

        for(int j=0; j<5;j++)
        {
             
            System.out.println("Vehiculo :"+(j+1));
            System.out.println("Marca: "+autos[j].getMarca()+" Color: "+autos[j].getColor()+" Año: "+autos[j].getAfabric()+" Tipo: "+autos[j].getTipo());
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


   /* public String toString() {
        return "Autos{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", afabric=" + afabric +
                ", tipo='" + tipo + '\'' +
                ", autos=" + Arrays.toString(autos) +
                '}';
    }*/
}
