package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC1690e extends C1613e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f4620e;

    public RunnableC1690e(long j, InterfaceC5083e interfaceC5083e) {
        super(interfaceC5083e, interfaceC5083e.admob());
        this.f4620e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC16481e.license(this.f35291e);
        isPro(new C3063e("Timed out waiting for " + this.f4620e + " ms", this));
    }

    @Override // defpackage.C6467e
    /* renamed from: synchronized, reason: not valid java name */
    public final String mo678synchronized() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo678synchronized());
        sb.append("(timeMillis=");
        return AbstractC10257e.mopub(sb, this.f4620e, ')');
    }
}
