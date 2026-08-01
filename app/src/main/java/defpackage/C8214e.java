package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8214e extends AbstractC17076e implements InterfaceC5238e {
    private static final C8214e zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        C8214e c8214e = new C8214e();
        zzb = c8214e;
        AbstractC17076e.yandex(C8214e.class, c8214e);
    }

    public static C8214e Signature() {
        return zzb;
    }

    public final double amazon() {
        return this.zze;
    }

    public final double loadAd() {
        return this.zzf;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C8214e();
        }
        if (i2 == 4) {
            return new AbstractC15425e(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
