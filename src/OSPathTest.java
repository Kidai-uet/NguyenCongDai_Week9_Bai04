import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;

public class OSPathTest {

  @Test
  public void testFilePath() {
    String windowsHardcodedPath = "logs\\transaction.log";

    String systemPath = "logs" + File.separator + "transaction.log";

    assertEquals(windowsHardcodedPath, systemPath, "Lỗi: Đường dẫn không khớp trên hệ điều hành này!");
  }
}