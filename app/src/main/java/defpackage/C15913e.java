package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15913e extends AbstractC17076e implements InterfaceC5238e {
    private static final C15913e zzb;
    private InterfaceC5024e zzd;
    private InterfaceC5024e zze;

    static {
        C15913e c15913e = new C15913e();
        zzb = c15913e;
        AbstractC17076e.yandex(C15913e.class, c15913e);
    }

    public C15913e() {
        C0885e c0885e = C0885e.f3279e;
        this.zzd = c0885e;
        this.zze = c0885e;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", C0042e.class, "zze", C0042e.class});
        }
        if (i2 == 3) {
            return new C15913e();
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
