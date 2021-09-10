class AbstractDesign 
{
    public static void main(String[] args)
    {
        System.out.println(StorageBoxFactory.makeBox(BoxSize.LARGE, Purpose.HEAVY));
        System.out.println("------------------------------------------------");
        System.out.println(StorageBoxFactory.makeBox(BoxSize.MEDIUM, Purpose.MODERATE));
        System.out.println("------------------------------------------------");
        System.out.println(StorageBoxFactory.makeBox(BoxSize.SMALL, Purpose.LIGHT));
    }
}
