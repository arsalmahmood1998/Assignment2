public class EmployeesPay {
	public static void main(String[] args) {
		calculatePay("Employee1",7.50,35);
		calculatePay("Employeee2",8.20,47);
		calculatePay("Employeee3",10.00,73);
		calculatePay("Employeee4",9,60);
		}
	static void calculatePay(String name,double basePay,double hours) {
		double pay;
		if(basePay>=8) {
			if(hours<=60) {
				if(hours>40) {
					double overTimeHours=hours-40;
					double remainingHours=hours-overTimeHours;
					double overTimePay=overTimeHours*(basePay*1.5);
					double normalPay=basePay*remainingHours;
					pay=overTimePay+normalPay;
					System.out.println(name+" Pay="+pay+"$");
					}
				else {
					pay=basePay*hours;
					System.out.println(name+" Pay="+pay+"$");
					}
				}
			else {
					System.out.println("Error:The given number of hours is greater than 60 hours please enter number of hours less than 60 for "+name);
				}
			}
		else {
			System.out.println("Error:The given Base Pay is less than 8 $ please enter Base Pay atleast 8$ for "+name);
			}
		}
	}

