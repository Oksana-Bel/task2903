package testsh;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utilsh.Files.getDoc;

public class DocFileTests {
    @Test
   public  void docxTest() throws IOException{
        File docxFile = new File("./src/test/resources/1.docx");
        String expectedDataDocx = "FUT_Underlying";

        String doc = getDoc(docxFile);
        assertTrue(doc.contains(expectedDataDocx));
    }
}


