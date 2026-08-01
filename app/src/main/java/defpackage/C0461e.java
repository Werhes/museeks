package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٞۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0461e extends AbstractC17076e implements InterfaceC5238e {
    private static final C0461e zzb;
    private int zzd;
    private InterfaceC5787e zze;
    private InterfaceC5787e zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C0461e c0461e = new C0461e();
        zzb = c0461e;
        AbstractC17076e.yandex(C0461e.class, c0461e);
    }

    public C0461e() {
        C5405e c5405e = C5405e.f11589e;
        this.zze = c5405e;
        this.zzf = c5405e;
    }

    public static void Signature(C0461e c0461e, float f) {
        RandomAccess randomAccess = c0461e.zze;
        if (!((AbstractC18495e) randomAccess).f36253e) {
            C5405e c5405e = (C5405e) randomAccess;
            int i = c5405e.f11590e;
            int i2 = i == 0 ? 10 : i + i;
            if (i2 < i) {
                throw new IllegalArgumentException();
            }
            c0461e.zze = new C5405e(Arrays.copyOf(c5405e.f11591e, i2), c5405e.f11590e, true);
        }
        ((C5405e) c0461e.zze).billing(f);
    }

    public static void admob(C0461e c0461e, float f) {
        RandomAccess randomAccess = c0461e.zzf;
        if (!((AbstractC18495e) randomAccess).f36253e) {
            C5405e c5405e = (C5405e) randomAccess;
            int i = c5405e.f11590e;
            int i2 = i == 0 ? 10 : i + i;
            if (i2 < i) {
                throw new IllegalArgumentException();
            }
            c0461e.zzf = new C5405e(Arrays.copyOf(c5405e.f11591e, i2), c5405e.f11590e, true);
        }
        ((C5405e) c0461e.zzf).billing(f);
    }

    public static C11233e amazon() {
        return (C11233e) zzb.license();
    }

    public static /* synthetic */ void loadAd(C0461e c0461e, int i) {
        c0461e.zzd |= 2;
        c0461e.zzh = i;
    }

    public static /* synthetic */ void subscription(C0461e c0461e, int i) {
        c0461e.zzd |= 1;
        c0461e.zzg = i;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C0461e();
        }
        if (i2 == 4) {
            return new AbstractC15425e(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
