package fr.atenotech.nmetivier;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public final class TempoThread extends Thread {
	
	/**
	 * Flag permettant de d�finir si le thread boucle.
	 */
	private boolean isLooping = false;
	
	/**
	 * Thread permettant de g�rer le tempo.
	 */
	public TempoThread() {
		super("TempoThread");
	}
	
	@Override
	public void run() {
		
		// On met le boolean � true.
		this.isLooping = true;
		
		// Tant que ca boucle...
		while(this.isLooping) {
			
			// ON  joue un son
			java.awt.Toolkit.getDefaultToolkit().beep();
			try {
				// On essaie de mettre le programme en pause.
				super.sleep(60000/Console.getBpm());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Fonction qui permet d'arr�ter le thread proprement.
	 */
	public void terminate() {
		this.isLooping = false;
	}

}
