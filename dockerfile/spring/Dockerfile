# イメージの指定
FROM ubuntu:22.04

# 必要なパッケージをインストール
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk && \
    apt-get -y install curl && \
    apt-get -y install zip
RUN curl -s "https://get.sdkman.io" | bash
RUN echo ". $HOME/.sdkman/bin/sdkman-init.sh; sdk install gradle" | bash

# 環境変数を設定
ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-amd64
ENV PATH $JAVA_HOME/bin:$PATH

#変数の中身を確認
RUN echo $JAVA_HOME

# ボリュームマウント先を指定
VOLUME /tmp

# 作業ディレクトリを指定
WORKDIR /app

# コンテナ内で実行するコマンド
#CMD ["java", "-jar", "app.jar"]