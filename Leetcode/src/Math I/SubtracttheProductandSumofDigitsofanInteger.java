public class SubtracttheProductandSumofDigitsofanInteger
{
    class Solution {
        public int subtractProductAndSum(int n)
        {
            int ans=0;
            if(n<=9)   ans=0;
            else if(n<=99)
            {
                int fir=n%10;
                int las=n%100/10;
                ans+=(fir*las)-(fir+las);
            }
            else if(n<=999)
            {
                int fir=n%10;
                int sec=n%100/10;
                int thir=n%1000/100;
                ans+=(fir*sec*thir)-(fir+sec+thir);
            }
            else if(n<=9999)
            {
                int fir=n%10;
                int sec=n%100/10;
                int thir=n%1000/100;
                int fou=n%10000/1000;
                ans+=(fir*sec*thir*fou)-(fir+sec+thir+fou);
            }
            else if(n<=99999)
            {

                int fir=n%10;
                int sec=n%100/10;
                int thir=n%1000/100;
                int fou=n%10000/1000;
                int fif=n%100000/10000;
                ans+=(fir*sec*thir*fou*fif)-(fir+sec+thir+fou+fif);
            }
            else if(n<=999999)
            {
                int fir=n%10;
                int sec=n%100/10;
                int thir=n%1000/100;
                int fou=n%10000/1000;
                int fif=n%100000/10000;
                int six=n%1000000/100000;
                ans+=(fir*sec*thir*fou*fif*six)-(fir+sec+thir+fou+fif+six);
            }
            else if(n<=9999999)
            {
                int fir=n%10;
                int sec=n%100/10;
                int thir=n%1000/100;
                int fou=n%10000/1000;
                int fif=n%100000/10000;
                int six=n%1000000/100000;
                int sev=n%10000000/1000000;
                ans+=(fir*sec*thir*fou*fif*six*sev)-(fir+sec+thir+fou+fif+six+sev);
            }
            return ans;
        }
    }
}
