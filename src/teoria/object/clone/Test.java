package teoria.object.clone;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Persona persona1 = new Persona(1, "julio roman");
        Persona persona2 = persona1;
        System.out.println("======Valore iniciales========");
        System.out.println(persona1);
        System.out.println(persona2);
        persona2.setNombre("rocío flores");
        System.out.println("======Valore con SET========");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println("=======CLONE==========");
        Persona persona3 = (Persona) persona1.clone();
        persona3.setNombre("felipe garcía");
        System.out.println(persona1);
        System.out.println(persona3);

    }
}
