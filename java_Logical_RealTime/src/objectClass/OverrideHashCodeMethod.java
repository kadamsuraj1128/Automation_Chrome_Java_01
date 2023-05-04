package objectClass;

class emp1 {
	int Eid;

	emp1(int id) {
		this.Eid = id;
	}

	public int hashCode() {
		return 0 + this.Eid;
	}
}

public class OverrideHashCodeMethod {

	public static void main(String[] args) {
		emp1 e = new emp1(1);
		System.out.println(e.hashCode());

	}

}
