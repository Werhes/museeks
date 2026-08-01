package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٖٚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16319e {
    public static final C2914e Companion = new Object();
    public static final InterfaceC3477e[] appmetrica = {null, AbstractC18039e.appmetrica(2, new C1349e(28)), null, AbstractC18039e.appmetrica(2, new C1349e(29))};
    public final long ad;
    public final List license;
    public final String metrica;
    public final EnumC7830e vip;

    public /* synthetic */ C16319e(int i, C5655e c5655e, EnumC7830e enumC7830e, String str, List list) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C12881e.ad.appmetrica());
            throw null;
        }
        this.ad = c5655e.ad;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = enumC7830e;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16319e)) {
            return false;
        }
        C16319e c16319e = (C16319e) obj;
        return C5655e.ad(this.ad, c16319e.ad) && this.vip == c16319e.vip && AbstractC7890e.billing(this.metrica, c16319e.metrica) && AbstractC7890e.billing(this.license, c16319e.license);
    }

    public final int hashCode() {
        int vip = C5655e.vip(this.ad) * 31;
        EnumC7830e enumC7830e = this.vip;
        int hashCode = (vip + (enumC7830e == null ? 0 : enumC7830e.hashCode())) * 31;
        String str = this.metrica;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.license;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AuthUserExchangeTokenDto(userId=" + String.valueOf(this.ad) + ", profileType=" + this.vip + ", commonToken=" + this.metrica + ", tierTokens=" + this.license + ")";
    }
}
