package Domaine;

public class Paire<T> {

	private T premier;
	private T second;
	
	public Paire(T premier, T second) {
		super();
		this.premier = premier;
		this.second = second;
	}
	/**
	 * @return the premier
	 */
	public T getPremier() {
		return premier;
	}
	/**
	 * @param premier the premier to set
	 */
	public void setPremier(T premier) {
		this.premier = premier;
	}
	/**
	 * @return the second
	 */
	public T getSecond() {
		return second;
	}
	/**
	 * @param second the second to set
	 */
	public void setSecond(T second) {
		this.second = second;
	}
	
	

}
