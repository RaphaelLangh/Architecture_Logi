package tp1;

import java.util.Iterator;
import java.util.LinkedList;

public class FileLinkedList<T> extends ServiceFile<T> {
	
	private LinkedList<T> liste ;
	
	public FileLinkedList(LinkedList<T> t){
		this.liste = t ;
	}
	public FileLinkedList(){
		this(new LinkedList<T>());
	}
	public LinkedList<T> getListe() {
		return liste;
	}

	public boolean estvide() {		
		return this.getListe().isEmpty();
	}

	public void push(T e) {
		this.getListe().add(e);
	}

	public T pull() {
		return this.getListe().pop();
	}
	
	public Iterator<T> iteration(){
		return this.getListe().iterator();
		
	}

}
