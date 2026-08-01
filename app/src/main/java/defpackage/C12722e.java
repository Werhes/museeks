package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12722e {
    public static final C12722e vip = new C12722e();
    public final HashMap ad = new HashMap();

    public final synchronized void ad(C13639e c13639e, Class cls) {
        try {
            C13639e c13639e2 = (C13639e) this.ad.get(cls);
            if (c13639e2 != null && !c13639e2.equals(c13639e)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.ad.put(cls, c13639e);
        } catch (Throwable th) {
            throw th;
        }
    }
}
