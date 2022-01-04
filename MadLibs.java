import java.util.Scanner; 

public class MadLibs 

{
    public static void main(String[] args)
   {

    String madLib = "hello, <noun>, it's nice to see you in the <adjective> area, how have you been since the last time we seen eachother. I've been <verb> around ";

    Scanner sc = new Scanner(System.in);

   
    //this are the word that are being add to the madlib
    int nounLocation = madLib.indexOf("<noun>");
    int adjectiveLocation = madLib.indexOf("<adjective>");
    int verbLocation = madLib.indexOf("<verb>");

    System.out.println("Give me a noun");
    String noun = sc.nextLine();
    System.out.println("give me an adjective");
    String adjective = sc.nextLine();
    System.out.println("give me an verb");
    String verb = sc.nextLine();
   

    String completedMadLib = madLib.substring(0, nounLocation) + noun;
    completedMadLib += (madLib.substring(nounLocation+"<noun>".length(),adjectiveLocation));
    completedMadLib += adjective;
    completedMadLib += (madLib.substring(adjectiveLocation+"<adjective>".length(),verbLocation));
    completedMadLib += verb;
    completedMadLib += madLib.substring(verbLocation+"<verb>".length());

    System.out.print(completedMadLib);
    
   // System.out.println("give me a noun ");


     //String Noun_Word,Adj_Word,Verb_Word;

    //Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    //System.out.println("Enter username");

   // String userName = myObj.nextLine();  // Read user input
    //System.out.println("Username is: " + userName);  

   } 
}
