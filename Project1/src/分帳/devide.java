package 分帳;

public class devide extends devideinfo{
	public int expendpeo;
	public int cou=1;
	public float dev;

	public float prise[][]= new float[10][2];
	
	public void reset() {
		cou=1;
	}
	
	public String individual() {
		dev = (float)sum / (float)expendpeo ;
		String devd=String.valueOf(dev);
		return devd;
	}
	

	
	public void setexpendpeo() {
		System.out.printf("請輸入第%d項花費的人數：",counter);
		expendpeo = input.nextInt();
	}
	
	public int getexpendpeo() {;
		return expendpeo;
	}
	
	public void findpeo() {
		if(people != expendpeo){
		System.out.printf("請輸入第%d位的名字：",cou);
		String name = input.next();
		cou++;
		for(int i=0;i<people;i++) {
			if((name+ " :").equals(checklist[i][0])) {
				checklist[i][counter]=subject + ": " + individual() +", ";
				prise[i][0]=prise[i][0] + dev;
			}
			else if(checklist[i][counter] == null) {
					checklist[i][counter]="     ";
				}
			} 
		}
		else {
			for(int i=0;i<people;i++) {
					checklist[i][counter]=subject + ": " + individual() +", ";
					prise[i][0] += dev/people;
			}
		}
}
	
	public void check() {
		for(int i = 0 ; i<people;i++) {
			for(int j=0;j<=counter;j++) {
				System.out.print(checklist[i][j]);
			}
			System.out.print("total:" + prise[i][0]);
			System.out.println();
		}
	}
	
	public void specialfindpeo() {
		
		System.out.printf("請輸入第%d位的名字：",cou);
		String name = input.next();
		System.out.printf("%2s 的所佔比例為(不須%)：",name);
		int pa = input.nextInt();
		dev = (float)((float)(sum * pa) / 100.0) ;
		String devd=String.valueOf(dev);
		for(int i=0;i<people;i++) {
			if((name+ " :").equals(checklist[i][0])) {
				checklist[i][counter]=subject + ": " + devd +", ";
				prise[i][0]=prise[i][0] + dev;
			}
			else if(checklist[i][counter] == null) {
				checklist[i][counter]="   ";
			}
		}
		cou++;
		
}

}