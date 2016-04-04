package stockTrader;

public class Stock { 
	
	private String symbol; 		  // Stock Symbol (e.g. FB [Facebook])
	private double price;		  // Current price
	private int volume; 		  // Previous day volume
	private double pe;  		  // Price:Earning Ratio
	private double eps;			  // Earnings per Share
	private double week52low;	  // 52-week low price
	private double week52high;	  // 52-week high price
	private double daylow;		  // Daily Low
	private double dayhigh;       // Daily High
	private double movingav50day; // 50 Day Moving Average Price
	private String marketcap;	  // Total number of shares available for trade
	private String name;		  // Name of stock
	private String currency;	  // Currency of trades
	private double shortRatio;	  // Ratio of shorts to shares outstanding (shows market confidence in stock)
	private double previousClose; // Previous closing price
	private double open;		  // Most recent opening price
	private String exchange;	  // e.g NYSE/NASDAQ
	
	/////////////Constructors///////////////
	
	// No arg constructor only exists in cases of programmer error
	public Stock(){
		this.symbol = "NOT FOUND";
		this.price = -1;	
		this.volume = -1; 
		this.pe = -1; 
		this.eps = -1; 
		this.week52low = -1; 
		this.week52high = -1; 
		this.daylow = -1; 
		this.dayhigh = -1; 
		this.movingav50day = -1; 
		this.marketcap = "NOT FOUND";
		this.name = "NOT FOUND";
		this.currency = "NOT FOUND";
		this.shortRatio = -1;
		this.previousClose = -1;
		this.open = -1;
		this.exchange = "NO FOUND";
	}
	// Primary constructor provides input data for all properties
	public Stock(String symbol, double price, int volume, double pe, double eps, double week52low,      
					double week52high, double daylow, double dayhigh, double movingav50day, String marketcap, String name, String currency, double shortRatio, double previousClose, double open, String exchange) {	
		this.symbol = symbol; 
		this.price = price;	
		this.volume = volume; 
		this.pe = pe; 
		this.eps = eps; 
		this.week52low = week52low; 
		this.week52high = week52high; 
		this.daylow = daylow; 
		this.dayhigh = dayhigh; 
		this.movingav50day = movingav50day; 
		this.marketcap = marketcap;
		this.name = name;
		this.currency = currency;
		this.shortRatio = shortRatio;
		this.previousClose = previousClose;
		this.open = open;
		this.exchange = exchange;
	} 
	
	
	/////GETTERS/////
	public String getSymbol() { 
		return this.symbol;		
	}
	public double getPrice() { 		
		return this.price;		
	} 
	public int getVolume() {    
		return this.volume;     
	}
	public double getPe() {    
		return this.pe;     
	} 
	public double getEps() { 
		return this.eps;     
	}
	public double getWeek52low() {    
		return this.week52low;    
	} 
 	public double getWeek52high() {  
		return this.week52high;    
	} 
 	public double getDaylow() {    
		return this.daylow;    
	} 
	public double getDayhigh() {    
		return this.dayhigh;     
	}
	public double getMovingav50day() {     
		return this.movingav50day;  
	} 
	public String getMarketcap() { 
		return this.marketcap;
	}
	public String getName(){
		return this.name;
	}
	public String getCurrency(){
		return this.currency;
	}
	public double getPreviousClose(){
		return this.previousClose;
	}
	public double getOpen(){
		return this.open;
	}
	public String getExchange(){
		if (this.exchange.equals("NMS"))
			return "NASDAQ";
		else if (this.exchange.equals("NYQ"))
			return "NYSE";
		else
			return "UNKNOWN MARKET(" + this.exchange + ")";
	}	
	public double getShortRatio(){
		return this.shortRatio;
	}
}