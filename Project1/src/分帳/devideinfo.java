package ���b;
public class devideinfo extends basicinfo{
	public String subject;
	public int sum;
	public int counter;
	
	public void setsubject() {
		counter++;
		System.out.printf("�п�J��%d����O�W�١G",counter);
		String sub = input.next();
		this.subject=sub;
	}
	
	public void setsum() {
		System.out.printf("�п�J��%d����O�����B�G",counter);
		sum = input.nextInt();
	}
	

}

