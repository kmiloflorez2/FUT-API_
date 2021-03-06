package net.dongliu.requests.executor;

import net.dongliu.requests.Cookie;
import org.jetbrains.annotations.NotNull;

import java.net.URL;
import java.util.Collection;
import java.util.List;

/**
 * Interface for storing cookies
 */
public interface CookieJar {

    /**
     * Add multi cookies to cookie jar.
     */
    void storeCookies(Collection<Cookie> cookies);

    /**
     * Get cookies match the given url.
     *
     * @return the cookie match url, return empty collection if no match cookie
     */
    @NotNull
    List<Cookie> getCookies(URL url);

    /**
     * Get all cookies in this store
     */
    @NotNull
    List<Cookie> getCookies();
}
