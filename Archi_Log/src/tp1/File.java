package tp1;

public interface File<T> {
	
	boolean estvide() ;
	
	void push(T e) ; // ajoute un �l�ment dans la liste 
	
	T pull() ; // renvoit le 1er �l�ment rentr� dans le liste et le supprime 
	
	

}
