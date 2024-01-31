package teoria.object.equalsANDhashcode;

public class Test {
    public static void main(String[] args) {
        Persona persona1 = new Persona(1, "juan garćia");
        Persona persona2 = persona1;
        System.out.println(persona1 == persona2); //true
        System.out.println(persona1.equals(persona2));  //true
        System.out.println("=================");
        Persona persona3 = new Persona(1, "juan garćia");
        System.out.println(persona1 == persona3); //false
        System.out.println(persona1.equals(persona3));  //true
        System.out.println("=================");
        Persona persona4 = new Persona(1);
        System.out.println(persona2.equals(persona4));  //true
        System.out.println("=================");
        System.out.println(persona2);
        System.out.println(persona4);
        Ordenador ordenador1 = new Ordenador("1234", 16, 3.5, "axus");
        Ordenador ordenador2 = new Ordenador("1235", 16, 3.5, "msi");
        Ordenador ordenador3 = new Ordenador("1234");
        System.out.println("==============ORDENADORES==============");
        System.out.println(ordenador1 == ordenador2); //false
        System.out.println(ordenador1 == ordenador3); //false
        System.out.println(ordenador1.equals(ordenador2)); //false distinto nº serie
        System.out.println(ordenador1.equals(ordenador3)); //true igual nº serie


    }


}
