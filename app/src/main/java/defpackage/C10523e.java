package defpackage;

import io.realm.kotlin.internal.interop.NativePointer;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10523e implements InterfaceC17541e {
    public final NativePointer ad;
    public final ReentrantLock vip = new ReentrantLock();
    public final C2673e metrica = AbstractC14430e.metrica(true);

    public C10523e(NativePointer nativePointer) {
        this.ad = nativePointer;
    }

    @Override // defpackage.InterfaceC17541e
    public final void cancel() {
        C2673e c2673e = this.metrica;
        ReentrantLock reentrantLock = this.vip;
        reentrantLock.lock();
        try {
            if (c2673e.vip()) {
                this.ad.release();
            }
            c2673e.ad = 0;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
