# Arouter Module
利用Arouter实现的模块化框架，可以单独编译运行某个module，通过开关修改依赖关系。

这个项目的框架如下图：


![](/pic.jpg)

最上层是app层，承接所有的业务。依赖每个业务module和接口lib_base

第二层是业务层，根据不同的需求和业务，剥离出各个module。只依赖lib_base，并且实现接口。

第三层是base层，放置各个业务暴露出来的接口，或者一些非常基础的公共类、库等。

三层逻辑中，抽离的是业务层代码，base层不作操作。所有的依赖控制，都在项目的gradle.properties文件中，用**isModule**的值控制。


![](/gradle.properties.png)

同时在app层做好分离的build.gradle配置

![](/app.png)

在业务层module中的build.gradle配置

![](/module1.png)

![](/module2.png)


这样在切换的时候，模块就可以在library和application之间切换，在开发者开发不同模块时，可以为每个module添加独有的变量开关，当只开发自己模块的时候，只需先单独module运行，测试完毕后再接入app，最后进行调试。这避免了整个工程运行的耗时，往往工程越大，项目跑一次的时间也就越久，从而节省时间，加快效率。





