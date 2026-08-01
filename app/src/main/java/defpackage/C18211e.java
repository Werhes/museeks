package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٛٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18211e implements InterfaceC4317e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public float f35652e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public float f35653e;

    public /* synthetic */ C18211e(float f, float f2, float f3, float f4) {
        this.f35653e = f3;
        this.f35652e = f4;
    }

    public C18211e(int i) {
        switch (i) {
            case 5:
                return;
            default:
                this.f35653e = Math.max(1.0E-7f, Math.abs(0.1f));
                this.f35652e = Math.max(1.0E-4f, 1.0f) * (-4.2f);
                return;
        }
    }

    public C13219e ad(float f) {
        double vip = vip(f);
        double d = AbstractC2905e.ad;
        double d2 = d - 1.0d;
        return new C13219e(f, (float) (Math.exp((d / d2) * vip) * this.f35653e * this.f35652e), (long) (Math.exp(vip / d2) * 1000.0d));
    }

    @Override // defpackage.InterfaceC4317e
    public float advert(float f, float f2) {
        if (Math.abs(f2) <= this.f35653e) {
            return f;
        }
        double log = Math.log(Math.abs(r1 / f2));
        float f3 = this.f35652e;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // defpackage.InterfaceC4317e
    public float billing(float f, float f2, long j) {
        float f3 = this.f35652e;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((float) (j / 1000000))) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // defpackage.InterfaceC4317e
    public float metrica() {
        return this.f35653e;
    }

    @Override // defpackage.InterfaceC4317e
    public long mopub(float f) {
        return ((((float) Math.log(this.f35653e / Math.abs(f))) * 1000.0f) / this.f35652e) * 1000000;
    }

    @Override // defpackage.InterfaceC4317e
    public float purchase(float f, long j) {
        return f * ((float) Math.exp((((float) (j / 1000000)) / 1000.0f) * this.f35652e));
    }

    public double vip(float f) {
        float[] fArr = AbstractC2966e.ad;
        return Math.log((Math.abs(f) * 0.35f) / (this.f35653e * this.f35652e));
    }
}
