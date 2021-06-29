package FlowControl;
public class Main {
    public static int task1(int value) {
        if (value<=0) {
            throw new IllegalArgumentException();
        }
        int rest = 0;
        int acc = value;
        int count = 0;
        while (acc!=0) {
            rest = acc%10;
            acc = acc/10;
            if (rest%2!=0) {
                count+=rest;
            }
        }
        return count;
    }

    public static int task2(int value) {
        if (value <=0){
            throw new IllegalArgumentException();
        }
        String s = Integer.toBinaryString(value);
        int a = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                a++;
            }
        }
        return a;
    }

    public static int task3(int value) {
        if (value<=0) {
            throw new IllegalArgumentException();
        }
        int n;
        int [] fib = new int [value+1];
        fib[0] = 0;
        fib [1] = 1;
        if (value==1) n=0;
        else {
            n=1;
        }

        for (int i=2;i<value;i++){
            fib[i]=fib[i-1]+fib[i-2];
            n=fib[i]+n;
        }

        return n;
    }
}
