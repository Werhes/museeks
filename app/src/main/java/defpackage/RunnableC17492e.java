package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC17492e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5735e f34308e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0485e f34309e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34310e;

    public /* synthetic */ RunnableC17492e(C0485e c0485e, AbstractC5735e abstractC5735e, int i) {
        this.f34310e = i;
        this.f34309e = c0485e;
        this.f34308e = abstractC5735e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34310e) {
            case 0:
                C0485e c0485e = this.f34309e;
                AbstractC5735e abstractC5735e = this.f34308e;
                try {
                    abstractC5735e.purchase((C11531e) c0485e.get());
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    AbstractC2803e.amazon("MLSLegacyStub", "Library operation failed", e);
                    abstractC5735e.purchase(null);
                    return;
                }
            default:
                C0485e c0485e2 = this.f34309e;
                AbstractC5735e abstractC5735e2 = this.f34308e;
                try {
                    List list = (List) c0485e2.get();
                    abstractC5735e2.purchase(list == null ? null : AbstractC1008e.billing(list));
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e2) {
                    AbstractC2803e.amazon("MLSLegacyStub", "Library operation failed", e2);
                    abstractC5735e2.purchase(null);
                    return;
                }
        }
    }
}
