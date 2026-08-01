package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12307e extends ThreadLocal {
    public final /* synthetic */ C9556e ad;

    public C12307e(C9556e c9556e) {
        this.ad = c9556e;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C9556e c9556e = this.ad;
        try {
            C7174e c7174e = C7174e.metrica;
            Mac mac = (Mac) c7174e.ad.isPro((String) c9556e.f18967e);
            mac.init((SecretKeySpec) c9556e.f18969e);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
