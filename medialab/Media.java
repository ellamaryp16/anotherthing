
/**
 * Abstract class Media - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Media
{
    // instance variables - replace the example below with your own
 private int rating;
 private double price;
 private String title;
 private boolean favorite;
  public Media ()
  {
   this.rating = 10;
   this.title="House of the Rising Sun";
   this.price = 1.0;
   this.rating = 10;
   this.title = "Wee Free Men";
   this.price = 5.8;
   this.rating = 10;
   this.title = "Ponyo";
   this.price = 11.9;
   this.title = "bulletproof heart";
   this.price = 1.0;
   this.rating = 9;
   this.title = "Dance. Dance.";
   this.price = 2.33;
   this.rating = 9;
  }   
  public String getTitle() 
  {
   return title;     
  }
  public double getprice() 
  {
   return price;
  }
  public int getRating()
  {
   return rating;
  }
  public void setsong (int r, double j,String t, String a, double b, int c) 
  { 
   rating = r;
   price = j;
   title = t;
   title = a;
   price = b;
   rating = c;
  }
  public void addtoFavorites()
  {
   favorite = true;
  }
  public String getBookTitle() 
  {  
   return title; 
  }
  public double getBookPrice ()
  {
   return price;
  }
  public int getBookRating()
  {
   return rating;
  }
  public void setBook(String a,double b, int c) 
  {
   title = a;
   price = b;
   rating = c;
  }
 private int time;   
  public String getMovieTitle() 
  {  
   return title;          
  }
  public double getMovieprice ()
  {
   return price;
  }
  public int getMovieRating()
  {
   return rating;
  }
  public void setMovie(String t, double j,int r,int d) 
  {
   title = t;
   price = j;
   rating = r;
  }
}


