
//Creación Clase Factura
public class Factura {
// Creación Variables encapsuladas para la Clase Factura

    private double iva = 0.19; // Valor iva actual
    private int vSinIva; // Valor a calcular sumatoria de Articulos comprados sin iva
    private String nombreUsuario;// Variable nombre del usuario
    private double vIva; //Valor iva total de los articulos 
    private double total; //Valor a calcular sumatoria de Articulos comprados con iva
    private double suma;

// Constructor con variables sin apuntadar
    Factura() {
    }

//Metodos para modificar y visualizar las variables definidas
// Metodo Definir y obtener iva
    // Metodo para obtener el valor de la compra sin iva
    public double getvSinIva() {
        return this.vSinIva;
    }

    public void setvSinIva(int vSinIva) {
        do {
            this.vSinIva = this.vSinIva + vSinIva;
        } while (vSinIva == 0);

    }

    public double getIva() {
        return this.iva;
    }

// Metodo calcular el valor del iva según total de la compra
    public double getvIva() {
        return this.vIva = this.iva * this.vSinIva;
    }

    // Metodo calcular total de la compra
    public double getTotal() {
        return this.vIva + this.vSinIva;
    }
// Metodo para almacenar el nombre ingresado por teclado creado en la clase PruebaFactura como objeto

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

}
