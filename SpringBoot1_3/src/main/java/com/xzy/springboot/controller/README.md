swagger分析
=
* 首先需要建立一个swagger2的配置文件
  * 配置文件中含有两个方法，第一个方法是配置整体swagger 返回Docket 其中包含的数据为
    * apiInfo 显示信息例如标题，说明
    * select()是为了选择api和路径
    * api() 是为了监控指定api。例如RequestHandlerSelectors.basePackage("com.xzy.springboot.controller")  也可以使用RequestHandlerSelectors.any()来对所有的api进行监控
    * path() 监控路径 例如PathSelectors.any()监控所有路径
    * build() 建立
  * 第二个方法为方法一中apiInfo的参数
    * title() 标题
    * description() swagger描述
    * termsOfServiceUrl()条款地址（不可见）
    * version() 版本号
    * build() 建立 类似于结束方法
* 还要在需要构建api的方法中进行相关配置
  * 在该服务的需要进行构建api的方法上添加@ApiOperation注解来进行每个方法API的说明
    * value 为每个api后方的说明文字说明该api的作用
    * note 可以理解为每个API的详细介绍
  * @ApiImplicitParam注解是给参数添加的说明
    *  name 为传入参数的名字
    * value 为传入参数的描述
    * required 为参数是否必填
    * dataType 为参数类型
    * PS:如果requestMapping注解传入的url为${id}类型，则需要添加另一个该注解的属性paramType="path"来指明路径
