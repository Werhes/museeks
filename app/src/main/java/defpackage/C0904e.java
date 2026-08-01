package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904e extends AbstractC13616e implements InterfaceC1683e, InterfaceC12415e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public boolean f3303e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public InterfaceC13547e f3304e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f3305e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public EnumC17426e f3306e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C11950e f3307e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C11458e f3309e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f3310e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C5389e f3311e = new C5389e(5);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public long f3308e = AbstractC2154e.ad;

    public C0904e(EnumC17426e enumC17426e, C11950e c11950e, boolean z, InterfaceC13547e interfaceC13547e, C11458e c11458e) {
        this.f3306e = enumC17426e;
        this.f3307e = c11950e;
        this.f3305e = z;
        this.f3304e = interfaceC13547e;
        this.f3309e = c11458e;
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public static boolean m410e(C0904e c0904e, C0763e c0763e, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = c0904e.m412e();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long m413e = c0904e.m413e(c0763e, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (m413e >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (m413e & 4294967295L))) <= 0.5f;
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public static final float m411e(C0904e c0904e, InterfaceC13547e interfaceC13547e, long j) {
        char c;
        C0763e c0763e;
        int compare;
        long j2 = c0904e.f3308e;
        C12431e c12431e = (C12431e) c0904e.f3311e.f11540e;
        int i = c12431e.f24868e - 1;
        Object[] objArr = c12431e.f24870e;
        if (i < objArr.length) {
            c0763e = null;
            while (true) {
                if (i < 0) {
                    c = ' ';
                    break;
                }
                C0763e c0763e2 = (C0763e) ((C8735e) objArr[i]).ad.invoke();
                if (c0763e2 != null) {
                    long billing = c0763e2.billing();
                    long startapp = AbstractC8116e.startapp(c0904e.m412e());
                    c = ' ';
                    int ordinal = c0904e.f3306e.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (billing & 4294967295L)), Float.intBitsToFloat((int) (startapp & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            throw new C14803e(10);
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (billing >> 32)), Float.intBitsToFloat((int) (startapp >> 32)));
                    }
                    if (compare <= 0) {
                        c0763e = c0763e2;
                    } else if (c0763e == null) {
                        c0763e = c0763e2;
                    }
                }
                i--;
            }
        } else {
            c = ' ';
            c0763e = null;
        }
        if (c0763e == null) {
            C0763e c0763e3 = c0904e.f3303e ? (C0763e) c0904e.f3309e.invoke() : null;
            if (c0763e3 == null) {
                return 0.0f;
            }
            c0763e = c0763e3;
        }
        long startapp2 = AbstractC8116e.startapp(j2);
        int ordinal2 = c0904e.f3306e.ordinal();
        if (ordinal2 == 0) {
            float f = c0763e.vip;
            return interfaceC13547e.ad(f - ((int) (j & 4294967295L)), c0763e.license - f, Float.intBitsToFloat((int) (startapp2 & 4294967295L)));
        }
        if (ordinal2 != 1) {
            throw new C14803e(10);
        }
        float f2 = c0763e.ad;
        return interfaceC13547e.ad(f2 - ((int) (j >> c)), c0763e.metrica - f2, Float.intBitsToFloat((int) (startapp2 >> c)));
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final long m412e() {
        long j = this.f3308e;
        if (C12729e.vip(j, AbstractC2154e.ad)) {
            return 0L;
        }
        return j;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final long m413e(C0763e c0763e, long j, long j2) {
        long startapp = AbstractC8116e.startapp(j);
        int ordinal = this.f3306e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            InterfaceC13547e interfaceC13547e = this.f3304e;
            if (interfaceC13547e == null) {
                interfaceC13547e = (InterfaceC13547e) AbstractC10432e.vip(this, AbstractC11998e.ad);
            }
            float f = c0763e.ad;
            return (Float.floatToRawIntBits(interfaceC13547e.ad(f - ((int) (j2 >> 32)), c0763e.metrica - f, Float.intBitsToFloat((int) (startapp >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        InterfaceC13547e interfaceC13547e2 = this.f3304e;
        if (interfaceC13547e2 == null) {
            interfaceC13547e2 = (InterfaceC13547e) AbstractC10432e.vip(this, AbstractC11998e.ad);
        }
        float f2 = c0763e.vip;
        float ad = interfaceC13547e2.ad(f2 - ((int) (j2 & 4294967295L)), c0763e.license - f2, Float.intBitsToFloat((int) (startapp & 4294967295L)));
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(ad) & 4294967295L);
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final void m414e(long j) {
        InterfaceC13547e interfaceC13547e = this.f3304e;
        if (interfaceC13547e == null) {
            interfaceC13547e = (InterfaceC13547e) AbstractC10432e.vip(this, AbstractC11998e.ad);
        }
        InterfaceC13547e interfaceC13547e2 = interfaceC13547e;
        if (this.f3310e) {
            AbstractC8889e.metrica("launchAnimation called when previous animation was running");
        }
        InterfaceC13547e interfaceC13547e3 = this.f3304e;
        if (interfaceC13547e3 == null) {
            interfaceC13547e3 = (InterfaceC13547e) AbstractC10432e.vip(this, AbstractC11998e.ad);
        }
        AbstractC5336e.purchase(m3623e(), null, 4, new C14749e(this, new C0243e(interfaceC13547e3.vip()), interfaceC13547e2, j, (InterfaceC5083e) null), 1);
    }

    @Override // defpackage.InterfaceC12415e
    public final void signatures(long j) {
        int yandex;
        long j2;
        long j3;
        long j4;
        long m412e = m412e();
        this.f3308e = j;
        int ordinal = this.f3306e.ordinal();
        if (ordinal == 0) {
            yandex = AbstractC7890e.yandex((int) (j & 4294967295L), (int) (m412e & 4294967295L));
        } else {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            yandex = AbstractC7890e.yandex((int) (j >> 32), (int) (m412e >> 32));
        }
        if (yandex >= 0) {
            return;
        }
        if (this.f3305e) {
            j2 = 0;
        } else {
            if (this.f3306e == EnumC17426e.f34146e) {
                j3 = 0 << 32;
                j4 = ((int) (m412e & 4294967295L)) - ((int) (j & 4294967295L));
            } else {
                j3 = (((int) (m412e >> 32)) - ((int) (j >> 32))) << 32;
                j4 = 0;
            }
            j2 = j3 | (j4 & 4294967295L);
        }
        long j5 = j2;
        C0763e c0763e = (C0763e) this.f3309e.invoke();
        if (c0763e == null || this.f3310e || this.f3303e || !m410e(this, c0763e, m412e, 0L, 2) || m410e(this, c0763e, 0L, j5, 1)) {
            return;
        }
        this.f3303e = true;
        m414e(j5);
    }
}
