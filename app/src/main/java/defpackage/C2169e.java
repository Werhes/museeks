package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2169e implements InterfaceC18244e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C2169e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.InterfaceC18244e
    public final ListenableFuture apply(Object obj) {
        switch (this.ad) {
            case 0:
                C13400e c13400e = (C13400e) this.vip;
                int i = ((C4914e) obj).f10403e;
                if ((i == 29501 || i == 29537 || i == 29538 || i == 29539 || i == 29540 || i == 29541 || i == 29542 || i == 29543 || i == 29544) && !c13400e.yandex.vip()) {
                    c13400e.vip();
                }
                return C13747e.f27231e;
            case 1:
                C11493e c11493e = (C11493e) this.vip;
                c11493e.getClass();
                CallableC4347e callableC4347e = new CallableC4347e(c11493e, (C10228e) obj, 4);
                Executor ad = c11493e.ad.ad();
                RunnableFutureC9859e runnableFutureC9859e = new RunnableFutureC9859e(callableC4347e);
                ((C0918e) ad).execute(runnableFutureC9859e);
                return runnableFutureC9859e;
            case 2:
                return AbstractC2017e.appmetrica((ListenableFuture) ((C10040e) this.vip).appmetrica.get());
            case 3:
                return AbstractC2017e.license(((C2713e) this.vip).apply(obj));
            case 4:
                return ((C9664e) this.vip).appmetrica.m909e();
            default:
                IOException iOException = (IOException) this.vip;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
