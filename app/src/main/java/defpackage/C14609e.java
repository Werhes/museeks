package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14609e {
    public static final C14609e metrica = new C14609e("_EMPTY_", C0756e.ad);
    public final String ad;
    public final AbstractC16049e vip;

    public C14609e(String str, AbstractC16049e abstractC16049e) {
        this.ad = str;
        this.vip = abstractC16049e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14609e)) {
            return false;
        }
        C14609e c14609e = (C14609e) obj;
        return AbstractC7890e.billing(this.ad, c14609e.ad) && AbstractC7890e.billing(this.vip, c14609e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "PlaybackItem(id=" + this.ad + ", data=" + this.vip + ')';
    }
}
