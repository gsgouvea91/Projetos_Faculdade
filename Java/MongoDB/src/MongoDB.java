
import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.model.Updates;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/**
 *
 * @author Administrador
 */
public class MongoDB {
    
    private final MongoClient mongoDB;
    private final DB db;

    public MongoDB() {
      this.mongoDB = new MongoClient("localhost", 27017);
      this.db = this.mongoDB.getDB("testejava");
    }
  
    public void InserirDocumentos(String nome, String cpf,String nomeColecao){ 
        DBCollection collection = this.db.getCollection(nomeColecao);     
        BasicDBObject doc = new BasicDBObject();
        doc.put("Nome",nome);
        doc.put("CPF",cpf);
        collection.insert(doc);
    }
    
    public void ListarDocumentos(String nomeColecao){
        DBCollection collection = this.db.getCollection(nomeColecao); 
        DBCursor cursor = collection.find();
        int i=1;
        while (cursor.hasNext()) { 
            System.out.println("Documento inserido: "+i); 
            System.out.println(cursor.next()); 
            i++;
         }      
    }
    public void LocalizarDocumento(String nome,String nomeColecao){
        DBCollection collection = this.db.getCollection(nomeColecao); 
        try(DBCursor cursor = collection.find(Filters.eq("Nome",nome)).iterator()){
            while (cursor.hasNext()) { 
            System.out.println(cursor.hasNext()); 
         } 
       }
    }
 
    public void AlterarDocumento(String nomeAntigo,String nomeNovo,String nomeColecao){
        DBCollection collection = this.db.getCollection(nomeColecao);
        collection.find();
        collection.update(Filters.eq("Nome",nomeAntigo), Updates.set("Nome",nomeNovo));
        DBCursor cursor = collection.find(); 
        int i = 1;
        // Getting the iterator 
        Iterator it = cursor.iterator();
        while (it.hasNext()) { 
            System.out.println(it.next()); 
            i++; 
        } 

    }
    
    public void removerAluno(String nome,String nomeColecao){
        DBCollection collection = this.db.getCollection(nomeColecao);
        collection.remove(eq("Nome",nome));
        DBCursor cursor = collection.find(); 
        int i = 1;
        // Getting the iterator 
        Iterator it = cursor.iterator();
        while (it.hasNext()) { 
            System.out.println(it.next()); 
            i++; 
        }
    } 
}
