package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6293e extends AbstractC15319e {
    private static final C6293e zzg;
    private static volatile InterfaceC11283e zzh;
    private int zzb;
    private int zze;
    private long zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؙٖ, eًٕؔ] */
    static {
        ?? abstractC15319e = new AbstractC15319e();
        zzg = abstractC15319e;
        AbstractC15319e.Signature(C6293e.class, abstractC15319e);
    }

    public static C3072e isPro() {
        return (C3072e) zzg.mopub();
    }

    public final /* synthetic */ void ads(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void applovin(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final long inmobi() {
        return this.zzf;
    }

    public final boolean isVip() {
        return (this.zzb & 2) != 0;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new AbstractC15319e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzh;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C6293e.class) {
            try {
                interfaceC11283e = zzh;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzg);
                    zzh = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final boolean signatures() {
        return (this.zzb & 1) != 0;
    }

    public final int tapsense() {
        return this.zze;
    }
}
