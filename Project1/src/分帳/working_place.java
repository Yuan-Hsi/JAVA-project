package ���b;
import java.util.Scanner;
public class working_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�п�J�H�ơG");
		int peo = input.nextInt();
		devide check = new devide();
		check.setpeople(peo);
		check.setname();
		System.out.print("�@�륭����J(normal) �S�w��ҿ�J�����}(exit) :");
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
						System.out.print("�~���J(go) ����@�륭����J(���N��) :");
				}
				else break;
		}
		
		System.out.print("�S�w��ҿ�J(special) ���}(bye):");
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
					System.out.print("�~���J(go) ���}(���N��):");
				}
				else break;
			}
		System.out.println();
		System.out.println("���G�X�l�G");
		check.check();
	}

}
