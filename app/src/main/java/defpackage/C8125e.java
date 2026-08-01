package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًِۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8125e {
    public static final C12852e Companion = new Object();
    public static final InterfaceC3477e[] appmetrica = {null, null, AbstractC18039e.appmetrica(2, new C1349e(24)), null};
    public final int ad;
    public final C5485e license;
    public final List metrica;
    public final C10813e vip;

    public /* synthetic */ C8125e(int i, int i2, C10813e c10813e, List list, C5485e c5485e) {
        this.ad = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = c10813e;
        }
        if ((i & 4) == 0) {
            this.metrica = C13664e.f27089e;
        } else {
            this.metrica = list;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = c5485e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8125e)) {
            return false;
        }
        C8125e c8125e = (C8125e) obj;
        return this.ad == c8125e.ad && AbstractC7890e.billing(this.vip, c8125e.vip) && AbstractC7890e.billing(this.metrica, c8125e.metrica) && AbstractC7890e.billing(this.license, c8125e.license);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        C10813e c10813e = this.vip;
        int billing = AbstractC17861e.billing((i + (c10813e == null ? 0 : c10813e.hashCode())) * 31, 31, this.metrica);
        C5485e c5485e = this.license;
        return billing + (c5485e != null ? c5485e.hashCode() : 0);
    }

    public final String toString() {
        return "AuthProcessAuthCodeResponseDto(status=" + this.ad + ", authInfo=" + this.vip + ", errors=" + this.metrica + ", profile=" + this.license + ")";
    }
}
