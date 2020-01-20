class Box
{
public int boxLen;
public int boxWid;
public int boxHgt;
	public Box()
	{
	boxLen=2;
	boxWid=2;
	boxHgt=2;
	}
	public Box(int boxLen,int boxWid,int boxHgt)
	{
	this.boxLen=boxLen;
	this.boxWid=boxWid;
	this.boxHgt=boxHgt;
	}
	void setBox(int len,int wid,int hgt)
	{
	this.boxLen=boxLen;
	this.boxWid=boxWid;
	this.boxHgt=boxHgt;
	}
	void getBox()
	{
	int volume=boxLen*boxWid*boxHgt;
	System.out.println("volume"+volume);
	}
}
	
