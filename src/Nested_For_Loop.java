public class Nested_For_Loop
{
    public static void main(String[] args)
    {

        // creates 5 rows of 5 stars
        for(int row = 1; row <= 5; row++)
        {
            System.out.print("*");

            for(int col = 1; col <= 5; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        // creates 5 rows of stars decreasing from 5 stars in the first row to 1 star in the last row
        for(int row = 1; row <= 1; row++)
        {
            System.out.print("*");

            for(int col = 1; col <= 5; col++)
            {
                System.out.print("*");
            }
            System.out.println();

            for(int row2 = 1; row2 <= 1; row2++) {
                System.out.print("*");

                for (int col = 1; col <= 4; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int row2 = 1; row2 <= 1; row2++) {
                System.out.print("*");

                for (int col = 1; col <= 3; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int row2 = 1; row2 <= 1; row2++) {
                System.out.print("*");

                for (int col = 1; col <= 2; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int row2 = 1; row2 <= 1; row2++) {
                System.out.print("*");

                for (int col = 1; col <= 1; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int row2 = 1; row2 <= 1; row2++) {
                System.out.print("*");

                for (int col = 1; col <= 0; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        // does the same as previous but in reverse
        for(int row = 1; row <= 1; row++)
        {
            System.out.print("*");

            for(int col = 1; col <= 0; col++)
            {
                System.out.print("*");
            }
            System.out.println();

            for(int row2 = 1; row2 <= 1; row2++) {
                System.out.print("*");

                for (int col = 1; col <= 1; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int row2 = 1; row2 <= 1; row2++) {
                System.out.print("*");

                for (int col = 1; col <= 2; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int row2 = 1; row2 <= 1; row2++) {
                System.out.print("*");

                for (int col = 1; col <= 3; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int row2 = 1; row2 <= 1; row2++) {
                System.out.print("*");

                for (int col = 1; col <= 4; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int row2 = 1; row2 <= 1; row2++) {
                System.out.print("*");

                for (int col = 1; col <= 5; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


}
