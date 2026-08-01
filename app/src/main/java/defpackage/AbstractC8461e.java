package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8461e {
    public static ExecutorService ad;
    public static final int[] vip = {1, 2, 3, 6};
    public static final int[] metrica = {48000, 44100, 32000};
    public static final int[] license = {24000, 22050, AbstractC1815e.AUDIO_CONTENT_SAMPLING_RATE};
    public static final int[] appmetrica = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] purchase = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 320, 384, 448, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, 576, 640};
    public static final int[] billing = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final C8245e yandex = new C8245e(0, new long[0], new Object[0]);

    public static final void ad(Object obj, String str, InterfaceC12864e interfaceC12864e, InterfaceC2872e interfaceC2872e, C2815e c2815e, C13770e c13770e, int i, int i2) {
        C10156e c10156e = C5438e.f11700e;
        InterfaceC2872e interfaceC2872e2 = (i2 & 64) != 0 ? C16477e.vip : interfaceC2872e;
        C2815e c2815e2 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : c2815e;
        int i3 = i << 3;
        int i4 = (i & 126) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        int i5 = i4 >> 3;
        AbstractC11267e.ad(new C12755e(obj, (C16401e) c13770e.adcel(AbstractC10870e.ad), AbstractC16550e.ad((Context) c13770e.adcel(AbstractC2676e.vip))), str, interfaceC12864e, C13108e.f26051e, null, c10156e, interfaceC2872e2, c2815e2, c13770e, (i4 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
    }

    public static C8724e appmetrica(int i, InterfaceC8850e interfaceC8850e, InterfaceC18435e interfaceC18435e, Function2 function2) {
        if ((i & 1) != 0) {
            interfaceC8850e = C2693e.f6576e;
        }
        C4420e c4420e = new C4420e(AbstractC6494e.loadAd(interfaceC18435e, interfaceC8850e));
        c4420e.m4472e(1, c4420e, function2);
        return c4420e.f9592e;
    }

    public static int billing(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = metrica[i];
        if (i4 == 44100) {
            return ((i2 % 2) + billing[i3]) * 2;
        }
        int i5 = purchase[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static C14826e license(InterfaceC7224e interfaceC7224e) {
        C15420e c15420e = AbstractC6731e.ad;
        C12940e c12940e = AbstractC1497e.ad;
        if (AbstractC3265e.amazon) {
            try {
                c12940e = c12940e.f25795e;
            } catch (C14596e | UnsupportedOperationException unused) {
                AbstractC3265e.amazon = false;
            }
        }
        C14826e ad2 = AbstractC9743e.ad(c12940e);
        InterfaceC10540e vip2 = interfaceC7224e.vip();
        if (vip2.getState() == EnumC10668e.f21012e) {
            AbstractC9743e.license(ad2, null);
        } else {
            vip2.smaato(new C5934e(2, ad2));
        }
        return ad2;
    }

    public static final Object metrica(AbstractC0586e abstractC0586e, AbstractC7185e abstractC7185e) {
        try {
            if (abstractC0586e.isDone()) {
                return AbstractC17976e.vip(abstractC0586e);
            }
            C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(abstractC7185e));
            c13578e.tapsense();
            abstractC0586e.ad(new RunnableC17144e(abstractC0586e, c13578e, 22), EnumC3320e.f7489e);
            c13578e.inmobi(new C17877e(25, abstractC0586e));
            return c13578e.signatures();
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }

    public static synchronized Executor purchase() {
        ExecutorService executorService;
        synchronized (AbstractC8461e.class) {
            try {
                if (ad == null) {
                    String str = AbstractC9413e.ad;
                    ad = Executors.newSingleThreadExecutor(new ThreadFactoryC9760e("ExoPlayer:BackgroundExecutor", 2));
                }
                executorService = ad;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static final void vip(Object obj, String str, InterfaceC12864e interfaceC12864e, AbstractC10727e abstractC10727e, AbstractC10727e abstractC10727e2, InterfaceC2872e interfaceC2872e, C13770e c13770e, int i, int i2, int i3) {
        AbstractC10727e abstractC10727e3 = (i3 & 16) != 0 ? null : abstractC10727e2;
        C10156e c10156e = C5438e.f11700e;
        InterfaceC2872e interfaceC2872e2 = (i3 & 1024) != 0 ? C16477e.vip : interfaceC2872e;
        int i4 = i << 3;
        int i5 = (i & 126) | (i4 & 7168) | (57344 & i4) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192);
        int i6 = 14;
        int i7 = ((i >> 27) & 14) | ((i2 << 3) & 112);
        int i8 = i5 >> 3;
        C12755e c12755e = new C12755e(obj, (C16401e) c13770e.adcel(AbstractC10870e.ad), AbstractC16550e.ad((Context) c13770e.adcel(AbstractC2676e.vip)));
        int i9 = AbstractC14940e.vip;
        Function1 c9675e = (abstractC10727e == null && abstractC10727e3 == null && abstractC10727e3 == null) ? C13108e.f26051e : new C9675e(i6, abstractC10727e, abstractC10727e3, abstractC10727e3);
        int i10 = i7 << 15;
        AbstractC11267e.ad(c12755e, str, interfaceC12864e, c9675e, null, c10156e, interfaceC2872e2, null, c13770e, (i5 & 112) | (i8 & 896) | (i10 & 458752) | (i10 & 3670016), 0);
    }
}
