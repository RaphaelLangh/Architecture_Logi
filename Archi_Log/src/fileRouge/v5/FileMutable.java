package fileRouge.v5;

import java.util.Iterator;

public interface FileMutable<E> extends 
File<FileMutable<E>,E>,
IdentifiableParIteration<FileMutable<?>,E> ,
RepresentableParIteration<E>{

	/*
	 * Accesseurs.
	 */
	
	default void ajouter(E element){
		  throw new UnsupportedOperationException();
	  }

	  default void retirer(){
		  throw new UnsupportedOperationException();

	  }
		
	    /*
		 * Fabriques.
		 */
	
	  @Override
	default FileMutable<E> suivants() {
		 FileMutable<E> file = this.creercopie();
		 file.retirer();
		 return file;
	}

	default FileMutable<E> creercopie(){
		return this;
		}


	 /*
	 * Services
	 */
	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r) {
		return new ListeMutable<E>() {
			private E tete = t;
			private ListeMutable<E> reste = r;
			private int taille = r.taille() + 1;
			@Override
			public boolean casCons(){
				return true;
			}
			public E tete() {
				return this.tete;
			}
			public ListeMutable<E> reste() {
				return this.reste;
			}
			@Override
			public int taille() {
				return this.taille;
			}
			
			@Override
			public void changerTete(E tete) {
				this.tete = tete;
			}
			@Override
			public void changerReste(ListeMutable<E> reste) {
				this.reste = reste;
			}
			@Override
			public boolean equals(Object obj){
				if(!(obj instanceof ListeMutable<?>))
					return false;
				ListeMutable<?> l = (ListeMutable<?>)obj;
				return this.estEgal(l);
			}
			@Override
			public String toString() {
				return this.representation();
			}				
		};
	}
	
	
  
}
