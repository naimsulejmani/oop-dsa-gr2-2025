package oop.enums;

public class SearchEngineDemo {
    public static void main(String[] args) {
        SearchEngine engine = SearchEngine.GOOGLE;
        SearchEngine microsoft = SearchEngine.BING;


        engine.visit();
        microsoft.visit();


        String vlera = engine.toString();
        System.out.println(vlera);


        if (engine.equals(SearchEngine.BING)) {
            System.out.println("Jemi duke perdorur BING");
        } else if (engine == SearchEngine.YAHOO) {
            System.out.println("Jemi duke perdorur YAHOO");
        } else if(engine == SearchEngine.GOOGLE) {
            System.out.println("Jemi duke perdorur GOOGLE");
        }




        SearchEngine engine1 = SearchEngine.valueOf("YAHOO");
        System.out.println(engine1);

        int nr = Integer.valueOf("10");
        double nr1 = Double.valueOf("12.2");





    }
}








