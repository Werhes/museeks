package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۛٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14960e {
    public final C5256e ad;
    public final float appmetrica;
    public final C0835e license;
    public final C5447e metrica;
    public final C15407e vip;

    public C14960e(C5256e c5256e, C15407e c15407e, C5447e c5447e, C0835e c0835e, float f) {
        this.ad = c5256e;
        this.vip = c15407e;
        this.metrica = c5447e;
        this.license = c0835e;
        this.appmetrica = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14960e.class != obj.getClass()) {
            return false;
        }
        C14960e c14960e = (C14960e) obj;
        return AbstractC7890e.billing(this.ad, c14960e.ad) && AbstractC7890e.billing(this.vip, c14960e.vip) && AbstractC7890e.billing(this.metrica, c14960e.metrica) && AbstractC7890e.billing(this.license, c14960e.license);
    }

    public final int hashCode() {
        int hashCode = (EnumC16250e.Auto.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + ((this.ad.hashCode() + 38347) * 31)) * 31)) * 31)) * 31;
        this.license.getClass();
        return AbstractC10432e.ad.hashCode() + hashCode;
    }
}
