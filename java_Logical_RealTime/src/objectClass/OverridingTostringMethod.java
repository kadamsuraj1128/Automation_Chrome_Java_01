package objectClass;

class emp {
	int Eid;

	emp(int id) {
		this.Eid = id;
	}

	public String toString() {
		return "NASA" + this.Eid;
	}

}

public class OverridingTostringMethod {
	public static void main(String[] args) {
		emp e = new emp(12);
		System.out.println(e);

	}
}
