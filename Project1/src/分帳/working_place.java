package 分帳;
import java.util.Scanner;
public class working_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入人數：");
		int peo = input.nextInt();
		devide check = new devide();
		check.setpeople(peo);
		check.setname();
		System.out.print("一般平均輸入(normal) 特定比例輸入或離開(exit) :");
		while(input.hasNext()) {
			String ctn = input.next();
				if(ctn.equals("normal")||ctn.equals("go")) {
						check.setsubject();
						check.setsum();
						check.setexpendpeo();
						check.reset();
						for(int counter =1;counter<=check.getexpendpeo();counter++) {
							check.findpeo();
						}
						System.out.print("繼續輸入(go) 停止一般平均輸入(任意鍵) :");
				}
				else break;
		}
		
		System.out.print("特定比例輸入(special) 離開(bye):");
		while(input.hasNext()) {
			String go = input.next();
				if(go.equals("special") || go.equals("go")) {
					check.setsubject();
					check.setsum();
					check.setexpendpeo();
					check.reset();
					for(int counter =1;counter<=check.getexpendpeo();counter++) {
						check.specialfindpeo();
					}
					System.out.print("繼續輸入(go) 離開(任意鍵):");
				}
				else break;
			}
		System.out.println();
		System.out.println("結果出爐：");
		check.check();
	}

}
