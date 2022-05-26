/*
Name: Shubham Sadashiv Dhamane
Student id: A00257743
Subject: JAV1001
Topic: Variables and Logic (LAB1)
Description: Following program helps to convert input value between appropriate units.
  'Switch' is used to execute prgram smoothly.
*/

import java.util.*;
public class Convert{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float result,k=0;         //to store result and kelvin
    System.out.println("Enter a value to convert:");
    float num = sc.nextFloat();
    sc.nextLine();            //to move curser to the next line

    System.out.println("Enter the current unit of measure:");
    String unit=sc.nextLine();

    switch(unit){
      case "km":              //km to mi
        result=num*0.62f;
        System.out.println(num+"km is equal to "+result+"mi");
        break;
      case "mi":              //mi to km
        result=num*1.61f;
        System.out.println(num+"mi is equal to "+result+"km");
        break;
      case "cm":              //cm to in
        result=num*0.39f;
        System.out.println(num+"cm is equal to "+result+"in");
        break;
      case "in":              //in to cm
        result=num*2.54f;
        System.out.println(num+"in is equal to "+result+"cm");
        break;
      case "kg":              //kg to lb
        result=num*2.2f;
        System.out.println(num+"kg is equal to "+result+"lb");
        break;
      case "lb":              //lb to kg
        result=num*0.45f;
        System.out.println(num+"lb is equal to "+result+"kg");
        break;
      case "g":               //g to oz
        result=num*0.04f;
        System.out.println(num+"g is equal to "+result+"oz");
        break;
      case "oz":              //oz to g
        result=num*28.35f;
        System.out.println(num+"oz is equal to "+result+"g");
        break;
      case "C":               //C to F&K
        result=(num*9/5)+32;
        k=num+273.15f;
        System.out.println(num+"C is equal to "+result+"F and "+k+"K");
        break;
      case "F":               //F to C&K
        result=(num-32)*5/9;
        k=result+273.15f;
        System.out.println(num+"F is equal to "+result+"C and "+k+"K");
        break;
      case "l":               //l to cup
        result=num*4.17f;
        System.out.println(num+"l is equal to"+result+"cup");
        break;
      case "cup":             //cup to l
        result=num*0.24f;
        System.out.println(num+"cup is equal to"+result+"l");
        break;
      default:
        System.out.println("Please Enter proper unit(km/mi/cm/in/kg/lb/g/oz/C/F/l/cup)");

    }

  }
}
