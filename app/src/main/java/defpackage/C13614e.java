package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eْٟۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13614e {
    public static final C4313e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {null, AbstractC18039e.appmetrica(2, new C8462e(1))};
    public final long ad;
    public final List vip;

    public /* synthetic */ C13614e(int i, long j, List list) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C14009e.ad.appmetrica());
            throw null;
        }
        this.ad = j;
        this.vip = list;
    }

    public C13614e(long j, List list) {
        this.ad = j;
        this.vip = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13614e)) {
            return false;
        }
        C13614e c13614e = (C13614e) obj;
        return this.ad == c13614e.ad && AbstractC7890e.billing(this.vip, c13614e.vip);
    }

    public final int hashCode() {
        long j = this.ad;
        return this.vip.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "VkAccountsStoreModel(defaultAccountId=" + this.ad + ", accountStore=" + this.vip + ")";
    }
}
