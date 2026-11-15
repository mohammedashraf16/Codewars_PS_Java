package coloured_triangle;

public class ColouredTriangles {
    public static char triangle(final String row) {
        String colors ;
        String currentRow = row;
        while (currentRow.length() > 1) {
            colors="";
            for (int i = 0; i < currentRow.length() - 1; i++) {
                char first = currentRow.charAt(i);
                char second = currentRow.charAt(i + 1);
                if (first == second) {
                    colors += first;
                } else if (first != second) {
                    if (first == 'R' && second == 'G' || first == 'G' && second == 'R') {
                        colors += "B";
                    } else if (first == 'R' && second == 'B' || first == 'B' && second == 'R') {
                        colors += "G";
                    } else if (first == 'G' && second == 'B' || first == 'B' && second == 'G') {
                        colors += "R";
                    }
                }
            }
            currentRow = colors;
        }
        return currentRow.charAt(0);
    }
}
