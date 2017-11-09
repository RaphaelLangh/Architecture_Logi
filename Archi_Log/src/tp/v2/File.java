
package tp.v2;

public interface File<E> extends Iterable<E> {

	/*
	 * Accesseurs
	 */
	E premier();
	File<E> suivants();
	
	default boolean estVide() {
		return this.taille() == 0;
	}
	int taille();
	
	/*
	 * Fabriques
	 */
	File<E> creer();
	
	/*
	 * Services
	 */
	File<E> ajout(E dernierDansFile);
	File<E> retrait();
	File<E> ajout(File<E> secondeFile);
	
	default String representation() {
		if(this.estVide()) {
			return "" ;
		}
		else {
			return this.premier()+", "+this.suivants().representation();
		}
		
	}

	default boolean estEgal(File<E> file){
		
		if(this.estVide()&file.estVide()) {
			return true ;
		}
		else if(this.estVide()|file.estVide()) {
			return false ;
		}
		else {
			return this.premier().equals(file.premier())&
					this.suivants().estEgal(file.suivants());
		}
	}
	
	
	
}
