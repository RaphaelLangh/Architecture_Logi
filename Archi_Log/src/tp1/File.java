package tp1;

import java.util.Iterator;

public interface File<T> {
	
	boolean estvide() ;
	
	void push(T e) ; // ajoute un �l�ment dans la file 
	
	T pull() ; // renvoit le 1er �l�ment rentr� dans le file et le supprime 
	
	Iterator<T> iteration() ; //renvoit un it�rateur sur la file
	
	T head() ; // renvoit le 1er �l�ment de la file (le premier entr�) 

}
