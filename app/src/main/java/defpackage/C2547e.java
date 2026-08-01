package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2547e {
    public final C10566e ad;
    public final InterfaceC6256e vip;

    public C2547e(C10566e c10566e, InterfaceC6256e interfaceC6256e) {
        this.ad = c10566e;
        this.vip = interfaceC6256e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2547e)) {
            return false;
        }
        C2547e c2547e = (C2547e) obj;
        return AbstractC7890e.billing(this.ad, c2547e.ad) && AbstractC7890e.billing(this.vip, c2547e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.ad) + ", offsetMapping=" + this.vip + ')';
    }
}
