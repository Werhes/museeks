package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC5579e extends AbstractBinderC7295e {
    public final HandlerC9134e appmetrica;
    public final AtomicReference license;

    public BinderC5579e(C7568e c7568e) {
        this.license = new AtomicReference(c7568e);
        this.appmetrica = new HandlerC9134e(c7568e.license, 6);
    }

    @Override // defpackage.InterfaceC12658e
    public final void applovin(int i) {
        if (((C7568e) this.license.get()) == null) {
            return;
        }
        synchronized (C7568e.f15393new) {
        }
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: break, reason: not valid java name */
    public final void mo1943break(String str, byte[] bArr) {
        if (((C7568e) this.license.get()) == null) {
            return;
        }
        C18482e c18482e = C7568e.f15392final;
        C7568e.f15392final.vip("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: const, reason: not valid java name */
    public final void mo1944const(int i) {
        C7568e c7568e = null;
        C7568e c7568e2 = (C7568e) this.license.getAndSet(null);
        if (c7568e2 != null) {
            c7568e2.f15396break = -1;
            c7568e2.f15395abstract = -1;
            c7568e2.subs = null;
            c7568e2.f15405native = null;
            c7568e2.f15409try = 0.0d;
            c7568e2.crashlytics();
            c7568e2.f15401extends = false;
            c7568e2.f15406protected = null;
            c7568e = c7568e2;
        }
        if (c7568e == null) {
            return;
        }
        C7568e.f15392final.vip("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
        if (i != 0) {
            int i2 = c7568e.isPro.get();
            HandlerC3262e handlerC3262e = c7568e.billing;
            handlerC3262e.sendMessage(handlerC3262e.obtainMessage(6, i2, 2));
        }
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eؒ٘ؗ, reason: contains not printable characters */
    public final void mo1945e(int i) {
        C7568e c7568e = (C7568e) this.license.get();
        if (c7568e == null) {
            return;
        }
        c7568e.f15400default = null;
        c7568e.f15403implements = null;
        synchronized (C7568e.f15393new) {
        }
        if (c7568e.firebase != null) {
            this.appmetrica.post(new RunnableC9280e(this, c7568e, i));
        }
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eؔٚۚ, reason: contains not printable characters */
    public final void mo1946e(int i) {
        if (((C7568e) this.license.get()) == null) {
            return;
        }
        synchronized (C7568e.f15393new) {
        }
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eِؕٛ, reason: contains not printable characters */
    public final void mo1947e() {
        C7568e.f15392final.vip("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eٌۡٔ, reason: contains not printable characters */
    public final void mo1948e(C18383e c18383e) {
        C7568e c7568e = (C7568e) this.license.get();
        if (c7568e == null) {
            return;
        }
        C7568e.f15392final.vip("onApplicationStatusChanged", new Object[0]);
        this.appmetrica.post(new RunnableC12554e(28, this, c7568e, c18383e));
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eٍؓۙ, reason: contains not printable characters */
    public final void mo1949e(C17005e c17005e, String str, String str2, boolean z) {
        C7568e c7568e = (C7568e) this.license.get();
        if (c7568e == null) {
            return;
        }
        c7568e.subs = c17005e;
        c7568e.f15400default = c17005e.f33314e;
        c7568e.f15403implements = str2;
        c7568e.f15405native = str;
        synchronized (C7568e.f15394super) {
        }
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eٍٟٔ, reason: contains not printable characters */
    public final void mo1950e(int i, long j) {
        C7568e c7568e = (C7568e) this.license.get();
        if (c7568e == null) {
            return;
        }
        c7568e.firebase(i, j);
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eۣۣٔ, reason: contains not printable characters */
    public final void mo1951e(long j) {
        C7568e c7568e = (C7568e) this.license.get();
        if (c7568e == null) {
            return;
        }
        c7568e.firebase(0, j);
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public final void mo1952e(int i) {
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: finally, reason: not valid java name */
    public final void mo1953finally(C17448e c17448e) {
        C7568e c7568e = (C7568e) this.license.get();
        if (c7568e == null) {
            return;
        }
        C7568e.f15392final.vip("onDeviceStatusChanged", new Object[0]);
        this.appmetrica.post(new RunnableC12554e(27, this, c7568e, c17448e));
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: import, reason: not valid java name */
    public final void mo1954import(String str, String str2) {
        C7568e c7568e = (C7568e) this.license.get();
        if (c7568e == null) {
            return;
        }
        C7568e.f15392final.vip("Receive (type=text, ns=%s) %s", str, str2);
        this.appmetrica.post(new RunnableC11666e(this, c7568e, str, str2));
    }

    @Override // defpackage.InterfaceC12658e
    public final void mopub(int i) {
        if (((C7568e) this.license.get()) == null) {
            return;
        }
        synchronized (C7568e.f15394super) {
        }
    }

    @Override // defpackage.InterfaceC12658e
    public final void vip(int i) {
    }
}
