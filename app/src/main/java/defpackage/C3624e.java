package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۛؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3624e extends AbstractC18001e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AbstractC11092e f8166e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Thread f8167e;

    public C3624e(InterfaceC8850e interfaceC8850e, Thread thread, AbstractC11092e abstractC11092e) {
        super(interfaceC8850e, true);
        this.f8167e = thread;
        this.f8166e = abstractC11092e;
    }

    @Override // defpackage.C6467e
    public final void remoteconfig(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f8167e;
        if (AbstractC7890e.billing(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
