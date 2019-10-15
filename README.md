# Registry

Create microservices, service discovery with Eureka and docker containers to test the registry capabilities between Eureka and docker.

## Microservices

Customer is a microservice with capabilities to get and create (post) customer, it is very simply just to create many instants and
register those on Eureka, also put it on a container and deploy it many times to check docker registry.

## Docker Engine Community Eddition

Build virtual machine through vagrant box [ubuntu/trusty64](https://app.vagrantup.com/ubuntu/boxes/trusty64) and set up it to install docker engine.

Execute the below command on your local area to build and deploy virtual machine in your host with docker engine:

	vagrant up
	
It command takes install.sh file and execute all the commands that are inside it related to install docker engine, you can check those.

In progress....