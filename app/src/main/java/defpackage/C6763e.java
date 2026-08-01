package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًؙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6763e {
    public static final C15975e Companion = new Object();
    public final String ad;
    public final int vip;

    public /* synthetic */ C6763e(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C9761e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6763e)) {
            return false;
        }
        C6763e c6763e = (C6763e) obj;
        return AbstractC7890e.billing(this.ad, c6763e.ad) && this.vip == c6763e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        return "Y25PlaylistCreateAction(status=" + this.ad + ", id=" + this.vip + ")";
    }
}
