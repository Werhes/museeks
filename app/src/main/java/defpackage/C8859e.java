package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8859e extends AbstractC11202e {
    private static final C8859e zzi;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [eُۗٝ, eٌٞۖ] */
    static {
        ?? abstractC11202e = new AbstractC11202e();
        zzi = abstractC11202e;
        AbstractC11202e.billing(C8859e.class, abstractC11202e);
    }

    public static C10235e advert() {
        return (C10235e) zzi.metrica();
    }

    public final /* synthetic */ void Signature(long j) {
        this.zzb |= 16;
        this.zzh = j;
    }

    public final /* synthetic */ void admob(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void amazon(int i) {
        this.zzb |= 4;
        this.zzf = i;
    }

    public final /* synthetic */ void loadAd(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    public final /* synthetic */ void smaato(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzi, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", C12575e.f25224e, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new AbstractC11202e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
