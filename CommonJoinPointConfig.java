package com.edureka.springboot.tutorial.basics.example.aop;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.edureka.springboot.basics.example.aop.data.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.edureka.springboot.basics.example.aop.business.*.*(..))")
    public void businessLayerExecution(){}

    @Pointcut("dataLayerExecution() && businessLayerExecution()")
    public void allLayerExecution(){}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao(){}

    @Pointcut("within(com.edureka.springboot.basics.example.aop.data..*)")
    public void dataLayerExecutionWithWithin(){}

    @Pointcut("@annotation(com.edureka.springboot.basics.example.aop.TrackTime)")
    public void trackTimeAnnotation(){}

}