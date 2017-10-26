package tp1;

import java.util.Iterator;

public interface File<T> {
	
	boolean estvide() ;
	
	void push(T e) ; // ajoute un �l�ment dans la file 
	
	T pull() ; // renvoit le 1er �l�ment rentr� dans le file et le supprime 
	
	Iterator<T> iteration() ;

}
