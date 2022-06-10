
package com.mycompany.faculty;
import java.time.Duration;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Faculty {


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Students> student = new ArrayList<>();
        ArrayList<Workers> workers = new ArrayList<>();
        ArrayList<Adminstrators> adminstrators = new ArrayList<>();
        ArrayList<Instructors> instructors = new ArrayList<>();
        ArrayList<Technicians> technicans = new ArrayList<>();
        
        
        int chose1 = 0 ; 
    while(chose1!=-1)
    {

      System.out.println("_____________________________________________");
      System.out.println("|                                           |");
      System.out.println("| Press 1 to Add                            |");
      System.out.println("| Press 2 to Search                         |");
      System.out.println("| Press 3 to Delete                         |");
      System.out.println("| Press 4 to Show_Data                      |");
      System.out.println("| Press anything else to End program        |");
      System.out.println("|___________________________________________|");
      System.out.println("____________________________________________");
      System.out.println("                                           ");
     // System.out.print("                     ");
      chose1 = in.nextInt();
      System.out.println("____________________________________________");
      if(chose1==1)
      {
        int choes2;
        System.out.println("_____________________________________________");
        System.out.println("|                                           |");
        System.out.println("| Press 1 to Add Instractor                 |");
        System.out.println("| Press 2 to Add Student                    |");
        System.out.println("| Press 3 to Add Worker                     |");
        System.out.println("| Press 4 to Add Tecnical                   |");
        System.out.println("| Press 5 to Add Adminstrator               |");
        System.out.println("| Press anything to Back                    |");
        System.out.println("|___________________________________________|");
        choes2 = in.nextInt();
        if(choes2 == 1)
            {
                
                Instructors i1 = new Instructors();
                System.out.println("Enter Name: ");
                String tname = in.next();
                i1.setName(tname);
                System.out.println("Enter Age: ");
                try{
                     Scanner inT = new Scanner(System.in);
                     int tage =inT.nextInt();
                     i1.setAge(tage);

                    }
                  catch(InputMismatchException e){
                    System.out.println("invalued input \n Please reinter it");
                    Scanner inT =new Scanner(System.in);
                    int tage=inT.nextInt();
                     i1.setAge(tage);
                  }
                
                
                System.out.println("Enter Nationality: ");
                String tnationality = in.next();
                i1.setNationality(tnationality);
                System.out.println("Enter Government ID: ");
                String gov_id= in.next();
                i1.setGov_id(gov_id);
                System.out.println("Enter Gender: ");
                String tgender = in.next();
                i1.setGender(tgender);
                System.out.println("Enter Address: ");
                String tadd = in.next();
                i1.setAddress(tadd);
                System.out.println("Enter Degree: ");
                String tdegree = in.next();
                i1.setDegree(tdegree);
                System.out.println("Enter Salary: ");
                double tsalary = in.nextDouble();
                i1.setSalary(tsalary);
                System.out.println("Enter Department: ");
                String tdepartment = in.next();
                i1.setDepartment(tdepartment);
                System.out.println("En1er Starting year: ");
                int tstarting_year = in.nextInt();
                i1.setStarting_year(tstarting_year);
                instructors.add(i1);
                //System.out.println(i1.toString());

                
            
                
   
            }
            else if(choes2==2)
            {
                Students Tstu = new Students();
                System.out.println("Enter Name: ");
                String tname = in.next();
                Tstu.setName(tname);
                System.out.println("Enter Age: ");
                int tage = in.nextInt();
                Tstu.setAge(tage);
                System.out.println("Enter Nationality: ");
                String tnationality = in.next();
                Tstu.setNationality(tnationality);
                System.out.println("Enter Address: ");
                String tadd = in.next();
                Tstu.setAddress(tadd);
                System.out.println("Enter level: ");
                int tlevel = in.nextInt();
                Tstu.setStudy_level(tlevel);
                System.out.println("Enter Department: ");
                String tdepartment = in.next();
                Tstu.setDepartment(tdepartment);
                System.out.println("Enter GPA : ");
                double tgpa = in.nextDouble();
                Tstu.setGPA(tgpa);
                System.out.println("Enter Gender : ");
                String tgen = in .next();
                Tstu.setGender(tgen);
                student.add(Tstu);
                //System.out.println(Tstu.toString());
                
                
            }
             else if(choes2==3)
            {
                Workers wo=new Workers();
                System.out.println("Enter Name: ");
                String tname = in.next();
                wo.setName(tname);
                System.out.println("Enter Age: ");
                int tage = in.nextInt();
                wo.setAge(tage);
                System.out.println("Enter Nationality: ");
                String tnationality = in.next();
                wo.setNationality(tnationality);
                System.out.println("Enter Salary:  ");
                double salary=in.nextInt();
                wo.setSalary(salary);
                System.out.println("Enter  The Department ");
                String department=in.next();
                wo.setDepartment(department);
                System.out.println("Enter Gender:  ");
                String gender = in.next();
                wo.setGender(gender);
                System.out.println("Enter Address:  ");
                String add =in.next();
                wo.setAddress(add);
                System.out.println("Enter gov_id:  ");
                String GI =in.next();
                wo.setGov_id(GI);
                System.out.println("Enter Starting Year:  ");
                int SY =in.nextInt();
                wo.setStarting_year(SY);
                workers.add(wo);
              //  System.out.println(wo.toString());

            }
             else if(choes2==4)
            {
                Technicians t1 = new Technicians();
                System.out.println("Enter Name: ");
                String tname = in.next();
                t1.setName(tname);
                System.out.println("Enter Age: ");
                int tage = in.nextInt();
                t1.setAge(tage);
                System.out.println("Enter Nationality: ");
                String tnationality = in.next();
                t1.setNationality(tnationality);
                System.out.println("Enter Salary:  ");
                double salary=in.nextInt();
                t1.setSalary(salary);
                System.out.println("Enter  The Department ");
                String department=in.next();
                t1.setDepartment(department);
                System.out.println("Enter Gender:  ");
                String gender = in.next();
                t1.setGender(gender);
                System.out.println("Enter Address:  ");
                String add =in.next();
                t1.setAddress(add);
                System.out.println("Enter gov_id:  ");
                String GI =in.next();
                t1.setGov_id(GI);
                System.out.println("Enter Starting Year:  ");
                int SY =in.nextInt();
                t1.setStarting_year(SY);
                technicans.add(t1);
               // System.out.println(t1.toString());

            }
             else if(choes2==5)
            {
             Adminstrators a1 = new Adminstrators();
                System.out.println("Enter Name: ");
                String tname = in.next();
                a1.setName(tname);
                System.out.println("Enter Age: ");
                int tage = in.nextInt();
                a1.setAge(tage);
                System.out.println("Enter Nationality: ");
                String tnationality = in.next();
                a1.setNationality(tnationality);
                System.out.println("Enter Salary:  ");
                double salary=in.nextInt();
                a1.setSalary(salary);
                System.out.println("Enter  The Department ");
                String department=in.next();
                a1.setDepartment(department);
                System.out.println("Enter Gender:  ");
                String gender = in.next();
                a1.setGender(gender);
                System.out.println("Enter Address:  ");
                String add =in.next();
                a1.setAddress(add);
                System.out.println("Enter gov_id:  ");
                String GI =in.next();
                a1.setGov_id(GI);
                System.out.println("Enter Starting Year:  ");
                int SY =in.nextInt();
                a1.setStarting_year(SY);   
                adminstrators.add(a1);
               // System.out.println(a1.toString());

            }
      }
      else if(chose1==2)
      {
             int choes3 ;
            System.out.println("______________________________________________");
            System.out.println("|                                            |");
            System.out.println("| Press 1 to Student                         |");
            System.out.println("| Press 2 to Instructor                      |");
            System.out.println("| Press 3 to worker                          |");
            System.out.println("| Press 4 to Aminstrtor                      |");
            System.out.println("| Press 5 to Ticnical                        |");
            System.out.println("| Press anyting else to back                 |");
            System.out.println("|____________________________________________|");
            System.out.println("_____________________________________________");
            System.out.println("_____________________________________________");
            System.out.println("|                                           |");
            System.out.print("                     ");
            choes3 = in.nextInt();
            System.out.println("|___________________________________________|");
            System.out.println("Enter The Nsme : ");
            String tname= in.next() ; 
            boolean cheek = false ;
            int i = 0 ; 
      if(choes3==1)
        {
           for(Students name : student )
           {
               if( name.getName().equals(tname) )
               {
                   System.out.println("Found  " + " ID : "+ i  );
                   cheek = true ; 
               }
               i++;
           }
           if(!cheek )
           {
               System.out.println("NOT Found " );
           }
        }
        else if(choes3==2)
        {
          for(Instructors name : instructors )
           {
               if( name.getName().equals(tname) )
               {
                   System.out.println("Found  " + " ID : "+ i  );
                   cheek = true ;
               }
               i++;
           }
           if(!cheek )
           {
               System.out.println("NOT Found " );
           }   
        }
        else if(choes3==3)
        {
          for( Workers name : workers )
           {
               if( name.getName().equals(tname) )
               {
                   System.out.println("Found  " + " ID : "+ i  );
                   cheek = true ;  
               }
               i++;     
           }
           if(!cheek )
           {
               System.out.println("NOT Found " );
           }   
        }
        else if(choes3==4)
        {
          for(Adminstrators name : adminstrators )
           {
              

               if( name.getName().equals(tname) )
               {
                   System.out.println("Found  " + " ID : "+ i  );
                   cheek = true ; 
                   
               }
               i++;
                      
           }
           if(!cheek )
           {
               System.out.println("NOT Found " );

           }   
        }
        else if(choes3==5)
        {
          for(Technicians name : technicans )
           {
              

               if( name.getName().equals(tname) )
               {
                   System.out.println("Found  " + " ID : "+ i  );
                   cheek = true ; 
                   
               }
               i++;
                      
           }
           if(!cheek )
           {
               System.out.println("NOT Found " );

           }   
        }
      }
      else if(chose1==3)
      {
          int choes3 ;
            System.out.println("______________________________________________");
            System.out.println("|                                            |");
            System.out.println("| Press 1 to Student                         |");
            System.out.println("| Press 2 to Instructor                      |");
            System.out.println("| Press 3 to worker                          |");
            System.out.println("| Press 4 to Aminstrtor                      |");
            System.out.println("| Press 5 to Ticnical                        |");
            System.out.println("| Press anyting else to back                 |");
            System.out.println("|____________________________________________|");
            System.out.println("_____________________________________________");
            System.out.println("_____________________________________________");
            System.out.println("|                                           |");
            System.out.print("                     ");
            choes3 = in.nextInt();
            System.out.println("|___________________________________________|");
            System.out.println("Entre ID to Delete");
            int x = in.nextInt();
            if(choes3==1)
            {
                if(x>=0 && x< student.size()){
                       student.remove(x); 
                       System.out.println("Delete Sucsesful");

                }
                else
                {
                    System.out.println("NOT Possibale");
               }
            }
            else if(choes3==2)
            {
                if(x>=0 && x< instructors.size())
                {
                       instructors.remove(x); 
                       System.out.println("Delete Sucsesful");
                }
                else
                {
                    System.out.println("NOT Possibale");
               }
            }
            else if(choes3==3)
            {
                if(x>=0 && x< workers.size())
                {
                       workers.remove(x); 
                       System.out.println("Delete Sucsesful");
                }
                else
                {
                    System.out.println("NOT Possibale");
               }
            }
            else if(choes3==4)
            {
                if(x>=0 && x< adminstrators.size()){
                       adminstrators.remove(x); 
                       System.out.println("Delete Sucsesful");
                }
                else
                {
                    System.out.println("NOT Possibale");
               }
            }
            else if(choes3==5)
            {
                if(x>=0 && x< technicans.size()){
                       technicans.remove(x); 
                       System.out.println("Delete Sucsesful");
                }
                else
                {
                    System.out.println("NOT Possibale");
               }
            }
      }
      else if(chose1==4)
      {
          int choes3 ;
            System.out.println("______________________________________________");
            System.out.println("|                                            |");
            System.out.println("| Press 1 to Student                         |");
            System.out.println("| Press 2 to Instructor                      |");
            System.out.println("| Press 3 to worker                          |");
            System.out.println("| Press 4 to Aminstrtor                      |");
            System.out.println("| Press 5 to Ticnical                        |");
            System.out.println("| Press anyting else to back                 |");
            System.out.println("|____________________________________________|");
            System.out.println("_____________________________________________");
            System.out.println("_____________________________________________");
            System.out.println("|                                           |");
            System.out.print("                     ");
            choes3 = in.nextInt();
            System.out.println("|___________________________________________|");
          System.out.println("Enter id: ");
          int y = in.nextInt();
          if(choes3==1)
          {
              if(y>=0 && y < student.size())
                  System.out.println(student.get(y));
              else
          {
              System.out.println("NOT Possibale");
          }
          }
          else if(choes3 == 2 )
          {
              if(y>=0 && y < instructors.size())
                  System.out.println(instructors.get(y));
              else
          {
              System.out.println("NOT Possibale");
          }
          }
          else if(choes3 == 3 )
          {
              if(y>=0 && y < workers.size())
                  System.out.println(workers.get(y));
              else
          {
              System.out.println("NOT Possibale");
          }
          }
          else if(choes3 == 4 )
          {
              if(y>=0 && y < adminstrators.size())
                  System.out.println(adminstrators.get(y));
              else
          {
              System.out.println("NOT Possibale");
          }
          }
          else if(choes3 == 5 )
          {
              if(y>=0 && y < technicans.size())
                  System.out.println(technicans.get(y));
              else
            {
              System.out.println("NOT Possibale");
            }
          }
      }
      else
      { 
          break;
      }
    }
    }
    private static void printStudents(ArrayList<Students> students) {
        if (students.isEmpty()) {
            System.out.println("No students, yet!");
            return;
        }
    }
}
