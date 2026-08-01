package defpackage;

import android.content.Context;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15390e {
    public static final C2892e Signature;
    public static final C2892e advert;
    public static final C2892e amazon;
    public static final C2892e loadAd;
    public static final C2892e smaato;
    public static final C2892e ad = new C2892e(298135004, false, new C10387e(25));
    public static final C2892e vip = new C2892e(1702004190, false, new C10387e(28));
    public static final C2892e metrica = new C2892e(-740209053, false, new C14498e(24));
    public static final C2892e license = new C2892e(-38274460, false, new C14498e(12));
    public static final C2892e appmetrica = new C2892e(1688607292, false, new C14498e(13));
    public static final C2892e purchase = new C2892e(1859530567, false, new C10387e(26));
    public static final C2892e billing = new C2892e(-261764904, false, new C14498e(14));
    public static final C2892e yandex = new C2892e(2073084414, false, new C14498e(15));
    public static final C2892e startapp = new C2892e(560490393, false, new C14498e(16));
    public static final C2892e adcel = new C2892e(-1764796260, false, new C14498e(17));
    public static final C2892e mopub = new C2892e(1755075485, false, new C14498e(18));

    static {
        new C2892e(494978235, false, new C10387e(27));
        advert = new C2892e(890508784, false, new C14498e(19));
        smaato = new C2892e(-871878029, false, new C14498e(20));
        amazon = new C2892e(-2127381171, false, new C14498e(21));
        loadAd = new C2892e(-1717473199, false, new C14498e(22));
        Signature = new C2892e(-1745351060, false, new C14498e(23));
    }

    public static final void ad(InterfaceC4384e interfaceC4384e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        Object startapp2;
        c13770e.m3671package(2120009603);
        int i2 = (c13770e.purchase(interfaceC4384e) ? 4 : 2) | i | (c13770e.purchase(interfaceC12864e) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            String appmetrica2 = AbstractC5297e.appmetrica(c13770e, R.string.m3c_bottom_sheet_drag_handle_description);
            boolean z = interfaceC4384e instanceof C0595e;
            C13119e advert2 = AbstractC0207e.advert(Boolean.valueOf(!z), "[NPPreview]", c13770e, 48, 0);
            boolean booleanValue = ((Boolean) advert2.license.getValue()).booleanValue();
            c13770e.m3676strictfp(966443105);
            long j = booleanValue ? C3618e.vip : C3618e.startapp;
            c13770e.Signature(false);
            Object purchase2 = C3618e.purchase(j);
            boolean purchase3 = c13770e.purchase(purchase2);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (purchase3 || m3681throw == obj) {
                Object c11139e = new C11139e(C5430e.f11635e, new C17097e(10, purchase2));
                c13770e.m3682throws(c11139e);
                m3681throw = c11139e;
            }
            C11139e c11139e2 = (C11139e) m3681throw;
            if (advert2.billing()) {
                startapp2 = AbstractC13501e.startapp(c13770e, 1666827533, false, advert2);
            } else {
                c13770e.m3676strictfp(1666573488);
                boolean purchase4 = c13770e.purchase(advert2);
                startapp2 = c13770e.m3681throw();
                if (purchase4 || startapp2 == obj) {
                    AbstractC13717e adcel2 = AbstractC12640e.adcel();
                    Function1 appmetrica3 = adcel2 != null ? adcel2.appmetrica() : null;
                    AbstractC13717e smaato2 = AbstractC12640e.smaato(adcel2);
                    try {
                        Object metrica2 = advert2.metrica();
                        AbstractC12640e.Signature(adcel2, smaato2, appmetrica3);
                        c13770e.m3682throws(metrica2);
                        startapp2 = metrica2;
                    } catch (Throwable th) {
                        AbstractC12640e.Signature(adcel2, smaato2, appmetrica3);
                        throw th;
                    }
                }
                c13770e.Signature(false);
            }
            boolean booleanValue2 = ((Boolean) startapp2).booleanValue();
            c13770e.m3676strictfp(966443105);
            long j2 = booleanValue2 ? C3618e.vip : C3618e.startapp;
            c13770e.Signature(false);
            C3618e c3618e = new C3618e(j2);
            boolean purchase5 = c13770e.purchase(advert2);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase5 || m3681throw2 == obj) {
                m3681throw2 = AbstractC14533e.purchase(new C2000e(advert2, 16));
                c13770e.m3682throws(m3681throw2);
            }
            boolean booleanValue3 = ((Boolean) ((InterfaceC16132e) m3681throw2).getValue()).booleanValue();
            c13770e.m3676strictfp(966443105);
            long j3 = booleanValue3 ? C3618e.vip : C3618e.startapp;
            c13770e.Signature(false);
            C3618e c3618e2 = new C3618e(j3);
            boolean purchase6 = c13770e.purchase(advert2);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase6 || m3681throw3 == obj) {
                m3681throw3 = AbstractC14533e.purchase(new C2000e(advert2, 17));
                c13770e.m3682throws(m3681throw3);
            }
            c13770e.m3676strictfp(1455844981);
            C13540e purchase7 = AbstractC12696e.purchase(0.0f, 400.0f, null, 5);
            c13770e.Signature(false);
            C11117e billing2 = AbstractC0207e.billing(advert2, c3618e, c3618e2, purchase7, c11139e2, c13770e, 196608);
            InterfaceC12864e advert3 = AbstractC12220e.advert(interfaceC12864e, 16, 22);
            boolean purchase8 = c13770e.purchase(appmetrica2);
            Object m3681throw4 = c13770e.m3681throw();
            if (purchase8 || m3681throw4 == obj) {
                m3681throw4 = new C18513e(appmetrica2, 11);
                c13770e.m3682throws(m3681throw4);
            }
            AbstractC12121e.ad(AbstractC1147e.ad(advert3, false, (Function1) m3681throw4), ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.appmetrica, ((C3618e) billing2.f22034e.getValue()).ad, ((C0896e) c13770e.adcel(AbstractC3577e.ad)).ad, 0.0f, !z ? 8 : 0, null, AbstractC16653e.license(-91226402, new C17689e(14, interfaceC4384e), c13770e), c13770e, 12582912, 80);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(interfaceC4384e, interfaceC12864e, i, 11);
        }
    }

    public static final long appmetrica() {
        return Thread.currentThread().getId();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eؘؑۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, eِؖۙ] */
    /* JADX WARN: Type inference failed for: r7v3, types: [eؘؙٗ, eؓٝۛ, java.lang.Object] */
    public static C17148e license(Context context, C1343e c1343e, InterfaceC5482e interfaceC5482e, Function0 function0, Function0 function02, C15945e c15945e) {
        ?? obj = new Object();
        obj.f1373e = context;
        obj.f1375e = new C2362e(10, context);
        C8063e c8063e = AbstractC16524e.subscription;
        obj.f1374e = ((Boolean) c8063e.ad()).booleanValue();
        obj.f1376e = true;
        C12894e c12894e = new C12894e(c1343e);
        Map singletonMap = Collections.singletonMap("Accept-Encoding", "identity");
        C16911e c16911e = (C16911e) c12894e.f25751e;
        synchronized (c16911e) {
            c16911e.f33136e = null;
            ((HashMap) c16911e.f33137e).clear();
            ((HashMap) c16911e.f33137e).putAll(singletonMap);
        }
        c12894e.f25752e = new C15660e(2);
        C10312e c10312e = new C10312e(new C10312e(new C17424e(context, c12894e), new C0211e(28, function0), 15), new C12582e(6), 15);
        ?? obj2 = new Object();
        obj2.f9002e = new C6173e(0);
        obj2.f9004e = c10312e;
        obj2.f9000e = interfaceC5482e;
        obj2.f9001e = 2;
        C3318e c3318e = new C3318e(0);
        c3318e.f7485e = interfaceC5482e;
        c3318e.f7486e = -1L;
        obj2.f8999e = c3318e;
        obj2.f9003e = false;
        obj2.f9005e = new C12582e(7);
        C10312e c10312e2 = new C10312e((Object) obj2, new C11565e(function02, c15945e, 22), 15);
        ?? obj3 = new Object();
        obj3.f5171e = new C4524e(27);
        obj3.f5172e = true;
        obj3.f5173e = 3;
        C0433e c0433e = new C0433e(c10312e2, obj3);
        c0433e.billing(new C5401e(3, 6, (byte) 0));
        C6698e c6698e = new C6698e(context, obj, c0433e);
        HashMap hashMap = new HashMap();
        hashMap.put(C5350e.license.ad, 144179200);
        C11669e c11669e = new C11669e(1048576);
        C2734e.ad(2500, 0, "bufferForPlaybackMs", "0");
        C2734e.ad(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        C2734e.ad(480000, 2500, "minBufferMs", "bufferForPlaybackMs");
        C2734e.ad(480000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        C2734e.ad(600000, 480000, "maxBufferMs", "minBufferMs");
        C2734e.ad(60000, 0, "backBufferDurationMs", "0");
        C2734e c2734e = new C2734e(c11669e, 480000, 480000, 600000, 600000, 2500, 2500, 5000, 5000, true, 60000, hashMap);
        AbstractC2301e.subscription(!c6698e.subs);
        c6698e.purchase = new C8431e(1, c2734e);
        C3335e c3335e = new C3335e(2, 0, 1, 1, 0, false, true);
        boolean z = !((Boolean) AbstractC16524e.startapp.ad()).booleanValue();
        AbstractC2301e.subscription(!c6698e.subs);
        c6698e.adcel = c3335e;
        c6698e.mopub = z;
        AbstractC2301e.subscription(!c6698e.subs);
        c6698e.advert = true;
        AbstractC2301e.subscription(!c6698e.subs);
        c6698e.subscription = 30000L;
        AbstractC2301e.subscription(!c6698e.subs);
        c6698e.remoteconfig = 30000L;
        AbstractC2301e.subscription(!c6698e.subs);
        c6698e.crashlytics = true;
        AbstractC2301e.subscription(!c6698e.subs);
        c6698e.loadAd = true;
        AbstractC2301e.subscription(!c6698e.subs);
        c6698e.premium = false;
        AbstractC2301e.subscription(!c6698e.subs);
        c6698e.smaato = true;
        AbstractC2301e.subscription(!c6698e.subs);
        c6698e.subs = true;
        C17148e c17148e = new C17148e(c6698e);
        c17148e.m4271e(((Boolean) AbstractC16524e.adcel.ad()).booleanValue());
        if (((Boolean) AbstractC16524e.admob.ad()).booleanValue()) {
            c17148e.m4262e(0);
        } else {
            c17148e.m4262e(2);
        }
        if (((Boolean) c8063e.ad()).booleanValue()) {
            C16672e c16672e = (C16672e) c17148e.mo2104e();
            c16672e.getClass();
            C8756e c8756e = new C8756e(c16672e);
            C13601e c13601e = new C13601e();
            c13601e.ad = 1;
            c13601e.vip = false;
            c13601e.metrica = false;
            c8756e.isVip = new C0454e(c13601e);
            c17148e.mo2138synchronized(new C16672e(c8756e));
        }
        return c17148e;
    }

    public static C2935e metrica(Surface surface, int i, C0299e c0299e, Handler handler) {
        ImageWriter newInstance;
        int i2 = c0299e.ad;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            newInstance = AbstractC14204e.ads(i2, surface);
        } else {
            Log.w("CXCP", "Ignoring format (" + ((Object) C0299e.vip(i2)) + ") for " + ((Object) ("Input-" + i)) + ". Android " + i3 + " does not support creating ImageWriters with formats. This may lead to unexpected behaviors.");
            newInstance = ImageWriter.newInstance(surface, 1);
        }
        C2935e c2935e = new C2935e(newInstance, i);
        newInstance.setOnImageReleasedListener(c2935e, handler);
        return c2935e;
    }

    public static final void vip(Function0 function0, C2892e c2892e, C2892e c2892e2, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        C2892e c2892e3;
        C2892e c2892e4;
        c13770e.m3671package(154859327);
        int i2 = i | (c13770e.yandex(function0) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.billing(16), C5438e.f11668e, c13770e, 54);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            AbstractC0014e.metrica(function0, null, false, null, null, null, AbstractC12696e.ad, c13770e, (i2 & 14) | 1572864, 62);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            C5228e c5228e = new C5228e(1.0f, true);
            C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert3 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, c5228e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, c14865e);
            AbstractC2270e.yandex(c13770e, advert3, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            c2892e3 = c2892e;
            AbstractC14489e.ad(((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip.amazon, AbstractC16653e.license(506520916, new C7099e(c2892e3, 9), c13770e), c13770e, 48);
            c13770e.Signature(true);
            c2892e4 = c2892e2;
            c2892e4.invoke(c13770e, 6);
            c13770e.Signature(true);
        } else {
            c2892e3 = c2892e;
            c2892e4 = c2892e2;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6409e(function0, c2892e3, c2892e4, interfaceC12864e, i, 11);
        }
    }
}
