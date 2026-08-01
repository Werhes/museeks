package defpackage;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۘؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7394e implements InterfaceC4075e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f15158e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15159e;

    public /* synthetic */ C7394e(int i, Object obj) {
        this.f15159e = i;
        this.f15158e = obj;
    }

    @Override // defpackage.InterfaceC4075e
    public final void ad(Throwable th) {
        switch (this.f15159e) {
            case 0:
                ((ScheduledFuture) this.f15158e).cancel(false);
                return;
            case 1:
                ((Function1) this.f15158e).invoke(th);
                return;
            default:
                ((InterfaceC1232e) this.f15158e).ad();
                return;
        }
    }

    public final String toString() {
        switch (this.f15159e) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f15158e) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f15158e).getClass().getSimpleName() + '@' + AbstractC7111e.purchase(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC1232e) this.f15158e) + ']';
        }
    }
}
