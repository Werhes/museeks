package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14944e extends AbstractC11202e {
    private static final C14944e zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C14944e c14944e = new C14944e();
        zzh = c14944e;
        AbstractC11202e.billing(C14944e.class, c14944e);
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C17996e(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C4590e.f9898e, "zze", "zzf", C14914e.f29580e});
        }
        if (i2 == 3) {
            return new C14944e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        this.zzg = abstractC11202e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
