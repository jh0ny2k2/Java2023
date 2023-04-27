package Ejercicio3;

public class Puntuacion {

	private int puntos;
	private int partidasJugadas;
	private int partidasGanadas;
	private int partidasPerdidas;

	
	public Puntuacion(int puntos, int partidasJugadas, int partidasGanadas, int partidasPerdidas) {
		super();
		this.puntos = puntos;
		this.partidasJugadas = partidasJugadas;
		this.partidasGanadas = partidasGanadas;
		this.partidasPerdidas = partidasPerdidas;
	}


	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPartidasJugadas() {
		return partidasJugadas;
	}

	public void setPartidasJugadas(int partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}

	public int getPartidasGanadas() {
		return partidasGanadas;
	}

	public void setPartidasGanadas(int partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}

	public int getPartidasPerdidas() {
		return partidasPerdidas;
	}

	public void setPartidasPerdidas(int partidasPerdidas) {
		this.partidasPerdidas = partidasPerdidas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Puntuacion [puntos=");
		builder.append(puntos);
		builder.append("- partidasJugadas=");
		builder.append(partidasJugadas);
		builder.append("- partidasGanadas=");
		builder.append(partidasGanadas);
		builder.append("- partidasPerdidas=");
		builder.append(partidasPerdidas);
		builder.append("]");
		return builder.toString();
	}
	
}
