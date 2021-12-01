package com.company.web;

import com.sun.source.tree.Tree;
import com.sun.source.util.Trees;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        //Task 1
        Integer[] t1 = new Integer[]{1, 2};
        System.out.println(t1.toString());
        System.out.println(Arrays.toString(t1));
        //Task 2
        ArrayList<String> t2 = new ArrayList();
        t2.add("abc");
        t2.add("cccc");
        t2.add("cccc");
        t2.add("cccc");
        ArrayList<String> t2_1 = new ArrayList();
        t2_1.add("123");
        t2.addAll(t2_1);
        t2_1.clear();
        System.out.println(t2.contains("123"));
        System.out.println(t2.containsAll(t2_1));
        System.out.println(t2.equals(t2_1));
        System.out.println(t2.hashCode());
        System.out.println(t2.isEmpty());
        Iterator<String> iterator = t2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        t2.parallelStream().forEach(e -> System.out.println(e + "Works!"));
        t2.remove("123");
        t2_1.removeAll(t2);
        t2.removeIf(e -> e == "abc");
        t2.retainAll(t2_1);
        t2.add("abc");
        t2.add("cccc");
        t2.add("cccc");
        t2.add("cccc");
        t2.size();
        Spliterator<String> spliterator = t2.spliterator();
        t2.stream().filter(e -> e.equals("abc"))
                .forEach(System.out::println);
        System.out.println(t2.get(0));
        Object[] a = t2.toArray();
        System.out.println("a= " + a[0]);
        String[] b = t2.toArray(new String[0]);
        //Task 3 in classes
        Task3 task3 = new Task3();
        while (task3.hasNext()) {
            System.out.println("task3 " + task3.next());
        }
        Task3_1 task3_1 = new Task3_1(new String[]{"abc", "acb"});
        Iterator iterator3 = task3_1.iterator();

        //Task 4
        Integer[] t4 = new Integer[]{0, 1, 2};
        List<Integer> t4_1 = Arrays.asList(t4);
        //Task 5
        List<Integer> t5_1 = new ArrayList<>();
        t5_1.add(1);
        t5_1.add(2);
        t5_1.add(3);
        Object[] t5_2 = t5_1.toArray();
        Integer[] t5_3 = t5_1.toArray(new Integer[0]);
        //Task 6
        List<String> t6_1 = new ArrayList<String>();
        List<String> t6_2 = new ArrayList<String>(t6_1);
        List<String> t6_3 = new ArrayList<String>(12);
        //Task 7
        List<String> t7 = new ArrayList<>();
        t7.add(null);
        //Task 8
        List<String> t8_1 = new LinkedList<String>();
        List<String> t8_2 = new LinkedList<String>(t8_1);
        //Task 9
        List<String> t9_1 = new LinkedList<String>();
        System.out.println(t9_1 instanceof List);
        System.out.println(t9_1 instanceof Queue);
        System.out.println(t9_1 instanceof Deque);
        //Task 10
        List<String> t10 = Collections.emptyList();
        List<String> t10_1 = Collections.singletonList("OnlyOneElement");
        List<String> t10_2 = Collections.unmodifiableList(t10);
        //Task 11
        List<String> t11 = new ArrayList<>();
        t11.add("a");
        t11.add("b");
        t11.add("c");
        //java.util.ConcurrentModificationException
//        for(String str: t11){
//            t11.remove("b");
//        }
        //Task 12
        List<String> t12 = new ArrayList<>();
        t12.add("a");
        t12.add("b");
        t12.add("c");
        ListIterator<String> iterator12 = t12.listIterator();
        while (iterator12.hasNext()) {
            System.out.println(iterator12.next());
        }
        //Task 13
        List<String> t13 = new ArrayList<>();
//        t13.add("abc");
//        t13.add("cccc");
//        t13.add("cccc");
//        t13.add("cccc");
        ArrayList<String> t13_1 = new ArrayList();
        t13_1.clone();
        t13_1.ensureCapacity(12);
        t13_1.forEach(System.out::println);
        t13_1.trimToSize();
        t13_1.getClass();
//        t13_1.notify();
//        t13_1.notifyAll();
        t13_1.toString();
//        try {
//            t13_1.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t13_1.parallelStream();
        t13_1.stream();


