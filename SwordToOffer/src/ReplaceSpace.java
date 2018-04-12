public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        String s = str.toString().replaceAll("\\s", " ");
        return s;
    }
}
