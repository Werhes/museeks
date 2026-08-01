package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؙۨۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6828e {
    public static final C16006e Companion = new Object();
    public final String ad;
    public final String license;
    public final boolean metrica;
    public final String vip;

    public /* synthetic */ C6828e(int i, String str, String str2, String str3, boolean z) {
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C15663e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        this.metrica = z;
        this.license = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6828e)) {
            return false;
        }
        C6828e c6828e = (C6828e) obj;
        return AbstractC7890e.billing(this.ad, c6828e.ad) && AbstractC7890e.billing(this.vip, c6828e.vip) && this.metrica == c6828e.metrica && AbstractC7890e.billing(this.license, c6828e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip) + (this.metrica ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("AudioStreamMixSettingsOptionDto(id=", this.ad, ", icon=", this.vip, ", selected=");
        tapsense.append(this.metrica);
        tapsense.append(", title=");
        tapsense.append(this.license);
        tapsense.append(")");
        return tapsense.toString();
    }
}