//        t13.addAll(t13_1);
//        UnaryOperator<String> un13=new UnaryOperator<String>() {
//            @Override
//            public String apply(String s) {
//                return s;
//            }
//        };
//        t13.replaceAll(un13);
//        Comparator<String> co13=new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//        t13.sort( co13);
//        t13.get(0);
//        t13.set(0, "cba");
//        t13.add(0, "dsa");
//        t13.remove(0);
//        t13.indexOf("dsa");
//        t13.lastIndexOf("dsa");
//        ListIterator<String> iterator13 = t13.listIterator();
//        while (iterator13.hasNext()) {
//            System.out.println(iterator13.next());
//        }
//        ListIterator<String> iterator13_1 = t13.listIterator(0);
//        while (iterator13_1.hasNext()) {
//            System.out.println(iterator13_1.next());
//        }
//        t13.subList(0,1);
//        t13=List.of("123");
//        t13=List.copyOf(t13_1);
        //Task 14
        Task14 task14 = new Task14();
        Task14 task14_1 = new Task14();
        task14.compareTo(task14_1);
        Task14_1 task14_1_1 = new Task14_1();
        System.out.println(task14_1_1.compare("abc", "cba"));
        //Task 15
        List<String> t15 = new ArrayList<>();
        t15.add("abc");
        t15.add("bcs");
        t15.add("ddd");
        Collections.sort(t15);
        t15.sort(Comparator.naturalOrder());
        //Task 16
        List<Task16> t16 = new ArrayList<>();
        //Task 17
        List<String> t17Arr = new ArrayList<>();
        HashSet<String> t17 = new HashSet<>();
        HashSet<String> t17_1 = new HashSet<>(t17Arr);
        HashSet<String> t17_2 = new HashSet<>(12, 3);
        HashSet<String> t17_3 = new HashSet<>(12);
//        HashSet<String> t17_4=new HashSet<>(16,.75f, true);
        //Task 18
        HashSet<String> t18 = new HashSet<>();
        t18.add(null);
        //Task 19
        List<String> t19Arr = new ArrayList<>();
        LinkedHashSet<String> t19 = new LinkedHashSet();
        LinkedHashSet<String> t19_1 = new LinkedHashSet(12, 3);
        LinkedHashSet<String> t19_2 = new LinkedHashSet(12);
        LinkedHashSet<String> t19_3 = new LinkedHashSet(t19Arr);
        //Task 20
        LinkedHashSet<String> t20 = new LinkedHashSet<>();
        t20.add("bca");
        t20.add("acb");
        for (String str20 : t20) {
            System.out.println(str20);
        }
        //Task 21

        List<String> t21Arr = new ArrayList<>();
        TreeSet<String> t21 = new TreeSet<>();
        TreeSet<String> t21_1 = new TreeSet<>(t21Arr);
        TreeSet<String> t21_2 = new TreeSet<>(Comparator.naturalOrder());
//        TreeSet<String> t21_3=new TreeSet<>(new SortedSet<String>());
        //Task 22
        TreeSet<Task22> t22 = new TreeSet<>();
//        t22.add(new Task22()); //ClassCastException
        //Task 23
        TreeSet<String> t23 = new TreeSet<>();
        t23.add("bca");
        t23.add("acb");
        t23.add("ddd");
        for (String str23 : t23) {
            System.out.println(str23);
        }
        //Task 24
        HashSet<Task24> t24 = new HashSet<>();
        t24.add(new Task24(12));
        //Task 25
        TreeSet<Task25> t25 = new TreeSet<>();
        t25.add(new Task25(12));
        t25.add(new Task25(14));
        //Task 26
        Set<String> t26_3 = new HashSet<>();
        Set<String> t26 = Collections.emptySet();
        Set<String> t26_1 = Collections.singleton(new String());
        Set<String> t26_2 = Collections.unmodifiableSet(t26_3);
        //Task 27
        Set<String> t27 = new HashSet<>();
        ((HashSet<String>) t27).clone();
        t27.toString();
        t27.parallelStream();
        t27.removeIf(a123 -> a123.equals("123"));
        t27.stream();
        t27.getClass();
//        t27.notify();
//        t27.notifyAll();
//        try {
//            t27.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t27.forEach(System.out::println);
        //Task 28
        HashMap<String, String> t28 = new HashMap(12, 2);
        HashMap<String, String> t28_1 = new HashMap();
        HashMap<String, String> t28_2 = new HashMap(12);
        HashMap<String, String> t28_3 = new HashMap(t28);
        //Task 29
        HashMap<String, String> t29 = new HashMap<>();
