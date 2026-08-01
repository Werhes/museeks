package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٔٗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14762e {
    public static final C4074e Companion = new Object();
    public static final InterfaceC3477e[] purchase = {null, null, null, null, AbstractC18039e.appmetrica(2, new C14582e(10))};
    public final String ad;
    public final EnumC11077e appmetrica;
    public final String license;
    public final int metrica;
    public final int vip;

    public /* synthetic */ C14762e(int i, String str, int i2, int i3, String str2, EnumC11077e enumC11077e) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C7058e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = i2;
        this.metrica = i3;
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = enumC11077e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14762e)) {
            return false;
        }
        C14762e c14762e = (C14762e) obj;
        return AbstractC7890e.billing(this.ad, c14762e.ad) && this.vip == c14762e.vip && this.metrica == c14762e.metrica && AbstractC7890e.billing(this.license, c14762e.license) && this.appmetrica == c14762e.appmetrica;
    }

    public final int hashCode() {
        int hashCode = ((((this.ad.hashCode() * 31) + this.vip) * 31) + this.metrica) * 31;
        String str = this.license;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC11077e enumC11077e = this.appmetrica;
        return hashCode2 + (enumC11077e != null ? enumC11077e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder smaato = AbstractC10257e.smaato("BaseImageDto(url=", this.ad, ", width=", this.vip, ", height=");
        smaato.append(this.metrica);
        smaato.append(", id=");
        smaato.append(this.license);
        smaato.append(", theme=");
        smaato.append(this.appmetrica);
        smaato.append(")");
        return smaato.toString();
    }
}
