class ConstructionCost
{
	public int  cost(int stan,int area,boolean automated)
	{
		int standard=1000;
		int highstandard=1500;
		if(stan<standard&&automated==false)
		{
			return(area*1200);
		}
		if(stan>standard && automated==false)
		{
			return(area*1500);
		}
		if(stan<highstandard && automated==false)
		{
			return(area*1800);
		}
		if(stan<highstandard && automated==true)
		{
			return(area*2500);
		}
	}
}