/*******************************************************************
 * Practicing inheritance
 *
 * Version - 0.01 February 11 2016 @Johnny Haizel-Cobbina
 ******************************************************************/
public class EmplDriver
{
   public static void main(String[] args)
   {
      employee empl1 = new employee("Vinny", "123-A", "2/23/85");
      empl1.display();

      employee badID = new employee("Vinny", "12A-A", "2/23/85");
      badID.display();

      employee badName = new employee("V", "123-A", "2/23/85");
      badName.display();

      ProductionWorker ProdWork = new ProductionWorker("ProdWorker", "123-A", "2/23/85", 1, 15.23);
      ProdWork.display();

      ProductionWorker ProdWork1 = new ProductionWorker("ProdWorker", "123-A", "2/23/85", 2, 5.23);
      ProdWork1.display();
      
      shiftSupervisor Supervisor = new shiftSupervisor("Supervisor", "123-A", "2/23/85", 32000,2000); 
      Supervisor.display();
   }
}