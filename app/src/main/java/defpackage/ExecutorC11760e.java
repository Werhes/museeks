package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC11760e implements Executor {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6584e f23631e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23632e;

    public /* synthetic */ ExecutorC11760e(C6584e c6584e, int i) {
        this.f23632e = i;
        this.f23631e = c6584e;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f23632e) {
            case 0:
                C6584e.metrica(this.f23631e, runnable);
                return;
            case 1:
                AbstractC9413e.m2565strictfp(this.f23631e.advert, runnable);
                return;
            default:
                AbstractC9413e.m2565strictfp(this.f23631e.advert, runnable);
                return;
        }
    }
}
