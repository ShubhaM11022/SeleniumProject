package test_suite;

import login_testcases.*;

public class Regression_Test_Suite {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("test case 1 : ");
TC_1 tc1= new TC_1();
tc1.testcase01();
System.out.println("test case 2 : ");

TC_2 tc2= new TC_2();
tc2.testcase02();
System.out.println("test case 3 : ");

TC_3 tc3= new TC_3();
tc3.testcase03();
System.out.println("test case 5 : ");

TC_5 tc5= new TC_5();
tc5.testcase05();
System.out.println("test case 6 : ");

TC_6 tc6= new TC_6();
tc6.testcase06();

	}

}



//"passwoed": "fgjjksfgbjs"