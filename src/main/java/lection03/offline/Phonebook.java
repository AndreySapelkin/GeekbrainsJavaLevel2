package lection03.offline;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {

    private final Map<String, Set<String>> entries = new TreeMap<>();

    public void addPhones(String surname, String phoneNumber){
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);

    }

    private Set<String> getPhones(String surname){
        return entries.computeIfAbsent(surname, k -> new HashSet<>());
    }

    public Set<String> get(String surname){return getPhones(surname);}

    public Set<String> getAllSurnames(){return entries.keySet();}

}
