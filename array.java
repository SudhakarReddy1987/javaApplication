import java.util.Scanner;
import java.util.ArrayList;
public class array{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<Integer>();
    while(true){
        System.out.println("Menu.....");
        System.out.println("1) array Add");
        System.out.println("2) Array add first");
        System.out.println("3) Display");
        System.out.println("choice:");
        int choice=sc.nextInt();
        if(choice==0){
            System.out.println("Thank You!");
            break;
        }
        else if(choice==1){
            System.out.println("add element");
            list.add(sc.nextInt());
            System.out.println("Succefully added one element");
        }
        else if(choice==2){
            // list.addFirst(sc.nextInt());
            System.out.println("Added at First");
            
        }
        else{
            System.out.println(list);

        }

    }
}
}
