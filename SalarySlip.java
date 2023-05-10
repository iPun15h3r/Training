
class SalarySlip extends HRA {

	double totalsalary;
	
	SalarySlip()
	{
		totalsalary = basicpay+hra-pf-deduction+bonus;
	}
		void Salary() {
	        System.out.println("Basic Pay: " + basicpay);
	        System.out.println("Deduction: " + deduction);
	        System.out.println("HRA: " + hra);
	        System.out.println("PF: " + pf);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary: " + totalsalary);
	    }
		
		public static void main(String[] args) {
	        SalarySlip s = new SalarySlip();
	        s.Salary();
		}


}
