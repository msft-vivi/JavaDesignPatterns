[TOC]

## 第三章 Template Method
### 3.1 Template Method Definition
> **定义一个操作中的算法的骨架 (稳定)，而将一些步骤延迟(变化)到子类中**。**Template Method使得子类可以不改变
(复用)一个算法的结构即可重定义(override 重写)该算法的某些特定步骤**。

> Key point：_**Template Method 使用的前提条件是算法骨架是稳定的**，当然，如果整个骨架内部逻辑都是稳定的，那么也没必要使用设计模式了，**因为设计模式的最大的作用就是在变化和稳定之间寻找隔离点，然后分离他们，从而管理变化**_。
### 3.2 GOF-23 模式分类

#### 3.2.1 从目的来看

* **创建型（Creational）模式**
    > 将对象的部分创建工作延迟到子类或者其他对象，从而应对需求变化为对象创建时具体类型实现引来的冲击。
  
* **结构型（Structual）模式**
    > 通过类继承或者对象组合获得更灵活的结构，从而应对需求变化为对象的结构带来的冲击。

* **行为型（Behavioral）模式**
    > 通过类继承或者对象组合来划分类与对象间的职责，从而应对需求变化为多个交互的对象带来的冲击。

#### 3.2.2 从范围来看

* **类模式处理类与子类的静态关系**
    > 更倾向于继承方案
* **对象模式处理对象间的动态关系**
    > 更倾向于组合方案，一个类包含另外一个类的对象或引用（指针）

### 3.3 李建忠分类方案
#### 3.3.1 组件协作
> 主要解决类间协作问题
> 现代软件专业分工之后的第一个结果是“框架与应用程序的划分”，**“组织协作”模式通过晚绑定，来实现框架与应用程序间的松耦合**，是二者之间协作的常用模式。
* Template Method
* Strategy
* Observer / Event
    <br>
#### 3.3.2 单一职责
> 主要解决类间责任划分问题
* **Decorator**
* **Bridge**
    <br>
#### 3.3.3 对象创建
> 主要解决对象创建过程依赖关系问题
* **Factory Method**
* **Abstract Factory**
* **Prototype**
* **Builder**
    <br>

#### 3.3.4 对象性能
> **主要解决性能问题**
* **Singleton**
* **Flyweight**
    <br>

#### 3.3.5 接口隔离
* **Facade**
* **Proxy**
* **Mediator**
* **Adapter**
    <br>

#### 3.3.6 状态变化
* **Memento**
* **State**
    <br>

#### 3.3.7 数据结构
* **Composite**
* **Iterator**
* **Chain of Responsibility**
    <br>

#### 3.3.8 行为变化
* **Command**
* **Visitor**
    <br>

#### 3.3.9 领域问题
* **Interpreter**

### 3.4 重构获得模式 Refactoring to Patterns
* 面向对象设计模式是“好的面向对象设计”，所谓“好的面向对象设计”指是那些可以满足 “**应对变化，提高复用**”的设计 。
    <br>
* 现代软件设计的特征是“需求的频繁变化”。设计模式的要点是“**寻找变化点，然后在变化点处应用设计模式**，从而来更好地应对需求的变化”.“**什么时候、什么地点应用设计模式**”比“理解设计模式结构本身”更为重要。
    <br>

* **设计模式的应用不宜先入为主，一上来就使用设计模式是对设计模式的最大误用**。没有一步到位的设计模式。敏捷软件开发实践提倡的“Refactoring to Patterns”（迭代修正得到模式）是目前普遍公认的最好的使用设计模式的方法。  

### 3.5 推荐图书
* 《重构——改善既有代码的设计》
    > 《Refactoring Improving the Design of Exsting Code》
* 《重构与模式》
    > 《Refactoring to Patterns》

### 3.6 重构关键技法
* **静态** -> **动态**
* **早绑定** -> **晚绑定**
* **继承** -> **组合**
* **编译时依赖** -> **运行时依赖**
* **紧耦合** -> **松耦合**

### 3.7 Tempate Method Example
* **没有使用模板方法**
  > 这里为了方便没有自己画图，这里的程序主流程被放到 Main1.java 里面
  > 这里所说的主流程不是指 main 在什么地方，而是指的是应用程序的核心程序（示例中的 run()方法 ）被直接写在哪里，当然也可能直接写在 main 里面，也就下图这种方法，具体参考代码 Application1.java 、Lib1.java。

<img src="img/template_method1.png" alt="GitHub" title="GitHub,Social Coding" width="500" height="300" />

<br>
<br>

* **使用模板方法**
  > 把程序核心方法 run()嵌入在框架类 (Lib2) 中，其中包括了子类需要实现的方法。客户端应用程序只需要重写这些需要改变的方法就行。具体参考 Application2、Lib2。这种实现使得**子类可以直接复用父类的代码，并且在需要改变的时候支持修改**。

<img src="img/template_method2.png" alt="GitHub" title="GitHub,Social Coding" width="500" height="300" />

<br>
<br>

* **两种实现思路对比**
  > 左侧为未使用模板方法，右侧为使用模板方法

<img src="img/template_method3.png" alt="GitHub" title="GitHub,Social Coding" width="500" height="300" />

### 3.8 UML 结构
* TemplateMethod()是稳定的部分，PrimitiveOperation1(), PrimitiveOperation2()是变化的部分（被子类重写）
<img src="img/template_method4.png" alt="GitHub" title="GitHub,Social Coding" width="500" height="300" />

### 3.9 要点总结
* Template Method模式是一种非常基础性的设计模式，在面向对象系统中有着大量的应用。它用最简洁的机制（C++虚函数的多态性以及Java多态）**为很多应用程序框架提供了灵活的扩展点，是代码复用方面的基本实现结构**。

    <br>
* 除了可以灵活应对子步骤的变化外，“**不要调用我，让我来调用你**”（例子中的Lib2调用Application2）的反向控制结构是Template Method的典型应用。
    <br>
* 在具体实现方面，被**Template Method调用的可变方法可以具有实现，也可以没有任何实现**（C++抽象方法、C++纯虚方法，Java中不可以声明为抽象方法，因为抽象方法必须把类声明为抽象类），但一般推荐将它们设置为protected（自己与子类可见）方法。


### Reference
* [C++ 虚函数与 Java 抽象函数区别](https://blog.csdn.net/yangliuy/article/details/7172228)
  > Java默认的函数就是C++的虚函数类型，可以直接使用多态
* [Java 接口中 default 方法及其使用限制](https://blog.csdn.net/ziwang_/article/details/78680446)
