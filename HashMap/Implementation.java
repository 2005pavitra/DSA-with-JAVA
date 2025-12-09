package HashMap;
import java.util.*;

import javax.sound.sampled.Line;
import java.util.LinkedList;

public class Implementation {
    static class HashMap<K, V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int size;
        private LinkedList<Node>[] buckets;

        private int hashFunction(K key){
            int hc = key.hashCode();//uski form change krke koi hash code value return krke dedega. kisi bhi obj ke liye
            return Math.abs(hc)% buckets.length;
        }

        private int searchInBucket(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int dataIndex = 0;

            for(Node node : ll){
                if(node.key.equals(key)){
                    return dataIndex;
                }
                dataIndex++;
            }
                return -1;
        }


        @SuppressWarnings("unchecked")

        public void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[oldBuckets.length * 2];
            size = 0;

            //initialise new buckets
            for(int i =0; i< buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            //copy old notes to new buckets
            for(int i = 0; i < oldBuckets.length;i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public HashMap(){
            this.size = 0;
            this.buckets = new LinkedList[4];

            for(int i = 0; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if(di != -1){
                //key exists ->update value
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                //key does not exist -> create new node
                buckets[bi].add(new Node(key, value));
                size++;
            }

            //check load factor (Lambda = n/N)
            double lambda = (double) size /buckets.length;
            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);
            return di != -1;
        }

        public V remove (K key){
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if(di != -1){

                Node node = buckets[bi].remove(di);
                size--;
                return node.value;
            }else{
                return null;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0 ;i < buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);

        System.out.println(map.containsKey("India")); // true
        System.out.println(map.get("China")); // 150
        System.out.println(map.remove("China")); // 150
        System.out.println(map.containsKey("China")); // false

        ArrayList<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key);
        }
    }
}
