/*
 * Write a method named tax that accepts a salary as a parameter
 * and that returns the amount of tax you would owe if you make that salary.
 * The tax is based on your tax bracket as found from the first two columns below.
 * Once you know which row to use, start with the "flat amount"
 * and add the "plus %" of the amount over the amount listed in the final column.
 * For example, if your income is $50,000, then you use the third row of the table
 * and compute the tax as $4,000 plus 25% of the amount over $29,050, which comes to $9,237.50.
 * The total tax on $27,500 is $3,767.50. For $6,000, the tax is $600. For $120,000,
 * the tax is $28,227. Assume your method is passed a value >= 0.
 *
 * over     but not over    flat amount     plus %      of excess over
 * $0       $7,150          $0              10%         $0
 * $7150    $29,050         $715            15%         $7,150
 * $29,050  $70,350         $4000           25%         $29,050
 * $70,350  unlimited       $14,325         28%         $70,350
 */

class Salary{
    public static void main(String[] args) {
       System.out.println(tax(50000));
       System.out.println(tax(27500));
       System.out.println(tax(6000));
       System.out.println(tax(120000));
       System.out.println(tax(0));

    }

    public static double tax(double salary){
        if(salary >= 0 && salary < 7150){
           return salary * 0.1;
        } else if(salary >= 7150 && salary < 29050) {
            return 715 + (salary - 7150) * 0.15;
        } else if(salary >= 29050 && salary < 70350) {
            return 4000 + (salary - 29050) * 0.25;
        } else
            return 14325 + (salary - 70350) * 0.28;
    }


}
