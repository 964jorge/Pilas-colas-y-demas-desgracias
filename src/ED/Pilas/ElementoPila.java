package ED.Pilas;

public class ElementoPila {

    private ElementoPila before;
    private Object data;

    public ElementoPila(Object data){

        this.data = data;

    }

    public ElementoPila(){}

    protected Object getData(){

        if(data == null){

            return null;

        }else {

            return data;

        }

    }
    protected void setData(Object data){ this.data = data; }

    protected void setBefore(ElementoPila el){ this.before = el; }
    protected ElementoPila getBefore(){ return this.before;}


}
