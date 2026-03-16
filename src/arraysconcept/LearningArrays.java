package arraysconcept;
//Arrays are used to store multiple data of similar data type.Whenever we are dealing with a set of data we need to think of CRUD operations
//C-----Create
//R-----Read/Access
//U-----Update
//D-----Delete(we can't perform direct delete operation on an array. there is an indirect method but we don't use that.
//Creating an array---------dataType[] variablename=new datatype[length]; or datatype variablename[length]={values};
//Arrays index starts from 0. a[0],a[1] etc
//if we declare a length in particular and try to add more than the length it doesnt throw compile time error(Checked exception) but throws"OUT OF BOUND"
//exception as run time error(Unchecked exception)

public class LearningArrays {
	public void printingArrays()
	{
	String[] names=new String[5];//creating string array of length 4
	names[0]="Jagadeesh";//assigning values to array
	names[1]="Priyanka";
	names[3]="Devaansh";
	names[4]="Aadhyan";
	System.out.println(names[0]);//Accessing or reading
	//to print every data from the array we use loops. line 22 is for loop and 32 is for-each loop
	for(int i=0;i<=3;i++)
	{
		//for skipping the value we havenot given here?like we missed names[2]
		if(names==null)
		{
			continue;
		}
		System.out.println(names[i]);
	}
	//Updation
	names[0]="Jagadeesh Mandava";
	System.out.println(names[0]);
	//Another method of intialization for arrays
	//We cannot add data in between because arrays is of fixed length even after declaring as line 15 or line 30
	int[] age= {12,34,62,8};
	//String[] initials= {"Mandava","Somapalli"};
	//for(datatype variablename:elementname holding data)
	for(int ages:age)
	{
		System.out.println(ages);
	}
	
	}
	public static void main(String[] args)
	{
		LearningArrays lr=new LearningArrays();
		lr.printingArrays();
		
	}
}
