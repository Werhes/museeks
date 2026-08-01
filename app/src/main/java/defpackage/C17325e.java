package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۡؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17325e extends AbstractC3743e implements InterfaceC13591e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34004e = AtomicIntegerFieldUpdater.newUpdater(C17325e.class, "runningWorkers$volatile");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f34005e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13591e f34006e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC3743e f34007e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Object f34008e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C3834e f34009e;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C17325e(AbstractC3743e abstractC3743e, int i) {
        InterfaceC13591e interfaceC13591e = abstractC3743e instanceof InterfaceC13591e ? (InterfaceC13591e) abstractC3743e : null;
        this.f34006e = interfaceC13591e == null ? AbstractC12387e.ad : interfaceC13591e;
        this.f34007e = abstractC3743e;
        this.f34005e = i;
        this.f34009e = new C3834e();
        this.f34008e = new Object();
    }

    @Override // defpackage.InterfaceC13591e
    public final InterfaceC1232e ad(long j, Runnable runnable, InterfaceC8850e interfaceC8850e) {
        return this.f34006e.ad(j, runnable, interfaceC8850e);
    }

    @Override // defpackage.AbstractC3743e
    public final void advert(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        Runnable m4304e;
        this.f34009e.ad(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34004e;
        if (atomicIntegerFieldUpdater.get(this) >= this.f34005e || !m4305e() || (m4304e = m4304e()) == null) {
            return;
        }
        try {
            AbstractC7214e.smaato(this.f34007e, this, new RunnableC17144e(this, m4304e, false, 13));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final Runnable m4304e() {
        while (true) {
            Runnable runnable = (Runnable) this.f34009e.license();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f34008e) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34004e;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f34009e.metrica() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public final boolean m4305e() {
        synchronized (this.f34008e) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34004e;
            if (atomicIntegerFieldUpdater.get(this) >= this.f34005e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.InterfaceC13591e
    public final void license(long j, C13578e c13578e) {
        this.f34006e.license(j, c13578e);
    }

    @Override // defpackage.AbstractC3743e
    public final void loadAd(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        Runnable m4304e;
        this.f34009e.ad(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34004e;
        if (atomicIntegerFieldUpdater.get(this) >= this.f34005e || !m4305e() || (m4304e = m4304e()) == null) {
            return;
        }
        try {
            this.f34007e.loadAd(this, new RunnableC17144e(this, m4304e, false, 13));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.AbstractC3743e
    /* renamed from: static */
    public final AbstractC3743e mo685static(int i) {
        AbstractC2356e.vip(i);
        return i >= this.f34005e ? this : super.mo685static(i);
    }

    @Override // defpackage.AbstractC3743e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34007e);
        sb.append(".limitedParallelism(");
        return AbstractC1786e.pro(sb, this.f34005e, ')');
    }
}
