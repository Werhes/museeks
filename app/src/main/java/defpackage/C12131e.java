package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12131e extends AbstractC13118e {
    public long ad;
    public C13578e vip;

    @Override // defpackage.AbstractC13118e
    public final boolean ad(AbstractC12078e abstractC12078e) {
        C5981e c5981e = (C5981e) abstractC12078e;
        if (this.ad >= 0) {
            return false;
        }
        long j = c5981e.f12589e;
        if (j < c5981e.f12586e) {
            c5981e.f12586e = j;
        }
        this.ad = j;
        return true;
    }

    @Override // defpackage.AbstractC13118e
    public final InterfaceC5083e[] vip(AbstractC12078e abstractC12078e) {
        long j = this.ad;
        this.ad = -1L;
        this.vip = null;
        return ((C5981e) abstractC12078e).isVip(j);
    }
}
