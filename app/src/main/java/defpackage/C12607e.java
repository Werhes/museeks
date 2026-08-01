package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12607e extends AbstractC15319e {
    private static final C12607e zzj;
    private static volatile InterfaceC11283e zzk;
    private int zzb;
    private InterfaceC13229e zze;
    private InterfaceC13229e zzf;
    private InterfaceC13229e zzg;
    private boolean zzh;
    private InterfaceC13229e zzi;

    static {
        C12607e c12607e = new C12607e();
        zzj = c12607e;
        AbstractC15319e.Signature(C12607e.class, c12607e);
    }

    public C12607e() {
        C9782e c9782e = C9782e.f19327e;
        this.zze = c9782e;
        this.zzf = c9782e;
        this.zzg = c9782e;
        this.zzi = c9782e;
    }

    public static C12607e ads() {
        return zzj;
    }

    public final InterfaceC13229e applovin() {
        return this.zzi;
    }

    public final boolean inmobi() {
        return (this.zzb & 1) != 0;
    }

    public final boolean isPro() {
        return this.zzh;
    }

    public final List isVip() {
        return this.zzg;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", C10291e.class, "zzf", C12939e.class, "zzg", C5479e.class, "zzh", "zzi", C10291e.class});
        }
        if (i2 == 3) {
            return new C12607e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzk;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C12607e.class) {
            try {
                interfaceC11283e = zzk;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzj);
                    zzk = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final List signatures() {
        return this.zze;
    }

    public final List tapsense() {
        return this.zzf;
    }
}
