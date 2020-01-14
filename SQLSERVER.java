class SQLSERVER extends SQL{
    public SQLSERVER(){
        super();
        System.out.println("SQLSERVER Database.");
    }
    public void update(){
        System.out.println("Updating Table using SQLSERVER query.");
    }
    public void TOP(){
        System.out.println("Query to return TOP 'X' number of rows.");
    }
}