package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍٍؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210e {
    public static final C0893e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {AbstractC18039e.appmetrica(2, new C1349e(25)), AbstractC18039e.appmetrica(2, new C1349e(26))};
    public final List ad;
    public final List vip;

    public /* synthetic */ C0210e(int i, List list, List list2) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C0199e.ad.appmetrica());
            throw null;
        }
        this.ad = list;
        this.vip = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0210e)) {
            return false;
        }
        C0210e c0210e = (C0210e) obj;
        return AbstractC7890e.billing(this.ad, c0210e.ad) && AbstractC7890e.billing(this.vip, c0210e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "AuthRefreshTokensResponseDto(success=" + this.ad + ", errors=" + this.vip + ")";
    }
}
