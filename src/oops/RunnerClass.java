package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1 = new Employee();
		
		emp1.Name = "Sachin";
		emp1.EmployeeId = 242423;
		emp1.Salary = 1000;
		
		Employee emp2 = new Employee();
		
		emp2.Name = "Mahesh";
		emp2.EmployeeId = 543456;
		emp2.Salary = 1200; */
		
		//Employee emp1 = new Employee("Sachin",242423,1000);
		//Employee emp2 = new Employee("Mahesh",543456,1200);
		
		//emp1.PrintName();
		//emp2.PrintName();

		Employee emp3 = new Employee("Rahul",456785);
		Employee.ChangeCompanyName();
		
		Employee emp4 = new Employee();
		
		Person per1 = new Person();
		
		ChildClass child = new ChildClass();
		
		ChildClass child1 = new ChildClass("Rahul",30,"Actor");
		
		MethodOverLoadingExample obj = new MethodOverLoadingExample();
		obj.sum(4, 6);
		obj.sum(4, 6, 7);
			
		// BankExample bank = new BankExample();	-- can not create object of abtract class
		
		ICICBank bank1 = new ICICBank();
		bank1.Creditcard();
		bank1.Welcome();
		
		EncapsulationExample obj10 = new EncapsulationExample();
		
		obj10.setName("Rohit");
		System.out.println(obj10.getName());
		
	}

}
