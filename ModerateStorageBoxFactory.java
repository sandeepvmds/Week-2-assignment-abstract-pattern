class ModerateStorageBoxFactory
{
    public static Box makeBox(BoxSize size)
    {
        Box box = null;
        switch (size)
        {
              
            case MEDIUM:
                box = new MediumBox(Purpose.MODERATE);
                break;
                  
                default:
                break;
              
        }
        return box;
    }
}
