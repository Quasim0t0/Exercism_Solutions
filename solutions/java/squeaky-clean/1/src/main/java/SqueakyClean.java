class SqueakyClean {
    static String clean(String identifier) {
         if(identifier.contains(" ")){
            identifier = identifier.replace(" ", "_");
        }
        if(identifier.contains("-")){
            int index = identifier.indexOf('-');
            identifier = identifier.substring(0, index) + identifier.substring(index + 1, index + 2).toUpperCase() + identifier.substring(index + 2);   
        }
        identifier = identifier.replace('0' ,'o');
        identifier = identifier.replace('3' ,'e');
        identifier = identifier.replace('1' ,'l');
        identifier = identifier.replace('4' ,'a');
        identifier = identifier.replace('7' ,'t');
        identifier = identifier.replaceAll("[^a-zA-Z_]", "");
        return identifier;
    }
}

