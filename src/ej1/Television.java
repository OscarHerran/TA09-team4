package ej1;

public class Television extends Electrodomestico{
	
	protected static final double resolucionDefault=20;
	protected static final boolean sintonizadorTDTDefault= false;
	//Atributos
	
	protected double resolucion;
	protected boolean sintonizadorTDT;
	//Constructores
	
	public Television() {

		this.resolucion = resolucionDefault;
		this.sintonizadorTDT=sintonizadorTDTDefault;
	}
	
	public Television(double preciobase, double peso) {
		super(preciobase,peso);
		this.resolucion = resolucionDefault;
		this.sintonizadorTDT=sintonizadorTDTDefault;
	}
	
	public Television(double preciobase, String color,  char ConsumoEnergetico, double peso ,double resolucion, boolean sintonizadorTDT) {
		super(preciobase,color,ConsumoEnergetico,peso);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
		
		
	}

	
	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	 
	
	public double precioFinal() {
		double precio = super.precioFinal();//
		
		if(resolucion>40) {
			precio+=(precioBase*0.3);
			
		}
		
		if (sintonizadorTDT==true) {
			precio+=50;
			
		}
		
		   return precio;
	}
	
	
	
	
}


