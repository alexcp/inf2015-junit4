class Valider{

    public static void presence(Object object) throws Exception{
        if( object == null || object == "")
            throw new Exception();
    }
    
}
