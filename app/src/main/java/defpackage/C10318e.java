package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10318e {
    public final Context ad;
    public final InterfaceC12123e license;
    public final long metrica;
    public final InterfaceC14388e vip;

    public C10318e(Context context, InterfaceC14388e interfaceC14388e, long j, InterfaceC12123e interfaceC12123e) {
        this.ad = context;
        this.vip = interfaceC14388e;
        this.metrica = j;
        this.license = interfaceC12123e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C10318e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C10318e c10318e = (C10318e) obj;
        return AbstractC7890e.billing(this.ad, c10318e.ad) && AbstractC7890e.billing(this.vip, c10318e.vip) && C3618e.metrica(this.metrica, c10318e.metrica) && AbstractC7890e.billing(this.license, c10318e.license);
    }

    public final int hashCode() {
        int hashCode = (this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31;
        int i = C3618e.mopub;
        return this.license.hashCode() + AbstractC5087e.m1744class(hashCode, this.metrica, 31);
    }
}
