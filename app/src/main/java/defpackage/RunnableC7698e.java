package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC7698e extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractRunnableC14981e f15622e;

    public RunnableC7698e(AbstractRunnableC14981e abstractRunnableC14981e) {
        this.f15622e = abstractRunnableC14981e;
    }

    public static void ad(RunnableC7698e runnableC7698e, Thread thread) {
        runnableC7698e.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f15622e.toString();
    }
}
