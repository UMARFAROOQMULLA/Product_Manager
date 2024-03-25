/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.ProductManagerUtils;
import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author umarn
 */
public class OpenPdf {
    
    public static void OpenById(String id){
        try{
    if((new File(ProductManagerUtils.billPath+id+".pdf")).exists()){
        Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll.FileProtocolHandler "+ProductManagerUtils.billPath+""+id+".pdf");
        
    }
    else{
        JOptionPane.showMessageDialog(null, "File does not exist");
    }
}
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
}
    }
    

    
    
}
