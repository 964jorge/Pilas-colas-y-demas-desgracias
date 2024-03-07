package ED.Pilas;

public class Pila {

    //Sistema LIFO

    private ElementoPila top;
    private int elemEnPila = 0;


    public boolean isEmpty(){ return top == null; }
    public ElementoPila getTop(){

        if(isEmpty()){

            return null;

        }else{

            return this.top;

        }

    }

    public int getElemEnPila(){return elemEnPila;}
    public void clear(){

        int contador = elemEnPila;

        while(contador >= 0){

            pop();
            contador = contador - 1;

        }

    }

    public void push(ElementoPila insertado){

        if (!isEmpty()){

            insertado.setBefore(top);

        }

        this.top = insertado;
        elemEnPila = elemEnPila + 1;

    }

    public ElementoPila pop(){

        ElementoPila topAntiguo;

        if (isEmpty()){

            return null;

        }else{

            topAntiguo = top;
            top = top.getBefore();

        }

        this.elemEnPila = this.elemEnPila - 1;
        return topAntiguo;

    }


}
