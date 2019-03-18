package fr.atenotech.nmetivier;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public final class Console {
	
	/**
	 * Rythme du m�tronome.
	 */
	private static short bpm = 120;

	/**
	 * On r�cup�re le batement par minute.
	 * @return
	 */
	public static final short getBpm() {
		return Console.bpm;
	}
	
	/**
	 * On d�fini le batement par minute.
	 * @param newBpm Batement par minute.
	 */
	public static final void setBpm(short newBpm) {
		Console.bpm = newBpm;
	}
	

}
