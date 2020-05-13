public class Caja {
int alto;
int profundo;
int ancho;

public Caja(){}

public Caja(int ancho, int alto, int profundo){
this.ancho = ancho;
this.alto = alto;
this.profundo = profundo;

}

public int calVolumen(){
return ancho*alto*profundo;
}    
}
