package com.ifarm.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应状态码枚举
 * 
 * @author ifarm
 * @since 2024-01-01
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

    /**
     * 成功
     */
    SUCCESS(200, "操作成功"),

    /**
     * 失败
     */
    ERROR(500, "操作失败"),

    /**
     * 参数错误
     */
    PARAM_ERROR(400, "参数错误"),

    /**
     * 未授权
     */
    UNAUTHORIZED(401, "未授权"),

    /**
     * 禁止访问
     */
    FORBIDDEN(403, "禁止访问"),

    /**
     * 资源不存在
     */
    NOT_FOUND(404, "资源不存在"),

    /**
     * 请求方法不允许
     */
    METHOD_NOT_ALLOWED(405, "请求方法不允许"),

    /**
     * 请求超时
     */
    REQUEST_TIMEOUT(408, "请求超时"),

    /**
     * 冲突
     */
    CONFLICT(409, "资源冲突"),

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),

    /**
     * 服务不可用
     */
    SERVICE_UNAVAILABLE(503, "服务不可用"),

    /**
     * 数据库操作失败
     */
    DATABASE_ERROR(1001, "数据库操作失败"),

    /**
     * 文件上传失败
     */
    FILE_UPLOAD_ERROR(1002, "文件上传失败"),

    /**
     * 文件下载失败
     */
    FILE_DOWNLOAD_ERROR(1003, "文件下载失败"),

    /**
     * 业务逻辑错误
     */
    BUSINESS_ERROR(2001, "业务逻辑错误"),

    /**
     * 用户不存在
     */
    USER_NOT_FOUND(3001, "用户不存在"),

    /**
     * 用户名或密码错误
     */
    USERNAME_OR_PASSWORD_ERROR(3002, "用户名或密码错误"),

    /**
     * 用户已存在
     */
    USER_ALREADY_EXISTS(3003, "用户已存在"),

    /**
     * 用户被禁用
     */
    USER_DISABLED(3004, "用户被禁用"),

    /**
     * 验证码错误
     */
    CAPTCHA_ERROR(3005, "验证码错误"),

    /**
     * Token无效
     */
    TOKEN_INVALID(3006, "Token无效"),

    /**
     * Token过期
     */
    TOKEN_EXPIRED(3007, "Token过期");

    /**
     * 状态码
     */
    private final Integer code;

    /**
     * 状态消息
     */
    private final String message;
} 