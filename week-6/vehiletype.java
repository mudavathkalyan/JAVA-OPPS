/*
 * 6. Extend the above TwoWheeler class with methods getType() and getName()
which gives the information about the type and the name of the company.Create
sub-classes Geared and NonGeared with method average() to print the average of
a geared and non-geared two wheeler.
 */
 import java.util.Scanner;
 class TwoWheeler
 {
     String type,name;
     void setDetails(String type,String name)
     {
         this.type=type;
         this.name=name;
     }
     String getType()
     {
         return type;
     }
     String getName()
     {
         return name;
     }
 }
 class geared extends TwoWheeler
 {
     void average()
     {
         System.out.println("Avg of geared");
     }
 }
 class nonGeared extends TwoWheeler
 {
     void average()
     {
         System.out.println("Avg of Non-geared");
     }
 }
 public class vehiletype
 {
     public static void main(String[] args) 
     {
         Scanner sc =new Scanner(System.in);	
         geared g=new geared();
         System.out.print("Enter details of geared like->type & nameOfCompany::");
         g.setDetails(sc.nextLine(), sc.nextLine());
         
         nonGeared ng=new nonGeared();
         System.out.print("Enter details of nongeared like->type & nameOfCompany::");
         ng.setDetails(sc.nextLine(), sc.nextLine());
 
         System.out.println("Details of Geared:");
         System.out.println("Type:"+g.getType());
         System.out.println("Company:"+g.getName());
         g.average();
         System.out.println("\nDetails of NonGeared:");
         System.out.println("Type:"+ng.getType());
         System.out.println("Company:"+ng.getName());
         ng.average();
     } 
 }
 
