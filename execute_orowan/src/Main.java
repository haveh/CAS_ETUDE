import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Si il y a des problèmes au niveau des permissions pour ouvrir Orowan, décommenter les 3 lignes suivantes
        //
        // File file = new File("Orowan_x64.exe");
        // file.setReadable(true, false);
        //file.setWritable(true, false);

        String command = "Orowan_x64.exe"; // ouvre Orowan
        Process process = Runtime.getRuntime().exec(command);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));

        // Envoie les commandes suivantes au terminal Orowan
        writer.write("i\n");
        writer.write("c\n");
        writer.write("int_csv.txt\n");
        writer.write("output.txt\n");
        writer.flush();
        }
    }