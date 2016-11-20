
public class Foo {
	
	private String name;
	private String lastName;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Foo)){return false;}
		else{
		Foo theFoo = (Foo) obj;
		return((this.name.equals(theFoo.name))&&
				this.lastName.equals(theFoo.lastName));
		}
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}
