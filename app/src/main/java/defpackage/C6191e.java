package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6191e implements InterfaceC3703e {
    public final int ad;
    public final C15803e appmetrica;
    public final int billing;
    public final C5652e license;
    public final long metrica;
    public final C14917e purchase;
    public final C2666e startapp;
    public final int vip;
    public final int yandex;

    public C6191e(int i, int i2, long j, C5652e c5652e, C15803e c15803e, C14917e c14917e, int i3, int i4, C2666e c2666e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = j;
        this.license = c5652e;
        this.appmetrica = c15803e;
        this.purchase = c14917e;
        this.billing = i3;
        this.yandex = i4;
        this.startapp = c2666e;
        if (C12973e.ad(j, C12973e.metrica) || C12973e.metrica(j) >= 0.0f) {
            return;
        }
        AbstractC5525e.vip("lineHeight can't be negative (" + C12973e.metrica(j) + ')');
    }

    public final C6191e ad(C6191e c6191e) {
        return c6191e == null ? this : AbstractC12054e.ad(this, c6191e.ad, c6191e.vip, c6191e.metrica, c6191e.license, c6191e.appmetrica, c6191e.purchase, c6191e.billing, c6191e.yandex, c6191e.startapp);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6191e)) {
            return false;
        }
        C6191e c6191e = (C6191e) obj;
        return this.ad == c6191e.ad && this.vip == c6191e.vip && C12973e.ad(this.metrica, c6191e.metrica) && AbstractC7890e.billing(this.license, c6191e.license) && AbstractC7890e.billing(this.appmetrica, c6191e.appmetrica) && AbstractC7890e.billing(this.purchase, c6191e.purchase) && this.billing == c6191e.billing && this.yandex == c6191e.yandex && AbstractC7890e.billing(this.startapp, c6191e.startapp);
    }

    public final int hashCode() {
        int license = (C12973e.license(this.metrica) + (((this.ad * 31) + this.vip) * 31)) * 31;
        C5652e c5652e = this.license;
        int hashCode = (license + (c5652e != null ? c5652e.hashCode() : 0)) * 31;
        C15803e c15803e = this.appmetrica;
        int hashCode2 = (hashCode + (c15803e != null ? c15803e.hashCode() : 0)) * 31;
        C14917e c14917e = this.purchase;
        int hashCode3 = (((((hashCode2 + (c14917e != null ? c14917e.hashCode() : 0)) * 31) + this.billing) * 31) + this.yandex) * 31;
        C2666e c2666e = this.startapp;
        return hashCode3 + (c2666e != null ? c2666e.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C7975e.ad(this.ad)) + ", textDirection=" + ((Object) C7613e.ad(this.vip)) + ", lineHeight=" + ((Object) C12973e.appmetrica(this.metrica)) + ", textIndent=" + this.license + ", platformStyle=" + this.appmetrica + ", lineHeightStyle=" + this.purchase + ", lineBreak=" + ((Object) C18285e.ad(this.billing)) + ", hyphens=" + ((Object) C18235e.ad(this.yandex)) + ", textMotion=" + this.startapp + ')';
    }
}
