package tp1;

import java.util.Iterator;

public abstract class ServiceFileSurObjet<T> implements File<T> {
	
	public String toString(){
		String s = "[" ;
		Iterator<T> it = this.iteration();
		while(it.hasNext()){
			s = s + it.next() + ", " ;
		}
		return s + "]" ;
	}
	
	public boolean equals(File<T> f) {
		Iterator<T> it1 = this.iteration();
		Iterator<T> it2 = f.iteration();
		while(it1.hasNext()&&it2.hasNext()&&it1.next().equals(it2.next())) {}
		return !(it1.hasNext()|it2.hasNext());	
	}

}
