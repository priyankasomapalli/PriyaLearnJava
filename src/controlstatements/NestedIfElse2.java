package controlstatements;

public class NestedIfElse2 {
	//Choosing the vehicle base on time
//if the time to reach is 30min,choose bike
	//time to reach is more than 30min,choose car
	//time to reach is taking more than 60min,choose train
	int time;
	public void choosingVehicle(int time)
	{
		if(time<=30)
		{
			if(time>60)
			{
				System.out.println("Choose train");
			}
			else if(time>30)
			{
				System.out.println("Choose car");
			}
			else
				System.out.println("Choose bike");
			
		}
		else
			System.out.println("I will Stay at home");
	}
	public static void main(String[] args)
	{
		NestedIfElse2 nie2=new NestedIfElse2();
		nie2.choosingVehicle(76);
	}
}
