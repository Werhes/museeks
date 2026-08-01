package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘِٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5767e {
    public static final C12946e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {null, AbstractC18039e.appmetrica(2, new C18420e(16))};
    public final String ad;
    public final List vip;

    public /* synthetic */ C5767e(int i, String str, List list) {
        this.ad = (i & 1) == 0 ? BuildConfig.FLAVOR : str;
        if ((i & 2) == 0) {
            this.vip = C13664e.f27089e;
        } else {
            this.vip = list;
        }
    }

    public C5767e(String str, int i) {
        this.ad = (i & 1) != 0 ? BuildConfig.FLAVOR : str;
        this.vip = C13664e.f27089e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5767e)) {
            return false;
        }
        C5767e c5767e = (C5767e) obj;
        return AbstractC7890e.billing(this.ad, c5767e.ad) && AbstractC7890e.billing(this.vip, c5767e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "Y25Content(coverUrl=" + this.ad + ", video=" + this.vip + ")";
    }
}
