package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؚؓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1799e {
    public static final C5762e Companion = new Object();
    public final String ad;
    public final C4767e vip;

    public C1799e(int i, String str, C4767e c4767e) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C10443e.vip);
            throw null;
        }
        this.ad = str;
        this.vip = c4767e;
    }

    public C1799e(C1809e c1809e) {
        String str = c1809e.f4885e;
        C4767e c4767e = c1809e.f4884e;
        this.ad = str;
        this.vip = c4767e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1799e)) {
            return false;
        }
        C1799e c1799e = (C1799e) obj;
        return AbstractC7890e.billing(this.ad, c1799e.ad) && AbstractC7890e.billing(this.vip, c1799e.vip);
    }

    public final int hashCode() {
        return this.vip.f10200e.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "BsonValueJson(code=" + this.ad + ", scope=" + this.vip + ')';
    }
}
