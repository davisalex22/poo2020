package intropoo;

public class EjecutaPersona {
    public static void main(String[] args) {

        // Creacion de objeto con constructor 1
        Persona persona1  = new Persona ("Masculino","Católico",19,"David Salazar");
        System.out.println(persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad()+"\n"+"Religión: "+persona1.getReligion()+"\n"+"Género: "
                +persona1.getGenero());

        // Creación de objeto como constructor 2
        Persona persona2 = new Persona("Masculino","Católico",20);
        Persona persona3 = new Persona("Femenino","Ateo",60);

        System.out.println("Edad persona 2: "+persona2.getEdad());
        System.out.println("Edad persona 3: "+persona3.getEdad());
        System.out.println("Nombre persona 2: "+persona2.getNombre());


    }
}
