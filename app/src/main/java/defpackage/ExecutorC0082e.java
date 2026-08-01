package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0082e implements Executor {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static volatile ExecutorC0082e f1249e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1251e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final ExecutorC0082e f1248e = new ExecutorC0082e(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ ExecutorC0082e f1250e = new ExecutorC0082e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ ExecutorC0082e f1247e = new ExecutorC0082e(3);

    public /* synthetic */ ExecutorC0082e(int i) {
        this.f1251e = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1251e) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
