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
	default Iterator<E> iterator() {      
		Liste<E> that = this;
		Iterator<E> itere = new Iterator<E>(){
		Liste<E> sauv= that;
		public boolean hasNext(){
			return !sauv.casVide();
			}
		public E next(){
			E tete = sauv.tete();
			sauv = sauv.reste();   //prend à chaque fois la tete du reste
			return tete;
			}
		};
		return itere; 
	}
	
	default Liste<E> miroir(){
		Iterator<E> it = this.iterator();
		Liste<E> listeMiroir = Liste.vide();
		while(it.hasNext()){
			listeMiroir = cons(it.next(),listeMiroir);
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
	
	public static <E> Liste<E> cons(E t, final Liste<E> r) {
		final Liste<E> r1=r==null ? Liste.vide() : r;
		
		return new Liste<E>() {
			
			@Override
			public E tete() {
				return t;
				}
			@Override
			public Liste<E> reste() {
				return r1;
				}
			
			@Override
			public boolean casCons() {
				return true; // à verifier
			}
			
			@Override
			public int taille(){
				if(this.reste().casVide()){
					return 1;
				}
				return 1+this.reste().taille();
			}
		};
	}
	
}