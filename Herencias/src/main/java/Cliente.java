
import java.util.Date;

public class Cliente extends Persona{

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;
//Constructores
     Cliente (Date fechaRegistro, boolean vip) {
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

// Metodos
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    public String toString(){
    return super.toString()+"idCliente: "+idCliente+" Fecha Registro: "+fechaRegistro+ " VIP: "+vip;
    }
    
}
