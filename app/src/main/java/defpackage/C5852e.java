package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘؙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5852e {
    public static final C6280e Companion = new Object();
    public static final InterfaceC3477e[] appmetrica = {null, null, AbstractC18039e.appmetrica(2, new C10673e(3)), AbstractC18039e.appmetrica(2, new C10673e(4))};
    public final int ad;
    public final List license;
    public final List metrica;
    public final int vip;

    public /* synthetic */ C5852e(int i, int i2, int i3, List list, List list2) {
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C14642e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = i3;
        this.metrica = list;
        this.license = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5852e)) {
            return false;
        }
        C5852e c5852e = (C5852e) obj;
        return this.ad == c5852e.ad && this.vip == c5852e.vip && AbstractC7890e.billing(this.metrica, c5852e.metrica) && AbstractC7890e.billing(this.license, c5852e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + AbstractC17861e.billing(((this.ad * 31) + this.vip) * 31, 31, this.metrica);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RootThemeCatalog(defaultThemeId=");
        sb.append(this.ad);
        sb.append(", defaultAccentId=");
        sb.append(this.vip);
        sb.append(", themes=");
        sb.append(this.metrica);
        sb.append(", accents=");
        return AbstractC1786e.tapsense(sb, this.license, ')');
    }
}
