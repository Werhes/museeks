package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2675e extends AbstractC11202e {
    private static final C2675e zzh;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private InterfaceC1958e zze;
    private InterfaceC1958e zzf;
    private boolean zzg;

    static {
        C2675e c2675e = new C2675e();
        zzh = c2675e;
        AbstractC11202e.billing(C2675e.class, c2675e);
    }

    public C2675e() {
        C17026e c17026e = C17026e.f33352e;
        this.zze = c17026e;
        this.zzf = c17026e;
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzb", "zzd", "zze", C13167e.class, "zzf", C14569e.class, "zzg"});
        }
        if (i2 == 3) {
            return new C2675e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
