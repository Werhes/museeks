package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1825e {
    public static final C1825e vip;
    public final HashMap ad = new HashMap();

    static {
        C5431e c5431e = new C5431e(12);
        C1825e c1825e = new C1825e();
        try {
            c1825e.ad(c5431e, C4062e.class);
            vip = c1825e;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized void ad(C5431e c5431e, Class cls) {
        try {
            C5431e c5431e2 = (C5431e) this.ad.get(cls);
            if (c5431e2 != null && !c5431e2.equals(c5431e)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.ad.put(cls, c5431e);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final AbstractC14783e vip(AbstractC12699e abstractC12699e, Integer num) {
        AbstractC14783e ad;
        synchronized (this) {
            C5431e c5431e = (C5431e) this.ad.get(abstractC12699e.getClass());
            if (c5431e == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + abstractC12699e + ": no key creator for this class was registered.");
            }
            ad = c5431e.ad(abstractC12699e, num);
        }
        return ad;
    }
}
