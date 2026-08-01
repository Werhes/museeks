package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2601e extends AbstractC17977e {

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public C12997e f6448e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final Executor f6449e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final Object f6450e = new Object();

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public InterfaceC12385e f6451e;

    public C2601e(Executor executor) {
        this.f6449e = executor;
    }

    @Override // defpackage.AbstractC17977e
    public final InterfaceC12385e ad(InterfaceC8668e interfaceC8668e) {
        return interfaceC8668e.metrica();
    }

    @Override // defpackage.AbstractC17977e
    public final void license() {
        synchronized (this.f6450e) {
            try {
                InterfaceC12385e interfaceC12385e = this.f6451e;
                if (interfaceC12385e != null) {
                    interfaceC12385e.close();
                    this.f6451e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC17977e
    public final void purchase(InterfaceC12385e interfaceC12385e) {
        synchronized (this.f6450e) {
            try {
                if (!this.f35242e) {
                    interfaceC12385e.close();
                    return;
                }
                if (this.f6448e != null) {
                    if (interfaceC12385e.mo691synchronized().metrica() <= this.f6448e.f4899e.mo691synchronized().metrica()) {
                        interfaceC12385e.close();
                    } else {
                        InterfaceC12385e interfaceC12385e2 = this.f6451e;
                        if (interfaceC12385e2 != null) {
                            interfaceC12385e2.close();
                        }
                        this.f6451e = interfaceC12385e;
                    }
                    return;
                }
                C12997e c12997e = new C12997e(interfaceC12385e, this);
                this.f6448e = c12997e;
                ListenableFuture vip = vip(c12997e);
                C7850e c7850e = new C7850e(13, c12997e);
                vip.ad(new RunnableC17144e(vip, c7850e, 0), AbstractC3062e.billing());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
