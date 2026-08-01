package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2448e extends AbstractC18001e implements InterfaceC9543e, InterfaceC0888e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14137e f6257e;

    public C2448e(InterfaceC8850e interfaceC8850e, C14137e c14137e) {
        super(interfaceC8850e, true);
        this.f6257e = c14137e;
    }

    @Override // defpackage.C6467e, defpackage.InterfaceC10500e
    public final void Signature(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C2808e(firebase(), null, this);
        }
        applovin(cancellationException);
    }

    @Override // defpackage.InterfaceC15080e
    public final Object amazon(Object obj) {
        return this.f6257e.amazon(obj);
    }

    @Override // defpackage.C6467e
    public final void applovin(Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = new C2808e(firebase(), th, this);
        }
        this.f6257e.smaato(cancellationException, true);
        isPro(cancellationException);
    }

    @Override // defpackage.InterfaceC10441e
    public final C11106e appmetrica() {
        return this.f6257e.appmetrica();
    }

    @Override // defpackage.AbstractC18001e
    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public final void mo852e(Object obj) {
        this.f6257e.startapp(null);
    }

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public final void m853e(C16430e c16430e) {
        C14137e c14137e = this.f6257e;
        c14137e.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C14137e.f27954e;
        while (!atomicReferenceFieldUpdater.compareAndSet(c14137e, null, c16430e)) {
            if (atomicReferenceFieldUpdater.get(c14137e) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(c14137e);
                    C2443e c2443e = AbstractC11295e.admob;
                    if (obj != c2443e) {
                        if (obj == AbstractC11295e.subscription) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    C2443e c2443e2 = AbstractC11295e.subscription;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c14137e, c2443e, c2443e2)) {
                        if (atomicReferenceFieldUpdater.get(c14137e) != c2443e) {
                            break;
                        }
                    }
                    c16430e.invoke(c14137e.signatures());
                    return;
                }
            }
        }
    }

    @Override // defpackage.AbstractC18001e
    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public final void mo854e(Throwable th, boolean z) {
        if (this.f6257e.smaato(th, false) || z) {
            return;
        }
        AbstractC15849e.license(this.f35291e, th);
    }

    @Override // defpackage.InterfaceC10441e
    public final C18221e iterator() {
        C14137e c14137e = this.f6257e;
        c14137e.getClass();
        return new C18221e(c14137e);
    }

    @Override // defpackage.InterfaceC15080e
    public final Object metrica(InterfaceC5083e interfaceC5083e, Object obj) {
        return this.f6257e.metrica(interfaceC5083e, obj);
    }

    @Override // defpackage.InterfaceC10441e
    public final Object mopub(InterfaceC5083e interfaceC5083e) {
        return this.f6257e.mopub(interfaceC5083e);
    }

    @Override // defpackage.InterfaceC15080e
    public final boolean startapp(Throwable th) {
        return this.f6257e.smaato(th, false);
    }

    @Override // defpackage.InterfaceC10441e
    public final Object subscription(AbstractC7185e abstractC7185e) {
        C14137e c14137e = this.f6257e;
        c14137e.getClass();
        return C14137e.m3754goto(c14137e, abstractC7185e);
    }

    @Override // defpackage.InterfaceC10441e
    public final Object yandex() {
        return this.f6257e.yandex();
    }
}
