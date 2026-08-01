package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6824e implements InterfaceC16060e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f14056e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f14057e;

    public C6824e(int i, long j) {
        this.f14057e = i;
        this.f14056e = j;
    }

    @Override // defpackage.InterfaceC16060e
    public final long advert(C10163e c10163e, long j, EnumC7792e enumC7792e, long j2) {
        int i = (int) (j2 >> 32);
        int smaato = AbstractC8703e.smaato(c10163e.license(), i, 2, c10163e.ad);
        long j3 = this.f14056e;
        if (smaato < 0) {
            int i2 = c10163e.ad;
            int i3 = (i + i2) - ((int) (j3 >> 32));
            smaato = i2 - (i3 >= 0 ? i3 : 0);
        } else if (smaato + i > ((int) (j3 >> 32)) && (smaato = c10163e.metrica - i) < 0) {
            smaato = 0;
        }
        int i4 = c10163e.vip - ((int) (j2 & 4294967295L));
        int i5 = this.f14057e;
        int i6 = i4 - i5;
        if (i6 < 0) {
            i6 = c10163e.license + i5;
        }
        return (smaato << 32) | (i6 & 4294967295L);
    }
}
