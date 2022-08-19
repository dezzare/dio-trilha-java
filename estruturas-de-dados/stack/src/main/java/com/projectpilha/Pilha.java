package com.projectpilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noRetirado = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noRetirado;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){

        return refNoEntradaPilha == null ? true : false;

    }

    @Override
    public String toString() {
       String stringDeRetorno = "------------------\n";
       stringDeRetorno +=       "      Pilha       \n";
       stringDeRetorno +=       "------------------\n";

       No noAuxiliar = refNoEntradaPilha;

       while(true){
           if(noAuxiliar != null){
                stringDeRetorno += "   [No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
           } else {
               break;
           }
       }

       stringDeRetorno += "==================\n";
       return stringDeRetorno;
    }
}
