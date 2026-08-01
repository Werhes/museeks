package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC14670e extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final RunnableC15255e f28908e;

    public /* synthetic */ RunnableC14670e(RunnableC15255e runnableC15255e) {
        this.f28908e = runnableC15255e;
    }

    public final /* synthetic */ void ad(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f28908e.toString();
    }
}
