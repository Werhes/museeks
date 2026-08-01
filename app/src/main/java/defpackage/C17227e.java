package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٗۙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17227e {
    public static final C12603e Companion = new Object();
    public static final InterfaceC3477e[] license = {null, AbstractC18039e.appmetrica(2, new C18420e(17)), AbstractC18039e.appmetrica(2, new C18420e(18))};
    public final String ad;
    public final List metrica;
    public final List vip;

    public /* synthetic */ C17227e(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C6204e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = list;
        this.metrica = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17227e)) {
            return false;
        }
        C17227e c17227e = (C17227e) obj;
        return AbstractC7890e.billing(this.ad, c17227e.ad) && AbstractC7890e.billing(this.vip, c17227e.vip) && AbstractC7890e.billing(this.metrica, c17227e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC17861e.billing(this.ad.hashCode() * 31, 31, this.vip);
    }

    public final String toString() {
        return "Y25Response(audioTooltip=" + this.ad + ", blocks=" + this.vip + ", actions=" + this.metrica + ")";
    }
}
