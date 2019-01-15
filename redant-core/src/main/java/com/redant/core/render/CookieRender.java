package com.redant.core.render;

import io.netty.handler.codec.http.cookie.Cookie;

/**
 * @author houyi.wh
 * @date 2017/11/15
 **/
public interface CookieRender {

    /**
     * 设置一个Cookie
     * @param cookie
     */
    void setCookie(Cookie cookie);


    /**
     * 删除一个Cookie
     * @param name
     * @return
     */
    boolean deleteCookie(String name);

}
