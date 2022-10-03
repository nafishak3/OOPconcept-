package Basics;

public class Basics {
        public static void main(String[] args) { //psvm

            //data types -- int, double, boolean, String, char
            //string methods --
            //logics -- if-else
            //loops -- for, while, do while, for-each(collections)
            //array -- 1d, 2d


            //logics
            //Find out the largest number from 5,10,8
            int a = 5;
            int b = 8;
            int c = 10;

            if (a>b && a>c) {
                System.out.println("a is the largest");
            } else if (b>c) {
                System.out.println("b is the largest");
            }
            else {
                System.out.println("c is the largest");
            }

            //Find out the largest number from {5,10,15,8}

//        int[] num = new int[4];
//        num[0] = 5;
//        num[1] = 10;
//        num[2] = 15;
//        num[3] = 8;

            int[] nums = {5,10,3,18};
            //System.out.println(nums[0]);

            int hiNums = 0;

            System.out.println(nums.length); //4

            for (int i=0; i<nums.length; i++) { //i = 4
                if (nums[i] > hiNums) { //nums[3] = 18 >10 ?? yes??
                    hiNums = nums[i]; // hiNums = 18
                }
            }
            System.out.println(hiNums);

            //Find out if "java" contains in the text "I love java"

            String text = "I love java";
            String check = "Java";

            if (text.contains(check)) {
                System.out.println("Java is present");
            }
            else System.out.println("Java is not present");


            //2d array
            int[][] num = {{1,3,5,7}, {2,4,8}, {10,20,30}, {20,60,80}, {1,2,3}};
            // 1 3 5 7
            //num[0][0] = 1
            //num[0][1] = 3
            //num[0][2] = 5
            //num[0][3] =7

            System.out.println(num[0][2]);

            //Find out how many 'a' in the string "Bangladesh"
            //Find out if there is an 'a' in the string "Bangladesh"
        }
    }












