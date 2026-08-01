package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ۠ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15006e implements InterfaceC9093e {
    public final AtomicReference ad;

    public C15006e(InterfaceC9093e interfaceC9093e) {
        this.ad = new AtomicReference(interfaceC9093e);
    }

    @Override // defpackage.InterfaceC9093e
    public final Iterator iterator() {
        InterfaceC9093e interfaceC9093e = (InterfaceC9093e) this.ad.getAndSet(null);
        if (interfaceC9093e != null) {
            return interfaceC9093e.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
