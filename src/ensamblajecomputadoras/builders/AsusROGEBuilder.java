package ensamblajecomputadoras.builders;

import emsamablajecomputadoras.creacional.Computer;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class AsusROGEBuilder extends ComputerBuilder {
	
	public AsusROGEBuilder() {
		super();
	}
	
	@Override
	public void DefinirComputadora() {
		compu=new Computer();
		compu.setMarca("Asus");
		compu.setModelo("ROG");
		compu.setRam(32);
		compu.setAlmacenamiento(1000);
		
	}

	@Override
	public void ConstruirMainboard() {
		compu.setPlaca(new Mainboard("strix","99"));
		
	}

	@Override
	public void ConstruirSistemaOperativo() {
		// TODO Auto-generated method stub
		compu.setOs(new SistemaOperativo("Windows 10",64,"PRO"));
		
	}
	
	
}
