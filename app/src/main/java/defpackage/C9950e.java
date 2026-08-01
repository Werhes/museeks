package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍۨۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9950e {
    public static final C17235e Companion = new Object();
    public static final InterfaceC3477e[] license = {null, null, AbstractC18039e.appmetrica(2, new C1349e(14))};
    public final String ad;
    public final List metrica;
    public final String vip;

    public /* synthetic */ C9950e(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C18102e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        this.metrica = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9950e)) {
            return false;
        }
        C9950e c9950e = (C9950e) obj;
        return AbstractC7890e.billing(this.ad, c9950e.ad) && AbstractC7890e.billing(this.vip, c9950e.vip) && AbstractC7890e.billing(this.metrica, c9950e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("AudioStreamMixSettingsDto(title=", this.ad, ", subtitle=", this.vip, ", settings=");
        tapsense.append(this.metrica);
        tapsense.append(")");
        return tapsense.toString();
    }
}