//        t29.put("123", null); //Exception
//        t29.put(null, "123"); //Exception
        //Task 30
        LinkedHashMap<String, String> t30 = new LinkedHashMap(12, 2);
        LinkedHashMap<String, String> t30_1 = new LinkedHashMap();
        LinkedHashMap<String, String> t30_2 = new LinkedHashMap(12);
        LinkedHashMap<String, String> t30_3 = new LinkedHashMap(t30);
        LinkedHashMap<String, String> t30_4 = new LinkedHashMap(1, 1, true);
        //Task 31
        TreeMap<String, String> t31 = new TreeMap<String, String>(Comparator.naturalOrder());
        TreeMap<String, String> t31_1 = new TreeMap<String, String>();
        TreeMap<String, String> t31_3 = new TreeMap<String, String>(t31);
        //Task 32
        Map<String, String> t32 = Collections.EMPTY_MAP;
        Map<String, String> t32_1 = Collections.singletonMap("qwe", "qewq");
        Map<String, String> t32_2 = Collections.unmodifiableMap(t32);
        //Task 33
        Map<String, String> t33 = new HashMap<>();
        t33.clear();
        t33.compute("qwe", (e33, e33_1) -> e33);
        t33.containsKey("abx");
        t33.containsValue("asd");
        Map<String, String> t33_1 = Map.copyOf(t33);
        t33.entrySet();
        t33.equals(t33_1);
        t33.forEach((a33, b33) -> System.out.println(a33 + b33));
        t33.get("asd");
        t33.getOrDefault("asd", "sda");
        t33.hashCode();
        t33.isEmpty();
        t33.keySet();
        t33.merge("asd", "sada", (e33, e33_1) -> e33);
        Map.of();
        t33.put("sada", "asdas");
        t33.putAll(t33);
        t33.putIfAbsent("asda", "sda");
        t33.remove("asd");
        t33.remove("weq", "sad");
        t33.replace("sd", "sad");
        t33.replaceAll((e33, e33_1) -> e33);
        t33.size();
        t33.values();
        //Task 34
        LinkedList<String> t34 = new LinkedList<>();
        LinkedList<String> t34_1 = new LinkedList<>();
        t34.addAll(t34_1);
        t34.addFirst("asda");
        t34.addLast("asda");
        t34.clear();
        t34.clone();
        t34.contains("sd");
        t34.descendingIterator();
        t34.addFirst("asda");
        t34.get(0);
        t34.getFirst();
        t34.getLast();
        t34.indexOf("123");
        t34.lastIndexOf("123");
        t34.listIterator();
        t34.offerFirst("df");
        t34.offerLast("dsfs");
        t34.peekFirst();
        t34.peekLast();
        t34.push("dsf");
        t34.remove("dfdsf");
        t34.remove(0);
        t34.removeFirst();
        t34.removeFirstOccurrence("123");
        t34.set(0, "123");
        t34.size();
        t34.spliterator();
        t34.toArray();
        t34.toArray(new String[]{"12", "123"});
        t34.iterator();
        t34.listIterator(0);
        t34.equals(t34_1);
        t34.hashCode();
        t34.subList(0, 0);
        t34.pop();
        t34.add(0, "123");
        t34.addAll(t34);
        t34.isEmpty();
        UnaryOperator<String> un34 = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s;
            }
        };
        t34.replaceAll(un34);
        t34.retainAll(t34);
        t34.sort(Comparator.naturalOrder());
        t34.getClass();
//        t34.notify();
//        t34.notifyAll();
        t34.toString();
//        try {
//            t34.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //Task 35
        ArrayDeque<String> t35=new ArrayDeque<>();
        ArrayDeque<String> t35_1=new ArrayDeque<>();
        t35.clear();
        t35.clone();
        t35.forEach(e-> System.out.println());
        t35.isEmpty();
        t35.removeAll(t35_1);
        t35.retainAll(t35_1);
        t35.spliterator();
        t35.toArray();
        t35.toArray(new String[]{"asd"});
        t35.containsAll(t35_1);
        t35.toString();
        t35.equals(t35_1);
        t35.getClass();
        t35.hashCode();
//        t35.notify();
//        t35.notifyAll();
//        try {
//            t35.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t35.iterator();
        t35.parallelStream();
        t35.stream();
    }
}
