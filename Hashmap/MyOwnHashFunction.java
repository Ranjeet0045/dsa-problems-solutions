package Hashmap;

class mapUsingHash{
    @SuppressWarnings("FieldMayBeFinal")
    private Entity[] entities;

    public mapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key,String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    public class Entity{
        String key;
        String value;

        public Entity(String key,String value){
            this.key = key;
            this.value = value;
        }
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }
}

public class MyOwnHashFunction {
    public static void main(String[] args) {
        mapUsingHash map = new mapUsingHash();
        map.put("mango","King of fruits");
        map.put("apple","a sweet red fruit");
        map.put("litchi","kunal's fav fruit");

        System.out.println(map.get("apple"));
        System.out.println(map.get("litchi"));
    }
}
