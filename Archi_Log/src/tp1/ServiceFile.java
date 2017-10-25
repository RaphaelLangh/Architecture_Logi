package tp1;

public abstract class ServiceFile<T> implements File<T> {
	
	public String toString(){
		if(this.estvide()){
			return "" ;
		}
		else {
			return "" + this.pull().toString() + ", " + this.toString();
		}
	}
	
	public int size(){
		if(this.estvide()){
			return 0 ;
		}
		else {
			this.pull();
			return 1+this.size();
		}
	}
	
	public boolean contient(T e){
		if(this.estvide()){
			return false ;
		}
		else return (this.pull().equals(e))||(this.contient(e));
	}

}
