package defpackage;

import java.util.function.IntConsumer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۢٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1407e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f4218e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ IntConsumer f4219e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4220e;

    public /* synthetic */ RunnableC1407e(IntConsumer intConsumer, int i, int i2) {
        this.f4220e = i2;
        this.f4219e = intConsumer;
        this.f4218e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4220e) {
            case 0:
                this.f4219e.accept(this.f4218e);
                return;
            default:
                this.f4219e.accept(this.f4218e);
                return;
        }
    }
}
