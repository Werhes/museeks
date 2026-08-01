package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۘ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10482e extends AbstractC17076e implements InterfaceC5238e {
    private static final C10482e zzb;
    private int zzd;
    private InterfaceC5024e zzf;
    private InterfaceC5024e zzg;
    private InterfaceC5024e zzh;
    private C2101e zzi;
    private C10482e zzj;
    private C4164e zzk;
    private byte zzl = 2;
    private String zze = BuildConfig.FLAVOR;

    static {
        C10482e c10482e = new C10482e();
        zzb = c10482e;
        AbstractC17076e.yandex(C10482e.class, c10482e);
        C2101e amazon = C2101e.amazon();
        EnumC1699e enumC1699e = EnumC1699e.f4631e;
        if (amazon == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    public C10482e() {
        C0885e c0885e = C0885e.f3279e;
        this.zzf = c0885e;
        this.zzg = c0885e;
        this.zzh = c0885e;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", C4018e.class, "zzh", C4018e.class, "zzg", C13098e.class, "zzi", "zze", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C10482e();
        }
        if (i2 == 4) {
            return new C5434e(12, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzl = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
