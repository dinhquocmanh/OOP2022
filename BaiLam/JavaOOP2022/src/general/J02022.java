
package general;
import java.util.*;

public class J02022 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int start=(int) Math.pow(10, n-1);
            for(int i=start;i<start*10;i++){
                if (isXaCach(i,n)) System.out.println(i);
            }
        }
    }
    
    public static boolean isXaCach(int k, int N){
        int temp = k;
        // kiem tra so 0
        while(temp>0){
            int d=temp%10;
            temp/=10;
            if (d==0) return false;
        }
        // kiem tra xuat hien 1 lan
        int[] a = new int[10];
        temp = k;
        while(temp>0){
            int d=temp%10;
            temp/=10;
            a[d] ++;
            if (a[d]>1) return false;
        }
        for(int i=1;i<=N;i++){
            if(a[i]==0) return false;
        }
        // 2 so lien tiep ko co hieu bang 1
        temp=k; 
        int last=k%10;
        int next;
        while(temp>0){
            next=temp%10;
            if (next-last==1 || last-next==1){
                return false;
            }
            last=next;
            temp/=10;
        }
        
        return true;
    }
}
