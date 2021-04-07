package testsh;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utilsh.Files.readTextFromPath;
import static utilsh.Zip.unzip;


public class ZipFileTests {
    @Test
    void zipWithPasswordTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/11.zip";
        String unzipFolderPath = "./src/test/resources/unzip";
        String zipPassword = "123";
        String unzipTxtFilePath = "./src/test/resources/unzip/11.txt";
        String expectedData = "hello qa.guru students!";

        unzip(zipFilePath, unzipFolderPath, zipPassword);



        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

}
