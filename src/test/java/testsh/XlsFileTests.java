package testsh;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static utilsh.Files.getXls;
import static utilsh.Files.readXlsxFromPath;

public class XlsFileTests {
    @Test
    void xlsTest() throws IOException {
        String xlsFilePath = "./src/test/resources/11.xls";
        String expectedData = "some text here";

        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));
    }

    @Test
    void xlsxTest(){
        String xlsFilePath = "./src/test/resources/12.xlsx";
        String expectedData = "some text here";

        String actualData = readXlsxFromPath(xlsFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
