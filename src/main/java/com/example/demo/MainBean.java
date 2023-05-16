package com.example.demo;

import java.util.ArrayList;

public class MainBean {

    private int countPageRefresh;
    private boolean trigger = false;
    ArrayList<Integer> al;

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    private String args;

    public MainBean(String args) {
        this.args = args;
    }

    public MainBean() {

    }

    public String solve(String argsm) {
        String[] args = argsm.split(" ");
        int[] arr = new int[args.length];
        int negativeSum=0;
        int positiveSum=0;

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0 & arr[i] > 0){
                positiveSum += arr[i];
            }
            else if(i % 2 != 0 & arr[i] < 0){
                negativeSum += arr[i];
            }
        }
        if(positiveSum > negativeSum) {
            return "Больше четных положительных";
        } else if( positiveSum < negativeSum){
            return "Больше нечетных отрицателбных";
        } else {
            return "Одинаково";
        }
    }

    public int getCountPageRefresh() {
        return countPageRefresh;
    }

    public void setCountPageRefresh(int countPageRefresh) {
        this.countPageRefresh = countPageRefresh;
    }

    public ArrayList<Integer> getAl() {
        return al;
    }

    public void setAl(ArrayList<Integer> al) {
        this.al = al;
    }

    public boolean isTrigger() {
        return trigger;
    }

    public void setTrigger(boolean trigger) {
        this.trigger = trigger;
    }


}
