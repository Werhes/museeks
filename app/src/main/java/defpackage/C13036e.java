package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13036e extends AbstractC17076e implements InterfaceC5238e {
    private static final C13036e zzb;
    private int zzd;
    private int zze;
    private C10482e zzg;
    private byte zzh = 2;
    private InterfaceC5024e zzf = C0885e.f3279e;

    static {
        C13036e c13036e = new C13036e();
        zzb = c13036e;
        AbstractC17076e.yandex(C13036e.class, c13036e);
    }

    public final InterfaceC5024e amazon() {
        return this.zzf;
    }

    public final int loadAd() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C11732e.appmetrica, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C13036e();
        }
        if (i2 == 4) {
            return new C5434e(9, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
