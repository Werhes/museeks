package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5084e {
    public final InterfaceC11206e Signature;
    public final C6140e ad;
    public final InterfaceC11206e adcel;
    public final InterfaceC11206e admob;
    public final InterfaceC11206e ads;
    public final InterfaceC11206e advert;
    public final InterfaceC11206e amazon;
    public final InterfaceC11206e applovin;
    public final InterfaceC11206e appmetrica;
    public final InterfaceC11206e billing;

    /* renamed from: class, reason: not valid java name */
    public final InterfaceC11206e f10917class;
    public final InterfaceC11206e crashlytics;
    public final InterfaceC11206e firebase;

    /* renamed from: goto, reason: not valid java name */
    public final InterfaceC11206e f10918goto;
    public final InterfaceC11206e inmobi;

    /* renamed from: interface, reason: not valid java name */
    public final InterfaceC11206e f10919interface;
    public final C7850e isPro = new C7850e(8, false);
    public final InterfaceC11206e isVip;
    public final InterfaceC11206e license;
    public final InterfaceC11206e loadAd;
    public final InterfaceC11206e metrica;
    public final InterfaceC11206e mopub;
    public final InterfaceC11206e premium;
    public final InterfaceC11206e pro;
    public final InterfaceC11206e purchase;
    public final InterfaceC11206e remoteconfig;
    public final InterfaceC11206e signatures;
    public final InterfaceC11206e smaato;
    public final InterfaceC11206e startapp;
    public final InterfaceC11206e subs;
    public final InterfaceC11206e subscription;
    public final InterfaceC11206e tapsense;
    public final C7646e vip;
    public final InterfaceC11206e yandex;

    /* JADX WARN: Multi-variable type inference failed */
    public C5084e(C7646e c7646e, C6140e c6140e, C5891e c5891e) {
        this.vip = c7646e;
        this.ad = c6140e;
        this.metrica = AbstractC13501e.billing(c7646e, this, 4);
        this.license = AbstractC13501e.billing(c7646e, this, 3);
        this.appmetrica = AbstractC13501e.billing(c7646e, this, 2);
        this.purchase = AbstractC13501e.billing(c7646e, this, 9);
        this.billing = AbstractC13501e.billing(c7646e, this, 10);
        this.yandex = AbstractC13501e.billing(c7646e, this, 8);
        this.startapp = AbstractC13501e.billing(c7646e, this, 7);
        this.adcel = AbstractC13501e.billing(c7646e, this, 11);
        this.mopub = AbstractC13501e.billing(c7646e, this, 6);
        this.advert = AbstractC13501e.billing(c7646e, this, 12);
        this.smaato = AbstractC13501e.billing(c7646e, this, 5);
        this.amazon = AbstractC13501e.billing(c7646e, this, 14);
        this.loadAd = AbstractC13501e.billing(c7646e, this, 13);
        this.Signature = AbstractC13501e.billing(c7646e, this, 16);
        this.admob = AbstractC13501e.billing(c7646e, this, 15);
        this.subscription = AbstractC13501e.billing(c7646e, this, 17);
        this.remoteconfig = AbstractC13501e.billing(c7646e, this, 18);
        this.pro = AbstractC13501e.billing(c7646e, this, 19);
        this.signatures = AbstractC13501e.billing(c7646e, this, 20);
        this.tapsense = AbstractC13501e.billing(c7646e, this, 22);
        this.isVip = AbstractC13501e.billing(c7646e, this, 21);
        this.inmobi = AbstractC13501e.billing(c7646e, this, 23);
        this.applovin = AbstractC13501e.billing(c7646e, this, 25);
        this.ads = AbstractC13501e.billing(c7646e, this, 26);
        this.premium = AbstractC13501e.billing(c7646e, this, 28);
        this.subs = AbstractC13501e.billing(c7646e, this, 27);
        this.crashlytics = AbstractC13501e.billing(c7646e, this, 29);
        this.firebase = AbstractC13501e.billing(c7646e, this, 24);
        this.f10917class = AbstractC13501e.billing(c7646e, this, 30);
        this.f10919interface = AbstractC13501e.billing(c7646e, this, 1);
        this.f10918goto = AbstractC13501e.billing(c7646e, this, 31);
        C7850e.m2329try(this.isPro, C6554e.ad(new Csuper((Object) c7646e, (Object) this, (int) (0 == true ? 1 : 0), 7)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        return new defpackage.C3613e(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.InterfaceC11623e ad() {
        /*
            r3 = this;
            eُۗۦ r0 = r3.startapp
            java.lang.Object r0 = r0.get()
            eؒٝۛ r0 = (defpackage.C1209e) r0
            eۣؖؗ r0 = r0.ad()
            java.lang.Class<androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk> r1 = androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk.class
            java.util.ArrayList r1 = r0.metrica(r1)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk r2 = (androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk) r2
            boolean r2 = r2.metrica()
            if (r2 == 0) goto L16
            goto L31
        L29:
            java.lang.Class<androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk> r1 = androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class
            boolean r1 = r0.ad(r1)
            if (r1 == 0) goto L37
        L31:
            eٖؕۚ r1 = new eٖؕۚ
            r1.<init>(r0)
            return r1
        L37:
            eُٟٗ r0 = defpackage.C11047e.f21913e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5084e.ad():eٌِٚ");
    }

    public final InterfaceC2786e vip() {
        Range appmetrica;
        C13825e c13825e = (C13825e) this.license.get();
        if ("robolectric".equals(Build.FINGERPRINT)) {
            List<CameraCharacteristics.Key> list = C13916e.f27627e;
            if (list == null || !list.isEmpty()) {
                for (CameraCharacteristics.Key key : list) {
                    if (AbstractC9464e.admob()) {
                        Log.w("CXCP", "Failed to read " + key + " for zoom features.");
                    }
                    if (((C9000e) c13825e.vip).metrica(key) == null) {
                        return new C13916e(c13825e);
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 30 && (appmetrica = AbstractC5096e.appmetrica(c13825e.vip)) != null) {
            return new C1503e(c13825e, appmetrica);
        }
        return new C18478e(c13825e);
    }
}
