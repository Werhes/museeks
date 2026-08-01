package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12895e extends AbstractC17076e implements InterfaceC5238e {
    private static final C12895e zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private C2101e zzg;
    private byte zzh = 2;

    static {
        C12895e c12895e = new C12895e();
        zzb = c12895e;
        AbstractC17076e.yandex(C12895e.class, c12895e);
        C2101e amazon = C2101e.amazon();
        EnumC1699e enumC1699e = EnumC1699e.f4631e;
        if (amazon == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C12895e();
        }
        if (i2 == 4) {
            return new AbstractC15425e(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
