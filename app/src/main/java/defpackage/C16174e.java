package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16174e {
    public static final C16174e billing = new C16174e(false, 0, true, 1, 1, C4622e.f9949e);
    public final boolean ad;
    public final int appmetrica;
    public final int license;
    public final boolean metrica;
    public final C4622e purchase;
    public final int vip;

    public C16174e(boolean z, int i, boolean z2, int i2, int i3, C4622e c4622e) {
        this.ad = z;
        this.vip = i;
        this.metrica = z2;
        this.license = i2;
        this.appmetrica = i3;
        this.purchase = c4622e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16174e)) {
            return false;
        }
        C16174e c16174e = (C16174e) obj;
        return this.ad == c16174e.ad && this.vip == c16174e.vip && this.metrica == c16174e.metrica && this.license == c16174e.license && this.appmetrica == c16174e.appmetrica && AbstractC7890e.billing(this.purchase, c16174e.purchase);
    }

    public final int hashCode() {
        return this.purchase.f9951e.hashCode() + ((((((((((this.ad ? 1231 : 1237) * 31) + this.vip) * 31) + (this.metrica ? 1231 : 1237)) * 31) + this.license) * 31) + this.appmetrica) * 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.ad + ", capitalization=" + ((Object) C17625e.ad(this.vip)) + ", autoCorrect=" + this.metrica + ", keyboardType=" + ((Object) C3445e.ad(this.license)) + ", imeAction=" + ((Object) C10120e.ad(this.appmetrica)) + ", platformImeOptions=null, hintLocales=" + this.purchase + ')';
    }
}
