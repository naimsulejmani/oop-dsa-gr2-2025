package oop.enums;

public enum SearchEngine {
    // ne enum i definojme objektet qe munden me u kriju prej kalses SearchEngine
    //secili objekt eshte publik, statik dhe final
    GOOGLE("https://www.google.com"),
    YAHOO("https://www.yahoo.com"),
    BING;
    //fillimisht ne enum definohet list ame objekte pastaj ;
    private String url;

    public String getUrl() {
        return url;
    }

    private SearchEngine(String url) {
        this.url = url;
    }

    private SearchEngine() {

    }


    public void visit() {
        System.out.println("Browsing... -> " + url);
    }


}
