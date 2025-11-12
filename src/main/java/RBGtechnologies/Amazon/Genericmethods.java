public class Genericmethod 
{
  webdriver driver;
  public void openbrowser(String browsername)
  {
if(browsername.equals("chrome"))
{
  driver=new chromedriver();
}
    else if(browsername.equals("edge"))
    {
    driver=new edgedriver();
    }
  }
}
