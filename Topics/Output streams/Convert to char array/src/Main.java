import java.io.CharArrayWriter;
import java.io.IOException;

class Converter {
    public static char[] convert(String[] words) throws IOException {

        CharArrayWriter contactWriter = new CharArrayWriter();
        String str = String.join("", words);

        contactWriter.write(str);

        char[] arrayCh = contactWriter.toCharArray();
        contactWriter.close();

        return arrayCh;
    }
}
