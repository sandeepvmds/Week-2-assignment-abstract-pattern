class MediumBox extends Box
{
    MediumBox(Purpose purpose)
    {
        super(BoxSize.MEDIUM, purpose);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Medium size storage box ");
    }
}
