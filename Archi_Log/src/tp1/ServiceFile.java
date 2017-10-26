package tp1;

import java.util.Iterator;

public abstract class ServiceFile<T> implements File<T> {
	
	public String toString(){
		String s = "[" ;
		Iterator<T> it = this.iteration();
		while(it.hasNext()){
			s = s + it.next() + ", " ;
		}
		return s + "]" ;
	}
	
	public int size(){
	int r = 0 ;
	Iterator<T> it = this.iteration() ;
	while(it.hasNext()){
			r=r+1;
			it.next();
			}
	return r;
	}
	
	public boolean contient(T e){
		Iterator<T> it = this.iteration();
		while(it.hasNext()&&!it.next().equals(e)){
		}
		return it.hasNext() ;
	}

}
