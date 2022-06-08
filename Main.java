public double myPow(double x, int n) {
    if (n == 0) {
        return 1.0d;
    } else if (n == 1) {
        return x;
    } else if (n == -1) {
        return 1/x;
    }
    
    if (n%2==0) {
        double val = myPow(x,n/2);   
        return val*val;
    } else {
        double val = myPow(x,(n-1)/2);  
        return x*val*val;
    }
}