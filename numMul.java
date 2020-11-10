class numMul{
	public static double mul(double a,double b)
	{
		double product=0;
		product=a*b;
		return product;		
	}
	public static void main(String args[]){
		double product=numMul.mul(67.4,12.5);
		System.out.println("The Product is= "+product);
	}
}