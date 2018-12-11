package ensamblajecomputadoras.builders;

import emsamablajecomputadoras.creacional.Computer;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class AsusZenbookBuilder extends ComputerBuilder {

	@Override
	public void DefinirComputadora() {
		// TODO Auto-generated method stub
		compu=new Computer();
		compu.setMarca("Asus");
		compu.setModelo("Zenbook ");
		compu.setRam(16);
		compu.setAlmacenamiento(500);
		
		
	}

	@Override
	public void ConstruirMainboard() {
		// TODO Auto-generated method stub
		compu.setPlaca(new Mainboard("Prime ","Z370")); 
		
	}

	@Override
	public void ConstruirSistemaOperativo() {
		compu.setOs(new SistemaOperativo("Windows 10",64,"HOME"));
		
	}

}
