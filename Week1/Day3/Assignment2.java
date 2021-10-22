package Day3;
public class Assignment2 {
  
    public static void main(String args[]) {
      
        //Creating object using Builder pattern in java
		
		  Cake whiteCake = new Cake.Builder(71,0.5,2).vanila(2).flour(1.5).milk(0.5).build();
		 
        //Cake is ready to eat :)
        System.out.println(whiteCake);
    }
}

class Cake {

    private final double sugar;   //cup
    private final double butter;  //cup
    private final int eggs;
    private final int vanila;     //spoon
    private final double flour;   //cup
    private final double milk;  //cup
    private final int cherry;

    /*static void met1()
    {
    	System.out.println(this);
    	
    }*/
    //inner class
    public static class Builder {

        private double sugar;   //cup
        private double butter;  //cup
        private int eggs;
        private int vanila;     //spoon
        private double flour;   //cup
        private double milk;  //cup
        private int cherry;

        //builder methods for setting property
       // public Builder sugar(double cup){this.sugar = cup; System.out.println(this); return this; }
       // public Builder butter(double cup){this.butter = cup; System.out.println(this); return this; }
       // public Builder eggs(int number){this.eggs = number; System.out.println(this); return this; }
        public Builder vanila(int spoon){this.vanila = spoon; return this; }
        public Builder flour(double cup){this.flour = cup;return this; }
        public Builder milk(double cup){this.milk = cup; return this; }
        public Builder cherry(int number){this.cherry = number; return this; }
      
      public Builder(double sugar,double butter,int eggs) {
    	  
    	  this.sugar=sugar;
    	  this.butter=butter;
    	  this.eggs=eggs;
      }
        
        
        //return fully build object
        public Cake build() {
            return new Cake(this);
        }
    }

    //private constructor to enforce object creation through builder
    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanila = builder.vanila;
        this.flour = builder.flour;
        this.milk = builder.milk;
        this.cherry = builder.cherry;       
    }

	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + ", flour="
				+ flour + ", milk=" + milk + ", cherry=" + cherry + "]";
	}

   
  
}