package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6950e {
    public final Context ad;
    public final C16680e adcel;
    public final InterfaceC12516e appmetrica;
    public final Looper billing;
    public final C13391e license;
    public final C5389e metrica;
    public final C7735e purchase;
    public final C16628e startapp;
    public final String vip;
    public final int yandex;

    public AbstractC6950e(Context context, C13391e c13391e, InterfaceC12516e interfaceC12516e, C16258e c16258e) {
        AbstractC9528e.adcel(context, "Null context is not permitted.");
        AbstractC9528e.adcel(c13391e, "Api must not be null.");
        AbstractC9528e.adcel(c16258e, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC9528e.adcel(applicationContext, "The provided context did not have an application context.");
        this.ad = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String attributionTag = (i < 30 || i < 30) ? null : context.getAttributionTag();
        this.vip = attributionTag;
        this.metrica = i >= 31 ? new C5389e(4, context.getAttributionSource()) : null;
        this.license = c13391e;
        this.appmetrica = interfaceC12516e;
        this.billing = c16258e.vip;
        this.purchase = new C7735e(c13391e, interfaceC12516e, attributionTag);
        C16680e license = C16680e.license(applicationContext);
        this.adcel = license;
        this.yandex = license.f32740e.getAndIncrement();
        this.startapp = c16258e.ad;
        HandlerC9134e handlerC9134e = license.f32734e;
        handlerC9134e.sendMessage(handlerC9134e.obtainMessage(7, this));
    }

    public final C12894e ad() {
        C12894e c12894e = new C12894e(10, false);
        Set set = Collections.EMPTY_SET;
        if (((C17548e) c12894e.f25751e) == null) {
            c12894e.f25751e = new C17548e(0);
        }
        ((C17548e) c12894e.f25751e).addAll(set);
        Context context = this.ad;
        c12894e.f25752e = context.getClass().getName();
        c12894e.f25750e = context.getPackageName();
        return c12894e;
    }

    public final C0560e appmetrica(int i, C0381e c0381e) {
        C8988e c8988e = new C8988e();
        C16680e c16680e = this.adcel;
        c16680e.getClass();
        c16680e.vip(c8988e, c0381e.vip, this);
        C13095e c13095e = new C13095e(new C16310e(i, c0381e, c8988e, this.startapp), c16680e.f32743e.get(), this);
        HandlerC9134e handlerC9134e = c16680e.f32734e;
        handlerC9134e.sendMessage(handlerC9134e.obtainMessage(4, c13095e));
        return c8988e.ad;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, eؔٔٓ] */
    public final C2580e license(Object obj, String str) {
        Looper looper = this.billing;
        AbstractC9528e.adcel(obj, "Listener must not be null");
        AbstractC9528e.adcel(looper, "Looper must not be null");
        ?? obj2 = new Object();
        obj2.ad = new ExecutorC3044e(looper);
        AbstractC9528e.adcel(obj, "Listener must not be null");
        AbstractC9528e.purchase(str);
        obj2.vip = new C9364e(obj, str);
        return obj2;
    }

    public final C0560e metrica(C9364e c9364e, int i) {
        AbstractC9528e.adcel(c9364e, "Listener key cannot be null.");
        C16680e c16680e = this.adcel;
        c16680e.getClass();
        C8988e c8988e = new C8988e();
        c16680e.vip(c8988e, i, this);
        C13095e c13095e = new C13095e(new C2302e(c9364e, c8988e), c16680e.f32743e.get(), this);
        HandlerC9134e handlerC9134e = c16680e.f32734e;
        handlerC9134e.sendMessage(handlerC9134e.obtainMessage(13, c13095e));
        return c8988e.ad;
    }

    public final C0560e vip(C10312e c10312e) {
        AbstractC9528e.adcel((C9364e) ((C2580e) ((C0462e) c10312e.f20361e).f2534e).vip, "Listener has already been released.");
        C7302e c7302e = (C7302e) c10312e.f20360e;
        AbstractC9528e.adcel((C9364e) c7302e.f14916e, "Listener has already been released.");
        C0462e c0462e = (C0462e) c10312e.f20361e;
        C16680e c16680e = this.adcel;
        c16680e.getClass();
        C8988e c8988e = new C8988e();
        c16680e.vip(c8988e, c0462e.f2532e, this);
        C13095e c13095e = new C13095e(new C2302e(new C11255e(c0462e, c7302e), c8988e), c16680e.f32743e.get(), this);
        HandlerC9134e handlerC9134e = c16680e.f32734e;
        handlerC9134e.sendMessage(handlerC9134e.obtainMessage(8, c13095e));
        return c8988e.ad;
    }
}
