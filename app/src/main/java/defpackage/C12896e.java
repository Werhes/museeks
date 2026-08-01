package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّۦۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12896e {
    public static final C6663e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {null, AbstractC18039e.appmetrica(2, new C1349e(12))};
    public final int ad;
    public final List vip;

    public /* synthetic */ C12896e(int i, int i2, List list) {
        this.ad = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.vip = C13664e.f27089e;
        } else {
            this.vip = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12896e)) {
            return false;
        }
        C12896e c12896e = (C12896e) obj;
        return this.ad == c12896e.ad && AbstractC7890e.billing(this.vip, c12896e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad * 31);
    }

    public final String toString() {
        return "AudioSearchResponseDto(count=" + this.ad + ", items=" + this.vip + ")";
    }
}
