class Oracle extends SQL{
    public Oracle(){
        super();
        System.out.println("Oracle Database.");
    }
    public void update(){
        System.out.println("Updating Table using Oracle query.");
    }
    public void ROWNUM(){
        System.out.println("Query to return TOP 'X' number of rows.");
    }
}