package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13196e {
    public static final C7627e Companion = new Object();
    public final String ad;
    public final String vip;

    public /* synthetic */ C13196e(String str, int i, String str2) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C11052e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13196e)) {
            return false;
        }
        C13196e c13196e = (C13196e) obj;
        return AbstractC7890e.billing(this.ad, c13196e.ad) && AbstractC7890e.billing(this.vip, c13196e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC17861e.subscription("Y25Action(title=", this.ad, ", mobile=", this.vip, ")");
    }
}
