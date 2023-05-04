package logicales;

class Rollnum

{ 
	int Snum;
Rollnum (int number)
  {
	  this.Snum=number;
  }
  public int hashCode()
  {
	  return 0+Snum;
  }

}
 class Overriding_HashCodeMethod {

	public static void main(String[] args)
	{
		Rollnum e1=new Rollnum(1);
        System.out.println(e1.hashCode());
	}

}
