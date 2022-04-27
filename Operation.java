class Operacao {

int[] moneyBills = {100, 50, 20, 10, 5, 2, 1};
//if you want different money bills, you have to change it in here.
  
 void moneyBillsQuantity(int value) // a função ne
  
  {
    for(int i = 0; i < moneyBills.length; i++)
    {
      int moneyBill = moneyBills[i];
      //so you have the int value of moneyBills[i]
      
      int partsOfTheValue = (value - (value % moneyBill) );
      //Ex: hundredths = (value - valor%100), i.e: the original value subtracted from the remainder of the division value/100, which will give me only the hundredths.
      
      int howManyBills = (partsOfTheValue /moneyBill);
      //Ex: the quantity of 100 reais money bills are the hundredths I calculated divided by 100.
      
      value -= partsOfTheValue;
      //ex: tirando as centenas do valor original, pra sobrar só partes que são divisíveis por 50, ou por 20, etc.
      //Ex: If I take of the hundreths of the original value, it will only remain the parts that are divisible by 50, by 20, by 10, etc.
   
      
      System.out.println(howManyBills + " Notas de R$ " + moneyBill + ",00" );
      //if you want the results in another currency, you change it here.
      
    }
   }
  
}
