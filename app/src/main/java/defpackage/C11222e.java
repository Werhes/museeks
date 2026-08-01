package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۣۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11222e {
    public static final C11222e metrica = new C11222e();
    public final ConcurrentHashMap vip = new ConcurrentHashMap();
    public final C6157e ad = new C6157e();

    public final InterfaceC0627e ad(Class cls) {
        InterfaceC0627e advert;
        Charset charset = AbstractC9561e.ad;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.vip;
        InterfaceC0627e interfaceC0627e = (InterfaceC0627e) concurrentHashMap.get(cls);
        if (interfaceC0627e != null) {
            return interfaceC0627e;
        }
        C6157e c6157e = this.ad;
        c6157e.getClass();
        C10068e c10068e = AbstractC17377e.ad;
        if (!AbstractC11202e.class.isAssignableFrom(cls)) {
            int i = AbstractC14050e.ad;
        }
        C17996e metrica2 = c6157e.ad.metrica(cls);
        if ((metrica2.license & 2) == 2) {
            int i2 = AbstractC14050e.ad;
            C10068e c10068e2 = AbstractC17377e.ad;
            C10215e c10215e = AbstractC18306e.ad;
            advert = new C0000e(c10068e2, metrica2.ad);
        } else {
            int i3 = AbstractC14050e.ad;
            int i4 = AbstractC16381e.ad;
            int i5 = AbstractC7916e.ad;
            C10068e c10068e3 = AbstractC17377e.ad;
            C10215e c10215e2 = metrica2.ad() + (-1) != 1 ? AbstractC18306e.ad : null;
            int i6 = AbstractC8571e.ad;
            advert = C11451e.advert(metrica2, c10068e3, c10215e2);
        }
        InterfaceC0627e interfaceC0627e2 = (InterfaceC0627e) concurrentHashMap.putIfAbsent(cls, advert);
        return interfaceC0627e2 != null ? interfaceC0627e2 : advert;
    }
}
