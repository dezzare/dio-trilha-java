package com.projectfila;

public class Fila {
    private No refNoEntradaDaFila;

    public Fila(){
        this.refNoEntradaDaFila = null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaDaFila);
        refNoEntradaDaFila = novoNo;
    }

    public No dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaDaFila;
            No noAuxiliar = refNoEntradaDaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }
    public No first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaDaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaDaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaDaFila;

        if(refNoEntradaDaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() + "}]-->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
