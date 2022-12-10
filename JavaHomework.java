import java.util.Scanner;  

class JavaHomework{
  public static void main(String[] args){
   
/*
Մուտքագրել չորս փոփոխականներ, տպել նվազագույնի արժեքը, եթե չորս փոփոխականների գումարը հավասար է զրոյի։
*/

   Scanner scan = new Scanner(System.in);
   int countOfInputs = 4;
   int[] arrayOfInputs = new int[countOfInputs];
   System.out.println("Enter 4 numbers: ");
   for (int i = 0; i < countOfInputs; i++){ 
      arrayOfInputs[i] = scan.nextInt();
   }
   int sum = 0;
   for (int i : arrayOfInputs){
      sum += i;
   }
   System.out.println("Sum is: " + sum);

   int min = arrayOfInputs[0];
   if (sum == 0){
     for (int value : arrayOfInputs){
        if (value < min){
          min = value;
       }
     }   
     System.out.printf("Mininum is: %d.\n", min);
   }


/*
Մուտքագրել օգտագործողի անունն ու տարիքը։ Տպել էկրանին ողջույնի հաղորդագրություն։
*/

   System.out.println("Enter your Name: ");
   String name = scan.next();
   System.out.println("Enter your Age: ");
   int age = scan.nextInt();
   System.out.printf("Hello, %s. Your age is: %d.\n", name, age);


/*
Մուտքագրել օգտագործողի անունը, փոխակերպել անունը մեծատառերի, եթե անունը մուտքագրված է փոքրատառերով։
*/

   System.out.println("Enter your Name: ");
   String userName = scan.next();
   System.out.println(userName.toUpperCase());


//Մուտքագրել տող, տպել տողը էկրանին հակառակ կարգով։


   System.out.println("Enter a string: ");  
   scan.nextLine();
   String inputString = scan.nextLine();
   char[] inputChar = inputString.toCharArray();
   for (int i = inputChar.length-1; i >= 0; i--){
      System.out.print(inputChar[i]);
   }  System.out.println();


//Տպել 0-100 թվերը ըստ աճման (օգտագործելով ցիկլ):


   for (int i = 0; i <= 100; ++i){
      System.out.print(i + " ");
   }
   System.out.println();
   for (int i = 0; i < 101; i++){
      System.out.print(i + " ");
   }
   System.out.println();
  


//Տպել 100-0 թվերը ըստ նվազման։

   
   for (int i = 100; i >= 0; --i){
      System.out.print(i + " ");
   }
   System.out.println();
   for (int i = 100; i >= 0; i--){
      System.out.print(i + " ");
   }
   System.out.println();



//Տպել 0-100 միջակայքի միայն զույգ թվերը։


   for (int i = 2; i < 100; i+=2){
      System.out.print(i + " ");
   }
   System.out.println();



//Տպել 0-100 միջակայքի միայն կենտ թվերը։


   for (int i = 1; i < 100; i+=2){
      System.out.print(i + " ");
   }
   System.out.println();



/*
Հայտարարել բուլյան փոփոխականներ տարբեր արժեքներով։ Տպել էկրանին AND եւ OR գործողությունների արդյունքները։
*/

   boolean yes = true;
   boolean no = false;
   boolean yesAndNo = yes & no;
   boolean yesAndYes = yes & yes;
   boolean noAndNo = no & no;
   boolean yesOrNo = yes | no;
   boolean yesOrYes = yes | yes;
   boolean noOrNo = no | no;
   System.out.printf("yes & no = %b, yes & yes =  %b, no & no = %b, yes | no = %b, yes | yes = %b, no | no = %b\n", yesAndNo, yesAndYes, noAndNo, yesOrNo, yesOrYes, noOrNo);


/*
Հայտարարել եւ մուտքագրել երկու փոփոխականներ։ Փոխել փոփոխականների արժեքները տեղերով եւ տպել էկրանին։
*/

   System.out.println("Type anything: ");
   String anything = scan.nextLine();
   System.out.println("Type anything else: ");
   String anythingElse = scan.nextLine();
   System.out.println(anythingElse + " " + anything);


/*
Մուտքագրել թիվ, ստուգել արդյոք թիվը զույգ է, թե ոչ։ Տպել էկրանին ստուգման արդյունքը։
*/

   System.out.println("Enter a number: ");
   int inputNumber = scan.nextInt();
   if (inputNumber%2 == 0){
     System.out.println(inputNumber%2);   
   }else {
   System.out.println("Odd");
   }


/*
Մուտքագրել թիվ։ Եթե թիվը զույգ է, տպել 0-100 թվերն ըստ աճման, հակառակ դեպքում՝ ըստ նվազման։
*/
   
   System.out.println("Enter a number: ");
   int inputNum = scan.nextInt();
   System.out.println();
   if (inputNum%2 == 0){
     for (int i = 0; i <= 100; ++i){
        System.out.print(i + " ");
     }  System.out.println();
   }else {
     for (int i = 100; i >= 0; i--){
     System.out.print(i + " ");
     } System.out.println();
   }


/*
Մուտքագրել num փոփոխականը որպես int եւ օգտագործողի անունը։ Տպել անունը էկրանին num անգամ։
*/

   System.out.println("Enter your name: ");
   String usersName = scan.next();
   System.out.println("Enter a number: ");
   int userNumber = scan.nextInt();
   for (int i = 0; i < userNumber; i++){
      System.out.println(usersName);
   }



//Տպել 0-100 թվերի քառակուսիների արժեքները էկրանին։


   for (int i = 0; i <= 100; i++){
      System.out.print(i*i + " ");
   }
   System.out.println();


   scan.close();


 }
}
