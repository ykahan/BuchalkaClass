package InterfacesAndInnerAndAbstractClasses.InnerClasses;

import java.util.Scanner;

public class Main4Button {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {
            // local class, defined within a method

            public ClickListener(){
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String str) {
                System.out.println(str + " is clicked, fella");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen(){
        boolean continuing = true;
        while(continuing){
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 0:
                    continuing = false;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
