package Zad1;

public class Samochod {

	String marka;
	String model;
	double pojemnoscSilnika;
	String typNadwozia;
	String typSilnika;
	int rokProdukcji;
	String dataPierwszejRejestracji;
	double cena;
	
	public Samochod(String marka,
					String model,
					double pojemnoscSilnika,
					String typNadwozia,
					String typSilnika,
					int rokProdukcji,
					String dataPierwszejRejestracji,
					double cena) {
		this.marka = marka;
		this.model = model;
		this.pojemnoscSilnika = pojemnoscSilnika;
		this.typNadwozia = typNadwozia;
		this.typSilnika = typSilnika;
		this.rokProdukcji = rokProdukcji;
		this.dataPierwszejRejestracji = dataPierwszejRejestracji;
		this.cena = cena;
	}
	
	public boolean maGwarancje() {
		int dzien = (int)(this.dataPierwszejRejestracji.charAt(0) + this.dataPierwszejRejestracji.charAt(1)),
			miesiac = (int)(this.dataPierwszejRejestracji.charAt(3) + this.dataPierwszejRejestracji.charAt(4)),
			rok = (int)(this.dataPierwszejRejestracji.charAt(6) + this.dataPierwszejRejestracji.charAt(7)+ this.dataPierwszejRejestracji.charAt(8)+ this.dataPierwszejRejestracji.charAt(9));
		return false;
	}
	
	
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPojemnoscSilnika() {
		return pojemnoscSilnika;
	}

	public void setPojemnoscSilnika(double pojemnoscSilnika) {
		this.pojemnoscSilnika = pojemnoscSilnika;
	}

	public String getTypNadwozia() {
		return typNadwozia;
	}

	public void setTypNadwozia(String typNadwozia) {
		this.typNadwozia = typNadwozia;
	}

	public String getTypSilnika() {
		return typSilnika;
	}

	public void setTypSilnika(String typSilnika) {
		this.typSilnika = typSilnika;
	}

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public void setRokProdukcji(int rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}

	public int getDataPierwszejRejestracji() {
		return dataPierwszejRejestracji;
	}

	public void setDataPierwszejRejestracji(int dataPierwszejRejestracji) {
		this.dataPierwszejRejestracji = dataPierwszejRejestracji;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

}
