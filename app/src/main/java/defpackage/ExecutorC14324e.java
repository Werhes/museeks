package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۢۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC14324e implements Executor {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC3743e f28325e;

    public ExecutorC14324e(AbstractC3743e abstractC3743e) {
        this.f28325e = abstractC3743e;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC3743e abstractC3743e = this.f28325e;
        C2693e c2693e = C2693e.f6576e;
        if (AbstractC7214e.amazon(abstractC3743e, c2693e)) {
            AbstractC7214e.smaato(abstractC3743e, c2693e, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f28325e.toString();
    }
}
