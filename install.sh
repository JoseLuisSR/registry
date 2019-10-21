# Update package list
echo vagrant | sudo -S apt-get update

# Update Ubuntu kernel version from 3.13 to 4.4.0, ref: https://wiki.ubuntu.com/Kernel/LTSEnablementStack
echo vagrant | sudo -S apt-get install -y --install-recommends linux-generic-lts-xenial

# Install docker from a package

# Download .deb file for ubuntu/trusty64
wget https://download.docker.com/linux/ubuntu/dists/trusty/pool/stable/amd64/docker-ce_18.06.3~ce~3-0~ubuntu_amd64.deb

# Install libsystemd-journal0
echo vagrant | sudo -S apt-get install -y libsystemd-journal0

# Install docker engine for Community Edition.
echo vagrant | sudo -S dpkg -i docker-ce_18.06.3~ce~3-0~ubuntu_amd64.deb
rm docker-ce_18.06.3~ce~3-0~ubuntu_amd64.deb

# Build docker image from Dockerfile with openjdk:8 and springboot web app.
echo vagrant | sudo -S docker image build -t customer:0.0.1 .

# Deploy docker image on container.
echo vagrant | sudo -S docker container run --publish 172.28.128.10:8000:8080 --detach --name customer customer:0.0.1