package Ventanas;

public class Auto {
	
	private double naftaActual;
	private String nombre;
	private int pasajerosABordo;
	private int capacidadPasajeros;
	private double kilometraje;
	private double capacidadTanqueDeNafta;
	
	public Auto(String nombre, int capacidadPasajeros, double tanqueDeNafta) {
		super();
		this.naftaActual = 0;
		this.nombre = nombre;
		this.pasajerosABordo = 0;
		this.capacidadPasajeros = capacidadPasajeros;
		this.kilometraje = 0;
		this.capacidadTanqueDeNafta = tanqueDeNafta;
	}

	public double getNafta() {
		return naftaActual;
	}

	public void setNafta(double nafta) {
		if(tieneRestoTanque(nafta)){
			this.naftaActual += nafta;			
		}
		else{
			this.naftaActual = llenarTanque();
		}
	}

	private boolean tieneRestoTanque(double nafta) {
		return (this.capacidadTanqueDeNafta - this.naftaActual) >= nafta;
	}
	
	private double llenarTanque() {
		return this.capacidadTanqueDeNafta;
	}

	public void manejar(int kilometros){
		double gastoPorKilometro = kilometros * 0.1;
		if(!tieneSuficienteNafta(gastoPorKilometro)){
			this.setKilometraje(calcularKilometraje(kilometros));
			this.naftaActual = 0;
		}
		else{
			this.naftaActual -= gastoPorKilometro;
			this.setKilometraje(this.getKilometraje() + kilometros);
		}
	}

	private boolean tieneSuficienteNafta(double gastoPorKilometro) {
		return this.naftaActual > gastoPorKilometro;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	private void setKilometraje(double kilometros) {
		this.kilometraje = kilometros;
	}

	private double calcularKilometraje(int kilometros) {
		return this.getKilometraje() + kilometros - (kilometros - convertirNaftaActualAKilometros());
	}

	private double convertirNaftaActualAKilometros() {
		return this.getNafta() * 10;
	}
}
