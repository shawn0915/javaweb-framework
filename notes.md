# Notes

## chapter 1

- 搭建 maven 工程
- Servlet 3.0框架

## chapter 2

> maven管理工程，引入servlet3.0框架，实现mvc三层结构，
DB使用MySQL，连接池为dbcp2(apache)

- 搭建 webapp 工程
- MVC三层结构
  - model
  - controller
  - service
- 设计URL
- 将Connection存入ThreadLocal

> IDEA 使用技巧
- 单元测试JUnit
  - 在class文件上Ctrl + Shift + T创建测试用例文件
- 创建Java源文件夹
按快捷键Ctrl+Alt+Shift+S打开Project Structure，点击Moudles，找到刚才创建的文件夹，右键，选择Sources文件夹变成蓝色，设置完成。或者通过点击下图箭头所指的Marks as Sources来设置。当然，有些朋友可能已经看到旁边的快捷键Alt+S了，三种方法效果是一样的。

> 访问地址

```html
http://localhost:8080/chapter2/customer
```

## chapter 3

### smart-framework

> 没有引入整体框架，而是引入第三方开源项目以搭建轻量级web框架

> annotation 注解

***meta-annotation***

- @Target
```html
表示该注解用于什么地方。如果不明确指出，该注解可以放在任何地方
ElementType.TYPE:用于描述类、接口或enum声明
ElementType.FIELD:用于描述实例变量
ElementType.METHOD
```
- @Retention
```
定义该注解的生命周期。
    
    RetentionPolicy.SOURCE – 在编译阶段丢弃。这些注解在编译结束之后就不再有任何意义，所以它们不会写入字节码。@Override, @SuppressWarnings都属于这类注解。
    
    RetentionPolicy.CLASS – 在类加载的时候丢弃。在字节码文件的处理中有用。注解默认使用这种方式。
    
    RetentionPolicy.RUNTIME– 始终不会丢弃，运行期也保留该注解，因此可以使用反射机制读取该注解的信息。我们自定义的注解通常使用这种方式。
```
- @Documented
- @Inherited

> IoC, Inversion of control, 控制反转

> DI, Dependency Injection, 依赖注入

> 小结

- 定义了一系列注解
- 通过一系列Helper类初始化MVC框架
- 通过DispatcherServlet处理所有请求
- 根据请求方法与请求路径调用具体的Action方法

### module - chapter 3

> 依赖于 smart-framework 框架


## chapter 4

> AOP, Aspect-Oriented Programming, 面向切面编程

- 概念
  - 相关术语
  - 增强类型
- 方案
  - 写死代码
  - 静态代理
  - 动态代理
    - JDK
    - CGLib
  - Spring AOP
  - Spring AspectJ
    - 基于注解(@Aspect)
    - 基于配置(<aop:config>)
    

