### Copy S3 source from one to another bucket Using Jenkins Freestyle Project:


1. Jenkins Server with Docker Installed 


$ apt-get update
$ apt install openjdk-8-jdk -y
$ whereis jvm
$ cd java-8-openjdk-amd64/
$ pwd and copy path
$ nano /etc/environment
$ source /etc/environment
$ echo $JAVA_HOME
$ apt install docker.io -y
$ wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
$ echo 'deb https://pkg.jenkins.io/debian-stable binary/' >> /etc/apt/sources.list
$ apt update
$ apt install jenkins -y
$ usermod -aG root jenkins
$ usermod -aG docker $USER
$ usermod -aG docker jenkins
$ systemctl restart jenkins
$ systemctl restart docker


$ vim /etc/sudoers.d/90-cloud-init-users add  jenkins ALL=(ALL) NOPASSWD:ALL
$ passwd jenkins



## Go to jenkins  install aws cli under the jenkins user

$ sudo -i -u jenkins
$ apt-get install python3-pip
$ apt-get install unzip zip
$ curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
$ unzip awscliv2.zip
$ sudo ./aws/install
$ which aws
$ aws configure


