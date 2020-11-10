class numDiv{
	public static double div(double a,double b)
	{
		double quotient=0;
		quotient=a/b;
		return quotient;		
	}
	public static void main(String args[]){
		double quotient=numDiv.div(45.14,6.78);
		System.out.println("The Quotient is= "+quotient);
	}
}