package defpackage;

import android.net.Uri;
import android.util.LruCache;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13343e implements InterfaceC16798e {

    /* renamed from: class, reason: not valid java name */
    public static final C10354e f26593class;

    /* renamed from: extends, reason: not valid java name */
    public static final int f26594extends;
    public static final C16108e firebase;

    /* renamed from: goto, reason: not valid java name */
    public static final C11180e f26595goto;

    /* renamed from: interface, reason: not valid java name */
    public static final C18247e f26596interface;

    /* renamed from: native, reason: not valid java name */
    public static final C11180e f26597native;

    /* renamed from: this, reason: not valid java name */
    public static final C13410e f26598this;

    /* renamed from: throw, reason: not valid java name */
    public static final long f26599throw;
    public final C18100e ad;
    public C6122e amazon;
    public boolean applovin;
    public final C11180e appmetrica;
    public C2245e inmobi;
    public C16042e isPro;
    public C2245e isVip;
    public final ExecutorC12245e license;
    public EnumC14627e loadAd;
    public final Executor metrica;
    public int premium;
    public C7967e pro;
    public final C9556e signatures;
    public final C18100e subscription;
    public ScheduledFuture tapsense;
    public final C18100e vip;
    public static final Set subs = DesugarCollections.unmodifiableSet(EnumSet.of(EnumC18485e.f36242e, EnumC18485e.f36241e));
    public static final Set crashlytics = DesugarCollections.unmodifiableSet(EnumSet.of(EnumC18485e.f36246e, EnumC18485e.f36244e, EnumC18485e.f36247e, EnumC18485e.f36248e, EnumC18485e.f36243e));
    public final Object purchase = new Object();
    public final C18100e billing = new C18100e((Object) null);
    public EnumC18485e yandex = EnumC18485e.f36246e;
    public EnumC18485e startapp = null;
    public int adcel = 0;
    public boolean mopub = false;
    public C1296e advert = null;
    public final ArrayList smaato = new ArrayList();
    public Surface Signature = null;
    public Surface admob = null;
    public C18405e remoteconfig = null;
    public int ads = 1;

    static {
        C18525e c18525e = C18525e.billing;
        List asList = Arrays.asList(c18525e, C18525e.purchase, C18525e.appmetrica);
        C13371e c13371e = C13371e.metrica;
        C16108e ad = C16108e.ad(asList, new C13371e(c18525e, 1));
        firebase = ad;
        C10354e c10354e = new C10354e(ad, -1, "video/*");
        f26593class = c10354e;
        f26596interface = new C18247e(c10354e, -1);
        new RuntimeException("The video frame producer became inactive before any data was received.");
        f26595goto = new C11180e(0);
        f26598this = C0597e.f2807e;
        f26597native = new C11180e(1);
        new ExecutorC12245e(AbstractC3062e.smaato());
        f26594extends = 3;
        f26599throw = 1000L;
    }

    public C13343e(C18247e c18247e, C11180e c11180e, C11180e c11180e2, C11180e c11180e3) {
        String obj;
        int i = 0;
        Uri uri = Uri.EMPTY;
        this.pro = null;
        this.signatures = new C9556e(60, (C2864e) null);
        this.premium = 3;
        this.tapsense = null;
        this.inmobi = null;
        this.isPro = null;
        this.applovin = false;
        ExecutorC14432e smaato = AbstractC3062e.smaato();
        this.metrica = smaato;
        ExecutorC12245e executorC12245e = new ExecutorC12245e(smaato);
        this.license = executorC12245e;
        int i2 = C10354e.license;
        C10354e c10354e = c18247e.ad;
        int i3 = c18247e.vip;
        this.subscription = new C18100e(new C18247e(c10354e.vip == -1 ? new C10354e(c10354e.ad, f26593class.vip, c10354e.metrica) : c10354e, i3));
        this.ad = new C18100e(new C17343e(this.adcel, advert(this.yandex)));
        this.vip = new C18100e(Boolean.FALSE);
        this.appmetrica = c11180e;
        this.isVip = new C2245e(c11180e, executorC12245e, smaato);
        StringBuilder sb = new StringBuilder("mRequiredFreeStorageBytes = ");
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = 52428800L;
        double d2 = d;
        while (d2 >= 1024.0d && i < 4) {
            d2 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            obj = decimalFormat.format(d2) + ' ' + strArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (int i4 = -1; i4 < i; i4 = -1) {
                double pow = Math.pow(1024.0d, i);
                double floor = Math.floor(d / pow);
                if (floor > 0.0d) {
                    sb2.append(decimalFormat.format(floor));
                    sb2.append(" ");
                    sb2.append(strArr[i]);
                    sb2.append(" ");
                    d -= floor * pow;
                }
                i--;
            }
            obj = AbstractC5304e.m1855const(sb2).toString();
        }
        sb.append(obj);
        AbstractC9464e.yandex("Recorder", sb.toString());
    }

    public static C14013e adcel(int i, InterfaceC12424e interfaceC12424e) {
        C14013e c14013e;
        C13410e c13410e = f26598this;
        LruCache lruCache = AbstractC12954e.ad;
        C5363e c5363e = new C5363e(new C15736e(interfaceC12424e, i, c13410e, 0));
        if (interfaceC12424e instanceof C16575e) {
            C16575e c16575e = (C16575e) interfaceC12424e;
            InterfaceC12424e interfaceC12424e2 = c16575e.f34060e;
            if (!interfaceC12424e2.appmetrica() && interfaceC12424e2.admob() != -1) {
                C17967e c17967e = new C17967e(c16575e.f34060e.billing(), c16575e.f32519e, i, c13410e);
                LruCache lruCache2 = AbstractC12954e.ad;
                synchronized (lruCache2) {
                    c14013e = (C14013e) lruCache2.get(c17967e);
                    if (c14013e == null) {
                        c14013e = (C14013e) c5363e.getValue();
                        lruCache2.put(c17967e, c14013e);
                    }
                }
                return c14013e;
            }
        }
        return (C14013e) c5363e.getValue();
    }

    public static int advert(EnumC18485e enumC18485e) {
        return (enumC18485e == EnumC18485e.f36240e || enumC18485e == EnumC18485e.f36248e) ? 1 : 2;
    }

    public static Object mopub(C18100e c18100e) {
        try {
            return c18100e.startapp().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void smaato(C18405e c18405e) {
        if (AbstractC0869e.premium(c18405e)) {
            AbstractC9464e.yandex(c18405e.ad, "signalSourceStopped");
            c18405e.yandex.execute(new RunnableC4127e(c18405e, 4));
        }
    }

    public final void Signature() {
        if (this.remoteconfig != null) {
            AbstractC9464e.yandex("Recorder", "Releasing video encoder.");
            C2245e c2245e = this.inmobi;
            if (c2245e != null) {
                AbstractC4265e.yandex(null, ((C18405e) c2245e.purchase) == this.remoteconfig);
                AbstractC9464e.yandex("Recorder", "Releasing video encoder: " + this.remoteconfig);
                this.inmobi.startapp();
                this.inmobi = null;
                this.remoteconfig = null;
                subscription(null);
            } else {
                admob();
            }
        }
        synchronized (this.purchase) {
            try {
                switch (this.yandex.ordinal()) {
                    case 1:
                    case 2:
                        tapsense(EnumC18485e.f36246e);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        remoteconfig(EnumC18485e.f36246e);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6122e c6122e = this.amazon;
        if (c6122e == null || c6122e.yandex.f19184e.isDone()) {
            return;
        }
        startapp(this.amazon, this.loadAd, false);
    }

    @Override // defpackage.InterfaceC16798e
    public final C14013e ad(int i, InterfaceC12424e interfaceC12424e) {
        return adcel(i == 1 ? 2 : 1, interfaceC12424e);
    }

    public final ListenableFuture admob() {
        AbstractC9464e.yandex("Recorder", "Try to safely release video encoder: " + this.remoteconfig);
        C2245e c2245e = this.isVip;
        c2245e.ad();
        return AbstractC15792e.smaato((ListenableFuture) c2245e.startapp);
    }

    public final void amazon(int i, IOException iOException) {
        boolean z;
        synchronized (this.purchase) {
            try {
                z = false;
                switch (this.yandex.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.yandex);
                    case 4:
                    case 5:
                        remoteconfig(EnumC18485e.f36248e);
                        z = true;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            signatures(i, iOException);
        }
    }

    @Override // defpackage.InterfaceC16798e
    public final InterfaceC11659e appmetrica() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC16798e
    public final boolean billing() {
        return ((C18247e) mopub(this.subscription)).ad.ad == firebase;
    }

    @Override // defpackage.InterfaceC16798e
    public final void license(int i) {
        this.license.execute(new RunnableC9766e(this, i, 8));
    }

    public final void loadAd() {
        boolean z;
        boolean z2;
        synchronized (this.purchase) {
            try {
                z = false;
                switch (this.yandex.ordinal()) {
                    case 1:
                    case 2:
                        tapsense(EnumC18485e.f36247e);
                    case 0:
                    case 3:
                    case 8:
                        z2 = false;
                        z = true;
                        break;
                    case 4:
                    case 5:
                        AbstractC4265e.yandex("In-progress recording shouldn't be null when in state " + this.yandex, false);
                        remoteconfig(EnumC18485e.f36247e);
                        z2 = true;
                        break;
                    case 6:
                        remoteconfig(EnumC18485e.f36247e);
                        z2 = false;
                        break;
                    case 7:
                    default:
                        z2 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            if (z2) {
                signatures(4, null);
                return;
            }
            return;
        }
        AbstractC9464e.yandex("Recorder", "Transitioning audio state: " + AbstractC0054e.m225throw(this.ads) + " --> " + AbstractC0054e.m225throw(1));
        this.ads = 1;
        Signature();
    }

    @Override // defpackage.InterfaceC16798e
    public final InterfaceC11659e metrica() {
        return this.subscription;
    }

    public final void pro(int i) {
        if (this.adcel == i) {
            return;
        }
        AbstractC9464e.yandex("Recorder", "Transitioning streamId: " + this.adcel + " --> " + i);
        this.adcel = i;
        this.ad.advert(new C17343e(i, advert(this.yandex)));
    }

    @Override // defpackage.InterfaceC16798e
    public final InterfaceC11659e purchase() {
        return this.vip;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remoteconfig(defpackage.EnumC18485e r4) {
        /*
            r3 = this;
            eۥٖ r0 = r3.yandex
            if (r0 == r4) goto L77
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Transitioning Recorder internal state: "
            r0.<init>(r1)
            eۥٖ r1 = r3.yandex
            r0.append(r1)
            java.lang.String r1 = " --> "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Recorder"
            defpackage.AbstractC9464e.yandex(r1, r0)
            java.util.Set r0 = defpackage.C13343e.subs
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L5a
            eۥٖ r1 = r3.yandex
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L61
            java.util.Set r0 = defpackage.C13343e.crashlytics
            eۥٖ r1 = r3.yandex
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L44
            eۥٖ r0 = r3.yandex
            r3.startapp = r0
            int r0 = advert(r0)
            goto L62
        L44:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            r0.<init>(r1)
            eۥٖ r1 = r3.yandex
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L5a:
            eۥٖ r0 = r3.startapp
            if (r0 == 0) goto L61
            r0 = 0
            r3.startapp = r0
        L61:
            r0 = 0
        L62:
            r3.yandex = r4
            if (r0 != 0) goto L6a
            int r0 = advert(r4)
        L6a:
            int r4 = r3.adcel
            eٍٗۢ r1 = new eٍٗۢ
            r1.<init>(r4, r0)
            eۣ٘ۙ r4 = r3.ad
            r4.advert(r1)
            return
        L77:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempted to transition to state "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", but Recorder is already in state "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13343e.remoteconfig(eۥٖ):void");
    }

    public final void signatures(int i, IOException iOException) {
        if (this.mopub) {
            return;
        }
        this.mopub = true;
        if (this.ads == 4) {
            while (true) {
                C9556e c9556e = this.signatures;
                if (c9556e.m2614extends()) {
                    break;
                } else {
                    ((C7967e) c9556e.mopub()).close();
                }
            }
            throw null;
        }
        C7967e c7967e = this.pro;
        if (c7967e != null) {
            c7967e.close();
            this.pro = null;
        }
        if (this.premium != 2) {
            RunnableC5512e runnableC5512e = new RunnableC5512e(4);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.tapsense = AbstractC3062e.amazon().schedule(new RunnableC11247e(this.license, runnableC5512e, 4), 1000L, timeUnit);
        } else {
            smaato(this.remoteconfig);
        }
        C18405e c18405e = this.remoteconfig;
        c18405e.yandex.execute(new RunnableC3733e(c18405e, c18405e.admob.startapp(), 2));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [eؙٖؖ, java.lang.Object] */
    public final void startapp(C6122e c6122e, EnumC14627e enumC14627e, boolean z) {
        if (c6122e.yandex.f19184e.isDone()) {
            AbstractC9464e.remoteconfig("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        C11180e c11180e = new C11180e(2, this);
        ExecutorC12245e executorC12245e = this.license;
        c6122e.vip(executorC12245e, c11180e);
        Size size = c6122e.vip;
        C13047e ad = ad(c6122e.billing, c6122e.appmetrica.vip()).ad(c6122e.metrica);
        this.advert = ad != null ? ad.ad(size) : null;
        AbstractC9464e.yandex("Recorder", "mResolvedEncoderProfiles = " + this.advert);
        C16042e c16042e = this.isPro;
        if (c16042e != null && !c16042e.f31595e) {
            c16042e.f31595e = true;
            ScheduledFuture scheduledFuture = (ScheduledFuture) c16042e.f31600e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                c16042e.f31600e = null;
            }
        }
        boolean z2 = this.applovin;
        int i = z ? f26594extends : 0;
        ?? obj = new Object();
        obj.f31599e = this;
        obj.f31595e = false;
        obj.f31596e = 0;
        obj.f31600e = null;
        obj.f31597e = c6122e;
        obj.f31594e = enumC14627e;
        this.applovin = z2;
        obj.f31598e = i;
        this.isPro = obj;
        admob().ad(new RunnableC9527e(3, obj, c6122e, enumC14627e), executorC12245e);
    }

    public final void subscription(Surface surface) {
        int hashCode;
        if (this.Signature == surface) {
            return;
        }
        this.Signature = surface;
        synchronized (this.purchase) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            pro(hashCode);
        }
    }

    public final void tapsense(EnumC18485e enumC18485e) {
        if (!subs.contains(this.yandex)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.yandex);
        }
        if (!crashlytics.contains(enumC18485e)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + enumC18485e);
        }
        if (this.startapp != enumC18485e) {
            this.startapp = enumC18485e;
            this.ad.advert(new C17343e(this.adcel, advert(enumC18485e)));
        }
    }

    @Override // defpackage.InterfaceC16798e
    public final InterfaceC14020e vip(int i, InterfaceC12424e interfaceC12424e) {
        int i2 = i == 1 ? 2 : 1;
        String str = ((C18247e) mopub(this.subscription)).ad.metrica;
        InterfaceC12424e interfaceC12424e2 = interfaceC12424e;
        return "video/*".equals(str) ? new C2362e(adcel(i2, interfaceC12424e), interfaceC12424e2) : new C12894e(str, interfaceC12424e2, f26598this);
    }

    @Override // defpackage.InterfaceC16798e
    public final void yandex(C6122e c6122e, EnumC14627e enumC14627e, boolean z) {
        synchronized (this.purchase) {
            try {
                AbstractC9464e.yandex("Recorder", "Surface is requested in state: " + this.yandex + ", Current surface: " + this.adcel);
                if (this.yandex == EnumC18485e.f36243e) {
                    remoteconfig(EnumC18485e.f36246e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.license.execute(new RunnableC8044e(this, c6122e, enumC14627e, z, 3));
    }
}
