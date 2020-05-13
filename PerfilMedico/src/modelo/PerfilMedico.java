package modelo;

public class PerfilMedico {
private String nombre;
private String apellido;
private int dia;
private int mes;
private int año;
private int edad;
private String frecuencia; 
private String persona;
private int estatura;
private int peso;
public double imc;
private String sexo;
private String inicio;// Volver a inicio

public PerfilMedico(){};

public PerfilMedico(String nombre,String apellido,int dia, int mes,int año,int edad,String frecuencia,int estatura,int peso, double imc, String Sexo){
    this.nombre = nombre;
    this.estatura = estatura;
    this.peso = peso;
    this.apellido=apellido;
    this.año=año;
    this.mes=mes;
    this.dia=dia;
    this.edad=edad;
    this.frecuencia=frecuencia;
    this.sexo=sexo;
    this.imc=imc;
}

public void establecerNombre (String nombre ){
this.nombre= nombre;
}

public String obtenerNombre (String nombre){
return nombre;
}

public void establecerApellido (String apellido){
this.apellido= apellido;
}

public String obtenerApellido (String apellido){
return apellido;
}
public void establecerAño (int año){
this.año= año;
}
public void establecerDia (int dia){
this.dia= dia;
}
public int obtenerDia(int dia){
return dia;
}
public void establecerMes (int mes){
this.mes= mes;
}
public int obtenerMes (int mes){
return mes;
}
public int obtenerAño (int año){
return año;
}

public int operarEdad (int año){
edad=2019-año;
return edad;
}

public int obtenerEdad (int año){
return edad;}

public void establecerSexo (String sexo){
this.sexo= sexo;
}

public String obtenerSexo (String sexo){
return sexo;
}

public int obtenerFrecuencia (int año){
if (edad<=25){
 System.out.println("Su frecuencia cardiaca máxima es de: 220 Latidos por minuto \nSu frecuencia cardiaca normal debe ser de 100 a 170 latidos por minuto");
 }
 else if (edad>=26 && edad<=30){
 System.out.println("Su frecuencia cardiaca máxima es de: 190 Latidos por minuto \nSu frecuencia cardiaca normal debe ser de 95 a 162 latidos por minuto");
 }
  else if (edad>=31 && edad<=35){
 System.out.println("Su frecuencia cardiaca máxima es de: 185 Latidos por minuto \nSu frecuencia cardiaca normal debe ser de 93 a 157 latidos por minuto");
 }
 else if (edad>=36 && edad<=40){
 System.out.println("Su frecuencia cardiaca máxima es de: 180 Latidos por minuto \nSu frecuencia cardiaca normal debe ser de 90 a 153 latidos por minuto");
 } 
 else if (edad>=41 && edad<=45){
 System.out.println("Su frecuencia cardiaca máxima es de: 175 Latidos por minuto \nSu frecuencia cardiaca normal debe ser de 88 a 149 latidos por minuto");
 }
 else if (edad>=46 && edad<=50){
 System.out.println("Su frecuencia cardiaca máxima es de: 170 Latidos por minuto \nSu frecuencia cardiaca normal debe ser de 85 a 145 latidos por minuto");
 }
else if (edad>=51 && edad<=55){
 System.out.println("Su frecuencia cardiaca máxima es de: 165 Latidos por minuto \nSu frecuencia cardiaca normal debe ser de 83 a 140 latidos por minuto");
 } 
else if (edad>=56 && edad<=60){
 System.out.println("Su frecuencia cardiaca máxima es de: 160 Latidos por minuto \nSu frecuencia cardiaca normal debe ser de 80 a 136 latidos por minuto");
}
 else if (edad>=61 && edad<=65){
 System.out.println("Su frecuencia cardiaca máxima es de: 155 Latidos por minuto \nSu frecuencia cardiaca normal debe ser de 78 a 132 latidos por minuto");
 }  
else if (edad>=66 && edad<=70){
 System.out.println("Su frecuencia cardiaca máxima es de: 150 Latidos por minuto \nSu frecuencia cardiaca normal debe ser de 75 a 128 latidos por minuto");
 } 
else {
 System.out.println("Su frecuencia cardiaca debe ser evaluada por un medico, por favor chequearse");
 }
System.out.println("Todos los datos aquí brindados corresponden a las cifras indicadas por American Heart Association y deben usarce como guia general, \nsi desea analizar a profundidad, consulte su medico");     
return 0;
}   ; 
   public void establecerestatura (int estatura){
        this.estatura = estatura;
    }
    public int  obtenerestatura (int estatura){
        return estatura;}   
    
    public void establecerpeso (int peso){
        this.peso = peso;
    }
    public int obtenerpeso (int estatura){
        return peso;}
    
    public int calcularIMC(int peso, int estatura){
    imc = peso/(estatura*estatura);
    return 0;
    }
    
    public String rangoIMC(){
    
       if (imc<18.5){
    System.out.println(nombre+" está bajo de peso");}
    else if (imc<=24.9 && imc>=18.5){
    System.out.println(nombre+" está normal de peso");}
    else if (imc>=25 && imc<=29.9){
    System.out.println(nombre+" está en Sobrepeso");}
    else  {
    System.out.println(nombre+" está Obeso");}
     return inicio;
     
    }
    
    

}