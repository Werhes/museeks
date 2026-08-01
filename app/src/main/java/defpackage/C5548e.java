package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍؘۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5548e {
    public static final C3309e Companion = new Object();
    public final String ad;
    public final C2453e vip;

    public C5548e(int i, String str, C2453e c2453e) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C10613e.vip);
            throw null;
        }
        this.ad = str;
        this.vip = c2453e;
    }

    public C5548e(String str, C2453e c2453e) {
        this.ad = str;
        this.vip = c2453e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5548e)) {
            return false;
        }
        C5548e c5548e = (C5548e) obj;
        return AbstractC7890e.billing(this.ad, c5548e.ad) && AbstractC7890e.billing(this.vip, c5548e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "BsonValueData(ref=" + this.ad + ", id=" + this.vip + ')';
    }
}
