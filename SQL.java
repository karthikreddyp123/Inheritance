class SQL{
    public SQL(){
        System.out.print("Intializing queries to create ");
    }
    protected void create(){
        System.err.println("Creating Table.");
    }
    protected void delete(){
        System.out.println("Deleting Table.");
    }
    protected void update() {
        System.out.println("Updating Table.");
    }
}