package defpackage;

/* renamed from: eٕؒۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1324e extends Cextends {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public AbstractC9932e f4099e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC0362e f4100e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12241e f4101e;

    /* JADX WARN: Type inference failed for: r1v1, types: [protected, eّؔۥ] */
    public C1324e(AbstractC0362e abstractC0362e, byte[] bArr) {
        this.f4100e = abstractC0362e;
        this.f4101e = new Cprotected(AbstractC12442e.license(bArr));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [protected, eّؔۥ] */
    public C1324e(AbstractC9932e abstractC9932e, boolean z) {
        this.f4099e = abstractC9932e.Signature();
        this.f4101e = new Cprotected(abstractC9932e.yandex(z));
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f4101e;
    }

    public final synchronized AbstractC9932e loadAd() {
        try {
            if (this.f4099e == null) {
                this.f4099e = this.f4100e.billing(this.f4101e.f36449e).Signature();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4099e;
    }
}
