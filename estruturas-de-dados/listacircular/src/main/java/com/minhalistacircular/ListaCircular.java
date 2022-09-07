package com.minhalistacircular;

public class ListaCircular<T> {
    
    private No<T> head;
    private No<T> tail;
    private int listSize;
    
    public ListaCircular(){
        this.tail = null;
        this.head = null;
        this.listSize = 0;
    }
    
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.listSize == 0){
            this.head = novoNo;
            this.tail = this.head;
            this.head.setNoProximo(tail);
        } else{
            novoNo.setNoProximo(this.tail);
            this.head.setNoProximo(novoNo);
            this.tail = novoNo;
        }
        this.listSize++;
    }
    
    public void remove(int index){
        if(index >= this.listSize){
            throw new IndexOutOfBoundsException("Indice maior que o tamanho da lista");
        }
        No<T> noAuxiliar = this.tail;
        if(index ==0){
            this.tail = this.tail.getNoProximo();
            this.head.setNoProximo(this.tail);
        } else if(index ==1){
            this.tail.setNoProximo(this.tail.getNoProximo());
        } else {
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.listSize--;
    }
    
    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    
    private No<T> getNo(int index) {
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("Lista vazia");
        }
        
        if(index == 0 ){
            return this.tail;
        }
        
        No<T> noAuxiliar = this.tail;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        
        return noAuxiliar;
    }
    
    public boolean isEmpty(){
        return this.listSize == 0 ? true : false;
    }
    
    public int size(){
        return this.listSize;
    }
    
    @Override
    public String toString() {
        String strRetorno = "";
        
        No<T> noAuxiliar = this.tail;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteúdo= " + noAuxiliar.getConteudo() + " }]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        
        strRetorno += this.size() != 0 ? "(Retorna ao início)" : "[]";
        
        return strRetorno;
    }
}
