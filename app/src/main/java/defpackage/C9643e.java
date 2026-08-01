package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9643e extends AbstractC17076e implements InterfaceC5238e {
    private static final C9643e zzb;
    private int zzd;
    private C9296e zze;
    private InterfaceC5024e zzh;
    private InterfaceC5024e zzi;
    private InterfaceC5024e zzj;
    private InterfaceC5024e zzk;
    private String zzl;
    private byte zzm = 2;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C9643e c9643e = new C9643e();
        zzb = c9643e;
        AbstractC17076e.yandex(C9643e.class, c9643e);
    }

    public C9643e() {
        C0885e c0885e = C0885e.f3279e;
        this.zzh = c0885e;
        this.zzi = c0885e;
        this.zzj = c0885e;
        this.zzk = c0885e;
        this.zzl = BuildConfig.FLAVOR;
    }

    public static C9643e loadAd() {
        return zzb;
    }

    public final String Signature() {
        return this.zzf;
    }

    public final String admob() {
        return this.zzg;
    }

    public final C9296e amazon() {
        C9296e c9296e = this.zze;
        return c9296e == null ? C9296e.amazon() : c9296e;
    }

    public final InterfaceC5024e pro() {
        return this.zzh;
    }

    public final InterfaceC5024e remoteconfig() {
        return this.zzi;
    }

    public final InterfaceC5024e signatures() {
        return this.zzj;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C18494e.class, "zzi", C17200e.class, "zzj", "zzk", C13036e.class, "zzl"});
        }
        if (i2 == 3) {
            return new C9643e();
        }
        if (i2 == 4) {
            return new AbstractC15425e(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzm = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final InterfaceC5024e subscription() {
        return this.zzk;
    }
}
