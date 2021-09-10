abstract class Box
{
    Box(BoxSize size, Purpose purpose)
    {
        this.size = size;
        this.purpose = purpose;
    }
   
    abstract void construct();
   
    BoxSize size = null;
    Purpose purpose = null;
   
    BoxSize getsize()
    {
        return size;
    }
   
    void setsize(BoxSize size)
    {
        this.size = size;
    }
   
    Purpose getPurpose()
    {
        return purpose;
    }
   
    void setPurpose(Purpose purpose)
    {
        this.purpose = purpose;
    }
   
    @Override
    public String toString()
    {
    	return "It is used to store "+purpose+" materials ";
    }
}