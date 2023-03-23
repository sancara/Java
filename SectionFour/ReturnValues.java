public class ReturnValues {
    public static void main(String[] args) {
        String englishArea = explainArea("English");
        String frenchArea = explainArea("French");
        String sapnishArea = explainArea("Spanish");
    }

    public static double calculateArea(double length, double width) {
        double area = width * length;

        return area;
    }

    public static String explainArea(String language) {
        
        switch(language) {
            case "English": return "Area equals length * width";
            case "French":return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language not available";
        }

    }

}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"

