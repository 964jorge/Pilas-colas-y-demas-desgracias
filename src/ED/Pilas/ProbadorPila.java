package ED.Pilas;

public class ProbadorPila {

    public static void main(String[] args){

        Pila pila = new Pila();

        System.out.println(pila.getElemEnPila());
        System.out.println(pila.isEmpty());
        ElementoPila el1 = new ElementoPila();
        el1.setData("Manué");
        pila.push(el1);
        System.out.println(pila.getElemEnPila());

        ElementoPila el2 = new ElementoPila();
        el2.setData(5.0f);
        pila.push(el2);
        System.out.println(pila.getElemEnPila());


        ElementoPila el3 = new ElementoPila();
        el3.setData(2.0f);
        pila.push(el3);
        System.out.println(pila.getElemEnPila());

        ElementoPila el4 = new ElementoPila();
        el4.setData("Jacinto");
        pila.push(el4);
        System.out.println(pila.getElemEnPila());

        System.out.println(pila.isEmpty());
        System.out.println(pila.getTop().getData());
        System.out.println(pila.pop().getData());
        System.out.println(pila.getElemEnPila());
        System.out.println(pila.getTop().getData());
        System.out.println(pila.getElemEnPila());
        System.out.println((Float) pila.pop().getData() + (Float) pila.pop().getData());
        System.out.println(pila.getElemEnPila());
        System.out.println(pila.getTop().getData());
        pila.push(el4);
        System.out.println(pila.getElemEnPila());
        System.out.println(pila.getTop().getData());
        pila.clear();
        System.out.println(pila.getElemEnPila());

        if (pila.getTop() == null){

            System.out.println(pila.getTop());

        }else{

            System.out.println(pila.getTop().getData());

        }

    }


}
