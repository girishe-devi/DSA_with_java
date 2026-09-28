import java.util.Scanner;

class pat1{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        int n = 5;
        int i;
        int j;
        
        switch(option){

            case 1:  //square pattern
                for(i=1;i<=n;i++){
                    for(j=1;j<=n;j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;

            case 2:  //hollow square
                for(i=1;i<=n;i++){
                    for(j=1;j<=n;j++){
                        if(i==1 || i==n || j==1 || j==n){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.print("\n");
                }
                break;

            case 3:  //left-rigth straigth triangle
                for(i=1;i<=n;i++){
                    for(j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;

            case 4:  //left-rigth inverted triangle
                for(i=1;i<=n;i++){
                    for(j=n;j>=i;j--){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

                
        }

    }
}