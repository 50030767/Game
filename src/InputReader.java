import java.util.Scanner;

import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader()
    {
        this.scanner = new Scanner(System.in);
    }

    public String getInput()
    {
        return this.scanner.nextLine();
    }
}
