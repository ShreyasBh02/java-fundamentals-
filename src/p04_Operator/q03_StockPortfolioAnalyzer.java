/**
* Author: Shreyas Bhagat
* Date: 1 Feb 2026
* Description: 
* STOCK PORTFOLIO MANAGEMENT SYSTEM

Problem Title:
Advanced Stock Portfolio Analyzer

Scenario:
Create an advanced Java application to analyze a stock portfolio.
The system calculates profit and loss, applies tax and brokerage rules,
assesses risk using bitwise operations, and generates
investment recommendations.

Input Required:

	* Number of stocks in portfolio (1 to 10)
	
	For each stock:
	
	* Stock Symbol
	* Purchase Quantity
	* Purchase Price per Share
	* Current Market Price
	* Holding Period (in days)
	* Stock Type:
	  1 = Equity
	  2 = Derivative
	* Trading Volume (last month)
	
	Additional Inputs:
	
	* Risk Tolerance Level:
	  1 = Low
	  2 = Medium
	  3 = High
	* Investment Goal Flags (bitwise):
	  Growth = 1
	  Income = 2
	  Safety = 4
	  Tax-saving = 8

Processing Logic:

	* Calculate profit or loss for each stock
	* Calculate total portfolio value
	* Calculate overall return percentage
	* Apply tax rules:
	
	  * Short-term capital gains (less than 1 year)
	  * Long-term capital gains (more than 1 year)
	* Apply brokerage and transaction charges
	* Calculate risk-adjusted returns
	* Use bitwise operators to analyze investment goals
	* Compute portfolio health score
	* Detect imbalance or overexposure
	* Generate rebalancing recommendations

Output Required:

	* Individual stock profit or loss
	* Total portfolio value
	* Overall portfolio returns
	* Tax payable
	* Total brokerage and charges
	* Risk-adjusted return
	* Portfolio health score
	* Investment and rebalancing suggestions
*/
package p04_Operator;

import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    String symbol;
    int quantity;
    double purchasePrice;
    double currentPrice;
    int holdingPeriodDays;
    int type; // 1 = Equity, 2 = Derivative
    long tradingVolume;

    public Stock(String symbol, int quantity, double purchasePrice, double currentPrice, 
                 int holdingPeriodDays, int type, long tradingVolume) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.currentPrice = currentPrice;
        this.holdingPeriodDays = holdingPeriodDays;
        this.type = type;
        this.tradingVolume = tradingVolume;
    }

    public double getInvestmentValue() {
        return quantity * purchasePrice;
    }

    public double getCurrentValue() {
        return quantity * currentPrice;
    }

    public double getProfitLoss() {
        return getCurrentValue() - getInvestmentValue();
    }
}


public class q03_StockPortfolioAnalyzer {


    static final double BROKERAGE_RATE = 0.005; // 0.5% per trade
    static final double TAX_STCG_RATE = 0.15;   // 15% Short Term
    static final double TAX_LTCG_RATE = 0.10;   // 10% Long Term
    static final double TAX_DERIVATIVE = 0.30;  // 30% for Derivatives


    static final int GOAL_GROWTH = 1;
    static final int GOAL_INCOME = 2;
    static final int GOAL_SAFETY = 4;
    static final int GOAL_TAX_SAVING = 8;
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Stock> portfolio = new ArrayList<>();

	        System.out.println("=== ADVANCED STOCK PORTFOLIO ANALYZER ===");
	        
	        // 1. INPUT SECTION
	        int n = 0;
	        while (true) {
	            System.out.print("Enter number of stocks (1-10): ");
	            if (sc.hasNextInt()) {
	                n = sc.nextInt();
	                if (n >= 1 && n <= 10) break;
	            }
	            sc.nextLine(); 
	            System.out.println("Invalid input. Please enter a number between 1 and 10.");
	        }

	        for (int i = 0; i < n; i++) {
	            System.out.println("\n--- Enter details for Stock " + (i + 1) + " ---");
	            System.out.print("Symbol: ");
	            String sym = sc.next();
	            
	            System.out.print("Quantity: ");
	            int qty = sc.nextInt();
	            
	            System.out.print("Purchase Price: ");
	            double buy = sc.nextDouble();
	            
	            System.out.print("Current Market Price: ");
	            double curr = sc.nextDouble();
	            
	            System.out.print("Holding Period (days): ");
	            int days = sc.nextInt();
	            
	            System.out.print("Type (1=Equity, 2=Derivative): ");
	            int type = sc.nextInt();
	            
	            System.out.print("Avg Trading Volume (last month): ");
	            long vol = sc.nextLong();

	            portfolio.add(new Stock(sym, qty, buy, curr, days, type, vol));
	        }

	        System.out.println("\n--- Additional Configuration ---");
	        System.out.print("Risk Tolerance (1=Low, 2=Medium, 3=High): ");
	        int riskTolerance = sc.nextInt();

	        System.out.println("Enter Investment Goal Flags (Sum the values):");
	        System.out.println("1=Growth, 2=Income, 4=Safety, 8=Tax-saving");
	        System.out.print("Enter Goal Value: ");
	        int goalFlags = sc.nextInt();

	        // 2. PROCESSING SECTION
	        double totalInvestment = 0;
	        double totalCurrentValue = 0;
	        double totalPL = 0;
	        double totalTax = 0;
	        double totalBrokerage = 0;
	        
