package DNI;

public class Cuenta {
	private long numero=100000;
	private long DNI;
	private long saldo;
	private long interes;
	
	public Cuenta(){}
	
	public Cuenta(long DNI,long saldo,long interes){
		this.numero=this.numero+1;
		this.DNI=DNI;
		this.saldo=saldo;
		this.interes=interes;
	}
	
	public void setDNI(long DNI){
		this.DNI=DNI;
	}
	public void setSaldo(long saldo){
		this.saldo=saldo;
	}
	public void setInteres(long interes){
		this.interes=interes;
	}
	
	public long getNumero(){
		return numero;
	}
	public long getDNI(){
		return DNI;
	}
	public long getSaldo(){
		return saldo;
	}
	public long getInteres(){
		return interes;
	}
	
	public void actualizarSaldo(){
		this.saldo=this.saldo+(((this.interes*this.saldo)/100)/365);
	}
	public void ingresar(long ingreso){
		this.saldo=this.saldo+ingreso;
	}
	public void retirar(long retiro){
		this.saldo=this.saldo-retiro;
	}
	public String toString(){
		return "Numero: "+this.numero+"\nDNI: "+this.DNI+"\nSaldo: "+this.saldo+"\nInterés: "+this.interes;
	}
	

}
