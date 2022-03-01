public class <%= classify(entity) %> {

    private Integer id;
    private String <%= property %>;

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String get<%= capitalize(property) %>(){
        return this.<%= property %>;
    }

    public void set<%= capitalize(property) %>(String <%= property %>){
        this.<%= property %> = <%= property %>;
    }
}