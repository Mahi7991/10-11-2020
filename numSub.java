class numSub{
	public static double sub(double a,double b)
	{
		double diff=0;
		diff=a-b;
		return diff;		
	}
	public static void main(String args[]){
		double diff=numSub.sub(141.46,209.34);
		System.out.println("The Difference is= "+diff);
	}
}