import java.io.*;

public class FileOperations {
   public static void main(String[] args) {
      try {
         // Creating a new file
         File file = new File("myFile.txt");
         if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
         } else {
            System.out.println("File already exists.");
         }
         
         // Writing to the file
         FileWriter writer = new FileWriter("myFile.txt");
         writer.write("Hello, World!\n");
         writer.write("This is a sample text file.");
         writer.close();
         System.out.println("Successfully wrote to the file.");
         
         // Reading from the file
         BufferedReader reader = new BufferedReader(new FileReader("myFile.txt"));
         String line;
         while ((line = reader.readLine()) != null) {
            System.out.println(line);
         }
         reader.close();
         
         // Deleting the file
         if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
         } else {
            System.out.println("Failed to delete the file.");
         }
      } catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }
}