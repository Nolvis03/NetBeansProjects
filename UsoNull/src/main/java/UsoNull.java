
public class UsoNull {

    public static void main(String[] args) {
       Dato d1 = new Dato(); 
       d1.setA(3);
       d1.setB(7);        
        /*System.out.println(d1.getNumeroA());;
        System.out.println(d1.getNumeroB());*/
        System.out.println("La suma es: "+d1.sumar());
        System.out.println(d1.toString());
       }
    }

class Dato {

        private int a;
        private int b;

//Constructor

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }
     
    public String toString(){
    return "numero A: "+this.a+", Numero B: "+this.b;
    }

    
     public int sumar() {
            return a + b;
        }

    }


