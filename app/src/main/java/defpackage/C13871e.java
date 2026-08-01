package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13871e extends AbstractC15319e {
    private static final C13871e zzl;
    private static volatile InterfaceC11283e zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = BuildConfig.FLAVOR;
    private InterfaceC13229e zzg = C9782e.f19327e;

    static {
        C13871e c13871e = new C13871e();
        zzl = c13871e;
        AbstractC15319e.Signature(C13871e.class, c13871e);
    }

    public static C13871e isVip(InputStream inputStream, C17268e c17268e) {
        C13871e c13871e = zzl;
        AbstractC3513e m1366interface = AbstractC3513e.m1366interface(inputStream, 4096);
        AbstractC15319e startapp = c13871e.startapp();
        try {
            InterfaceC16984e ad = C5913e.metrica.ad(startapp.getClass());
            C11226e c11226e = (C11226e) m1366interface.metrica;
            if (c11226e == null) {
                c11226e = new C11226e(m1366interface, (byte) 0);
            }
            ad.adcel(startapp, c11226e, c17268e);
            ad.metrica(startapp);
            AbstractC15319e.remoteconfig(startapp);
            return (C13871e) startapp;
        } catch (C10895e e) {
            if (e.f21565e) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (C16873e e2) {
            throw e2.ad();
        } catch (IOException e3) {
            if (e3.getCause() instanceof C10895e) {
                throw ((C10895e) e3.getCause());
            }
            throw new IOException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C10895e) {
                throw ((C10895e) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", C13746e.vip, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new C13871e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzm;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C13871e.class) {
            try {
                interfaceC11283e = zzm;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzl);
                    zzm = interfaceC11283e;
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

    public final boolean tapsense() {
        return this.zzf;
    }
}
