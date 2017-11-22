package com.star.command;

/**
 * 遥控器测试类
 * 在命令模式中担当“客户”这一角色，负责创建命令，并将一个接收者传入命令中。
 */
public class RemoteControlTest {  //客户
    public static void main(String[] args) {
        //创建遥控器
        SimpleRemoteControl remoteControl=new SimpleRemoteControl(); //调用者
        //创建一个车库门对象，也就是命令的接收者
        GarageDoor garageDoor=new GarageDoor();  //接收者
        //创建车库门打开命令，传入一个车库门对象
        GarageDoorOpenCommand command=new GarageDoorOpenCommand(garageDoor); //命令
        //为遥控器设置命令——把命令传给调用者。
        remoteControl.setCommand(command);
        //按下遥控器
        remoteControl.buttonWasPressed();

    }
}
 /* 输出为：
        Garage Door up
        Garage Door LightOn

        Process finished with exit code 0
  */