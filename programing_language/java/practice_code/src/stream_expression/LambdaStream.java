package stream_expression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaStream {
    public static void main(String[] args) {
        Integer arr [] = {1,2,3,4,5,6,7,8,9,10};

        List<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        String rs = names.stream()
        .reduce("", (a,b) -> a + " " + b);
        System.out.println(rs.trim());

        int [] [] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        List<List> listMatrix = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                listMatrix.add(Arrays.asList(matrix[i][j]) );
            }
        }
        List<Integer> flatList = listMatrix.stream()
        .flatMap(m -> m.stream())
        .toList();     
        
        System.err.println("" + flatList);
    }
}
