package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٔؖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14513e {
    public static final C16506e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {null, AbstractC18039e.appmetrica(2, new C10673e(2))};
    public final String ad;
    public final List vip;

    public /* synthetic */ C14513e(int i, String str, List list) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C14922e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14513e)) {
            return false;
        }
        C14513e c14513e = (C14513e) obj;
        return AbstractC7890e.billing(this.ad, c14513e.ad) && AbstractC7890e.billing(this.vip, c14513e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RootAccentGroup(nameId=");
        sb.append(this.ad);
        sb.append(", accents=");
        return AbstractC1786e.tapsense(sb, this.vip, ')');
    }
}
