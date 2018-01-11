1.下载kafka安装包、并安装：

    下载地址：http://kafka.apache.org/
    
        
    安装:
    tar -zxvf kafka_2.11-0.11.0.0.tgz
2.修改kafka配置文件 server.properties 加入如下配置：

    listeners=PLAINTEXT://192.168.0.195:9092      #使其他主机访问
    auto.create.topics.enable = true       #自动创建topic

3.开启9092端口，使外部可以访问。

4.启动kafka：

    cd kafka_2.11-0.11.0.0
    bin/zookeeper-server-start.sh config/zookeeper.properties &  # 先启动zookeeper
    bin/kafka-server-start.sh config/server.properties & # 启动kafka服务

5.打开项目选择KafkaApplication并运行。
