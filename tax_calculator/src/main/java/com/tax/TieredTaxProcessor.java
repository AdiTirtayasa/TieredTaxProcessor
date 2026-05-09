package com.tax;

public class TieredTaxProcessor {
private final double PTKB = 54000000;
private final double NonNPWP_Penalty = 1.2;

public  double calculateTax(double income, boolean isNPWP) {
   if (income < 0) {
       throw new IllegalArgumentException("Income cannot be negative");
   }
  double taxAbleIncome = Math.max(0, income - PTKB);
  if(taxAbleIncome == 0) {
      return 0;
  }
  double totalTax = 0;
  if(taxAbleIncome >= 0){
        double tier1 = Math.min(50000000, taxAbleIncome);
        totalTax += tier1 * 0.05 * (isNPWP ? 1 : NonNPWP_Penalty);
        taxAbleIncome -= tier1;
  }
  if(taxAbleIncome > 0){
        double tier2 = Math.min(200000000, taxAbleIncome);
        totalTax += tier2 * 0.15 * (isNPWP ? 1 : NonNPWP_Penalty);
        taxAbleIncome -= tier2;
  }
  if(taxAbleIncome > 0){
        double tier3 = Math.min(250000000, taxAbleIncome);
        totalTax += tier3 * 0.25 * (isNPWP ? 1 : NonNPWP_Penalty);
        taxAbleIncome -= tier3;
  }
    if(taxAbleIncome > 0){
            double tier4 = isNPWP ? taxAbleIncome * 0.30 : taxAbleIncome * 0.30 * NonNPWP_Penalty;
            totalTax += tier4;
    }
    return totalTax;
}}