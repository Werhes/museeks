package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13131e extends AbstractC15319e {
    private static final C13131e zzj;
    private static volatile InterfaceC11283e zzk;
    private int zzb;
    private long zzh;
    private C8926e zzi = C8926e.f17888e;
    private String zze = BuildConfig.FLAVOR;
    private AbstractC7244e zzf = AbstractC7244e.f14800e;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C13131e c13131e = new C13131e();
        zzj = c13131e;
        AbstractC15319e.Signature(C13131e.class, c13131e);
    }

    public static C13131e ads(AbstractC3513e abstractC3513e, C17268e c17268e) {
        AbstractC15319e startapp = zzj.startapp();
        try {
            InterfaceC16984e ad = C5913e.metrica.ad(startapp.getClass());
            C11226e c11226e = (C11226e) abstractC3513e.metrica;
            if (c11226e == null) {
                c11226e = new C11226e(abstractC3513e, (byte) 0);
            }
            ad.adcel(startapp, c11226e, c17268e);
            ad.metrica(startapp);
            AbstractC15319e.remoteconfig(startapp);
            return (C13131e) startapp;
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

    public static C13131e premium() {
        return zzj;
    }

    public final Map applovin() {
        return DesugarCollections.unmodifiableMap(this.zzi);
    }

    public final long inmobi() {
        return this.zzh;
    }

    public final int isPro() {
        return this.zzi.size();
    }

    public final String isVip() {
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
            return new C0537e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", AbstractC11959e.ad});
        }
        if (i2 == 3) {
            return new C13131e();
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
        synchronized (C13131e.class) {
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

    public final String signatures() {
        return this.zze;
    }

    public final AbstractC7244e tapsense() {
        return this.zzf;
    }
}
