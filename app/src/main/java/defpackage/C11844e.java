package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11844e {
    public final C17489e ad;
    public final C15024e advert;
    public final boolean appmetrica;
    public final Object billing;
    public final Function2 license;
    public final C13770e metrica;
    public final C14995e mopub;
    public final AbstractC7919e purchase;
    public final AbstractC5830e vip;
    public final AtomicReference yandex = new AtomicReference(EnumC15242e.f30154e);
    public long startapp = AbstractC15390e.appmetrica();
    public C12618e adcel = AbstractC1710e.ad;

    public C11844e(C17489e c17489e, AbstractC5830e abstractC5830e, C13770e c13770e, C4799e c4799e, Function2 function2, boolean z, AbstractC7919e abstractC7919e, Object obj) {
        this.ad = c17489e;
        this.vip = abstractC5830e;
        this.metrica = c13770e;
        this.license = function2;
        this.appmetrica = z;
        this.purchase = abstractC7919e;
        this.billing = obj;
        C14995e c14995e = new C14995e();
        c14995e.mopub(c4799e, c13770e.applovin());
        this.mopub = c14995e;
        this.advert = new C15024e(abstractC7919e.f16034e);
    }

    public final void ad() {
        AtomicReference atomicReference = this.yandex;
        try {
            switch (((EnumC15242e) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    vip();
                    EnumC15242e enumC15242e = EnumC15242e.f30160e;
                    EnumC15242e enumC15242e2 = EnumC15242e.f30159e;
                    while (!atomicReference.compareAndSet(enumC15242e, enumC15242e2)) {
                        if (atomicReference.get() != enumC15242e) {
                            AbstractC6536e.vip("Unexpected state change from: " + enumC15242e + " to: " + enumC15242e2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new C14803e(10);
            }
        } catch (Exception e) {
            atomicReference.set(EnumC15242e.f30158e);
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public final boolean appmetrica(InterfaceC15992e interfaceC15992e) {
        EnumC15242e enumC15242e = EnumC15242e.f30153e;
        AtomicReference atomicReference = this.yandex;
        try {
            int ordinal = ((EnumC15242e) atomicReference.get()).ordinal();
            C17489e c17489e = this.ad;
            AbstractC5830e abstractC5830e = this.vip;
            EnumC15242e enumC15242e2 = EnumC15242e.f30157e;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    C13770e c13770e = this.metrica;
                    boolean z = this.appmetrica;
                    if (z) {
                        c13770e.applovin = 0;
                        c13770e.isPro = true;
                    }
                    try {
                        this.adcel = abstractC5830e.vip(c17489e, interfaceC15992e, this.license);
                        EnumC15242e enumC15242e3 = EnumC15242e.f30154e;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC15242e3, enumC15242e2)) {
                                if (atomicReference.get() != enumC15242e3) {
                                    AbstractC6536e.vip("Unexpected state change from: " + enumC15242e3 + " to: " + enumC15242e2 + '.');
                                }
                            }
                        }
                        if (this.adcel.yandex()) {
                            license();
                        }
                        return metrica();
                    } finally {
                        if (z) {
                            c13770e.remoteconfig();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(enumC15242e2, enumC15242e)) {
                            if (atomicReference.get() != enumC15242e2) {
                                AbstractC6536e.vip("Unexpected state change from: " + enumC15242e2 + " to: " + enumC15242e + '.');
                            }
                        }
                    }
                    long j = this.startapp;
                    try {
                        this.startapp = AbstractC15390e.appmetrica();
                        this.adcel = abstractC5830e.amazon(c17489e, interfaceC15992e, this.adcel);
                        this.startapp = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC15242e, enumC15242e2)) {
                                if (atomicReference.get() != enumC15242e) {
                                    AbstractC6536e.vip("Unexpected state change from: " + enumC15242e + " to: " + enumC15242e2 + '.');
                                }
                            }
                        }
                        if (this.adcel.yandex()) {
                            license();
                        }
                        return metrica();
                    } catch (Throwable th) {
                        this.startapp = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC15242e, enumC15242e2)) {
                                if (atomicReference.get() != enumC15242e) {
                                    AbstractC6536e.vip("Unexpected state change from: " + enumC15242e + " to: " + enumC15242e2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    AbstractC1889e.vip("Recursive call to resume()");
                    throw new C14803e(9);
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new C14803e(10);
            }
        } catch (Exception e) {
            atomicReference.set(EnumC15242e.f30158e);
            throw e;
        }
    }

    public final void license() {
        EnumC15242e enumC15242e;
        EnumC15242e enumC15242e2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.yandex;
            enumC15242e = EnumC15242e.f30157e;
            enumC15242e2 = EnumC15242e.f30160e;
            if (atomicReference.compareAndSet(enumC15242e, enumC15242e2)) {
                z = true;
                break;
            } else if (atomicReference.get() != enumC15242e) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        AbstractC6536e.vip("Unexpected state change from: " + enumC15242e + " to: " + enumC15242e2 + '.');
    }

    public final boolean metrica() {
        return ((EnumC15242e) this.yandex.get()).compareTo(EnumC15242e.f30160e) >= 0;
    }

    public final void vip() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.billing) {
                try {
                    this.advert.isPro(this.purchase, this.mopub);
                    this.mopub.appmetrica();
                    this.mopub.purchase();
                    this.mopub.license();
                    this.ad.f34293e = null;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    this.mopub.license();
                    this.ad.f34293e = null;
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }
}
