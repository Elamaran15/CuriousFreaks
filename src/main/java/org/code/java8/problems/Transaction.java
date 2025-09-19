package org.code.java8.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() { return trader; }
    public int getYear() { return year; }
    public int getValue() { return value; }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }

    public static List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }


    //Find transactions in 2011, sorted by value
    static void findTransaction(){
        List<Transaction> transactions=getTransactions();


        List<Transaction> ans=  transactions.stream().filter(transaction -> transaction.getYear()==2011)
                .sorted(Comparator.comparingInt(Transaction::getValue)).toList();

        System.out.println(ans);
    }


    //Return all traders’ names sorted alphabetically
    static void sortAlpha(){
        List<Transaction> transactions=getTransactions();
       List<Trader> ans= transactions.stream().map(Transaction::getTrader).sorted(Comparator.comparing(Trader::getName))
              .toList();

        ans.forEach(System.out::println);

    }


    //Find the city where the highest number of traders work (from Trader/Transaction problem).
    static void findCity(){
        List<Transaction> transactions=getTransactions();
        Map<Trader,Long> count=transactions
                .stream()
                .collect(Collectors.groupingBy(Transaction::getTrader,Collectors.counting()));


        String  trader1=count.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(entry->entry.getKey().getCity())
                .orElse(null);

        System.out.println(trader1);
    }


    public static void main(String[] args) {
        findCity();

    }

}
