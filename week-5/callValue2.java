
class parent
{
    int b=20;
    parent(int a)
    {
        System.out.println("CAllByValue:"+a);
    }
    void child(parent pat)
    {
        System.out.println("call by obj:"+pat.b);
    }
}
public class callValue2  
{
    public static void main(String[] args)
    {
        int a=10;
        parent p=new parent(a);//call by value...

        p.child(p);//call by obj

    }   
}
