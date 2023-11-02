class Branch
{
  public static void main(String args[])
      {
          String branch= "CSE";
           switch(branch)
        {
           case "MECH":
                              int firstyear_fee=25000;
                                System.out.println(firstyear_fee);
                             int secondyear_fee=25000;
                            System.out.println(secondyear_fee);
                              int thirdyear_fee=25000;
                            System.out.println(thirdyear_fee);
                            int fourthyear_fee=25000;
                            System.out.println(fourthyear_fee);
                          double total=(firstyear_fee+secondyear_fee+thirdyear_fee+fourthyear_fee);
                                System.out.println("total fee is:" +total);
                                  break;
        case "ECE":
                              int firstyear=35000;
                            System.out.println(firstyear);
                             int secondyear=35000;
                            System.out.println(secondyear);
                              int thirdyear=35000;
                            System.out.println(thirdyear);
                            int fourthyear=35000;
                            System.out.println(fourthyear);
                          double total1=(firstyear+secondyear+thirdyear+fourthyear);
                                System.out.println("total fee is:" +total1);
                                  break;
       case "EEE":
                              int first=45000;
                            System.out.println(first);
                             int second=45000;
                            System.out.println(second);
                              int third=45000;
                            System.out.println(third);
                            int fourth=45000;
                            System.out.println(fourth);
                            double total2=(first+second+third+fourth);
                                System.out.println("total fee is:" +total2);
                               break;
      default :      System.out.println("invalid statement");
        }    
      }
}