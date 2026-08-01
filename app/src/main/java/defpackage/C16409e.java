package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16409e extends AbstractC9832e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32221e = AtomicIntegerFieldUpdater.newUpdater(C16409e.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Thread f32222e = Thread.currentThread();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public InterfaceC1232e f32223e;

    public static void smaato(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public final void advert() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32221e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        smaato(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                InterfaceC1232e interfaceC1232e = this.f32223e;
                if (interfaceC1232e != null) {
                    interfaceC1232e.ad();
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.AbstractC9832e
    public final void mopub(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f32221e;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                smaato(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f32222e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    @Override // defpackage.AbstractC9832e
    public final boolean startapp() {
        return true;
    }
}
