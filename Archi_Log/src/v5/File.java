package v5;

public interface File<K, E> extends Iterable, Mesurable {
	
	
	E premier(); // Premier de la file
	K suivants(); // Ses suivants
	//boolean estVide();
	default boolean estVide(){
		return false;
	}
}
