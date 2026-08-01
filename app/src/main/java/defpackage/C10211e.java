package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10211e extends AbstractC12314e {
    public final String ad;
    public final Throwable appmetrica;
    public final C11811e billing;
    public final C11811e license;
    public final Integer metrica;
    public final C11811e purchase;
    public final C1096e startapp;
    public final int vip;
    public final C11811e yandex;

    public C10211e(String str, int i, Integer num, C11811e c11811e, Throwable th, C11811e c11811e2, C11811e c11811e3, C11811e c11811e4, C1096e c1096e) {
        this.ad = str;
        this.vip = i;
        this.metrica = num;
        this.license = c11811e;
        this.appmetrica = th;
        this.purchase = c11811e2;
        this.billing = c11811e3;
        this.yandex = c11811e4;
        this.startapp = c1096e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10211e)) {
            return false;
        }
        C10211e c10211e = (C10211e) obj;
        return AbstractC7890e.billing(this.ad, c10211e.ad) && this.vip == c10211e.vip && AbstractC7890e.billing(this.metrica, c10211e.metrica) && AbstractC7890e.billing(this.license, c10211e.license) && AbstractC7890e.billing(this.appmetrica, c10211e.appmetrica) && AbstractC7890e.billing(this.purchase, c10211e.purchase) && AbstractC7890e.billing(this.billing, c10211e.billing) && AbstractC7890e.billing(this.yandex, c10211e.yandex) && AbstractC7890e.billing(this.startapp, c10211e.startapp);
    }

    public final int hashCode() {
        int mopub = AbstractC1786e.mopub(this.vip, this.ad.hashCode() * 31, 31);
        Integer num = this.metrica;
        int hashCode = (mopub + (num == null ? 0 : num.hashCode())) * 31;
        C11811e c11811e = this.license;
        int vip = (hashCode + (c11811e == null ? 0 : C11811e.vip(c11811e.ad))) * 31;
        Throwable th = this.appmetrica;
        int hashCode2 = (vip + (th == null ? 0 : th.hashCode())) * 31;
        C11811e c11811e2 = this.purchase;
        int vip2 = (hashCode2 + (c11811e2 == null ? 0 : C11811e.vip(c11811e2.ad))) * 31;
        C11811e c11811e3 = this.billing;
        int vip3 = (vip2 + (c11811e3 == null ? 0 : C11811e.vip(c11811e3.ad))) * 31;
        C11811e c11811e4 = this.yandex;
        int vip4 = (vip3 + (c11811e4 == null ? 0 : C11811e.vip(c11811e4.ad))) * 31;
        C1096e c1096e = this.startapp;
        return vip4 + (c1096e != null ? c1096e.ad : 0);
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) C5060e.vip(this.ad)) + ", cameraClosedReason=" + AbstractC17861e.subs(this.vip) + ", cameraRetryCount=" + this.metrica + ", cameraRetryDurationNs=" + this.license + ", cameraException=" + this.appmetrica + ", cameraOpenDurationNs=" + this.purchase + ", cameraActiveDurationNs=" + this.billing + ", cameraClosingDurationNs=" + this.yandex + ", cameraErrorCode=" + this.startapp + ')';
    }
}
