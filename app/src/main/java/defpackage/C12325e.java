package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12325e implements InterfaceC18036e {
    public static final String Signature;
    public static final String admob;
    public static final String advert;
    public static final String amazon;
    public static final String loadAd;
    public static final String mopub;
    public static final String pro;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String subscription;
    public final int ad;
    public final MediaSession.Token adcel;
    public final String appmetrica;
    public final ComponentName billing;
    public final int license;
    public final int metrica;
    public final String purchase;
    public final Bundle startapp;
    public final int vip;
    public final IBinder yandex;

    static {
        String str = AbstractC9413e.ad;
        mopub = Integer.toString(0, 36);
        advert = Integer.toString(1, 36);
        smaato = Integer.toString(2, 36);
        amazon = Integer.toString(3, 36);
        loadAd = Integer.toString(4, 36);
        Signature = Integer.toString(5, 36);
        admob = Integer.toString(6, 36);
        subscription = Integer.toString(7, 36);
        remoteconfig = Integer.toString(8, 36);
        pro = Integer.toString(9, 36);
    }

    public C12325e(int i, int i2, int i3, int i4, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle, MediaSession.Token token) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
        this.appmetrica = str;
        this.purchase = str2;
        this.billing = componentName;
        this.yandex = iBinder;
        this.startapp = bundle;
        this.adcel = token;
    }

    @Override // defpackage.InterfaceC18036e
    public final int ad() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC18036e
    public final String ads() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC18036e
    /* renamed from: class */
    public final Bundle mo1736class() {
        Bundle bundle = new Bundle();
        bundle.putInt(mopub, this.ad);
        bundle.putInt(advert, this.vip);
        bundle.putInt(smaato, this.metrica);
        bundle.putString(amazon, this.appmetrica);
        bundle.putString(loadAd, this.purchase);
        bundle.putBinder(admob, this.yandex);
        bundle.putParcelable(Signature, this.billing);
        bundle.putBundle(subscription, this.startapp);
        bundle.putInt(remoteconfig, this.license);
        MediaSession.Token token = this.adcel;
        if (token != null) {
            bundle.putParcelable(pro, token);
        }
        return bundle;
    }

    @Override // defpackage.InterfaceC18036e
    public final boolean crashlytics() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12325e)) {
            return false;
        }
        C12325e c12325e = (C12325e) obj;
        return this.ad == c12325e.ad && this.vip == c12325e.vip && this.metrica == c12325e.metrica && this.license == c12325e.license && TextUtils.equals(this.appmetrica, c12325e.appmetrica) && TextUtils.equals(this.purchase, c12325e.purchase) && Objects.equals(this.billing, c12325e.billing) && Objects.equals(this.yandex, c12325e.yandex) && Objects.equals(this.adcel, c12325e.adcel);
    }

    @Override // defpackage.InterfaceC18036e
    public final int firebase() {
        return this.license;
    }

    @Override // defpackage.InterfaceC18036e
    public final Bundle getExtras() {
        return new Bundle(this.startapp);
    }

    @Override // defpackage.InterfaceC18036e
    public final String getServiceName() {
        return this.purchase;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.ad), Integer.valueOf(this.vip), Integer.valueOf(this.metrica), Integer.valueOf(this.license), this.appmetrica, this.purchase, this.billing, this.yandex, this.adcel);
    }

    @Override // defpackage.InterfaceC18036e
    /* renamed from: interface */
    public final MediaSession.Token mo1737interface() {
        return this.adcel;
    }

    @Override // defpackage.InterfaceC18036e
    public final ComponentName premium() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC18036e
    public final Object subs() {
        return this.yandex;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.appmetrica + " type=" + this.vip + " libraryVersion=" + this.metrica + " interfaceVersion=" + this.license + " service=" + this.purchase + " IMediaSession=" + this.yandex + " extras=" + this.startapp + "}";
    }

    @Override // defpackage.InterfaceC18036e
    public final int vip() {
        return this.ad;
    }
}
