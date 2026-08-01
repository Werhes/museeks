package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٟۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13567e {
    public final long ad;
    public final long adcel;
    public final long advert;
    public final boolean appmetrica;
    public final int billing;
    public final long license;
    public final long metrica;
    public final float mopub;
    public final float purchase;
    public final long smaato;
    public final ArrayList startapp;
    public final long vip;
    public final boolean yandex;

    public C13567e(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
        this.appmetrica = z;
        this.purchase = f;
        this.billing = i;
        this.yandex = z2;
        this.startapp = arrayList;
        this.adcel = j5;
        this.mopub = f2;
        this.advert = j6;
        this.smaato = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13567e)) {
            return false;
        }
        C13567e c13567e = (C13567e) obj;
        return AbstractC17751e.vip(this.ad, c13567e.ad) && this.vip == c13567e.vip && C2152e.vip(this.metrica, c13567e.metrica) && C2152e.vip(this.license, c13567e.license) && this.appmetrica == c13567e.appmetrica && Float.compare(this.purchase, c13567e.purchase) == 0 && this.billing == c13567e.billing && this.yandex == c13567e.yandex && this.startapp.equals(c13567e.startapp) && C2152e.vip(this.adcel, c13567e.adcel) && Float.compare(this.mopub, c13567e.mopub) == 0 && C2152e.vip(this.advert, c13567e.advert) && C2152e.vip(this.smaato, c13567e.smaato);
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        return C2152e.billing(this.smaato) + ((C2152e.billing(this.advert) + AbstractC1414e.license((C2152e.billing(this.adcel) + ((this.startapp.hashCode() + ((((AbstractC1414e.license((((C2152e.billing(this.license) + ((C2152e.billing(this.metrica) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31) + (this.appmetrica ? 1231 : 1237)) * 31, this.purchase, 31) + this.billing) * 31) + (this.yandex ? 1231 : 1237)) * 31)) * 31)) * 31, this.mopub, 31)) * 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) AbstractC17751e.license(this.ad)) + ", uptime=" + this.vip + ", positionOnScreen=" + ((Object) C2152e.mopub(this.metrica)) + ", position=" + ((Object) C2152e.mopub(this.license)) + ", down=" + this.appmetrica + ", pressure=" + this.purchase + ", type=" + ((Object) C15991e.ad(this.billing)) + ", activeHover=" + this.yandex + ", historical=" + this.startapp + ", scrollDelta=" + ((Object) C2152e.mopub(this.adcel)) + ", scaleGestureFactor=" + this.mopub + ", panGestureOffset=" + ((Object) C2152e.mopub(this.advert)) + ", originalEventPosition=" + ((Object) C2152e.mopub(this.smaato)) + ')';
    }
}
