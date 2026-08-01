package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10315e extends AbstractC15319e {
    private static final C10315e zzh;
    private static volatile InterfaceC11283e zzi;
    private int zzb;
    private C11013e zzf;
    private String zze = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C10315e c10315e = new C10315e();
        zzh = c10315e;
        AbstractC15319e.Signature(C10315e.class, c10315e);
    }

    public static C9862e tapsense() {
        return (C9862e) zzh.mopub();
    }

    public final /* synthetic */ void inmobi(C11013e c11013e) {
        this.zzf = c11013e;
        this.zzb |= 2;
    }

    public final /* synthetic */ void isPro(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void isVip(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C10315e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzi;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C10315e.class) {
            try {
                interfaceC11283e = zzi;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzh);
                    zzi = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final String signatures() {
        return this.zze;
    }
}
