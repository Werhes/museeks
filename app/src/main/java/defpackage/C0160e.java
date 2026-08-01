package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؚؑؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160e implements InterfaceC2558e {
    public static final C18254e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {AbstractC18039e.appmetrica(2, new C14136e(1)), null};
    public final List ad;
    public final String vip;

    public /* synthetic */ C0160e(int i, String str, List list) {
        this.ad = (i & 1) == 0 ? C13664e.f27089e : list;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str;
        }
    }

    public C0160e(List list, String str) {
        this.ad = list;
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0160e)) {
            return false;
        }
        C0160e c0160e = (C0160e) obj;
        return AbstractC7890e.billing(this.ad, c0160e.ad) && AbstractC7890e.billing(this.vip, c0160e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Synchronized(lines=");
        sb.append(this.ad);
        sb.append(", credits=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
