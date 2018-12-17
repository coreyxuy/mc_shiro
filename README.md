shiro-learn
## 总结
###### 1.用户认证和用户授权是shiro的基础,用户认证其实就是用户登录操作,用户授权其实就是对资源的拦截
###### 2.权限管理的模型一般我们都将资源放在权限表中进行管理起来
###### 3.shiro可以基于角色拦截,也可以基于资源拦截,要是基于角色拦截的就需要修改代码了,所以需要基于资源拦截

### shiro 的核心分为;
    1.subject:包含principals(身份),份),credentials(凭证)两个部分
    2.SecurityManager:其管理者subject,是shiro的核心
    3.Realm:获取安全数据(角色,用户,权限) 安全的数据源
    4.AuthorizationInfo 为当前用户信息授予角色和权限
    5.AuthenticationInfo :身份认证/登录验证用户是否拥有相应的省份
    6.SessionManager:shiro自己会话管理容器 
    
    