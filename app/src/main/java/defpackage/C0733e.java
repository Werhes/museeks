package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۨؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0733e extends AbstractC17076e implements InterfaceC5238e {
    private static final C0733e zzb;
    private int zzd;
    private C2101e zzj;
    private byte zzk = 2;
    private InterfaceC6692e zze = C10506e.f20729e;
    private InterfaceC5787e zzf = C5405e.f11589e;
    private boolean zzg = true;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        C0733e c0733e = new C0733e();
        zzb = c0733e;
        AbstractC17076e.yandex(C0733e.class, c0733e);
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C0733e();
        }
        if (i2 == 4) {
            return new AbstractC15425e(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
