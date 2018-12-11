package ensamblajecomputadoras.builders;

import emsamablajecomputadoras.creacional.Computer;

public class ComputerDirector {
	private ComputerBuilder builder;
	
	public ComputerDirector(ComputerBuilder builder) {
		this.builder=builder;
	}
	
	public void ConstruirComputadora() {
		builder.DefinirComputadora();
		builder.ConstruirMainboard();
		builder.ConstruirSistemaOperativo();
		
	}
	
	public Computer getComputadora() {
		return builder.getComputadora();
	}
}
