package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6122e {
    public static final Range admob = C6884e.yandex;
    public Executor Signature;
    public final Object ad = new Object();
    public final C9689e adcel;
    public final C7169e advert;
    public C0167e amazon;
    public final InterfaceC2881e appmetrica;
    public final int billing;
    public final Range license;
    public InterfaceC16996e loadAd;
    public final C14677e metrica;
    public final C7169e mopub;
    public final boolean purchase;
    public final C1385e smaato;
    public final C7169e startapp;
    public final Size vip;
    public final C9689e yandex;

    public C6122e(Size size, InterfaceC2881e interfaceC2881e, boolean z, C14677e c14677e, int i, Range range, RunnableC2275e runnableC2275e) {
        this.vip = size;
        this.appmetrica = interfaceC2881e;
        this.purchase = z;
        AbstractC4265e.license(c14677e.vip(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.metrica = c14677e;
        this.billing = i;
        this.license = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i2 = 0;
        C9689e purchase = AbstractC5750e.purchase(new InterfaceC12523e() { // from class: eٌٟٔ
            @Override // defpackage.InterfaceC12523e
            public final Object amazon(C7169e c7169e) {
                switch (i2) {
                    case 0:
                        atomicReference.set(c7169e);
                        return str + "-cancellation";
                    case 1:
                        atomicReference.set(c7169e);
                        return str + "-status";
                    default:
                        atomicReference.set(c7169e);
                        return str + "-Surface";
                }
            }
        });
        C7169e c7169e = (C7169e) atomicReference.get();
        c7169e.getClass();
        this.advert = c7169e;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i3 = 1;
        C9689e purchase2 = AbstractC5750e.purchase(new InterfaceC12523e() { // from class: eٌٟٔ
            @Override // defpackage.InterfaceC12523e
            public final Object amazon(C7169e c7169e2) {
                switch (i3) {
                    case 0:
                        atomicReference2.set(c7169e2);
                        return str + "-cancellation";
                    case 1:
                        atomicReference2.set(c7169e2);
                        return str + "-status";
                    default:
                        atomicReference2.set(c7169e2);
                        return str + "-Surface";
                }
            }
        });
        this.adcel = purchase2;
        purchase2.ad(new RunnableC17144e(purchase2, new C3168e(c7169e, purchase, 17), 0), AbstractC3062e.billing());
        C7169e c7169e2 = (C7169e) atomicReference2.get();
        c7169e2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i4 = 2;
        C9689e purchase3 = AbstractC5750e.purchase(new InterfaceC12523e() { // from class: eٌٟٔ
            @Override // defpackage.InterfaceC12523e
            public final Object amazon(C7169e c7169e22) {
                switch (i4) {
                    case 0:
                        atomicReference3.set(c7169e22);
                        return str + "-cancellation";
                    case 1:
                        atomicReference3.set(c7169e22);
                        return str + "-status";
                    default:
                        atomicReference3.set(c7169e22);
                        return str + "-Surface";
                }
            }
        });
        this.yandex = purchase3;
        C7169e c7169e3 = (C7169e) atomicReference3.get();
        c7169e3.getClass();
        this.startapp = c7169e3;
        C1385e c1385e = new C1385e(this, size);
        this.smaato = c1385e;
        ListenableFuture smaato = AbstractC15792e.smaato(c1385e.appmetrica);
        purchase3.ad(new RunnableC17144e(purchase3, new C6029e(6, smaato, c7169e2, str), 0), AbstractC3062e.billing());
        smaato.ad(new RunnableC4327e(this, 1), AbstractC3062e.billing());
        ExecutorC0082e billing = AbstractC3062e.billing();
        AtomicReference atomicReference4 = new AtomicReference(null);
        C9689e purchase4 = AbstractC5750e.purchase(new C18070e(this, atomicReference4, 26));
        purchase4.ad(new RunnableC17144e(purchase4, new C2691e(21, runnableC2275e), 0), billing);
        C7169e c7169e4 = (C7169e) atomicReference4.get();
        c7169e4.getClass();
        this.mopub = c7169e4;
    }

    public final void ad(final Surface surface, Executor executor, final InterfaceC0867e interfaceC0867e) {
        if (!surface.isValid()) {
            final int i = 0;
            executor.execute(new Runnable() { // from class: eٓۤٝ
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            interfaceC0867e.accept(new C17756e(2, surface));
                            return;
                        case 1:
                            interfaceC0867e.accept(new C17756e(3, surface));
                            return;
                        default:
                            interfaceC0867e.accept(new C17756e(4, surface));
                            return;
                    }
                }
            });
            return;
        }
        if (!this.startapp.ad(surface)) {
            C9689e c9689e = this.yandex;
            if (!c9689e.isCancelled()) {
                AbstractC4265e.yandex(null, c9689e.f19184e.isDone());
                try {
                    c9689e.get();
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: eٓۤٝ
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    interfaceC0867e.accept(new C17756e(2, surface));
                                    return;
                                case 1:
                                    interfaceC0867e.accept(new C17756e(3, surface));
                                    return;
                                default:
                                    interfaceC0867e.accept(new C17756e(4, surface));
                                    return;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i3 = 2;
                    executor.execute(new Runnable() { // from class: eٓۤٝ
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    interfaceC0867e.accept(new C17756e(2, surface));
                                    return;
                                case 1:
                                    interfaceC0867e.accept(new C17756e(3, surface));
                                    return;
                                default:
                                    interfaceC0867e.accept(new C17756e(4, surface));
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        C9689e c9689e2 = this.adcel;
        c9689e2.ad(new RunnableC17144e(c9689e2, new C5891e(interfaceC0867e, surface, 18), 0), executor);
    }

    public final boolean metrica() {
        return this.startapp.metrica(new C2123e("Surface request will not complete.", 4));
    }

    public final void vip(Executor executor, InterfaceC16996e interfaceC16996e) {
        C0167e c0167e;
        synchronized (this.ad) {
            this.loadAd = interfaceC16996e;
            this.Signature = executor;
            c0167e = this.amazon;
        }
        if (c0167e != null) {
            executor.execute(new RunnableC13809e(interfaceC16996e, c0167e, 1));
        }
    }
}