	        System.out.println("\n========================================================");
	        System.out.println("                  PORTFOLIO REPORT                      ");
	        System.out.println("========================================================");
	        System.out.printf("%-10s %-10s %-10s %-10s %-12s\n", "Symbol", "Inv Cost", "Curr Val", "P/L", "Tax Est.");
	        System.out.println("--------------------------------------------------------");

	        for (Stock s : portfolio) {
	            double inv = s.getInvestmentValue();
	            double currVal = s.getCurrentValue();
	            double pl = s.getProfitLoss();
	            double stockBrokerage = (inv + currVal) * BROKERAGE_RATE;
	    
	            double tax = calculateTax(s, pl);

	            totalInvestment += inv;
	            totalCurrentValue += currVal;
	            totalPL += pl;
	            totalTax += tax;
	            totalBrokerage += stockBrokerage;

	            System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-12.2f\n", 
	                s.symbol, inv, currVal, pl, tax);
	        }

	        double netReturn = totalPL - totalTax - totalBrokerage;
	        double roiPercentage = (netReturn / totalInvestment) * 100;

	        // 3. ANALYSIS OUTPUT
	        System.out.println("========================================================");
	        System.out.printf("Total Investment Value:   %.2f\n", totalInvestment);
	        System.out.printf("Current Portfolio Value:  %.2f\n", totalCurrentValue);
	        System.out.printf("Gross Profit/Loss:        %.2f\n", totalPL);
	        System.out.println("--------------------------------------------------------");
	        System.out.printf("Total Brokerage Charges:  %.2f\n", totalBrokerage);
	        System.out.printf("Estimated Tax Payable:    %.2f\n", totalTax);
	        System.out.printf("Net Realized Return:      %.2f\n", netReturn);
	        System.out.printf("Overall ROI %%:            %.2f%%\n", roiPercentage);
	        System.out.println("========================================================");

	        // 4. GOALS ANALYSIS (Bitwise)
	        System.out.print("Analyzed Goals: ");
	        printGoals(goalFlags);

	        // 5. HEALTH SCORE & RECOMMENDATIONS
	        int healthScore = calculateHealthScore(roiPercentage, portfolio, riskTolerance);
	        System.out.println("\nPortfolio Health Score: " + healthScore + "/100");

	        System.out.println("\n--- Recommendations ---");
	        generateRecommendations(portfolio, riskTolerance, goalFlags, totalCurrentValue);
	        
	        sc.close();
	    }

	    private static double calculateTax(Stock s, double pl) {
	        if (pl <= 0) return 0.0;

	        if (s.type == 2) { 
	            return pl * TAX_DERIVATIVE;
	        } else { 
	            if (s.holdingPeriodDays < 365) {
	                return pl * TAX_STCG_RATE;
	            } else {
	                return pl * TAX_LTCG_RATE; 
	            }
	        }
	    }

	    private static void printGoals(int flags) {
	        StringBuilder goals = new StringBuilder();
	        if ((flags & GOAL_GROWTH) == GOAL_GROWTH) goals.append("[Growth] ");
	        if ((flags & GOAL_INCOME) == GOAL_INCOME) goals.append("[Income] ");
	        if ((flags & GOAL_SAFETY) == GOAL_SAFETY) goals.append("[Safety] ");
	        if ((flags & GOAL_TAX_SAVING) == GOAL_TAX_SAVING) goals.append("[Tax-Saving] ");
	        
	        if (goals.length() == 0) System.out.println("None specified.");
	        else System.out.println(goals.toString());
	    }

	    private static int calculateHealthScore(double roi, ArrayList<Stock> portfolio, int riskTol) {
	        int score = 50; 
	        if (roi > 15) score += 20;
	        else if (roi > 0) score += 10;
	        else score -= 10;

	        if (portfolio.size() > 2) score += 10;

	        boolean riskMisMatch = false;
	        for(Stock s : portfolio) {
	            if(riskTol == 1 && s.type == 2) {
	                score -= 15;
	                riskMisMatch = true;
	            }
	        }
	        if(!riskMisMatch) score += 10;
	        return Math.max(0, Math.min(100, score));
	    }


	    private static void generateRecommendations(ArrayList<Stock> stocks, int riskTol, int goals, double totalVal) {
	        boolean safeGoal = (goals & GOAL_SAFETY) == GOAL_SAFETY;
	        
	        for (Stock s : stocks) {
	            double stockVal = s.getCurrentValue();
	            double concentration = (stockVal / totalVal) * 100;

	            if (concentration > 50) {
	                System.out.println("! ALERT: Overexposure in " + s.symbol + " (" + String.format("%.1f", concentration) + "%). Consider selling some units.");
	            }

	            if (riskTol == 1 && s.type == 2) {
	                System.out.println("! WARNING: " + s.symbol + " is a Derivative. High risk for a 'Low Risk' profile.");
	            }
	            if (s.tradingVolume < 10000) {
	                System.out.println("! CAUTION: " + s.symbol + " has low trading volume. Liquidity might be an issue.");
	            }
	            if (s.getProfitLoss() < 0 && (goals & GOAL_TAX_SAVING) == GOAL_TAX_SAVING) {
	                System.out.println("* TIP: Consider selling " + s.symbol + " to book a loss (Tax Loss Harvesting).");
	            }
	        }

	        if (riskTol == 3 && safeGoal) {
	            System.out.println("! CONTRADICTION: High Risk tolerance but 'Safety' goal selected. Review strategy.");
	        }
	        
	        if (stocks.size() < 3) {
	            System.out.println("* ADVICE: Portfolio is concentrated. Add more unique stocks for diversification.");
	        }
	    }
	}