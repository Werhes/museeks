package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10045e extends AbstractC15319e {
    private static final C10045e zzi;
    private static volatile InterfaceC11283e zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C10045e c10045e = new C10045e();
        zzi = c10045e;
        AbstractC15319e.Signature(C10045e.class, c10045e);
    }

    public static C13430e signatures() {
        return (C13430e) zzi.mopub();
    }

    public final /* synthetic */ void inmobi(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void isPro(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void isVip() {
        this.zzb |= 2;
        this.zzf = true;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C10045e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzj;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C10045e.class) {
            try {
                interfaceC11283e = zzj;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzi);
                    zzj = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final /* synthetic */ void tapsense(String str) {
        this.zzb |= 1;
        this.zze = str;
    }
}
