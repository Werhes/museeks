package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17919e {
    public final HashMap ad;
    public final HashMap vip;

    public C17919e(C11883e c11883e) {
        this.ad = new HashMap((HashMap) c11883e.f23815e);
        this.vip = new HashMap((HashMap) c11883e.f23814e);
    }

    public final Object ad(AbstractC14783e abstractC14783e, Class cls) {
        return vip(abstractC14783e, cls);
    }

    public final Object vip(AbstractC14783e abstractC14783e, Class cls) {
        C2738e c2738e = new C2738e(abstractC14783e.getClass(), cls);
        HashMap hashMap = this.ad;
        if (hashMap.containsKey(c2738e)) {
            return ((C9938e) hashMap.get(c2738e)).metrica.license(abstractC14783e);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + c2738e + " available, see https://developers.google.com/tink/faq/registration_errors");
    }
}
