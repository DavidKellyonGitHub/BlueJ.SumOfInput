/**
 * Public class SumOfInput uses method oneToNumber to return the sum of numbers between 1 and the input "numberToSum".
 * The method resets the value of the "sumAdder" placeholder to zero to prepare for future usage.
 *
 * @Dave Kelly
 * @2/5/20
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    public Integer sumAdder;
    public Integer result;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sumAdder = 0;
    }
    
    public Integer oneToNumber(Integer numberToSum){
        for (int i = 1; i <= numberToSum; i++){
            
            sumAdder += i;
        }
        result = sumAdder;
        sumAdder = 0;
        return result;
        
    }

}
