import java.util.*;
class ebookstall
{
   String book_name,book_author;
   int book_count;
   
   ebookstall(String name,String author,int count)
   {
       book_name=name;
       book_author=author;
       book_count=count;
   }
}

class customer
{
    
   String customer_id,customer_name,customer_address,customer_book;
   customer(String id,String name,String address,String book)
   {
      customer_id=id;
      customer_name=name;
      customer_address=address;
      customer_book=book;
   }
   /*void setcust(customer obj)
   {
     arr.add(obj);
   }*/
}



public class bookstall
{
   public static void main(String[] args)
   {
        ebookstall b1=new ebookstall("dbms","ragurama krishna",6);
        ebookstall b2=new ebookstall("os","pavan",8);
        ebookstall b3=new ebookstall("daa","pranav",10);
        ebookstall b4=new ebookstall("coa","revya ",7);
        ebookstall b5=new ebookstall("mefa","nagasai",5);
        String id,name,address,book;
        ArrayList<customer> arr=new ArrayList<>();
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter no. of customers:");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
          System.out.println("enter name of the customer"+i+":");
          name=s.next();
          System.out.println("enter id of the customer"+i+":");
          id=s.next();
          s.nextLine();
          System.out.println("enter address of the customer"+i+":");
          address=s.nextLine();
          System.out.println("enter name of the book you want"+i+":");
          book=s.next();
          customer c=new customer(id,name,address,book);
          arr.add(c);
        }
       ebookstall[] arr1={b1,b2,b3,b4,b5};
       for(customer i:arr)
       {
         int f=0;
         
          for(ebookstall j:arr1)
          {
             if(i.customer_book.equals(j.book_name))
             {
                j.book_count=j.book_count-1;
               System.out.println("Mr."+i.customer_name+", you can take this book:"+j.book_name+" and there are "+j.book_count+" books  remaining");
               f=1;
               break;
             }
   
          }
          if(f==0)
           System.out.println("Mr."+i.customer_name+", there is no book with name "+i.customer_book+" in this ebookstall"); 
          
       } 
   }
}

