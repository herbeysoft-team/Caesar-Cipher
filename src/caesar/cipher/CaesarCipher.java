
package caesar.cipher;

/**
 *
 * @author HerbeySoft
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.HashMap;
import java.util.Scanner; // Import the Scanner class to read text files


public class CaesarCipher {
    
//function to encrypt plain text in English / French Alphabet
    public static StringBuffer encryptEnglish(String plainText, int shift){
      HashMap english = new HashMap<>();
      HashMap english1 = new HashMap<>();
      english.put(0,"a");
      english.put(1,"b");
      english.put(2,"c");
      english.put(3,"d");
      english.put(4,"e");
      english.put(5,"f");
      english.put(6,"g");
      english.put(7,"h");
      english.put(8,"i");
      english.put(9,"j");
      english.put(10,"k");
      english.put(11,"l");
      english.put(12,"m");
      english.put(13,"n");
      english.put(14,"o");
      english.put(15,"p");
      english.put(16,"q");
      english.put(17,"r");
      english.put(18,"s");
      english.put(19,"t");
      english.put(20,"u");
      english.put(21,"v");
      english.put(22,"w");
      english.put(23,"x");
      english.put(24,"y");
      english.put(25,"z");
      english1.put('a', 0);
      english1.put('b', 1);
      english1.put('c', 2);
      english1.put('d', 3);
      english1.put('e', 4);
      english1.put('f', 5);
      english1.put('g', 6);
      english1.put('h', 7);
      english1.put('i', 8);
      english1.put('j', 9);
      english1.put('k', 10);
      english1.put('l', 11);
      english1.put('m', 12);
      english1.put('n', 13);
      english1.put('o', 14);
      english1.put('p', 15);
      english1.put('q', 16);
      english1.put('r', 17);
      english1.put('s', 18);
      english1.put('t', 19);
      english1.put('u', 20);
      english1.put('v', 21);
      english1.put('w', 22);
      english1.put('x', 23);
      english1.put('y', 24);
      english1.put('z', 25);
      StringBuffer result = new StringBuffer();
      for(int i = 0; i<plainText.length(); i++){
          
          if((english1.get(plainText.toLowerCase().charAt(i))) == null){
              result.append(" ");
          }
          else{
              int numKey = ((int)(english1.get(plainText.toLowerCase().charAt(i))) + shift) % 26;
              
              String cipherText = (String) english.get(numKey);
              
              result.append(cipherText.toUpperCase());
          }
         
      }
      return result;
    
    }
    
    //function to decrypt cipher text in English / French Alphabet
    public static StringBuffer decryptEnglish(String cipherText, int shift){
      HashMap english = new HashMap<>();
      HashMap english1 = new HashMap<>();
      english.put(0,"a");
      english.put(1,"b");
      english.put(2,"c");
      english.put(3,"d");
      english.put(4,"e");
      english.put(5,"f");
      english.put(6,"g");
      english.put(7,"h");
      english.put(8,"i");
      english.put(9,"j");
      english.put(10,"k");
      english.put(11,"l");
      english.put(12,"m");
      english.put(13,"n");
      english.put(14,"o");
      english.put(15,"p");
      english.put(16,"q");
      english.put(17,"r");
      english.put(18,"s");
      english.put(19,"t");
      english.put(20,"u");
      english.put(21,"v");
      english.put(22,"w");
      english.put(23,"x");
      english.put(24,"y");
      english.put(25,"z");
      english1.put('a', 0);
      english1.put('b', 1);
      english1.put('c', 2);
      english1.put('d', 3);
      english1.put('e', 4);
      english1.put('f', 5);
      english1.put('g', 6);
      english1.put('h', 7);
      english1.put('i', 8);
      english1.put('j', 9);
      english1.put('k', 10);
      english1.put('l', 11);
      english1.put('m', 12);
      english1.put('n', 13);
      english1.put('o', 14);
      english1.put('p', 15);
      english1.put('q', 16);
      english1.put('r', 17);
      english1.put('s', 18);
      english1.put('t', 19);
      english1.put('u', 20);
      english1.put('v', 21);
      english1.put('w', 22);
      english1.put('x', 23);
      english1.put('y', 24);
      english1.put('z', 25);
      StringBuffer result = new StringBuffer();
      for(int i = 0; i<cipherText.length(); i++){
          String plainText;
          if((english1.get(cipherText.toLowerCase().charAt(i))) == null){
              result.append(" ");
          }
          else{
              int numKey = ((int)(english1.get(cipherText.toLowerCase().charAt(i))) - shift) % 26;
              if(numKey > 0){
                  //System.out.println(numKey);
                  plainText = (String) english.get(numKey);
              }else{
                  numKey = numKey + 26;
                  //System.out.println(numKey);
                  plainText = (String) english.get(numKey);
              }
             
              
              
              result.append(plainText);
          }
         
      }
      return result;
    
    }
    
    
    //function to encrypt plain text in Spanish Alphabet
    public static StringBuffer encryptSpainish(String plainText, int shift){
      HashMap spanish= new HashMap<>();
      HashMap spanish1 = new HashMap<>();
      spanish.put(0,"a");
      spanish.put(1,"b");
      spanish.put(2,"c");
      spanish.put(3,"d");
      spanish.put(4,"e");
      spanish.put(5,"f");
      spanish.put(6,"g");
      spanish.put(7,"h");
      spanish.put(8,"i");
      spanish.put(9,"j");
      spanish.put(10,"k");
      spanish.put(11,"l");
      spanish.put(12,"m");
      spanish.put(13,"n");
      spanish.put(14,"ñ");
      spanish.put(15,"o");
      spanish.put(16,"p");
      spanish.put(17,"q");
      spanish.put(18,"r");
      spanish.put(19,"s");
      spanish.put(20,"t");
      spanish.put(21,"u");
      spanish.put(22,"v");
      spanish.put(23,"w");
      spanish.put(24,"x");
      spanish.put(25,"y");
      spanish.put(26,"z");
      spanish1.put('a', 0);
      spanish1.put('b', 1);
      spanish1.put('c', 2);
      spanish1.put('d', 3);
      spanish1.put('e', 4);
      spanish1.put('f', 5);
      spanish1.put('g', 6);
      spanish1.put('h', 7);
      spanish1.put('i', 8);
      spanish1.put('j', 9);
      spanish1.put('k', 10);
      spanish1.put('l', 11);
      spanish1.put('m', 12);
      spanish1.put('n', 13);
      spanish1.put('ñ', 14);
      spanish1.put('o', 15);
      spanish1.put('p', 16);
      spanish1.put('q', 17);
      spanish1.put('r', 18);
      spanish1.put('s', 19);
      spanish1.put('t', 20);
      spanish1.put('u', 21);
      spanish1.put('v', 22);
      spanish1.put('w', 23);
      spanish1.put('x', 24);
      spanish1.put('y', 25);
      spanish1.put('z', 26);
      StringBuffer result = new StringBuffer();
      for(int i = 0; i<plainText.length(); i++){
          
          if((spanish1.get(plainText.toLowerCase().charAt(i))) == null){
              result.append(" ");
          }
          else{
              int numKey = ((int)(spanish1.get(plainText.toLowerCase().charAt(i))) + shift) % 26;
              
              String cipherText = (String) spanish.get(numKey);
              
              result.append(cipherText.toUpperCase());
          }
         
      }
      return result;
    
    }
    
    //function to decrypt cipher text in Spanish Alphabet
    public static StringBuffer decryptSpainish(String cipherText, int shift){
      HashMap spanish= new HashMap<>();
      HashMap spanish1 = new HashMap<>();
      spanish.put(0,"a");
      spanish.put(1,"b");
      spanish.put(2,"c");
      spanish.put(3,"d");
      spanish.put(4,"e");
      spanish.put(5,"f");
      spanish.put(6,"g");
      spanish.put(7,"h");
      spanish.put(8,"i");
      spanish.put(9,"j");
      spanish.put(10,"k");
      spanish.put(11,"l");
      spanish.put(12,"m");
      spanish.put(13,"n");
      spanish.put(14,"ñ");
      spanish.put(15,"o");
      spanish.put(16,"p");
      spanish.put(17,"q");
      spanish.put(18,"r");
      spanish.put(19,"s");
      spanish.put(20,"t");
      spanish.put(21,"u");
      spanish.put(22,"v");
      spanish.put(23,"w");
      spanish.put(24,"x");
      spanish.put(25,"y");
      spanish.put(26,"z");
      spanish1.put('a', 0);
      spanish1.put('b', 1);
      spanish1.put('c', 2);
      spanish1.put('d', 3);
      spanish1.put('e', 4);
      spanish1.put('f', 5);
      spanish1.put('g', 6);
      spanish1.put('h', 7);
      spanish1.put('i', 8);
      spanish1.put('j', 9);
      spanish1.put('k', 10);
      spanish1.put('l', 11);
      spanish1.put('m', 12);
      spanish1.put('n', 13);
      spanish1.put('ñ', 14);
      spanish1.put('o', 15);
      spanish1.put('p', 16);
      spanish1.put('q', 17);
      spanish1.put('r', 18);
      spanish1.put('s', 19);
      spanish1.put('t', 20);
      spanish1.put('u', 21);
      spanish1.put('v', 22);
      spanish1.put('w', 23);
      spanish1.put('x', 24);
      spanish1.put('y', 25);
      spanish1.put('z', 26);
      StringBuffer result = new StringBuffer();
      for(int i = 0; i<cipherText.length(); i++){
      
          String plainText;
          if((spanish1.get(cipherText.toLowerCase().charAt(i))) == null){
              result.append(" ");
          }
          else{
              int numKey = ((int)(spanish1.get(cipherText.toLowerCase().charAt(i))) - shift) % 26;
              if(numKey > 0){
                  //System.out.println(numKey);
                  plainText = (String) spanish.get(numKey);
              }else{
                  numKey = numKey + 26;
                  //System.out.println(numKey);
                  plainText = (String) spanish.get(numKey);
              }
             
              
              
              result.append(plainText.toUpperCase());
          }
      }
      return result;
    }
    //function to encrypt plain text in Turkish Alphabet
    public static StringBuffer encryptTurkish(String plainText, int shift){
      HashMap turkish= new HashMap<>();
      HashMap turkish1 = new HashMap<>();
      turkish.put(0,"a");
      turkish.put(1,"b");
      turkish.put(2,"c");
      turkish.put(3,"ç");
      turkish.put(4,"d");
      turkish.put(5,"e");
      turkish.put(6,"f");
      turkish.put(7,"g");
      turkish.put(8,"ğ");
      turkish.put(9,"h");
      turkish.put(10,"ı");
      turkish.put(11,"i");
      turkish.put(12,"j");
      turkish.put(13,"k");
      turkish.put(14,"l");
      turkish.put(15,"m");
      turkish.put(16,"n");
      turkish.put(17,"o");
      turkish.put(18,"ö");
      turkish.put(19,"p");
      turkish.put(20,"r");
      turkish.put(21,"s");
      turkish.put(22,"ş");
      turkish.put(23,"t");
      turkish.put(24,"u");
      turkish.put(25,"ü");
      turkish.put(26,"v");
      turkish.put(27,"y");
      turkish.put(28,"z");
      turkish1.put('a', 0);
      turkish1.put('b', 1);
      turkish1.put('c', 2);
      turkish1.put('ç', 3);
      turkish1.put('d', 4);
      turkish1.put('e', 5);
      turkish1.put('f', 6);
      turkish1.put('g', 7);
      turkish1.put('ğ', 8);
      turkish1.put('h', 9);
      turkish1.put('ı', 10);
      turkish1.put('i', 11);
      turkish1.put('j', 12);
      turkish1.put('k', 13);
      turkish1.put('l', 14);
      turkish1.put('m', 15);
      turkish1.put('n', 16);
      turkish1.put('o', 17);
      turkish1.put('ö', 18);
      turkish1.put('p', 19);
      turkish1.put('r', 20);
      turkish1.put('s', 21);
      turkish1.put('ş', 22);
      turkish1.put('t', 23);
      turkish1.put('u', 24);
      turkish1.put('ü', 25);
      turkish1.put('v', 26);
      turkish1.put('y', 27);
      turkish1.put('z', 28);
      StringBuffer result = new StringBuffer();
      for(int i = 0; i<plainText.length(); i++){
          
          if((turkish1.get(plainText.toLowerCase().charAt(i))) == null){
              result.append(" ");
          }
          else{
              int numKey = ((int)(turkish1.get(plainText.toLowerCase().charAt(i))) + shift) % 26;
              
              String cipherText = (String) turkish.get(numKey);
              
              result.append(cipherText.toUpperCase());
          }
         
      }
      return result;
    
    }
    
    
    //function to decrypt plain text in Turkish Alphabet
    public static StringBuffer decryptTurkish(String cipherText, int shift){
      HashMap turkish= new HashMap<>();
      HashMap turkish1 = new HashMap<>();
      turkish.put(0,"a");
      turkish.put(1,"b");
      turkish.put(2,"c");
      turkish.put(3,"ç");
      turkish.put(4,"d");
      turkish.put(5,"e");
      turkish.put(6,"f");
      turkish.put(7,"g");
      turkish.put(8,"ğ");
      turkish.put(9,"h");
      turkish.put(10,"ı");
      turkish.put(11,"i");
      turkish.put(12,"j");
      turkish.put(13,"k");
      turkish.put(14,"l");
      turkish.put(15,"m");
      turkish.put(16,"n");
      turkish.put(17,"o");
      turkish.put(18,"ö");
      turkish.put(19,"p");
      turkish.put(20,"r");
      turkish.put(21,"s");
      turkish.put(22,"ş");
      turkish.put(23,"t");
      turkish.put(24,"u");
      turkish.put(25,"ü");
      turkish.put(26,"v");
      turkish.put(27,"y");
      turkish.put(28,"z");
      turkish1.put('a', 0);
      turkish1.put('b', 1);
      turkish1.put('c', 2);
      turkish1.put('ç', 3);
      turkish1.put('d', 4);
      turkish1.put('e', 5);
      turkish1.put('f', 6);
      turkish1.put('g', 7);
      turkish1.put('ğ', 8);
      turkish1.put('h', 9);
      turkish1.put('ı', 10);
      turkish1.put('i', 11);
      turkish1.put('j', 12);
      turkish1.put('k', 13);
      turkish1.put('l', 14);
      turkish1.put('m', 15);
      turkish1.put('n', 16);
      turkish1.put('o', 17);
      turkish1.put('ö', 18);
      turkish1.put('p', 19);
      turkish1.put('r', 20);
      turkish1.put('s', 21);
      turkish1.put('ş', 22);
      turkish1.put('t', 23);
      turkish1.put('u', 24);
      turkish1.put('ü', 25);
      turkish1.put('v', 26);
      turkish1.put('y', 27);
      turkish1.put('z', 28);
      StringBuffer result = new StringBuffer();
      for(int i = 0; i<cipherText.length(); i++){
          
          String plainText;
          if((turkish1.get(cipherText.toLowerCase().charAt(i))) == null){
              result.append(" ");
          }
          else{
              int numKey = ((int)(turkish1.get(cipherText.toLowerCase().charAt(i))) - shift) % 26;
              if(numKey > 0){
                  //System.out.println(numKey);
                  plainText = (String) turkish.get(numKey);
              }else{
                  numKey = numKey + 26;
                  //System.out.println(numKey);
                  plainText = (String) turkish.get(numKey);
              }
             
              
              
              result.append(plainText.toUpperCase());
          }
      }
      return result;
    
    }
    
    
    //the main function of the programme
    public static void main(String[] args) {
       
      String data = "";
      String inputText = "";
      int getShift;
      int encryptDecrypt;
      int lang;
      String filePath ="C:\\Users\\User\\Documents\\NetBeansProjects\\Caesar Cipher\\doc.txt";  //your document path here
      
    try {
      File myObj = new File(filePath);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        data = myReader.nextLine();
        //System.out.println(data);
      }
      //System.out.println(data);
      myReader.close();
        } 
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    //get the number of shift from the data
    getShift = Integer.parseInt(data.substring(0, 1));
    //get the input for encryption - 0 and decryption -1
    encryptDecrypt = Integer.parseInt(data.substring(2, 3));
    //get the language preffered i.e. English - 0, French - 1, Spain - 2, Turkey - 3
    lang = Integer.parseInt(data.substring(4, 5));
    //And finally, get the text to encrypt or decrypt
    inputText = data.substring(6);
    
    
    
     //First check the language
        switch (lang) {
            case 0:
                //if the language choosen is English/French
                if(encryptDecrypt == 0){
                    //encryption
                    System.out.println(encryptEnglish(inputText,getShift));
                    
                }else{
                    //decryption
                    System.out.println(decryptEnglish(inputText,getShift));
                    
                }       break;
            case 1:
                //if the language choosen is English/French
                if(encryptDecrypt == 0){
                    //encryption
                    System.out.println(encryptEnglish(inputText,getShift));
                    
                }else{
                    //decryption
                    System.out.println(decryptEnglish(inputText,getShift));
                    
                }       break;
            case 2:
                //if the language choosen is Spanish
                if(encryptDecrypt == 0){
                    //encryption
                    System.out.println(encryptSpainish(inputText,getShift));
                    
                }else{
                    //decryption
                    System.out.println(decryptSpainish(inputText,getShift));
                }       break;
            case 3:
                //if the language choosen is Turkish
                if(encryptDecrypt == 0){
                    //encryption
                    System.out.println(encryptTurkish(inputText,getShift));
                    
                }else{
                    //decryption
                    System.out.println(decryptTurkish(inputText,getShift));
                }       break;
            default:
                break;
        }
     
      //System.out.println(decryptEnglish("DELRGXQ",3));
      //System.out.println(encryptSpainish("holla",7));
      //System.out.println(decryptSpainish("ÑVRRH",7));
      //System.out.println(encryptTurkish("holla",2));
      //System.out.println(decryptTurkish("IPNNC",2));
    
    }
    
}
