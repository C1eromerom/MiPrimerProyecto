package Empleado;

public class Empleado {
	private long NIF;
	private long DNI;
	private int sueldo;
	private int pagoHoraExtra;
	private int horaExtraMes;
	private int IRPF;
	private boolean casado;
	private int hijos;
	
	public Empleado(){}
	
	public Empleado(long NIF,long DNI, int sueldo,int pagoHoraExtra,int horaExtraMes,int IRPF,boolean casado,int hijos){
		this.NIF=NIF;
		this.DNI=DNI;
		this.sueldo=sueldo;
		this.pagoHoraExtra=pagoHoraExtra;
		this.horaExtraMes=horaExtraMes;
		this.IRPF=IRPF;
		this.casado=casado;
		this.hijos=hijos;
	}
	
	public Empleado(long NIF, int sueldo,int pagoHoraExtra,int horaExtraMes,int IRPF,boolean casado,int hijos){
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
	public void setSueldo(int sueldo){
		this.sueldo=sueldo;
	}
	public void setPagoHoraExtra(int pagoHoraExtra){
		this.pagoHoraExtra=pagoHoraExtra;
	}
	public void setHoraExtraMes(int horaExtraMes){
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
	public int getSueldo(){
		return sueldo;
	}
	public int getPagoHoraExtra(){
		return pagoHoraExtra;
	}
	public int getHoraExtraMes(){
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

}
