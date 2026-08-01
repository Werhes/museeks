package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C4275e implements InterfaceC10488e {
    public boolean Signature;
    public final C12318e ad;
    public final C10312e adcel;
    public Surface ads;
    public final SparseArray advert;
    public C7543e amazon;
    public C5298e applovin;
    public final C7543e appmetrica;
    public final C7991e billing;

    /* renamed from: class, reason: not valid java name */
    public long f9368class;
    public InterfaceC3001e crashlytics;
    public MediaController firebase;

    /* renamed from: goto, reason: not valid java name */
    public C2411e f9369goto;
    public C5298e inmobi;

    /* renamed from: interface, reason: not valid java name */
    public long f9370interface;
    public C5298e isPro;
    public final Context license;
    public ServiceConnectionC15561e loadAd;
    public final BinderC4329e metrica;
    public final C17548e mopub;
    public SurfaceHolder premium;
    public AbstractC17475e pro;
    public final Bundle purchase;
    public AbstractC17475e remoteconfig;
    public C1410e signatures;
    public final Handler smaato;
    public final C0222e startapp;
    public PendingIntent subscription;
    public C1410e tapsense;

    /* renamed from: this, reason: not valid java name */
    public Bundle f9371this;
    public final C18100e vip;
    public final SurfaceHolderCallbackC3544e yandex;
    public C2411e admob = C2411e.f6162goto;
    public C8795e subs = C8795e.metrica;
    public C6689e isVip = C6689e.vip;

    /* JADX WARN: Type inference failed for: r4v4, types: [eًْ٘] */
    public C4275e(Context context, C12318e c12318e, C7543e c7543e, Bundle bundle, Looper looper) {
        C1410e c1410e = C1410e.f4222e;
        this.remoteconfig = c1410e;
        this.pro = c1410e;
        this.signatures = c1410e;
        this.tapsense = c1410e;
        C5298e c5298e = C5298e.vip;
        this.inmobi = c5298e;
        this.isPro = c5298e;
        this.applovin = metrica(c5298e, c5298e);
        this.startapp = new C0222e(looper, C17381e.ad, new C6225e(this, 10));
        this.smaato = new Handler(looper);
        this.ad = c12318e;
        AbstractC2301e.amazon(context, "context must not be null");
        AbstractC2301e.amazon(c7543e, "token must not be null");
        this.license = context;
        this.vip = new C18100e(4);
        this.metrica = new BinderC4329e(this);
        this.mopub = new C17548e(0);
        this.appmetrica = c7543e;
        this.purchase = bundle;
        this.billing = new IBinder.DeathRecipient() { // from class: eًْ٘
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                C12318e c12318e2 = C4275e.this.ad;
                Objects.requireNonNull(c12318e2);
                c12318e2.vip(new RunnableC2783e(17, c12318e2));
            }
        };
        this.yandex = new SurfaceHolderCallbackC3544e(this);
        this.f9371this = Bundle.EMPTY;
        this.loadAd = c7543e.ad.ad() == 0 ? null : new ServiceConnectionC15561e(this, bundle);
        this.adcel = new C10312e(this, looper);
        this.f9368class = -9223372036854775807L;
        this.f9370interface = -9223372036854775807L;
        this.advert = new SparseArray();
    }

    public static int amazon(C2411e c2411e) {
        return c2411e.metrica.ad.vip;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eّۗؐ, eْٗۤ] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eّۗؐ, eْٗۤ] */
    public static C9791e appmetrica(ArrayList arrayList, ArrayList arrayList2) {
        ?? abstractC12670e = new AbstractC12670e(4);
        abstractC12670e.license(arrayList);
        C1410e billing = abstractC12670e.billing();
        ?? abstractC12670e2 = new AbstractC12670e(4);
        abstractC12670e2.license(arrayList2);
        C1410e billing2 = abstractC12670e2.billing();
        int size = arrayList.size();
        C3168e c3168e = AbstractC1008e.ad;
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new C9791e(billing, billing2, iArr);
    }

    public static C2411e crashlytics(C2411e c2411e, int i, List list, long j, long j2) {
        int size;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        C12693e c12693e = c2411e.metrica;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < abstractC6690e.loadAd(); i3++) {
            arrayList.add(abstractC6690e.smaato(i3, new C11501e(), 0L));
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            C1962e c1962e = (C1962e) list.get(i4);
            C11501e c11501e = new C11501e();
            c11501e.vip(0, c1962e, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i4 + i, c11501e);
        }
        m1519finally(abstractC6690e, arrayList, arrayList2);
        C9791e appmetrica = appmetrica(arrayList, arrayList2);
        if (c2411e.adcel.Signature()) {
            size = 0;
        } else {
            int i5 = c12693e.ad.vip;
            i2 = i5 >= i ? list.size() + i5 : i5;
            int i6 = c12693e.ad.appmetrica;
            size = i6 >= i ? list.size() + i6 : i6;
        }
        return m1516extends(c2411e, appmetrica, i2, size, j, j2, 5);
    }

    /* renamed from: extends, reason: not valid java name */
    public static C2411e m1516extends(C2411e c2411e, C9791e c9791e, int i, int i2, long j, long j2, int i3) {
        C11501e c11501e = new C11501e();
        c9791e.smaato(i, c11501e, 0L);
        C1962e c1962e = c11501e.metrica;
        C0101e c0101e = c2411e.metrica.ad;
        C0101e c0101e2 = new C0101e(null, i, c1962e, null, i2, j, j2, c0101e.yandex, c0101e.startapp);
        C12693e c12693e = c2411e.metrica;
        return m1521throw(c2411e, c9791e, c0101e2, new C12693e(c0101e2, c12693e.vip, SystemClock.elapsedRealtime(), c12693e.license, c12693e.appmetrica, c12693e.purchase, c12693e.billing, c12693e.yandex, c12693e.startapp, c12693e.adcel), i3);
    }

    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public static C1410e m1517e(List list, List list2, C6689e c6689e, C5298e c5298e, Bundle bundle) {
        if (list.isEmpty()) {
            list = C11161e.mopub(list2, c5298e, bundle);
        }
        return C11161e.billing(list, c6689e, c5298e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* renamed from: eُۘٙ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C1410e m1518e(java.util.List r2, java.util.List r3, android.os.Bundle r4, defpackage.C6689e r5, defpackage.C5298e r6, int r7) {
        /*
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb
            eؒۢۗ r2 = defpackage.C11161e.billing(r3, r5, r6)
            return r2
        Lb:
            java.lang.String r3 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"
            boolean r3 = r4.getBoolean(r3)
            r5 = 0
            r0 = 1
            if (r3 != 0) goto L25
            r3 = 6
            r1 = 7
            int[] r3 = new int[]{r3, r1}
            eِْٖ r1 = r6.ad
            boolean r3 = r1.ad(r3)
            if (r3 != 0) goto L25
            r3 = r0
            goto L26
        L25:
            r3 = r5
        L26:
            java.lang.String r1 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"
            boolean r4 = r4.getBoolean(r1)
            if (r4 != 0) goto L3f
            r4 = 8
            r1 = 9
            int[] r4 = new int[]{r4, r1}
            eِْٖ r6 = r6.ad
            boolean r4 = r6.ad(r4)
            if (r4 != 0) goto L3f
            r5 = r0
        L3f:
            eؒۢۗ r2 = defpackage.C11161e.adcel(r2, r3, r5, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4275e.m1518e(java.util.List, java.util.List, android.os.Bundle, eؙ۟ۢ, eِؗۧ, int):eؒۢۗ");
    }

    /* renamed from: finally, reason: not valid java name */
    public static void m1519finally(AbstractC6690e abstractC6690e, ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            C11501e c11501e = (C11501e) arrayList.get(i);
            int i2 = c11501e.amazon;
            int i3 = c11501e.loadAd;
            if (i2 == -1 || i3 == -1) {
                c11501e.amazon = arrayList2.size();
                c11501e.loadAd = arrayList2.size();
                C6158e c6158e = new C6158e();
                c6158e.startapp(null, null, i, -9223372036854775807L, 0L, C11541e.purchase, true);
                arrayList2.add(c6158e);
            } else {
                c11501e.amazon = arrayList2.size();
                c11501e.loadAd = (i3 - i2) + arrayList2.size();
                while (i2 <= i3) {
                    C6158e c6158e2 = new C6158e();
                    abstractC6690e.purchase(i2, c6158e2, false);
                    c6158e2.metrica = i;
                    arrayList2.add(c6158e2);
                    i2++;
                }
            }
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public static C2411e m1520goto(C2411e c2411e, int i, int i2, boolean z, long j, long j2) {
        int i3;
        int i4;
        int i5;
        C2411e m1516extends;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        boolean z2 = c2411e.startapp;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < abstractC6690e.loadAd(); i6++) {
            if (i6 < i || i6 >= i2) {
                arrayList.add(abstractC6690e.smaato(i6, new C11501e(), 0L));
            }
        }
        m1519finally(abstractC6690e, arrayList, arrayList2);
        C9791e appmetrica = appmetrica(arrayList, arrayList2);
        C0101e c0101e = c2411e.metrica.ad;
        int i7 = c0101e.vip;
        int i8 = c0101e.appmetrica;
        C11501e c11501e = new C11501e();
        boolean z3 = i7 >= i && i7 < i2;
        if (appmetrica.Signature()) {
            i8 = 0;
            i4 = -1;
            i3 = 1;
        } else {
            if (z3) {
                int i9 = c2411e.yandex;
                int loadAd = abstractC6690e.loadAd();
                i4 = i7;
                i3 = 1;
                for (int i10 = 0; i10 < loadAd; i10++) {
                    i4 = abstractC6690e.appmetrica(i4, i9, z2);
                    if (i4 == -1) {
                        break;
                    }
                    if (i4 < i || i4 >= i2) {
                        break;
                    }
                }
                i4 = -1;
                if (i4 == -1) {
                    i4 = appmetrica.ad(z2);
                } else if (i4 >= i2) {
                    i4 -= i2 - i;
                }
                appmetrica.smaato(i4, c11501e, 0L);
                i5 = c11501e.amazon;
            } else {
                i3 = 1;
                if (i7 >= i2) {
                    i4 = i7 - (i2 - i);
                    if (i8 != -1) {
                        for (int i11 = i; i11 < i2; i11++) {
                            C11501e c11501e2 = new C11501e();
                            abstractC6690e.amazon(i11, c11501e2);
                            i8 -= (c11501e2.loadAd - c11501e2.amazon) + 1;
                        }
                    }
                    i5 = i8;
                } else {
                    i4 = i7;
                }
            }
            i8 = i5;
        }
        if (!z3) {
            m1516extends = m1516extends(c2411e, appmetrica, i4, i8, j, j2, 4);
        } else if (i4 == -1) {
            m1516extends = m1521throw(c2411e, appmetrica, C12693e.mopub, C12693e.advert, 4);
        } else if (z) {
            m1516extends = m1516extends(c2411e, appmetrica, i4, i8, j, j2, 4);
        } else {
            int i12 = i4;
            C11501e c11501e3 = new C11501e();
            appmetrica.smaato(i12, c11501e3, 0L);
            long m2567switch = AbstractC9413e.m2567switch(c11501e3.advert);
            long m2567switch2 = AbstractC9413e.m2567switch(c11501e3.smaato);
            C0101e c0101e2 = new C0101e(null, i12, c11501e3.metrica, null, i8, m2567switch, m2567switch, -1, -1);
            m1516extends = m1521throw(c2411e, appmetrica, c0101e2, new C12693e(c0101e2, false, SystemClock.elapsedRealtime(), m2567switch2, m2567switch, AbstractC1008e.vip(m2567switch, m2567switch2), 0L, -9223372036854775807L, m2567switch2, m2567switch), 4);
        }
        int i13 = m1516extends.ads;
        return (i13 == i3 || i13 == 4 || i >= i2 || i2 != abstractC6690e.loadAd() || i7 < i) ? m1516extends : m1516extends.purchase(4, null);
    }

    /* renamed from: throw, reason: not valid java name */
    public static C2411e m1521throw(C2411e c2411e, AbstractC6690e abstractC6690e, C0101e c0101e, C12693e c12693e, int i) {
        C12693e c12693e2;
        C4491e c4491e;
        C18255e c18255e;
        boolean z;
        C8256e c8256e = c2411e.ad;
        int i2 = c2411e.vip;
        C12693e c12693e3 = c2411e.metrica;
        C4194e c4194e = c2411e.billing;
        int i3 = c2411e.yandex;
        boolean z2 = c2411e.startapp;
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
        C18255e c18255e2 = c2411e.f6185class;
        C4491e c4491e2 = c2411e.f6186interface;
        C0101e c0101e2 = c12693e3.ad;
        if (abstractC6690e.Signature()) {
            c12693e2 = c12693e;
            c4491e = c4491e2;
            c18255e = c18255e2;
        } else {
            c12693e2 = c12693e;
            c4491e = c4491e2;
            c18255e = c18255e2;
            if (c12693e2.ad.vip >= abstractC6690e.loadAd()) {
                z = false;
                AbstractC2301e.subscription(z);
                return new C2411e(c8256e, i2, c12693e2, c0101e2, c0101e, i, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
            }
        }
        z = true;
        AbstractC2301e.subscription(z);
        return new C2411e(c8256e, i2, c12693e2, c0101e2, c0101e, i, c4194e, i3, z2, c2351e, abstractC6690e, i4, c12053e, f, f2, c3335e, i5, c9039e, c5251e, i6, z3, z4, i7, i8, i9, z5, z6, c12053e2, j, j2, j3, c18255e, c4491e);
    }

    @Override // defpackage.InterfaceC10488e
    public final void Signature(C4194e c4194e) {
        if (inmobi(13)) {
            adcel(new C11565e(this, c4194e, 28));
            if (this.admob.billing.equals(c4194e)) {
                return;
            }
            this.admob = this.admob.appmetrica(c4194e);
            C14719e c14719e = new C14719e(c4194e, 1);
            C0222e c0222e = this.startapp;
            c0222e.metrica(12, c14719e);
            c0222e.vip();
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: abstract, reason: not valid java name */
    public final long mo1522abstract() {
        return this.admob.metrica.startapp;
    }

    public final void ad(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.admob.adcel.Signature()) {
            m1555e(list, -1, -9223372036854775807L, false);
        } else {
            m1563e(crashlytics(this.admob, Math.min(i, this.admob.adcel.loadAd()), list, mo1534e(), mo1538e()), 0, null, null, this.admob.adcel.Signature() ? 3 : null);
        }
    }

    public final void adcel(InterfaceC9479e interfaceC9479e) {
        C10312e c10312e = this.adcel;
        Handler handler = (Handler) c10312e.f20361e;
        if (((C4275e) c10312e.f20360e).crashlytics != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        yandex(this.crashlytics, interfaceC9479e, true);
    }

    @Override // defpackage.InterfaceC10488e
    public final void admob(long j) {
        if (inmobi(5)) {
            adcel(new C12019e(j, this));
            m1589e(amazon(this.admob), j);
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final long ads() {
        return this.admob.metrica.yandex;
    }

    public final ListenableFuture advert(int i, C11858e c11858e, InterfaceC9479e interfaceC9479e) {
        InterfaceC3001e interfaceC3001e = null;
        if (c11858e != null) {
            int i2 = c11858e.ad;
            String str = c11858e.vip;
            AbstractC2301e.billing(i2 == 0);
            if (this.isVip.ad.contains(c11858e) || C11161e.amazon(str)) {
                interfaceC3001e = this.crashlytics;
            } else {
                AbstractC2803e.smaato("MCImplBase", "Controller isn't allowed to call custom session command:".concat(str));
            }
        } else {
            AbstractC2301e.billing(i != 0);
            if (this.isVip.ad(i)) {
                interfaceC3001e = this.crashlytics;
            } else {
                AbstractC10257e.pro("Controller isn't allowed to call command, commandCode=", i, "MCImplBase");
            }
        }
        return yandex(interfaceC3001e, interfaceC9479e, false);
    }

    @Override // defpackage.InterfaceC10488e
    public final boolean applovin() {
        return this.admob.metrica.vip;
    }

    @Override // defpackage.InterfaceC10488e
    public final int billing() {
        return this.admob.ads;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: break, reason: not valid java name */
    public final int mo1523break() {
        if (this.admob.adcel.Signature()) {
            return -1;
        }
        C2411e c2411e = this.admob;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int amazon = amazon(c2411e);
        C2411e c2411e2 = this.admob;
        int i = c2411e2.yandex;
        if (i == 1) {
            i = 0;
        }
        return abstractC6690e.mopub(amazon, i, c2411e2.startapp);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: case, reason: not valid java name */
    public final void mo1524case() {
        if (inmobi(6)) {
            adcel(new C6225e(this, 5));
            if (mo1523break() != -1) {
                m1589e(mo1523break(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: catch, reason: not valid java name */
    public final float mo1525catch() {
        return this.admob.amazon;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: class, reason: not valid java name */
    public final void mo1526class(C1962e c1962e, long j) {
        if (inmobi(31)) {
            adcel(new C1121e(j, this, c1962e));
            m1555e(Collections.singletonList(c1962e), -1, j, false);
        }
    }

    /* renamed from: const, reason: not valid java name */
    public final void m1527const(int i, int i2) {
        int loadAd = this.admob.adcel.loadAd();
        int min = Math.min(i2, loadAd);
        if (i >= loadAd || i == min || loadAd == 0) {
            return;
        }
        boolean z = amazon(this.admob) >= i && amazon(this.admob) < min;
        C2411e m1520goto = m1520goto(this.admob, i, min, false, mo1534e(), mo1538e());
        int i3 = this.admob.metrica.ad.vip;
        m1563e(m1520goto, 0, null, z ? 4 : null, i3 >= i && i3 < min ? 3 : null);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: continue, reason: not valid java name */
    public final void mo1528continue() {
        if (inmobi(7)) {
            adcel(new C6225e(this, 4));
            AbstractC6690e abstractC6690e = this.admob.adcel;
            if (abstractC6690e.Signature() || applovin()) {
                return;
            }
            boolean z = mo1523break() != -1;
            C11501e smaato = abstractC6690e.smaato(amazon(this.admob), new C11501e(), 0L);
            if (smaato.startapp && smaato.ad()) {
                if (z) {
                    m1589e(mo1523break(), -9223372036854775807L);
                }
            } else if (!z || mo1534e() > this.admob.firebase) {
                m1589e(amazon(this.admob), 0L);
            } else {
                m1589e(mo1523break(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: default, reason: not valid java name */
    public final int mo1529default() {
        return this.admob.metrica.ad.appmetrica;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: else, reason: not valid java name */
    public final void mo1530else(int i) {
        if (inmobi(20)) {
            AbstractC2301e.billing(i >= 0);
            adcel(new C7608e(this, i, 2));
            m1527const(i, i + 1);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eَؑۨ, reason: contains not printable characters */
    public final void mo1531e(final int i, final int i2, final int i3) {
        if (inmobi(20)) {
            AbstractC2301e.billing(i >= 0 && i <= i2 && i3 >= 0);
            adcel(new InterfaceC9479e() { // from class: eَٕۛ
                @Override // defpackage.InterfaceC9479e
                public final void metrica(InterfaceC3001e interfaceC3001e, int i4) {
                    interfaceC3001e.mo949e(C4275e.this.metrica, i4, i, i2, i3);
                }
            });
            m1599private(i, i2, i3);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eۣؑۡ, reason: contains not printable characters */
    public final AbstractC17475e mo1532e() {
        return this.signatures;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public final void mo1533e(int i, List list) {
        if (inmobi(20)) {
            AbstractC2301e.billing(i >= 0);
            adcel(new C17825e(this, i, list));
            ad(i, list);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؒ٘ؗ, reason: contains not printable characters */
    public final long mo1534e() {
        long metrica = AbstractC1008e.metrica(this.admob, this.f9368class, this.f9370interface, this.ad.f24706e);
        this.f9368class = metrica;
        return metrica;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final void mo1535e() {
        if (inmobi(24)) {
            adcel(new C6225e(this, 15));
            C2411e c2411e = this.admob;
            if (c2411e.amazon != 0.0f) {
                this.admob = c2411e.Signature(0.0f);
                C13415e c13415e = new C13415e(10);
                C0222e c0222e = this.startapp;
                c0222e.metrica(22, c13415e);
                c0222e.vip();
            }
        }
    }

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public final void m1536e(int i, int i2, List list) {
        int loadAd = this.admob.adcel.loadAd();
        if (i > loadAd) {
            return;
        }
        if (this.admob.adcel.Signature()) {
            m1555e(list, -1, -9223372036854775807L, false);
            return;
        }
        int min = Math.min(i2, loadAd);
        C2411e m1520goto = m1520goto(crashlytics(this.admob, min, list, mo1534e(), mo1538e()), i, min, true, mo1534e(), mo1538e());
        int i3 = this.admob.metrica.ad.vip;
        boolean z = i3 >= i && i3 < min;
        m1563e(m1520goto, 0, null, z ? 4 : null, z ? 3 : null);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    public final C9039e mo1537e() {
        return this.admob.subscription;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public final long mo1538e() {
        C12693e c12693e = this.admob.metrica;
        return !c12693e.vip ? mo1534e() : c12693e.ad.billing;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّؔٞ, reason: contains not printable characters */
    public final void mo1539e(List list) {
        if (inmobi(20)) {
            adcel(new C11126e(this, list, 0));
            m1555e(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eِؕٛ, reason: contains not printable characters */
    public final void mo1540e() {
        if (inmobi(12)) {
            adcel(new C6225e(this, 2));
            m1585e(this.admob.crashlytics);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public final void mo1541e() {
        if (inmobi(24)) {
            float f = this.admob.loadAd;
            adcel(new C10887e(this, f, 2));
            C2411e c2411e = this.admob;
            float f2 = c2411e.amazon;
            if (f2 == c2411e.loadAd || f2 != 0.0f) {
                return;
            }
            this.admob = c2411e.Signature(f);
            C16874e c16874e = new C16874e(2, f);
            C0222e c0222e = this.startapp;
            c0222e.metrica(22, c16874e);
            c0222e.vip();
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٍؖۙ, reason: contains not printable characters */
    public final boolean mo1542e() {
        return this.admob.signatures;
    }

    /* renamed from: eًؖٝ, reason: contains not printable characters */
    public final void m1543e(Surface surface, int i, int i2) {
        if (mo1580e()) {
            if (tapsense() >= 8) {
                mopub(new C6696e(this, surface, i, i2, 1));
            } else {
                mopub(new C11565e(this, surface, 25));
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public final void mo1544e() {
        if (inmobi(8)) {
            adcel(new C6225e(this, 16));
            if (mo1564e() != -1) {
                m1589e(mo1564e(), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public final boolean mo1545e() {
        return mo1564e() != -1;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public final C12053e mo1546e() {
        return this.admob.smaato;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public final void mo1547e(boolean z) {
        if (inmobi(26)) {
            adcel(new C11273e(this, z, 2));
            C2411e c2411e = this.admob;
            if (c2411e.signatures != z) {
                this.admob = c2411e.metrica(c2411e.pro, z);
                C11273e c11273e = new C11273e(this, z, 3);
                C0222e c0222e = this.startapp;
                c0222e.metrica(30, c11273e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؙؙٝ, reason: contains not printable characters */
    public final C6689e mo1548e() {
        return this.isVip;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٍؙّ, reason: contains not printable characters */
    public final C12053e mo1549e() {
        return this.admob.premium;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؙۛ۠, reason: contains not printable characters */
    public final Bundle mo1550e() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public final int mo1551e() {
        return this.admob.metrica.ad.yandex;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final boolean mo1552e() {
        return this.admob.startapp;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final void mo1553e(C3335e c3335e, boolean z) {
        if (inmobi(35)) {
            adcel(new C14559e(this, c3335e, z));
            if (this.admob.admob.equals(c3335e)) {
                return;
            }
            this.admob = this.admob.ad(c3335e);
            C12605e c12605e = new C12605e(c3335e, 1);
            C0222e c0222e = this.startapp;
            c0222e.metrica(20, c12605e);
            c0222e.vip();
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final void mo1554e(int i) {
        if (inmobi(10)) {
            AbstractC2301e.billing(i >= 0);
            adcel(new C7608e(this, i, 1));
            m1589e(i, -9223372036854775807L);
        }
    }

    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public final void m1555e(List list, int i, long j, boolean z) {
        int i2;
        boolean z2;
        long j2;
        C0101e c0101e;
        C12693e c12693e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i3 < list.size()) {
            C1962e c1962e = (C1962e) list.get(i3);
            AbstractC12614e abstractC12614e = AbstractC13256e.ad;
            C11501e c11501e = new C11501e();
            int i4 = i3;
            c11501e.vip(0, c1962e, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i4, i4, 0L);
            arrayList.add(c11501e);
            C6158e c6158e = new C6158e();
            c6158e.startapp(null, null, i4, -9223372036854775807L, 0L, C11541e.purchase, true);
            arrayList2.add(c6158e);
            i3 = i4 + 1;
        }
        C9791e appmetrica = appmetrica(arrayList, arrayList2);
        AbstractC17475e abstractC17475e = appmetrica.appmetrica;
        if (!appmetrica.Signature() && i >= abstractC17475e.size()) {
            throw new C9442e(5);
        }
        if (z) {
            i2 = appmetrica.Signature() ? 0 : appmetrica.ad(this.admob.startapp);
            z2 = false;
            j2 = -9223372036854775807L;
        } else if (i == -1) {
            C0101e c0101e2 = this.admob.metrica.ad;
            int i5 = c0101e2.vip;
            long j3 = c0101e2.purchase;
            if (appmetrica.Signature() || i5 < abstractC17475e.size()) {
                z2 = false;
                j2 = j3;
                i2 = i5;
            } else {
                i2 = appmetrica.ad(this.admob.startapp);
                j2 = -9223372036854775807L;
                z2 = true;
            }
        } else {
            i2 = i;
            z2 = false;
            j2 = j;
        }
        C9436e remoteconfig = remoteconfig(appmetrica, i2, j2);
        if (remoteconfig == null) {
            c0101e = new C0101e(null, i2, null, null, i2, j2 == -9223372036854775807L ? 0L : j2, j2 == -9223372036854775807L ? 0L : j2, -1, -1);
            c12693e = new C12693e(c0101e, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2, 0, 0L, -9223372036854775807L, -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2);
        } else {
            long j4 = remoteconfig.f18775e;
            c0101e = new C0101e(null, i2, (C1962e) list.get(i2), null, remoteconfig.f18776e, AbstractC9413e.m2567switch(j4), AbstractC9413e.m2567switch(j4), -1, -1);
            c12693e = new C12693e(c0101e, false, SystemClock.elapsedRealtime(), -9223372036854775807L, AbstractC9413e.m2567switch(j4), 0, 0L, -9223372036854775807L, -9223372036854775807L, AbstractC9413e.m2567switch(j4));
        }
        C2411e m1521throw = m1521throw(this.admob, appmetrica, c0101e, c12693e, 4);
        int i6 = m1521throw.ads;
        if (i2 != -1 && i6 != 1) {
            i6 = (appmetrica.Signature() || z2) ? 4 : 2;
        }
        C2411e purchase = m1521throw.purchase(i6, this.admob.ad);
        m1563e(purchase, 0, null, !this.admob.adcel.Signature() ? 4 : null, (this.admob.adcel.Signature() && purchase.adcel.Signature()) ? null : 3);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٌؙٞ, reason: contains not printable characters */
    public final void mo1556e() {
        if (inmobi(11)) {
            adcel(new C6225e(this, 7));
            m1585e(-this.admob.subs);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٌۘۤ, reason: contains not printable characters */
    public final void mo1557e(final int i, final long j, final List list) {
        if (inmobi(20)) {
            adcel(new InterfaceC9479e() { // from class: eٕٖ۠
                @Override // defpackage.InterfaceC9479e
                public final void metrica(InterfaceC3001e interfaceC3001e, int i2) {
                    C4275e c4275e = C4275e.this;
                    BinderC4329e binderC4329e = c4275e.metrica;
                    C13304e Signature = AbstractC17475e.Signature();
                    int i3 = 0;
                    while (true) {
                        List list2 = list;
                        if (i3 >= list2.size()) {
                            interfaceC3001e.mo959e(binderC4329e, i2, new BinderC7421e(Signature.billing()), i, j);
                            return;
                        } else {
                            Signature.metrica(((C1962e) list2.get(i3)).metrica(c4275e.tapsense(), true));
                            i3++;
                        }
                    }
                }
            });
            m1555e(list, i, j, false);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٌۡٔ, reason: contains not printable characters */
    public final void mo1558e(int i, C1962e c1962e) {
        if (inmobi(20)) {
            AbstractC2301e.billing(i >= 0);
            adcel(new C9293e(this, i, c1962e, 1));
            ad(i, Collections.singletonList(c1962e));
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٍؓۙ, reason: contains not printable characters */
    public final void mo1559e(int i) {
        if (inmobi(25)) {
            adcel(new C7608e(this, i, 7));
            C2411e c2411e = this.admob;
            C5251e c5251e = c2411e.remoteconfig;
            if (c2411e.pro == i || c5251e.vip > i) {
                return;
            }
            int i2 = c5251e.metrica;
            if (i2 == 0 || i <= i2) {
                this.admob = c2411e.metrica(i, c2411e.signatures);
                C7608e c7608e = new C7608e(this, i, 9);
                C0222e c0222e = this.startapp;
                c0222e.metrica(30, c7608e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public final void mo1560e(C12053e c12053e) {
        if (inmobi(19)) {
            adcel(new C11565e(this, c12053e, 26));
            if (this.admob.smaato.equals(c12053e)) {
                return;
            }
            this.admob = this.admob.billing(c12053e);
            C11508e c11508e = new C11508e(c12053e, 1);
            C0222e c0222e = this.startapp;
            c0222e.metrica(15, c11508e);
            c0222e.vip();
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public final long mo1561e() {
        return this.admob.metrica.appmetrica;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public final long mo1562e() {
        return this.admob.crashlytics;
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final void m1563e(C2411e c2411e, Integer num, Integer num2, Integer num3, Integer num4) {
        C2411e c2411e2 = this.admob;
        this.admob = c2411e;
        m1594instanceof(c2411e2, c2411e, num, num2, num3, num4);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public final int mo1564e() {
        if (this.admob.adcel.Signature()) {
            return -1;
        }
        C2411e c2411e = this.admob;
        AbstractC6690e abstractC6690e = c2411e.adcel;
        int amazon = amazon(c2411e);
        C2411e c2411e2 = this.admob;
        int i = c2411e2.yandex;
        if (i == 1) {
            i = 0;
        }
        return abstractC6690e.appmetrica(amazon, i, c2411e2.startapp);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؙِۡ, reason: contains not printable characters */
    public final void mo1565e(List list) {
        if (inmobi(20)) {
            adcel(new C11126e(this, list, 1));
            ad(this.admob.adcel.loadAd(), list);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final void mo1566e(C1962e c1962e) {
        if (inmobi(31)) {
            adcel(new C16016e(this, c1962e, 0));
            m1555e(Collections.singletonList(c1962e), -1, -9223372036854775807L, true);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّْٝ, reason: contains not printable characters */
    public final void mo1567e(C1962e c1962e) {
        if (inmobi(31)) {
            adcel(new C16016e(this, c1962e, 1));
            m1555e(Collections.singletonList(c1962e), -1, -9223372036854775807L, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [eّٟؔ, java.lang.Object] */
    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّ۟ٝ, reason: contains not printable characters */
    public final void mo1568e() {
        InterfaceC3001e interfaceC3001e;
        C7543e c7543e = this.appmetrica;
        InterfaceC18036e interfaceC18036e = c7543e.ad;
        InterfaceC18036e interfaceC18036e2 = c7543e.ad;
        int ad = interfaceC18036e.ad();
        C12318e c12318e = this.ad;
        Context context = this.license;
        Bundle bundle = this.purchase;
        if (ad == 0) {
            this.loadAd = null;
            Object subs = interfaceC18036e2.subs();
            subs.getClass();
            IBinder iBinder = (IBinder) subs;
            int i = BinderC17428e.adcel;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC3001e)) {
                ?? obj = new Object();
                obj.metrica = iBinder;
                interfaceC3001e = obj;
            } else {
                interfaceC3001e = (InterfaceC3001e) queryLocalInterface;
            }
            int purchase = this.vip.purchase();
            String packageName = context.getPackageName();
            int myPid = Process.myPid();
            c12318e.getClass();
            try {
                interfaceC3001e.mo965e(this.metrica, purchase, new C5412e(packageName, myPid, bundle).vip());
                return;
            } catch (RemoteException e) {
                AbstractC2803e.amazon("MCImplBase", "Failed to call connection request.", e);
            }
        } else {
            this.loadAd = new ServiceConnectionC15561e(this, bundle);
            int i2 = Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(interfaceC18036e2.ads(), interfaceC18036e2.getServiceName());
            try {
                if (context.bindService(intent, this.loadAd, i2)) {
                    return;
                }
                AbstractC2803e.smaato("MCImplBase", "bind to " + c7543e + " failed");
            } catch (SecurityException e2) {
                AbstractC2803e.amazon("MCImplBase", "bind to " + c7543e + " not allowed", e2);
            }
        }
        Objects.requireNonNull(c12318e);
        c12318e.vip(new RunnableC2783e(17, c12318e));
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eًْٕ, reason: contains not printable characters */
    public final C4491e mo1569e() {
        return this.admob.f6186interface;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eْٗۚ, reason: contains not printable characters */
    public final ListenableFuture mo1570e(String str, C11326e c11326e) {
        return advert(40010, null, new C9509e(6, this, str, c11326e));
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eْۢؕ, reason: contains not printable characters */
    public final AbstractC6690e mo1571e() {
        return this.admob.adcel;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eْۥؑ, reason: contains not printable characters */
    public final ListenableFuture mo1572e(final C11858e c11858e, final Bundle bundle) {
        if (tapsense() < 7) {
            final int i = 1;
            return advert(0, c11858e, new InterfaceC9479e(this) { // from class: eٌٟؓ

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C4275e f17206e;

                {
                    this.f17206e = this;
                }

                @Override // defpackage.InterfaceC9479e
                public final void metrica(InterfaceC3001e interfaceC3001e, int i2) {
                    switch (i) {
                        case 0:
                            interfaceC3001e.mo995public(this.f17206e.metrica, i2, c11858e.vip(), bundle, false);
                            return;
                        default:
                            interfaceC3001e.mo987e(this.f17206e.metrica, i2, c11858e.vip(), bundle);
                            return;
                    }
                }
            });
        }
        if (tapsense() < 7) {
            return mo1572e(c11858e, bundle);
        }
        final int i2 = 0;
        return advert(0, c11858e, new InterfaceC9479e(this) { // from class: eٌٟؓ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C4275e f17206e;

            {
                this.f17206e = this;
            }

            @Override // defpackage.InterfaceC9479e
            public final void metrica(InterfaceC3001e interfaceC3001e, int i22) {
                switch (i2) {
                    case 0:
                        interfaceC3001e.mo995public(this.f17206e.metrica, i22, c11858e.vip(), bundle, false);
                        return;
                    default:
                        interfaceC3001e.mo987e(this.f17206e.metrica, i22, c11858e.vip(), bundle);
                        return;
                }
            }
        });
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public final int mo1573e() {
        return this.admob.applovin;
    }

    /* renamed from: eٓٔؔ, reason: contains not printable characters */
    public final void m1574e(boolean z) {
        C2411e c2411e = this.admob;
        int i = c2411e.applovin;
        int i2 = i == 1 ? 0 : i;
        if (c2411e.tapsense == z && i == i2) {
            return;
        }
        this.f9368class = AbstractC1008e.metrica(c2411e, this.f9368class, this.f9370interface, this.ad.f24706e);
        this.f9370interface = SystemClock.elapsedRealtime();
        m1563e(this.admob.license(1, i2, z), null, 1, null, null);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public final boolean mo1575e() {
        return this.admob.inmobi;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٔؖۘ, reason: contains not printable characters */
    public final void mo1576e() {
        if (inmobi(9)) {
            adcel(new C6225e(this, 11));
            AbstractC6690e abstractC6690e = this.admob.adcel;
            if (abstractC6690e.Signature() || applovin()) {
                return;
            }
            if (mo1545e()) {
                m1589e(mo1564e(), -9223372036854775807L);
                return;
            }
            C11501e smaato = abstractC6690e.smaato(amazon(this.admob), new C11501e(), 0L);
            if (smaato.startapp && smaato.ad()) {
                m1589e(amazon(this.admob), -9223372036854775807L);
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final void mo1577e(int i, C1962e c1962e) {
        if (inmobi(20)) {
            AbstractC2301e.billing(i >= 0);
            adcel(new C9293e(this, i, c1962e, 0));
            m1536e(i, i + 1, AbstractC17475e.ads(c1962e));
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public final void mo1578e(int i) {
        if (inmobi(34)) {
            adcel(new C7608e(this, i, 8));
            C2411e c2411e = this.admob;
            int i2 = c2411e.pro - 1;
            if (i2 >= c2411e.remoteconfig.vip) {
                this.admob = c2411e.metrica(i2, c2411e.signatures);
                C7608e c7608e = new C7608e(this, i2, 11);
                C0222e c0222e = this.startapp;
                c0222e.metrica(30, c7608e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّٔؗ, reason: contains not printable characters */
    public final long mo1579e() {
        return this.admob.subs;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٍٟٔ, reason: contains not printable characters */
    public final boolean mo1580e() {
        return this.crashlytics != null;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public final int mo1581e() {
        return amazon(this.admob);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٕٙؗ, reason: contains not printable characters */
    public final long mo1582e() {
        return this.admob.metrica.adcel;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؘٖؗ, reason: contains not printable characters */
    public final void mo1583e(int i, int i2) {
        if (inmobi(20)) {
            AbstractC2301e.billing(i >= 0 && i2 >= 0);
            adcel(new C14628e(this, i, i2, 2));
            m1599private(i, i + 1, i2);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final void mo1584e() {
        if (inmobi(26)) {
            adcel(new C6225e(this, 9));
            C2411e c2411e = this.admob;
            int i = c2411e.pro + 1;
            int i2 = c2411e.remoteconfig.metrica;
            if (i2 == 0 || i <= i2) {
                this.admob = c2411e.metrica(i, c2411e.signatures);
                C7608e c7608e = new C7608e(this, i, 3);
                C0222e c0222e = this.startapp;
                c0222e.metrica(30, c7608e);
                c0222e.vip();
            }
        }
    }

    /* renamed from: eٕٗٛ, reason: contains not printable characters */
    public final void m1585e(long j) {
        long mo1534e = mo1534e() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            mo1534e = Math.min(mo1534e, duration);
        }
        m1589e(amazon(this.admob), Math.max(mo1534e, 0L));
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public final C18255e mo1586e() {
        return this.admob.f6185class;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public final void mo1587e(InterfaceC8524e interfaceC8524e) {
        this.startapp.appmetrica(interfaceC8524e);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public final void mo1588e(boolean z) {
        if (inmobi(1)) {
            adcel(new C11273e(this, z, 4));
            m1574e(z);
        } else if (z) {
            AbstractC2803e.smaato("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    /* renamed from: e۠۟, reason: contains not printable characters */
    public final void m1589e(int i, long j) {
        int i2;
        int i3;
        C2411e c2411e;
        AbstractC6690e abstractC6690e = this.admob.adcel;
        if ((abstractC6690e.Signature() || i < abstractC6690e.loadAd()) && !applovin()) {
            C2411e c2411e2 = this.admob;
            C2411e purchase = c2411e2.purchase(c2411e2.ads == 1 ? 1 : 2, c2411e2.ad);
            C9436e remoteconfig = remoteconfig(abstractC6690e, i, j);
            if (remoteconfig == null) {
                long j2 = 0;
                long j3 = j != -9223372036854775807L ? j : 0L;
                if (j != -9223372036854775807L) {
                    j2 = j;
                }
                i2 = 1;
                i3 = 2;
                C0101e c0101e = new C0101e(null, i, null, null, i, j3, j2, -1, -1);
                C2411e c2411e3 = this.admob;
                AbstractC6690e abstractC6690e2 = c2411e3.adcel;
                boolean z = this.admob.metrica.vip;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C12693e c12693e = this.admob.metrica;
                c2411e = m1521throw(c2411e3, abstractC6690e2, c0101e, new C12693e(c0101e, z, elapsedRealtime, c12693e.license, j == -9223372036854775807L ? 0L : j, 0, 0L, c12693e.yandex, c12693e.startapp, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                C12693e c12693e2 = purchase.metrica;
                C0101e c0101e2 = c12693e2.ad;
                C0101e c0101e3 = c12693e2.ad;
                int i4 = c0101e2.appmetrica;
                int i5 = remoteconfig.f18776e;
                C6158e c6158e = new C6158e();
                abstractC6690e.purchase(i4, c6158e, false);
                C6158e c6158e2 = new C6158e();
                abstractC6690e.purchase(i5, c6158e2, false);
                boolean z2 = i4 != i5;
                long j4 = remoteconfig.f18775e;
                long m2546case = AbstractC9413e.m2546case(mo1534e()) - c6158e.appmetrica;
                if (z2 || j4 != m2546case) {
                    AbstractC2301e.subscription(c0101e3.yandex == -1);
                    C0101e c0101e4 = new C0101e(null, c6158e.metrica, c0101e3.metrica, null, i4, AbstractC9413e.m2567switch(c6158e.appmetrica + m2546case), AbstractC9413e.m2567switch(c6158e.appmetrica + m2546case), -1, -1);
                    abstractC6690e.purchase(i5, c6158e2, false);
                    C11501e c11501e = new C11501e();
                    abstractC6690e.amazon(c6158e2.metrica, c11501e);
                    long m2567switch = AbstractC9413e.m2567switch(c6158e2.appmetrica + j4);
                    C0101e c0101e5 = new C0101e(null, c6158e2.metrica, c11501e.metrica, null, i5, m2567switch, m2567switch, -1, -1);
                    C2411e yandex = purchase.yandex(c0101e4, c0101e5, 1);
                    if (z2 || j4 < m2546case) {
                        purchase = yandex.adcel(new C12693e(c0101e5, false, SystemClock.elapsedRealtime(), AbstractC9413e.m2567switch(c11501e.smaato), m2567switch, AbstractC1008e.vip(m2567switch, AbstractC9413e.m2567switch(c11501e.smaato)), 0L, -9223372036854775807L, -9223372036854775807L, m2567switch));
                    } else {
                        long max = Math.max(0L, AbstractC9413e.m2546case(yandex.metrica.billing) - (j4 - m2546case));
                        long m2567switch2 = AbstractC9413e.m2567switch(c6158e2.appmetrica + j4 + max);
                        purchase = yandex.adcel(new C12693e(c0101e5, false, SystemClock.elapsedRealtime(), AbstractC9413e.m2567switch(c11501e.smaato), m2567switch2, AbstractC1008e.vip(m2567switch2, AbstractC9413e.m2567switch(c11501e.smaato)), AbstractC9413e.m2567switch(max), -9223372036854775807L, -9223372036854775807L, m2567switch2));
                    }
                }
                c2411e = purchase;
            }
            C12693e c12693e3 = c2411e.metrica;
            int i6 = (this.admob.adcel.Signature() || c12693e3.ad.vip == this.admob.metrica.ad.vip) ? 0 : i2;
            if (i6 == 0 && c12693e3.ad.purchase == this.admob.metrica.ad.purchase) {
                return;
            }
            m1563e(c2411e, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: final, reason: not valid java name */
    public final void mo1590final() {
        if (inmobi(4)) {
            adcel(new C6225e(this, 3));
            m1589e(amazon(this.admob), -9223372036854775807L);
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final C5298e firebase() {
        return this.applovin;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: for, reason: not valid java name */
    public final void mo1591for(float f) {
        if (inmobi(24)) {
            adcel(new C10887e(this, f, 1));
            C2411e c2411e = this.admob;
            if (c2411e.amazon != f) {
                this.admob = c2411e.Signature(f);
                C16874e c16874e = new C16874e(1, f);
                C0222e c0222e = this.startapp;
                c0222e.metrica(22, c16874e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final long getDuration() {
        return this.admob.metrica.license;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: implements, reason: not valid java name */
    public final C2351e mo1592implements() {
        return this.admob.advert;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: import, reason: not valid java name */
    public final int mo1593import() {
        return this.admob.metrica.ad.startapp;
    }

    public final boolean inmobi(int i) {
        if (this.applovin.ad(i)) {
            return true;
        }
        AbstractC10257e.pro("Controller isn't allowed to call command= ", i, "MCImplBase");
        return false;
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m1594instanceof(C2411e c2411e, final C2411e c2411e2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        C0222e c0222e = this.startapp;
        if (num != null) {
            final int i = 0;
            c0222e.metrica(0, new InterfaceC12504e() { // from class: eًُٖ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i) {
                        case 0:
                            interfaceC8524e.mo1492native(c2411e2.adcel, num.intValue());
                            return;
                        case 1:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.purchase(c2411e3.license, c2411e3.appmetrica, num.intValue());
                            return;
                        default:
                            interfaceC8524e.loadAd(num.intValue(), c2411e2.tapsense);
                            return;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i2 = 1;
            c0222e.metrica(11, new InterfaceC12504e() { // from class: eًُٖ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i2) {
                        case 0:
                            interfaceC8524e.mo1492native(c2411e2.adcel, num3.intValue());
                            return;
                        case 1:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.purchase(c2411e3.license, c2411e3.appmetrica, num3.intValue());
                            return;
                        default:
                            interfaceC8524e.loadAd(num3.intValue(), c2411e2.tapsense);
                            return;
                    }
                }
            });
        }
        C1962e remoteconfig = c2411e2.remoteconfig();
        if (num4 != null) {
            c0222e.metrica(1, new C2521e(remoteconfig, num4));
        }
        C8256e c8256e = c2411e.ad;
        C8256e c8256e2 = c2411e2.ad;
        if (c8256e != c8256e2 && (c8256e == null || !c8256e.ad(c8256e2))) {
            c0222e.metrica(10, new C18354e(0, c8256e2));
            if (c8256e2 != null) {
                c0222e.metrica(10, new C18354e(1, c8256e2));
            }
        }
        if (!c2411e.f6185class.equals(c2411e2.f6185class)) {
            final int i3 = 18;
            c0222e.metrica(2, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i3) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (!c2411e.premium.equals(c2411e2.premium)) {
            final int i4 = 19;
            c0222e.metrica(14, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i4) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.isPro != c2411e2.isPro) {
            final int i5 = 20;
            c0222e.metrica(3, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i5) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.ads != c2411e2.ads) {
            final int i6 = 21;
            c0222e.metrica(4, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i6) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i7 = 2;
            c0222e.metrica(5, new InterfaceC12504e() { // from class: eًُٖ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i7) {
                        case 0:
                            interfaceC8524e.mo1492native(c2411e2.adcel, num2.intValue());
                            return;
                        case 1:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.purchase(c2411e3.license, c2411e3.appmetrica, num2.intValue());
                            return;
                        default:
                            interfaceC8524e.loadAd(num2.intValue(), c2411e2.tapsense);
                            return;
                    }
                }
            });
        }
        if (c2411e.applovin != c2411e2.applovin) {
            final int i8 = 0;
            c0222e.metrica(6, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i8) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.inmobi != c2411e2.inmobi) {
            final int i9 = 1;
            c0222e.metrica(7, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i9) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (!c2411e.billing.equals(c2411e2.billing)) {
            final int i10 = 2;
            c0222e.metrica(12, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i10) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.yandex != c2411e2.yandex) {
            final int i11 = 3;
            c0222e.metrica(8, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i11) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.startapp != c2411e2.startapp) {
            final int i12 = 4;
            c0222e.metrica(9, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i12) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (!c2411e.smaato.equals(c2411e2.smaato)) {
            final int i13 = 5;
            c0222e.metrica(15, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i13) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.amazon != c2411e2.amazon) {
            final int i14 = 6;
            c0222e.metrica(22, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i14) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (!c2411e.admob.equals(c2411e2.admob)) {
            final int i15 = 7;
            c0222e.metrica(20, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i15) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.Signature != c2411e2.Signature) {
            final int i16 = 8;
            c0222e.metrica(21, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i16) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (!c2411e.subscription.ad.equals(c2411e2.subscription.ad)) {
            final int i17 = 9;
            c0222e.metrica(27, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i17) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
            final int i18 = 10;
            c0222e.metrica(27, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i18) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (!c2411e.remoteconfig.equals(c2411e2.remoteconfig)) {
            final int i19 = 11;
            c0222e.metrica(29, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i19) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.pro != c2411e2.pro || c2411e.signatures != c2411e2.signatures) {
            final int i20 = 12;
            c0222e.metrica(30, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i20) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (!c2411e.advert.equals(c2411e2.advert)) {
            final int i21 = 13;
            c0222e.metrica(25, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i21) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.subs != c2411e2.subs) {
            final int i22 = 14;
            c0222e.metrica(16, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i22) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.crashlytics != c2411e2.crashlytics) {
            final int i23 = 15;
            c0222e.metrica(17, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i23) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (c2411e.firebase != c2411e2.firebase) {
            final int i24 = 16;
            c0222e.metrica(18, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i24) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        if (!c2411e.f6186interface.equals(c2411e2.f6186interface)) {
            final int i25 = 17;
            c0222e.metrica(19, new InterfaceC12504e() { // from class: eؙ٘ۦ
                @Override // defpackage.InterfaceC12504e
                public final void invoke(Object obj) {
                    InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
                    switch (i25) {
                        case 0:
                            interfaceC8524e.metrica(c2411e2.applovin);
                            return;
                        case 1:
                            interfaceC8524e.mo1487final(c2411e2.inmobi);
                            return;
                        case 2:
                            interfaceC8524e.mo1481break(c2411e2.billing);
                            return;
                        case 3:
                            interfaceC8524e.Signature(c2411e2.yandex);
                            return;
                        case 4:
                            interfaceC8524e.isVip(c2411e2.startapp);
                            return;
                        case 5:
                            interfaceC8524e.mo1488goto(c2411e2.smaato);
                            return;
                        case 6:
                            interfaceC8524e.admob(c2411e2.amazon);
                            return;
                        case 7:
                            interfaceC8524e.startapp(c2411e2.admob);
                            return;
                        case 8:
                            interfaceC8524e.pro(c2411e2.Signature);
                            return;
                        case 9:
                            interfaceC8524e.mo1503while(c2411e2.subscription.ad);
                            return;
                        case 10:
                            interfaceC8524e.isPro(c2411e2.subscription);
                            return;
                        case 11:
                            interfaceC8524e.mo1485default(c2411e2.remoteconfig);
                            return;
                        case 12:
                            C2411e c2411e3 = c2411e2;
                            interfaceC8524e.firebase(c2411e3.pro, c2411e3.signatures);
                            return;
                        case 13:
                            interfaceC8524e.vip(c2411e2.advert);
                            return;
                        case 14:
                            interfaceC8524e.mo1484class(c2411e2.subs);
                            return;
                        case 15:
                            interfaceC8524e.mo1499this(c2411e2.crashlytics);
                            return;
                        case 16:
                            interfaceC8524e.mo1489implements(c2411e2.firebase);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            interfaceC8524e.mopub(c2411e2.f6186interface);
                            return;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            interfaceC8524e.premium(c2411e2.f6185class);
                            return;
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            interfaceC8524e.mo1491interface(c2411e2.premium);
                            return;
                        case 20:
                            interfaceC8524e.smaato(c2411e2.isPro);
                            return;
                        default:
                            interfaceC8524e.signatures(c2411e2.ads);
                            return;
                    }
                }
            });
        }
        c0222e.vip();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: interface, reason: not valid java name */
    public final boolean mo1595interface() {
        return this.admob.tapsense;
    }

    @Override // defpackage.InterfaceC10488e
    public final int isPro() {
        return this.admob.pro;
    }

    @Override // defpackage.InterfaceC10488e
    public final C4194e isVip() {
        return this.admob.billing;
    }

    @Override // defpackage.InterfaceC10488e
    public final void license() {
        if (inmobi(2)) {
            adcel(new C6225e(this, 14));
            C2411e c2411e = this.admob;
            if (c2411e.ads == 1) {
                m1563e(c2411e.purchase(c2411e.adcel.Signature() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final void loadAd() {
        if (inmobi(1)) {
            adcel(new C6225e(this, 8));
            m1574e(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r8.ad.ad(25, 33, 26, 34) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C5298e metrica(defpackage.C5298e r8, defpackage.C5298e r9) {
        /*
            r7 = this;
            eِؗۧ r8 = defpackage.AbstractC1008e.license(r8, r9)
            eٌؙؔ r9 = r7.admob
            eؗۤۘ r9 = r9.remoteconfig
            int r9 = r9.ad
            if (r9 != 0) goto Le
            r9 = 1
            goto Lf
        Le:
            r9 = 0
        Lf:
            r0 = 32
            boolean r1 = r8.ad(r0)
            r2 = 34
            r3 = 26
            r4 = 33
            r5 = 25
            if (r1 == 0) goto L2e
            if (r9 == 0) goto L2d
            int[] r1 = new int[]{r5, r4, r3, r2}
            eِْٖ r6 = r8.ad
            boolean r1 = r6.ad(r1)
            if (r1 != 0) goto L2e
        L2d:
            return r8
        L2e:
            e٘ۙؒ r1 = new e٘ۙؒ
            r1.<init>(r8)
            java.lang.Object r8 = r1.f35233e
            eٗؒۤ r8 = (defpackage.C16722e) r8
            r8.ad(r0)
            r1.ads(r5, r9)
            r1.ads(r4, r9)
            r1.ads(r3, r9)
            r1.ads(r2, r9)
            eِؗۧ r9 = new eِؗۧ
            eِْٖ r8 = r8.appmetrica()
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4275e.metrica(eِؗۧ, eِؗۧ):eِؗۧ");
    }

    public final void mopub(InterfaceC9479e interfaceC9479e) {
        C10312e c10312e = this.adcel;
        Handler handler = (Handler) c10312e.f20361e;
        if (((C4275e) c10312e.f20360e).crashlytics != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        ListenableFuture yandex = yandex(this.crashlytics, interfaceC9479e, true);
        try {
            AbstractC13256e.tapsense(yandex);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        } catch (TimeoutException e2) {
            if (yandex instanceof C8342e) {
                int i = ((C8342e) yandex).f17075e;
                this.mopub.remove(Integer.valueOf(i));
                this.vip.mopub(i, new C9759e(-1));
            }
            AbstractC2803e.amazon("MCImplBase", "Synchronous command takes too long on the session side.", e2);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: native, reason: not valid java name */
    public final void mo1596native(boolean z) {
        if (inmobi(14)) {
            adcel(new C11273e(this, z, 1));
            C2411e c2411e = this.admob;
            if (c2411e.startapp != z) {
                this.admob = c2411e.mopub(z);
                C1941e c1941e = new C1941e(z, 3);
                C0222e c0222e = this.startapp;
                c0222e.metrica(9, c1941e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: new, reason: not valid java name */
    public final C5251e mo1597new() {
        return this.admob.remoteconfig;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: package, reason: not valid java name */
    public final void mo1598package(int i, int i2) {
        if (inmobi(33)) {
            adcel(new C14628e(this, i, i2, 1));
            C2411e c2411e = this.admob;
            C5251e c5251e = c2411e.remoteconfig;
            if (c2411e.pro == i || c5251e.vip > i) {
                return;
            }
            int i3 = c5251e.metrica;
            if (i3 == 0 || i <= i3) {
                this.admob = c2411e.metrica(i, c2411e.signatures);
                C7608e c7608e = new C7608e(this, i, 0);
                C0222e c0222e = this.startapp;
                c0222e.metrica(30, c7608e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final long premium() {
        return this.admob.metrica.billing;
    }

    /* renamed from: private, reason: not valid java name */
    public final void m1599private(int i, int i2, int i3) {
        int i4;
        int i5;
        AbstractC6690e abstractC6690e = this.admob.adcel;
        int loadAd = abstractC6690e.loadAd();
        int min = Math.min(i2, loadAd);
        int i6 = min - i;
        int min2 = Math.min(i3, loadAd - i6);
        if (i >= loadAd || i == min || i == min2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < loadAd; i7++) {
            arrayList.add(abstractC6690e.smaato(i7, new C11501e(), 0L));
        }
        AbstractC9413e.m2554implements(arrayList, i, min, min2);
        m1519finally(abstractC6690e, arrayList, arrayList2);
        C9791e appmetrica = appmetrica(arrayList, arrayList2);
        if (appmetrica.Signature()) {
            return;
        }
        int amazon = amazon(this.admob);
        if (amazon >= i && amazon < min) {
            i5 = (amazon - i) + min2;
        } else if (min <= amazon && min2 > amazon) {
            i5 = amazon - i6;
        } else {
            if (min <= amazon || min2 > amazon) {
                i4 = amazon;
                C11501e c11501e = new C11501e();
                int i8 = this.admob.metrica.ad.appmetrica - abstractC6690e.smaato(amazon, c11501e, 0L).amazon;
                appmetrica.smaato(i4, c11501e, 0L);
                m1563e(m1516extends(this.admob, appmetrica, i4, c11501e.amazon + i8, mo1534e(), mo1538e(), 5), 0, null, null, null);
            }
            i5 = amazon + i6;
        }
        i4 = i5;
        C11501e c11501e2 = new C11501e();
        int i82 = this.admob.metrica.ad.appmetrica - abstractC6690e.smaato(amazon, c11501e2, 0L).amazon;
        appmetrica.smaato(i4, c11501e2, 0L);
        m1563e(m1516extends(this.admob, appmetrica, i4, c11501e2.amazon + i82, mo1534e(), mo1538e(), 5), 0, null, null, null);
    }

    @Override // defpackage.InterfaceC10488e
    public final void pro() {
        if (!inmobi(1)) {
            AbstractC2803e.smaato("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            adcel(new C6225e(this, 12));
            m1574e(true);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: protected, reason: not valid java name */
    public final void mo1600protected(InterfaceC8524e interfaceC8524e) {
        this.startapp.ad(interfaceC8524e);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: public, reason: not valid java name */
    public final C8256e mo1601public() {
        return this.admob.ad;
    }

    @Override // defpackage.InterfaceC10488e
    public final void purchase(float f) {
        if (inmobi(13)) {
            adcel(new C10887e(this, f, 0));
            C4194e c4194e = this.admob.billing;
            if (c4194e.ad != f) {
                C4194e c4194e2 = new C4194e(f, c4194e.vip);
                this.admob = this.admob.appmetrica(c4194e2);
                C14719e c14719e = new C14719e(c4194e2, 0);
                C0222e c0222e = this.startapp;
                c0222e.metrica(12, c14719e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final void release() {
        InterfaceC3001e interfaceC3001e = this.crashlytics;
        if (this.Signature) {
            return;
        }
        this.Signature = true;
        this.amazon = null;
        this.smaato.removeCallbacksAndMessages(null);
        vip();
        C10312e c10312e = this.adcel;
        Handler handler = (Handler) c10312e.f20361e;
        if (handler.hasMessages(1)) {
            try {
                C4275e c4275e = (C4275e) c10312e.f20360e;
                c4275e.crashlytics.mo989e(c4275e.metrica);
            } catch (RemoteException unused) {
                AbstractC2803e.smaato("MCImplBase", "Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.crashlytics = null;
        if (interfaceC3001e != null) {
            int purchase = this.vip.purchase();
            try {
                interfaceC3001e.asBinder().unlinkToDeath(this.billing, 0);
                interfaceC3001e.mo984e(this.metrica, purchase);
            } catch (RemoteException unused2) {
            }
        }
        this.startapp.license();
        C18100e c18100e = this.vip;
        RunnableC6364e runnableC6364e = new RunnableC6364e(this, 1);
        synchronized (c18100e.f35492e) {
            try {
                Handler subscription = AbstractC9413e.subscription(null);
                c18100e.f35494e = subscription;
                c18100e.f35495e = runnableC6364e;
                if (((C2271e) c18100e.f35489e).isEmpty()) {
                    c18100e.billing();
                } else {
                    subscription.postDelayed(new RunnableC1352e(0, c18100e), 30000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C9436e remoteconfig(AbstractC6690e abstractC6690e, int i, long j) {
        if (abstractC6690e.Signature()) {
            return null;
        }
        C11501e c11501e = new C11501e();
        C6158e c6158e = new C6158e();
        if (i == -1 || i >= abstractC6690e.loadAd()) {
            i = abstractC6690e.ad(this.admob.startapp);
            j = AbstractC9413e.m2567switch(abstractC6690e.smaato(i, c11501e, 0L).advert);
        }
        long m2546case = AbstractC9413e.m2546case(j);
        AbstractC2301e.mopub(i, abstractC6690e.loadAd());
        abstractC6690e.amazon(i, c11501e);
        if (m2546case == -9223372036854775807L) {
            m2546case = c11501e.advert;
            if (m2546case == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c11501e.amazon;
        abstractC6690e.purchase(i2, c6158e, false);
        while (i2 < c11501e.loadAd && c6158e.appmetrica != m2546case) {
            int i3 = i2 + 1;
            if (abstractC6690e.purchase(i3, c6158e, false).appmetrica > m2546case) {
                break;
            }
            i2 = i3;
        }
        abstractC6690e.purchase(i2, c6158e, false);
        return new C9436e(i2, m2546case - c6158e.appmetrica, false);
    }

    /* renamed from: return, reason: not valid java name */
    public final void m1602return(C2411e c2411e, C1120e c1120e) {
        C2411e c2411e2;
        C1120e c1120e2;
        if (mo1580e()) {
            boolean z = tapsense() < 6;
            C2411e c2411e3 = this.f9369goto;
            if (c2411e3 != null) {
                C5298e c5298e = this.applovin;
                C7543e c7543e = this.amazon;
                c7543e.getClass();
                this.f9369goto = AbstractC1008e.appmetrica(c2411e3, c2411e, c1120e, c5298e, z, c7543e);
                if (!this.mopub.isEmpty()) {
                    return;
                }
                C2411e c2411e4 = this.f9369goto;
                C1120e c1120e3 = C1120e.metrica;
                this.f9369goto = null;
                c2411e2 = c2411e4;
                c1120e2 = c1120e3;
            } else {
                c2411e2 = c2411e;
                c1120e2 = c1120e;
            }
            C2411e c2411e5 = this.admob;
            C5298e c5298e2 = this.applovin;
            C7543e c7543e2 = this.amazon;
            c7543e2.getClass();
            C2411e appmetrica = AbstractC1008e.appmetrica(c2411e5, c2411e2, c1120e2, c5298e2, z, c7543e2);
            this.admob = appmetrica;
            C0101e c0101e = c2411e5.license;
            C0101e c0101e2 = c2411e5.appmetrica;
            Integer valueOf = (c0101e.equals(c2411e2.license) && c0101e2.equals(c2411e2.appmetrica)) ? null : Integer.valueOf(appmetrica.purchase);
            C1962e remoteconfig = c2411e5.remoteconfig();
            C1962e remoteconfig2 = appmetrica.remoteconfig();
            C0101e c0101e3 = appmetrica.appmetrica;
            boolean equals = Objects.equals(remoteconfig, remoteconfig2);
            Integer valueOf2 = !equals ? Integer.valueOf(appmetrica.vip) : null;
            if (equals && valueOf != null && (valueOf.intValue() == 0 || valueOf.intValue() == 1)) {
                if (c0101e2.vip != c0101e3.vip) {
                    valueOf2 = Integer.valueOf(valueOf.intValue() != 0 ? 2 : 1);
                } else if (c2411e5.yandex != 0 && valueOf.intValue() == 0 && c2411e5.license.yandex == -1 && c0101e3.yandex == -1) {
                    valueOf2 = 0;
                }
            }
            Integer valueOf3 = !c2411e5.adcel.equals(appmetrica.adcel) ? Integer.valueOf(appmetrica.mopub) : null;
            int i = c2411e5.isVip;
            int i2 = appmetrica.isVip;
            m1594instanceof(c2411e5, appmetrica, valueOf3, (i == i2 && c2411e5.tapsense == appmetrica.tapsense) ? null : Integer.valueOf(i2), valueOf, valueOf2);
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final void signatures(int i) {
        if (inmobi(15)) {
            adcel(new C7608e(this, i, 6));
            C2411e c2411e = this.admob;
            if (c2411e.yandex != i) {
                this.admob = c2411e.startapp(i);
                C6802e c6802e = new C6802e(i, 2);
                C0222e c0222e = this.startapp;
                c0222e.metrica(8, c6802e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final C3335e smaato() {
        return this.admob.admob;
    }

    @Override // defpackage.InterfaceC10488e
    public final int startapp() {
        return this.admob.yandex;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: static, reason: not valid java name */
    public final void mo1603static(int i, int i2, List list) {
        if (inmobi(20)) {
            AbstractC2301e.billing(i >= 0 && i <= i2);
            adcel(new C6696e(this, list, i, i2, 0));
            m1536e(i, i2, list);
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final void stop() {
        if (inmobi(3)) {
            adcel(new C6225e(this, 13));
            C2411e c2411e = this.admob;
            C12693e c12693e = this.admob.metrica;
            C0101e c0101e = c12693e.ad;
            boolean z = c12693e.vip;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C12693e c12693e2 = this.admob.metrica;
            long j = c12693e2.license;
            long j2 = c12693e2.ad.purchase;
            int vip = AbstractC1008e.vip(j2, j);
            C12693e c12693e3 = this.admob.metrica;
            C2411e adcel = c2411e.adcel(new C12693e(c0101e, z, elapsedRealtime, j, j2, vip, 0L, c12693e3.yandex, c12693e3.startapp, c12693e3.ad.purchase));
            this.admob = adcel;
            if (adcel.ads != 1) {
                this.admob = adcel.purchase(1, adcel.ad);
                C13415e c13415e = new C13415e(9);
                C0222e c0222e = this.startapp;
                c0222e.metrica(4, c13415e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: strictfp, reason: not valid java name */
    public final void mo1604strictfp() {
        if (inmobi(26)) {
            adcel(new C6225e(this, 17));
            C2411e c2411e = this.admob;
            int i = c2411e.pro - 1;
            if (i >= c2411e.remoteconfig.vip) {
                this.admob = c2411e.metrica(i, c2411e.signatures);
                C7608e c7608e = new C7608e(this, i, 10);
                C0222e c0222e = this.startapp;
                c0222e.metrica(30, c7608e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final void subs(int i, long j) {
        if (inmobi(10)) {
            AbstractC2301e.billing(i >= 0);
            adcel(new C13790e(j, this, i));
            m1589e(i, j);
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final boolean subscription() {
        return this.admob.isPro;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: super, reason: not valid java name */
    public final void mo1605super(int i, boolean z) {
        if (inmobi(34)) {
            adcel(new C14393e(this, z, i));
            C2411e c2411e = this.admob;
            if (c2411e.signatures != z) {
                this.admob = c2411e.metrica(c2411e.pro, z);
                C11273e c11273e = new C11273e(this, z, 0);
                C0222e c0222e = this.startapp;
                c0222e.metrica(30, c11273e);
                c0222e.vip();
            }
        }
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m1606switch(int i, int i2) {
        C8795e c8795e = this.subs;
        if (c8795e.ad == i && c8795e.vip == i2) {
            return;
        }
        this.subs = new C8795e(i, i2);
        this.startapp.billing(24, new C14422e(i, i2, 1));
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: synchronized, reason: not valid java name */
    public final void mo1607synchronized(C4491e c4491e) {
        if (inmobi(29)) {
            adcel(new C11565e(this, c4491e, 27));
            C2411e c2411e = this.admob;
            if (c4491e != c2411e.f6186interface) {
                this.admob = c2411e.loadAd(c4491e);
                C14964e c14964e = new C14964e(c4491e, 1);
                C0222e c0222e = this.startapp;
                c0222e.metrica(19, c14964e);
                c0222e.vip();
            }
        }
    }

    public final int tapsense() {
        C7543e c7543e = this.amazon;
        c7543e.getClass();
        return c7543e.ad.firebase();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: this, reason: not valid java name */
    public final void mo1608this() {
        if (inmobi(20)) {
            adcel(new C6225e(this, 6));
            m1527const(0, Alert.DURATION_SHOW_INDEFINITELY);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: throws, reason: not valid java name */
    public final void mo1609throws(int i, int i2) {
        if (inmobi(20)) {
            AbstractC2301e.billing(i >= 0 && i2 >= i);
            adcel(new C14628e(this, i, i2, 0));
            m1527const(i, i2);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: transient, reason: not valid java name */
    public final void mo1610transient(int i) {
        if (inmobi(34)) {
            adcel(new C7608e(this, i, 4));
            C2411e c2411e = this.admob;
            int i2 = c2411e.pro + 1;
            int i3 = c2411e.remoteconfig.metrica;
            if (i3 == 0 || i2 <= i3) {
                this.admob = c2411e.metrica(i2, c2411e.signatures);
                C7608e c7608e = new C7608e(this, i2, 5);
                C0222e c0222e = this.startapp;
                c0222e.metrica(30, c7608e);
                c0222e.vip();
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: try, reason: not valid java name */
    public final long mo1611try() {
        return this.admob.firebase;
    }

    public final void vip() {
        SurfaceHolder surfaceHolder = this.premium;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.yandex);
            this.premium = null;
        }
        if (this.ads != null) {
            this.ads = null;
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: volatile, reason: not valid java name */
    public final void mo1612volatile(SurfaceHolder surfaceHolder) {
        if (inmobi(27)) {
            if (surfaceHolder == null) {
                if (inmobi(27)) {
                    vip();
                    m1543e(null, 0, 0);
                    m1606switch(0, 0);
                    return;
                }
                return;
            }
            if (this.premium == surfaceHolder) {
                return;
            }
            vip();
            this.premium = surfaceHolder;
            surfaceHolder.addCallback(this.yandex);
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                this.ads = null;
                m1543e(null, 0, 0);
                m1606switch(0, 0);
            } else {
                this.ads = surface;
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                m1543e(surface, surfaceFrame.width(), surfaceFrame.height());
                m1606switch(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: while, reason: not valid java name */
    public final int mo1613while() {
        return this.admob.metrica.purchase;
    }

    public final ListenableFuture yandex(InterfaceC3001e interfaceC3001e, InterfaceC9479e interfaceC9479e, boolean z) {
        MediaController mediaController;
        if (interfaceC3001e == null) {
            return AbstractC2017e.license(new C9759e(-4));
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.firebase) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        C9759e c9759e = new C9759e(1);
        C18100e c18100e = this.vip;
        C8342e license = c18100e.license(c9759e);
        int i = license.f17075e;
        C17548e c17548e = this.mopub;
        if (z) {
            if (c17548e.isEmpty()) {
                this.f9369goto = this.admob;
            }
            c17548e.add(Integer.valueOf(i));
        }
        try {
            interfaceC9479e.metrica(interfaceC3001e, i);
            return license;
        } catch (RemoteException e) {
            AbstractC2803e.amazon("MCImplBase", "Cannot connect to the service or the session is gone", e);
            c17548e.remove(Integer.valueOf(i));
            c18100e.mopub(i, new C9759e(-100));
            return license;
        }
    }
}
