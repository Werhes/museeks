package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0155e extends AbstractC12098e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C1474e f1388e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f1389e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f1390e;

    public C0155e(C1474e c1474e) {
        this.f1388e = c1474e;
        this.f1389e = c1474e.f4320e;
        this.f1390e = c1474e.f4318e;
    }

    @Override // defpackage.AbstractC12098e
    public final void ad() {
        int i = this.f1389e;
        if (i == 0) {
            this.f24255e = 2;
            return;
        }
        C1474e c1474e = this.f1388e;
        Object[] objArr = c1474e.f4321e;
        int i2 = this.f1390e;
        this.f24254e = objArr[i2];
        this.f24255e = 1;
        this.f1390e = (i2 + 1) % c1474e.f4319e;
        this.f1389e = i - 1;
    }
}
