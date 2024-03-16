import java.util.*;

class GameWithShapes{
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int l = in.nextInt();
  int r = in.nextInt();
  
  int s = l*l;
  int c = (22/7)*r*r;
  
  if(s>=c)
   System.out.println("Circle can be inside a Square");
  else
   System.out.println("Circle cannot be inside a Square");
 } 
}

/* Hello world */