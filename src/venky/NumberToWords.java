package venky;

public class NumberToWords {

	public static int getDigitCount( int a) {
		int count =0;
		if (a<0) { return -1;}
		while (a>0) {
			a=a/10;
			++count ;
			
		}
		
		return count;
	}
	
	public static int reverse(int a) {
	int r,re=0;
	boolean isNeg=false;
	if(a<0) {
		a=Math.abs(a);
		isNeg=true;
	}
	while(a>0) {
		r=a%10;
		re=re*10+r;
		a/=10;
	}
	if(isNeg==true) { return -re;}
	return re;
	}
	public static void numberTowords(int number) {
		if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reverseNumber = reverse(number);
            int numberDigitCount = getDigitCount(number);
            int reverseNumberDigitCount = getDigitCount(reverseNumber);
            String s = "";
            int remainder = 0;
            while (reverseNumber > 0) {
                remainder = reverseNumber % 10;
                switch(remainder) {
                    case 0:
                        s = s + "Zero ";
                        break;
                    case 1:
                        s = s + "One ";
                        break;
                    case 2:
                        s = s + "Two ";
                        break;
                    case 3:
                        s = s + "Three ";
                        break;
                    case 4:
                        s = s + "Four ";
                        break;
                    case 5:
                        s = s + "Five ";
                        break;
                    case 6:
                        s = s + "Six ";
                        break;
                    case 7:
                        s = s + "Seven ";
                        break;
                    case 8:
                        s = s + "Eight ";
                        break;
                    case 9:
                        s = s + "Nine ";
                        break;
                    default:
                        break;
                }
                reverseNumber /= 10;
            }
            if (numberDigitCount > reverseNumberDigitCount) {
                for(int i = 0; i < (numberDigitCount - reverseNumberDigitCount); i++) {
                    s = s + "Zero ";
                }

            }
            System.out.println(s);
        }


    }
	}

