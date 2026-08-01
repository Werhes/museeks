package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9817e {
    public final int ad;
    public final Object vip;

    public C9817e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9817e)) {
            return false;
        }
        C9817e c9817e = (C9817e) obj;
        return this.ad == c9817e.ad && AbstractC7890e.billing(this.vip, c9817e.vip);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        Object obj = this.vip;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.ad + ", value=" + this.vip + ')';
    }
}
