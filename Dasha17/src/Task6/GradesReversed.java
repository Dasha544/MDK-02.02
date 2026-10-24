package Task6;

import java.util.ArrayList;
import java.util.List;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        List<String> list = new ArrayList<>();

        for (String line : grades) {
            String[] parts = line.split(" ");

            String record = String.join(",",
                    parts[0].toLowerCase(),
                    parts[1].toLowerCase(),
                    parts[2].toLowerCase(),
                    gradeStringToInt(parts[4]));
            list.add(record);
        }

        return String.join(";", list);
    }

    public static void main(String[] args) {
        GradesReversed gr = new GradesReversed();

        String[] grades = {
                "Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"
        };

        String result = gr.serializeGrades(grades);
        System.out.println(result);
    }
}