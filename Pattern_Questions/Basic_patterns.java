public class Basic_patterns {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Star Square:");

        for (int i = 1; i <= 5; i++) {
           for (int j = 1; j <= 5; j++) {
            System.out.print("*" + " ");
           }
           System.out.println(); 
        }

        System.out.println();
        System.out.println("Star triangle:");

        for (int i = 1; i <= 5; i++) {
           for (int j = 1; j <= i; j++) {
            System.out.print("*" + " ");
           }
           System.out.println(); 
        }
        System.out.println();
        System.out.println("Ulta Star triangle:");

        for (int i = 1; i <= 5; i++) {
           for (int j = i; j <= 5; j++) {
            System.out.print("*" + " ");
           }
           System.out.println(); 
        }

        System.out.println();
        System.out.println("Number triangle:");

        for (int i = 1; i <= 5; i++) {
           for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
           }
           System.out.println(); 
        }

        System.out.println();
        System.out.println("Star half Diamond:");

        for (int i = 1; i <= 9; i++) {
            int col = ((i<=5) ? i : 9-i+1);
           for (int j = 1; j <= col; j++) {
            System.out.print("*" + " ");
           } 
           System.out.println();
        }

        System.out.println();
        System.out.println("Right aligned star triangle:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
           for (int j = 1; j <= i; j++) {
            System.out.print("*");
           }
           System.out.println(); 
        }

        System.out.println();
        System.out.println("Ulta Right aligned star triangle:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
           for (int j = i; j <= 5; j++) {
            System.out.print("*");
           }
           System.out.println(); 
        }

        System.out.println();
        System.out.println("Half Star pyramid:");

        for (int i = 1; i <= 5; i++) {
           for (int j = 1; j <= 5-i; j++) {
            System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
            System.out.print("*");
           }
           for (int j = 2; j <= i; j++) {
            System.out.print("*");
           }
           System.out.println();
        }

        System.out.println();
        System.out.println("Ulta Half Star pyramid:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5-i+1; j++) {
                System.out.print("*");
            }for (int j = 1; j <= 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Right angled start triangle with space:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
           for (int j = 1; j <= i; j++) {
            System.out.print("*" + " ");
           }
           System.out.println(); 
        }

        System.out.println();
        System.out.println("Ulta Right aligned star triangle with space:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
           for (int j = i; j <= 5; j++) {
            System.out.print("*" + " ");
           }
           System.out.println(); 
        }

        System.out.println();
        System.out.println("Damru with space:");

        for (int i = 1; i <= 10; i++) {
           int space = ((i<=5) ? i-1 : 10-i); 
           for (int j = 1; j <= space; j++) {
            System.out.print(" ");
           }
           int star = ((i<=5) ? 5-i+1 : i-5);
           for (int j = 1; j <= star; j++) {
            System.out.print("*" + " ");
           }
           System.out.println();
        }
    }
}
