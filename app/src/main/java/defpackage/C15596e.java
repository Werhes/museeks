package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٜۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15596e extends AbstractC12466e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f30770e;

    public C15596e(long j, C15596e c15596e, int i) {
        super(j, c15596e, i);
        this.f30770e = new AtomicReferenceArray(AbstractC10363e.purchase);
    }

    @Override // defpackage.AbstractC12466e
    public final int billing() {
        return AbstractC10363e.purchase;
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f24956e + ", hashCode=" + hashCode() + ']';
    }

    @Override // defpackage.AbstractC12466e
    public final void yandex(int i, InterfaceC8850e interfaceC8850e) {
        this.f30770e.set(i, AbstractC10363e.appmetrica);
        startapp();
    }
}
