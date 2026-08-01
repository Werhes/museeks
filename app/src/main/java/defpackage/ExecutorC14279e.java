package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC14279e implements Executor {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28247e;

    public /* synthetic */ ExecutorC14279e(int i) {
        this.f28247e = i;
    }

    private final void ad(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f28247e) {
            case 0:
                C9129e.m2520class().adcel.mopub.execute(runnable);
                return;
            case 1:
                return;
            default:
                runnable.run();
                return;
        }
    }
}
