package CrazyJava.lambda;

interface Converter{
    Integer convert(String from);
}
public class MethodRefer {
    Converter converter1=from -> Integer.valueOf(from);
    Converter converter2 = from -> "fkit.org".indexOf(from);


}
