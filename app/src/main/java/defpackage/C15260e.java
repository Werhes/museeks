package defpackage;

import java.io.IOException;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15260e extends AbstractC17076e implements InterfaceC5238e {
    private static final C15260e zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private InterfaceC5024e zze = C0885e.f3279e;
    private String zzg = BuildConfig.FLAVOR;
    private AbstractC13532e zzh = AbstractC13532e.f26826e;

    static {
        C15260e c15260e = new C15260e();
        zzb = c15260e;
        AbstractC17076e.yandex(C15260e.class, c15260e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [eّْٕ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eٗ٘ۚ, java.lang.Object] */
    public static C15260e amazon(byte[] bArr, C4621e c4621e) {
        C15260e c15260e = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r2 = (AbstractC17076e) c15260e.smaato(4, null);
            try {
                ?? ad = C17792e.metrica.ad(r2.getClass());
                ad.license(r2, bArr, 0, length, new C16807e(c4621e));
                ad.ad(r2);
                c15260e = r2;
            } catch (C5725e e) {
                throw e;
            } catch (C8058e e2) {
                throw new IOException(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof C5725e) {
                    throw ((C5725e) e3.getCause());
                }
                throw new IOException(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (c15260e == null || AbstractC17076e.adcel(c15260e, true)) {
            return c15260e;
        }
        throw new IOException(new C8058e().getMessage());
    }

    public final InterfaceC5024e loadAd() {
        return this.zze;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", C16896e.class, "zzf", C11732e.metrica, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C15260e();
        }
        if (i2 == 4) {
            return new C5434e(14, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzi = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
