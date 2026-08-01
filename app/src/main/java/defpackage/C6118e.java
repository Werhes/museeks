package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6118e extends AbstractC14423e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f12866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6118e(AbstractC10226e abstractC10226e, int i) {
        super(abstractC10226e);
        this.f12866e = i;
    }

    @Override // defpackage.AbstractC12082e, defpackage.AbstractC1186e
    public final boolean Signature() {
        switch (this.f12866e) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.AbstractC12082e
    public final AbstractC12082e subs(AbstractC10226e abstractC10226e) {
        switch (this.f12866e) {
            case 0:
                return new C6118e(abstractC10226e, 0);
            default:
                return new C6118e(abstractC10226e, 1);
        }
    }
}
