package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12466e extends AbstractC4874e implements InterfaceC5305e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24955e = AtomicIntegerFieldUpdater.newUpdater(AbstractC12466e.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f24956e;

    public AbstractC12466e(long j, AbstractC12466e abstractC12466e, int i) {
        super(abstractC12466e);
        this.f24956e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final boolean adcel() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f24955e;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == billing() && metrica() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public abstract int billing();

    @Override // defpackage.AbstractC4874e
    public final boolean license() {
        return f24955e.get(this) == billing() && metrica() != null;
    }

    public final boolean purchase() {
        return f24955e.addAndGet(this, -65536) == billing() && metrica() != null;
    }

    public final void startapp() {
        if (f24955e.incrementAndGet(this) == billing()) {
            appmetrica();
        }
    }

    public abstract void yandex(int i, InterfaceC8850e interfaceC8850e);
}
