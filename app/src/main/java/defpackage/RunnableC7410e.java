package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.media.session.MediaController;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.view.Surface;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7410e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f15170e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f15171e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15172e;

    public /* synthetic */ RunnableC7410e(C1059e c1059e, C9142e c9142e, View view, View view2) {
        this.f15172e = 0;
        this.f15171e = c1059e;
        this.f15170e = c9142e;
    }

    public /* synthetic */ RunnableC7410e(C6584e c6584e, C18424e c18424e, Runnable runnable) {
        this.f15172e = 17;
        this.f15171e = c6584e;
        this.f15170e = runnable;
    }

    public /* synthetic */ RunnableC7410e(Object obj, Object obj2, int i) {
        this.f15172e = i;
        this.f15171e = obj;
        this.f15170e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        C9759e c9759e;
        switch (this.f15172e) {
            case 0:
                C1059e c1059e = (C1059e) this.f15171e;
                ((C9142e) this.f15170e).vip();
                c1059e.f3581e = false;
                ((InterfaceC17022e) c1059e.f3582e.f29787e).getClass();
                c1059e.f3582e = null;
                c1059e.vip();
                if (c1059e.getBackView() != null) {
                    c1059e.getBackView().setVisibility(8);
                    return;
                }
                return;
            case 1:
                C18478e c18478e = (C18478e) this.f15171e;
                InterfaceC4868e interfaceC4868e = (InterfaceC4868e) this.f15170e;
                C0214e c0214e = (C0214e) ((C1326e) c18478e.f36228e).license();
                if (c0214e == null) {
                    return;
                }
                interfaceC4868e.ad(c0214e.ad);
                return;
            case 2:
                C18478e c18478e2 = (C18478e) this.f15171e;
                C7169e c7169e = (C7169e) this.f15170e;
                C0214e c0214e2 = (C0214e) ((C1326e) c18478e2.f36228e).license();
                if (c0214e2 == null) {
                    c7169e.metrica(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    c7169e.ad(c0214e2.ad);
                    return;
                }
            case 3:
                Map.Entry entry = (Map.Entry) this.f15171e;
                C0214e c0214e3 = (C0214e) this.f15170e;
                InterfaceC4868e interfaceC4868e2 = (InterfaceC4868e) entry.getKey();
                c0214e3.getClass();
                interfaceC4868e2.ad(c0214e3.ad);
                return;
            case 4:
                AbstractC17844e abstractC17844e = (AbstractC17844e) this.f15171e;
                abstractC17844e.f34988e.set(abstractC17844e.pro((C13391e) this.f15170e, abstractC17844e.f34985e, 0));
                return;
            case 5:
                C12621e c12621e = (C12621e) this.f15171e;
                C5891e c5891e = new C5891e(c12621e.ad, (C13765e) this.f15170e);
                c12621e.startapp = c5891e;
                C1861e c1861e = c12621e.appmetrica;
                Handler handler = c12621e.vip.f24699e;
                if (!((Set) c5891e.f12439e).add(c1861e)) {
                    AbstractC2803e.smaato("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                if (handler == null) {
                    handler = new Handler();
                }
                c1861e.license(handler);
                C8603e c8603e = (C8603e) c5891e.f12440e;
                MediaController mediaController = c8603e.ad;
                C15719e c15719e = c1861e.ad;
                c15719e.getClass();
                mediaController.registerCallback(c15719e, handler);
                synchronized (c8603e.vip) {
                    InterfaceC16274e ad = c8603e.appmetrica.ad();
                    if (ad != null) {
                        BinderC8864e binderC8864e = new BinderC8864e(c1861e);
                        c8603e.license.put(c1861e, binderC8864e);
                        c1861e.metrica = binderC8864e;
                        try {
                            ad.mo258e(binderC8864e);
                            c1861e.metrica(13, null);
                        } catch (RemoteException | SecurityException e) {
                            AbstractC2803e.billing("MediaControllerCompat", "Dead object in registerCallback.", e);
                        }
                    } else {
                        c1861e.metrica = null;
                        c8603e.metrica.add(c1861e);
                    }
                }
                return;
            case 6:
                C12621e c12621e2 = (C12621e) this.f15171e;
                AbstractC17475e abstractC17475e = (AbstractC17475e) ((C2532e) this.f15170e).f6387e;
                C12318e c12318e = c12621e2.vip;
                c12318e.getClass();
                AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
                InterfaceC17145e interfaceC17145e = c12318e.f24703e;
                interfaceC17145e.remoteconfig(c12318e, abstractC17475e);
                interfaceC17145e.applovin();
                return;
            case 7:
                C4275e c4275e = (C4275e) this.f15171e;
                InterfaceC1360e interfaceC1360e = (InterfaceC1360e) this.f15170e;
                if (c4275e.Signature) {
                    return;
                }
                interfaceC1360e.vip(c4275e);
                return;
            case 8:
                ListenableFuture listenableFuture = (ListenableFuture) this.f15171e;
                C8597e c8597e = (C8597e) this.f15170e;
                try {
                    C9759e c9759e2 = (C9759e) listenableFuture.get();
                    AbstractC2301e.amazon(c9759e2, "SessionResult must not be null");
                    c8597e.purchase(c9759e2.vip);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e2) {
                    AbstractC2803e.amazon("MLSLegacyStub", "Custom action failed", e2);
                    c8597e.appmetrica();
                    return;
                }
            case 9:
                C0485e c0485e = (C0485e) this.f15171e;
                ArrayList arrayList = (ArrayList) this.f15170e;
                if (c0485e.f2776e instanceof C8973e) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        if (arrayList.get(i5) != null) {
                            ((ListenableFuture) arrayList.get(i5)).cancel(false);
                        }
                    }
                    return;
                }
                return;
            case 10:
                C13340e c13340e = (C13340e) this.f15171e;
                ArrayList arrayList2 = (ArrayList) this.f15170e;
                ServiceC13230e serviceC13230e = c13340e.f26585e;
                C6584e c6584e = serviceC13230e.f26249e;
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    C3970e c3970e = (C3970e) arrayList2.get(i6);
                    Bundle bundle = c3970e.license;
                    C8597e c8597e2 = c3970e.appmetrica;
                    if (bundle != null) {
                        try {
                            bundle.setClassLoader(c6584e.purchase.getClassLoader());
                            i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                            i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                        } catch (BadParcelableException unused) {
                            c8597e2.purchase(null);
                            return;
                        }
                    } else {
                        i = 0;
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i < 0 || i2 < 1) {
                        i3 = 0;
                        i4 = Integer.MAX_VALUE;
                    } else {
                        i3 = i;
                        i4 = i2;
                    }
                    int i7 = 1;
                    C0485e m2550else = AbstractC9413e.m2550else(serviceC13230e.f26249e.inmobi(c3970e.ad, c3970e.metrica, i3, i4, AbstractC13256e.yandex(c6584e.purchase, bundle)), new C12574e(serviceC13230e, i7));
                    m2550else.ad(new RunnableC17492e(m2550else, c8597e2, i7), EnumC3320e.f7489e);
                }
                return;
            case 11:
                C14845e.m3857private((C14845e) this.f15171e, (TrackChangeEvent) this.f15170e);
                return;
            case 12:
                C14845e.m3858strictfp((C14845e) this.f15171e, (NetworkEvent) this.f15170e);
                return;
            case 13:
                C14845e.m3859super((C14845e) this.f15171e, (PlaybackErrorEvent) this.f15170e);
                return;
            case 14:
                C14845e.m3855new((C14845e) this.f15171e, (PlaybackMetrics) this.f15170e);
                return;
            case 15:
                C14845e.m3856package((C14845e) this.f15171e, (PlaybackStateEvent) this.f15170e);
                return;
            case 16:
                C6584e c6584e2 = (C6584e) this.f15171e;
                C6268e c6268e = (C6268e) this.f15170e;
                C5537e c5537e = c6584e2.yandex;
                c6584e2.pro = c6268e;
                C15477e c15477e = new C15477e(c6584e2, c6268e);
                c6268e.mo2133protected(c15477e);
                c6584e2.tapsense = c15477e;
                try {
                    c5537e.adcel.remoteconfig(0, c6268e);
                } catch (RemoteException e3) {
                    AbstractC2803e.billing("MediaSessionImpl", "Exception in using media1 API", e3);
                }
                ((C2584e) c5537e.amazon.f26645e).ad.setActive(true);
                c6584e2.remoteconfig = new C2411e(c6268e.mo2134public(), 0, c6268e.m2087e(), c6268e.m2122e(), c6268e.m2122e(), 0, c6268e.isVip(), c6268e.startapp(), c6268e.mo2091e(), c6268e.mo2127implements(), c6268e.m2073e(), 0, c6268e.mo2107e(18) ? c6268e.mo2085e() : C12053e.f24142throw, c6268e.mo2107e(22) ? c6268e.mo2064catch() : 1.0f, 1.0f, c6268e.mo2107e(21) ? c6268e.smaato() : C3335e.startapp, 0, c6268e.mo2107e(28) ? c6268e.mo2074e() : C9039e.license, c6268e.mo2131new(), c6268e.mo2107e(23) ? c6268e.isPro() : 0, c6268e.m2099e(), c6268e.mo2129interface(), 1, c6268e.mo2106e(), c6268e.billing(), c6268e.mo2108e(), c6268e.subscription(), c6268e.m2084e(), c6268e.mo2112e(), c6268e.mo2098e(), c6268e.mo2142try(), c6268e.mo2107e(30) ? c6268e.mo2119e() : C18255e.vip, c6268e.mo2104e());
                c6584e2.mopub(c6268e.firebase());
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6584e c6584e3 = (C6584e) this.f15171e;
                Runnable runnable = (Runnable) this.f15170e;
                c6584e3.getClass();
                runnable.run();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C7169e) this.f15170e).ad(Boolean.valueOf(((C6584e) this.f15171e).applovin()));
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f15171e;
                ResultReceiver resultReceiver = (ResultReceiver) this.f15170e;
                try {
                    c9759e = (C9759e) listenableFuture2.get();
                    AbstractC2301e.amazon(c9759e, "SessionResult must not be null");
                } catch (InterruptedException e4) {
                    e = e4;
                    AbstractC2803e.amazon("MediaSessionLegacyStub", "Custom command failed", e);
                    c9759e = new C9759e(-1);
                } catch (CancellationException e5) {
                    AbstractC2803e.amazon("MediaSessionLegacyStub", "Custom command cancelled", e5);
                    c9759e = new C9759e(1);
                } catch (ExecutionException e6) {
                    e = e6;
                    AbstractC2803e.amazon("MediaSessionLegacyStub", "Custom command failed", e);
                    c9759e = new C9759e(-1);
                }
                resultReceiver.send(c9759e.ad, c9759e.vip);
                return;
            case 20:
                C6584e c6584e4 = (C6584e) this.f15171e;
                Intent intent = (Intent) this.f15170e;
                C18424e startapp = c6584e4.startapp();
                if (startapp == null) {
                    startapp = PlaybackService.billing(intent);
                }
                if (c6584e4.isPro(startapp, intent)) {
                    return;
                }
                AbstractC2803e.license("MSessionService", "Ignored unrecognized media button intent.");
                return;
            case 21:
                PlaybackService playbackService = (PlaybackService) this.f15171e;
                C14863e c14863e = (C14863e) this.f15170e;
                playbackService.adcel(c14863e).f22420e = c14863e;
                return;
            case 22:
                BinderC17428e binderC17428e = (BinderC17428e) this.f15171e;
                InterfaceC4342e interfaceC4342e = (InterfaceC4342e) this.f15170e;
                C11106e c11106e = binderC17428e.license;
                C18424e m3007extends = c11106e.m3007extends(interfaceC4342e.asBinder());
                if (m3007extends != null) {
                    c11106e.m3020static(m3007extends);
                    return;
                }
                return;
            case 23:
                ((BinderC17428e) this.f15171e).license.premium((C18424e) this.f15170e);
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((InterfaceC8427e) this.f15171e).accept(this.f15170e);
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C8402e c8402e = (C8402e) this.f15171e;
                InterfaceC14599e interfaceC14599e = (InterfaceC14599e) this.f15170e;
                c8402e.getClass();
                interfaceC14599e.metrica(c8402e);
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                Surface surface = (Surface) this.f15171e;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f15170e;
                surface.release();
                surfaceTexture.release();
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C0462e c0462e = (C0462e) this.f15171e;
                Context context = (Context) this.f15170e;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new C13264e(7, c0462e), intentFilter);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C13264e c13264e = (C13264e) this.f15171e;
                Context context2 = (Context) this.f15170e;
                C0462e c0462e2 = (C0462e) c13264e.vip;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                int i8 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i8 = type != 9 ? 8 : 7;
                                        }
                                        i8 = 5;
                                    }
                                }
                                i8 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i8 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                    i8 = 4;
                                    break;
                                case 13:
                                    i8 = 5;
                                    break;
                                case 16:
                                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                default:
                                    i8 = 6;
                                    break;
                                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                    i8 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i8 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i8 = 1;
                        }
                    } catch (SecurityException unused2) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i8 != 5) {
                    c0462e2.firebase(i8);
                    return;
                } else {
                    AbstractC16048e.appmetrica(context2, c0462e2);
                    return;
                }
            default:
                NextDockView nextDockView = (NextDockView) this.f15171e;
                String str = (String) this.f15170e;
                ArrayList arrayList3 = nextDockView.f36761e;
                Iterator it = arrayList3.iterator();
                int i9 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i9 = -1;
                    } else if (!AbstractC7890e.billing(((C0998e) it.next()).ad.ad, str)) {
                        i9++;
                    }
                }
                Integer valueOf = Integer.valueOf(i9);
                if (i9 == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    C0998e c0998e = (C0998e) AbstractC13480e.m3592native(nextDockView.f36760e, arrayList3);
                    if (c0998e != null) {
                        c0998e.vip(false, false);
                    }
                    ((C0998e) arrayList3.get(intValue)).vip(true, false);
                    nextDockView.f36760e = intValue;
                    return;
                }
                return;
        }
    }
}
