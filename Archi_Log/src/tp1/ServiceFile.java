package tp1;

import java.util.Iterator;

public interface ServiceFile<T> extends File<T> {

	public default int size(){
	int r = 0 ;
	Iterator<T> it = this.iteration() ;
	while(it.hasNext()){
			r=r+1;
			it.next();
			}
	return r;
	}
	
	public default boolean contient(T e){
		Iterator<T> it = this.iteration();
		while(it.hasNext()&&!it.next().equals(e)){
		}
		return it.hasNext() ;
	}

}
