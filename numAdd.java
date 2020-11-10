class numAdd{
	public static double add(double a,double b)
	{
		double sum=0;
		sum=a+b;
		return sum;		
	}
	public static void main(String args[]){
		double sum=numAdd.add(143.7,22.14);
		System.out.println("The Sum is= "+sum);
	}
}