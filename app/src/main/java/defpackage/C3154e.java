package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3154e implements InterfaceC1926e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinkedHashMap f7252e = new LinkedHashMap();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile Map f7251e = C9139e.f18290e;

    @Override // defpackage.InterfaceC1926e
    public final void Signature(InterfaceC9610e interfaceC9610e) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC7933e((InterfaceC1926e) entry.getKey(), interfaceC9610e, 0));
        }
    }

    public final void ad(InterfaceC1926e interfaceC1926e, ExecutorC17160e executorC17160e) {
        if (this.f7251e.containsKey(interfaceC1926e)) {
            throw new IllegalStateException((interfaceC1926e + " was already registered!").toString());
        }
        synchronized (this.f7252e) {
            this.f7252e.put(interfaceC1926e, executorC17160e);
            this.f7251e = AbstractC10064e.advert(this.f7252e);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void ads(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC6136e((InterfaceC1926e) entry.getKey(), interfaceC9610e, j, c7500e, 1));
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void advert(InterfaceC9610e interfaceC9610e) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC7933e((InterfaceC1926e) entry.getKey(), interfaceC9610e, 1));
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void crashlytics(InterfaceC9610e interfaceC9610e, long j, C10224e c10224e) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC15629e((InterfaceC1926e) entry.getKey(), interfaceC9610e, j, c10224e, 1));
        }
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: extends */
    public final void mo730extends(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC6136e((InterfaceC1926e) entry.getKey(), interfaceC9610e, j, c7500e, 0));
        }
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: goto */
    public final void mo731goto(InterfaceC9610e interfaceC9610e, long j, InterfaceC7172e interfaceC7172e) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC15629e((InterfaceC1926e) entry.getKey(), interfaceC9610e, j, interfaceC7172e, 0));
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void inmobi(InterfaceC9610e interfaceC9610e, int i) {
    }

    @Override // defpackage.InterfaceC1926e
    public final void isVip(InterfaceC9610e interfaceC9610e, long j, long j2) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC10239e((InterfaceC1926e) entry.getKey(), interfaceC9610e, j, j2, 1));
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void license(final InterfaceC9610e interfaceC9610e, final long j, final int i, final int i2) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            final InterfaceC1926e interfaceC1926e = (InterfaceC1926e) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: eؗۖۚ
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC1926e.this.license(interfaceC9610e, j, i, i2);
                }
            });
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void loadAd(InterfaceC9610e interfaceC9610e, long j) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC5316e(1, j, (InterfaceC1926e) entry.getKey(), interfaceC9610e));
        }
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: protected */
    public final void mo732protected(C9021e c9021e) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC16019e((InterfaceC1926e) entry.getKey(), c9021e, 21));
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void purchase(InterfaceC9610e interfaceC9610e, long j, long j2) {
    }

    @Override // defpackage.InterfaceC1926e
    public final void subs(InterfaceC9610e interfaceC9610e) {
        for (Map.Entry entry : this.f7251e.entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC7933e((InterfaceC1926e) entry.getKey(), interfaceC9610e, 2));
        }
    }

    public final void vip(InterfaceC1926e interfaceC1926e) {
        synchronized (this.f7252e) {
            this.f7252e.remove(interfaceC1926e);
            this.f7251e = AbstractC10064e.advert(this.f7252e);
            Unit unit = Unit.INSTANCE;
        }
    }
}
