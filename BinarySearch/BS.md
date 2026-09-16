Problem in mid=(lo+hi)/2 ..?  -->Integer Overflow Error.

lo=10,  hi=Integer.MAX_VALUE // (2^31)-1



 5  9
(lo+hi)/2  != lo/2 + hi/2;   coz...

(5+9)/2=7  != 5/2 + 9/2 = 2+4=6

7!=6 wrong 

mid=(lo+hi+lo-lo)/2  --> (2*lo+(hi-lo))/2 --> mid=lo+(hi-lo)/2;

mid=lo+(hi-lo)/2; this is only safe when both lo & hi are non -ve..
