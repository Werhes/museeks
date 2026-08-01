package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17792e {
    public static final C17792e metrica = new C17792e();
    public final ConcurrentHashMap vip = new ConcurrentHashMap();
    public final C2389e ad = new C2389e();

    public final InterfaceC15433e ad(Class cls) {
        InterfaceC15433e tapsense;
        Charset charset = AbstractC12312e.ad;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.vip;
        InterfaceC15433e interfaceC15433e = (InterfaceC15433e) concurrentHashMap.get(cls);
        if (interfaceC15433e != null) {
            return interfaceC15433e;
        }
        C2389e c2389e = this.ad;
        c2389e.getClass();
        C11672e c11672e = AbstractC9415e.ad;
        AbstractC17076e.class.isAssignableFrom(cls);
        C5166e vip = c2389e.ad.vip(cls);
        if ((vip.license & 2) == 2) {
            C11672e c11672e2 = AbstractC9415e.ad;
            C6607e c6607e = AbstractC10199e.ad;
            tapsense = new C1521e(c11672e2, vip.ad);
        } else {
            int i = AbstractC8165e.ad;
            int i2 = AbstractC15472e.ad;
            C11672e c11672e3 = AbstractC9415e.ad;
            C6607e c6607e2 = vip.ad() + (-1) != 1 ? AbstractC10199e.ad : null;
            int i3 = AbstractC7541e.ad;
            tapsense = C3017e.tapsense(vip, c11672e3, c6607e2);
        }
        InterfaceC15433e interfaceC15433e2 = (InterfaceC15433e) concurrentHashMap.putIfAbsent(cls, tapsense);
        return interfaceC15433e2 == null ? tapsense : interfaceC15433e2;
    }
}
