package defpackage;

import android.os.Handler;
import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۜۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17280e {
    public final InterfaceC18435e ad;
    public final Executor appmetrica;
    public final C5363e billing;
    public final AbstractC3743e license;
    public final AbstractC3743e metrica;
    public final AbstractC3743e purchase;
    public final InterfaceC18435e vip;
    public final C5363e yandex;

    public C17280e(InterfaceC18435e interfaceC18435e, InterfaceC18435e interfaceC18435e2, AbstractC3743e abstractC3743e, AbstractC3743e abstractC3743e2, Executor executor, AbstractC3743e abstractC3743e3, Function0 function0, C3428e c3428e) {
        this.ad = interfaceC18435e;
        this.vip = interfaceC18435e2;
        this.metrica = abstractC3743e;
        this.license = abstractC3743e2;
        this.appmetrica = executor;
        this.purchase = abstractC3743e3;
        this.billing = new C5363e(new C1319e(11, function0));
        this.yandex = new C5363e(new C5671e(21, c3428e));
    }

    public final Handler ad() {
        return (Handler) this.billing.getValue();
    }

    public final Object vip(long j, Function1 function1) {
        try {
            return AbstractC5336e.yandex(this.metrica, new C2454e(this, function1, j, null));
        } catch (InterruptedException e) {
            Log.i("CXCP", "runBlockingCheckedOrNull cancelled by thread interruption", e);
            return null;
        }
    }
}
