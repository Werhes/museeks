package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2697e {
    public final List ad;
    public final boolean appmetrica;
    public final EnumC3923e billing;
    public final int license;
    public final int metrica;
    public final boolean purchase;
    public final List vip;
    public final C1828e yandex;

    public C2697e(List list, List list2, int i, C1828e c1828e, int i2, boolean z, boolean z2, EnumC3923e enumC3923e) {
        this.ad = AbstractC12534e.vip(list);
        this.vip = AbstractC12534e.vip(list2);
        this.metrica = i;
        this.license = i2;
        this.appmetrica = z;
        this.purchase = z2;
        this.yandex = c1828e;
        this.billing = enumC3923e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٕٟٓ, java.lang.Object] */
    public final C15639e ad() {
        ?? obj = new Object();
        obj.f30839e = this.vip;
        obj.f30843e = this.metrica;
        obj.f30841e = this.license;
        obj.f30840e = this.appmetrica;
        obj.f30842e = this.purchase;
        obj.f30845e = this.billing;
        obj.f30844e = this.yandex;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2697e)) {
            return false;
        }
        C2697e c2697e = (C2697e) obj;
        return Objects.equals(this.ad, c2697e.ad) && Objects.equals(this.vip, c2697e.vip) && this.metrica == c2697e.metrica && this.license == c2697e.license && this.appmetrica == c2697e.appmetrica && this.purchase == c2697e.purchase && Objects.equals(this.billing, c2697e.billing) && Objects.equals(this.yandex, c2697e.yandex);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip, Integer.valueOf(this.metrica), Integer.valueOf(this.license), Boolean.valueOf(this.appmetrica), Boolean.valueOf(this.purchase), this.billing, this.yandex);
    }

    public final String toString() {
        return "(MediaPlaylist mTracks=" + this.ad + " mUnknownTags=" + this.vip + " mTargetDuration=" + this.metrica + " mMediaSequenceNumber=" + this.license + " mIsIframesOnly=" + this.appmetrica + " mIsOngoing=" + this.purchase + " mPlaylistType=" + this.billing + " mStartData=" + this.yandex + ")";
    }
}
