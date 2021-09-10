class HeavyStorageBoxFactory
{
    public static Box makeBox(BoxSize size)
    {
        Box box = null;
        switch (size)
        {
            case LARGE:
                box = new LargeBox(Purpose.HEAVY);
                break;
                   
                default:
                break;
              
        }
        return box;
    }
}
