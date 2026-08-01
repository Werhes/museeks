package defpackage;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15477e implements InterfaceC8524e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final WeakReference f30569e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final WeakReference f30570e;

    public C15477e(C6584e c6584e, C6268e c6268e) {
        this.f30570e = new WeakReference(c6584e);
        this.f30569e = new WeakReference(c6268e);
    }

    @Override // defpackage.InterfaceC8524e
    public final void Signature(int i) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        ad.remoteconfig = ad.remoteconfig.startapp(i);
        ad.metrica.ad(true, true);
        try {
            ad.yandex.adcel.signatures(i);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: abstract */
    public final void mo1480abstract(C5298e c5298e) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        ad.mopub(c5298e);
    }

    public final C6584e ad() {
        return (C6584e) this.f30570e.get();
    }

    @Override // defpackage.InterfaceC8524e
    public final void admob(float f) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        ad.remoteconfig = ad.remoteconfig.Signature(f);
        ad.metrica.ad(true, true);
        try {
            ad.yandex.adcel.getClass();
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final void ads(C8256e c8256e) {
        C4491e c4491e;
        boolean z;
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        int i = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.inmobi;
        boolean z6 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j = c2411e.subs;
        long j2 = c2411e.crashlytics;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e2 = c2411e.f6186interface;
        try {
            if (abstractC6690e.Signature()) {
                c4491e = c4491e2;
            } else {
                c4491e = c4491e2;
                if (c12693e.ad.vip >= abstractC6690e.loadAd()) {
                    z = false;
                    AbstractC2301e.subscription(z);
                    ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
                    ad.metrica.ad(true, true);
                    C5537e c5537e = (C5537e) ad.yandex.adcel.f18314e;
                    c5537e.m1934static(c5537e.yandex.pro);
                    return;
                }
            }
            C5537e c5537e2 = (C5537e) ad.yandex.adcel.f18314e;
            c5537e2.m1934static(c5537e2.yandex.pro);
            return;
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        AbstractC2301e.subscription(z);
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void amazon(C17750e c17750e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void appmetrica(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: break */
    public final void mo1481break(C4194e c4194e) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        ad.remoteconfig = ad.remoteconfig.appmetrica(c4194e);
        ad.metrica.ad(true, true);
        try {
            C5537e c5537e = (C5537e) ad.yandex.adcel.f18314e;
            c5537e.m1934static(c5537e.yandex.pro);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: case */
    public final void mo1482case(int i, int i2) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        ad.yandex(new C14422e(i, i2, 3));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: class */
    public final void mo1484class(long j) {
        C4491e c4491e;
        boolean z;
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        int i = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.inmobi;
        boolean z6 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j2 = c2411e.crashlytics;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e2 = c2411e.f6186interface;
        try {
            if (abstractC6690e.Signature()) {
                c4491e = c4491e2;
            } else {
                c4491e = c4491e2;
                if (c12693e.ad.vip >= abstractC6690e.loadAd()) {
                    z = false;
                    AbstractC2301e.subscription(z);
                    ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
                    ad.metrica.ad(true, true);
                    ad.yandex.adcel.getClass();
                    return;
                }
            }
            ad.yandex.adcel.getClass();
            return;
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        AbstractC2301e.subscription(z);
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void crashlytics(C8256e c8256e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: default */
    public final void mo1485default(C5251e c5251e) {
        C4491e c4491e;
        boolean z;
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        int i = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.inmobi;
        boolean z6 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j = c2411e.subs;
        long j2 = c2411e.crashlytics;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e2 = c2411e.f6186interface;
        try {
            if (abstractC6690e.Signature()) {
                c4491e = c4491e2;
            } else {
                c4491e = c4491e2;
                if (c12693e.ad.vip >= abstractC6690e.loadAd()) {
                    z = false;
                    AbstractC2301e.subscription(z);
                    ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
                    ad.metrica.ad(true, true);
                    ad.yandex.adcel.Signature();
                    return;
                }
            }
            ad.yandex.adcel.Signature();
            return;
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        AbstractC2301e.subscription(z);
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: extends */
    public final void mo1486extends() {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        C11106e c11106e = ad.billing.license;
        AbstractC17475e m3014native = c11106e.m3014native();
        for (int i = 0; i < m3014native.size(); i++) {
            C18424e c18424e = (C18424e) m3014native.get(i);
            c11106e.m3027try(c18424e);
            ad.billing(c18424e, new C13415e(18));
        }
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: final */
    public final void mo1487final(boolean z) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        int i = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j = c2411e.subs;
        long j2 = c2411e.crashlytics;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e = c2411e.f6186interface;
        AbstractC2301e.subscription(abstractC6690e.Signature() || c12693e.ad.vip < abstractC6690e.loadAd());
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z, z5, c12053e2, j, j2, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
        try {
            C5537e c5537e = (C5537e) ad.yandex.adcel.f18314e;
            c5537e.m1934static(c5537e.yandex.pro);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
        ad.m2205extends();
    }

    @Override // defpackage.InterfaceC8524e
    public final void firebase(int i, boolean z) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        ad.remoteconfig = ad.remoteconfig.metrica(i, z);
        ad.metrica.ad(true, true);
        try {
            C18501e c18501e = ((C5537e) ad.yandex.adcel.f18314e).admob;
            if (c18501e != null) {
                if (z) {
                    i = 0;
                }
                c18501e.f36257e = i;
                c18501e.ad().setCurrentVolume(i);
            }
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: goto */
    public final void mo1488goto(C12053e c12053e) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        ad.remoteconfig = ad.remoteconfig.billing(c12053e);
        ad.metrica.ad(true, true);
        try {
            ad.yandex.adcel.pro(c12053e);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: implements */
    public final void mo1489implements(long j) {
        C4491e c4491e;
        boolean z;
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        int i = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.inmobi;
        boolean z6 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j2 = c2411e.subs;
        long j3 = c2411e.crashlytics;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e2 = c2411e.f6186interface;
        if (abstractC6690e.Signature()) {
            c4491e = c4491e2;
        } else {
            c4491e = c4491e2;
            if (c12693e.ad.vip >= abstractC6690e.loadAd()) {
                z = false;
                AbstractC2301e.subscription(z);
                ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j2, j3, j, c18255e, c4491e);
                ad.metrica.ad(true, true);
            }
        }
        z = true;
        AbstractC2301e.subscription(z);
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j2, j3, j, c18255e, c4491e);
        ad.metrica.ad(true, true);
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: interface */
    public final void mo1491interface(C12053e c12053e) {
        C4491e c4491e;
        boolean z;
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        int i = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e2 = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.inmobi;
        boolean z6 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        long j = c2411e.subs;
        long j2 = c2411e.crashlytics;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e2 = c2411e.f6186interface;
        try {
            if (abstractC6690e.Signature()) {
                c4491e = c4491e2;
            } else {
                c4491e = c4491e2;
                if (c12693e.ad.vip >= abstractC6690e.loadAd()) {
                    z = false;
                    AbstractC2301e.subscription(z);
                    ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e2, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e, j, j2, j3, c18255e, c4491e);
                    ad.metrica.ad(true, true);
                    ad.yandex.adcel.isPro();
                    return;
                }
            }
            ad.yandex.adcel.isPro();
            return;
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        AbstractC2301e.subscription(z);
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e2, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e, j, j2, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
    }

    @Override // defpackage.InterfaceC8524e
    public final void isPro(C9039e c9039e) {
        C4491e c4491e;
        boolean z;
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        int i = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.inmobi;
        boolean z6 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j = c2411e.subs;
        long j2 = c2411e.crashlytics;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e2 = c2411e.f6186interface;
        if (abstractC6690e.Signature()) {
            c4491e = c4491e2;
        } else {
            c4491e = c4491e2;
            if (c12693e.ad.vip >= abstractC6690e.loadAd()) {
                z = false;
                AbstractC2301e.subscription(z);
                ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
                ad.metrica.ad(true, true);
            }
        }
        z = true;
        AbstractC2301e.subscription(z);
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
    }

    @Override // defpackage.InterfaceC8524e
    public final void isVip(boolean z) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        ad.remoteconfig = ad.remoteconfig.mopub(z);
        ad.metrica.ad(true, true);
        try {
            ad.yandex.adcel.isVip(z);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void license(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void loadAd(int i, boolean z) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        ad.remoteconfig = c2411e.license(i, c2411e.applovin, z);
        ad.metrica.ad(true, true);
        try {
            C5537e c5537e = (C5537e) ad.yandex.adcel.f18314e;
            c5537e.m1934static(c5537e.yandex.pro);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final void metrica(int i) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        ad.remoteconfig = c2411e.license(c2411e.isVip, i, c2411e.tapsense);
        ad.metrica.ad(true, true);
        try {
            C5537e c5537e = (C5537e) ad.yandex.adcel.f18314e;
            c5537e.m1934static(c5537e.yandex.pro);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final void mopub(C4491e c4491e) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        ad.remoteconfig = ad.remoteconfig.loadAd(c4491e);
        ad.metrica.ad(true, true);
        ad.yandex(new C13415e(16, c4491e));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: native */
    public final void mo1492native(AbstractC6690e abstractC6690e, int i) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        C6268e c6268e = (C6268e) this.f30569e.get();
        if (c6268e == null) {
            return;
        }
        ad.remoteconfig = ad.remoteconfig.amazon(abstractC6690e, c6268e.m2087e(), i);
        ad.metrica.ad(false, true);
        try {
            ad.yandex.adcel.inmobi(abstractC6690e);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final void premium(C18255e c18255e) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        ad.remoteconfig = ad.remoteconfig.vip(c18255e);
        ad.metrica.ad(true, false);
        ad.yandex(new C13415e(17, c18255e));
    }

    @Override // defpackage.InterfaceC8524e
    public final void pro(int i) {
        C4491e c4491e;
        boolean z;
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        int i2 = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i3 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i4 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i5 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.inmobi;
        boolean z6 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j = c2411e.subs;
        long j2 = c2411e.crashlytics;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e2 = c2411e.f6186interface;
        try {
            if (abstractC6690e.Signature()) {
                c4491e = c4491e2;
            } else {
                c4491e = c4491e2;
                if (c12693e.ad.vip >= abstractC6690e.loadAd()) {
                    z = false;
                    AbstractC2301e.subscription(z);
                    ad.remoteconfig = new C2411e(c8256e, i2, c12693e, c0101e, c0101e2, i3, c4194e, i4, z2, c2351e, abstractC6690e, i5, c12053e, f, f2, c3335e, i, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
                    ad.metrica.ad(true, true);
                    ad.yandex.adcel.getClass();
                    return;
                }
            }
            ad.yandex.adcel.getClass();
            return;
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        AbstractC2301e.subscription(z);
        ad.remoteconfig = new C2411e(c8256e, i2, c12693e, c0101e, c0101e2, i3, c4194e, i4, z2, c2351e, abstractC6690e, i5, c12053e, f, f2, c3335e, i, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
    }

    @Override // defpackage.InterfaceC8524e
    public final void purchase(C0101e c0101e, C0101e c0101e2, int i) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        ad.remoteconfig = ad.remoteconfig.yandex(c0101e, c0101e2, i);
        ad.metrica.ad(true, true);
        try {
            C5537e c5537e = (C5537e) ad.yandex.adcel.f18314e;
            c5537e.m1934static(c5537e.yandex.pro);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final void signatures(int i) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        C6268e c6268e = (C6268e) this.f30569e.get();
        if (c6268e == null) {
            return;
        }
        ad.remoteconfig = ad.remoteconfig.purchase(i, c6268e.mo2134public());
        ad.metrica.ad(true, true);
        try {
            C9156e c9156e = ad.yandex.adcel;
            c6268e.mo2134public();
            C5537e c5537e = (C5537e) c9156e.f18314e;
            c5537e.m1934static(c5537e.yandex.pro);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final void smaato(boolean z) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        int i = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.inmobi;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j = c2411e.subs;
        long j2 = c2411e.crashlytics;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e = c2411e.f6186interface;
        AbstractC2301e.subscription(abstractC6690e.Signature() || c12693e.ad.vip < abstractC6690e.loadAd());
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z, c12053e2, j, j2, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
        try {
            ad.yandex.adcel.getClass();
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
        ad.m2205extends();
    }

    @Override // defpackage.InterfaceC8524e
    public final void startapp(C3335e c3335e) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        ad.remoteconfig = ad.remoteconfig.ad(c3335e);
        ad.metrica.ad(true, true);
        try {
            C5537e c5537e = (C5537e) ad.yandex.adcel.f18314e;
            if (c5537e.yandex.pro.mo2131new().ad == 0) {
                ((C2584e) c5537e.amazon.f26645e).ad.setPlaybackToLocal(c3335e.metrica());
            }
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void subs(InterfaceC16843e interfaceC16843e, C3164e c3164e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void subscription(int i, C1962e c1962e) {
        C4491e c4491e;
        boolean z;
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.inmobi;
        boolean z6 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j = c2411e.subs;
        long j2 = c2411e.crashlytics;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e2 = c2411e.f6186interface;
        try {
            if (abstractC6690e.Signature()) {
                c4491e = c4491e2;
            } else {
                c4491e = c4491e2;
                if (c12693e.ad.vip >= abstractC6690e.loadAd()) {
                    z = false;
                    AbstractC2301e.subscription(z);
                    ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
                    ad.metrica.ad(true, true);
                    ad.yandex.adcel.admob(c1962e);
                    return;
                }
            }
            ad.yandex.adcel.admob(c1962e);
            return;
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        AbstractC2301e.subscription(z);
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: this */
    public final void mo1499this(long j) {
        C4491e c4491e;
        boolean z;
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        if (((C6268e) this.f30569e.get()) == null) {
            return;
        }
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        int i = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C2351e c2351e = c2411e.advert;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z3 = c2411e.signatures;
        boolean z4 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z5 = c2411e.inmobi;
        boolean z6 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j2 = c2411e.subs;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e2 = c2411e.f6186interface;
        try {
            if (abstractC6690e.Signature()) {
                c4491e = c4491e2;
            } else {
                c4491e = c4491e2;
                if (c12693e.ad.vip >= abstractC6690e.loadAd()) {
                    z = false;
                    AbstractC2301e.subscription(z);
                    ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j2, j, j3, c18255e, c4491e);
                    ad.metrica.ad(true, true);
                    ad.yandex.adcel.getClass();
                    return;
                }
            }
            ad.yandex.adcel.getClass();
            return;
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
            return;
        }
        z = true;
        AbstractC2301e.subscription(z);
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j2, j, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: throw */
    public final /* synthetic */ void mo1500throw(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: try */
    public final /* synthetic */ void mo1502try(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void vip(C2351e c2351e) {
        C6584e ad = ad();
        if (ad == null) {
            return;
        }
        ad.m2210while();
        C2411e c2411e = ad.remoteconfig;
        C8256e c8256e = c2411e.ad;
        int i = c2411e.vip;
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c2411e.license;
        C0101e c0101e2 = c2411e.appmetrica;
        int i2 = c2411e.purchase;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z = c2411e.startapp;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int i4 = c2411e.mopub;
        C12053e c12053e = c2411e.smaato;
        float f = c2411e.amazon;
        float f2 = c2411e.loadAd;
        int i5 = c2411e.Signature;
        C3335e c3335e = c2411e.admob;
        C9039e c9039e = c2411e.subscription;
        C5251e c5251e = c2411e.remoteconfig;
        int i6 = c2411e.pro;
        boolean z2 = c2411e.signatures;
        boolean z3 = c2411e.tapsense;
        int i7 = c2411e.isVip;
        boolean z4 = c2411e.inmobi;
        boolean z5 = c2411e.isPro;
        int i8 = c2411e.applovin;
        int i9 = c2411e.ads;
        C12053e c12053e2 = c2411e.premium;
        long j = c2411e.subs;
        long j2 = c2411e.crashlytics;
        long j3 = c2411e.firebase;
        C18255e c18255e = c2411e.f6185class;
        C4491e c4491e = c2411e.f6186interface;
        AbstractC2301e.subscription(abstractC6690e.Signature() || c12693e.ad.vip < abstractC6690e.loadAd());
        ad.remoteconfig = new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z2, z3, i7, i8, i9, z4, z5, c12053e2, j, j2, j3, c18255e, c4491e);
        ad.metrica.ad(true, true);
        try {
            ad.yandex.adcel.getClass();
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: while */
    public final /* synthetic */ void mo1503while(List list) {
    }
}
