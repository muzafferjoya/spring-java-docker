**Pip Install on Ubuntu:**

$ apt-get install python3-pip
$ apt-get install unzip zip
$ pip --version


**AWS CLI Installation on Ubuntu:**

$ curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
$ unzip awscliv2.zip
$ sudo ./aws/install
$ which aws
$ aws --version
$ aws configure



**EB CLI Installation on Ubuntu:**

$ pip install awsebcli --upgrade --user
$ export PATH=$PATH:$HOME/.local/bin
$ which eb
$ eb --version


*Create a first environment*
$ mkdir eb-demo && cd eb-demo
$ echo '<h1> DevOps V1.0 </h1>' > index.html
$ eb init
$ eb create
$ eb open

*For multiple environment dev branch*

$ git checkout -b dev
$ git add index.html
$ git commit "First Commit"
$ git log
$ git status
$ git tag -a "V1.0" -m "First Version"

*For prod branch*

$ git checkout -b prod
$ git merge dev

**EB CLI Commands**

$ eb init
$ eb create
$ eb open
$ eb status
$ eb config
$ eb logs
$ eb events
$ eb list
$ eb health
$ eb deploy
$ eb use
$ eb deploy -l "eb-demo-prod v2.0"
$ eb terminate --all --force




**continuous deployment using codecommit as source provide or Elastic beanstalk as deployer**

#!/bin/bash
yum -y update
yum install -y ruby
yum install -y aws-cli
cd /home/ec2-user
wget https://aws-codedeploy-us-east-2.s3.us-east-2.amazonaws.com/latest/install
chmod +x ./install
./install auto





