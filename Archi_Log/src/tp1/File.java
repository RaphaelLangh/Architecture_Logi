package tp1;

import java.util.Iterator;

public interface File<T> {
	
	boolean estvide() ;
	
	void push(T e) ; // ajoute un élément dans la file 
	
	T pull() ; // renvoit le 1er élément rentré dans le file et le supprime 
	
	Iterator<T> iteration() ;

}
