package ensamblajecomputadoras.builders;

import emsamablajecomputadoras.creacional.Computer;

public abstract class ComputerBuilder {
	protected Computer compu;
	
	public Computer getComputadora(){
		return compu;
	}
	
	public abstract void DefinirComputadora();
	public abstract void ConstruirMainboard();
	public abstract void ConstruirSistemaOperativo();
	
}
