/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.tradutor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import org.json.JSONArray;

/**
 *
 * @author Gustavo
 */
public class Tradutor{

    private String portugues;
    private String ingles;
    
    public Tradutor(){
        
        
    }
    
    public boolean validFrases(String en, String pt) throws Exception{
    
        String p1 = callUrlAndParseResult("pt","en",pt);
        String p2 = callUrlAndParseResult("en","pt",en);
        if (p1.trim().equals(en)&&p2.trim().equals(pt)){
            System.out.println("VALIDADO");
            System.out.println("Tradução EN:"+p1);
            System.out.println("Entrada  EN:"+en);
            System.out.println("Tradução PT:"+p2);
            System.out.println("Entrada  PT:"+pt);
            this.ingles = p1;
            this.portugues = p2;
            return true;
        }else{
            System.out.println("CORRIGIR ENTRADA");
            System.out.println("Tradução EN:"+p1);
            System.out.println("Entrada  EN:"+en);
            System.out.println("Tradução PT:"+p2);
            System.out.println("Entrada  PT:"+pt);
            return false;
        }   
    }
    
    private String callUrlAndParseResult(String langFrom, String langTo, String word) throws Exception 
    {
        String url = "https://translate.googleapis.com/translate_a/single?"+
        "client=gtx&"+ "sl=" + langFrom + "&tl=" + langTo + "&dt=t&q=" + URLEncoder.encode(word, "UTF-8");    

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection(); 
        con.setRequestProperty("User-Agent", "Mozilla/5.0");

        BufferedReader in = new BufferedReader(
          new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
         response.append(inputLine);
        }
        in.close();

        return parseResult(response.toString());
    }
    private String parseResult(String inputJson) throws Exception
    {
     /*
      * inputJson for word 'hello' translated to language Hindi from English-
      * [[["नमस्ते","hello",,,1]],,"en"]
      * We have to get 'नमस्ते ' from this json.
      */

     JSONArray jsonArray = new JSONArray(inputJson);
     JSONArray jsonArray2 = (JSONArray) jsonArray.get(0);
     JSONArray jsonArray3 = (JSONArray) jsonArray2.get(0);

     return jsonArray3.get(0).toString();
    }
    
    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

}
