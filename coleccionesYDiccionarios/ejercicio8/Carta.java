package coleccionesYDiccionarios.ejercicio8;

public class Carta {

	// enumeraciones Figuras y Palos
	private Figuras figura;
	private Palos palo;

	/**
	 * Constructor Carta
	 * 
	 * @param figura
	 * @param palo
	 */
	public Carta(Figuras figura, Palos palo) {
		setFigura(figura);
		setPalo(palo);
	}

	/**
	 * @return the palo
	 */
	public Palos getPalo() {
		return palo;
	}

	/**
	 * @param palo
	 *          the palo to set
	 */
	private void setPalo(Palos palo) {
		this.palo = palo;
	}

	/**
	 * @return the figura
	 */
	public Figuras getFigura() {
		return figura;
	}

	/**
	 * @param figura
	 *          the figura to set
	 */
	private void setFigura(Figuras figura) {
		this.figura = figura;
	}

//	@Override
//	public int compareTo(Carta carta) {
//		if (palo.equals(carta.getPalo())) {
//			return figura.compareTo(carta.getFigura());
//		} else {
//			return palo.compareTo(carta.getPalo());
//		}
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((figura == null) ? 0 : figura.hashCode());
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (figura != other.figura)
			return false;
		if (palo != other.palo)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", figura=" + figura + "]";
	}

}