import java.util.Iterator ;
import java.lang.Class;
/**
 * Décrivez votre classe ListeP_T ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public  class ListeP_Tab implements ListePointInterface 
{
     /**
      * ATTENTION, ATTENTION,
      * il est plus facile d'ajouter des objets à la fin d'un tableau 
      * qu'au début d'un tableau 
      * car en ajoutant au début il faudrait à chaque fois décaler tous les éléments du tableau.
      * Alors dans le tableau d'implantation 'liste' la tête de liste est le dernier du tableau
      */  
     
    // variables d'instance / attributs 
    private Object []  tabImplantation;
    protected int nbreElements;  // nombre d'éléments de la liste, donc on aura toujours nbreElements&lt;=tabImplantation.length
    
    public ListeP_Tab(){
        tabImplantation= new Object [3];  //3 ou n'importe quel autre nombre &gt;0 d'éléments
    }
/**
 * retourne la tête de la tabImplantation. lecture seulement
 */
    public Object car() throws ListeVideException
    { 
        if(nbreElements<1){throw new ListeVideException();}
        else{
        return tabImplantation[nbreElements-1];
    }
     }
/**
 * destruction du premier élément de la tabImplantation
 */
      public void cdr()throws ListeVideException {
          if(nbreElements<1){throw new ListeVideException();}
        else{
            System.out.println(tabImplantation[nbreElements-1]);
          tabImplantation[nbreElements-1]=null;
          nbreElements--;
        }
       }
 /**
  * procédure : ajout d'un objet quelconque en début de tabImplantation
  */   
    public void cons(Object object){ 
        Object [] temp=new Object[tabImplantation.length+1];
        if(nbreElements==tabImplantation.length-1){
            System.arraycopy(tabImplantation,0,temp,0,tabImplantation.length-1);
            tabImplantation=temp;
        }
        tabImplantation[nbreElements]=object;
        nbreElements++;
        System.out.println(nbreElements);
       }
       /**
        * procédure : concaténation d'une tabImplantation sur 'this'
        * ATTENTION cette version ne permet que la concaténation d'une 'ListeP_Tab'
        * réfléchir à la version générale...
        */
    public void conc(ListePointInterface lst ){
        ListeP_Tab l=(ListeP_Tab)lst;
         Object [] temp=new Object[tabImplantation.length+lst.longueur()-1];
         System.arraycopy(tabImplantation,0,temp,0,nbreElements);
         System.arraycopy(l.tabImplantation,0,temp,nbreElements,l.nbreElements);
         this.tabImplantation=temp;
         nbreElements=nbreElements+lst.longueur();
       }
/** 
 * procédure : retourner une tabImplantation sur elle même
 */ 
    public void renverse(){
        if(nbreElements!=0 && nbreElements!=1){
        Object[] temp= new Object[nbreElements];
        for(int i=0 ; i<nbreElements ; i++){
            temp[i]=tabImplantation[nbreElements-1-i];
           }
           tabImplantation=temp;
       }
    }
/**
 * prédicat : objet est-il membre de la liste ?
 * ATTENTION à ne pas comparer n'importe quoi et obtenir "un false silencieux"
 */
    public boolean membre(Object o){
           boolean isMember=false;
        for(int i=0;i<nbreElements;i++){
            if(o.getClass().getName().equals(tabImplantation[i].getClass().getName())){
                if(o.equals(tabImplantation[i])){
                    isMember=true;
                    break;
                }
            }
        }
        return isMember; 
    }
    
    public boolean listeVide(){     
        return nbreElements==0;
    }
    public int longueur(){
        return nbreElements;
    }
    
// méthodes de services "imposées" par Java
        
    public String toString(){
        if(nbreElements==0) return "[]";
        String s="[";
        for(int i=nbreElements-1 ; i>0 ; i--){
            s+=tabImplantation[i].toString()+",";
        }
        return nbreElements+s+tabImplantation[0]+"]";
    }    

    public boolean equals(Object liste){
        if(!(liste instanceof ListePointInterface)){
            return false;
        }
        if(nbreElements!=((ListePointInterface)liste).longueur()){
            return false;
        }
           /*
            * à compléter...
            * avec soin.
            */
        return false;
    }    

}