package objectClass;

class employee {
	String Ename;

	employee(String name) {
		this.Ename = name;
	}

	public boolean equales(Object variable) {
      boolean n=false;
      if(this.Ename==((employee)variable).Ename)
      {
    	  n=true;
      }
      return n;
	}
}

public class OverridingEqulesMethod {
	public static void main(String[] args) {
		employee e = new employee("ram");
		employee e1 = new employee("ra");
		System.out.println(e.equales(e1));

	}
}
