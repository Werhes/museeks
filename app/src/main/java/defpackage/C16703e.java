package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٗؑ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16703e {
    public static final C5553e Companion = new Object();
    public static final InterfaceC3477e[] appmetrica = {null, AbstractC18039e.appmetrica(2, new C14561e(8)), AbstractC18039e.appmetrica(2, new C14561e(9)), AbstractC18039e.appmetrica(2, new C14561e(10))};
    public final int ad;
    public final List license;
    public final List metrica;
    public final List vip;

    public /* synthetic */ C16703e(int i, int i2, List list, List list2, List list3) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16703e)) {
            return false;
        }
        C16703e c16703e = (C16703e) obj;
        return this.ad == c16703e.ad && AbstractC7890e.billing(this.vip, c16703e.vip) && AbstractC7890e.billing(this.metrica, c16703e.metrica) && AbstractC7890e.billing(this.license, c16703e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + AbstractC17861e.billing(AbstractC17861e.billing(this.ad * 31, 31, this.vip), 31, this.metrica);
    }

    public final String toString() {
        return "AudioGetResponseDto(count=" + this.ad + ", items=" + this.vip + ", groups=" + this.metrica + ", profiles=" + this.license + ")";
    }
}
