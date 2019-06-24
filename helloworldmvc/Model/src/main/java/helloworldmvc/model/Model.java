package helloworldmvc.model;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Model implements IModel {


    @Override
    public String getMessage() {



        try {
            Path URI = Paths.get(Model.class.getResource("message.txt").toURI());
            return new String(Files.readAllBytes(URI));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return null;

        /*Scanner sc = null;
        String str = null;

        try {
            sc = new Scanner(new File(Url));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(sc.hasNextLine()){
            str = sc.nextLine();
        }

        return str;*/
    }
}
