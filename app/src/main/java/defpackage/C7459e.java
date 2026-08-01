package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7459e extends AbstractC15319e {
    private static final C7459e zzg;
    private static volatile InterfaceC11283e zzh;
    private int zzb;
    private InterfaceC13229e zze = C9782e.f19327e;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C7459e c7459e = new C7459e();
        zzg = c7459e;
        AbstractC15319e.Signature(C7459e.class, c7459e);
    }

    public static C7459e tapsense() {
        return zzg;
    }

    public final /* synthetic */ void inmobi(String str) {
        this.zzb |= 1;
        this.zzf = BuildConfig.FLAVOR;
    }

    public final void isVip(String str) {
        InterfaceC13229e interfaceC13229e = this.zze;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zze = AbstractC1414e.advert(interfaceC13229e);
        }
        this.zze.add(BuildConfig.FLAVOR);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C7459e();
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
        synchronized (C7459e.class) {
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

    public final List signatures() {
        return this.zze;
    }
}
