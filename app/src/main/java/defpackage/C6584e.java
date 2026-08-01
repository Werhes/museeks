package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6584e {
    public final boolean Signature;
    public final Object ad = new Object();
    public final C7543e adcel;
    public final boolean admob;
    public boolean ads;
    public final Handler advert;
    public final RunnableC9624e amazon;
    public final long applovin;
    public final C1439e appmetrica;
    public final BinderC17428e billing;

    /* renamed from: class, reason: not valid java name */
    public final C1439e f13589class;
    public final Bundle crashlytics;
    public final C4748e firebase;

    /* renamed from: goto, reason: not valid java name */
    public final C17249e f13590goto;
    public ServiceC13230e inmobi;

    /* renamed from: interface, reason: not valid java name */
    public final C17249e f13591interface;
    public boolean isPro;
    public C9770e isVip;
    public final HandlerC17805e license;
    public final Handler loadAd;
    public final HandlerC5641e metrica;
    public final C4748e mopub;
    public AbstractC17475e premium;
    public C6268e pro;
    public final Context purchase;
    public C2411e remoteconfig;
    public final PendingIntent signatures;
    public final InterfaceC14343e smaato;
    public final String startapp;
    public final AbstractC17475e subs;
    public final AbstractC17475e subscription;
    public C15477e tapsense;

    /* renamed from: this, reason: not valid java name */
    public final int f13592this;
    public final Uri vip;
    public final C5537e yandex;

    /* renamed from: native, reason: not valid java name */
    public static final C9759e f13588native = new C9759e(1);

    /* renamed from: extends, reason: not valid java name */
    public static final InterfaceC6823e f13587extends = AbstractC5209e.billing(new C8456e(4));

    /* JADX WARN: Type inference failed for: r2v5, types: [eًؙٞ, java.lang.Object, eٍُٝ] */
    public C6584e(C4748e c4748e, Context context, String str, InterfaceC16843e interfaceC16843e, PendingIntent pendingIntent, AbstractC17475e abstractC17475e, AbstractC17475e abstractC17475e2, AbstractC17475e abstractC17475e3, C1439e c1439e, Bundle bundle, Bundle bundle2, InterfaceC14343e interfaceC14343e, boolean z, boolean z2, int i) {
        AbstractC2803e.advert("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.0] [" + AbstractC9413e.ad + "]");
        this.mopub = c4748e;
        this.purchase = context;
        this.startapp = str;
        this.signatures = pendingIntent;
        this.premium = abstractC17475e;
        this.subs = abstractC17475e2;
        this.subscription = abstractC17475e3;
        this.appmetrica = c1439e;
        this.crashlytics = bundle2;
        this.smaato = interfaceC14343e;
        this.Signature = z;
        this.admob = z2;
        BinderC17428e binderC17428e = new BinderC17428e(this);
        this.billing = binderC17428e;
        this.loadAd = new Handler(Looper.getMainLooper());
        Looper mo3030e = interfaceC16843e.mo3030e();
        Handler handler = new Handler(mo3030e);
        this.advert = handler;
        this.remoteconfig = C2411e.f6162goto;
        this.metrica = new HandlerC5641e(this, mo3030e);
        this.license = new HandlerC17805e(this, mo3030e);
        Uri appmetrica = appmetrica(str);
        this.vip = appmetrica;
        C5537e c5537e = new C5537e(this, appmetrica, handler, bundle, z, abstractC17475e, abstractC17475e2, C9069e.appmetrica, C9069e.purchase, bundle2);
        this.yandex = c5537e;
        this.adcel = new C7543e(Process.myUid(), 1010000300, 9, context.getPackageName(), binderC17428e, bundle, ((C2584e) c5537e.amazon.f26645e).metrica.f27276e);
        ?? abstractC11130e = new AbstractC11130e(interfaceC16843e);
        this.pro = abstractC11130e;
        AbstractC9413e.m2565strictfp(handler, new RunnableC7410e(this, (Object) abstractC11130e, 16));
        this.applovin = 3000L;
        this.amazon = new RunnableC9624e(this, 1);
        AbstractC9413e.m2565strictfp(handler, new RunnableC9624e(this, 2));
        this.firebase = c4748e;
        this.f13589class = c1439e;
        this.f13592this = i;
        this.f13591interface = new C17249e();
        this.f13590goto = new C17249e();
    }

    public static boolean Signature(C18424e c18424e) {
        return c18424e != null && Objects.equals(c18424e.ad.ad.ad, "com.android.systemui");
    }

    public static void ad(C6584e c6584e) {
        synchronized (c6584e.ad) {
            try {
                if (c6584e.isPro) {
                    return;
                }
                C12693e m2087e = c6584e.pro.m2087e();
                if (!c6584e.metrica.hasMessages(1) && AbstractC1008e.ad(m2087e, c6584e.remoteconfig.metrica)) {
                    C11106e c11106e = c6584e.billing.license;
                    AbstractC17475e m3014native = c11106e.m3014native();
                    for (int i = 0; i < m3014native.size(); i++) {
                        C18424e c18424e = (C18424e) m3014native.get(i);
                        c11106e.m3027try(c18424e);
                        c6584e.billing(c18424e, new C13844e(m2087e, c11106e.m3008final(c18424e, 16), c11106e.m3008final(c18424e, 17), c18424e));
                    }
                    try {
                        c6584e.yandex.adcel.amazon(0, m2087e, true, true, 0);
                    } catch (RemoteException e) {
                        AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
                    }
                }
                c6584e.m2205extends();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Uri appmetrica(String str) {
        Uri.Builder authority = new Uri.Builder().scheme("androidx").authority("media3.session");
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return authority.appendPath(str).build();
    }

    public static void metrica(C6584e c6584e, Runnable runnable) {
        AbstractC9413e.m2565strictfp(c6584e.advert, runnable);
    }

    /* renamed from: throw, reason: not valid java name */
    public static Object m2202throw(Future future) {
        AbstractC2301e.subscription(future.isDone());
        try {
            return future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            AbstractC2803e.amazon("MediaSessionImpl", "Library operation failed", e);
            return null;
        }
    }

    /* renamed from: try, reason: not valid java name */
    public static void m2203try(int i, C8802e c8802e) {
        if (c8802e.ad == 0) {
            AbstractC17475e abstractC17475e = (AbstractC17475e) c8802e.metrica;
            abstractC17475e.getClass();
            if (abstractC17475e.size() <= i) {
                return;
            }
            throw new IllegalStateException("Invalid size=" + abstractC17475e.size() + ", pageSize=" + i);
        }
    }

    public static C8802e vip(C11753e c11753e, C9035e c9035e) {
        AbstractC17475e abstractC17475e = c9035e.ad;
        return abstractC17475e.isEmpty() ? new C8802e(-2, SystemClock.elapsedRealtime(), c11753e, new C4960e("no error message provided", -2, Bundle.EMPTY), null, 4) : C8802e.metrica(AbstractC17475e.ads((C1962e) abstractC17475e.get(Math.max(0, Math.min(c9035e.vip, abstractC17475e.size() - 1)))), c11753e);
    }

    public final C18424e adcel() {
        AbstractC17475e m3014native = this.yandex.billing.m3014native();
        for (int i = 0; i < m3014native.size(); i++) {
            C18424e c18424e = (C18424e) m3014native.get(i);
            if (Signature(c18424e)) {
                return c18424e;
            }
        }
        AbstractC17475e m3014native2 = this.billing.license.m3014native();
        for (int i2 = 0; i2 < m3014native2.size(); i2++) {
            C18424e c18424e2 = (C18424e) m3014native2.get(i2);
            if (Signature(c18424e2)) {
                return c18424e2;
            }
        }
        return null;
    }

    public final void admob(C18424e c18424e, C8802e c8802e) {
        int i = this.f13592this;
        if (i == 0 || c18424e.vip != 0) {
            return;
        }
        int i2 = c8802e.ad;
        C5537e c5537e = this.yandex;
        if (i2 == -102 || i2 == -105) {
            boolean z = i == 1;
            c5537e.getClass();
            C11753e c11753e = c8802e.appmetrica;
            C4960e c4960e = c8802e.purchase;
            int billing = AbstractC13256e.billing(i2);
            C0381e c0381e = c5537e.tapsense;
            if (c0381e == null || c0381e.vip != billing) {
                String str = c4960e != null ? c4960e.vip : "no error message provided";
                Bundle bundle = Bundle.EMPTY;
                if (c11753e != null) {
                    Bundle bundle2 = c11753e.ad;
                    if (bundle2.containsKey("android.media.extras.ERROR_RESOLUTION_ACTION_INTENT")) {
                        bundle = bundle2;
                        c5537e.tapsense = new C0381e(z, billing, str, bundle);
                        c5537e.m1934static(c5537e.yandex.pro);
                    }
                }
                if (c4960e != null) {
                    bundle = c4960e.metrica;
                }
                c5537e.tapsense = new C0381e(z, billing, str, bundle);
                c5537e.m1934static(c5537e.yandex.pro);
            }
        }
        if (i2 != 0 || c5537e.tapsense == null) {
            return;
        }
        c5537e.tapsense = null;
        c5537e.m1934static(c5537e.yandex.pro);
    }

    public final void ads(C18424e c18424e) {
        m2208native(c18424e);
        this.appmetrica.getClass();
    }

    public final void advert(C18424e c18424e, boolean z) {
        if (applovin()) {
            boolean z2 = this.pro.mo2107e(16) && this.pro.mo2113e() != null;
            boolean z3 = this.pro.mo2107e(31) || this.pro.mo2107e(20);
            C18424e m2208native = m2208native(c18424e);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            AbstractC2301e.subscription(!false);
            sparseBooleanArray.append(1, true);
            AbstractC2301e.subscription(!false);
            C5298e c5298e = new C5298e(new C11715e(sparseBooleanArray));
            if (!z2 && z3) {
                C1439e c1439e = this.appmetrica;
                C8724e appmetrica = AbstractC8461e.appmetrica(3, null, c1439e.ad, new C17071e(c1439e, null, 11));
                AbstractC2301e.amazon(appmetrica, "Callback.onPlaybackResumption must return a non-null future");
                appmetrica.ad(new RunnableC17144e(appmetrica, new C12309e(this, m2208native, z, c5298e), 11), new ExecutorC11760e(this, 2));
                return;
            }
            if (!z2) {
                AbstractC2803e.smaato("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            AbstractC9413e.m2551extends(this.pro);
            if (z) {
                ads(m2208native);
            }
        }
    }

    public final boolean amazon(C18424e c18424e) {
        return Objects.equals(c18424e.ad.ad.ad, this.purchase.getPackageName()) && c18424e.vip != 0 && new Bundle(c18424e.appmetrica).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean applovin() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) AbstractC5750e.purchase(new C17687e(22, this)).f19184e.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        C9770e c9770e = this.isVip;
        if (c9770e != null) {
            PlaybackService playbackService = (PlaybackService) c9770e.f19315e;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && i < 33 && !playbackService.adcel(null).f22410e) {
                return playbackService.ads(this.mopub, true);
            }
        }
        return true;
    }

    public final void billing(C18424e c18424e, InterfaceC15046e interfaceC15046e) {
        int i;
        BinderC17428e binderC17428e = this.billing;
        try {
            C18100e m3000break = binderC17428e.license.m3000break(c18424e);
            if (m3000break != null) {
                i = m3000break.purchase();
            } else if (!smaato(c18424e)) {
                return;
            } else {
                i = 0;
            }
            InterfaceC10645e interfaceC10645e = c18424e.license;
            if (interfaceC10645e != null) {
                interfaceC15046e.appmetrica(interfaceC10645e, i);
            }
        } catch (DeadObjectException unused) {
            binderC17428e.license.m3020static(c18424e);
        } catch (RemoteException e) {
            AbstractC2803e.amazon("MediaSessionImpl", "Exception in " + c18424e, e);
        }
    }

    /* renamed from: class, reason: not valid java name */
    public final C13747e m2204class(C18424e c18424e, String str, C11753e c11753e) {
        InterfaceC10645e interfaceC10645e = c18424e.license;
        interfaceC10645e.getClass();
        synchronized (this) {
            try {
                this.f13590goto.yandex(interfaceC10645e, str);
                this.f13591interface.yandex(str, c18424e);
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw th;
            }
        }
        C1439e c1439e = this.f13589class;
        C4748e c4748e = this.firebase;
        C18424e m2208native = m2208native(c18424e);
        c1439e.getClass();
        AbstractC2301e.billing(!TextUtils.isEmpty(str));
        C6584e c6584e = c4748e.ad;
        if (!c6584e.ads || !c6584e.amazon(m2208native) || (m2208native = c6584e.adcel()) != null) {
            c6584e.billing(m2208native, new C9509e(8, c6584e, str, c11753e));
        }
        C13747e license = AbstractC2017e.license(new C8802e(0, SystemClock.elapsedRealtime(), null, null, null, 1));
        license.ad(new RunnableC6795e(this, license, c18424e, str, 6), new ExecutorC11760e(this, 1));
        return license;
    }

    public final ListenableFuture crashlytics(C18424e c18424e, List list, final int i, final long j) {
        C1962e c1962e;
        m2208native(c18424e);
        C1439e c1439e = this.appmetrica;
        c1439e.getClass();
        C14826e c14826e = c1439e.ad;
        ArrayList arrayList = AbstractC1876e.ad;
        InterfaceC5083e interfaceC5083e = null;
        ListenableFuture m2550else = (i != -1 || (c1962e = (C1962e) AbstractC13480e.m3604this(list)) == null) ? AbstractC9413e.m2550else(AbstractC8461e.appmetrica(2, AbstractC6731e.ad, c14826e, new C16373e(c1439e, list, interfaceC5083e, 6)), new InterfaceC18244e() { // from class: eٕٗؐ
            @Override // defpackage.InterfaceC18244e
            public final ListenableFuture apply(Object obj) {
                return AbstractC2017e.license(new C9035e(i, j, (List) obj));
            }
        }) : AbstractC8461e.appmetrica(2, AbstractC6731e.ad, c14826e, new C7195e(c1439e, c1962e, interfaceC5083e, 23));
        AbstractC2301e.amazon(m2550else, "Callback.onSetMediaItems must return a non-null future");
        return m2550else;
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m2205extends() {
        Handler handler = this.advert;
        RunnableC9624e runnableC9624e = this.amazon;
        handler.removeCallbacks(runnableC9624e);
        if (this.admob) {
            long j = this.applovin;
            if (j > 0) {
                if (this.pro.mo2108e() || this.pro.subscription()) {
                    handler.postDelayed(runnableC9624e, j);
                }
            }
        }
    }

    public final ListenableFuture firebase(C18424e c18424e, AbstractC5340e abstractC5340e) {
        String str;
        m2208native(c18424e);
        C1439e c1439e = this.appmetrica;
        c1439e.getClass();
        C1962e mo2113e = this.mopub.ad().mo2113e();
        if (mo2113e != null && (str = mo2113e.ad) != null) {
            C8724e appmetrica = AbstractC8461e.appmetrica(3, null, c1439e.ad, new C16373e(c1439e, str, abstractC5340e, (InterfaceC5083e) null, 7));
            if (appmetrica != null) {
                return appmetrica;
            }
        }
        return AbstractC2017e.license(C1439e.ad());
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m2206goto() {
        AbstractC2803e.advert("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.0] [" + AbstractC9413e.ad + "] [" + AbstractC1418e.vip() + "]");
        synchronized (this.ad) {
            try {
                if (this.isPro) {
                    return;
                }
                this.isPro = true;
                HandlerC17805e handlerC17805e = this.license;
                RunnableC4904e runnableC4904e = (RunnableC4904e) handlerC17805e.vip;
                if (runnableC4904e != null) {
                    handlerC17805e.removeCallbacks(runnableC4904e);
                    handlerC17805e.vip = null;
                }
                this.advert.removeCallbacksAndMessages(null);
                try {
                    AbstractC9413e.m2565strictfp(this.advert, new RunnableC9624e(this, 3));
                } catch (Exception e) {
                    AbstractC2803e.amazon("MediaSessionImpl", "Exception thrown while closing", e);
                }
                C5537e c5537e = this.yandex;
                ComponentName componentName = c5537e.Signature;
                C6584e c6584e = c5537e.yandex;
                C13391e c13391e = c5537e.amazon;
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    if (componentName == null) {
                        ((C2584e) c13391e.f26645e).ad.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", c6584e.vip);
                        intent.setComponent(componentName);
                        ((C2584e) c13391e.f26645e).ad.setMediaButtonReceiver(PendingIntent.getBroadcast(c6584e.purchase, 0, intent, C5537e.premium));
                    }
                }
                C13264e c13264e = c5537e.loadAd;
                if (c13264e != null) {
                    c6584e.purchase.unregisterReceiver(c13264e);
                }
                C7366e c7366e = c5537e.smaato;
                if (c7366e != null && !c7366e.purchase.getAndSet(true)) {
                    c7366e.metrica.execute(new RunnableC2613e(c7366e, 0));
                }
                C2584e c2584e = (C2584e) c13391e.f26645e;
                MediaSession mediaSession = c2584e.ad;
                c2584e.purchase.kill();
                if (i == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e2) {
                        AbstractC2803e.amazon("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e2);
                    }
                }
                mediaSession.setCallback(null);
                c2584e.vip.metrica.clear();
                mediaSession.release();
                BinderC17428e binderC17428e = this.billing;
                Set set = binderC17428e.appmetrica;
                C11106e c11106e = binderC17428e.license;
                for (C18424e c18424e : c11106e.m3014native()) {
                    c11106e.m3020static(c18424e);
                    InterfaceC10645e interfaceC10645e = c18424e.license;
                    if (interfaceC10645e != null) {
                        interfaceC10645e.ad();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    InterfaceC10645e interfaceC10645e2 = ((C18424e) it.next()).license;
                    if (interfaceC10645e2 != null) {
                        interfaceC10645e2.ad();
                    }
                }
                set.clear();
                binderC17428e.metrica.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C8724e inmobi(C18424e c18424e, String str, int i, int i2, C11753e c11753e) {
        m2208native(c18424e);
        C1439e c1439e = this.f13589class;
        C8724e appmetrica = AbstractC8461e.appmetrica(3, null, c1439e.ad, new C17781e(c1439e, str, i, i2, c11753e, null, 1));
        appmetrica.f17595e.ad(new RunnableC6835e(this, appmetrica, c18424e, i2, 1), new ExecutorC11760e(this, 0));
        return appmetrica;
    }

    /* renamed from: interface, reason: not valid java name */
    public final C13747e m2207interface(C18424e c18424e, String str) {
        m2208native(c18424e);
        this.f13589class.getClass();
        C13747e license = AbstractC2017e.license(new C8802e(0, SystemClock.elapsedRealtime(), null, null, null, 1));
        license.ad(new RunnableC4904e(26, this, c18424e, str), new ExecutorC11760e(this, 0));
        return license;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isPro(defpackage.C18424e r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6584e.isPro(eُۡ, android.content.Intent):boolean");
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [eٌّؒ, eٔؐۜ] */
    /* JADX WARN: Type inference failed for: r8v1, types: [eٌّؒ, eٔؐۜ] */
    /* JADX WARN: Type inference failed for: r8v2, types: [eٌّؒ, eٔؐۜ] */
    public final C13747e isVip(C18424e c18424e, C11753e c11753e) {
        C8802e c8802e;
        C8802e c8802e2;
        if (c11753e != null && c11753e.vip && Signature(c18424e)) {
            if (this.yandex.Signature == null) {
                return AbstractC2017e.license(C8802e.vip(-6));
            }
            C9466e c9466e = new C9466e();
            C2171e c2171e = AbstractC17475e.f34223e;
            C1410e c1410e = C1410e.f4222e;
            List list = Collections.EMPTY_LIST;
            C1410e c1410e2 = C1410e.f4222e;
            C9457e c9457e = new C9457e();
            C13325e c13325e = C13325e.license;
            C4761e c4761e = new C4761e();
            c4761e.subscription = Boolean.TRUE;
            c4761e.remoteconfig = Boolean.FALSE;
            C1962e c1962e = new C1962e("androidx.media3.session.recent.root", new C14435e(c9466e), null, new C15197e(c9457e), new C12053e(c4761e), c13325e);
            C8802e.license(c1962e);
            return AbstractC2017e.license(new C8802e(0, SystemClock.elapsedRealtime(), c11753e, null, c1962e, 2));
        }
        m2208native(c18424e);
        ((C7838e) this.f13589class.vip.get()).f15859e.getClass();
        if (!AbstractC7890e.billing(Build.BRAND, "samsung") || Build.VERSION.SDK_INT >= 28) {
            if (c11753e == null || !c11753e.vip) {
                C9466e c9466e2 = new C9466e();
                C2171e c2171e2 = AbstractC17475e.f34223e;
                C1410e c1410e3 = C1410e.f4222e;
                List list2 = Collections.EMPTY_LIST;
                C9457e c9457e2 = new C9457e();
                C13325e c13325e2 = C13325e.license;
                C4761e c4761e2 = new C4761e();
                c4761e2.remoteconfig = Boolean.FALSE;
                c4761e2.subscription = Boolean.TRUE;
                c4761e2.f10191goto = 20;
                C1962e c1962e2 = new C1962e("vkx:root", new C14435e(c9466e2), null, new C15197e(c9457e2), new C12053e(c4761e2), c13325e2);
                Bundle bundle = Bundle.EMPTY;
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("android.media.browse.SEARCH_SUPPORTED", true);
                Unit unit = Unit.INSTANCE;
                C11753e c11753e2 = new C11753e(bundle2, false, false, false);
                C8802e.license(c1962e2);
                c8802e = new C8802e(0, SystemClock.elapsedRealtime(), c11753e2, null, c1962e2, 2);
            } else {
                C9466e c9466e3 = new C9466e();
                C2171e c2171e3 = AbstractC17475e.f34223e;
                C1410e c1410e4 = C1410e.f4222e;
                List list3 = Collections.EMPTY_LIST;
                C9457e c9457e3 = new C9457e();
                C13325e c13325e3 = C13325e.license;
                C4761e c4761e3 = new C4761e();
                c4761e3.subscription = Boolean.TRUE;
                c4761e3.remoteconfig = Boolean.FALSE;
                c4761e3.f10191goto = 20;
                C1962e c1962e3 = new C1962e("vkx:sysRecents", new C14435e(c9466e3), null, new C15197e(c9457e3), new C12053e(c4761e3), c13325e3);
                C11753e c11753e3 = new C11753e(Bundle.EMPTY, true, false, false);
                C8802e.license(c1962e3);
                c8802e = new C8802e(0, SystemClock.elapsedRealtime(), c11753e3, null, c1962e3, 2);
            }
            c8802e2 = c8802e;
        } else {
            c8802e2 = C8802e.vip(-6);
        }
        return AbstractC2017e.license(c8802e2);
    }

    public final boolean license(KeyEvent keyEvent, boolean z, boolean z2) {
        RunnableC4936e runnableC4936e;
        C18424e startapp = this.mopub.ad.startapp();
        startapp.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z) {
            keyCode = 87;
        }
        if (keyCode != 79) {
            if (keyCode == 126) {
                runnableC4936e = new RunnableC4936e(this, startapp, 8);
            } else if (keyCode != 127) {
                if (keyCode != 272) {
                    if (keyCode != 273) {
                        switch (keyCode) {
                            case 85:
                                break;
                            case 86:
                                runnableC4936e = new RunnableC4936e(this, startapp, 5);
                                break;
                            case 87:
                                break;
                            case 88:
                                break;
                            case 89:
                                runnableC4936e = new RunnableC4936e(this, startapp, 4);
                                break;
                            case 90:
                                runnableC4936e = new RunnableC4936e(this, startapp, 3);
                                break;
                            default:
                                return false;
                        }
                    }
                    runnableC4936e = new RunnableC4936e(this, startapp, 2);
                }
                runnableC4936e = new RunnableC4936e(this, startapp, 1);
            } else {
                runnableC4936e = new RunnableC4936e(this, startapp, 9);
            }
            AbstractC9413e.m2565strictfp(this.advert, new RunnableC8044e(this, z2, startapp, runnableC4936e, 2));
            return true;
        }
        runnableC4936e = this.pro.mo2129interface() ? new RunnableC4936e(this, startapp, 6) : new RunnableC4936e(this, startapp, 7);
        AbstractC9413e.m2565strictfp(this.advert, new RunnableC8044e(this, z2, startapp, runnableC4936e, 2));
        return true;
    }

    public final boolean loadAd() {
        boolean z;
        synchronized (this.ad) {
            z = this.isPro;
        }
        return z;
    }

    public final void mopub(C5298e c5298e) {
        this.metrica.ad(false, false);
        yandex(new C8881e(c5298e));
        try {
            C9156e c9156e = this.yandex.adcel;
            C5251e c5251e = this.remoteconfig.remoteconfig;
            c9156e.Signature();
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    /* renamed from: native, reason: not valid java name */
    public final C18424e m2208native(C18424e c18424e) {
        if (!this.ads || !Signature(c18424e)) {
            return c18424e;
        }
        C18424e startapp = startapp();
        startapp.getClass();
        return startapp;
    }

    public final void premium(C18424e c18424e) {
        if (this.ads && Signature(c18424e)) {
            return;
        }
        List list = (List) this.appmetrica.license.get();
        AbstractC2301e.amazon(list, "layout must not be null");
        C6584e c6584e = this.mopub.ad;
        AbstractC17475e remoteconfig = AbstractC17475e.remoteconfig(list);
        if (c6584e.amazon(c18424e)) {
            C5537e c5537e = c6584e.yandex;
            c5537e.inmobi = remoteconfig;
            c5537e.m1934static(c6584e.pro);
        }
        c6584e.purchase(c18424e, new C11867e(remoteconfig, 1));
    }

    public final ListenableFuture pro(C18424e c18424e, C11858e c11858e, Bundle bundle) {
        ListenableFuture appmetrica;
        m2208native(c18424e);
        C1439e c1439e = this.appmetrica;
        c1439e.getClass();
        if (c11858e.vip.length() == 0) {
            appmetrica = AbstractC2017e.license(C1439e.ad());
        } else {
            C14826e c14826e = c1439e.ad;
            C15420e c15420e = AbstractC6731e.ad;
            appmetrica = AbstractC8461e.appmetrica(2, AbstractC1497e.ad, c14826e, new C7914e(c1439e, c11858e, bundle, null, 11));
        }
        AbstractC2301e.amazon(appmetrica, "Callback.onCustomCommandOnHandler must return non-null future");
        return appmetrica;
    }

    public final ListenableFuture purchase(C18424e c18424e, InterfaceC15046e interfaceC15046e) {
        int i;
        ListenableFuture listenableFuture;
        BinderC17428e binderC17428e = this.billing;
        try {
            C18100e m3000break = binderC17428e.license.m3000break(c18424e);
            if (m3000break != null) {
                C8342e license = m3000break.license(f13588native);
                i = license.f17075e;
                listenableFuture = license;
            } else {
                if (!smaato(c18424e)) {
                    return AbstractC2017e.license(new C9759e(-100));
                }
                i = 0;
                listenableFuture = AbstractC2017e.license(new C9759e(0));
            }
            InterfaceC10645e interfaceC10645e = c18424e.license;
            if (interfaceC10645e != null) {
                interfaceC15046e.appmetrica(interfaceC10645e, i);
            }
            return listenableFuture;
        } catch (DeadObjectException unused) {
            binderC17428e.license.m3020static(c18424e);
            return AbstractC2017e.license(new C9759e(-100));
        } catch (RemoteException e) {
            AbstractC2803e.amazon("MediaSessionImpl", "Exception in " + c18424e, e);
            return AbstractC2017e.license(new C9759e(-1));
        }
    }

    public final C9069e remoteconfig(C18424e c18424e) {
        AbstractC17475e abstractC17475e;
        boolean z = this.ads;
        AbstractC17475e abstractC17475e2 = null;
        C5537e c5537e = this.yandex;
        if (z && Signature(c18424e)) {
            c5537e.getClass();
            C6689e c6689e = C9069e.appmetrica;
            C6689e c6689e2 = c5537e.applovin;
            c6689e2.getClass();
            C5298e c5298e = c5537e.ads;
            c5298e.getClass();
            if (c5537e.isPro.isEmpty()) {
                AbstractC17475e abstractC17475e3 = c5537e.inmobi;
                AbstractC17475e remoteconfig = abstractC17475e3 == null ? null : AbstractC17475e.remoteconfig(abstractC17475e3);
                abstractC17475e = null;
                abstractC17475e2 = remoteconfig;
            } else {
                AbstractC17475e abstractC17475e4 = c5537e.isPro;
                abstractC17475e = abstractC17475e4 == null ? null : AbstractC17475e.remoteconfig(abstractC17475e4);
            }
            return new C9069e(c6689e2, c5298e, abstractC17475e2, abstractC17475e);
        }
        this.appmetrica.getClass();
        C5298e c5298e2 = C9069e.purchase;
        C6689e c6689e3 = C9069e.appmetrica;
        c6689e3.getClass();
        HashSet hashSet = new HashSet(c6689e3.ad);
        C11858e c11858e = AbstractC6826e.vip;
        c11858e.getClass();
        hashSet.add(c11858e);
        C11858e c11858e2 = AbstractC6826e.ad;
        c11858e2.getClass();
        hashSet.add(c11858e2);
        C6689e c6689e4 = new C6689e(hashSet);
        C9069e c9069e = new C9069e(c6689e4, c5298e2, null, null);
        if (amazon(c18424e)) {
            this.ads = true;
            C4748e c4748e = this.mopub;
            AbstractC17475e abstractC17475e5 = c4748e.ad.subs;
            if (abstractC17475e5.isEmpty()) {
                c5537e.inmobi = c4748e.ad.premium;
            } else {
                c5537e.isPro = abstractC17475e5;
                c5537e.m1929instanceof();
            }
            C6584e c6584e = c5537e.yandex;
            int i = 0;
            boolean z2 = c5537e.ads.ad(17) != c5298e2.ad(17);
            c5537e.applovin = c6689e4;
            c5537e.ads = c5298e2;
            if (!c5537e.isPro.isEmpty()) {
                c5537e.m1929instanceof();
            }
            if (z2) {
                AbstractC9413e.m2565strictfp(c6584e.advert, new RunnableC1013e(c5537e, c6584e.pro, i));
                return c9069e;
            }
            c5537e.m1934static(c6584e.pro);
        }
        return c9069e;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [eٌّؒ, eٔؐۜ] */
    public final ListenableFuture signatures(C18424e c18424e, String str, int i, int i2, final C11753e c11753e) {
        boolean equals = Objects.equals(str, "androidx.media3.session.recent.root");
        final int i3 = 0;
        InterfaceC5083e interfaceC5083e = null;
        C1439e c1439e = this.f13589class;
        if (!equals) {
            m2208native(c18424e);
            C8724e appmetrica = AbstractC8461e.appmetrica(3, null, c1439e.ad, new C17781e(c1439e, str, i, i2, c11753e, null, 0));
            appmetrica.f17595e.ad(new RunnableC6835e(this, appmetrica, c18424e, i2, 0), new ExecutorC11760e(this, 0));
            return appmetrica;
        }
        if (this.yandex.Signature == null) {
            return AbstractC2017e.license(C8802e.vip(-6));
        }
        final int i4 = 1;
        if (this.pro.billing() == 1) {
            if (this.ads) {
                startapp().getClass();
            }
            C8724e appmetrica2 = AbstractC8461e.appmetrica(3, null, c1439e.ad, new C17071e(c1439e, interfaceC5083e, 11));
            InterfaceC8223e interfaceC8223e = new InterfaceC8223e() { // from class: eْ۠ٝ
                @Override // defpackage.InterfaceC8223e
                public final Object apply(Object obj) {
                    switch (i4) {
                        case 0:
                            AbstractC2803e.billing("MediaSessionImpl", "Failed fetching recent media item at boot time.", (Throwable) obj);
                            return new C8802e(-1, SystemClock.elapsedRealtime(), c11753e, new C4960e("no error message provided", -1, Bundle.EMPTY), null, 4);
                        default:
                            return C6584e.vip(c11753e, (C9035e) obj);
                    }
                }
            };
            EnumC3320e enumC3320e = EnumC3320e.f7489e;
            C9590e purchase = AbstractC2017e.purchase(appmetrica2, interfaceC8223e, enumC3320e);
            InterfaceC8223e interfaceC8223e2 = new InterfaceC8223e() { // from class: eْ۠ٝ
                @Override // defpackage.InterfaceC8223e
                public final Object apply(Object obj) {
                    switch (i3) {
                        case 0:
                            AbstractC2803e.billing("MediaSessionImpl", "Failed fetching recent media item at boot time.", (Throwable) obj);
                            return new C8802e(-1, SystemClock.elapsedRealtime(), c11753e, new C4960e("no error message provided", -1, Bundle.EMPTY), null, 4);
                        default:
                            return C6584e.vip(c11753e, (C9035e) obj);
                    }
                }
            };
            int i5 = AbstractRunnableC15090e.f29871e;
            AbstractRunnableC15090e abstractRunnableC15090e = new AbstractRunnableC15090e(purchase, Throwable.class, interfaceC8223e2);
            purchase.ad(abstractRunnableC15090e, AbstractC3697e.billing(enumC3320e, abstractRunnableC15090e));
            return abstractRunnableC15090e;
        }
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        C4761e c4761e = new C4761e();
        c4761e.subscription = Boolean.FALSE;
        c4761e.remoteconfig = Boolean.TRUE;
        return AbstractC2017e.license(C8802e.metrica(AbstractC17475e.ads(new C1962e("androidx.media3.session.recent.item", new C14435e(c9466e), null, new C15197e(c9457e), new C12053e(c4761e), c13325e)), c11753e));
    }

    public final boolean smaato(C18424e c18424e) {
        ServiceC13230e serviceC13230e;
        if (this.billing.license.m3002catch(c18424e) || this.yandex.billing.m3002catch(c18424e)) {
            return true;
        }
        synchronized (this.ad) {
            serviceC13230e = this.inmobi;
        }
        return serviceC13230e != null && serviceC13230e.f26254e.m3002catch(c18424e);
    }

    public final C18424e startapp() {
        AbstractC17475e m3014native = this.billing.license.m3014native();
        for (int i = 0; i < m3014native.size(); i++) {
            C18424e c18424e = (C18424e) m3014native.get(i);
            if (amazon(c18424e)) {
                return c18424e;
            }
        }
        return null;
    }

    public final C8724e subs(C18424e c18424e, String str, C11753e c11753e) {
        C18424e m2208native = m2208native(c18424e);
        C8724e appmetrica = AbstractC8461e.appmetrica(3, null, this.f13589class.ad, new C12203e(this.firebase, m2208native, str, c11753e, null, 4));
        appmetrica.f17595e.ad(new RunnableC2615e(this, appmetrica, c18424e, 1), new ExecutorC11760e(this, 0));
        return appmetrica;
    }

    public final ListenableFuture subscription(C18424e c18424e, List list) {
        m2208native(c18424e);
        C1439e c1439e = this.appmetrica;
        C8724e appmetrica = AbstractC8461e.appmetrica(2, AbstractC6731e.ad, c1439e.ad, new C16373e(c1439e, list, null, 6));
        AbstractC2301e.amazon(appmetrica, "Callback.onAddMediaItems must return a non-null future");
        return appmetrica;
    }

    public final C8724e tapsense(C18424e c18424e) {
        m2208native(c18424e);
        C8724e appmetrica = AbstractC8461e.appmetrica(3, null, this.f13589class.ad, new C14641e(2, 15, null));
        appmetrica.f17595e.ad(new RunnableC2615e(this, appmetrica, c18424e, 0), new ExecutorC11760e(this, 0));
        return appmetrica;
    }

    /* renamed from: this, reason: not valid java name */
    public final synchronized void m2209this(C18424e c18424e, String str) {
        InterfaceC10645e interfaceC10645e = c18424e.license;
        interfaceC10645e.getClass();
        this.f13591interface.remove(str, c18424e);
        this.f13590goto.remove(interfaceC10645e, str);
    }

    /* renamed from: while, reason: not valid java name */
    public final void m2210while() {
        if (Looper.myLooper() != this.advert.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }

    public final void yandex(InterfaceC15046e interfaceC15046e) {
        AbstractC17475e m3014native = this.billing.license.m3014native();
        for (int i = 0; i < m3014native.size(); i++) {
            billing((C18424e) m3014native.get(i), interfaceC15046e);
        }
        try {
            interfaceC15046e.appmetrica(this.yandex.adcel, 0);
        } catch (RemoteException e) {
            AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }
}
