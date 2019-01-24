package com.example.mortgage;

public class MortgageModel {
    private double p, i;
    private int a;
    public MortgageModel(String p, String a, String i) {
        this.p = Double.parseDouble(p);
        this.i = Double.parseDouble(i);
        this.a = Integer.parseInt(a);
    }

    public String computePayment() {
        String str = String.format("%.2f", ((i / 1200 * p) / (1 - Math.pow(1 + i / 1200, -a * 12))));
        int index = str.indexOf(".");
        StringBuilder sb = new StringBuilder("$");
        for(int i = 0; i < index; i++){
            if (i % 3 == index % 3)
                sb.append(",");
            sb.append(str.charAt(i));
        }
        sb.append(str, index, str.length());
        return sb.toString();
    }

    public static void main (String[] args ) {
        MortgageModel m = new MortgageModel("300000", "20",  "4.5");
        System.out.println(m.computePayment());
    }
}
