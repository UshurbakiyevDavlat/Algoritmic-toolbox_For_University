import java.util.Scanner;

class FractionalKnapsack {

    static int maxInd(double[][]arr,int n){

        double max = 0;
        int max_i = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i][1]!=0 && arr[i][0]/arr[i][1] > max){
                max = arr[i][0] / arr[i][1];
                max_i = i;
            }
        }
        return max_i;
    }

    static double LootAcc(int n, int w, double[][]arr){

        double buf = 0.0;
        double bufw = 0.0;



        for(int i = 0 ; i < n; i++){
            if(w==0){
                return buf;
            }
            int ind = maxInd(arr,n);

            int a = (int) Math.min(w, arr[ind][1]);
            buf +=  a * arr[ind][0] / arr[ind][1];
            w -=a;
            arr[ind][1] -= a;

        } return buf;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();



        double [][] arr = new double[n][2];

        if(n==1) {
            for (int j = 0; j <2; j++) {
                arr[0][j] = sc.nextDouble();
            }
        }

        else {
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < 2; j++) {
                    arr[i][j] = sc.nextDouble();
                }

            }
        }
        System.out.println(LootAcc(n, w, arr));
    }
}
