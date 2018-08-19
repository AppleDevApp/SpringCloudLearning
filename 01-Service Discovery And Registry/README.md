# Service Regist And Discovery 服务注册与发现

## Project Description 项目说明
1. 01-Registry-Discovery
2. 02-Registry-Service
3. 03-Registry-Service-Next

Registry-Service/Registry-Service-Next
Register the service to the data center, configure the service name and instance ID in the configuration file as the service provider.
负责注册服务到数据中心，在配置文件中配置服务名称以及实例ID，作为服务提供商。

Registry-Discovery
As a service user, the address of the service is obtained by load balancing and invoked.
The declaration of the service, encapsulated by an interface (Feign), is automatically loaded when invoked, using Ribbon.
作为服务使用者，通过负载均衡的方式，获取到服务的地址并进行调用。
服务的声明，通过接口的方式(Feign封装)，调用时会自动进行负载均衡，里面使用了Ribbon。

## Prepare Environment 环境准备
1. Consul

