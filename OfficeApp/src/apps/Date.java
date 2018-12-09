package apps;

public class Date {

		private int dd;
		private int mm;
		private int yy;
		public void showDate()
		{
			System.out.println(dd+"/"+mm+"/"+yy);
		}
		public Date(int d,int m,int y )
		{
			this.dd=d;
			this.mm=m;
			this.yy=y;
		}
		public Date(Date d)
		{
			this.dd=d.dd;
			this.mm=d.mm;
			this.yy=d.yy;
		}
		public Date()
		{
		}
}
