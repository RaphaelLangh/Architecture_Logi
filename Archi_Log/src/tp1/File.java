package tp1;

public interface File<T> {
	
	boolean estvide() ;
	
	void push(T e) ; // ajoute un élément dans la liste 
	
	T pull() ; // renvoit le 1er élément rentré dans le liste et le supprime 
	
	

}
