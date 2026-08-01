package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14115e implements InterfaceC16060e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C11490e f27930e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public EnumC7792e f27931e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C12729e f27932e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C12729e f27933e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C7988e f27934e;

    public C14115e(C7988e c7988e) {
        this.f27934e = c7988e;
    }

    @Override // defpackage.InterfaceC16060e
    public final long advert(C10163e c10163e, long j, EnumC7792e enumC7792e, long j2) {
        C11490e c11490e = this.f27930e;
        if (c11490e != null) {
            C12729e c12729e = this.f27932e;
            if ((c12729e == null ? false : C12729e.vip(c12729e.ad, j)) && this.f27931e == enumC7792e) {
                C12729e c12729e2 = this.f27933e;
                if (c12729e2 != null ? C12729e.vip(c12729e2.ad, j2) : false) {
                    return c11490e.ad;
                }
            }
        }
        long advert = this.f27934e.advert(c10163e, j, enumC7792e, j2);
        this.f27932e = new C12729e(j);
        this.f27931e = enumC7792e;
        this.f27933e = new C12729e(j2);
        this.f27930e = new C11490e(advert);
        return advert;
    }
}
