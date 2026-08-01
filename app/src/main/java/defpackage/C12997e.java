package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12997e extends AbstractC1816e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f25916e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f25917e = 1;

    public C12997e(InterfaceC12385e interfaceC12385e) {
        super(interfaceC12385e);
        this.f25916e = new AtomicBoolean(false);
    }

    public C12997e(InterfaceC12385e interfaceC12385e, C2601e c2601e) {
        super(interfaceC12385e);
        this.f25916e = new WeakReference(c2601e);
        ad(new C11535e(0, this));
    }

    @Override // defpackage.AbstractC1816e, java.lang.AutoCloseable
    public void close() {
        switch (this.f25917e) {
            case 1:
                if (((AtomicBoolean) this.f25916e).getAndSet(true)) {
                    return;
                }
                super.close();
                return;
            default:
                super.close();
                return;
        }
    }
}
