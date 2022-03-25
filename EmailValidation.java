package com.simplilearn.demo;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class EmailValidation {
 public static void main(String[] args) {

 ArrayList<String> emailID = new ArrayList<String>();

 emailID.add("vinitw47@gmail.com");
 emailID.add("sampada23@gmail.com");
 emailID.add("vaishnavi@gmail.com");
 emailID.add("sarthak29@gmail.com");
 emailID.add("pradip43@gmail.com");
 emailID.add("shreyash27@gmail.com");
 emailID.add("nikhil55@gmail.com");

 String searchElement;
 System.out.println("E-mail: ");
 Scanner scanner = new Scanner(System.in);
 searchElement = scanner.nextLine();
 String regex = "^(.+)@(.+)$";

 Matcher matcher = Pattern.compile(regex).matcher(searchElement);

 if (matcher.matches() && emailID.stream().anyMatch(mail ->
mail.equals(searchElement))) {
 System.out.println(searchElement + " = Email is valid");
 }
 else {
 System.out.println("Email is not valid");
 }

 }
 }