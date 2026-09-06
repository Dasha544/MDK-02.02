public class Main3 {
    public static void main(String[] args) {
        String pixelKcalDay = "43";
        String beefKcal = "30.2";
        String chickenKcal = "23.8";
        String creamKcal = "32.1";
        String milkKcal = "13.5";

        Float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
        float totalKcal = Float.parseFloat(pixelKcalDay) + pixelChoice;
        checkKcal(totalKcal);
    }

    private static Float getMinKcalsSum(String firstDishKcal, String secondDishKcal,
                                        String firstDesert, String secondDesert) {

        float dish1 = Float.parseFloat(firstDishKcal);
        float dish2 = Float.parseFloat(secondDishKcal);
        float desert1 = Float.parseFloat(firstDesert);
        float desert2 = Float.parseFloat(secondDesert);

        float minDishKcal = Float.min(dish1, dish2);
        float minDesertKcal = Float.min(desert1, desert2);

        return minDishKcal + minDesertKcal;
    }

    private static void checkKcal(Float catKcal) {
        if (catKcal == null) {
            System.out.println("Что-то пошло не так");
        } else {
            System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
            if (catKcal > 100) {
                System.out.println("Пиксель сегодня не уложился в норму.");
            } else {
                System.out.println("Лимит не превышен!");
            }
        }
    }
}