package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4469e extends AbstractC11202e {
    private static final C4469e zzaz;
    private InterfaceC1958e zzA;
    private InterfaceC1958e zzB;
    private C2688e zzC;
    private int zzD;
    private int zzE;
    private C14569e zzF;
    private int zzG;
    private C11781e zzH;
    private InterfaceC1958e zzI;
    private C14569e zzJ;
    private int zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private C2790e zzQ;
    private C2440e zzR;
    private C13051e zzS;
    private C3829e zzT;
    private C14944e zzU;
    private C3465e zzV;
    private C3769e zzW;
    private InterfaceC1958e zzX;
    private C16757e zzY;
    private int zzZ;
    private C9977e zzaa;
    private InterfaceC1958e zzab;
    private boolean zzac;
    private boolean zzad;
    private int zzae;
    private C5285e zzaf;
    private C16884e zzag;
    private C8516e zzah;
    private C3730e zzai;
    private C1205e zzaj;
    private C14413e zzak;
    private C14996e zzal;
    private int zzam;
    private int zzan;
    private int zzao;
    private InterfaceC1958e zzap;
    private C0457e zzaq;
    private C10370e zzar;
    private C10631e zzas;
    private C3508e zzat;
    private C10525e zzau;
    private C14010e zzav;
    private C0466e zzaw;
    private C6675e zzax;
    private int zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private int zzg;
    private C9676e zzh;
    private C15724e zzi;
    private C11741e zzj;
    private C1274e zzk;
    private C15804e zzl;
    private C12275e zzm;
    private C7634e zzn;
    private C1212e zzo;
    private C5463e zzq;
    private C10191e zzr;
    private int zzu;
    private C8896e zzv;
    private InterfaceC1958e zzy;
    private InterfaceC1958e zzz;
    private byte zzay = 2;
    private String zzp = BuildConfig.FLAVOR;
    private String zzs = BuildConfig.FLAVOR;
    private String zzt = BuildConfig.FLAVOR;
    private String zzw = BuildConfig.FLAVOR;
    private InterfaceC5846e zzx = C16882e.f33084e;

    static {
        C4469e c4469e = new C4469e();
        zzaz = c4469e;
        AbstractC11202e.billing(C4469e.class, c4469e);
    }

    public C4469e() {
        C17026e c17026e = C17026e.f33352e;
        this.zzy = c17026e;
        this.zzz = c17026e;
        this.zzA = c17026e;
        this.zzB = c17026e;
        this.zzI = c17026e;
        this.zzX = c17026e;
        this.zzab = c17026e;
        this.zzap = c17026e;
    }

    public static C17488e amazon(C4469e c4469e) {
        AbstractC10140e metrica = zzaz.metrica();
        AbstractC11202e abstractC11202e = metrica.f20054e;
        if (!abstractC11202e.equals(c4469e)) {
            if (!metrica.f20053e.adcel()) {
                AbstractC11202e abstractC11202e2 = (AbstractC11202e) abstractC11202e.startapp(4, null);
                C11222e.metrica.ad(abstractC11202e2.getClass()).vip(abstractC11202e2, metrica.f20053e);
                metrica.f20053e = abstractC11202e2;
            }
            AbstractC11202e abstractC11202e3 = metrica.f20053e;
            C11222e.metrica.ad(abstractC11202e3.getClass()).vip(abstractC11202e3, c4469e);
        }
        return (C17488e) metrica;
    }

    public static C17488e smaato() {
        return (C17488e) zzaz.metrica();
    }

    public final /* synthetic */ void Signature(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzp = str;
    }

    public final /* synthetic */ void admob(String str) {
        str.getClass();
        this.zzb |= 16384;
        this.zzs = str;
    }

    public final C2440e advert() {
        C2440e c2440e = this.zzR;
        return c2440e == null ? C2440e.amazon() : c2440e;
    }

    public final /* synthetic */ void applovin(C10631e c10631e) {
        this.zzas = c10631e;
        this.zzd |= 33554432;
    }

    public final void inmobi(C2542e c2542e) {
        InterfaceC1958e interfaceC1958e = this.zzX;
        if (!((AbstractC11529e) interfaceC1958e).f23169e) {
            int size = interfaceC1958e.size();
            this.zzX = interfaceC1958e.mopub(size + size);
        }
        this.zzX.add(c2542e);
    }

    public final /* synthetic */ void isPro(C5285e c5285e) {
        this.zzaf = c5285e;
        this.zzd |= 8192;
    }

    public final /* synthetic */ void isVip(C13051e c13051e) {
        this.zzS = c13051e;
        this.zzd |= 4;
    }

    public final /* synthetic */ void loadAd(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void pro(String str) {
        this.zzb |= 262144;
        this.zzw = str;
    }

    public final /* synthetic */ void remoteconfig(int i) {
        this.zzb |= 65536;
        this.zzu = i;
    }

    public final /* synthetic */ void signatures(int i) {
        this.zzb |= RecyclerView.UNDEFINED_DURATION;
        this.zzP = i;
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzay);
        }
        if (i2 == 2) {
            return new C17996e(zzaz, "\u0001H\u0000\u0002\u0001HH\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌(*ဉ)+\u001b,᠌\u001a-ဇ*.ဇ+/᠌,0ဉ-1င\u00172ဉ.3ဉ/4ဉ15ဉ26ဉ37᠌48᠌59᠌6:\u001b;ဈ\u000f<ဉ7=ဉ0>ဉ\u0013?ဉ\"@င\u0010Aဉ8Bဉ'Cဉ9Dဉ:Eဉ;Fဉ<Gဉ=Hဉ>", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", C5170e.f11075e, "zzh", "zzi", "zzj", "zzk", "zzl", "zzs", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzv", "zzw", "zzx", "zzy", C13167e.class, "zzz", C8968e.class, "zzA", C11037e.class, "zzB", C2675e.class, "zzD", C11047e.f21906e, "zzH", "zzI", C14569e.class, "zzJ", "zzL", C16628e.f32608e, "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzT", "zzE", C5438e.f11679e, "zzF", "zzU", "zzV", "zzW", "zzX", C2542e.class, "zzZ", C4590e.f9882e, "zzaa", "zzab", C4966e.class, "zzK", C17647e.f34585e, "zzac", "zzad", "zzae", C10990e.f21756e, "zzaf", "zzG", "zzag", "zzah", "zzaj", "zzak", "zzal", "zzam", C5438e.f11692e, "zzan", C5107e.f10970e, "zzao", C16628e.f32600e, "zzap", C1076e.class, "zzt", "zzaq", "zzai", "zzC", "zzS", "zzu", "zzar", "zzY", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax"});
        }
        if (i2 == 3) {
            return new C4469e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzaz);
        }
        if (i2 == 5) {
            return zzaz;
        }
        this.zzay = abstractC11202e == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final /* synthetic */ void subscription(String str) {
        str.getClass();
        this.zzb |= 32768;
        this.zzt = str;
    }

    public final /* synthetic */ void tapsense(C2440e c2440e) {
        this.zzR = c2440e;
        this.zzd |= 2;
    }
}
