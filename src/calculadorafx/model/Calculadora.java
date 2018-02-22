/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafx.model;

/**
 *
 * @author Aisem
 */
public class Calculadora {
    String operando1;
    String operando2;
    String op;
    String resultado;
    

    public Calculadora() {
        this.operando1 = "";
        this.operando2 = "";
        this.op = "";
        this.resultado = "";
    }

    public String getResultado() {
        return resultado;
    }
    
    public void cargarNumero(int operando){
        if(!"=".equals(op)){
            operando2 += operando;
            resultado = operando2;  
        }else{
            operando1 = "" + operando;
            resultado = operando1;
        }
        
    }
    
    public void operar(String operador){
         if(!"".equals(op)){
            if(!"".equals(operando2)){
                switch(op){
                    case("+"):
                        try{
                            int suma = Integer.parseInt(operando1) + Integer.parseInt(operando2);
                            resultado = "" + suma;
                            operando1 = resultado;
                        }
                            catch(Exception excepcion){
                            double suma = Double.parseDouble(operando1) + Double.parseDouble(operando2);
                            resultado = ""+suma;
                        }
                        
                        break;
                    case("-"):
                        int resta = Integer.parseInt(operando1) - Integer.parseInt(operando2);
                        resultado = "" + resta;
                        operando1 = resultado;
                        break;
                    case("x"):
                        int multiplicacion = Integer.parseInt(operando1) * Integer.parseInt(operando2);
                        resultado = "" + multiplicacion;
                        operando1 = resultado;
                        break;
                    case("/"):
                        if(Integer.parseInt(operando1) % Integer.parseInt(operando2)== 0){
                            int division = Integer.parseInt(operando1) / Integer.parseInt(operando2);
                            resultado = "" + division;
                        }else{
                            double division= Double.parseDouble(operando1)/Double.parseDouble(operando2);
                            resultado = "" + division;
                        }
                        operando1 = resultado;
                        break; 
                }
            }
            op = operador;
        }else{
            op = operador;
            operando1 = operando2;
        }
        operando2 = "";
    }
    
    public void limpiar(){
        this.op = "";
        this.operando1 = "";
        this.operando2 = "";
        this.resultado = "0";
    }
}
