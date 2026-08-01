package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13150e {
    public final C15024e ad = new C15024e(19);
    public final InterfaceC6823e appmetrica;
    public final C10040e billing;
    public final InterfaceC6823e license;
    public final InterfaceC6823e metrica;
    public final InterfaceC6823e purchase;
    public final C5590e startapp;
    public final Context vip;
    public final InterfaceC6823e yandex;
    public static final Object adcel = new Object();
    public static final AtomicReference mopub = new AtomicReference();
    public static volatile C13150e advert = null;
    public static final InterfaceC6823e smaato = AbstractC5209e.billing(C2986e.f7028e);

    public C13150e(Context context, InterfaceC6823e interfaceC6823e, InterfaceC6823e interfaceC6823e2, InterfaceC6823e interfaceC6823e3, InterfaceC6823e interfaceC6823e4, InterfaceC6823e interfaceC6823e5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        interfaceC6823e.getClass();
        interfaceC6823e2.getClass();
        interfaceC6823e3.getClass();
        interfaceC6823e4.getClass();
        interfaceC6823e5.getClass();
        InterfaceC6823e billing = AbstractC5209e.billing(interfaceC6823e);
        InterfaceC6823e billing2 = AbstractC5209e.billing(interfaceC6823e2);
        InterfaceC6823e billing3 = AbstractC5209e.billing(new C4934e(interfaceC6823e3, 0));
        InterfaceC6823e billing4 = AbstractC5209e.billing(interfaceC6823e4);
        InterfaceC6823e billing5 = AbstractC5209e.billing(interfaceC6823e5);
        this.vip = applicationContext;
        this.metrica = billing;
        this.license = billing2;
        this.appmetrica = billing3;
        this.purchase = billing4;
        this.billing = new C10040e(applicationContext, billing, billing4, billing2);
        this.yandex = billing5;
        this.startapp = new C5590e(applicationContext, billing, billing3, billing2);
    }

    public static void vip() {
        AbstractC0179e.license();
        if (mopub.get() == null && AbstractC0179e.license == null) {
            AbstractC0179e.license = new C2123e(15);
        }
    }

    public final InterfaceScheduledExecutorServiceC1678e ad() {
        return (InterfaceScheduledExecutorServiceC1678e) this.metrica.get();
    }
}
