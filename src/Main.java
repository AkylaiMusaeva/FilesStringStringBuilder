import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter=new FileWriter("java10.txt");
            fileWriter.write("~~~~~Peaksoft~~~~~~~~" +
                    "\n Group: Java-10"+
                    "\n Course: Java"+
                    "\n Student: 30 students"+
                    "\n Mentor: Ulan agai");
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        try {
            FileReader fileReader = new FileReader("java10.txt");
            Scanner scanner=new Scanner(fileReader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        Song song=new Song("Ke4ki bishkek\n","Mirbek Atabekov\n","Кечки Бишкек - мен көргөн тагдырга болдуң себеп\n" +
                "Музга айланган көңүлдүн дартына жообуң керек\n" +
                "Азыр кайда? Азыр кайда?\n" +
                "Айтчы мага?\n" +
                "Бакытка балкыган\n" +
                "Жан дүйнөм чалкыган - жаным!");
        try {
            FileWriter fileWriter = new FileWriter("song.txt");
            fileWriter.write(song.getTitle());
            fileWriter.write(song.getAuthor());
            fileWriter.write(song.getText());
            fileWriter.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            FileReader fileReader=new FileReader("song.txt");
            Scanner scanner=new Scanner(fileReader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        StringBuilder stringBuilder=new StringBuilder("Hello");

    }
}
