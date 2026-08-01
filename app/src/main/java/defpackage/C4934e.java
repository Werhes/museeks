package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4934e implements InterfaceC6823e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6823e f10441e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10442e;

    public /* synthetic */ C4934e(InterfaceC6823e interfaceC6823e, int i) {
        this.f10442e = i;
        this.f10441e = interfaceC6823e;
    }

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        int i = this.f10442e;
        InterfaceC6823e interfaceC6823e = this.f10441e;
        switch (i) {
            case 0:
                Object obj = C13150e.adcel;
                return (InterfaceC0590e) ((AbstractC9621e) interfaceC6823e.get()).purchase();
            default:
                InterfaceScheduledExecutorServiceC1678e interfaceScheduledExecutorServiceC1678e = (InterfaceScheduledExecutorServiceC1678e) interfaceC6823e.get();
                interfaceScheduledExecutorServiceC1678e.getClass();
                CallableC14883e callableC14883e = CallableC14883e.license;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                RunnableFutureC9859e runnableFutureC9859e = new RunnableFutureC9859e(callableC14883e);
                return new ScheduledFutureC15846e(runnableFutureC9859e, ((C3598e) interfaceScheduledExecutorServiceC1678e).f8133e.schedule(runnableFutureC9859e, 10000L, timeUnit));
        }
    }
}
