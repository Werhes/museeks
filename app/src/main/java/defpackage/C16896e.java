package defpackage;

import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16896e extends AbstractC17076e implements InterfaceC5238e {
    private static final C16896e zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private AbstractC13532e zzf;
    private String zzg;
    private C1791e zzh;
    private int zzi;
    private C9643e zzj;
    private C17200e zzk;
    private C18494e zzl;
    private C1700e zzm;
    private C16411e zzn;
    private C6526e zzo;
    private C8214e zzp;
    private C17483e zzq;
    private C3476e zzr;
    private C12882e zzs;
    private InterfaceC5024e zzt;
    private InterfaceC6692e zzu;
    private String zzv;
    private InterfaceC5024e zzw;
    private boolean zzx;
    private double zzy;
    private AbstractC13532e zzz;

    static {
        C16896e c16896e = new C16896e();
        zzb = c16896e;
        AbstractC17076e.yandex(C16896e.class, c16896e);
    }

    public C16896e() {
        C2655e c2655e = AbstractC13532e.f26826e;
        this.zzf = c2655e;
        this.zzg = BuildConfig.FLAVOR;
        C0885e c0885e = C0885e.f3279e;
        this.zzt = c0885e;
        this.zzu = C10506e.f20729e;
        this.zzv = BuildConfig.FLAVOR;
        this.zzw = c0885e;
        this.zzx = true;
        this.zzz = c2655e;
    }

    public static void premium(C16896e c16896e, int i, C0304e c0304e) {
        InterfaceC5024e interfaceC5024e = c16896e.zzt;
        if (!((AbstractC18495e) interfaceC5024e).f36253e) {
            int size = interfaceC5024e.size();
            c16896e.zzt = interfaceC5024e.vip(size == 0 ? 10 : size + size);
        }
        c16896e.zzt.set(i, c0304e);
    }

    public final C18494e Signature() {
        C18494e c18494e = this.zzl;
        return c18494e == null ? C18494e.amazon() : c18494e;
    }

    public final C17483e admob() {
        C17483e c17483e = this.zzq;
        return c17483e == null ? C17483e.Signature() : c17483e;
    }

    public final InterfaceC5024e ads() {
        return this.zzt;
    }

    public final int amazon() {
        int advert = AbstractC8495e.advert(this.zzi);
        if (advert == 0) {
            return 1;
        }
        return advert;
    }

    public final String applovin() {
        return this.zzg;
    }

    /* renamed from: class, reason: not valid java name */
    public final boolean m4206class() {
        return (this.zzd & 64) != 0;
    }

    public final boolean crashlytics() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: extends, reason: not valid java name */
    public final boolean m4207extends() {
        return (this.zzd & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0;
    }

    public final boolean firebase() {
        return (this.zzd & 8192) != 0;
    }

    /* renamed from: goto, reason: not valid java name */
    public final boolean m4208goto() {
        return (this.zzd & 128) != 0;
    }

    public final C16411e inmobi() {
        C16411e c16411e = this.zzn;
        return c16411e == null ? C16411e.amazon() : c16411e;
    }

    /* renamed from: interface, reason: not valid java name */
    public final boolean m4209interface() {
        return (this.zzd & 2048) != 0;
    }

    public final AbstractC13532e isPro() {
        return this.zzf;
    }

    public final C6526e isVip() {
        C6526e c6526e = this.zzo;
        return c6526e == null ? C6526e.amazon() : c6526e;
    }

    public final int loadAd() {
        return this.zzt.size();
    }

    /* renamed from: native, reason: not valid java name */
    public final boolean m4210native() {
        return (this.zzd & 1024) != 0;
    }

    public final C17200e pro() {
        C17200e c17200e = this.zzk;
        return c17200e == null ? C17200e.amazon() : c17200e;
    }

    public final C3476e remoteconfig() {
        C3476e c3476e = this.zzr;
        return c3476e == null ? C3476e.amazon() : c3476e;
    }

    public final C8214e signatures() {
        C8214e c8214e = this.zzp;
        return c8214e == null ? C8214e.Signature() : c8214e;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", C11732e.billing, "zzf", "zzg", "zzi", C11732e.yandex, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", C0304e.class, "zzv", "zzw", C0304e.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i2 == 3) {
            return new C16896e();
        }
        if (i2 == 4) {
            return new AbstractC15425e(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzA = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final boolean subs() {
        return (this.zzd & 4096) != 0;
    }

    public final C9643e subscription() {
        C9643e c9643e = this.zzj;
        return c9643e == null ? C9643e.loadAd() : c9643e;
    }

    public final C1700e tapsense() {
        C1700e c1700e = this.zzm;
        return c1700e == null ? C1700e.amazon() : c1700e;
    }

    /* renamed from: this, reason: not valid java name */
    public final boolean m4211this() {
        return (this.zzd & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
    }

    /* renamed from: throw, reason: not valid java name */
    public final int m4212throw() {
        int advert = AbstractC3415e.advert(this.zze);
        if (advert == 0) {
            return 1;
        }
        return advert;
    }
}
