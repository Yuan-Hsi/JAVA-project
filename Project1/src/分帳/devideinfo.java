package 分帳;
public class devideinfo extends basicinfo{
	public String subject;
	public int sum;
	public int counter;
	
	public void setsubject() {
		counter++;
		System.out.printf("請輸入第%d項花費名稱：",counter);
		String sub = input.next();
		this.subject=sub;
	}
	
	public void setsum() {
		System.out.printf("請輸入第%d項花費的金額：",counter);
		sum = input.nextInt();
	}
	

}

