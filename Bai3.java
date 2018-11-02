package demo;
import java.util.Scanner;

public class Demos {
	public static void tramnghin(int x)
	{
	    switch(x){
	        case 1:
	        	 System.out.printf("Mot Tram");
	            break;
	        case 2:
	        	 System.out.printf("Hai Tram");
	            break;
	        case 3:
	        	 System.out.printf("Ba Tram");
	            break;
	        case 4:
	        	 System.out.printf("Bon Tram");
	            break;
	        case 5:
	        	 System.out.printf("Nam Tram");
	            break;
	        case 6:
	        	 System.out.printf("Sau Tram");
	            break;
	        case 7:
	        	 System.out.printf("Bay Tram");
	            break;
	        case 8:
	        	 System.out.printf("Tam Tram");
	            break;
	        case 9:
	        	 System.out.printf("Chin Tram");
	            break;
	    }
	}


	public static void chucnghin(int x)
	{
	    switch(x){
	        case 1:
	        	System.out.printf("Muoi");
	            break;
	        case 2:
	        	System.out.printf("Hai Muoi");
	            break;
	        case 3:
	        	System.out.printf("Ba Muoi");
	            break;
	        case 4:
	        	System.out.printf("Bon Muoi");
	            break;
	        case 5:
	        	System.out.printf("Nam Muoi");
	            break;
	        case 6:
	        	System.out.printf("Sau Muoi");
	            break;
	        case 7:
	        	System.out.printf("Bay Muoi");
	            break;
	        case 8:
	        	System.out.printf("Tam Muoi");
	            break;
	        case 9:
	        	System.out.printf("Chin Muoi");
	            break;
	        case 0:
	        	System.out.printf("Linh");
	            break;
	    }
	}


	public static void nghin(int x)
	{
	    switch(x){
	        case 1:
	        	System.out.printf("Mot Nghin");
	            break;
	        case 2:
	        	System.out.printf("Hai Nghin");
	            break;
	        case 3:
	        	System.out.printf("Ba Nghin");
	            break;
	        case 4:
	        	System.out.printf("Bon Nghin");
	            break;
	        case 5:
	        	System.out.printf("Nam Nghin");
	            break;
	        case 6:
	        	System.out.printf("Sau Nghin");
	            break;
	        case 7:
	        	System.out.printf("Bay Nghin");
	            break;
	        case 8:
	        	System.out.printf("Tam Nghin");
	            break;
	        case 9:
	        	System.out.printf("Chin Nghin");
	            break;
	    }
	}


	public static void tram(int x)
	{
	    switch(x){
	        case 0:
	        	System.out.printf("Khong Tram");
	            break;
	        case 1:
	        	System.out.printf("Mot Tram");
	            break;
	        case 2:
	        	System.out.printf("Hai Tram");
	            break;
	        case 3:
	        	System.out.printf("Ba Tram");
	            break;
	        case 4:
	        	System.out.printf("Bon Tram");
	            break;
	        case 5:
	        	System.out.printf("Nam Tram");
	            break;
	        case 6:
	        	System.out.printf("Sau Tram");
	            break;
	        case 7:
	        	System.out.printf("Bay Tram");
	            break;
	        case 8:
	        	System.out.printf("Tam Tram");
	            break;
	        case 9:
	        	System.out.printf("Chin Tram");
	            break;
	    }
	}


	public static void chuc(int x)
	{
	    switch(x){
	        case 0:
	        	System.out.printf("Le");
	            break;
	        case 1:
	        	System.out.printf("Muoi");
	            break;
	        case 2:
	        	System.out.printf("Hai Muoi");
	            break;
	        case 3:
	        	System.out.printf("Ba Muoi");
	            break;
	        case 4:
	        	System.out.printf("Bon Muoi");
	            break;
	        case 5:
	        	System.out.printf("Nam Muoi");
	            break;
	        case 6:
	        	System.out.printf("Sau Muoi");
	            break;
	        case 7:
	        	System.out.printf("Bay Muoi");
	            break;
	        case 8:
	        	System.out.printf("Tam Muoi");
	            break;
	        case 9:
	        	System.out.printf("Chin Muoi");
	            break;
	    }
	}


	public static void donvi(int x)
	{
	    switch(x){
	        case 0:
	        	 System.out.printf(" ");
	            break;
	        case 1:
	        	 System.out.printf("Mot");
	            break;
	        case 2:
	        	 System.out.printf("Hai");
	            break;
	        case 3:
	        	 System.out.printf("Ba");
	            break;
	        case 4:
	        	 System.out.printf("Tu");
	            break;
	        case 5:
	        	 System.out.printf("Nam");
	            break;
	        case 6:
	        	 System.out.printf("Sau");
	            break;
	        case 7:
	        	 System.out.printf("Bay");
	            break;
	        case 8:
	        	 System.out.printf("Tam");
	            break;
	        case 9:
	        	 System.out.printf("Chin");
	            break;
	    }
	}


	public static void main(String[] args) {
	
	
	    int x;
	    
	    System.out.printf("\nNhap vao so tu 0 -> 9999 :");
	    Scanner sc= new Scanner (System.in);
	    x = sc.nextInt();
	    int ng=(x/1000)%10;
	    int t=(x/100)%10;
	    int c=(x/10)%10;
	    int dv=x%10;
	    if (x<99&& dv!=4) {
	    	 chuc(c);        System.out.printf(" ");
			 donvi(dv);      System.out.printf(" ");
	    }
	    if (x<999 && x>99 && dv!=5&&c!=0) {
	    	 tram(t);        System.out.printf(" ");
	    	 chuc(c);        System.out.printf(" ");
			 donvi(dv);      System.out.printf(" ");
	    }
	    
	    if (x<=9999&&x>999) {
	    nghin(ng);      System.out.printf(" ");
	    tram(t);        System.out.printf(" ");
	    chuc(c);        System.out.printf(" ");
	    donvi(dv);      System.out.printf(" ");
	    }
	    if (x<99&&x>9&&c<=9 && c>=1 && dv==4) {
	    	 chuc(c);        System.out.printf(" ");
			 System.out.printf("Bon");
	    }
	    if (x<999 && x>99 &&c<=9&&c>=0&&c==0&& dv==4) {
	    	 tram(t);        System.out.printf(" ");
	    	 chuc(c);        System.out.printf(" ");
			System.out.printf("Bon");
	    }
	    if (x<999 && x>99 && dv==5) {
	    	 tram(t);        System.out.printf(" ");
	    	 chuc(c);        System.out.printf(" ");
			System.out.printf("Lam");
	    }
	    if (x<999 && x>99 && dv!=5&&dv!=4&&c==0&&dv==0) {
	    	 tram(t);        System.out.printf(" ");
	        
			
	    }
	    sc.close();

	
      }
}


	

	
	
	

		

	
	