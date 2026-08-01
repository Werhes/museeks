package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؐۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9967e implements InterfaceC13033e {
    private volatile C7761e closed;
    public final C12402e vip;

    public C9967e(C12402e c12402e) {
        this.vip = c12402e;
    }

    @Override // defpackage.InterfaceC13033e, defpackage.InterfaceC1618e
    public final void ad(Throwable th) {
        if (this.closed != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        this.closed = new C7761e(new IOException(message, th));
    }

    @Override // defpackage.InterfaceC13033e
    public final C12402e billing() {
        Throwable vip = vip();
        if (vip == null) {
            return this.vip;
        }
        throw vip;
    }

    @Override // defpackage.InterfaceC13033e
    public final Object license(int i, AbstractC10731e abstractC10731e) {
        Throwable vip = vip();
        if (vip == null) {
            return Boolean.valueOf(this.vip.request(i));
        }
        throw vip;
    }

    @Override // defpackage.InterfaceC13033e, defpackage.InterfaceC1618e
    public final Throwable vip() {
        C7761e c7761e = this.closed;
        if (c7761e != null) {
            return c7761e.ad(C6244e.f13064e);
        }
        return null;
    }

    @Override // defpackage.InterfaceC13033e
    public final boolean yandex() {
        return this.vip.yandex();
    }
}
