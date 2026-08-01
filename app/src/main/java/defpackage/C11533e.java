package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11533e {
    public final String Signature;
    public final String ad;
    public final long adcel;
    public final String admob;
    public final AbstractC17475e advert;
    public final C1410e amazon;
    public final long appmetrica;
    public final long billing;
    public final long license;
    public final boolean loadAd;
    public final Uri metrica;
    public final long mopub;
    public final String pro;
    public final long purchase;
    public final long remoteconfig;
    public final AbstractC17475e smaato;
    public final boolean startapp;
    public final long subscription;
    public final Uri vip;
    public final List yandex;

    public C11533e(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        AbstractC2301e.billing((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.ad = str;
        this.vip = uri;
        this.metrica = uri2;
        this.license = j;
        this.appmetrica = j2;
        this.purchase = j3;
        this.billing = j4;
        this.yandex = arrayList;
        this.startapp = z;
        this.adcel = j5;
        this.mopub = j6;
        this.advert = AbstractC17475e.remoteconfig(arrayList2);
        this.smaato = AbstractC17475e.remoteconfig(arrayList3);
        this.amazon = AbstractC17475e.firebase(new C6575e(16), arrayList4);
        this.loadAd = z2;
        this.Signature = str2;
        this.admob = str3;
        this.subscription = j7;
        this.remoteconfig = j8;
        this.pro = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11533e)) {
            return false;
        }
        C11533e c11533e = (C11533e) obj;
        return this.license == c11533e.license && this.appmetrica == c11533e.appmetrica && this.purchase == c11533e.purchase && this.billing == c11533e.billing && this.startapp == c11533e.startapp && this.adcel == c11533e.adcel && this.mopub == c11533e.mopub && this.loadAd == c11533e.loadAd && this.subscription == c11533e.subscription && this.remoteconfig == c11533e.remoteconfig && Objects.equals(this.ad, c11533e.ad) && Objects.equals(this.vip, c11533e.vip) && Objects.equals(this.metrica, c11533e.metrica) && Objects.equals(this.yandex, c11533e.yandex) && Objects.equals(this.advert, c11533e.advert) && Objects.equals(this.smaato, c11533e.smaato) && Objects.equals(this.amazon, c11533e.amazon) && Objects.equals(this.Signature, c11533e.Signature) && Objects.equals(this.admob, c11533e.admob) && Objects.equals(this.pro, c11533e.pro);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip, this.metrica, Long.valueOf(this.license), Long.valueOf(this.appmetrica), Long.valueOf(this.purchase), Long.valueOf(this.billing), this.yandex, Boolean.valueOf(this.startapp), Long.valueOf(this.adcel), Long.valueOf(this.mopub), this.advert, this.smaato, this.amazon, Boolean.valueOf(this.loadAd), this.Signature, this.admob, Long.valueOf(this.subscription), Long.valueOf(this.remoteconfig), this.pro);
    }
}
