package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؚۣٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7555e {
    public static final C0359e Companion = new Object();
    public static final InterfaceC3477e[] purchase = {null, AbstractC18039e.appmetrica(2, new C14561e(4)), AbstractC18039e.appmetrica(2, new C14561e(5)), AbstractC18039e.appmetrica(2, new C14561e(6)), null};
    public final int ad;
    public final String appmetrica;
    public final List license;
    public final List metrica;
    public final List vip;

    public /* synthetic */ C7555e(int i, int i2, List list, List list2, List list3, String str) {
        this.ad = (i & 1) == 0 ? 0 : i2;
        int i3 = i & 2;
        C13664e c13664e = C13664e.f27089e;
        if (i3 == 0) {
            this.vip = c13664e;
        } else {
            this.vip = list;
        }
        if ((i & 4) == 0) {
            this.metrica = c13664e;
        } else {
            this.metrica = list2;
        }
        if ((i & 8) == 0) {
            this.license = c13664e;
        } else {
            this.license = list3;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7555e)) {
            return false;
        }
        C7555e c7555e = (C7555e) obj;
        return this.ad == c7555e.ad && AbstractC7890e.billing(this.vip, c7555e.vip) && AbstractC7890e.billing(this.metrica, c7555e.metrica) && AbstractC7890e.billing(this.license, c7555e.license) && AbstractC7890e.billing(this.appmetrica, c7555e.appmetrica);
    }

    public final int hashCode() {
        int billing = AbstractC17861e.billing(AbstractC17861e.billing(AbstractC17861e.billing(this.ad * 31, 31, this.vip), 31, this.metrica), 31, this.license);
        String str = this.appmetrica;
        return billing + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetPlaylistsResponseDto(count=");
        sb.append(this.ad);
        sb.append(", items=");
        sb.append(this.vip);
        sb.append(", groups=");
        sb.append(this.metrica);
        sb.append(", profiles=");
        sb.append(this.license);
        sb.append(", nextFrom=");
        return AbstractC1786e.signatures(sb, this.appmetrica, ")");
    }
}
