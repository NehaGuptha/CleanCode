package Interest.SimpleCompoundInterests;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class client {
    public static void main(String[] args) {
        PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        deposit deposit = new deposit((double) 20000, 5, 6.8);
        Double simpleInterest = deposit.simpleInterest();
        Double compoundInterest = deposit.comPoundInterest();
        out.println("Simple Interest is: " + simpleInterest);
        out.println("Compound Interest is: " + compoundInterest);
    }
}
