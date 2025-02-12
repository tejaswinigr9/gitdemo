[200~package Calc;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {		    	      
         Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Simple Calculator");
	System.out.println("Choose an operation:");										        System.out.println("1. Add");											        System.out.println("2. Subtract");
														        System.out.println("3. Multiply");
																        System.out.println("4. Divide");

																		    
																		        int choice = scanner.nextInt();

																				       
																				        System.out.print("Enter the first number: ");
																						        double num1 = scanner.nextDouble();

																								        System.out.print("Enter the second number: ");
																										        double num2 = scanner.nextDouble();

																												     
																												        double result = 0;

																														        switch (choice) {
																																	            case 1:
																																			    	                result = num1 + num2;
																																							                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
																																										                break;

																																													            case 2:
																																													                result = num1 - num2;
																																																                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
																																																			                break;

																																																						            case 3:
																																																						                result = num1 * num2;
																																																									                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
																																																												                break;

																																																															            case 4:
																																																															                if (num2 != 0) {
																																																																			                    result = num1 / num2;
																																																																					    	                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
																																																																								    	                } else {
																																																																													                    System.out.println("Error: Division by zero is not allowed.");
																																																																															    	                }
																																																																		                break;

																																																																					            default:
																																																																					                System.out.println("Invalid choice! Please choose a valid operation.");
																																																																								        }

																																        scanner.close();
																																		    }
		    	}




