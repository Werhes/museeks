package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0304e extends AbstractC17076e implements InterfaceC5238e {
    private static final C0304e zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C0304e c0304e = new C0304e();
        zzb = c0304e;
        AbstractC17076e.yandex(C0304e.class, c0304e);
    }

    public static C11587e Signature() {
        return (C11587e) zzb.license();
    }

    public static /* synthetic */ void admob(C0304e c0304e, int i) {
        c0304e.zzd |= 1;
        c0304e.zze = i;
    }

    public static /* synthetic */ void subscription(C0304e c0304e, int i) {
        c0304e.zzd |= 2;
        c0304e.zzf = i;
    }

    public final int amazon() {
        return this.zze;
    }

    public final int loadAd() {
        return this.zzf;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C0304e();
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
