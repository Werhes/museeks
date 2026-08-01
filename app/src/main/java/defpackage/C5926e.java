package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5926e {
    public final C18422e ad;
    public final String metrica;
    public final ArrayList vip;

    public C5926e(C18422e c18422e, ArrayList arrayList) {
        this.ad = c18422e;
        this.vip = arrayList;
        String str = c18422e.f36115while;
        this.metrica = str == null ? BuildConfig.FLAVOR : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5926e)) {
            return false;
        }
        C5926e c5926e = (C5926e) obj;
        return AbstractC7890e.billing(this.ad, c5926e.ad) && this.vip.equals(c5926e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "DuplicateEntry(mainTrack=" + this.ad + ", duplicates=" + this.vip + ')';
    }
}
