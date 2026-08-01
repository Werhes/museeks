package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13051e extends AbstractC11202e {
    private static final C13051e zzm;
    private int zzb;
    private C14569e zzd;
    private long zze;
    private int zzf;
    private InterfaceC1958e zzg;
    private InterfaceC1958e zzh;
    private InterfaceC1958e zzi;
    private InterfaceC1958e zzj;
    private InterfaceC1958e zzk;
    private int zzl;

    static {
        C13051e c13051e = new C13051e();
        zzm = c13051e;
        AbstractC11202e.billing(C13051e.class, c13051e);
    }

    public C13051e() {
        C17026e c17026e = C17026e.f33352e;
        this.zzg = c17026e;
        this.zzh = c17026e;
        this.zzi = c17026e;
        this.zzj = c17026e;
        this.zzk = c17026e;
    }

    public static C15029e advert() {
        return (C15029e) zzm.metrica();
    }

    public final void Signature(ArrayList arrayList) {
        InterfaceC1958e interfaceC1958e = this.zzh;
        if (!((AbstractC11529e) interfaceC1958e).f23169e) {
            int size = interfaceC1958e.size();
            this.zzh = interfaceC1958e.mopub(size + size);
        }
        AbstractC4191e.vip(arrayList, this.zzh);
    }

    public final void admob(ArrayList arrayList) {
        InterfaceC1958e interfaceC1958e = this.zzi;
        if (!((AbstractC11529e) interfaceC1958e).f23169e) {
            int size = interfaceC1958e.size();
            this.zzi = interfaceC1958e.mopub(size + size);
        }
        AbstractC4191e.vip(arrayList, this.zzi);
    }

    public final /* synthetic */ void amazon(long j) {
        this.zzb |= 2;
        this.zze = j;
    }

    public final void loadAd(ArrayList arrayList) {
        InterfaceC1958e interfaceC1958e = this.zzg;
        if (!((AbstractC11529e) interfaceC1958e).f23169e) {
            int size = interfaceC1958e.size();
            this.zzg = interfaceC1958e.mopub(size + size);
        }
        AbstractC4191e.vip(arrayList, this.zzg);
    }

    public final /* synthetic */ void pro(int i) {
        this.zzb |= 8;
        this.zzl = i;
    }

    public final void remoteconfig(ArrayList arrayList) {
        InterfaceC1958e interfaceC1958e = this.zzk;
        if (!((AbstractC11529e) interfaceC1958e).f23169e) {
            int size = interfaceC1958e.size();
            this.zzk = interfaceC1958e.mopub(size + size);
        }
        AbstractC4191e.vip(arrayList, this.zzk);
    }

    public final /* synthetic */ void smaato(C14569e c14569e) {
        this.zzd = c14569e;
        this.zzb |= 1;
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0005\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tင\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", C6114e.f12856e, "zzg", C8859e.class, "zzh", C12509e.class, "zzi", C10605e.class, "zzj", C5866e.class, "zzk", C17165e.class, "zzl"});
        }
        if (i2 == 3) {
            return new C13051e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }

    public final void subscription(ArrayList arrayList) {
        InterfaceC1958e interfaceC1958e = this.zzj;
        if (!((AbstractC11529e) interfaceC1958e).f23169e) {
            int size = interfaceC1958e.size();
            this.zzj = interfaceC1958e.mopub(size + size);
        }
        AbstractC4191e.vip(arrayList, this.zzj);
    }
}
