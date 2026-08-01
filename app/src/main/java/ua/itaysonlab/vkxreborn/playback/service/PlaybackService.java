package com.werhes.museeksreborn.playback.service;

import android.animation.ValueAnimator;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import defpackage.AbstractC0003e;
import defpackage.AbstractC0223e;
import defpackage.AbstractC11130e;
import defpackage.AbstractC11575e;
import defpackage.AbstractC12026e;
import defpackage.AbstractC13461e;
import defpackage.AbstractC13688e;
import defpackage.AbstractC14114e;
import defpackage.AbstractC14204e;
import defpackage.AbstractC14966e;
import defpackage.AbstractC1497e;
import defpackage.AbstractC15390e;
import defpackage.AbstractC15448e;
import defpackage.AbstractC16048e;
import defpackage.AbstractC16049e;
import defpackage.AbstractC16524e;
import defpackage.AbstractC1660e;
import defpackage.AbstractC17475e;
import defpackage.AbstractC2301e;
import defpackage.AbstractC2803e;
import defpackage.AbstractC4608e;
import defpackage.AbstractC5097e;
import defpackage.AbstractC5336e;
import defpackage.AbstractC5797e;
import defpackage.AbstractC6232e;
import defpackage.AbstractC6731e;
import defpackage.AbstractC6826e;
import defpackage.AbstractC6874e;
import defpackage.AbstractC7535e;
import defpackage.AbstractC7890e;
import defpackage.AbstractC9413e;
import defpackage.AbstractC9743e;
import defpackage.AbstractServiceC5667e;
import defpackage.BinderC12883e;
import defpackage.C0007e;
import defpackage.C0381e;
import defpackage.C0990e;
import defpackage.C10312e;
import defpackage.C10530e;
import defpackage.C10954e;
import defpackage.C11106e;
import defpackage.C11165e;
import defpackage.C11241e;
import defpackage.C11318e;
import defpackage.C11380e;
import defpackage.C11389e;
import defpackage.C11399e;
import defpackage.C11476e;
import defpackage.C11689e;
import defpackage.C1169e;
import defpackage.C11800e;
import defpackage.C11858e;
import defpackage.C11867e;
import defpackage.C12318e;
import defpackage.C12490e;
import defpackage.C12769e;
import defpackage.C12781e;
import defpackage.C12894e;
import defpackage.C12940e;
import defpackage.C13572e;
import defpackage.C13664e;
import defpackage.C13765e;
import defpackage.C1410e;
import defpackage.C14136e;
import defpackage.C1439e;
import defpackage.C14609e;
import defpackage.C14641e;
import defpackage.C14648e;
import defpackage.C14751e;
import defpackage.C14803e;
import defpackage.C14826e;
import defpackage.C14863e;
import defpackage.C15113e;
import defpackage.C1511e;
import defpackage.C15420e;
import defpackage.C15574e;
import defpackage.C1586e;
import defpackage.C16150e;
import defpackage.C16903e;
import defpackage.C16911e;
import defpackage.C17148e;
import defpackage.C17510e;
import defpackage.C17519e;
import defpackage.C17642e;
import defpackage.C17790e;
import defpackage.C17825e;
import defpackage.C18183e;
import defpackage.C18287e;
import defpackage.C18424e;
import defpackage.C18464e;
import defpackage.C2171e;
import defpackage.C2271e;
import defpackage.C2399e;
import defpackage.C2584e;
import defpackage.C3032e;
import defpackage.C3446e;
import defpackage.C3516e;
import defpackage.C4013e;
import defpackage.C4174e;
import defpackage.C4397e;
import defpackage.C4748e;
import defpackage.C4891e;
import defpackage.C5363e;
import defpackage.C5840e;
import defpackage.C5981e;
import defpackage.C6029e;
import defpackage.C6572e;
import defpackage.C6584e;
import defpackage.C6594e;
import defpackage.C6751e;
import defpackage.C6846e;
import defpackage.C7460e;
import defpackage.C7755e;
import defpackage.C7838e;
import defpackage.C8086e;
import defpackage.C8156e;
import defpackage.C9335e;
import defpackage.C9690e;
import defpackage.C9759e;
import defpackage.EnumC10286e;
import defpackage.EnumC14621e;
import defpackage.EnumC5115e;
import defpackage.EnumC7785e;
import defpackage.ExecutorC3603e;
import defpackage.InterfaceC10136e;
import defpackage.InterfaceC10488e;
import defpackage.InterfaceC14343e;
import defpackage.InterfaceC14776e;
import defpackage.InterfaceC16843e;
import defpackage.InterfaceC1686e;
import defpackage.InterfaceC3974e;
import defpackage.InterfaceC4342e;
import defpackage.InterfaceC5083e;
import defpackage.InterfaceC8467e;
import defpackage.InterfaceC9640e;
import defpackage.RunnableC12991e;
import defpackage.RunnableC16019e;
import defpackage.RunnableC2783e;
import defpackage.RunnableC6303e;
import defpackage.RunnableC6666e;
import defpackage.RunnableC7410e;
import defpackage.ServiceC13230e;
import defpackage.crashlytics;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import com.werhes.museeks.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lua/itaysonlab/vkxreborn/playback/service/PlaybackService;", "Landroid/os/Handler$Callback;", "<init>", "()V", "eٙۢ", "eّۨؒ", "orbitplayback_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaybackService extends AbstractServiceC5667e implements Handler.Callback {

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final /* synthetic */ int f36732e = 0;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C11165e f36733e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C14826e f36734e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C11380e f36735e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Handler f36737e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C5363e f36738e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C1511e f36739e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public List f36740e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C5363e f36742e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C18464e f36743e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C18183e f36744e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f36745e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public RunnableC12991e f36746e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C1439e f36747e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C5363e f36748e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public BinderC12883e f36749e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public C4748e f36750e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C6572e[] f36752e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C6594e f36754e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C5363e f36755e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f36741e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Handler f36736e = new Handler(Looper.getMainLooper());

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C2271e f36753e = new C17519e(0);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C6029e f36751e = new C6029e(this);

    /* JADX WARN: Type inference failed for: r0v2, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r17v0, types: [eؘِؒ, eؚۛۖ] */
    public PlaybackService() {
        Looper mainLooper = Looper.getMainLooper();
        String str = AbstractC9413e.ad;
        this.f36737e = new Handler(mainLooper, this);
        C11380e ad = AbstractC5097e.ad();
        this.f36735e = ad;
        C15420e c15420e = AbstractC6731e.ad;
        C12940e c12940e = AbstractC1497e.ad;
        c12940e.getClass();
        C14826e ad2 = AbstractC9743e.ad(AbstractC5797e.vip(c12940e, ad));
        this.f36734e = ad2;
        this.f36744e = new C18183e(this);
        this.f36742e = new C5363e(new C0007e(this, 2));
        this.f36740e = C13664e.f27089e;
        this.f36748e = new C5363e(new C0007e(this, 3));
        this.f36755e = new C5363e(new C0007e(this, 4));
        this.f36738e = new C5363e(new C0007e(this, 5));
        int i = 0;
        int i2 = 0;
        this.f36747e = new C1439e(ad2, new C12781e(0, 10, PlaybackService.class, this, "playbackController", "getPlaybackController()Lua/itaysonlab/vkxreborn/playback/PlaybackControllerImpl;"), new C12781e(0, 11, PlaybackService.class, this, "playlistHolder", "getPlaylistHolder()Lua/itaysonlab/vkxreborn/playback/service/AppPlaylistHolder;"), new C17642e(0, 1, PlaybackService.class, this, "customLayout", "getCustomLayout()Ljava/util/List;"), new C11476e(1, this, PlaybackService.class, "updateLayout", "updateLayout(Ljava/lang/Boolean;)V", i2, i, 26), new C9335e(3, this, PlaybackService.class, "onCustomCommand", "onCustomCommand(Landroidx/media3/session/SessionCommand;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i2, i, 13), new C11476e(1, this, PlaybackService.class, "onPlaybackResumption", "onPlaybackResumption(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i2, i, 27), new C7460e(5, advert().f15859e, InterfaceC9640e.class, "search", "search(Ljava/lang/String;IILandroidx/media3/session/MediaLibraryService$LibraryParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0));
        this.f36752e = new C6572e[2];
    }

    public static C7838e advert() {
        C12894e c12894e = C7838e.f15858e;
        if (c12894e == null) {
            c12894e = null;
        }
        return (C7838e) ((C14136e) c12894e.f25751e).invoke();
    }

    public static C18424e billing(Intent intent) {
        ComponentName component = intent.getComponent();
        String packageName = component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService";
        Bundle bundle = new Bundle();
        bundle.putString("androidx.media3.session.hint.controller_info_type", "android.intent.action.MEDIA_BUTTON");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            bundle.putBundle("androidx.media3.session.hint.intent_extras", extras);
        }
        Uri data = intent.getData();
        if (data != null) {
            C9759e c9759e = C6584e.f13588native;
            List<String> pathSegments = data.getPathSegments();
            bundle.putString("androidx.media3.session.hint.session_id", (Objects.equals(data.getScheme(), "androidx") && Objects.equals(data.getAuthority(), "media3.session") && !pathSegments.isEmpty()) ? pathSegments.get(0) : BuildConfig.FLAVOR);
        }
        return new C18424e(new C18287e(packageName, -1, -1), 1010000300, 9, false, null, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void license(PlaybackService playbackService, InterfaceC16843e interfaceC16843e) {
        playbackService.getClass();
        C14826e c14826e = playbackService.f36734e;
        try {
            C1511e c1511e = playbackService.f36739e;
            C1511e c1511e2 = null;
            Object[] objArr = 0;
            if (c1511e == null) {
                c1511e = null;
            }
            c1511e.startapp = false;
            C14609e yandex = advert().f15868e.yandex(Integer.valueOf(interfaceC16843e.mo2115e()));
            if (yandex == null) {
                return;
            }
            AbstractC16049e abstractC16049e = yandex.vip;
            InterfaceC14776e interfaceC14776e = abstractC16049e instanceof InterfaceC14776e ? (InterfaceC14776e) abstractC16049e : null;
            if (interfaceC14776e != null && interfaceC14776e.ad()) {
                interfaceC16843e.mo2080e();
                return;
            }
            C14609e yandex2 = advert().f15868e.yandex(Integer.valueOf(interfaceC16843e.mo2062break()));
            AbstractC16049e abstractC16049e2 = yandex2 != null ? yandex2.vip : null;
            C14609e yandex3 = advert().f15868e.yandex(Integer.valueOf(interfaceC16843e.mo2100e()));
            AbstractC16049e abstractC16049e3 = yandex3 != null ? yandex3.vip : null;
            if (((Boolean) AbstractC16524e.mopub.ad()).booleanValue()) {
                advert().f15875e.ad(abstractC16049e);
            }
            Iterator it = advert().f15866e.iterator();
            while (it.hasNext()) {
                ((InterfaceC3974e) it.next()).ad(abstractC16049e, abstractC16049e2);
                Unit unit = Unit.INSTANCE;
            }
            InterfaceC10136e interfaceC10136e = abstractC16049e instanceof InterfaceC10136e ? (InterfaceC10136e) abstractC16049e : null;
            playbackService.m4747class(interfaceC10136e != null ? Boolean.valueOf(interfaceC10136e.getPurchase()) : null);
            int mo2088e = interfaceC16843e.mo2088e();
            int i = mo2088e - 1;
            int i2 = mo2088e - 6;
            int i3 = new C11241e(i2, i, 1).f22522e;
            int mo2115e = interfaceC16843e.mo2115e();
            if (i2 <= mo2115e && mo2115e <= i3 && interfaceC16843e.billing() != 1) {
                AbstractC5336e.purchase(c14826e, null, 0, new C0990e(playbackService, objArr == true ? 1 : 0, 7), 3);
            }
            C1511e c1511e3 = playbackService.f36739e;
            if (c1511e3 != null) {
                c1511e2 = c1511e3;
            }
            c1511e2.vip(new C3516e(abstractC16049e, 2));
            AbstractC6232e.billing(new C17510e(yandex, abstractC16049e2, abstractC16049e3, interfaceC16843e.mo2115e()), c14826e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(ua.itaysonlab.vkxreborn.playback.service.PlaybackService r7, defpackage.InterfaceC5083e r8) {
        /*
            eٔٛۤ r0 = r7.f36734e
            boolean r1 = r8 instanceof defpackage.C12472e
            if (r1 == 0) goto L15
            r1 = r8
            eّٔؓ r1 = (defpackage.C12472e) r1
            int r2 = r1.f24970e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f24970e = r2
            goto L1a
        L15:
            eّٔؓ r1 = new eّٔؓ
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.f24969e
            int r2 = r1.f24970e
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L34
            if (r2 != r6) goto L2c
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Throwable -> L2a
            goto L63
        L2a:
            r8 = move-exception
            goto L6f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.AbstractC2003e.purchase(r8)
            eٍٔٞ r8 = r7.mopub()
            r8.metrica = r6
            eٌؗؒ r8 = r7.f36750e
            if (r8 != 0) goto L42
            r8 = r5
        L42:
            r7.applovin(r8, r6)
            eًٍۘ r8 = advert()     // Catch: java.lang.Throwable -> L2a
            eؙٟ٘ r8 = r8.f15862e     // Catch: java.lang.Throwable -> L2a
            r1.f24970e = r6     // Catch: java.lang.Throwable -> L2a
            eَٖ۠ r8 = (defpackage.C10301e) r8     // Catch: java.lang.Throwable -> L2a
            r8.getClass()     // Catch: java.lang.Throwable -> L2a
            eّٕٓ r8 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Throwable -> L2a
            eّؔؔ r2 = new eّؔؔ     // Catch: java.lang.Throwable -> L2a
            r6 = 2
            r2.<init>(r6, r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = defpackage.AbstractC5336e.advert(r8, r2, r1)     // Catch: java.lang.Throwable -> L2a
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r8 != r1) goto L63
            return r1
        L63:
            eٌ۠ۦ r8 = (defpackage.C9035e) r8     // Catch: java.lang.Throwable -> L2a
            eٍُؒ r1 = new eٍُؒ
            r2 = 2
            r1.<init>(r7, r5, r2)
            defpackage.AbstractC5336e.purchase(r0, r5, r3, r1, r4)
            return r8
        L6f:
            eٍُؒ r1 = new eٍُؒ
            r2 = 2
            r1.<init>(r7, r5, r2)
            defpackage.AbstractC5336e.purchase(r0, r5, r3, r1, r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.playback.service.PlaybackService.metrica(ua.itaysonlab.vkxreborn.playback.service.PlaybackService, eًؗۖ):java.lang.Object");
    }

    public final IBinder Signature(Intent intent) {
        String action;
        C4748e tapsense;
        ServiceC13230e serviceC13230e;
        String str = AbstractC9413e.ad;
        super.onBind(intent);
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            BinderC12883e binderC12883e = this.f36749e;
            binderC12883e.getClass();
            return binderC12883e;
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (tapsense = tapsense(new C18424e(new C18287e("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY))) == null) {
            return null;
        }
        appmetrica(tapsense);
        C6584e c6584e = tapsense.ad;
        synchronized (c6584e.ad) {
            try {
                if (c6584e.inmobi == null) {
                    C13765e c13765e = ((C2584e) c6584e.yandex.amazon.f26645e).metrica;
                    ServiceC13230e serviceC13230e2 = new ServiceC13230e(c6584e);
                    serviceC13230e2.metrica(c13765e);
                    c6584e.inmobi = serviceC13230e2;
                }
                serviceC13230e = c6584e.inmobi;
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceC13230e.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [eؔۨٓ] */
    public final C11165e adcel(C14863e c14863e) {
        if (this.f36733e == null) {
            if (c14863e == null) {
                AbstractC2301e.amazon(getBaseContext(), "Accessing service context before onCreate()");
                C0381e c0381e = new C0381e(getApplicationContext());
                AbstractC2301e.subscription(!c0381e.metrica);
                ?? c3032e = new C3032e(c0381e);
                c0381e.metrica = true;
                c14863e = c3032e;
            }
            if (this.f36754e == null) {
                this.f36754e = new C6594e(10, this);
            }
            this.f36733e = new C11165e(this, c14863e, this.f36754e);
        }
        return this.f36733e;
    }

    public final IBinder admob(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!"androidx.media3.session.MediaLibraryService".equals(intent.getAction())) {
            return Signature(intent);
        }
        BinderC12883e binderC12883e = this.f36749e;
        binderC12883e.getClass();
        return binderC12883e;
    }

    public final boolean ads(C4748e c4748e, boolean z) {
        try {
            applovin(c4748e, adcel(null).metrica(z));
            return true;
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !AbstractC16048e.remoteconfig(e)) {
                throw e;
            }
            AbstractC2803e.billing("MSessionService", "Failed to start foreground", e);
            this.f36736e.post(new RunnableC2783e(20, this));
            return false;
        }
    }

    public final C15113e amazon() {
        return (C15113e) this.f36738e.getValue();
    }

    public final void applovin(C4748e c4748e, boolean z) {
        AbstractC17475e abstractC17475e;
        C11165e adcel = adcel(null);
        PlaybackService playbackService = adcel.f22421e;
        if (!playbackService.loadAd(c4748e) || !adcel.license(c4748e)) {
            String str = AbstractC9413e.ad;
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC12026e.ad(playbackService, true);
            } else {
                playbackService.stopForeground(true);
            }
            if (adcel.f22418e != null) {
                adcel.f22411e.cancel(1001);
                adcel.f22412e++;
                adcel.f22418e = null;
                return;
            }
            return;
        }
        int i = adcel.f22412e + 1;
        adcel.f22412e = i;
        C12318e vip = adcel.vip(c4748e);
        vip.getClass();
        vip.metrica();
        InterfaceC10488e interfaceC10488e = vip.f24700e;
        if (interfaceC10488e.mo1580e()) {
            abstractC17475e = interfaceC10488e.mo1532e();
        } else {
            C2171e c2171e = AbstractC17475e.f34223e;
            abstractC17475e = C1410e.f4222e;
        }
        AbstractC9413e.m2565strictfp(new Handler(c4748e.ad().mo3030e()), new RunnableC6666e(0, adcel, c4748e, abstractC17475e, new C17825e(adcel, i, c4748e), z));
    }

    public final void appmetrica(C4748e c4748e) {
        C4748e c4748e2;
        boolean z = true;
        AbstractC2301e.yandex(!c4748e.ad.loadAd(), "session is already released");
        synchronized (this.f36741e) {
            c4748e2 = (C4748e) this.f36753e.get(c4748e.ad.startapp);
            if (c4748e2 != null && c4748e2 != c4748e) {
                z = false;
            }
            AbstractC2301e.yandex(z, "Session ID should be unique");
            this.f36753e.put(c4748e.ad.startapp, c4748e);
        }
        if (c4748e2 == null) {
            AbstractC9413e.m2565strictfp(this.f36736e, new RunnableC6303e(this, c4748e, 0));
        }
    }

    /* renamed from: class, reason: not valid java name */
    public final void m4747class(Boolean bool) {
        C14609e vip;
        AbstractC16049e abstractC16049e;
        C1169e license = AbstractC6874e.license();
        if (!((Boolean) AbstractC16524e.yandex.ad()).booleanValue()) {
            C11858e c11858e = AbstractC6826e.ad;
            Context applicationContext = getApplicationContext();
            C12769e c12769e = new C12769e(0);
            c12769e.license = R.drawable.op_action_stop;
            c12769e.license(AbstractC6826e.ad);
            c12769e.purchase = applicationContext.getString(R.string.op_action_stop);
            license.add(c12769e.ad());
        }
        if (bool != null && ((vip = advert().vip()) == null || (abstractC16049e = vip.vip) == null || !AbstractC13461e.purchase(abstractC16049e))) {
            if (!bool.booleanValue()) {
                C11858e c11858e2 = AbstractC6826e.ad;
                Context applicationContext2 = getApplicationContext();
                C12769e c12769e2 = new C12769e(59517);
                c12769e2.license(AbstractC6826e.vip);
                c12769e2.purchase = applicationContext2.getString(R.string.op_action_to_library);
                license.add(c12769e2.ad());
            } else if (!((Boolean) AbstractC16524e.billing.ad()).booleanValue()) {
                C11858e c11858e3 = AbstractC6826e.ad;
                Context applicationContext3 = getApplicationContext();
                C12769e c12769e3 = new C12769e(1042557);
                c12769e3.license(AbstractC6826e.vip);
                c12769e3.purchase = applicationContext3.getString(R.string.op_action_to_library_remove);
                license.add(c12769e3.ad());
            }
        }
        C1169e metrica = AbstractC6874e.metrica(license);
        this.f36740e = metrica;
        C4748e c4748e = this.f36750e;
        if (c4748e == null) {
            c4748e = null;
        }
        c4748e.getClass();
        AbstractC2301e.amazon(metrica, "layout must not be null");
        C6584e c6584e = c4748e.ad;
        AbstractC17475e remoteconfig = AbstractC17475e.remoteconfig(metrica);
        c6584e.premium = remoteconfig;
        c6584e.yandex.inmobi = remoteconfig;
        c6584e.yandex(new C11867e(remoteconfig, 0));
    }

    public final void crashlytics(C4748e c4748e) {
        synchronized (this.f36741e) {
            AbstractC2301e.yandex(this.f36753e.containsKey(c4748e.ad.startapp), "session not found");
            this.f36753e.remove(c4748e.ad.startapp);
        }
        AbstractC9413e.m2565strictfp(this.f36736e, new RunnableC6303e(this, c4748e, 1));
    }

    public final void firebase() {
        C11165e adcel = adcel(null);
        AbstractC9413e.remoteconfig(adcel.f22411e, adcel.f22420e.ad().f30389e);
        C11389e c11389e = new C11389e(this, "default_channel_id");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            c11389e.inmobi = 2;
        }
        c11389e.appmetrica(8, true);
        c11389e.applovin.icon = R.drawable.media3_notification_small_icon;
        c11389e.tapsense = -1;
        c11389e.appmetrica(2, false);
        Pair pair = new Pair(20938, c11389e.vip());
        int intValue = ((Integer) pair.first).intValue();
        Notification notification = (Notification) pair.second;
        if (i >= 29) {
            AbstractC14204e.m3767break(this, intValue, notification);
        } else {
            startForeground(intValue, notification);
        }
        adcel(null).ad();
        if (i >= 24) {
            AbstractC12026e.ad(this, true);
        } else {
            stopForeground(true);
        }
        stopSelf();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        AbstractC5336e.purchase(this.f36734e, null, 0, new C0990e(this, null, 5), 3);
        this.f36737e.sendEmptyMessageDelayed(1, 60000L);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int inmobi(android.content.Intent r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.playback.service.PlaybackService.inmobi(android.content.Intent, int, int):int");
    }

    public final void isPro(Intent intent) {
        if (adcel(null).f22410e) {
            ArrayList smaato = smaato();
            for (int i = 0; i < smaato.size(); i++) {
                if (((C4748e) smaato.get(i)).ad().mo2108e()) {
                    return;
                }
            }
        }
        premium();
    }

    public final int isVip(Intent intent, int i, int i2) {
        inmobi(intent, i, i2);
        return 1;
    }

    public final boolean loadAd(C4748e c4748e) {
        boolean containsKey;
        synchronized (this.f36741e) {
            containsKey = this.f36753e.containsKey(c4748e.ad.startapp);
        }
        return containsKey;
    }

    public final C14863e mopub() {
        return (C14863e) this.f36742e.getValue();
    }

    @Override // defpackage.AbstractServiceC5667e, android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f36751e.pro(EnumC14621e.ON_START);
        return admob(intent);
    }

    @Override // defpackage.AbstractServiceC5667e, android.app.Service
    public final void onCreate() {
        int i;
        C15113e amazon;
        Object obj;
        Method method;
        subscription();
        C12490e purchase = purchase();
        C12490e purchase2 = purchase();
        Context applicationContext = getApplicationContext();
        InterfaceC8467e interfaceC8467e = advert().f15861e;
        C0007e c0007e = new C0007e(this, 0);
        C14826e c14826e = this.f36734e;
        C6572e c6572e = new C6572e(purchase, applicationContext, c14826e, interfaceC8467e, c0007e);
        C6572e[] c6572eArr = this.f36752e;
        c6572eArr[0] = c6572e;
        int i2 = 1;
        c6572eArr[1] = new C6572e(purchase2, getApplicationContext(), c14826e, advert().f15861e, new C0007e(this, i2));
        Iterator it = AbstractC1660e.isPro(c6572eArr).iterator();
        while (it.hasNext()) {
            ((C6572e) it.next()).yandex();
        }
        C18464e c18464e = new C18464e(purchase);
        this.f36743e = c18464e;
        c18464e.mo2133protected(this.f36744e);
        C18464e c18464e2 = this.f36743e;
        C1511e c1511e = new C1511e(c18464e2 == null ? null : c18464e2, purchase, purchase2, new C11689e(i2), new C7755e(0, this, PlaybackService.class, "onCrossfadeFinish", "onCrossfadeFinish()V", 0, 0, 9));
        this.f36739e = c1511e;
        C18464e c18464e3 = this.f36743e;
        if (c18464e3 == null) {
            c18464e3 = null;
        }
        c18464e3.f36190e = new C7755e(0, c1511e, C1511e.class, "onReset", "onReset$orbitplayback_release()V", 0, 0, 10);
        C18464e c18464e4 = this.f36743e;
        if (c18464e4 == null) {
            c18464e4 = null;
        }
        C9690e c9690e = new C9690e(this, c18464e4, this.f36747e);
        C12894e c12894e = C7838e.f15858e;
        if (c12894e == null) {
            c12894e = null;
        }
        PendingIntent pendingIntent = (PendingIntent) ((C14648e) c12894e.f25750e).invoke();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            AbstractC2301e.billing(AbstractC16048e.pro(pendingIntent));
        }
        pendingIntent.getClass();
        c9690e.appmetrica = pendingIntent;
        int i4 = 9;
        c9690e.yandex = new C16911e(i4, new C11106e(getApplicationContext(), c14826e, new C11476e(1, advert().f15868e, C11800e.class, "playbackItemByContentId", "playbackItemByContentId(Ljava/lang/String;)Lbruhcollective/itaysonlab/playback/PlaybackItem;", 0, 0, 25)));
        AbstractC2301e.subscription(!c9690e.loadAd);
        c9690e.loadAd = true;
        Object obj2 = C4748e.vip;
        int intValue = ((Integer) C6584e.f13587extends.get()).intValue();
        Context context = c9690e.ad;
        if (i3 < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        InterfaceC14343e interfaceC14343e = c9690e.yandex;
        if (interfaceC14343e == null) {
            crashlytics crashlyticsVar = new crashlytics(context);
            crashlyticsVar.f1117e = intValue;
            crashlyticsVar.f1118e = true;
            c9690e.yandex = new C16903e(crashlyticsVar);
        } else {
            c9690e.yandex = new C13572e(interfaceC14343e, intValue, 19);
        }
        if (i3 == 29) {
            InterfaceC14343e interfaceC14343e2 = c9690e.yandex;
            AtomicReference atomicReference = C9690e.Signature;
            C15574e c15574e = (C15574e) atomicReference.get();
            if (c15574e != null) {
                i = 6;
            } else {
                Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                int i5 = point2.y;
                int i6 = point2.x;
                i = 6;
                Point point3 = new Point(i5 - (i6 - point.x), i6 - (i5 - point.y));
                c15574e = new C15574e(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                atomicReference.set(c15574e);
            }
            c9690e.yandex = new C10312e(interfaceC14343e2, c15574e, 20);
        } else {
            i = 6;
        }
        c9690e.yandex = new C16911e(i4, c9690e.yandex);
        this.f36750e = new C4748e(c9690e.ad, c9690e.metrica, c9690e.vip, c9690e.appmetrica, c9690e.adcel, c9690e.mopub, c9690e.advert, c9690e.license, c9690e.purchase, c9690e.billing, c9690e.yandex, c9690e.startapp, c9690e.smaato, c9690e.amazon);
        InterfaceC5083e interfaceC5083e = null;
        int i7 = 0;
        C4397e c4397e = new C4397e(this, interfaceC5083e, i7);
        C5981e c5981e = AbstractC15448e.ad;
        C6029e c6029e = this.f36751e;
        C4891e c4891e = (C4891e) c6029e.f12699e;
        C4013e c4013e = AbstractC15448e.vip;
        C11318e c11318e = new C11318e(new C6751e(c4013e, i7), new C8086e(c4397e, interfaceC5083e, 12), 3);
        EnumC7785e enumC7785e = EnumC7785e.f15779e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        int i8 = 1;
        C4397e c4397e2 = new C4397e(this, interfaceC5083e, i8);
        C4891e c4891e2 = (C4891e) c6029e.f12699e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C6751e(c4013e, i8), new C8086e(c4397e2, interfaceC5083e, 14), 3), c4891e2, enumC7785e), AbstractC4608e.metrica(c4891e2));
        C10954e c10954e = new C10954e(this, interfaceC5083e, 8);
        C4891e c4891e3 = (C4891e) c6029e.f12699e;
        int i9 = 2;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C6751e(c4013e, i9), new C8086e(c10954e, interfaceC5083e, 16), 3), c4891e3, enumC7785e), AbstractC4608e.metrica(c4891e3));
        C14641e c14641e = new C14641e(i9, i, interfaceC5083e);
        C4891e c4891e4 = (C4891e) c6029e.f12699e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C6751e(c4013e, 3), new C8086e(c14641e, interfaceC5083e, 18), 3), c4891e4, enumC7785e), AbstractC4608e.metrica(c4891e4));
        C14863e mopub = mopub();
        mopub.getClass();
        AbstractC9413e.m2565strictfp(this.f36736e, new RunnableC7410e(this, mopub, 21));
        AbstractC5336e.purchase(c14826e, ExecutorC3603e.f8134e, 0, new C0990e(this, null, 0), 2);
        if (!((Boolean) AbstractC16524e.appmetrica.ad()).booleanValue() || (obj = (amazon = amazon()).metrica) == null || (method = amazon.ad) == null) {
            return;
        }
        try {
            method.invoke(amazon.vip, obj, null);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.AbstractServiceC5667e, android.app.Service
    public final void onDestroy() {
        Method method;
        pro();
        C7838e advert = advert();
        C12318e c12318e = advert.f15864e;
        if (c12318e != null) {
            c12318e.release();
        }
        advert.f15864e = null;
        Iterator it = AbstractC1660e.isPro(this.f36752e).iterator();
        while (it.hasNext()) {
            ((C6572e) it.next()).ad();
        }
        AbstractC1660e.inmobi(null, this.f36752e);
        C4748e c4748e = this.f36750e;
        if (c4748e == null) {
            c4748e = null;
        }
        c4748e.getClass();
        try {
            synchronized (C4748e.vip) {
                C4748e.metrica.remove(c4748e.ad.startapp);
            }
            c4748e.ad.m2206goto();
        } catch (Exception unused) {
        }
        c4748e.ad().mo2121e(this.f36744e);
        c4748e.ad().release();
        C1511e c1511e = this.f36739e;
        if (c1511e == null) {
            c1511e = null;
        }
        c1511e.vip(new C6846e(22, this));
        this.f36735e.Signature(null);
        C15113e amazon = amazon();
        if (amazon.metrica != null && (method = amazon.ad) != null) {
            try {
                method.invoke(amazon.vip, null, null);
            } catch (Exception unused2) {
            }
        }
        if (((Boolean) AbstractC16524e.mopub.ad()).booleanValue()) {
            advert().f15875e.vip();
        }
        advert().f15868e.metrica();
        advert().f15869e.invoke();
    }

    @Override // defpackage.AbstractServiceC5667e, android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f36751e.pro(EnumC14621e.ON_START);
        super.onStart(intent, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        EnumC10286e enumC10286e;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        AbstractC14966e.ad(AbstractC11575e.vip(this), 5, "onStartCommand intent = " + intent, null);
        int i3 = 4;
        int i4 = 3;
        if (AbstractC7890e.billing(intent != null ? intent.getAction() : null, AbstractC13688e.ad)) {
            int ordinal = ((EnumC5115e) EnumC5115e.f10978e.get(intent.getIntExtra("cmd", 0))).ordinal();
            if (ordinal == 0) {
                AbstractC13688e.ad().smaato();
            } else if (ordinal == 1) {
                AbstractC13688e.ad().adcel();
            } else if (ordinal != 2) {
                int i5 = 7;
                if (ordinal == 3) {
                    C7838e ad = AbstractC13688e.ad();
                    ad.getClass();
                    ad.startapp(new C10954e(ad, objArr3 == true ? 1 : 0, i5));
                } else if (ordinal == 4) {
                    C12894e c12894e = C7838e.f15858e;
                    if (c12894e == null) {
                        c12894e = null;
                    }
                    C7838e c7838e = (C7838e) ((C14136e) c12894e.f25751e).invoke();
                    C12894e c12894e2 = C7838e.f15858e;
                    if (c12894e2 == null) {
                        c12894e2 = null;
                    }
                    C7838e c7838e2 = (C7838e) ((C14136e) c12894e2.f25751e).invoke();
                    c7838e2.getClass();
                    int ordinal2 = ((EnumC10286e) c7838e2.yandex(new C1586e(c7838e2, i5))).ordinal();
                    if (ordinal2 == 0) {
                        enumC10286e = EnumC10286e.f20305e;
                    } else if (ordinal2 == 1) {
                        enumC10286e = EnumC10286e.f20304e;
                    } else {
                        if (ordinal2 != 2) {
                            throw new C14803e(10);
                        }
                        enumC10286e = EnumC10286e.f20307e;
                    }
                    c7838e.getClass();
                    c7838e.startapp(new C10954e(enumC10286e, objArr4 == true ? 1 : 0, 6));
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (ordinal != 5) {
                        throw new C14803e(10);
                    }
                    C12894e c12894e3 = C7838e.f15858e;
                    if (c12894e3 == null) {
                        c12894e3 = null;
                    }
                    ((C7838e) ((C14136e) c12894e3.f25751e).invoke()).amazon(!((C7838e) ((C14136e) (C7838e.f15858e != null ? r1 : null).f25751e).invoke()).metrica());
                    Unit unit2 = Unit.INSTANCE;
                }
            } else {
                C7838e ad2 = AbstractC13688e.ad();
                ad2.getClass();
            }
        } else {
            boolean billing = AbstractC7890e.billing(intent != null ? intent.getAction() : null, AbstractC13688e.vip);
            C14826e c14826e = this.f36734e;
            if (billing) {
                AbstractC5336e.purchase(c14826e, null, 0, new C0990e(this, objArr2 == true ? 1 : 0, i4), 3);
            } else {
                if (AbstractC7890e.billing(intent != null ? intent.getAction() : null, "android.intent.action.MEDIA_BUTTON")) {
                    C4748e c4748e = this.f36750e;
                    if (c4748e == null) {
                        c4748e = null;
                    }
                    if (c4748e.ad().mo2088e() == 0) {
                        mopub().metrica = true;
                        C4748e c4748e2 = this.f36750e;
                        if (c4748e2 == null) {
                            c4748e2 = null;
                        }
                        applovin(c4748e2, true);
                        AbstractC5336e.purchase(c14826e, null, 0, new C0990e(this, objArr == true ? 1 : 0, i3), 3);
                    }
                }
            }
        }
        isVip(intent, i, i2);
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        C18464e c18464e = this.f36743e;
        if (c18464e == null) {
            c18464e = null;
        }
        startapp(c18464e);
        if (!((Boolean) AbstractC16524e.advert.ad()).booleanValue()) {
            isPro(intent);
            return;
        }
        C7838e advert = advert();
        C12318e c12318e = advert.f15864e;
        if (c12318e != null) {
            c12318e.release();
        }
        advert.f15864e = null;
        premium();
    }

    public final void premium() {
        adcel(null).ad();
        ArrayList smaato = smaato();
        for (int i = 0; i < smaato.size(); i++) {
            ((C4748e) smaato.get(i)).ad().mo2123e(false);
        }
        stopSelf();
    }

    public final void pro() {
        EnumC14621e enumC14621e = EnumC14621e.ON_STOP;
        C6029e c6029e = this.f36751e;
        c6029e.pro(enumC14621e);
        c6029e.pro(EnumC14621e.ON_DESTROY);
        signatures();
    }

    public final C12490e purchase() {
        C17148e license = AbstractC15390e.license(this, advert().f15878e, advert().f15871e, new C11689e(this, 2), new C11689e(this, 3), advert().f15872e);
        C10530e c10530e = new C10530e();
        C4174e c4174e = license.f33635e;
        c4174e.getClass();
        c4174e.f9208e.ad(c10530e);
        license.m4251e();
        C17790e c17790e = license.f33588e;
        if (((Integer) c17790e.amazon()).intValue() != 0) {
            C11399e c11399e = new C11399e(0, license);
            AbstractC2301e.subscription(Looper.myLooper() == ((C2399e) c17790e.f34881e).ad.getLooper());
            c17790e.f34880e++;
            c17790e.m4427extends(new RunnableC16019e(c17790e, c11399e, 11));
            c17790e.m4429implements(Integer.valueOf(((Integer) c17790e.f34883e).intValue()));
        }
        return new C12490e(license, new C12781e(0, 9, C7838e.class, advert(), "preloadManager", "getPreloadManager$orbitplayback_release()Lua/itaysonlab/vkxreborn/playback/preload/PreloadManager;"));
    }

    public final void remoteconfig() {
        super.onCreate();
        this.f36749e = new BinderC12883e(this);
    }

    public final void signatures() {
        super.onDestroy();
        C11165e c11165e = this.f36733e;
        if (c11165e != null) {
            c11165e.ad();
        }
        BinderC12883e binderC12883e = this.f36749e;
        if (binderC12883e != null) {
            binderC12883e.metrica.clear();
            binderC12883e.license.removeCallbacksAndMessages(null);
            Set set = binderC12883e.appmetrica;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AbstractC0223e.metrica((InterfaceC4342e) it.next());
            }
            set.clear();
            this.f36749e = null;
        }
    }

    public final ArrayList smaato() {
        ArrayList arrayList;
        synchronized (this.f36741e) {
            arrayList = new ArrayList(this.f36753e.values());
        }
        return arrayList;
    }

    public final void startapp(InterfaceC16843e interfaceC16843e) {
        if (interfaceC16843e.billing() == 1) {
            return;
        }
        C14609e yandex = advert().f15868e.yandex(Integer.valueOf(interfaceC16843e.mo2115e()));
        long mo2071e = interfaceC16843e.mo2071e();
        InterfaceC1686e interfaceC1686e = advert().f15868e.license;
        C15420e c15420e = AbstractC6731e.ad;
        AbstractC5336e.purchase(this.f36734e, ExecutorC3603e.f8134e, 0, new C5840e(yandex, this, mo2071e, interfaceC1686e, null, 4), 2);
    }

    public final void subs() {
        long j;
        C18464e c18464e = this.f36743e;
        if (c18464e == null) {
            c18464e = null;
        }
        long mo2071e = ((AbstractC11130e) c18464e.f36191e).mo2071e();
        Iterator it = advert().f15866e.iterator();
        while (it.hasNext()) {
            ((InterfaceC3974e) it.next()).metrica(mo2071e);
            Unit unit = Unit.INSTANCE;
        }
        if (advert().f15874e) {
            C18464e c18464e2 = this.f36743e;
            if (c18464e2 == null) {
                c18464e2 = null;
            }
            long mo2097e = ((AbstractC11130e) c18464e2.f36191e).mo2097e();
            C18464e c18464e3 = this.f36743e;
            if (c18464e3 == null) {
                c18464e3 = null;
            }
            long duration = ((AbstractC11130e) c18464e3.f36191e).getDuration();
            AbstractC6232e.billing(new C16150e(new C14751e(duration < 0 ? 0L : duration, mo2097e, mo2071e)), this.f36734e);
        }
        C1511e c1511e = this.f36739e;
        C1511e c1511e2 = c1511e != null ? c1511e : null;
        boolean z = c1511e2.purchase;
        C12490e c12490e = c1511e2.metrica;
        C12490e c12490e2 = c1511e2.vip;
        if (z) {
            InterfaceC16843e interfaceC16843e = (InterfaceC16843e) c1511e2.ad().f22047e;
            InterfaceC16843e interfaceC16843e2 = (InterfaceC16843e) c1511e2.ad().f22047e;
            int i = 2;
            if (c1511e2.startapp || interfaceC16843e2.startapp() == 1 || !interfaceC16843e2.mo2083e() || interfaceC16843e2.getDuration() == -9223372036854775807L || interfaceC16843e2.mo2071e() == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                long duration2 = interfaceC16843e2.getDuration() - interfaceC16843e2.mo2071e();
                j = -9223372036854775807L;
                long j2 = c1511e2.billing * 2;
                if (j2 < 30000) {
                    j2 = 30000;
                }
                if (duration2 <= j2) {
                    C12490e ad = c1511e2.ad();
                    if (c1511e2.appmetrica) {
                        c12490e = c12490e2;
                    }
                    c1511e2.startapp = true;
                    C18464e c18464e4 = c1511e2.ad;
                    int mo2100e = ((InterfaceC16843e) ad.f22047e).mo2100e();
                    ArrayList arrayList = (ArrayList) c18464e4.f36194e;
                    c12490e.signatures(((AbstractC11130e) c18464e4.f36191e).startapp());
                    c12490e.mo2130native(((AbstractC11130e) c18464e4.f36191e).mo2091e());
                    c12490e.mo2096e(((AbstractC11130e) c18464e4.f36191e).mo2085e());
                    c12490e.mo2138synchronized(((AbstractC11130e) c18464e4.f36191e).mo2104e());
                    c12490e.mo2126for(((AbstractC11130e) c18464e4.f36191e).mo2064catch());
                    c12490e.mo3032e(((AbstractC11130e) c18464e4.f36191e).smaato(), true);
                    c12490e.mo2123e(false);
                    c12490e.mo2094e(mo2100e, 0L, arrayList);
                    c12490e.license();
                    c18464e4.f36189e = c12490e;
                }
            }
            InterfaceC16843e interfaceC16843e3 = (InterfaceC16843e) c1511e2.ad().f22047e;
            if (!c1511e2.adcel && c1511e2.startapp && interfaceC16843e3.startapp() != 1 && interfaceC16843e3.mo2083e() && interfaceC16843e3.getDuration() != j && interfaceC16843e3.mo2071e() != j && interfaceC16843e3.getDuration() - interfaceC16843e3.mo2071e() <= c1511e2.billing) {
                long duration3 = interfaceC16843e.getDuration() - interfaceC16843e.mo2071e();
                if (duration3 < 0) {
                    duration3 = 0;
                }
                C12490e ad2 = c1511e2.ad();
                InterfaceC16843e interfaceC16843e4 = (InterfaceC16843e) ad2.f22047e;
                if (c1511e2.appmetrica) {
                    c12490e = c12490e2;
                }
                c1511e2.adcel = true;
                c12490e.Signature(interfaceC16843e4.isVip());
                ad2.mo3032e(interfaceC16843e4.smaato(), false);
                c12490e.mo3032e(((InterfaceC16843e) c12490e.f22047e).smaato(), !((Boolean) AbstractC16524e.startapp.ad()).booleanValue());
                c12490e.mo2126for(0.0f);
                c12490e.mo2123e(true);
                ValueAnimator valueAnimator = c1511e2.yandex;
                valueAnimator.setCurrentPlayTime(0L);
                valueAnimator.setDuration(duration3);
                valueAnimator.addUpdateListener(new C8156e(ad2, c12490e, i));
                valueAnimator.addListener(c1511e2.mopub);
                valueAnimator.start();
            }
        }
        RunnableC12991e runnableC12991e = new RunnableC12991e(23, this);
        this.f36737e.postDelayed(runnableC12991e, 1000L);
        this.f36746e = runnableC12991e;
    }

    public final void subscription() {
        this.f36751e.pro(EnumC14621e.ON_CREATE);
        remoteconfig();
    }

    public final C4748e tapsense(C18424e c18424e) {
        try {
            if (((C3446e) this.f36748e.getValue()).vip(c18424e)) {
                C4748e c4748e = this.f36750e;
                if (c4748e != null) {
                    return c4748e;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            C4748e c4748e2 = this.f36750e;
            if (c4748e2 == null) {
                return null;
            }
            return c4748e2;
        }
    }

    @Override // defpackage.AbstractServiceC5667e, defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        return (C4891e) this.f36751e.f12699e;
    }
}
