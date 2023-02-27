/* Задача 1:
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

 import java.util.*;

 public class task1_5 {
     public static void main(String[] args) {
         Map<String, List<String>> phonBook = new HashMap<>();
         phonBook.put("Lena", List.of("123", "987"));
         phonBook.put("Ira", List.of("124", "986"));
         phonBook.put("Igor", List.of("125", "985"));
         phonBook.put("Petr", List.of("126", "984"));
         phonBook.put("Dima", List.of("127", "983"));
 
         menu(phonBook);
     }
 
     public static String scanner() {
         Scanner scanner = new Scanner(System.in);
         String scan = scanner.nextLine();
         return scan;
     }
 
     public static void find(Map<String, List<String>> phonBook) {
         System.out.print("Введите имя: ");
         String name = scanner();
         System.out.println(phonBook.get(name));
         System.out.print("Для продолжения, введите команду из списка: ");
     }
 
     public static void allBook(Map<String, List<String>> phonBook) {
         System.out.println(phonBook);
 
     }
 
     public static Map<String, List<String>> add(Map<String, List<String>> phonBook) {
         System.out.println("Для прекращения ввода номера введите 'stop'");
         System.out.print("Введите имя: ");
         String name = scanner();
         List<String> number = new ArrayList<>();
         while (true) {
             System.out.print("Введите номер: ");
             String phon = scanner();
             if (phon.equals("stop")) {
                 break;
             } else {
                 number.add(phon);
             }
         }
         phonBook.put(name, number);
         System.out.println("Для продолжения, введите команду из списка: ");
         return phonBook;
     }
 
     public static Map<String, List<String>> menu(Map<String, List<String>> phonBook) {
         System.out.println("Выберите команду из списка: \nHайти контакт - 1 \nДобавить контакт - 2 \nПоказать всю телефонную книгу - 3 \nВыйти - 0");
         System.out.print("Введите выбраную команду: ");
         while (true) {
             String comands = scanner();
             if (comands.equals("0")) {
                 break;
             } else {
                 switch (comands) {
                     case "1":
                         find(phonBook);
                         break;
                     case "2":
                         add(phonBook);
                         break;
                     case "3":
                         allBook(phonBook);
                         break;
                     default:
                         break;
                 }
             }
         }
         return phonBook;
     }
 }