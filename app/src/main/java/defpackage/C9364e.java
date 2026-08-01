package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9364e {
    public final Object ad;
    public final String vip;

    public C9364e(Object obj, String str) {
        this.ad = obj;
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9364e)) {
            return false;
        }
        C9364e c9364e = (C9364e) obj;
        return this.ad == c9364e.ad && this.vip.equals(c9364e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (System.identityHashCode(this.ad) * 31);
    }
}
