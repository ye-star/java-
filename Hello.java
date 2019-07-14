import java.util.Scanner;
    public class Hello{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            final int SIZE = 3;
            int zero=0;
            int one=0;
            int[][] biao = new int[SIZE][SIZE];
            for(int i=0;i<3;i++){    //初始化 井字棋盘
                for(int j =0;j<3;j++){
                    biao[i][j] = in.nextInt();
                }
            }
            // 检查行
            for(int i=0;i<biao.length;i++){
                for (int j =0;j<3;j++){
                    if(biao[i][j] == 0){
                        zero++;
                    }
                    if(biao[i][j] == 1){
                        one++;
                    }
                }
                if(zero == 3){
                    System.out.println("0方获胜");
                    break;
                }
                if(one == 3 ){
                    System.out.println("1方获胜");
                    break;
                }
                if(one!=3 && zero!=3){
                    one = 0;
                    zero =0;
                }
            }
            // 检查列
            for(int i=0;i<biao.length;i++){
                for (int j =0;j<3;j++){
                    if(biao[j][i] == 0){
                        zero++;
                    }
                    if(biao[j][i] == 1){
                        one++;
                    }
                }
                if(zero == 3){
                    System.out.println("0方获胜");
                    break;
                }
                if(one == 3 ){
                    System.out.println("1方获胜");
                    break;
                }
                if(one!=3 && zero!=3){
                    one = 0;
                    zero =0;
                }
            }
            // 检查对角线
            for(int i =0;i<3;i++){
                if(biao[i][i] == 0){
                    zero++;
                }
                if(biao[i][i] == 1){
                    one++;
                }
            }
            if(zero == 3){
                System.out.println("0方获胜");

            }
            if(one == 3 ){
                System.out.println("1方获胜");

            }
            if(one!=3 && zero!=3){
                one = 0;
                zero =0;
            }
            //检查副对角线
            for(int i =2 ;i>=0;i--) {
                if (biao[i][2 - i] == 0) {
                    zero++;
                }
                if (biao[i][2 - i] == 1) {
                    one++;
                }
            }
                if (zero == 3) {
                    System.out.println("0方获胜");

                }
                if (one == 3) {
                    System.out.println("1方获胜");

                }
                if (one != 3 && zero != 3) {
                    one = 0;
                    zero = 0;
                }

            }
            }




