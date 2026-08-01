package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10155e {
    public final Object ad;
    public final int vip;

    public C10155e(int i, Object obj) {
        this.ad = obj;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10155e)) {
            return false;
        }
        C10155e c10155e = (C10155e) obj;
        return this.ad == c10155e.ad && this.vip == c10155e.vip;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.ad) * 65535) + this.vip;
    }
}
