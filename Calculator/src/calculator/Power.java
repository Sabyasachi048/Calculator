/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Sabyasachi
 */
public class Power {
    double p=1;       
//    public double Powe(double x, double y);
    public Power(double x, double y)
    {
        p = Powe(x,y);
    }
    public double Powe(double x, double y)
    {
        if(y==0)return 1;
        if(y==1)return x;
        if(y%2==0)
        {
            double a= Powe(x,y/2);
            return a*a;
        }
        else
        {
            double a = x;
            return a*Powe(x,y-1);
        }
    }
    public double getPower()
    {
        return p;
    }
}
