package 分帳;
import java.util.Scanner;
public class basicinfo {
	Scanner input = new Scanner(System.in);

	public int people;
	public String name;
	public String checklist[][]= new String[people][50];
	

	public void setpeople(int people) {
		this.people=people;
	}
	
	public void setname() {
		String checklist[][]= new String[people][50];
		for(int counter =1;counter <= people ; counter++) {
			System.out.printf("請輸入第%2d 位名字：",counter);
			name = input.next();
			checklist[counter-1][0] = name + " :";
		}
		this.checklist=checklist;
	}
}
