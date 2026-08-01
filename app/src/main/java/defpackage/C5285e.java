package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۦّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5285e extends AbstractC11202e {
    private static final C5285e zzh;
    private int zzb;
    private C2542e zzd;
    private C16757e zze;
    private InterfaceC1958e zzf = C17026e.f33352e;
    private InterfaceC5846e zzg = C16882e.f33084e;

    static {
        C5285e c5285e = new C5285e();
        zzh = c5285e;
        AbstractC11202e.billing(C5285e.class, c5285e);
    }

    public static C1260e advert() {
        return (C1260e) zzh.metrica();
    }

    public final void amazon(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzg;
        if (!((AbstractC11529e) randomAccess).f23169e) {
            C16882e c16882e = (C16882e) randomAccess;
            int i = c16882e.f33086e;
            this.zzg = c16882e.mopub(i + i);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EnumC3848e enumC3848e = (EnumC3848e) it.next();
            ((C16882e) this.zzg).startapp(enumC3848e.f8567e);
        }
    }

    public final /* synthetic */ void smaato(C2542e c2542e) {
        this.zzd = c2542e;
        this.zzb |= 1;
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zzb", "zzd", "zze", "zzf", C0446e.class, "zzg", C4524e.f9817e});
        }
        if (i2 == 3) {
            return new C5285e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
