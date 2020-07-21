package java8features;
import java.util.Arrays;

public interface PallindromeInterface {
	static Object[] findPallindrome(String[] arr) {
        return Arrays.stream(arr)
                .filter(i -> new StringBuilder(i).reverse().toString().equals(i))
                .toArray();
    }
}
