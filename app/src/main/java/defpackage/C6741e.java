package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۢۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6741e extends ProxySelector {
    public final C15601e ad;
    public final String[] vip = {"vk.com", "vk.me", "vk.ru", "userapi.com", "vk-cdn.net", "vkuservideo.net", "vkuservideo.com", "vkuserlive.com", "vkuserlive.net", "vkuseraudio.com", "vkuseraudio.net", "vk-portal.net", "vk-apps.com", "vkforms.ru", "mycdn.me", "vkuser.net", "lovina.app", "mradx.net", "mail.ru", "moosic.io"};

    public C6741e(C15601e c15601e) {
        this.ad = c15601e;
    }

    public final boolean ad(URI uri) {
        if (!AbstractC6507e.loadAd(uri.getScheme(), "http", true) && !AbstractC6507e.loadAd(uri.getScheme(), "https", true)) {
            return false;
        }
        List m3606throws = AbstractC13480e.m3606throws(2, AbstractC5304e.m1869private(uri.getHost(), new String[]{"."}, 6));
        if (m3606throws.size() >= 2) {
            return AbstractC1660e.yandex(AbstractC13480e.m3608try(m3606throws, ".", null, null, null, 62), this.vip);
        }
        return false;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        if (this.ad.vip != null) {
            return;
        }
        ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        Object c12763e;
        try {
            if (ad(uri)) {
                Proxy proxy = this.ad.vip;
                c12763e = proxy != null ? Collections.singletonList(proxy) : ProxySelector.getDefault().select(uri);
            } else {
                c12763e = ProxySelector.getDefault().select(uri);
            }
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        if (c12763e instanceof C12763e) {
            c12763e = null;
        }
        List list = (List) c12763e;
        return list == null ? Collections.singletonList(Proxy.NO_PROXY) : list;
    }
}
