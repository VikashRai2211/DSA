// public class calc {
//     public static void main(String [] args) {
//         int a = 4;
//         int b = 5;
//         int sum = a+b;

//         System. out. println (sum);
        
//     }
// }


// public class calc {
//     public static void main (String [] args) {
//         int a = 6;
//         int b = 3;
//         int sub = a-b;
//         int multi = a*b;

//         System.out.println (sub);
//         System. out. println (multi);
//     }
// }



// calculate the value  a*b / a-b 

public class calc {
    public static void main (String [] args) {
        int a = 4;
        int b = 3;
        // int calc = a*b / a-b;  // this is wrong method calculate the value

        int calc = (a*b) / (a-b);  // calculate is right 
        System. out. println (calc);
    }
}