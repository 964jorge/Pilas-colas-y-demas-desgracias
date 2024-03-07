package ED;

public class Pila {

    //Sistema LIFO

    private Object top;
    private Object before;
    private int enPila;


    public boolean isEmpty(){ return top == null; }
    public void clear(){

        while(enPila >= 0){

            this.push();

        }

    }

    public void push(Object insertado){

        if (!isEmpty()){



        }

        top = insertado;

        this.enPila = this.enPila + 1;

    }


}
