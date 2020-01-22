package com.VitVi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	List<Double> list=new ArrayList<Double>();
	Double x;
        Scanner scanner=new Scanner(System.in);
      System.out.print("x=");
      x=scanner.nextDouble();
      do{
          System.out.print("coefitient=");
          list.add(scanner.nextDouble());
          if(scanner.nextInt()==0)
              break;
      }while (true);

      String res="";
      Double result=0.0;
      for(int i=0;i<list.size();i++){
          res+="+"+list.get(i).toString()+"*"+x.toString()+"^"+(list.size()-1-i);
          result+=list.get(i)*Math.pow(x,list.size()-i-1);
      }

      res+="="+result.toString();
      System.out.println(res.substring(1));
    }
}
