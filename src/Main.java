import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
     /*   Scanner sc=new Scanner(System.in);
        int san=sc.nextInt();
        int sch=0;
        while (san>0){
           int a=san%10;
           san/=10;
           int b=san%10;
           if(a==b){
               sch++;
           }
        }
        if(sch>0){
            System.out.println("Bar");
        }else {
            System.out.println("Jok");
        }*/

        /*    Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
       int b=1;
        while (a>b){
         int sum=a+b;
            System.out.println(sum);
            b++;
        }   */
      /*  int a,b,c,d;// арифметическое значение(3+9+6+12) /4=7/делим на количество переменных//
        a=3;
        b=9;
        c=6;
        d=12;
        System.out.println((a+b+c+d)/4);*/

     /*   Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        while (a < b) { //работай пока а меньше Б;
            a++;
            if (a % 2 != 0) { //если при делении на 2 остаток 0=то это четные числа.если не раавен!=0то нечетные
                System.out.println(a);
            }
            }*/
     /*   Scanner sc=new Scanner(System.in);

        int sun = sc.nextInt();
        int sum=0;
        int a=0;
        while (a<=sum){
            a++;
            int sum=a+a++;
            System.out.print(a+sum);
        }*/

     /*   Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b=0;
        while (a>0){
            int c=a%10;
            a=a/10;
            int d=a%10;
            if(c==d){
                System.out.println("Bar");
            }


            System.out.println("Jok");
        }   */

        /*   Scanner scan =new Scanner(System.in);//Факториал
       int san= scan.nextInt();
       int kob=1;
       for(int i=1;i<=san;i++){
           kob*=i;
           System.out.print(kob);
           if(i!=san){
               System.out.print("*");
           }
       }

        System.out.println("="+kob);*/

        Scanner scan=new Scanner(System.in);// summa
        int num= scan.nextInt();
        int res=0;
        for (int i = 1; i <=num ; i++) {
            if(i%2==0){
                res+=i;
                System.out.print(i);
                if(i!=num && i!=num-1);{
                    System.out.print("+");
                }
            }
        }

        System.out.println("="+res);












        }


    }
