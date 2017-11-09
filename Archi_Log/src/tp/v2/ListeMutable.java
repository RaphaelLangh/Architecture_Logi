package tp.v2;

import java.util.Iterator;

public interface ListeMutable<E> extends Liste<E>{

	/*
	 * Accesseurs.
	 */
	default ListeMutable<E> reste() {
		throw new UnsupportedOperationException();
	}
	
	default void changerReste(ListeMutable<E> reste) {
		throw new UnsupportedOperationException();
	}
	
	default void changerTete(E tete) {
		throw new UnsupportedOperationException();
	}

	/*
	 * Services
	 */
	default ListeMutable<E> miroir(){
		return miroirrec(vide());
	}
	
	default ListeMutable<E> miroirrec(ListeMutable<E> l){
		if(this.estVide()) {
			return l ;
		}
		else {
			l.changerReste(l);
			l.changerTete(this.tete());
			return this.reste().miroirrec(l);
		}
	}

	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r){
		final ListeMutable<E> r1=r==null ? ListeMutable.vide() : r;

		return new ListeMutable<E>() {
			@Override
			public ListeMutable<E> reste() {
				return r1;
			}
			@Override
			public void changerReste(ListeMutable<E> reste) {
				cons(t,reste);
			}
			@Override
			public void changerTete(E tete) {
				cons(tete,r1);
			}
		};
	}
	
	public static <E> ListeMutable<E> vide() {
		return new ListeMutable<E>() {
			@Override
			public void changerReste(ListeMutable<E> reste) {
				cons(reste.tete(),reste.reste()); //s'il est vide et on change son reste, 
												  //son nouveau reste devient la liste en entier
			}
			@Override
			public void changerTete(E tete) {
				cons(tete,vide());
			}
		};
	}
	
}