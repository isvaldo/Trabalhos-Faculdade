package com.maquina;

public class Carro {
	
	private String marcaMotor; // verox
	private String chassis; // marco pollo
	private String marcaPneu; // rodaaralho
	private String marcaCombustivel; // shell
	
	
	public String getMarcaMotor() {
		return marcaMotor;
	}
	public void setMarcaMotor(String marcaMotor) {
		this.marcaMotor = marcaMotor;
	}
	public String getChassis() {
		return chassis;
	}
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	public String getMarcaPneu() {
		return marcaPneu;
	}
	public void setMarcaPneu(String marcaPneu) {
		this.marcaPneu = marcaPneu;
	}
	public String getMarcaCombustivel() {
		return marcaCombustivel;
	}
	public void setMarcaCombustivel(String marcaCombustivel) {
		this.marcaCombustivel = marcaCombustivel;
	}
	
	
	@Override
	public String toString() {
		return "Carro [marcaMotor=" + marcaMotor + ", chassis=" + chassis
				+ ", marcaPneu=" + marcaPneu + ", marcaCombustivel="
				+ marcaCombustivel + "]";
	}
	
	
	public static Carro criarCarro(String marcaMotor, String chassis, String marcaPneu,
			String marcaCombustivel) {
		Carro  carro = new Carro();
		carro.setMarcaMotor(marcaMotor);
		carro.setChassis(chassis);
		carro.setMarcaPneu(marcaPneu);
		carro.setMarcaCombustivel(marcaCombustivel);
		return carro;
	}
	
	
	
	
	

}
