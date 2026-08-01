package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2440e extends AbstractC11202e {
    private static final C2440e zzs;
    private int zzb;
    private C14569e zzd;
    private boolean zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private C3786e zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًؔؒ, eُۗٝ] */
    static {
        ?? abstractC11202e = new AbstractC11202e();
        zzs = abstractC11202e;
        AbstractC11202e.billing(C2440e.class, abstractC11202e);
    }

    public static C1282e advert() {
        return (C1282e) zzs.metrica();
    }

    public static C2440e amazon() {
        return zzs;
    }

    public static C1282e smaato(C2440e c2440e) {
        AbstractC10140e metrica = zzs.metrica();
        AbstractC11202e abstractC11202e = metrica.f20054e;
        if (!abstractC11202e.equals(c2440e)) {
            if (!metrica.f20053e.adcel()) {
                AbstractC11202e abstractC11202e2 = (AbstractC11202e) abstractC11202e.startapp(4, null);
                C11222e.metrica.ad(abstractC11202e2.getClass()).vip(abstractC11202e2, metrica.f20053e);
                metrica.f20053e = abstractC11202e2;
            }
            AbstractC11202e abstractC11202e3 = metrica.f20053e;
            C11222e.metrica.ad(abstractC11202e3.getClass()).vip(abstractC11202e3, c2440e);
        }
        return (C1282e) metrica;
    }

    public final /* synthetic */ void Signature(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    public final /* synthetic */ void admob(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void inmobi(boolean z) {
        this.zzb |= 16384;
        this.zzr = z;
    }

    public final /* synthetic */ void isVip() {
        this.zzb |= 8192;
        this.zzq = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public final /* synthetic */ void loadAd(C14569e c14569e) {
        this.zzd = c14569e;
        this.zzb |= 1;
    }

    public final /* synthetic */ void pro(int i) {
        this.zzb |= 1024;
        this.zzn = i;
    }

    public final /* synthetic */ void remoteconfig(int i) {
        this.zzb |= 128;
        this.zzk = i;
    }

    public final /* synthetic */ void signatures(boolean z) {
        this.zzb |= 2048;
        this.zzo = z;
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzs, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", C5170e.f11060e, "zzi", C5107e.f10965e, "zzj", "zzk", "zzl", "zzm", C12575e.f25234e, "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new AbstractC11202e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzs);
        }
        if (i2 == 5) {
            return zzs;
        }
        throw null;
    }

    public final /* synthetic */ void subscription(int i) {
        this.zzb |= 64;
        this.zzj = i;
    }

    public final /* synthetic */ void tapsense() {
        this.zzb |= 4096;
        this.zzp = 0;
    }
}
