package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15335e {
    public final Object ad;
    public final int vip;

    public C15335e(AbstractC4291e abstractC4291e, int i) {
        this.ad = abstractC4291e;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15335e)) {
            return false;
        }
        C15335e c15335e = (C15335e) obj;
        return this.ad == c15335e.ad && this.vip == c15335e.vip;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.ad) * 65535) + this.vip;
    }
}
