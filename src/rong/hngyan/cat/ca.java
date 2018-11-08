package rong.hngyan.cat;

public class ca {
    //修改属性的可见性--private限定只能在当前类访问
    private String name;
    int[] month={1,2,3,4,5,6,7};
    String[] sjfhsf={};
    double weight;
    String species;

    public ca() {
        System.out.println("无参数构造方法！");
    }

    //创建get/set方法
    //在get和set方法中添加对属性的限制
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "我是一只名叫" + this.name + "的猫咪";
    }
}

