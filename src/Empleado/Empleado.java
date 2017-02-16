package Empleado;

public class Empleado {
	private long NIF;
	private long DNI;
	private long sueldo;
	private long pagoHoraExtra;
	private long horaExtraMes;
	private int IRPF;
	private boolean casado;
	private int hijos;
	
	public Empleado(){}
	
	public Empleado(long NIF,long DNI, long sueldo,long pagoHoraExtra,long horaExtraMes,int IRPF,boolean casado,int hijos){
		this.NIF=NIF;
		this.DNI=DNI;
		this.sueldo=sueldo;
		this.pagoHoraExtra=pagoHoraExtra;
		this.horaExtraMes=horaExtraMes;
		this.IRPF=IRPF;
		this.casado=casado;
		this.hijos=hijos;
	}
	
	public Empleado(long NIF, long sueldo,long pagoHoraExtra,long horaExtraMes,int IRPF,boolean casado,int hijos){
		this.NIF=NIF;
		this.sueldo=sueldo;
		this.pagoHoraExtra=pagoHoraExtra;
		this.horaExtraMes=horaExtraMes;
		this.IRPF=IRPF;
		this.casado=casado;	
		this.hijos=hijos;
	}
	
	public void setNIF(int NIF){
		this.NIF=NIF;
	}
	public void setDNI(int DNI){
		this.DNI=DNI;
	}
	public void setSueldo(long sueldo){
		this.sueldo=sueldo;
	}
	public void setPagoHoraExtra(long pagoHoraExtra){
		this.pagoHoraExtra=pagoHoraExtra;
	}
	public void setHoraExtraMes(long horaExtraMes){
		this.horaExtraMes=horaExtraMes;
	}
	public void setIRPF(int IRPF){
		this.IRPF=IRPF;
	}
	public void setCasado(boolean casado){
		this.casado=casado;
	}
	public void setHijos(int hijos){
		this.hijos=hijos;
	}
	
	public long getNIF(){
		return NIF;
	}
	public long getDNI(){
		return DNI;
	}
	public long getSueldo(){
		return sueldo;
	}
	public long getPagoHoraExtra(){
		return pagoHoraExtra;
	}
	public long getHoraExtraMes(){
		return horaExtraMes;
	}
	public int getIRPF(){
		return IRPF;
	}
	public boolean getCasado(){
		return casado;
	}
	public int getHijos(){
		return hijos;
	}
	
	public long CalculoHorasExtras(){
		return this.pagoHoraExtra*this.horaExtraMes;
	}
	
	public long CalculoSueldoBruto(){
		return this.sueldo+CalculoHorasExtras();
	}
	
	public long RetencionIRPF(){
        long tipo = IRPF;
        if(casado == true) {
            tipo = tipo - 2;
        }
        tipo = tipo - hijos;
        if(tipo<0){
            tipo = 0;
        }
        return CalculoSueldoBruto() * tipo / 100;
    }
	
	public long CalculoSueldoNeto(){
		return CalculoSueldoBruto() - RetencionIRPF();
	}
	
	public String println(){
		return "NIF: "+this.NIF+
				"\nDNI: "+this.DNI+
				"\n¿Casado?: "+this.casado+
				"\nHijos: "+this.hijos;
	}
	
	
	public String printALL(){
		return "NIF: "+this.NIF+
				"\nDNI: "+this.DNI+
				"\nSueldo base: "+this.sueldo+
				"\nHoras extras: "+CalculoHorasExtras()+
				"\nSueldo bruto: "+CalculoSueldoBruto()+
				"\nRetención IRPF: "+RetencionIRPF()+
				"\nSueldo neto: "+CalculoSueldoNeto()+
				"\n¿Casado?: "+this.casado+
				"\nHijos: "+this.hijos;
	}

}
