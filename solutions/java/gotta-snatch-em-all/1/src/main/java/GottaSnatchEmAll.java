import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> cardsSet = new HashSet<>();
        for (String i : cards){
            cardsSet.add(i);
        }
        return cardsSet;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>();
        for (Set<String> i : collections){
            common.addAll(i);
        }
        for (Set<String> i : collections){
            common.retainAll(i);
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>();
        for (Set<String> i : collections){
            common.addAll(i);
        }
        return common;
    }
}
