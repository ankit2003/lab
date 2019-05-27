interface Tourplan
{
		public abstract void chennaitodelhi(String mode,int fare);
		public abstract void hydtoindore(String mode,int fare);
		public abstract void indoretodelhi(String mode,int fare);
		public abstract void totalfare();
}
class Travelplan implements Tourplan
{
	int totalfare1;
	public void chennaitodelhi(String mode,int fare)
	{
		System.out.println("Chennai to delhi ");
		System.out.println("Mode:"+mode);
		System.out.println("Fare:"+fare);
		System.out.println();
		totalfare1+=fare;

	}
	public void hydtoindore(String mode,int fare)
	{
		System.out.println("Hyderbad to Indore ");
		System.out.println("Mode:"+mode);
		System.out.println("Fare:"+fare);
		System.out.println();
		totalfare1+=fare;
	}
	public void indoretodelhi(String mode,int fare)
	{
		System.out.println("Indore to Delhi ");
		System.out.println("Mode:"+mode);
		System.out.println("Fare:"+fare);
		System.out.println();
		totalfare1+=fare;
	}
	public void totalfare()
	{
		System.out.println("Total fare="+totalfare1);
	}

}
class prg3
{
	public static void main(String args[])
	{
		Travelplan t1=new Travelplan();
		t1.chennaitodelhi("bus",10000);
		t1.hydtoindore("plane",100000);
		t1.indoretodelhi("train",20000);
		t1.totalfare();
	}
} 