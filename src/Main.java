public class Main
{
    public static void main(String[] args)
    {

        // counting loop goes from 0 to 30 adding 1
        for(int counter = 0; counter <= 30; counter++)
        {
            System.out.println(counter);
        }

        // counting loop goes from 30 to 0 subtracting 1
        for(int counter = 30; counter >= 0; counter--)
        {
            System.out.println(counter);
        }

        // counting loop goes from 0 to 18 adding 3
        for(int counter = 0; counter <= 18; counter+=3)
        {
            System.out.println(counter);
        }

        // counting loop goes from 10 to 0 subtracting 2
        for(int counter = 10; counter >= 0; counter-=2)
        {
            System.out.println(counter);
        }

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