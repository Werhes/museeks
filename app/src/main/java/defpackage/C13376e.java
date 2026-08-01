package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eْْٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13376e {
    public static final C4869e Companion = new Object();
    public static final InterfaceC3477e[] appmetrica = {null, null, null, AbstractC18039e.appmetrica(2, new C14561e(13))};
    public final String ad;
    public final EnumC2854e license;
    public final int metrica;
    public final int vip;

    public /* synthetic */ C13376e(int i, String str, int i2, int i3, EnumC2854e enumC2854e) {
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C9433e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = i2;
        this.metrica = i3;
        this.license = enumC2854e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13376e)) {
            return false;
        }
        C13376e c13376e = (C13376e) obj;
        return AbstractC7890e.billing(this.ad, c13376e.ad) && this.vip == c13376e.vip && this.metrica == c13376e.metrica && this.license == c13376e.license;
    }

    public final int hashCode() {
        return this.license.hashCode() + (((((this.ad.hashCode() * 31) + this.vip) * 31) + this.metrica) * 31);
    }

    public final String toString() {
        StringBuilder smaato = AbstractC10257e.smaato("AudioPhotoSizesDto(src=", this.ad, ", width=", this.vip, ", height=");
        smaato.append(this.metrica);
        smaato.append(", type=");
        smaato.append(this.license);
        smaato.append(")");
        return smaato.toString();
    }
}
