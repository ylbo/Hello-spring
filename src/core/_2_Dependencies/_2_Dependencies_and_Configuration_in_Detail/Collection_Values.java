package core._2_Dependencies._2_Dependencies_and_Configuration_in_Detail;

import java.util.*;

public class Collection_Values {
    private Set<String> set;
    private List<String> list;
    private String[] array;
    private Map<String,String> map;
    private Properties properties;

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Collection_Values{" +
                "set=" + set +
                ", list=" + list +
                ", array=" + Arrays.toString(array) +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
