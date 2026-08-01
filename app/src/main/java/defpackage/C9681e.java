package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9681e extends AbstractC15319e {
    private static final C9681e zzo;
    private static volatile InterfaceC11283e zzp;
    private int zzb;
    private boolean zzf;
    private InterfaceC13229e zzh;
    private InterfaceC13229e zzi;
    private InterfaceC7569e zzj;
    private C6498e zzk;
    private boolean zzl;
    private boolean zzm;
    private C8398e zzn;
    private AbstractC7244e zze = AbstractC7244e.f14800e;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C9681e c9681e = new C9681e();
        zzo = c9681e;
        AbstractC15319e.Signature(C9681e.class, c9681e);
    }

    public C9681e() {
        C9782e c9782e = C9782e.f19327e;
        this.zzh = c9782e;
        this.zzi = c9782e;
        this.zzj = C5407e.f11592e;
    }

    public static C9681e signatures() {
        return zzo;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C13746e.vip, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new C9681e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzp;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C9681e.class) {
            try {
                interfaceC11283e = zzp;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzo);
                    zzp = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }
}
