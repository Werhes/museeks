package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؙٟٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6563e {
    public static final C5411e Companion = new Object();
    public static final InterfaceC3477e[] appmetrica = {null, null, null, AbstractC18039e.appmetrica(2, new C1349e(13))};
    public final String ad;
    public final List license;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C6563e(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C14713e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6563e)) {
            return false;
        }
        C6563e c6563e = (C6563e) obj;
        return AbstractC7890e.billing(this.ad, c6563e.ad) && AbstractC7890e.billing(this.vip, c6563e.vip) && AbstractC7890e.billing(this.metrica, c6563e.metrica) && AbstractC7890e.billing(this.license, c6563e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("AudioStreamMixSettingsCategoryDto(id=", this.ad, ", title=", this.vip, ", type=");
        tapsense.append(this.metrica);
        tapsense.append(", options=");
        tapsense.append(this.license);
        tapsense.append(")");
        return tapsense.toString();
    }
}
