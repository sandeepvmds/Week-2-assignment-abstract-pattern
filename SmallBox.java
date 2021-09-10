class SmallBox extends Box
{
    SmallBox(Purpose purpose)
    {
        super(BoxSize.SMALL, purpose);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Small size Storage Box");
    }
}
