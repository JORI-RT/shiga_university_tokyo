package array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Discussion2Test {
    @DisplayName("2-1")
    @Test
    void name() {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.addAll(2, new ArrayList<>(Arrays.asList(6, 7, 8)));
        list.stream().forEach(System.out::print);// {12678345}
    }
}
