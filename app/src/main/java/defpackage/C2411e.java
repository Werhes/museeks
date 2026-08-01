package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2411e {

    /* renamed from: abstract, reason: not valid java name */
    public static final String f6150abstract;

    /* renamed from: break, reason: not valid java name */
    public static final String f6151break;

    /* renamed from: case, reason: not valid java name */
    public static final String f6152case;

    /* renamed from: catch, reason: not valid java name */
    public static final String f6153catch;

    /* renamed from: const, reason: not valid java name */
    public static final String f6154const;

    /* renamed from: continue, reason: not valid java name */
    public static final String f6155continue;

    /* renamed from: default, reason: not valid java name */
    public static final String f6156default;

    /* renamed from: else, reason: not valid java name */
    public static final String f6157else;

    /* renamed from: extends, reason: not valid java name */
    public static final String f6158extends;

    /* renamed from: final, reason: not valid java name */
    public static final String f6159final;

    /* renamed from: finally, reason: not valid java name */
    public static final String f6160finally;

    /* renamed from: for, reason: not valid java name */
    public static final String f6161for;

    /* renamed from: goto, reason: not valid java name */
    public static final C2411e f6162goto;

    /* renamed from: implements, reason: not valid java name */
    public static final String f6163implements;

    /* renamed from: import, reason: not valid java name */
    public static final String f6164import;

    /* renamed from: instanceof, reason: not valid java name */
    public static final String f6165instanceof;

    /* renamed from: native, reason: not valid java name */
    public static final String f6166native;

    /* renamed from: new, reason: not valid java name */
    public static final String f6167new;

    /* renamed from: package, reason: not valid java name */
    public static final String f6168package;

    /* renamed from: private, reason: not valid java name */
    public static final String f6169private;

    /* renamed from: protected, reason: not valid java name */
    public static final String f6170protected;

    /* renamed from: public, reason: not valid java name */
    public static final String f6171public;

    /* renamed from: return, reason: not valid java name */
    public static final String f6172return;

    /* renamed from: static, reason: not valid java name */
    public static final String f6173static;

    /* renamed from: strictfp, reason: not valid java name */
    public static final String f6174strictfp;

    /* renamed from: super, reason: not valid java name */
    public static final String f6175super;

    /* renamed from: switch, reason: not valid java name */
    public static final String f6176switch;

    /* renamed from: synchronized, reason: not valid java name */
    public static final String f6177synchronized;

    /* renamed from: this, reason: not valid java name */
    public static final String f6178this;

    /* renamed from: throw, reason: not valid java name */
    public static final String f6179throw;

    /* renamed from: throws, reason: not valid java name */
    public static final String f6180throws;

    /* renamed from: transient, reason: not valid java name */
    public static final String f6181transient;

    /* renamed from: try, reason: not valid java name */
    public static final String f6182try;

    /* renamed from: volatile, reason: not valid java name */
    public static final String f6183volatile;

    /* renamed from: while, reason: not valid java name */
    public static final String f6184while;
    public final int Signature;
    public final C8256e ad;
    public final AbstractC6690e adcel;
    public final C3335e admob;
    public final int ads;
    public final C2351e advert;
    public final float amazon;
    public final int applovin;
    public final C0101e appmetrica;
    public final C4194e billing;

    /* renamed from: class, reason: not valid java name */
    public final C18255e f6185class;
    public final long crashlytics;
    public final long firebase;
    public final boolean inmobi;

    /* renamed from: interface, reason: not valid java name */
    public final C4491e f6186interface;
    public final boolean isPro;
    public final int isVip;
    public final C0101e license;
    public final float loadAd;
    public final C12693e metrica;
    public final int mopub;
    public final C12053e premium;
    public final int pro;
    public final int purchase;
    public final C5251e remoteconfig;
    public final boolean signatures;
    public final C12053e smaato;
    public final boolean startapp;
    public final long subs;
    public final C9039e subscription;
    public final boolean tapsense;
    public final int vip;
    public final int yandex;

    static {
        C12693e c12693e = C12693e.advert;
        C0101e c0101e = C12693e.mopub;
        C4194e c4194e = C4194e.license;
        C2351e c2351e = C2351e.license;
        C12182e c12182e = AbstractC6690e.ad;
        C12053e c12053e = C12053e.f24142throw;
        f6162goto = new C2411e(null, 0, c12693e, c0101e, c0101e, 0, c4194e, 0, false, c2351e, c12182e, 0, c12053e, 1.0f, 1.0f, C3335e.startapp, 0, C9039e.license, C5251e.appmetrica, 0, false, false, 1, 0, 1, false, false, c12053e, 5000L, 15000L, 3000L, C18255e.vip, C4491e.f9732native);
        String str = AbstractC9413e.ad;
        f6178this = Integer.toString(1, 36);
        f6166native = Integer.toString(2, 36);
        f6158extends = Integer.toString(3, 36);
        f6179throw = Integer.toString(4, 36);
        f6184while = Integer.toString(5, 36);
        f6182try = Integer.toString(6, 36);
        f6170protected = Integer.toString(7, 36);
        f6151break = Integer.toString(33, 36);
        f6150abstract = Integer.toString(8, 36);
        f6156default = Integer.toString(9, 36);
        f6163implements = Integer.toString(10, 36);
        f6152case = Integer.toString(11, 36);
        f6153catch = Integer.toString(12, 36);
        f6159final = Integer.toString(13, 36);
        f6175super = Integer.toString(14, 36);
        f6167new = Integer.toString(15, 36);
        f6174strictfp = Integer.toString(16, 36);
        f6169private = Integer.toString(17, 36);
        f6168package = Integer.toString(18, 36);
        f6181transient = Integer.toString(19, 36);
        f6164import = Integer.toString(20, 36);
        f6165instanceof = Integer.toString(21, 36);
        f6173static = Integer.toString(22, 36);
        f6177synchronized = Integer.toString(23, 36);
        f6172return = Integer.toString(24, 36);
        f6157else = Integer.toString(25, 36);
        f6176switch = Integer.toString(26, 36);
        f6180throws = Integer.toString(27, 36);
        f6160finally = Integer.toString(28, 36);
        f6154const = Integer.toString(29, 36);
        f6183volatile = Integer.toString(30, 36);
        f6161for = Integer.toString(31, 36);
        f6155continue = Integer.toString(32, 36);
        f6171public = Integer.toString(34, 36);
    }

    public C2411e(C8256e c8256e, int i, C12693e c12693e, C0101e c0101e, C0101e c0101e2, int i2, C4194e c4194e, int i3, boolean z, C2351e c2351e, AbstractC6690e abstractC6690e, int i4, C12053e c12053e, float f, float f2, C3335e c3335e, int i5, C9039e c9039e, C5251e c5251e, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, C12053e c12053e2, long j, long j2, long j3, C18255e c18255e, C4491e c4491e) {
        this.ad = c8256e;
        this.vip = i;
        this.metrica = c12693e;
        this.license = c0101e;
        this.appmetrica = c0101e2;
        this.purchase = i2;
        this.billing = c4194e;
        this.yandex = i3;
        this.startapp = z;
        this.advert = c2351e;
        this.adcel = abstractC6690e;
        this.mopub = i4;
        this.smaato = c12053e;
        this.amazon = f;
        this.loadAd = f2;
        this.Signature = i5;
        this.admob = c3335e;
        this.subscription = c9039e;
        this.remoteconfig = c5251e;
        this.pro = i6;
        this.signatures = z2;
        this.tapsense = z3;
        this.isVip = i7;
        this.applovin = i8;
        this.ads = i9;
        this.inmobi = z4;
        this.isPro = z5;
        this.premium = c12053e2;
        this.subs = j;
        this.crashlytics = j2;
        this.firebase = j3;
        this.f6185class = c18255e;
        this.f6186interface = c4491e;
    }

    public static C2411e subscription(int i, Bundle bundle) {
        C8256e c8256e;
        C1410e metrica;
        C1410e metrica2;
        AbstractC6690e c9791e;
        AbstractC6690e abstractC6690e;
        C2351e c2351e;
        C12053e c12053e;
        int i2;
        C1410e billing;
        C9039e c9039e;
        C9039e c9039e2;
        C5251e license;
        C18255e c18255e;
        IBinder binder = bundle.getBinder(f6155continue);
        if (binder instanceof BinderC11434e) {
            return ((BinderC11434e) binder).metrica;
        }
        Bundle bundle2 = bundle.getBundle(f6168package);
        if (bundle2 == null) {
            c8256e = null;
        } else {
            String string = bundle2.getString(C8256e.f16767e);
            String string2 = bundle2.getString(C8256e.f16766e);
            String string3 = bundle2.getString(C8256e.f16763e);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, C8256e.class.getClassLoader());
                    r3 = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (r3 == null) {
                        r3 = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    r3 = new RemoteException(string3);
                }
            }
            Throwable th = r3;
            int i3 = bundle2.getInt(C8256e.f16764e, 1000);
            Bundle Signature = AbstractC9413e.Signature(bundle2.getBundle(C8256e.f16765e));
            if (Signature == null) {
                Signature = Bundle.EMPTY;
            }
            c8256e = new C8256e(string, th, i3, Signature, bundle2.getLong(C8256e.f16762e, SystemClock.elapsedRealtime()));
        }
        int i4 = bundle.getInt(f6164import, 0);
        Bundle bundle3 = bundle.getBundle(f6181transient);
        C12693e vip = bundle3 == null ? C12693e.advert : C12693e.vip(i, bundle3);
        Bundle bundle4 = bundle.getBundle(f6165instanceof);
        C0101e metrica3 = bundle4 == null ? C12693e.mopub : C0101e.metrica(i, bundle4);
        Bundle bundle5 = bundle.getBundle(f6173static);
        C0101e metrica4 = bundle5 == null ? C12693e.mopub : C0101e.metrica(i, bundle5);
        int i5 = bundle.getInt(f6177synchronized, 0);
        Bundle bundle6 = bundle.getBundle(f6178this);
        C4194e c4194e = bundle6 == null ? C4194e.license : new C4194e(bundle6.getFloat(C4194e.appmetrica, 1.0f), bundle6.getFloat(C4194e.purchase, 1.0f));
        int i6 = bundle.getInt(f6166native, 0);
        boolean z = bundle.getBoolean(f6158extends, false);
        Bundle bundle7 = bundle.getBundle(f6179throw);
        if (bundle7 == null) {
            c9791e = AbstractC6690e.ad;
        } else {
            C13218e c13218e = new C13218e(i, 2);
            IBinder binder2 = bundle7.getBinder(AbstractC6690e.vip);
            if (binder2 == null) {
                C2171e c2171e = AbstractC17475e.f34223e;
                metrica = C1410e.f4222e;
            } else {
                metrica = AbstractC5092e.metrica(c13218e, BinderC7421e.ad(binder2));
            }
            C13218e c13218e2 = new C13218e(i, 3);
            IBinder binder3 = bundle7.getBinder(AbstractC6690e.metrica);
            if (binder3 == null) {
                C2171e c2171e2 = AbstractC17475e.f34223e;
                metrica2 = C1410e.f4222e;
            } else {
                metrica2 = AbstractC5092e.metrica(c13218e2, BinderC7421e.ad(binder3));
            }
            int[] intArray = bundle7.getIntArray(AbstractC6690e.license);
            if (intArray == null) {
                int i7 = metrica.f4224e;
                int[] iArr = new int[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    iArr[i8] = i8;
                }
                intArray = iArr;
            }
            c9791e = new C9791e(metrica, metrica2, intArray);
        }
        int i9 = bundle.getInt(f6161for, 0);
        Bundle bundle8 = bundle.getBundle(f6184while);
        if (bundle8 == null) {
            c2351e = C2351e.license;
            abstractC6690e = c9791e;
        } else {
            abstractC6690e = c9791e;
            c2351e = new C2351e(bundle8.getInt(C2351e.appmetrica, 0), bundle8.getFloat(C2351e.billing, 1.0f), bundle8.getInt(C2351e.purchase, 0));
        }
        Bundle bundle9 = bundle.getBundle(f6182try);
        C12053e vip2 = bundle9 == null ? C12053e.f24142throw : C12053e.vip(i, bundle9);
        float f = bundle.getFloat(f6170protected, 1.0f);
        float f2 = bundle.getFloat(f6151break, 1.0f);
        int i10 = bundle.getInt(f6171public, 0);
        Bundle bundle10 = bundle.getBundle(f6150abstract);
        C3335e ad = bundle10 == null ? C3335e.startapp : C3335e.ad(bundle10);
        Bundle bundle11 = bundle.getBundle(f6172return);
        if (bundle11 == null) {
            c9039e = C9039e.license;
            c12053e = vip2;
            i2 = i9;
        } else {
            ArrayList parcelableArrayList = bundle11.getParcelableArrayList(C9039e.appmetrica);
            if (parcelableArrayList == null) {
                billing = C1410e.f4222e;
                c12053e = vip2;
                i2 = i9;
            } else {
                C13304e Signature2 = AbstractC17475e.Signature();
                c12053e = vip2;
                i2 = i9;
                for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                    Bundle bundle12 = (Bundle) parcelableArrayList.get(i11);
                    bundle12.getClass();
                    Signature2.metrica(C17817e.ad(bundle12));
                }
                billing = Signature2.billing();
            }
            c9039e = new C9039e(bundle11.getLong(C9039e.purchase), billing);
        }
        Bundle bundle13 = bundle.getBundle(f6156default);
        if (bundle13 == null) {
            license = C5251e.appmetrica;
            c9039e2 = c9039e;
        } else {
            int i12 = bundle13.getInt(C5251e.purchase, 0);
            int i13 = bundle13.getInt(C5251e.billing, 0);
            c9039e2 = c9039e;
            int i14 = bundle13.getInt(C5251e.yandex, 0);
            String string4 = bundle13.getString(C5251e.startapp);
            C11226e c11226e = new C11226e(i12);
            c11226e.metrica = i13;
            c11226e.license = i14;
            AbstractC2301e.billing(i12 != 0 || string4 == null);
            c11226e.appmetrica = string4;
            license = c11226e.license();
        }
        int i15 = bundle.getInt(f6163implements, 0);
        boolean z2 = bundle.getBoolean(f6152case, false);
        boolean z3 = bundle.getBoolean(f6153catch, false);
        int i16 = bundle.getInt(f6159final, 1);
        int i17 = bundle.getInt(f6175super, 0);
        int i18 = bundle.getInt(f6167new, 1);
        boolean z4 = bundle.getBoolean(f6174strictfp, false);
        boolean z5 = bundle.getBoolean(f6169private, false);
        Bundle bundle14 = bundle.getBundle(f6157else);
        C12053e vip3 = bundle14 == null ? C12053e.f24142throw : C12053e.vip(i, bundle14);
        long j = bundle.getLong(f6176switch, i < 4 ? 0L : 5000L);
        long j2 = bundle.getLong(f6180throws, i < 4 ? 0L : 15000L);
        long j3 = bundle.getLong(f6160finally, i < 4 ? 0L : 3000L);
        Bundle bundle15 = bundle.getBundle(f6183volatile);
        if (bundle15 == null) {
            c18255e = C18255e.vip;
        } else {
            ArrayList parcelableArrayList2 = bundle15.getParcelableArrayList(C18255e.metrica);
            c18255e = new C18255e(parcelableArrayList2 == null ? C1410e.f4222e : AbstractC5092e.metrica(new C10612e(20), parcelableArrayList2));
        }
        Bundle bundle16 = bundle.getBundle(f6154const);
        return new C2411e(c8256e, i4, vip, metrica3, metrica4, i5, c4194e, i6, z, c2351e, abstractC6690e, i2, c12053e, f, f2, ad, i10, c9039e2, license, i15, z2, z3, i16, i17, i18, z4, z5, vip3, j, j2, j3, c18255e, bundle16 == null ? C4491e.f9732native : C4491e.vip(bundle16));
    }

    public final C2411e Signature(float f) {
        float f2 = f != 0.0f ? f : this.amazon;
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, f, f2, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e ad(C3335e c3335e) {
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, c3335e, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e adcel(C12693e c12693e) {
        AbstractC6690e abstractC6690e = this.adcel;
        AbstractC2301e.subscription(abstractC6690e.Signature() || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e admob(C5298e c5298e, boolean z, boolean z2) {
        float f;
        float f2;
        int i;
        boolean z3;
        int i2;
        boolean ad = c5298e.ad(16);
        boolean ad2 = c5298e.ad(17);
        C12693e c12693e = this.metrica;
        C12693e ad3 = c12693e.ad(ad, ad2);
        C0101e vip = this.license.vip(ad, ad2);
        C0101e vip2 = this.appmetrica.vip(ad, ad2);
        boolean z4 = true;
        AbstractC6690e abstractC6690e = this.adcel;
        if (!ad2 && ad && !abstractC6690e.Signature()) {
            int i3 = c12693e.ad.vip;
            if (abstractC6690e.loadAd() != 1) {
                C11501e smaato = abstractC6690e.smaato(i3, new C11501e(), 0L);
                C13304e Signature = AbstractC17475e.Signature();
                int i4 = smaato.amazon;
                while (true) {
                    i2 = smaato.loadAd;
                    if (i4 > i2) {
                        break;
                    }
                    C6158e purchase = abstractC6690e.purchase(i4, new C6158e(), true);
                    purchase.metrica = 0;
                    Signature.metrica(purchase);
                    i4++;
                }
                smaato.loadAd = i2 - smaato.amazon;
                smaato.amazon = 0;
                abstractC6690e = new C9791e(AbstractC17475e.ads(smaato), Signature.billing(), new int[]{0});
            }
        } else if (z || !ad2) {
            abstractC6690e = AbstractC6690e.ad;
        }
        AbstractC6690e abstractC6690e2 = abstractC6690e;
        C12053e c12053e = !c5298e.ad(18) ? C12053e.f24142throw : this.smaato;
        if (c5298e.ad(22)) {
            f = this.amazon;
            f2 = this.loadAd;
        } else {
            f = 1.0f;
            f2 = 1.0f;
        }
        C3335e c3335e = !c5298e.ad(21) ? C3335e.startapp : this.admob;
        C9039e c9039e = !c5298e.ad(28) ? C9039e.license : this.subscription;
        if (c5298e.ad(23)) {
            i = this.pro;
            z3 = this.signatures;
        } else {
            i = 0;
            z3 = false;
        }
        C12053e c12053e2 = !c5298e.ad(18) ? C12053e.f24142throw : this.premium;
        C18255e c18255e = (z2 || !c5298e.ad(30)) ? C18255e.vip : this.f6185class;
        if (!abstractC6690e2.Signature() && ad3.ad.vip >= abstractC6690e2.loadAd()) {
            z4 = false;
        }
        AbstractC2301e.subscription(z4);
        return new C2411e(this.ad, this.vip, ad3, vip, vip2, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e2, this.mopub, c12053e, f, f2, c3335e, this.Signature, c9039e, this.remoteconfig, i, z3, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, c12053e2, this.subs, this.crashlytics, this.firebase, c18255e, this.f6186interface);
    }

    public final C2411e advert(AbstractC6690e abstractC6690e) {
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e amazon(AbstractC6690e abstractC6690e, C12693e c12693e, int i) {
        AbstractC2301e.subscription(abstractC6690e.Signature() || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, i, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e appmetrica(C4194e c4194e) {
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, c4194e, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e billing(C12053e c12053e) {
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, c12053e, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e license(int i, int i2, boolean z) {
        int i3 = this.ads;
        boolean z2 = i3 == 3 && z && i2 == 0;
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, z, i, i2, i3, z2, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e loadAd(C4491e c4491e) {
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, c4491e);
    }

    public final C2411e metrica(int i, boolean z) {
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, i, z, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e mopub(boolean z) {
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, z, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v28 */
    public final Bundle pro(int i) {
        Bundle bundle;
        long j;
        int i2;
        boolean z;
        Bundle bundle2;
        ArrayList arrayList;
        AbstractC6690e abstractC6690e;
        int i3;
        C6158e c6158e;
        int i4;
        int i5;
        Bundle bundle3;
        AbstractC6690e abstractC6690e2;
        String str;
        int i6;
        long j2;
        int i7 = i;
        Bundle bundle4 = new Bundle();
        C8256e c8256e = this.ad;
        if (c8256e != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt(C8256e.f16764e, c8256e.f16770e);
            bundle5.putLong(C8256e.f16762e, c8256e.f16769e);
            bundle5.putString(C8256e.f16767e, c8256e.getMessage());
            bundle5.putBundle(C8256e.f16765e, c8256e.f16768e);
            Throwable cause = c8256e.getCause();
            if (cause != null) {
                bundle5.putString(C8256e.f16766e, cause.getClass().getName());
                bundle5.putString(C8256e.f16763e, cause.getMessage());
            }
            bundle4.putBundle(f6168package, bundle5);
        }
        int i8 = this.vip;
        if (i8 != 0) {
            bundle4.putInt(f6164import, i8);
        }
        C12693e c12693e = this.metrica;
        if (i7 < 3 || !c12693e.equals(C12693e.advert)) {
            bundle4.putBundle(f6181transient, c12693e.metrica(i7));
        }
        C0101e c0101e = this.license;
        if (i7 < 3 || !C12693e.mopub.ad(c0101e)) {
            bundle4.putBundle(f6165instanceof, c0101e.license(i7));
        }
        C0101e c0101e2 = this.appmetrica;
        if (i7 < 3 || !C12693e.mopub.ad(c0101e2)) {
            bundle4.putBundle(f6173static, c0101e2.license(i7));
        }
        int i9 = this.purchase;
        if (i9 != 0) {
            bundle4.putInt(f6177synchronized, i9);
        }
        C4194e c4194e = C4194e.license;
        C4194e c4194e2 = this.billing;
        if (!c4194e2.equals(c4194e)) {
            Bundle bundle6 = new Bundle();
            bundle6.putFloat(C4194e.appmetrica, c4194e2.ad);
            bundle6.putFloat(C4194e.purchase, c4194e2.vip);
            bundle4.putBundle(f6178this, bundle6);
        }
        int i10 = this.yandex;
        if (i10 != 0) {
            bundle4.putInt(f6166native, i10);
        }
        boolean z2 = this.startapp;
        if (z2) {
            bundle4.putBoolean(f6158extends, z2);
        }
        C12182e c12182e = AbstractC6690e.ad;
        AbstractC6690e abstractC6690e3 = this.adcel;
        boolean z3 = false;
        long j3 = 0;
        if (abstractC6690e3.equals(c12182e)) {
            bundle = bundle4;
            j = 0;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int loadAd = abstractC6690e3.loadAd();
            C11501e c11501e = new C11501e();
            int i11 = 0;
            while (i11 < loadAd) {
                C11501e smaato = abstractC6690e3.smaato(i11, c11501e, j3);
                smaato.getClass();
                Bundle bundle7 = new Bundle();
                long j4 = j3;
                if (!C1962e.billing.equals(smaato.metrica)) {
                    bundle7.putBundle(C11501e.pro, smaato.metrica.metrica(i7, false));
                }
                long j5 = smaato.appmetrica;
                if (j5 != -9223372036854775807L) {
                    j2 = -9223372036854775807L;
                    bundle7.putLong(C11501e.signatures, j5);
                } else {
                    j2 = -9223372036854775807L;
                }
                long j6 = smaato.purchase;
                if (j6 != j2) {
                    bundle7.putLong(C11501e.tapsense, j6);
                }
                long j7 = smaato.billing;
                if (j7 != j2) {
                    bundle7.putLong(C11501e.isVip, j7);
                }
                boolean z4 = smaato.yandex;
                if (z4) {
                    bundle7.putBoolean(C11501e.inmobi, z4);
                }
                boolean z5 = smaato.startapp;
                if (z5) {
                    bundle7.putBoolean(C11501e.isPro, z5);
                }
                C15197e c15197e = smaato.adcel;
                if (c15197e != null) {
                    bundle7.putBundle(C11501e.applovin, c15197e.metrica());
                }
                boolean z6 = smaato.mopub;
                if (z6) {
                    bundle7.putBoolean(C11501e.ads, z6);
                }
                long j8 = smaato.advert;
                if (j8 != j4) {
                    bundle7.putLong(C11501e.premium, j8);
                }
                long j9 = smaato.smaato;
                if (j9 != j2) {
                    bundle7.putLong(C11501e.subs, j9);
                }
                int i12 = smaato.amazon;
                if (i12 != 0) {
                    bundle7.putInt(C11501e.crashlytics, i12);
                }
                int i13 = smaato.loadAd;
                if (i13 != 0) {
                    bundle7.putInt(C11501e.firebase, i13);
                }
                long j10 = smaato.Signature;
                if (j10 != j4) {
                    bundle7.putLong(C11501e.f23099class, j10);
                }
                arrayList2.add(bundle7);
                i11++;
                j3 = j4;
            }
            j = j3;
            ArrayList arrayList3 = new ArrayList();
            int yandex = abstractC6690e3.yandex();
            C6158e c6158e2 = new C6158e();
            int i14 = 0;
            while (i14 < yandex) {
                C6158e purchase = abstractC6690e3.purchase(i14, c6158e2, z3);
                purchase.getClass();
                Bundle bundle8 = new Bundle();
                int i15 = purchase.metrica;
                if (i15 != 0) {
                    bundle8.putInt(C6158e.yandex, i15);
                }
                long j11 = purchase.license;
                if (j11 != -9223372036854775807L) {
                    z = z3;
                    bundle8.putLong(C6158e.startapp, j11);
                } else {
                    z = z3;
                }
                long j12 = purchase.appmetrica;
                if (j12 != j) {
                    bundle8.putLong(C6158e.adcel, j12);
                }
                boolean z7 = purchase.purchase;
                if (z7) {
                    bundle8.putBoolean(C6158e.mopub, z7);
                }
                if (purchase.billing.equals(C11541e.purchase)) {
                    bundle2 = bundle4;
                    arrayList = arrayList2;
                    abstractC6690e = abstractC6690e3;
                    i3 = yandex;
                    c6158e = c6158e2;
                    i4 = i14;
                } else {
                    String str2 = C6158e.advert;
                    C11541e c11541e = purchase.billing;
                    c11541e.getClass();
                    Bundle bundle9 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    C11768e[] c11768eArr = c11541e.appmetrica;
                    i3 = yandex;
                    int length = c11768eArr.length;
                    ?? r6 = z;
                    while (r6 < length) {
                        int i16 = r6;
                        C11768e c11768e = c11768eArr[i16];
                        c11768e.getClass();
                        int i17 = length;
                        Bundle bundle10 = new Bundle();
                        C6158e c6158e3 = c6158e2;
                        Bundle bundle11 = bundle4;
                        ArrayList arrayList5 = arrayList2;
                        bundle10.putLong(C11768e.smaato, c11768e.ad);
                        bundle10.putInt(C11768e.amazon, c11768e.vip);
                        bundle10.putInt(C11768e.pro, c11768e.metrica);
                        bundle10.putParcelableArrayList(C11768e.loadAd, new ArrayList<>(Arrays.asList(c11768e.license)));
                        String str3 = C11768e.signatures;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        C1962e[] c1962eArr = c11768e.appmetrica;
                        int i18 = i14;
                        int length2 = c1962eArr.length;
                        ?? r10 = z;
                        while (true) {
                            Bundle bundle12 = null;
                            if (r10 >= length2) {
                                break;
                            }
                            int i19 = r10;
                            C1962e c1962e = c1962eArr[i19];
                            if (c1962e == null) {
                                i6 = length2;
                            } else {
                                i6 = length2;
                                bundle12 = c1962e.metrica(i7, true);
                            }
                            arrayList6.add(bundle12);
                            length2 = i6;
                            r10 = i19 + 1;
                        }
                        bundle10.putParcelableArrayList(str3, arrayList6);
                        bundle10.putIntArray(C11768e.Signature, c11768e.purchase);
                        bundle10.putLongArray(C11768e.admob, c11768e.billing);
                        bundle10.putLong(C11768e.subscription, c11768e.adcel);
                        bundle10.putBoolean(C11768e.remoteconfig, c11768e.mopub);
                        bundle10.putStringArrayList(C11768e.tapsense, new ArrayList<>(Arrays.asList(c11768e.yandex)));
                        String str4 = C11768e.inmobi;
                        ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
                        C6311e[] c6311eArr = c11768e.startapp;
                        int length3 = c6311eArr.length;
                        ?? r102 = z;
                        while (r102 < length3) {
                            int i20 = r102;
                            C6311e c6311e = c6311eArr[i20];
                            if (c6311e == null) {
                                abstractC6690e2 = abstractC6690e3;
                                str = str2;
                                i5 = length3;
                                bundle3 = null;
                            } else {
                                i5 = length3;
                                bundle3 = new Bundle();
                                abstractC6690e2 = abstractC6690e3;
                                str = str2;
                                bundle3.putLong(C6311e.license, c6311e.ad);
                                bundle3.putLong(C6311e.appmetrica, c6311e.vip);
                                bundle3.putString(C6311e.purchase, c6311e.metrica);
                            }
                            arrayList7.add(bundle3);
                            length3 = i5;
                            abstractC6690e3 = abstractC6690e2;
                            str2 = str;
                            r102 = i20 + 1;
                        }
                        bundle10.putParcelableArrayList(str4, arrayList7);
                        bundle10.putBoolean(C11768e.isVip, c11768e.advert);
                        arrayList4.add(bundle10);
                        i7 = i;
                        length = i17;
                        c6158e2 = c6158e3;
                        bundle4 = bundle11;
                        arrayList2 = arrayList5;
                        i14 = i18;
                        r6 = i16 + 1;
                    }
                    bundle2 = bundle4;
                    arrayList = arrayList2;
                    abstractC6690e = abstractC6690e3;
                    String str5 = str2;
                    c6158e = c6158e2;
                    i4 = i14;
                    if (!arrayList4.isEmpty()) {
                        bundle9.putParcelableArrayList(C11541e.yandex, arrayList4);
                    }
                    long j13 = c11541e.vip;
                    if (j13 != j) {
                        bundle9.putLong(C11541e.startapp, j13);
                    }
                    long j14 = c11541e.metrica;
                    if (j14 != -9223372036854775807L) {
                        bundle9.putLong(C11541e.adcel, j14);
                    }
                    int i21 = c11541e.license;
                    if (i21 != 0) {
                        bundle9.putInt(C11541e.mopub, i21);
                    }
                    bundle8.putBundle(str5, bundle9);
                }
                arrayList3.add(bundle8);
                i14 = i4 + 1;
                i7 = i;
                z3 = z;
                yandex = i3;
                c6158e2 = c6158e;
                bundle4 = bundle2;
                arrayList2 = arrayList;
                abstractC6690e3 = abstractC6690e;
            }
            Bundle bundle13 = bundle4;
            ArrayList arrayList8 = arrayList2;
            AbstractC6690e abstractC6690e4 = abstractC6690e3;
            int i22 = z3;
            int[] iArr = new int[loadAd];
            boolean z8 = true;
            if (loadAd > 0) {
                iArr[i22] = abstractC6690e4.ad(true);
            }
            int i23 = 1;
            while (i23 < loadAd) {
                iArr[i23] = abstractC6690e4.appmetrica(iArr[i23 - 1], i22, z8);
                i23++;
                z8 = true;
                i22 = 0;
            }
            Bundle bundle14 = new Bundle();
            bundle14.putBinder(AbstractC6690e.vip, new BinderC7421e(arrayList8));
            bundle14.putBinder(AbstractC6690e.metrica, new BinderC7421e(arrayList3));
            bundle14.putIntArray(AbstractC6690e.license, iArr);
            bundle = bundle13;
            bundle.putBundle(f6179throw, bundle14);
        }
        int i24 = this.mopub;
        if (i24 != 0) {
            bundle.putInt(f6161for, i24);
        }
        C2351e c2351e = C2351e.license;
        C2351e c2351e2 = this.advert;
        if (!c2351e2.equals(c2351e)) {
            Bundle bundle15 = new Bundle();
            int i25 = c2351e2.ad;
            if (i25 != 0) {
                bundle15.putInt(C2351e.appmetrica, i25);
            }
            int i26 = c2351e2.vip;
            if (i26 != 0) {
                bundle15.putInt(C2351e.purchase, i26);
            }
            float f = c2351e2.metrica;
            if (f != 1.0f) {
                bundle15.putFloat(C2351e.billing, f);
            }
            bundle.putBundle(f6184while, bundle15);
        }
        C12053e c12053e = C12053e.f24142throw;
        C12053e c12053e2 = this.smaato;
        if (c12053e2.equals(c12053e)) {
            i2 = i;
        } else {
            i2 = i;
            bundle.putBundle(f6182try, c12053e2.metrica(i2));
        }
        float f2 = this.amazon;
        if (f2 != 1.0f) {
            bundle.putFloat(f6170protected, f2);
        }
        float f3 = this.loadAd;
        if (f3 != 1.0f) {
            bundle.putFloat(f6151break, f3);
        }
        int i27 = this.Signature;
        if (i27 != 0) {
            bundle.putInt(f6171public, i27);
        }
        C3335e c3335e = C3335e.startapp;
        C3335e c3335e2 = this.admob;
        if (!c3335e2.equals(c3335e)) {
            bundle.putBundle(f6150abstract, c3335e2.appmetrica());
        }
        C9039e c9039e = C9039e.license;
        C9039e c9039e2 = this.subscription;
        if (!c9039e2.equals(c9039e)) {
            Bundle bundle16 = new Bundle();
            String str6 = C9039e.appmetrica;
            C1410e c1410e = c9039e2.ad;
            C13304e Signature = AbstractC17475e.Signature();
            for (int i28 = 0; i28 < c1410e.f4224e; i28++) {
                if (((C17817e) c1410e.get(i28)).license == null) {
                    Signature.metrica((C17817e) c1410e.get(i28));
                }
            }
            C1410e billing = Signature.billing();
            ArrayList<? extends Parcelable> arrayList9 = new ArrayList<>(billing.f4224e);
            C2171e listIterator = billing.listIterator(0);
            while (listIterator.hasNext()) {
                C17817e c17817e = (C17817e) listIterator.next();
                Bundle vip = c17817e.vip();
                Bitmap bitmap = c17817e.license;
                if (bitmap != null) {
                    vip.putParcelable(C17817e.isVip, bitmap);
                }
                arrayList9.add(vip);
            }
            bundle16.putParcelableArrayList(str6, arrayList9);
            bundle16.putLong(C9039e.purchase, c9039e2.vip);
            bundle.putBundle(f6172return, bundle16);
        }
        C5251e c5251e = C5251e.appmetrica;
        C5251e c5251e2 = this.remoteconfig;
        if (!c5251e2.equals(c5251e)) {
            Bundle bundle17 = new Bundle();
            int i29 = c5251e2.ad;
            if (i29 != 0) {
                bundle17.putInt(C5251e.purchase, i29);
            }
            int i30 = c5251e2.vip;
            if (i30 != 0) {
                bundle17.putInt(C5251e.billing, i30);
            }
            int i31 = c5251e2.metrica;
            if (i31 != 0) {
                bundle17.putInt(C5251e.yandex, i31);
            }
            String str7 = c5251e2.license;
            if (str7 != null) {
                bundle17.putString(C5251e.startapp, str7);
            }
            bundle.putBundle(f6156default, bundle17);
        }
        int i32 = this.pro;
        if (i32 != 0) {
            bundle.putInt(f6163implements, i32);
        }
        boolean z9 = this.signatures;
        if (z9) {
            bundle.putBoolean(f6152case, z9);
        }
        boolean z10 = this.tapsense;
        if (z10) {
            bundle.putBoolean(f6153catch, z10);
        }
        int i33 = this.isVip;
        if (i33 != 1) {
            bundle.putInt(f6159final, i33);
        }
        int i34 = this.applovin;
        if (i34 != 0) {
            bundle.putInt(f6175super, i34);
        }
        int i35 = this.ads;
        if (i35 != 1) {
            bundle.putInt(f6167new, i35);
        }
        boolean z11 = this.inmobi;
        if (z11) {
            bundle.putBoolean(f6174strictfp, z11);
        }
        boolean z12 = this.isPro;
        if (z12) {
            bundle.putBoolean(f6169private, z12);
        }
        C12053e c12053e3 = C12053e.f24142throw;
        C12053e c12053e4 = this.premium;
        if (!c12053e4.equals(c12053e3)) {
            bundle.putBundle(f6157else, c12053e4.metrica(i2));
        }
        long j15 = i2 < 6 ? j : 5000L;
        long j16 = this.subs;
        if (j16 != j15) {
            bundle.putLong(f6176switch, j16);
        }
        long j17 = i2 < 6 ? j : 15000L;
        long j18 = this.crashlytics;
        if (j18 != j17) {
            bundle.putLong(f6180throws, j18);
        }
        long j19 = i2 < 6 ? j : 3000L;
        long j20 = this.firebase;
        if (j20 != j19) {
            bundle.putLong(f6160finally, j20);
        }
        C18255e c18255e = C18255e.vip;
        C18255e c18255e2 = this.f6185class;
        if (!c18255e2.equals(c18255e)) {
            Bundle bundle18 = new Bundle();
            bundle18.putParcelableArrayList(C18255e.metrica, AbstractC5092e.billing(c18255e2.ad, new C10612e(19)));
            bundle.putBundle(f6183volatile, bundle18);
        }
        C4491e c4491e = C4491e.f9732native;
        C4491e c4491e2 = this.f6186interface;
        if (!c4491e2.equals(c4491e)) {
            bundle.putBundle(f6154const, c4491e2.metrica());
        }
        return bundle;
    }

    public final C2411e purchase(int i, C8256e c8256e) {
        boolean z = this.tapsense;
        int i2 = this.applovin;
        boolean z2 = i == 3 && z && i2 == 0;
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(c8256e, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, z, this.isVip, i2, i, z2, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C1962e remoteconfig() {
        AbstractC6690e abstractC6690e = this.adcel;
        if (abstractC6690e.Signature()) {
            return null;
        }
        return abstractC6690e.smaato(this.metrica.ad.vip, new C11501e(), 0L).metrica;
    }

    public final C2411e smaato(C8814e c8814e, int i) {
        C12693e c12693e = this.metrica;
        C0101e c0101e = c12693e.ad;
        C12693e c12693e2 = new C12693e(new C0101e(c0101e.ad, i, c0101e.metrica, c0101e.license, c0101e.appmetrica, c0101e.purchase, c0101e.billing, c0101e.yandex, c0101e.startapp), c12693e.vip, c12693e.metrica, c12693e.license, c12693e.appmetrica, c12693e.purchase, c12693e.billing, c12693e.yandex, c12693e.startapp, c12693e.adcel);
        AbstractC2301e.subscription(c8814e.Signature() || c12693e2.ad.vip < c8814e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e2, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, c8814e, 0, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e startapp(int i) {
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, i, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }

    public final C2411e vip(C18255e c18255e) {
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, c18255e, this.f6186interface);
    }

    public final C2411e yandex(C0101e c0101e, C0101e c0101e2, int i) {
        AbstractC6690e abstractC6690e = this.adcel;
        boolean Signature = abstractC6690e.Signature();
        C12693e c12693e = this.metrica;
        AbstractC2301e.subscription(Signature || c12693e.ad.vip < abstractC6690e.loadAd());
        return new C2411e(this.ad, this.vip, c12693e, c0101e, c0101e2, i, this.billing, this.yandex, this.startapp, this.advert, abstractC6690e, this.mopub, this.smaato, this.amazon, this.loadAd, this.admob, this.Signature, this.subscription, this.remoteconfig, this.pro, this.signatures, this.tapsense, this.isVip, this.applovin, this.ads, this.inmobi, this.isPro, this.premium, this.subs, this.crashlytics, this.firebase, this.f6185class, this.f6186interface);
    }
}
