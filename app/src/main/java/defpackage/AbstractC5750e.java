package defpackage;

import android.media.ImageReader;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5750e {
    public static final void ad(long j, C1839e c1839e, Function2 function2, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-684938728);
        if ((i & 6) == 0) {
            i2 = (c13770e.appmetrica(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(c1839e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            C5015e c5015e = AbstractC14489e.ad;
            AbstractC1101e.vip(new C14815e[]{AbstractC8703e.loadAd(j, AbstractC0608e.ad), c5015e.ad(((C1839e) c13770e.adcel(c5015e)).appmetrica(c1839e))}, function2, c13770e, ((i2 >> 3) & 112) | 8);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15121e(j, c1839e, function2, i, 0);
        }
    }

    public static final InterfaceC12864e appmetrica(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C8186e(function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static final ViewOnAttachStateChangeListenerC3798e billing(View view) {
        ViewOnAttachStateChangeListenerC3798e viewOnAttachStateChangeListenerC3798e;
        Object tag = view.getTag(R.id.coil3_request_manager);
        ViewOnAttachStateChangeListenerC3798e viewOnAttachStateChangeListenerC3798e2 = tag instanceof ViewOnAttachStateChangeListenerC3798e ? (ViewOnAttachStateChangeListenerC3798e) tag : null;
        if (viewOnAttachStateChangeListenerC3798e2 != null) {
            return viewOnAttachStateChangeListenerC3798e2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil3_request_manager);
                ViewOnAttachStateChangeListenerC3798e viewOnAttachStateChangeListenerC3798e3 = tag2 instanceof ViewOnAttachStateChangeListenerC3798e ? (ViewOnAttachStateChangeListenerC3798e) tag2 : null;
                if (viewOnAttachStateChangeListenerC3798e3 == null) {
                    ?? obj = new Object();
                    view.addOnAttachStateChangeListener(obj);
                    view.setTag(R.id.coil3_request_manager, obj);
                    viewOnAttachStateChangeListenerC3798e = obj;
                }
            } finally {
            }
        }
        return viewOnAttachStateChangeListenerC3798e;
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C12620e(function1));
    }

    public static final InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C12294e(function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؚؚٕ] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, eٌؖۤ] */
    public static C9689e purchase(InterfaceC12523e interfaceC12523e) {
        ?? obj = new Object();
        obj.metrica = new Object();
        C9689e c9689e = new C9689e(obj);
        obj.vip = c9689e;
        obj.ad = interfaceC12523e.getClass();
        try {
            Object amazon = interfaceC12523e.amazon(obj);
            if (amazon == null) {
                return c9689e;
            }
            obj.ad = amazon;
            return c9689e;
        } catch (Exception e) {
            c9689e.f19184e.mopub(e);
            return c9689e;
        }
    }

    public static C12309e vip(int i, int i2, int i3, int i4) {
        return new C12309e(ImageReader.newInstance(i, i2, i3, i4));
    }
}
