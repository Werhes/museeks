package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.startapp;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2783e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f6705e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6706e;

    public /* synthetic */ RunnableC2783e(int i, Object obj) {
        this.f6706e = i;
        this.f6705e = obj;
    }

    public /* synthetic */ RunnableC2783e(C11246e c11246e, C1520e c1520e) {
        this.f6706e = 6;
        this.f6705e = c1520e;
    }

    private final void ad() {
        C14484e c14484e = (C14484e) this.f6705e;
        synchronized (c14484e.f28633e) {
            try {
                if (c14484e.f28632e == null) {
                    return;
                }
                try {
                    C14959e metrica = c14484e.metrica();
                    int i = metrica.purchase;
                    if (i == 2) {
                        synchronized (c14484e.f28633e) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        Method method = AbstractC12193e.vip;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        C16728e c16728e = c14484e.f28630e;
                        Context context = c14484e.f28634e;
                        c16728e.getClass();
                        C14959e[] c14959eArr = {metrica};
                        AbstractC15203e abstractC15203e = AbstractC17174e.ad;
                        Trace.beginSection("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface license = AbstractC17174e.ad.license(context, c14959eArr, 0);
                            Trace.endSection();
                            MappedByteBuffer advert = AbstractC16994e.advert(c14484e.f28634e, metrica.ad);
                            if (advert == null || license == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                C11980e c11980e = new C11980e(license, AbstractC1574e.billing(advert));
                                Trace.endSection();
                                synchronized (c14484e.f28633e) {
                                    try {
                                        AbstractC12947e abstractC12947e = c14484e.f28632e;
                                        if (abstractC12947e != null) {
                                            abstractC12947e.signatures(c11980e);
                                        }
                                    } finally {
                                    }
                                }
                                c14484e.ad();
                            } finally {
                                Method method2 = AbstractC12193e.vip;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (c14484e.f28633e) {
                        try {
                            AbstractC12947e abstractC12947e2 = c14484e.f28632e;
                            if (abstractC12947e2 != null) {
                                abstractC12947e2.pro(th2);
                            }
                            c14484e.ad();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    private final void appmetrica() {
        C3278e c3278e = (C3278e) this.f6705e;
        synchronized (c3278e.f7430e) {
            try {
                C9203e c9203e = c3278e.f7435e;
                if (c9203e != null) {
                    c9203e.ad();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void license() {
        synchronized (((PlaybackService) this.f6705e).f36741e) {
        }
    }

    private final void metrica() {
        C5306e c5306e = (C5306e) this.f6705e;
        if (((C13945e) c5306e.f11404e) != null) {
            c5306e.m1885interface();
            C11275e c11275e = (C11275e) c5306e.f11401e;
            Set<C11470e> set = (HashSet) c5306e.f11398e;
            synchronized (c11275e.ad) {
                if (set == null) {
                    try {
                        set = c11275e.vip.keySet();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                for (C11470e c11470e : set) {
                    if (c11275e.vip.containsKey(c11470e)) {
                        c11275e.smaato((C1874e) c11275e.vip.get(c11470e));
                    }
                }
            }
        }
    }

    private final void purchase() {
        String isVip;
        TelephonyManager telephonyManager;
        C3673e c3673e = (C3673e) this.f6705e;
        C9006e c9006e = (C9006e) c3673e.ad.get();
        if (c9006e != null) {
            int pro = c3673e.metrica.pro();
            C10573e c10573e = c9006e.ad;
            synchronized (c10573e) {
                int i = c10573e.amazon;
                if (i == 0 || c10573e.appmetrica) {
                    if (i != pro || c10573e.loadAd == null) {
                        c10573e.amazon = pro;
                        if (pro != 1 && pro != 0 && pro != 8) {
                            if (c10573e.loadAd == null) {
                                Context context = c10573e.ad;
                                String str = AbstractC9413e.ad;
                                if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (!TextUtils.isEmpty(networkCountryIso)) {
                                        isVip = AbstractC3628e.isVip(networkCountryIso);
                                        c10573e.loadAd = isVip;
                                    }
                                }
                                isVip = AbstractC3628e.isVip(Locale.getDefault().getCountry());
                                c10573e.loadAd = isVip;
                            }
                            c10573e.advert = c10573e.ad(pro);
                            c10573e.license.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            c10573e.vip(c10573e.billing > 0 ? (int) (elapsedRealtime - c10573e.yandex) : 0, c10573e.startapp, c10573e.advert);
                            c10573e.yandex = elapsedRealtime;
                            c10573e.startapp = 0L;
                            c10573e.mopub = 0L;
                            c10573e.adcel = 0L;
                            C18368e c18368e = c10573e.purchase;
                            ((ArrayList) c18368e.appmetrica).clear();
                            c18368e.ad = -1;
                            c18368e.vip = 0;
                            c18368e.metrica = 0;
                        }
                    }
                }
            }
        }
    }

    private final void vip() {
        C2601e c2601e = (C2601e) this.f6705e;
        synchronized (c2601e.f6450e) {
            try {
                c2601e.f6448e = null;
                InterfaceC12385e interfaceC12385e = c2601e.f6451e;
                if (interfaceC12385e != null) {
                    c2601e.f6451e = null;
                    c2601e.purchase(interfaceC12385e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6706e) {
            case 0:
                ((C17075e) this.f6705e).yandex.pro();
                return;
            case 1:
                C12801e c12801e = (C12801e) this.f6705e;
                boolean isPopupShowing = c12801e.yandex.isPopupShowing();
                c12801e.remoteconfig(isPopupShowing);
                c12801e.smaato = isPopupShowing;
                return;
            case 2:
                C12799e c12799e = (C12799e) this.f6705e;
                c12799e.f25610e = true;
                c12799e.metrica();
                return;
            case 3:
                C0679e c0679e = (C0679e) ((C18464e) this.f6705e).f36189e;
                if (c0679e != null) {
                    Iterator it = c0679e.values().iterator();
                    while (it.hasNext()) {
                        ((C4753e) it.next()).metrica();
                    }
                    return;
                }
                return;
            case 4:
                ((C11068e) this.f6705e).vip();
                return;
            case 5:
                C17148e c17148e = (C17148e) this.f6705e;
                C17790e c17790e = c17148e.f33588e;
                Context context = c17148e.f33633e;
                String str = AbstractC9413e.ad;
                int generateAudioSessionId = AbstractC17305e.amazon(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                c17790e.m4432protected(Integer.valueOf(generateAudioSessionId));
                return;
            case 6:
                C1520e c1520e = (C1520e) this.f6705e;
                try {
                    synchronized (c1520e) {
                    }
                    try {
                        c1520e.ad.ad(c1520e.metrica, c1520e.license);
                        return;
                    } finally {
                        c1520e.ad(true);
                    }
                } catch (C5681e e) {
                    AbstractC2803e.billing("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 7:
                ad();
                return;
            case 8:
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = (AbstractComponentCallbacksC17875e) this.f6705e;
                abstractComponentCallbacksC17875e.f35081e.f2505e.m2001try(abstractComponentCallbacksC17875e.f35099e);
                abstractComponentCallbacksC17875e.f35099e = null;
                return;
            case 9:
                Iterator it2 = ((AbstractC15958e) this.f6705e).amazon.iterator();
                if (it2.hasNext()) {
                    throw AbstractC5087e.m1747goto(it2);
                }
                return;
            case 10:
                ((C14090e) this.f6705e).smaato();
                return;
            case 11:
                ((C9770e) this.f6705e).isPro();
                return;
            case 12:
                vip();
                return;
            case 13:
                ((AbstractC15876e) this.f6705e).mo1388instanceof();
                return;
            case 14:
                metrica();
                return;
            case 15:
                startapp startappVar = ((AbstractC3655e) this.f6705e).f8233e;
                (startappVar != null ? startappVar : null).adcel();
                return;
            case 16:
                C9394e c9394e = (C9394e) this.f6705e;
                c9394e.setArtwork(c9394e.f18673e);
                c9394e.f18684e = true;
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C12318e) this.f6705e).release();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C16899e) this.f6705e).amazon = -1;
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C16755e) this.f6705e).ad();
                return;
            case 20:
                license();
                return;
            case 21:
                appmetrica();
                return;
            case 22:
                purchase();
                return;
            case 23:
                ((C10767e) this.f6705e).smaato--;
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C9301e) this.f6705e).admob();
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C14091e c14091e = (C14091e) this.f6705e;
                C4891e c4891e = c14091e.f27854e;
                if (c14091e.f27849e == 0) {
                    c14091e.f27848e = true;
                    c4891e.appmetrica(EnumC14621e.ON_PAUSE);
                }
                if (c14091e.f27852e == 0 && c14091e.f27848e) {
                    c4891e.appmetrica(EnumC14621e.ON_STOP);
                    c14091e.f27851e = true;
                    return;
                }
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC17680e.yandex((View) ((C10985e) this.f6705e).f21741e);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((AbstractC10760e) this.f6705e).smaato();
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C16042e c16042e = (C16042e) ((C11883e) this.f6705e).f23814e;
                if (c16042e.f31595e) {
                    return;
                }
                AbstractC9464e.yandex("Recorder", "Retry setupVideo #" + c16042e.f31596e);
                C6122e c6122e = (C6122e) c16042e.f31597e;
                EnumC14627e enumC14627e = (EnumC14627e) c16042e.f31594e;
                C13343e c13343e = (C13343e) c16042e.f31599e;
                c13343e.admob().ad(new RunnableC9527e(3, c16042e, c6122e, enumC14627e), c13343e.license);
                return;
            default:
                C15877e.ad((C15877e) this.f6705e);
                return;
        }
    }
}
