package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۨٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4541e {
    public final List ad;
    public final C1828e appmetrica;
    public final List license;
    public final List metrica;
    public final List vip;

    public C4541e(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, List list, C1828e c1828e) {
        this.ad = AbstractC12534e.vip(arrayList);
        this.vip = AbstractC12534e.vip(arrayList2);
        this.metrica = AbstractC12534e.vip(arrayList3);
        this.license = AbstractC12534e.vip(list);
        this.appmetrica = c1828e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4541e)) {
            return false;
        }
        C4541e c4541e = (C4541e) obj;
        return Objects.equals(this.metrica, c4541e.metrica) && Objects.equals(this.ad, c4541e.ad) && Objects.equals(this.vip, c4541e.vip) && Objects.equals(this.license, c4541e.license) && Objects.equals(this.appmetrica, c4541e.appmetrica);
    }

    public final int hashCode() {
        return Objects.hash(this.metrica, this.ad, this.vip, this.license, this.appmetrica);
    }

    public final String toString() {
        return "(MasterPlaylist mPlaylists=" + this.ad.toString() + " mIFramePlaylists=" + this.vip.toString() + " mMediaData=" + this.metrica.toString() + " mUnknownTags=" + this.license.toString() + " mStartData=" + this.appmetrica.toString() + ")";
    }
}
