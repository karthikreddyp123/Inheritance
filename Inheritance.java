class Inheritance{
    public static void main(String args[]) {
        System.out.println("Implementation of Inheritance.");
        Oracle oracle =new Oracle();
        oracle.create();
        oracle.update();
        oracle.ROWNUM();
        SQLSERVER sqlserver =new SQLSERVER();
        sqlserver.create();
        sqlserver.update();
        sqlserver.TOP();
    }
}