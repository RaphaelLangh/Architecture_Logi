package tp.v2;

public interface FileMutable<E> extends File<E> {

	/*
	 * Accesseurs
	 */
	@Override
	default FileMutable<E> suivants(){
		FileMutable<E> fm = this.creerCopie();
		fm.retirer();
		return fm;
	}

	void ajouter(E element);
	void retirer();
	
	/*
	 * Fabriques
	 */
	FileMutable<E> creer();
	FileMutable<E> creerCopie();
	
	/*
	 * Services
	 */
	@Override
	default FileMutable<E> ajout(E dernierDansFile) {
		this.ajouter(dernierDansFile); 
		return this;
	}
	@Override
	default FileMutable<E> retrait() {
		this.retirer();
		return this;
	}
	// Complexit� O(|secondeFile|)
	@Override
	default FileMutable<E> ajout(File<E> secondeFile) {
		// TODO (m�me code que FileImmutable.ajout)
		return null;
	}
	
	// Complexit� en O(1).
	void ajouter(File<E> secondeFile);

}