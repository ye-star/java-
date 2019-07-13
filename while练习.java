// 1000以内被5整除的数，且每行输出5个
public class while练习 {
    public static void main(String[] args){
        int i = 0;
        int count = 0;
        for(;i<=1000;i++){
            if(i%5==0){
                System.out.print(i+"\t");
                count++;
            }
            if(count % 5 == 0){
                System.out.println();
            }

        }

    }
}
