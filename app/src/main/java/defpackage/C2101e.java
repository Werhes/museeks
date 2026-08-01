package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2101e extends AbstractC15267e {
    private static final C2101e zzd;
    private byte zze;

    static {
        C2101e c2101e = new C2101e();
        zzd = c2101e;
        AbstractC17076e.yandex(C2101e.class, c2101e);
    }

    public C2101e() {
        this.zzb = C6496e.metrica;
        this.zze = (byte) 2;
    }

    public static C2101e amazon() {
        return zzd;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i2 == 2) {
            return new C5166e(zzd, "\u0003\u0000", null);
        }
        if (i2 == 3) {
            return new C2101e();
        }
        if (i2 == 4) {
            return new C5434e(0, zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        this.zze = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
