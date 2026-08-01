package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC14110e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f27905e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f27906e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f27907e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f27908e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27909e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f27910e;

    public /* synthetic */ RunnableC14110e(ServiceC13230e serviceC13230e, C18424e c18424e, AbstractC5735e abstractC5735e, Bundle bundle, String str) {
        this.f27909e = 6;
        this.f27907e = serviceC13230e;
        this.f27906e = c18424e;
        this.f27905e = abstractC5735e;
        this.f27910e = bundle;
        this.f27908e = str;
    }

    public /* synthetic */ RunnableC14110e(ServiceC13230e serviceC13230e, C18424e c18424e, C8597e c8597e, String str, Bundle bundle) {
        this.f27909e = 7;
        this.f27907e = serviceC13230e;
        this.f27906e = c18424e;
        this.f27905e = c8597e;
        this.f27908e = str;
        this.f27910e = bundle;
    }

    public /* synthetic */ RunnableC14110e(ServiceC13230e serviceC13230e, String str, C18424e c18424e, C8597e c8597e, Bundle bundle) {
        this.f27909e = 5;
        this.f27907e = serviceC13230e;
        this.f27908e = str;
        this.f27906e = c18424e;
        this.f27905e = c8597e;
        this.f27910e = bundle;
    }

    public /* synthetic */ RunnableC14110e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f27909e = i;
        this.f27907e = obj;
        this.f27906e = obj2;
        this.f27908e = obj3;
        this.f27905e = obj4;
        this.f27910e = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12478e crashlytics;
        ListenableFuture appmetrica;
        C11753e c11753e = null;
        switch (this.f27909e) {
            case 0:
                C1839e c1839e = (C1839e) this.f27907e;
                EnumC7792e enumC7792e = (EnumC7792e) this.f27906e;
                String str = (String) this.f27908e;
                InterfaceC14388e interfaceC14388e = (InterfaceC14388e) this.f27905e;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f27910e;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC13717e adcel = AbstractC12909e.adcel();
                    C12478e c12478e = adcel instanceof C12478e ? (C12478e) adcel : null;
                    if (c12478e == null || (crashlytics = c12478e.crashlytics(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC13717e adcel2 = crashlytics.adcel();
                        try {
                            C1839e license = AbstractC15890e.license(c1839e, enumC7792e);
                            C13664e c13664e = C13664e.f27089e;
                            C9904e c9904e = new C9904e(str, license, c13664e, c13664e, interfaceC2141e, interfaceC14388e);
                            c9904e.mo2750extends();
                            c9904e.yandex();
                            Unit unit = Unit.INSTANCE;
                            crashlytics.isVip().ad();
                            return;
                        } finally {
                            AbstractC13717e.admob(adcel2);
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
            case 1:
                ((InterfaceC7251e) this.f27906e).run().ad(new RunnableC6795e((C11106e) this.f27907e, (AtomicBoolean) this.f27908e, (C11030e) this.f27905e, (AtomicBoolean) this.f27910e, 2), EnumC3320e.f7489e);
                return;
            case 2:
                AbstractC6560e abstractC6560e = (AbstractC6560e) this.f27907e;
                C15013e c15013e = (C15013e) this.f27906e;
                C15013e c15013e2 = (C15013e) this.f27908e;
                AbstractActivityC15824e abstractActivityC15824e = (AbstractActivityC15824e) this.f27905e;
                View view = (View) this.f27910e;
                abstractC6560e.vip(c15013e, c15013e2, abstractActivityC15824e.getWindow(), view, ((Boolean) c15013e.metrica.invoke(view.getResources())).booleanValue(), ((Boolean) c15013e2.metrica.invoke(view.getResources())).booleanValue());
                return;
            case 3:
                RunnableFutureC9859e runnableFutureC9859e = (RunnableFutureC9859e) this.f27907e;
                C0485e c0485e = (C0485e) this.f27906e;
                ListenableFuture listenableFuture = (ListenableFuture) this.f27908e;
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f27905e;
                ExecutorC7412e executorC7412e = (ExecutorC7412e) this.f27910e;
                if (runnableFutureC9859e.isDone()) {
                    c0485e.loadAd(listenableFuture);
                    return;
                } else {
                    if (listenableFuture2.isCancelled()) {
                        int i = ExecutorC7412e.f15173e;
                        if (executorC7412e.compareAndSet(EnumC10346e.f20422e, EnumC10346e.f20420e)) {
                            runnableFutureC9859e.cancel(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 4:
                ServiceC13230e serviceC13230e = (ServiceC13230e) this.f27907e;
                AtomicReference atomicReference = (AtomicReference) this.f27906e;
                C18424e c18424e = (C18424e) this.f27908e;
                C11753e c11753e2 = (C11753e) this.f27905e;
                C12594e c12594e = (C12594e) this.f27910e;
                atomicReference.set(serviceC13230e.f26249e.isVip(c18424e, c11753e2));
                c12594e.license();
                return;
            case 5:
                ServiceC13230e serviceC13230e2 = (ServiceC13230e) this.f27907e;
                String str2 = (String) this.f27908e;
                C18424e c18424e2 = (C18424e) this.f27906e;
                C8597e c8597e = (C8597e) this.f27905e;
                Bundle bundle = (Bundle) this.f27910e;
                C11858e c11858e = new C11858e(str2, Bundle.EMPTY);
                if (!serviceC13230e2.f26254e.m3021strictfp(c18424e2, c11858e)) {
                    c8597e.appmetrica();
                    return;
                }
                C6584e c6584e = serviceC13230e2.f26249e;
                C1439e c1439e = c6584e.appmetrica;
                c6584e.m2208native(c18424e2);
                c1439e.getClass();
                if (str2.length() == 0) {
                    appmetrica = AbstractC2017e.license(C1439e.ad());
                } else {
                    C14826e c14826e = c1439e.ad;
                    C15420e c15420e = AbstractC6731e.ad;
                    appmetrica = AbstractC8461e.appmetrica(2, AbstractC1497e.ad, c14826e, new C7914e(c1439e, c11858e, bundle, null, 11));
                }
                AbstractC2301e.amazon(appmetrica, "Callback.onCustomCommandOnHandler must return non-null future");
                appmetrica.ad(new RunnableC7410e(appmetrica, c8597e, 8), EnumC3320e.f7489e);
                return;
            case 6:
                EnumC3320e enumC3320e = EnumC3320e.f7489e;
                ServiceC13230e serviceC13230e3 = (ServiceC13230e) this.f27907e;
                C18424e c18424e3 = (C18424e) this.f27906e;
                AbstractC5735e abstractC5735e = (AbstractC5735e) this.f27905e;
                Bundle bundle2 = (Bundle) this.f27910e;
                String str3 = (String) this.f27908e;
                C6584e c6584e2 = serviceC13230e3.f26249e;
                if (!serviceC13230e3.f26254e.m3015new(c18424e3, 50003)) {
                    abstractC5735e.purchase(null);
                    return;
                }
                int i2 = 1;
                if (bundle2 != null) {
                    bundle2.setClassLoader(c6584e2.purchase.getClassLoader());
                    try {
                        int i3 = bundle2.getInt("android.media.browse.extra.PAGE");
                        int i4 = bundle2.getInt("android.media.browse.extra.PAGE_SIZE");
                        c11753e = AbstractC13256e.yandex(c6584e2.purchase, bundle2);
                        if (i3 >= 0 && i4 > 0) {
                            try {
                                try {
                                    C0485e m2550else = AbstractC9413e.m2550else(serviceC13230e3.f26249e.signatures(c18424e3, str3, i3, i4, c11753e), new C12574e(serviceC13230e3, i2));
                                    m2550else.ad(new RunnableC17492e(m2550else, abstractC5735e, i2), enumC3320e);
                                    return;
                                } catch (BadParcelableException unused) {
                                    c11753e = c11753e;
                                }
                            } catch (BadParcelableException unused2) {
                            }
                        }
                    } catch (BadParcelableException unused3) {
                    }
                }
                C0485e m2550else2 = AbstractC9413e.m2550else(serviceC13230e3.f26249e.signatures(c18424e3, str3, 0, Alert.DURATION_SHOW_INDEFINITELY, c11753e), new C12574e(serviceC13230e3, i2));
                m2550else2.ad(new RunnableC17492e(m2550else2, abstractC5735e, i2), enumC3320e);
                return;
            default:
                ServiceC13230e serviceC13230e4 = (ServiceC13230e) this.f27907e;
                C18424e c18424e4 = (C18424e) this.f27906e;
                C8597e c8597e2 = (C8597e) this.f27905e;
                String str4 = (String) this.f27908e;
                Bundle bundle3 = (Bundle) this.f27910e;
                if (!serviceC13230e4.f26254e.m3015new(c18424e4, 50005)) {
                    c8597e2.purchase(null);
                    return;
                }
                InterfaceC10645e interfaceC10645e = c18424e4.license;
                interfaceC10645e.getClass();
                C13340e c13340e = (C13340e) interfaceC10645e;
                synchronized (c13340e.f26586e) {
                    c13340e.f26583e.add(new C3970e(c18424e4, c18424e4.ad, str4, bundle3, c8597e2));
                }
                serviceC13230e4.f26249e.subs(c18424e4, str4, AbstractC13256e.yandex(serviceC13230e4.f26249e.purchase, bundle3));
                return;
        }
    }
}
