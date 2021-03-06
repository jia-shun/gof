## GoF 设计模式

#### 一：迭代器模式 Iterator
为什么要考虑引入Iterator这种复杂的设计模式呢？直接使用for循环语句进行遍历不就可以了吗？
一个重要的理由是：引入Iterator后可以将遍历和实现分离开来。也就是当我们遍历一个数组对象或List对象的时候，
不依赖于对象的具体实现，不管对象如何变化，只要对象的iterator()方法能返回Iterator实例即可。

#### 二：适配器模式：Adapter
适配器模式的核心在于：让原有的代码可以复用。
如果一开始就能将框架开发出包罗万象的效果，适配器模式将没有意义。但遗憾的是任何一套软件都有可能随着技术的发展，
业务的需求等原因做出改变。或者当我们接手别人的代码，当不想改变原有功能逻辑的情况下加入相关类似的需求。都可以
考虑使用适配器模式。

#### 三：模板方法模式：TemplateMethod
模板方法模式更好的体现了面向对象的抽象特点，将子类共同的功能抽象成父类，父子之间互相协作。即使产生Bug，也只需
修改模板代码即可。在此模式中，处理的流程定义在父类中，而具体的实现则交给了子类。

#### 四：工厂方法模式：FactoryMethod
对于工厂方法模式，我们可以将利用：产品，创建者，具体的产品，具体的创建者四个角色。产品和产品的创建者(工厂)为父类，
而具体的产品和具体的创建者为子类，这样可以更好的将父类与具体子类松耦合。可以理解父类为框架，而子类为具体的实例。
这样我们不用每次去new实例，直接在框架中进行开发，用到实例的时候直接去框架(工厂)去取即可。

#### 五：单例设计模式：Singleton
单例：一个对象有且只有一个实例。单例实现的核心在于：构造方法私有化，然后通过静态方法访问对象实例。单例模式比较常见，
比如：一个二手车网站，每辆车都是唯一的，卖完就没有了。一个电商网站抽奖，每种奖品有且只有一件。Spring的Bean也是单例的。
但在单例的实现过程中要注意线程安全问题。

#### 六：原型设计模式：Prototype
原型模式的核心在于让一个原型克隆自身从而创建一个新的对象。这样不使用关键字new也可以创建新对象，可以免去类初始化的过多资源
消耗。当对象种类很多，通过复制使对象的创建更灵活。还可以使用Prototype实现框架与对象实例的解耦。但clone()是浅复制，如果被复制的对象
属性有引用数据类型，复制可能会达不到我们想要的结果，或者实现起来比较繁琐。。

#### 七：建造者模式：Builder
建造者模式考虑使用一个固定流程的框架建立一个模型。该模型可以分为以下三个角色：建造者原型，建造者具体实现，监工。调用者无需关心模型
创建的步骤，只需要知道自己想要什么就可以了。将要求告诉监工，监工拥有原型实例，so使用原型的骨架组件进行创建。

