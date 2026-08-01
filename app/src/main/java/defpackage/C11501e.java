package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11501e {
    public static final String ads;
    public static final String applovin;

    /* renamed from: class, reason: not valid java name */
    public static final String f23099class;
    public static final String crashlytics;
    public static final String firebase;
    public static final String inmobi;
    public static final String isPro;
    public static final String isVip;
    public static final String premium;
    public static final String pro;
    public static final C1962e remoteconfig;
    public static final String signatures;
    public static final String subs;
    public static final String tapsense;
    public long Signature;
    public C15197e adcel;
    public long advert;
    public int amazon;
    public long appmetrica;
    public long billing;
    public Object license;
    public int loadAd;
    public boolean mopub;
    public long purchase;
    public long smaato;
    public boolean startapp;
    public Object vip;
    public boolean yandex;
    public static final Object admob = new Object();
    public static final Object subscription = new Object();
    public Object ad = admob;
    public C1962e metrica = remoteconfig;

    /* JADX WARN: Type inference failed for: r2v5, types: [eٌّؒ, eٔؐۜ] */
    static {
        C16914e c16914e;
        C9466e c9466e = new C9466e();
        C3560e c3560e = new C3560e();
        List list = Collections.EMPTY_LIST;
        C1410e c1410e = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        Uri uri = Uri.EMPTY;
        AbstractC2301e.subscription(((Uri) c3560e.appmetrica) == null || ((UUID) c3560e.license) != null);
        C8369e c8369e = null;
        if (uri != null) {
            if (((UUID) c3560e.license) != null) {
                c8369e = new C8369e(c3560e);
            }
            c16914e = new C16914e(uri, null, c8369e, null, list, null, c1410e, null, -9223372036854775807L);
        } else {
            c16914e = null;
        }
        remoteconfig = new C1962e("androidx.media3.common.Timeline", new C14435e(c9466e), c16914e, new C15197e(c9457e), C12053e.f24142throw, c13325e);
        pro = Integer.toString(1, 36);
        signatures = Integer.toString(2, 36);
        tapsense = Integer.toString(3, 36);
        isVip = Integer.toString(4, 36);
        inmobi = Integer.toString(5, 36);
        isPro = Integer.toString(6, 36);
        applovin = Integer.toString(7, 36);
        ads = Integer.toString(8, 36);
        premium = Integer.toString(9, 36);
        subs = Integer.toString(10, 36);
        crashlytics = Integer.toString(11, 36);
        firebase = Integer.toString(12, 36);
        f23099class = Integer.toString(13, 36);
    }

    public final boolean ad() {
        return this.adcel != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11501e.class.equals(obj.getClass())) {
            C11501e c11501e = (C11501e) obj;
            if (Objects.equals(this.ad, c11501e.ad) && Objects.equals(this.metrica, c11501e.metrica) && Objects.equals(this.license, c11501e.license) && Objects.equals(this.adcel, c11501e.adcel) && this.appmetrica == c11501e.appmetrica && this.purchase == c11501e.purchase && this.billing == c11501e.billing && this.yandex == c11501e.yandex && this.startapp == c11501e.startapp && this.mopub == c11501e.mopub && this.advert == c11501e.advert && this.smaato == c11501e.smaato && this.amazon == c11501e.amazon && this.loadAd == c11501e.loadAd && this.Signature == c11501e.Signature) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.metrica.hashCode() + ((this.ad.hashCode() + 217) * 31)) * 31;
        Object obj = this.license;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C15197e c15197e = this.adcel;
        int hashCode3 = (hashCode2 + (c15197e != null ? c15197e.hashCode() : 0)) * 31;
        long j = this.appmetrica;
        int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.purchase;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.billing;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.yandex ? 1 : 0)) * 31) + (this.startapp ? 1 : 0)) * 31) + (this.mopub ? 1 : 0)) * 31;
        long j4 = this.advert;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.smaato;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.amazon) * 31) + this.loadAd) * 31;
        long j6 = this.Signature;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final void vip(Object obj, C1962e c1962e, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C15197e c15197e, long j4, long j5, int i, int i2, long j6) {
        C16914e c16914e;
        this.ad = obj;
        this.metrica = c1962e != null ? c1962e : remoteconfig;
        this.vip = (c1962e == null || (c16914e = c1962e.vip) == null) ? null : c16914e.yandex;
        this.license = obj2;
        this.appmetrica = j;
        this.purchase = j2;
        this.billing = j3;
        this.yandex = z;
        this.startapp = z2;
        this.adcel = c15197e;
        this.advert = j4;
        this.smaato = j5;
        this.amazon = i;
        this.loadAd = i2;
        this.Signature = j6;
        this.mopub = false;
    }
}
