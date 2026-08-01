package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٛٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1173e implements InterfaceC1381e, InterfaceC7898e, InterfaceC9307e, InterfaceC6786e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f3770e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Executor f3771e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f3772e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3773e;

    public C1173e(Executor executor, InterfaceC6786e interfaceC6786e) {
        this.f3773e = 0;
        this.f3770e = new Object();
        this.f3771e = executor;
        this.f3772e = interfaceC6786e;
    }

    public C1173e(Executor executor, InterfaceC7898e interfaceC7898e) {
        this.f3773e = 3;
        this.f3770e = new Object();
        this.f3771e = executor;
        this.f3772e = interfaceC7898e;
    }

    public C1173e(Executor executor, InterfaceC9307e interfaceC9307e) {
        this.f3773e = 2;
        this.f3770e = new Object();
        this.f3771e = executor;
        this.f3772e = interfaceC9307e;
    }

    public C1173e(Executor executor, InterfaceC12765e interfaceC12765e) {
        this.f3773e = 1;
        this.f3770e = new Object();
        this.f3771e = executor;
        this.f3772e = interfaceC12765e;
    }

    public C1173e(Executor executor, InterfaceC16794e interfaceC16794e, C0560e c0560e) {
        this.f3773e = 4;
        this.f3771e = executor;
        this.f3770e = interfaceC16794e;
        this.f3772e = c0560e;
    }

    private final void appmetrica(C0560e c0560e) {
        if (c0560e.advert()) {
            synchronized (this.f3770e) {
                try {
                    if (((InterfaceC7898e) this.f3772e) == null) {
                        return;
                    }
                    this.f3771e.execute(new RunnableC12554e((Object) this, (Object) c0560e, false, 17));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final void metrica(C0560e c0560e) {
        if (c0560e.advert() || c0560e.license) {
            return;
        }
        synchronized (this.f3770e) {
            try {
                if (((InterfaceC9307e) this.f3772e) == null) {
                    return;
                }
                this.f3771e.execute(new RunnableC12554e((Object) this, (Object) c0560e, false, 10));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void vip(C0560e c0560e) {
        synchronized (this.f3770e) {
        }
        this.f3771e.execute(new RunnableC12554e((Object) this, (Object) c0560e, false, 6));
    }

    @Override // defpackage.InterfaceC1381e
    public final void ad(C0560e c0560e) {
        switch (this.f3773e) {
            case 0:
                if (c0560e.license) {
                    synchronized (this.f3770e) {
                        try {
                            if (((InterfaceC6786e) this.f3772e) != null) {
                                this.f3771e.execute(new RunnableC16721e(12, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                vip(c0560e);
                return;
            case 2:
                metrica(c0560e);
                return;
            case 3:
                appmetrica(c0560e);
                return;
            default:
                this.f3771e.execute(new RunnableC12554e((Object) this, (Object) c0560e, false, 24));
                return;
        }
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        ((C0560e) this.f3772e).Signature(exc);
    }

    @Override // defpackage.InterfaceC7898e
    public void license(Object obj) {
        ((C0560e) this.f3772e).amazon(obj);
    }

    @Override // defpackage.InterfaceC6786e
    public void subscription() {
        ((C0560e) this.f3772e).admob();
    }
}
