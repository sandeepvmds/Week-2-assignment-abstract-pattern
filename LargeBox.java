class LargeBox extends Box
{
	LargeBox(Purpose purpose)
    {
        super(BoxSize.LARGE,purpose );
        construct();
    }
      
    @Override
    void construct()
    {
        System.out.println("Large size storage box");
    }
}
