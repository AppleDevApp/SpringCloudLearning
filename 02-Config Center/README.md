# Config Center 配置中心

## Project Description 项目说明
1. 04-Config-Center

Config-Center
Use Consul as the configuration center, combined with Consul-Bus as event monitoring, refresh the application key/Value by defining the interval between watches.
Compared to Spring Cloud Config, it will be relatively simple.
使用Consul作为配置中心，结合Consul-Bus作为事件监听，通过定义watch的间隔，来刷新应用Key/Value。
相对于Spring Cloud Config而言，会相对简单的多。

## Consul环境键值配置
You can see something like this to know what your source key is listen.
	Located property source: CompositePropertySource {name='consul', propertySources=[ConsulPropertySource {name='config/config-center/'}, ConsulPropertySource {name='config/application/'}]}

_例如：应用程序名config-center启用默认环境变量
在Consul中配置
	key is  :config/config-center/yourkey
	value is:yourvalue

_例如：应用程序名config-center启用test环境变量 spring.profiles.active=test
在Consul中配置
	key is  :config/config-center,test/yourkey
	value is:yourvalue

## Prepare Environment 环境准备
1. Consul

