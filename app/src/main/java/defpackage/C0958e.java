package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958e extends AbstractC8548e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C7262e f3397e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f3398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0958e(InterfaceC4895e interfaceC4895e, C7262e c7262e) {
        super(interfaceC4895e);
        this.f3397e = c7262e;
    }

    @Override // defpackage.AbstractC8548e, defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        C7262e c7262e = this.f3397e;
        AbstractC12834e abstractC12834e = c7262e.f14862e;
        long signatures = this.f17361e.signatures(c16151e, j);
        if (signatures != -1) {
            this.f3398e += signatures;
        }
        C2007e c2007e = c7262e.f14861e;
        long j2 = this.f3398e;
        long license = abstractC12834e.license();
        float f = (float) this.f3398e;
        long license2 = abstractC12834e.license();
        if (license2 < 1) {
            license2 = 1;
        }
        float floatValue = ((Number) AbstractC3062e.purchase(Float.valueOf(f / ((float) license2)), new C3721e(0.0f, 1.0f))).floatValue();
        ((C11046e) c2007e.f5254e).f21896e.setValue(new C0217e(license, j2, floatValue));
        return signatures;
    }
}
