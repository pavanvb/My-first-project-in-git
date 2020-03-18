import java.util.*;
public  class Main
{
    public static void main(String args[]) {

        Student st[] = new Student[10];
        int strtnum,i,n,j=0;
        String city, capital, state,country;
        Scanner s=new Scanner(System.in);
         College c[] = new College[10];
        Address a[] = new Address[40];
        Employee e[]=new Employee[10];
        System.out.println("Enter  n:");
        n=s.nextInt();
        System.out.println("Enter the student usn,name,and address(streetnum,city,state,country)");
        for (i = 0; i < n; i++) {
            String usn,nm;
            System.out.println((i+1)+"student");
            usn=s.next();
            nm=s.next();
            strtnum=s.nextInt();
            city=s.next();
            state=s.next();
            country=s.next();

            a[j++] = new Address(strtnum,city,state,country);
            st[i] = new Student(usn,nm, a[j]);

        }
        System.out.println("Enter the college name and address(streetnum,city,state,country)");
        for (i = 0; i < n; i++) {
            String cnm;
            System.out.println((i+1)+"College");

            cnm=s.next();
            strtnum=s.nextInt();
            city=s.next();
            state=s.next();
            country=s.next();

            a[j++] = new Address(strtnum,city,state,country);
           c[i] = new College(cnm, a[j]);

        }
        System.out.println("Enter the employee id,nameand address(streetnum,city,state,country)");
        for (i = 0; i < n; i++) {
            String id,nm;
            System.out.println((i+1)+"employee");
            id=s.next();
            nm=s.next();
            strtnum=s.nextInt();
            city=s.next();
            state=s.next();
            country=s.next();

            a[j++] = new Address(strtnum,city,state,country);
            e[i] = new Employee(id,nm, a[j]);

        }


         String temp="0";
            for(i=0;i<3*n;i++) {
               if(i>2*n) {
                  temp = "Employee";
               } else if(i>=n) {
                   temp = "College";
               } else {
                   temp = "Student";
                }




                    System.out.println(temp+" "+(i%2)+" "+a[i].Streetnum+" "+a[i].city+" "+a[i].state+" "+a[i].country);

            }
    }
}

