# githubOTP
解决GitHub登陆二次验证码问题

### 功能
  叫我登陆GitHub还像某信一样,PC操作了之后还要~~从裤裆~~掏出手机操作一下,这样的窒息操作,我是坚决抵制的.
  
  该项目可以代替GitHub登录页推荐的android OTP APP 生成用于二次验证的One Time Password.

## 使用方法
### 已有java环境:
1. 下载 [githubOTP.zip](https://github.com/battlesteed/githubOTP/raw/master/githubOTP/githubOTP.zip);
2. 解压双击run.bat

### 没有java环境:
1. 下载自带java环境的压缩包 [githubOTPWithJre.zip](https://github.com/battlesteed/githubOTP/raw/master/githubOTP/githubOTPWithJre.7z);
2. 解压双击run.bat

### 可以保存two-factor secret吗
可以.

可以编辑run.bat把two-factor secret加到运行命令后面,这样就不用每次都输入two-factor secret了.例如

`
java -Dfile.encoding=UTF-8 -jar target/githubOTP-0.0.1-SNAPSHOT-jar-with-dependencies.jar "你的two-factor secret"
`


# 注意事项!!!!!!
## two-factor secret和github-recovery-codes非常重要,一定要妥善保管!!!!!!!!!
