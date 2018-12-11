    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emsamablajecomputadoras.creacional;

/**
 *
 * @author Palacios
 */
public class Computador {
    private int ram;
    private String tipoRam;
    private SistemaOperativo os;
    private int almacenamiento;
    private String tipoAlmacenamiento;
    private Mainboard placa;
    private String marca;
    private String modelo;
    private boolean coolerExterno;

    public Computador(int ram, SistemaOperativo os, int almacenamiento, Mainboard placa, String marca, String modelo) {
        this.ram = ram;
        this.os = os;
        this.almacenamiento = almacenamiento;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Computador() {
    }
    
    

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public SistemaOperativo getOs() {
        return os;
    }

    public void setOs(SistemaOperativo os) {
        this.os = os;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public Mainboard getPlaca() {
        return placa;
    }

    public void setPlaca(Mainboard placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isCoolerExterno() {
        return coolerExterno;
    }

    public void setCoolerExterno(boolean coolerExterno) {
        this.coolerExterno = coolerExterno;
    }
    
    

      
    @Override
    public String toString(){
        return "Especificiaciones Tecnicas:\n";
               
    }

	public String getTipoRam() {
		return tipoRam;
	}

	public void setTipoRam(String tipoRam) {
		this.tipoRam = tipoRam;
	}

	public String getTipoAlmacenamiento() {
		return tipoAlmacenamiento;
	}

	public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
		this.tipoAlmacenamiento = tipoAlmacenamiento;
	}
    
    
    
    
}
