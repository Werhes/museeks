package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2542e extends AbstractC11202e {
    private static final C2542e zzf;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;

    static {
        C2542e c2542e = new C2542e();
        zzf = c2542e;
        AbstractC11202e.billing(C2542e.class, c2542e);
    }

    public static C7083e advert() {
        return (C7083e) zzf.metrica();
    }

    public final /* synthetic */ void amazon(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void smaato(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2542e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
