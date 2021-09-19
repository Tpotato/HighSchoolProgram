package HW;

import java.util.Scanner;
import java.util.ArrayList;
public class testing {
    static int n;
    static int[][] arr = {{0,1,0,0,0},{0,1,0,1,0},{0,1,0,1,0},{0,1,0,1,0},{0,0,0,1,0}};
    static int[][] add_arr;
    static String[][] String_arr;
	static ArrayList<Integer> Path= new ArrayList<Integer>(); 

    public static void main(String[]args)
	{
		n = 5;
        add_arr = new int[n+1][n+1];
        String_arr=new String[n+1][n+1];
        initial();//create a n*n matrix
        initial_add();// track the cost of the route
        initial_String();// record the min cost of the route

        for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){   
                add_arr [i][j]+=Math.min(add_arr [i-1][j], add_arr [i][j-1]);
                if(add_arr [i-1][j]>add_arr [i][j-1]){
                    String_arr [i][j]=String_arr [i][j-1]+" "+Integer.toString(arr[i-1][j-1]);

                }else{
                    String_arr [i][j]=String_arr [i-1][j]+" "+Integer.toString(arr[i-1][j-1]);
                }  
            }
        }
        System.out.print("\nActual Cheapest Path:"+ String_arr[n][n]);
        System.out.println("\nsmallest value:"+ add_arr[n][n]);
	}

	public static void initial(){
		for(int i=0; i<=n-1; i++){
			for(int j=0; j<=n-1; j++){
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
    }
    
    public static void initial_add(){
        for(int a=0; a<=n;a++){
            add_arr [0][a]=500;
        }
        for(int a=0; a<=n;a++){
            add_arr [a][0]=500;
        }
        add_arr[1][0]=0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				add_arr [i][j]=arr [i-1][j-1];
			}
        }
    }

    public static void initial_String(){
        for(int i=0; i<=n; i++){
			for(int j=0; j<=n; j++){
				String_arr [i][j]="";
			}
        }
    }
}
