package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10727e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C2815e f21126e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f21127e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C11447e f21129e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public float f21128e = 1.0f;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public EnumC7792e f21125e = EnumC7792e.f15794e;

    public static /* synthetic */ void yandex(AbstractC10727e abstractC10727e, InterfaceC2235e interfaceC2235e, long j, C2815e c2815e, int i) {
        if ((i & 4) != 0) {
            c2815e = null;
        }
        abstractC10727e.billing(interfaceC2235e, j, 1.0f, c2815e);
    }

    public abstract void adcel(InterfaceC2235e interfaceC2235e);

    public boolean appmetrica(C2815e c2815e) {
        return false;
    }

    public final void billing(InterfaceC2235e interfaceC2235e, long j, float f, C2815e c2815e) {
        if (this.f21128e != f) {
            if (!license(f)) {
                if (f == 1.0f) {
                    C11447e c11447e = this.f21129e;
                    if (c11447e != null) {
                        c11447e.metrica(f);
                    }
                    this.f21127e = false;
                } else {
                    C11447e c11447e2 = this.f21129e;
                    if (c11447e2 == null) {
                        c11447e2 = AbstractC17331e.vip();
                        this.f21129e = c11447e2;
                    }
                    c11447e2.metrica(f);
                    this.f21127e = true;
                }
            }
            this.f21128e = f;
        }
        if (!AbstractC7890e.billing(this.f21126e, c2815e)) {
            if (!appmetrica(c2815e)) {
                if (c2815e == null) {
                    C11447e c11447e3 = this.f21129e;
                    if (c11447e3 != null) {
                        c11447e3.purchase(null);
                    }
                    this.f21127e = false;
                } else {
                    C11447e c11447e4 = this.f21129e;
                    if (c11447e4 == null) {
                        c11447e4 = AbstractC17331e.vip();
                        this.f21129e = c11447e4;
                    }
                    c11447e4.purchase(c2815e);
                    this.f21127e = true;
                }
            }
            this.f21126e = c2815e;
        }
        EnumC7792e layoutDirection = interfaceC2235e.getLayoutDirection();
        if (this.f21125e != layoutDirection) {
            purchase(layoutDirection);
            this.f21125e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((C5389e) interfaceC2235e.mo782finally().f36228e).isPro(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.f21127e) {
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        float intBitsToFloat4 = Float.intBitsToFloat(i2);
                        C0763e billing = AbstractC18489e.billing(0L, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        InterfaceC14576e m4557this = interfaceC2235e.mo782finally().m4557this();
                        C11447e c11447e5 = this.f21129e;
                        if (c11447e5 == null) {
                            c11447e5 = AbstractC17331e.vip();
                            this.f21129e = c11447e5;
                        }
                        try {
                            m4557this.pro(billing, c11447e5);
                            adcel(interfaceC2235e);
                            m4557this.admob();
                        } catch (Throwable th) {
                            m4557this.admob();
                            throw th;
                        }
                    } else {
                        adcel(interfaceC2235e);
                    }
                }
            } catch (Throwable th2) {
                ((C5389e) interfaceC2235e.mo782finally().f36228e).isPro(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th2;
            }
        }
        ((C5389e) interfaceC2235e.mo782finally().f36228e).isPro(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    public boolean license(float f) {
        return false;
    }

    public void purchase(EnumC7792e enumC7792e) {
    }

    public abstract long startapp();
}
