package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4761e {
    public Integer Signature;
    public CharSequence ad;
    public AbstractC5340e adcel;
    public Integer admob;
    public CharSequence ads;
    public C18080e advert;
    public Uri amazon;
    public CharSequence applovin;
    public CharSequence appmetrica;
    public CharSequence billing;

    /* renamed from: class, reason: not valid java name */
    public CharSequence f10190class;
    public Integer crashlytics;
    public CharSequence firebase;

    /* renamed from: goto, reason: not valid java name */
    public Integer f10191goto;
    public Integer inmobi;

    /* renamed from: interface, reason: not valid java name */
    public CharSequence f10192interface;
    public Integer isPro;
    public Integer isVip;
    public CharSequence license;
    public Integer loadAd;
    public CharSequence metrica;
    public byte[] mopub;

    /* renamed from: native, reason: not valid java name */
    public AbstractC17475e f10193native;
    public CharSequence premium;
    public Integer pro;
    public CharSequence purchase;
    public Boolean remoteconfig;
    public Integer signatures;
    public Integer smaato;
    public AbstractC5340e startapp;
    public Integer subs;
    public Boolean subscription;
    public Integer tapsense;

    /* renamed from: this, reason: not valid java name */
    public Bundle f10194this;
    public CharSequence vip;
    public Long yandex;

    public C4761e() {
        C2171e c2171e = AbstractC17475e.f34223e;
        this.f10193native = C1410e.f4222e;
    }

    public final void ad(int i, byte[] bArr) {
        if (this.mopub == null || i == 3 || !Objects.equals(this.smaato, 3)) {
            this.mopub = (byte[]) bArr.clone();
            this.advert = null;
            this.smaato = Integer.valueOf(i);
        }
    }

    public final void metrica(Long l) {
        AbstractC2301e.billing(l == null || l.longValue() >= 0);
        this.yandex = l;
    }

    public final void vip(byte[] bArr, Integer num) {
        this.mopub = bArr == null ? null : (byte[]) bArr.clone();
        this.advert = null;
        this.smaato = num;
    }
}
