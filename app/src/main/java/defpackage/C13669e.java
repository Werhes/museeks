package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eْۨۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13669e {
    public static final C4987e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {null, AbstractC18039e.appmetrica(2, new C10673e(5))};
    public final String ad;
    public final List vip;

    public /* synthetic */ C13669e(int i, String str, List list) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C10249e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13669e)) {
            return false;
        }
        C13669e c13669e = (C13669e) obj;
        return AbstractC7890e.billing(this.ad, c13669e.ad) && AbstractC7890e.billing(this.vip, c13669e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RootThemeGroup(nameId=");
        sb.append(this.ad);
        sb.append(", themes=");
        return AbstractC1786e.tapsense(sb, this.vip, ')');
    }
}
