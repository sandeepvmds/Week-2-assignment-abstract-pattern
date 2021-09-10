class LightBoxFactory
{
    static Box makeBox(BoxSize size)
    {
        Box box = null;
        switch (size)
        {
            case SMALL:
                box = new SmallBox(Purpose.LIGHT);
                break;
                  
                default:
                break;
              
        }
        return box;
    }
}
