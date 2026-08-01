package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8793e extends AbstractC5884e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f17706e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f17707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8793e(int i, Object obj) {
        super(0);
        this.f17707e = i;
        this.f17706e = obj;
    }

    @Override // defpackage.AbstractC5884e
    public final int metrica(C3155e c3155e) {
        switch (this.f17707e) {
            case 0:
                C0690e c0690e = (C0690e) this.f17706e;
                return c0690e.startapp(c0690e.ad.appmetrica(AbstractC12184e.metrica(c3155e)));
            default:
                C14479e c14479e = (C14479e) this.f17706e;
                return c14479e.remoteconfig(c14479e.metrica(AbstractC12184e.metrica(c3155e)));
        }
    }

    @Override // defpackage.AbstractC5884e
    public final AbstractC3091e purchase(C3155e c3155e) {
        switch (this.f17707e) {
            case 0:
                C18516e c18516e = ((C0690e) this.f17706e).ad;
                c18516e.smaato(c18516e.appmetrica(AbstractC12184e.metrica(c3155e)));
                return null;
            default:
                C14479e c14479e = (C14479e) this.f17706e;
                c14479e.m3819protected(c14479e.metrica(AbstractC12184e.metrica(c3155e)));
                return null;
        }
    }
}
