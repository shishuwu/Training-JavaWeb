# Training-JavaWeb

## Servlet
* 单实例
## JSP
本质上就是一个Servlet
作用域
* request
* page
* session
* context


## Structs
* Action/Servlet 解决了单实例问题，多实例，可以写全局变量
* Web.xml: 自定义Filter去作过滤操作（默认有filter）
* struts.xml:
	- 定义controller/action 的 path
	- 对应的controller类
	- 以及返回时对应的view
## Maven
* ThreadLocal
-- 资源copy，自动与thread-id map
-- 自动根据thread-id获取对应的资源
