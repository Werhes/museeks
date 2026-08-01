package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۣۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10631e extends AbstractC11202e {
    private static final C10631e zzm;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private boolean zzj;
    private int zzk;
    private boolean zzl;

    static {
        C10631e c10631e = new C10631e();
        zzm = c10631e;
        AbstractC11202e.billing(C10631e.class, c10631e);
    }

    public static C18245e advert() {
        return (C18245e) zzm.metrica();
    }

    public final /* synthetic */ void Signature(String str) {
        str.getClass();
        this.zzb |= 8;
        this.zzg = str;
    }

    public final /* synthetic */ void admob(String str) {
        str.getClass();
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void amazon(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void loadAd(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void remoteconfig(int i) {
        this.zzk = i - 1;
        this.zzb |= 128;
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
            return new C17996e(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C1400e.f4203e, "zzl"});
        }
        if (i2 == 3) {
            return new C10631e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }

    public final /* synthetic */ void subscription(String str) {
        str.getClass();
        this.zzb |= 32;
        this.zzi = str;
    }
}
