package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12898e implements InterfaceC18519e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25754e = AtomicIntegerFieldUpdater.newUpdater(AbstractC12898e.class, "_interestedOps");

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AtomicBoolean f25756e = new AtomicBoolean(false);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2488e f25755e = new Object();
    private volatile /* synthetic */ int _interestedOps = 0;

    public final void Signature(EnumC16368e enumC16368e, boolean z) {
        int i;
        int i2 = enumC16368e.f32164e;
        do {
            i = this._interestedOps;
        } while (!f25754e.compareAndSet(this, i, z ? i | i2 : (~i2) & i));
    }

    public void ad() {
        close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f25756e.compareAndSet(false, true)) {
            this._interestedOps = 0;
            C2488e c2488e = this.f25755e;
            for (EnumC16368e enumC16368e : EnumC16368e.f32159e) {
                c2488e.getClass();
                InterfaceC1148e interfaceC1148e = (InterfaceC1148e) C2488e.ad[enumC16368e.ordinal()].getAndSet(c2488e, null);
                if (interfaceC1148e != null) {
                    interfaceC1148e.billing(new C12763e(new C9719e("Closed channel.", 0)));
                }
            }
        }
    }

    public final int purchase() {
        return this._interestedOps;
    }
}
