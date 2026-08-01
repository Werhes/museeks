package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1286e extends AbstractC13118e {
    public final AtomicReference ad = new AtomicReference(null);

    @Override // defpackage.AbstractC13118e
    public final boolean ad(AbstractC12078e abstractC12078e) {
        AtomicReference atomicReference = this.ad;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC9180e.advert);
        return true;
    }

    @Override // defpackage.AbstractC13118e
    public final InterfaceC5083e[] vip(AbstractC12078e abstractC12078e) {
        this.ad.set(null);
        return AbstractC9743e.ad;
    }
}
