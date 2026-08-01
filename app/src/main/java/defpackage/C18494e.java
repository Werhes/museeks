package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۦً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18494e extends AbstractC17076e implements InterfaceC5238e {
    private static final C18494e zzb;
    private int zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C18494e c18494e = new C18494e();
        zzb = c18494e;
        AbstractC17076e.yandex(C18494e.class, c18494e);
    }

    public static C18494e amazon() {
        return zzb;
    }

    public final int Signature() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final String loadAd() {
        return this.zzf;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C11732e.purchase, "zzf"});
        }
        if (i2 == 3) {
            return new C18494e();
        }
        if (i2 == 4) {
            return new C5434e(11, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
