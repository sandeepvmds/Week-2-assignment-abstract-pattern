class StorageBoxFactory
{
    public static Box makeBox(BoxSize size, Purpose purpose)
    {
        Box box= null;
       //Purpose purpose= Purpose.HEAVY;   
        switch(purpose)
        {
            case MODERATE:
                box = ModerateStorageBoxFactory.makeBox(size);
                break;
                  
            case LIGHT:
                box = LightBoxFactory.makeBox(size);
                break;
                      
            case HEAVY:
                box = HeavyStorageBoxFactory.makeBox(size);
                break;
            
            default:
                break;
  
        }
          
        return box;
  
    }
}
