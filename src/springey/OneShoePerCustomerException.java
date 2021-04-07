package springey;

public class OneShoePerCustomerException extends Exception{
	String msg;
	public OneShoePerCustomerException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
}
