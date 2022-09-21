package br.com.lucas.pattern.criacionais.singleton;

public class SingletonDatabase {
    private static SingletonDatabase database;

    private SingletonDatabase(){
        System.out.println("INICIADO");
    }


    public static SingletonDatabase getInstance(){
        if(SingletonDatabase.database == null){
            SingletonDatabase.database = new SingletonDatabase();
        }

        return SingletonDatabase.database;
    }

    public String connect(){
        return "Conectado";
    }

}
