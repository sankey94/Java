package apps;


public class Empdemo {

	public static void main(String[] args) {
		Emp []allemp=new Emp[3];
		allemp[0]=new SalesManager("Sanket", 1,1,199, 1998, 738616, 4566, 4858, 3000);
		allemp[1]=new Programmer("Sanket", 1,1,199, 1998, 738616, 4566, 4858,3000);
		//allemp[2]=new Admin("sanket",1,1,199,71998,73437,4566);
		for(int i=0;i<=allemp.length;i++)
		{
			//if()
			System.out.println("******************");
			System.out.println(allemp[i]);
			
		}

/*		for(int i=0;i<allemp.length;i++)
		{
			System.out.println("-------------------------");
			System.out.println(allemp[i]);
		}
		double total=0;
		for(int i=0;i<allemp.length;i++)
		{
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(allemp[i]);
		}
		*/
		


	}

}
