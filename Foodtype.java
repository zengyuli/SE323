import java.util.Scanner;

public class Foodtype {
private String menutype;
private String menulist;
private double price;
public FootType(String menutype,String menulist,int price) {

this.menutype = menutype;

this.menulist = menulist;

this.price = price;

}
public String getMenuType(){

return menutype;

}

public String getMenuList(){

return menulist;
}

public double getPrice (){

return price;

}

public String toString (){
return "menutype "+menutype+ "menulist  "+menulist +"price   "+price;

}

}