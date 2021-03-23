import java.util.Scanner;

public class Change {
    private static int getChange(int mon) {
        //write your code here
        final int cop = 1;
        final int five = 5;
        final int tens = 10;

        int bufTens;
        int buffive=0;
        int bufEd=0;
        if(mon < five)return mon;

        else if(mon < tens) {
            buffive = mon / five;
            return (mon - five) + buffive;
        }
        bufTens = mon/tens;

        if(mon%10 == 0) return bufTens;
        else if((mon%10) < five) bufEd = mon % 10;
        else if((mon%10) < tens) {
            buffive = (mon % 10)/five;
            bufEd = (mon % 10) - five;
        }

        return bufTens + buffive + bufEd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

