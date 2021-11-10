//package com.java8assignment.Hw8;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//
//public class StreamFilterEx {
//	public static void main(String[] args) {
//
//		List<Product> empList = new ArrayList<Product>();
//
//		empList.add(new Product(111, "Loel", 24, "Male", "CS", 2010, 123456));
//		empList.add(new Product(123, "Jason", 25, "Male", "BA", 2016, 55000));
//		empList.add(new Product(123, "Yackson", 24, "Male", "CS", 2014, 60000));
//		empList.add(new Product(123, "Katie", 23, "Female", "Cs", 2013, 70000));
//
////		   return empList;
//
//		List<Product> empNewSorted = empList.stream().sorted(new Comparator<Product>() {
////			   
//			public int compare(Product o1, Product o2) {
//				return (int) (o1.getSalary() - o2.getSalary());
//			}
////			   
//		}).collect(Collectors.toList());
//		// add print statements
////		   
////		for (Product p : empNewSorted) {
//////			System.out.println(p.getName() + p.getSalary());
////		}
//		empList.forEach(System.out::println);
//	}
//
//	@AllArgsConstructor
//	@Getter
//	@Setter
////	public class Product {
//		
//		public Product(int i, String string, int j, String string2, String string3, int k, int l) {
//			// TODO Auto-generated constructor stub
//		}
//		protected int id;
//		protected String name;
//		protected int age;
//		protected String gender;
//		protected int dept;
//		protected int yearOfJoining;
//		protected int salary;
//
//	}
////	
//
//}
