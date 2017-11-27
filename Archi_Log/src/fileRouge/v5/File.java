package fileRouge.v5;

public interface File<K extends File<K, E>, E> extends Iterable<E>, Mesurable {
	
	
	E premier(); // Premier de la file
	K suivants(); // Ses suivants
	//boolean estVide();
	default boolean estVide(){
		return true;
	}
	
	K creer(); // fabrique d'une file vide
	@SuppressWarnings("unchecked")
	default K sujet(){ // Alias de this
	  return (K)this;
	}
	
	K ajout(E dernierDansFile); // Ajout en fin
	K retrait(); // Retrait de premier élément	
	default K ajoute(K secondFile){
		throw new UnsupportedOperationException();
	}
}

