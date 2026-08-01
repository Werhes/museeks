package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13905e implements InterfaceC16612e {
    public int Signature;
    public final List ad;
    public final C5350e adcel;
    public int admob;
    public final UUID advert;
    public final HandlerC17797e amazon;
    public C18053e applovin;
    public final boolean appmetrica;
    public final HashMap billing;
    public C17344e inmobi;
    public C17974e isPro;
    public byte[] isVip;
    public final C0444e license;
    public final Object loadAd;
    public final C18540e metrica;
    public final C5609e mopub;
    public InterfaceC12935e pro;
    public final boolean purchase;
    public HandlerC10242e remoteconfig;
    public C7923e signatures;
    public final Looper smaato;
    public final C5401e startapp;
    public HandlerThread subscription;
    public byte[] tapsense;
    public final InterfaceC8296e vip;
    public final C17486e yandex;

    public C13905e(UUID uuid, InterfaceC8296e interfaceC8296e, C18540e c18540e, C0444e c0444e, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, C5609e c5609e, Looper looper, C5401e c5401e, C5350e c5350e) {
        this.advert = uuid;
        this.metrica = c18540e;
        this.license = c0444e;
        this.vip = interfaceC8296e;
        this.appmetrica = z;
        this.purchase = z2;
        if (bArr != null) {
            this.isVip = bArr;
            this.ad = null;
        } else {
            list.getClass();
            this.ad = DesugarCollections.unmodifiableList(list);
        }
        this.billing = hashMap;
        this.mopub = c5609e;
        this.yandex = new C17486e();
        this.startapp = c5401e;
        this.adcel = c5350e;
        this.Signature = 2;
        this.smaato = looper;
        this.amazon = new HandlerC17797e(this, looper, 1);
        this.loadAd = new Object();
    }

    @Override // defpackage.InterfaceC16612e
    public final UUID ad() {
        loadAd();
        return this.advert;
    }

    public final boolean adcel() {
        int i = this.Signature;
        return i == 3 || i == 4;
    }

    public final void advert(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || AbstractC2413e.appmetrica(th)) {
            this.metrica.m4577package(this);
        } else {
            mopub(th, z ? 1 : 2);
        }
    }

    public final void amazon(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.loadAd) {
                try {
                    this.isPro = new C17974e(14);
                    List list = this.ad;
                    if (list != null) {
                        AbstractC17475e.remoteconfig(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C17344e tapsense = this.vip.tapsense(bArr, this.ad, i, this.billing);
            this.inmobi = tapsense;
            HandlerC10242e handlerC10242e = this.remoteconfig;
            String str = AbstractC9413e.ad;
            tapsense.getClass();
            handlerC10242e.getClass();
            handlerC10242e.obtainMessage(2, new C2696e(C6913e.billing.getAndIncrement(), z, SystemClock.elapsedRealtime(), tapsense)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            advert(e, true);
        }
    }

    @Override // defpackage.InterfaceC16612e
    public final boolean appmetrica(String str) {
        loadAd();
        byte[] bArr = this.tapsense;
        bArr.getClass();
        return this.vip.isPro(str, bArr);
    }

    @Override // defpackage.InterfaceC16612e
    public final InterfaceC12935e billing() {
        loadAd();
        return this.pro;
    }

    @Override // defpackage.InterfaceC16612e
    public final int getState() {
        loadAd();
        return this.Signature;
    }

    @Override // defpackage.InterfaceC16612e
    public final void license(C15683e c15683e) {
        loadAd();
        if (this.admob < 0) {
            AbstractC2803e.purchase("DefaultDrmSession", "Session reference count less than zero: " + this.admob);
            this.admob = 0;
        }
        if (c15683e != null) {
            C17486e c17486e = this.yandex;
            synchronized (c17486e.f34283e) {
                try {
                    ArrayList arrayList = new ArrayList(c17486e.f34282e);
                    arrayList.add(c15683e);
                    c17486e.f34282e = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) c17486e.f34281e.get(c15683e);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c17486e.f34280e);
                        hashSet.add(c15683e);
                        c17486e.f34280e = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    c17486e.f34281e.put(c15683e, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.admob + 1;
        this.admob = i;
        if (i == 1) {
            AbstractC2301e.subscription(this.Signature == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.subscription = handlerThread;
            handlerThread.start();
            this.remoteconfig = new HandlerC10242e(this, this.subscription.getLooper());
            if (smaato()) {
                startapp(true);
            }
        } else if (c15683e != null && adcel() && this.yandex.appmetrica(c15683e) == 1) {
            c15683e.metrica(this.Signature);
        }
        C16558e c16558e = (C16558e) this.license.f2491e;
        if (c16558e.f32497e != -9223372036854775807L) {
            c16558e.f32490e.remove(this);
            Handler handler = c16558e.f32506e;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final void loadAd() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.smaato;
        if (currentThread != looper.getThread()) {
            AbstractC2803e.amazon("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.InterfaceC16612e
    public final void metrica(C15683e c15683e) {
        loadAd();
        int i = this.admob;
        if (i <= 0) {
            AbstractC2803e.purchase("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.admob = i2;
        if (i2 == 0) {
            this.Signature = 0;
            HandlerC17797e handlerC17797e = this.amazon;
            String str = AbstractC9413e.ad;
            handlerC17797e.removeCallbacksAndMessages(null);
            this.remoteconfig.vip();
            this.remoteconfig = null;
            this.subscription.quit();
            this.subscription = null;
            this.pro = null;
            this.signatures = null;
            this.inmobi = null;
            synchronized (this.loadAd) {
                this.isPro = null;
            }
            this.applovin = null;
            byte[] bArr = this.tapsense;
            if (bArr != null) {
                this.vip.subscription(bArr);
                this.tapsense = null;
            }
        }
        if (c15683e != null) {
            this.yandex.billing(c15683e);
            if (this.yandex.appmetrica(c15683e) == 0) {
                c15683e.appmetrica();
            }
        }
        C0444e c0444e = this.license;
        int i3 = this.admob;
        C16558e c16558e = (C16558e) c0444e.f2491e;
        if (i3 == 1 && c16558e.f32494e > 0 && c16558e.f32497e != -9223372036854775807L) {
            c16558e.f32490e.add(this);
            Handler handler = c16558e.f32506e;
            handler.getClass();
            handler.postAtTime(new RunnableC17584e(24, this), this, SystemClock.uptimeMillis() + c16558e.f32497e);
        } else if (i3 == 0) {
            c16558e.f32486e.remove(this);
            if (c16558e.f32493e == this) {
                c16558e.f32493e = null;
            }
            if (c16558e.f32491e == this) {
                c16558e.f32491e = null;
            }
            C18540e c18540e = c16558e.f32496e;
            HashSet hashSet = (HashSet) c18540e.f36383e;
            hashSet.remove(this);
            if (((C13905e) c18540e.f36382e) == this) {
                c18540e.f36382e = null;
                if (!hashSet.isEmpty()) {
                    C13905e c13905e = (C13905e) hashSet.iterator().next();
                    c18540e.f36382e = c13905e;
                    C18053e adcel = c13905e.vip.adcel();
                    c13905e.applovin = adcel;
                    HandlerC10242e handlerC10242e = c13905e.remoteconfig;
                    String str2 = AbstractC9413e.ad;
                    adcel.getClass();
                    handlerC10242e.getClass();
                    handlerC10242e.obtainMessage(1, new C2696e(C6913e.billing.getAndIncrement(), true, SystemClock.elapsedRealtime(), adcel)).sendToTarget();
                }
            }
            if (c16558e.f32497e != -9223372036854775807L) {
                Handler handler2 = c16558e.f32506e;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c16558e.f32490e.remove(this);
            }
        }
        c16558e.billing();
    }

    public final void mopub(Throwable th, int i) {
        int i2;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = AbstractC9413e.ads(AbstractC9413e.premium(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (!(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !AbstractC2413e.appmetrica(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof C13545e) {
                        i2 = 6001;
                    } else if (th instanceof C0581e) {
                        i2 = 6003;
                    } else if (th instanceof C1968e) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.signatures = new C7923e(th, i2);
        AbstractC2803e.billing("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            C17486e c17486e = this.yandex;
            synchronized (c17486e.f34283e) {
                set = c17486e.f34280e;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C15683e) it.next()).license((Exception) th);
            }
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!AbstractC2413e.purchase(th) && !AbstractC2413e.appmetrica(th)) {
                throw ((Error) th);
            }
        }
        if (this.Signature != 4) {
            this.Signature = 1;
        }
    }

    @Override // defpackage.InterfaceC16612e
    public final C7923e purchase() {
        loadAd();
        if (this.Signature == 1) {
            return this.signatures;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean smaato() {
        /*
            r4 = this;
            boolean r0 = r4.adcel()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            eًۢۨ r0 = r4.vip     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r0 = r0.advert()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.tapsense = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            eًۢۨ r2 = r4.vip     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            eٍؘؑ r3 = r4.adcel     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r2.inmobi(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            eًۢۨ r0 = r4.vip     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r2 = r4.tapsense     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            eّۨۡ r0 = r0.mopub(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.pro = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0 = 3
            r4.Signature = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            e٘ؒؔ r2 = r4.yandex     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.lang.Object r3 = r2.f34283e     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.util.Set r2 = r2.f34280e     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            eٕۙؑ r3 = (defpackage.C15683e) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r3.metrica(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            goto L30
        L40:
            byte[] r0 = r4.tapsense     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            return r1
        L46:
            r0 = move-exception
            goto L4d
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L4d:
            boolean r2 = defpackage.AbstractC2413e.appmetrica(r0)
            if (r2 == 0) goto L59
            eۨۗ r0 = r4.metrica
            r0.m4577package(r4)
            goto L62
        L59:
            r4.mopub(r0, r1)
            goto L62
        L5d:
            eۨۗ r0 = r4.metrica
            r0.m4577package(r4)
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13905e.smaato():boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(2:41|42)|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073 A[Catch: NumberFormatException -> 0x0077, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0077, blocks: (B:47:0x006b, B:49:0x0073), top: B:46:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startapp(boolean r10) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13905e.startapp(boolean):void");
    }

    @Override // defpackage.InterfaceC16612e
    public final boolean vip() {
        loadAd();
        return this.appmetrica;
    }

    public final void yandex(InterfaceC8427e interfaceC8427e) {
        Set set;
        C17486e c17486e = this.yandex;
        synchronized (c17486e.f34283e) {
            set = c17486e.f34280e;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            interfaceC8427e.accept((C15683e) it.next());
        }
    }
}
