package logicales;

public class Max_3 {

	public static void main(String[] args) {
		// maximum of 3 if we want minimum of three then change only  t1=(a<b?a:b);
	                                                                //t2=(b<c?b:c);
	                                                                //res=(t1<t2?t1:t2);
       int a=73;
       int b=70;
       int c=65;
       int res,t1,t2;
       t1=(a>b?a:b);
       t2=(b>c?b:c);
       res=(t1>t2?t1:t2);
       System.out.println(res);
	}

}
