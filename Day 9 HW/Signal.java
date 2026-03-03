class Signal
{
	public  static void main(String[] args)
	{
		char signal = 'G';
		if(signal == 'R')
		{
			System.out.println("R -> STOP");
			System.out.println("Conform Bike STOP");
		}
		if(signal == 'Y')
		{
			System.out.println("Y -> READY");
			System.out.println("Bike Start And Get Ready Go");
		}			
		if(signal == 'G')
		{
			System.out.println("G -> GO");
			System.out.println("Varta Mame Durr...");
		}
	}
}