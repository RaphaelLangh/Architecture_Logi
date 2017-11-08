package tp.v2;

import java.util.Iterator;

public interface Liste<E> extends Iterable<E> {
	/*
	 * Accesseurs
	 */
	default boolean casVide() {
		return false;
	}
	default E tete() {
		throw new UnsupportedOperationException();
	}
	default Liste<E> reste() {
		throw new UnsupportedOperationException();
	}
	default boolean casCons() {
		return false;
	}
	default public int taille(){
		return 0;
	}
	default public boolean estVide(){
		return this.taille() == 0;
	}
	
	/*
	 * Services
	 */
	default Iterator<E> iterator() {      //à verifier
		Iterator<E> itere = new Iterator<E>(){
		Liste<E> sauv = cons(tete(),cons(tete(),reste()));   //duplication de la tete , pour que le premier next() donne tete().
		public boolean hasNext(){
			return sauv.reste().estVide();
			}
		public E next(){
			sauv = sauv.reste();   //prend à chaque fois la tete du reste
			return sauv.tete();
			}
		};
		return itere; 
	}
	
	default Liste<E> miroir(){
		Iterator<E> it = this.iterator();
		Liste<E> listeMiroir = new Liste<E>(){};
		listeMiroir=cons(this.tete(),listeMiroir);
		Liste<E> listeReste = this.reste();
		while(it.hasNext()){
			listeMiroir = cons(listeReste.tete(),listeMiroir);
			listeReste = listeReste.reste();
		} 
		return listeMiroir;
	}
	/*
	 * Fabriques (statiques)
	 */
	
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
			@Override
			public boolean casVide(){
				return true;
			}
		};
	}
	
	public static <E> Liste<E> cons(E t, Liste<E> r) {
		return new Liste<E>() {
			@Override
			public E tete() {
				return t;
				}
			@Override
			public Liste<E> reste() {
				return r;
				}
			
			@Override
			public boolean casCons() {
				return true; // à verifier
			}
			
			@Override
			public int taille(){
				Iterator<E> it = this.iterator();
				int i = 0;
				while (it.hasNext()){
					it.next();
					i+=1;
				}
				return i;
			}
		};
	}
	
}