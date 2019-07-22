package builder.demo2;

/**
 * @author taotao
 *
 * 可以构造不可变实例，并且用链式配置设置参数
 */
public class Person {
    //必填项

    private final String firstName;
    private final String lastName;

    //选填项

    private final String weight;
    private final String height;
    private final String eyesColor;
    private final String hairColor;

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.weight = builder.weight;
        this.height = builder.height;
        this.eyesColor = builder.eyesColor;
        this.hairColor = builder.hairColor;
    }

    public static class Builder{
        //必填项

        private String firstName;
        private String lastName;

        //选填项

        private String weight;
        private String height;
        private String eyesColor;
        private String hairColor;

        Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder setWeight(String weight){
            this.weight = weight;
            return this;
        }

        public Builder setHeight(String height){
            this.height = height;
            return this;
        }

        public Builder setEyesColor(String eyesColor){
            this.eyesColor = eyesColor;
            return this;
        }

        public Builder setHairColor(String hairColor){
            this.hairColor = hairColor;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }
}
