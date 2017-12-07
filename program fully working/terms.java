import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.LineNumberReader;
public class terms{
            public static void SearchByTerm(int number, String[] array, String variable ){
            Scanner input = new Scanner(System.in);
            boolean found = true;
            if(number == 1){
                System.out.println("Term ..?");
                variable = input.next();
                variable = variable.toUpperCase();
                for(int x = 1; x < 21; x = x+2){
                    if(array[x].toString().equals(variable)){
                        System.out.println(array[x +1]);
                        found = false;
                    }
                }
                if(found == true){
                System.out.println("TERM NOT FOUND lel");
                }
            }
        }
        public static void SearchDescriptionsForKeyword(int number, String[] array, String variable ){
            Scanner input = new Scanner(System.in);
            boolean found = false;
            if(number == 2){
                    System.out.println("Key word ..? ");
                    variable = input.next();
                    variable = variable.toUpperCase();
                    for(int x = 2; x < 21; x= x+2){
                        if(array[x].toString().contains(variable)){
                            System.out.println("FOUND for " + array[x-1]);
                            System.out.println(array[x]);
                            found = true;
                        }
                    }
                    if(found == false){
                     System.out.println("NO DESCRIPTIONS FOUND containing this key word");
                    }
                }
            }
        public static void main(String[] args) throws IOException{
            Scanner input = new Scanner(System.in);
            
            FileReader fr = new FileReader(/* replace directory to the one in the terms*/);
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            int answer;
            String tempContent = "";
            boolean response = false;
            String term = "";
            do{
                System.out.println("1. Search for a term" + "\n" + "2. Search for a keyword in the descriptions" + "\n" + "3. End");
                System.out.println("Key in choice ");
                answer = input.nextInt();
                
                if(answer > -1 && answer < 4){
                response = true;
                }
            }while(response == false);
            do{      
               tempContent += "\n" + line.toUpperCase();   
            }while((line = br.readLine()) != null);
            String content[]= tempContent.split("\n");

            if(answer == 3){
                System.out.println("");
            }else if(answer == 1){
            SearchByTerm(1, content,term);
            }else if(answer == 2){
            SearchDescriptionsForKeyword(2, content,term);
            }
         }
}
