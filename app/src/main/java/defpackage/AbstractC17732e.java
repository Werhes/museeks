package defpackage;

import android.os.Build;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17732e extends AbstractC9292e implements InterfaceC16719e, InterfaceC0043e, InterfaceC10614e {

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public static final C6173e f34772e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public static final C13023e f34774e;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public boolean f34775e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public boolean f34776e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public AbstractC17732e f34777e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public InterfaceC0983e f34778e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public C2359e f34780e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f34781e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C13915e f34782e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public C16446e f34783e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f34784e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public C16446e f34785e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public float f34786e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public InterfaceC17242e f34787e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public C17866e f34788e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public Function1 f34790e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public C12792e f34791e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public boolean f34792e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public AbstractC17732e f34794e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public boolean f34795e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public InterfaceC14388e f34796e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public EnumC7792e f34797e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public InterfaceC14576e f34798e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public C3660e f34800e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public boolean f34801e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public static final C10122e f34770e = new C10122e();

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public static final C12792e f34773e = new C12792e();

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public static final float[] f34771e = C6739e.ad();

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public float f34789e = 0.8f;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public long f34793e = 0;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public InterfaceC16154e f34779e = AbstractC10432e.ad;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final C13479e f34799e = new C13479e(this, 1);

    static {
        int i = 5;
        f34772e = new C6173e(i);
        f34774e = new C13023e(i);
    }

    public AbstractC17732e(C13915e c13915e) {
        this.f34782e = c13915e;
        this.f34796e = c13915e.f27604e;
        this.f34797e = c13915e.f27610e;
    }

    /* renamed from: eؒ٘ؗ, reason: contains not printable characters */
    public static AbstractC17732e m4385e(InterfaceC0043e interfaceC0043e) {
        AbstractC17732e abstractC17732e;
        C13221e c13221e = interfaceC0043e instanceof C13221e ? (C13221e) interfaceC0043e : null;
        return (c13221e == null || (abstractC17732e = c13221e.f26246e.f9109e) == null) ? (AbstractC17732e) interfaceC0043e : abstractC17732e;
    }

    @Override // defpackage.InterfaceC0043e
    public final long Signature(long j) {
        if (!mo2524e().f27016e) {
            AbstractC14070e.metrica("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(this.f34782e)).signatures(mo211this(j));
    }

    @Override // defpackage.InterfaceC0043e
    public final void adcel(InterfaceC0043e interfaceC0043e, float[] fArr) {
        AbstractC17732e m4385e = m4385e(interfaceC0043e);
        m4385e.m4395e();
        AbstractC17732e m4401e = m4401e(m4385e);
        C6739e.license(fArr);
        m4385e.m4387e(m4401e, fArr);
        m4392e(m4401e, fArr);
    }

    @Override // defpackage.InterfaceC0043e
    public final long advert() {
        return this.f6803e;
    }

    @Override // defpackage.InterfaceC0043e
    public final boolean billing() {
        return mo2524e().f27016e;
    }

    @Override // defpackage.AbstractC2832e
    /* renamed from: case */
    public abstract void mo1207case(long j, float f, C16446e c16446e);

    @Override // defpackage.InterfaceC0043e
    /* renamed from: class */
    public final long mo207class(InterfaceC0043e interfaceC0043e, long j) {
        return mo210native(interfaceC0043e, j, true);
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: continue */
    public final C13915e mo1461continue() {
        return this.f34782e;
    }

    /* renamed from: eَؑۨ, reason: contains not printable characters */
    public final long m4386e() {
        return this.f34796e.mo494e(this.f34782e.f27601e.license());
    }

    /* renamed from: eۣؑۡ, reason: contains not printable characters */
    public final void m4387e(AbstractC17732e abstractC17732e, float[] fArr) {
        for (AbstractC17732e abstractC17732e2 = this; !AbstractC7890e.billing(abstractC17732e2, abstractC17732e); abstractC17732e2 = abstractC17732e2.f34794e) {
            InterfaceC0983e interfaceC0983e = abstractC17732e2.f34778e;
            if (interfaceC0983e != null) {
                C6739e.startapp(fArr, ((C5048e) interfaceC0983e).vip());
            }
            if (!C11490e.vip(abstractC17732e2.f34793e, 0L)) {
                float[] fArr2 = f34771e;
                C6739e.license(fArr2);
                C6739e.adcel(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                C6739e.startapp(fArr, fArr2);
            }
        }
    }

    /* renamed from: eؒٚۨ */
    public void mo3841e(InterfaceC11124e interfaceC11124e, long j, C2106e c2106e, int i, boolean z) {
        AbstractC17732e abstractC17732e = this.f34777e;
        if (abstractC17732e != null) {
            abstractC17732e.m4412e(interfaceC11124e, abstractC17732e.m4405e(j, true), c2106e, i, z);
        }
    }

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public final long m4388e(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - mo1206break();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - mo1209protected();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: eؒۖۗ */
    public final void mo1463e() {
        C16446e c16446e = this.f34785e;
        if (c16446e != null) {
            mo1207case(this.f34793e, this.f34786e, c16446e);
        } else {
            mo392catch(this.f34793e, this.f34786e, this.f34790e);
        }
    }

    /* renamed from: eّؔٞ, reason: contains not printable characters */
    public final void m4389e() {
        if (this.f34778e != null) {
            if (this.f34785e != null) {
                this.f34785e = null;
            }
            m4399e(null, false);
            this.f34782e.m3716new(false);
        }
    }

    /* renamed from: eِؕٛ */
    public abstract void mo2522e(InterfaceC14576e interfaceC14576e, C16446e c16446e);

    /* renamed from: eٍؖۙ, reason: contains not printable characters */
    public final void m4390e(AbstractC13616e abstractC13616e, InterfaceC11124e interfaceC11124e, long j, C2106e c2106e, int i, boolean z, float f) {
        if (abstractC13616e == null) {
            mo3841e(interfaceC11124e, j, c2106e, i, z);
            return;
        }
        if (!interfaceC11124e.billing(abstractC13616e)) {
            m4390e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z, f);
            return;
        }
        int i2 = c2106e.f5431e;
        C12328e c12328e = c2106e.f5433e;
        c2106e.billing(i2 + 1, c12328e.vip);
        c2106e.f5431e++;
        c12328e.ad(abstractC13616e);
        c2106e.f5432e.ad(AbstractC9528e.ad(f, z, false));
        m4411e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z, f, true);
        c2106e.f5431e = i2;
    }

    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public final void m4391e(InterfaceC14576e interfaceC14576e, C16446e c16446e) {
        InterfaceC14576e interfaceC14576e2;
        C16446e c16446e2;
        AbstractC13616e m4410e = m4410e(4);
        if (m4410e == null) {
            mo2522e(interfaceC14576e, c16446e);
            return;
        }
        C13915e c13915e = this.f34782e;
        c13915e.getClass();
        C4017e sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getSharedDrawScope();
        long startapp = AbstractC8116e.startapp(this.f6803e);
        sharedDrawScope.getClass();
        C12431e c12431e = null;
        while (m4410e != null) {
            if (m4410e instanceof InterfaceC8501e) {
                interfaceC14576e2 = interfaceC14576e;
                c16446e2 = c16446e;
                sharedDrawScope.metrica(interfaceC14576e2, startapp, this, (InterfaceC8501e) m4410e, c16446e2);
            } else {
                interfaceC14576e2 = interfaceC14576e;
                c16446e2 = c16446e;
                if ((m4410e.f27014e & 4) != 0 && (m4410e instanceof AbstractC6126e)) {
                    int i = 0;
                    for (AbstractC13616e abstractC13616e = ((AbstractC6126e) m4410e).f12873e; abstractC13616e != null; abstractC13616e = abstractC13616e.f27024e) {
                        if ((abstractC13616e.f27014e & 4) != 0) {
                            i++;
                            if (i == 1) {
                                m4410e = abstractC13616e;
                            } else {
                                if (c12431e == null) {
                                    c12431e = new C12431e(0, new AbstractC13616e[16]);
                                }
                                if (m4410e != null) {
                                    c12431e.license(m4410e);
                                    m4410e = null;
                                }
                                c12431e.license(abstractC13616e);
                            }
                        }
                    }
                    if (i == 1) {
                        interfaceC14576e = interfaceC14576e2;
                        c16446e = c16446e2;
                    }
                }
            }
            m4410e = AbstractC5851e.vip(c12431e);
            interfaceC14576e = interfaceC14576e2;
            c16446e = c16446e2;
        }
    }

    /* renamed from: eؙؙٝ, reason: contains not printable characters */
    public final void m4392e(AbstractC17732e abstractC17732e, float[] fArr) {
        float[] ad;
        if (AbstractC7890e.billing(abstractC17732e, this)) {
            return;
        }
        this.f34794e.m4392e(abstractC17732e, fArr);
        if (!C11490e.vip(this.f34793e, 0L)) {
            float[] fArr2 = f34771e;
            C6739e.license(fArr2);
            long j = this.f34793e;
            C6739e.adcel(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            C6739e.startapp(fArr, fArr2);
        }
        InterfaceC0983e interfaceC0983e = this.f34778e;
        if (interfaceC0983e == null || (ad = ((C5048e) interfaceC0983e).ad()) == null) {
            return;
        }
        C6739e.startapp(fArr, ad);
    }

    /* renamed from: eٍؙّ, reason: contains not printable characters */
    public final void m4393e(C2359e c2359e, boolean z, boolean z2) {
        long j;
        InterfaceC0983e interfaceC0983e = this.f34778e;
        if (interfaceC0983e != null) {
            if (this.f34776e) {
                if (z2) {
                    long m4386e = m4386e();
                    float f = c2359e.vip;
                    float f2 = c2359e.metrica;
                    if (c2359e.license >= 0.0f) {
                        long j2 = this.f6803e;
                        if (f <= ((int) (j2 >> 32)) && c2359e.appmetrica >= 0.0f && f2 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (m4386e >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (m4386e & 4294967295L));
                            float f3 = (intBitsToFloat - (c2359e.license - c2359e.vip)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (c2359e.appmetrica - c2359e.metrica)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.f6803e;
                            float f7 = (int) (j3 >> 32);
                            int i = (int) (m4386e >> 32);
                            float f8 = (int) (j3 & 4294967295L);
                            int i2 = (int) (m4386e & 4294967295L);
                            c2359e.ad(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.f6803e;
                    float f72 = (int) (j32 >> 32);
                    int i3 = (int) (m4386e >> 32);
                    float f82 = (int) (j32 & 4294967295L);
                    int i22 = (int) (m4386e & 4294967295L);
                    c2359e.ad(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.f6803e;
                    c2359e.ad(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (c2359e.vip()) {
                    return;
                }
            }
            C5048e c5048e = (C5048e) interfaceC0983e;
            float[] vip = c5048e.vip();
            if (!c5048e.f10769e) {
                if (vip == null) {
                    c2359e.vip = 0.0f;
                    c2359e.metrica = 0.0f;
                    c2359e.license = 0.0f;
                    c2359e.appmetrica = 0.0f;
                } else {
                    C6739e.metrica(vip, c2359e);
                }
            }
        }
        long j5 = this.f34793e;
        float f9 = (int) (j5 >> 32);
        c2359e.vip += f9;
        c2359e.license += f9;
        float f10 = (int) (j5 & 4294967295L);
        c2359e.metrica += f10;
        c2359e.appmetrica += f10;
    }

    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public final float m4394e(long j, long j2) {
        if (mo1206break() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo1209protected() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long m4388e = m4388e(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (m4388e >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m4388e & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - mo1206break());
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r8 : r8 - mo1209protected())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if ((intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) <= intBitsToFloat2) {
            return C2152e.license(floatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final void m4395e() {
        this.f34782e.f27612e.vip();
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final long m4396e(AbstractC17732e abstractC17732e, long j, boolean z) {
        if (abstractC17732e == this) {
            return j;
        }
        AbstractC17732e abstractC17732e2 = this.f34794e;
        return (abstractC17732e2 == null || AbstractC7890e.billing(abstractC17732e, abstractC17732e2)) ? m4405e(j, z) : m4405e(abstractC17732e2.m4396e(abstractC17732e, j, z), z);
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: eًًؓ */
    public final AbstractC9292e mo1466e() {
        return this.f34794e;
    }

    /* renamed from: eٌؙٞ, reason: contains not printable characters */
    public final void m4397e(long j, float f, Function1 function1, C16446e c16446e) {
        C13915e c13915e = this.f34782e;
        if (c16446e != null) {
            if (function1 != null) {
                AbstractC14070e.ad("both ways to create layers shouldn't be used together");
            }
            if (this.f34785e != c16446e) {
                this.f34785e = null;
                m4399e(null, false);
                this.f34785e = c16446e;
            }
            if (this.f34778e == null) {
                InterfaceC16590e ad = AbstractC10501e.ad(c13915e);
                C3660e c3660e = this.f34800e;
                if (c3660e == null) {
                    C3660e c3660e2 = new C3660e(this, new C13479e(this, 0), 3);
                    this.f34800e = c3660e2;
                    c3660e = c3660e2;
                }
                C13479e c13479e = this.f34799e;
                InterfaceC0983e startapp = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) ad).startapp(c3660e, c13479e, c16446e);
                C5048e c5048e = (C5048e) startapp;
                c5048e.appmetrica(this.f6803e);
                c5048e.license(j);
                this.f34778e = startapp;
                c13915e.f27619e = true;
                c13479e.invoke();
            }
        } else {
            if (this.f34785e != null) {
                this.f34785e = null;
                m4399e(null, false);
            }
            m4399e(function1, false);
        }
        if (!C11490e.vip(this.f34793e, j)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).m1704protected(-4.0f);
            this.f34793e = j;
            InterfaceC0983e interfaceC0983e = this.f34778e;
            if (interfaceC0983e != null) {
                ((C5048e) interfaceC0983e).license(j);
            } else {
                AbstractC17732e abstractC17732e = this.f34794e;
                if (abstractC17732e != null) {
                    abstractC17732e.m4404e();
                }
            }
            c13915e.m3701abstract(this);
            AbstractC9292e.m2535e(this);
            InterfaceC16590e interfaceC16590e = c13915e.f27599e;
            if (interfaceC16590e != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC5014e) interfaceC16590e).ads(c13915e);
            }
        }
        this.f34786e = f;
        if (this == ((AbstractC17732e) c13915e.f27592e.appmetrica)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getRectManager().appmetrica(c13915e);
        }
        if (this.f18514e) {
            return;
        }
        m2536else(mo1469e());
    }

    /* renamed from: eٌۘۤ, reason: contains not printable characters */
    public final void m4398e() {
        this.f34801e = true;
        this.f34799e.invoke();
        m4389e();
        if (C11490e.vip(this.f34793e, 0L)) {
            return;
        }
        this.f34782e.m3701abstract(this);
    }

    /* renamed from: eٌۡٔ, reason: contains not printable characters */
    public final void m4399e(Function1 function1, boolean z) {
        InterfaceC16590e interfaceC16590e;
        C12431e c12431e;
        Reference poll;
        if (function1 != null && this.f34785e != null) {
            AbstractC14070e.ad("layerBlock can't be provided when explicitLayer is provided");
        }
        C13915e c13915e = this.f34782e;
        boolean z2 = (!z && this.f34790e == function1 && AbstractC7890e.billing(this.f34796e, c13915e.f27604e) && this.f34797e == c13915e.f27610e) ? false : true;
        this.f34796e = c13915e.f27604e;
        this.f34797e = c13915e.f27610e;
        boolean m3708extends = c13915e.m3708extends();
        C13479e c13479e = this.f34799e;
        if (m3708extends && function1 != null) {
            this.f34790e = function1;
            if (this.f34778e != null) {
                if (z2) {
                    m4406e(true);
                    return;
                }
                return;
            }
            InterfaceC16590e ad = AbstractC10501e.ad(c13915e);
            C3660e c3660e = this.f34800e;
            if (c3660e == null) {
                C3660e c3660e2 = new C3660e(this, new C13479e(this, 0), 3);
                this.f34800e = c3660e2;
                c3660e = c3660e2;
            }
            InterfaceC0983e startapp = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) ad).startapp(c3660e, c13479e, null);
            C5048e c5048e = (C5048e) startapp;
            c5048e.appmetrica(this.f6803e);
            c5048e.license(this.f34793e);
            this.f34778e = startapp;
            m4406e(true);
            c13915e.f27619e = true;
            c13479e.invoke();
            return;
        }
        this.f34790e = null;
        InterfaceC0983e interfaceC0983e = this.f34778e;
        if (interfaceC0983e != null) {
            C5048e c5048e2 = (C5048e) interfaceC0983e;
            ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = c5048e2.f10758e;
            if (!AbstractC11309e.billing(c5048e2.vip())) {
                c13915e.m3701abstract(this);
            }
            c5048e2.f10770e = null;
            c5048e2.f10755e = null;
            c5048e2.f10773e = true;
            if (c5048e2.f10759e) {
                c5048e2.f10759e = false;
                viewTreeObserverOnGlobalLayoutListenerC5014e.isPro(c5048e2, false);
            }
            InterfaceC2661e interfaceC2661e = c5048e2.f10763e;
            if (interfaceC2661e != null) {
                interfaceC2661e.ad(c5048e2.f10772e);
                C3168e c3168e = viewTreeObserverOnGlobalLayoutListenerC5014e.f10621e;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) c3168e.f7272e;
                    c12431e = (C12431e) c3168e.f7271e;
                    poll = referenceQueue.poll();
                    if (poll != null) {
                        c12431e.smaato(poll);
                    }
                } while (poll != null);
                c12431e.license(new WeakReference(c5048e2, (ReferenceQueue) c3168e.f7272e));
                viewTreeObserverOnGlobalLayoutListenerC5014e.f10660e.advert(c5048e2);
            }
            this.f34778e = null;
            c13915e.f27619e = true;
            c13479e.invoke();
            if (mo2524e().f27016e && c13915e.m3724throw() && (interfaceC16590e = c13915e.f27599e) != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC5014e) interfaceC16590e).ads(c13915e);
            }
        }
        this.f34775e = false;
    }

    /* renamed from: eٍؓۙ, reason: contains not printable characters */
    public final void m4400e() {
        boolean billing = AbstractC5180e.billing(1048576);
        AbstractC13616e m4403e = m4403e(billing);
        if (m4403e == null || (m4403e.f27022e.f27020e & 1048576) == 0) {
            return;
        }
        AbstractC13616e mo2524e = mo2524e();
        if (!billing && (mo2524e = mo2524e.f27011e) == null) {
            return;
        }
        for (AbstractC13616e m4403e2 = m4403e(billing); m4403e2 != null && (m4403e2.f27020e & 1048576) != 0; m4403e2 = m4403e2.f27024e) {
            if ((m4403e2.f27014e & 1048576) != 0) {
                AbstractC13616e abstractC13616e = m4403e2;
                C12431e c12431e = null;
                while (abstractC13616e != null) {
                    if ((abstractC13616e.f27014e & 1048576) != 0 && (abstractC13616e instanceof AbstractC6126e)) {
                        int i = 0;
                        for (AbstractC13616e abstractC13616e2 = ((AbstractC6126e) abstractC13616e).f12873e; abstractC13616e2 != null; abstractC13616e2 = abstractC13616e2.f27024e) {
                            if ((abstractC13616e2.f27014e & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC13616e = abstractC13616e2;
                                } else {
                                    if (c12431e == null) {
                                        c12431e = new C12431e(0, new AbstractC13616e[16]);
                                    }
                                    if (abstractC13616e != null) {
                                        c12431e.license(abstractC13616e);
                                        abstractC13616e = null;
                                    }
                                    c12431e.license(abstractC13616e2);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC13616e = AbstractC5851e.vip(c12431e);
                }
            }
            if (m4403e2 == mo2524e) {
                return;
            }
        }
    }

    /* renamed from: eٍۢؒ */
    public abstract AbstractC13616e mo2524e();

    @Override // defpackage.AbstractC9292e
    /* renamed from: eُؚٕ */
    public final long mo1467e() {
        return this.f34793e;
    }

    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public final AbstractC17732e m4401e(AbstractC17732e abstractC17732e) {
        C13915e c13915e = abstractC17732e.f34782e;
        C13915e c13915e2 = this.f34782e;
        if (c13915e == c13915e2) {
            AbstractC13616e mo2524e = abstractC17732e.mo2524e();
            AbstractC13616e mo2524e2 = mo2524e();
            if (!mo2524e2.f27022e.f27016e) {
                AbstractC14070e.metrica("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC13616e abstractC13616e = mo2524e2.f27022e.f27011e; abstractC13616e != null; abstractC13616e = abstractC13616e.f27011e) {
                if ((abstractC13616e.f27014e & 2) != 0 && abstractC13616e == mo2524e) {
                    return abstractC17732e;
                }
            }
            return this;
        }
        while (c13915e.f27590e > c13915e2.f27590e) {
            c13915e = c13915e.tapsense();
        }
        C13915e c13915e3 = c13915e2;
        while (c13915e3.f27590e > c13915e.f27590e) {
            c13915e3 = c13915e3.tapsense();
        }
        while (c13915e != c13915e3) {
            c13915e = c13915e.tapsense();
            c13915e3 = c13915e3.tapsense();
            if (c13915e == null || c13915e3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (c13915e3 != c13915e2) {
            if (c13915e != abstractC17732e.f34782e) {
                return (C14747e) c13915e.f27592e.license;
            }
            return abstractC17732e;
        }
        return this;
    }

    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public final void m4402e(AbstractC17732e abstractC17732e, C2359e c2359e, boolean z) {
        if (abstractC17732e == this) {
            return;
        }
        AbstractC17732e abstractC17732e2 = this.f34794e;
        if (abstractC17732e2 != null) {
            abstractC17732e2.m4402e(abstractC17732e, c2359e, z);
        }
        long j = this.f34793e;
        float f = (int) (j >> 32);
        c2359e.vip -= f;
        c2359e.license -= f;
        float f2 = (int) (j & 4294967295L);
        c2359e.metrica -= f2;
        c2359e.appmetrica -= f2;
        InterfaceC0983e interfaceC0983e = this.f34778e;
        if (interfaceC0983e != null) {
            C5048e c5048e = (C5048e) interfaceC0983e;
            float[] ad = c5048e.ad();
            if (!c5048e.f10769e) {
                if (ad == null) {
                    c2359e.vip = 0.0f;
                    c2359e.metrica = 0.0f;
                    c2359e.license = 0.0f;
                    c2359e.appmetrica = 0.0f;
                } else {
                    C6739e.metrica(ad, c2359e);
                }
            }
            if (this.f34776e && z) {
                long j2 = this.f6803e;
                c2359e.ad(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    /* renamed from: eؙِۡ, reason: contains not printable characters */
    public final AbstractC13616e m4403e(boolean z) {
        AbstractC13616e mo2524e;
        C14742e c14742e = this.f34782e.f27592e;
        if (((AbstractC17732e) c14742e.appmetrica) == this) {
            return (AbstractC13616e) c14742e.billing;
        }
        if (!z) {
            AbstractC17732e abstractC17732e = this.f34794e;
            if (abstractC17732e != null) {
                return abstractC17732e.mo2524e();
            }
            return null;
        }
        AbstractC17732e abstractC17732e2 = this.f34794e;
        if (abstractC17732e2 == null || (mo2524e = abstractC17732e2.mo2524e()) == null) {
            return null;
        }
        return mo2524e.f27024e;
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final void m4404e() {
        InterfaceC0983e interfaceC0983e = this.f34778e;
        if (interfaceC0983e != null) {
            interfaceC0983e.invalidate();
            return;
        }
        AbstractC17732e abstractC17732e = this.f34794e;
        if (abstractC17732e != null) {
            abstractC17732e.m4404e();
        }
    }

    /* renamed from: eّْٝ, reason: contains not printable characters */
    public final long m4405e(long j, boolean z) {
        if (z || !this.f18515e) {
            long j2 = this.f34793e;
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
            j = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        }
        InterfaceC0983e interfaceC0983e = this.f34778e;
        return interfaceC0983e != null ? ((C5048e) interfaceC0983e).metrica(j, true) : j;
    }

    /* renamed from: eّ۟ٝ, reason: contains not printable characters */
    public final void m4406e(boolean z) {
        char c;
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e;
        boolean z2;
        InterfaceC16590e interfaceC16590e;
        Function0 function0;
        int i;
        Function0 function02;
        if (this.f34785e != null) {
            return;
        }
        InterfaceC0983e interfaceC0983e = this.f34778e;
        if (interfaceC0983e == null) {
            if (this.f34790e == null) {
                return;
            }
            AbstractC14070e.metrica("null layer with a non-null layerBlock");
            return;
        }
        Function1 function1 = this.f34790e;
        if (function1 == null) {
            throw AbstractC8703e.Signature("updateLayerParameters requires a non-null layerBlock");
        }
        C10122e c10122e = f34770e;
        c10122e.ad();
        C13915e c13915e = this.f34782e;
        c10122e.f20006e = c13915e.f27604e;
        c10122e.f20012e = c13915e.f27610e;
        c10122e.f19998e = AbstractC8116e.startapp(this.f6803e);
        ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getSnapshotObserver().ad.metrica(this, C8082e.f16404e, new C14194e(function1, this, 8));
        C12792e c12792e = this.f34791e;
        if (c12792e == null) {
            c12792e = new C12792e();
            this.f34791e = c12792e;
        }
        C12792e c12792e2 = f34773e;
        c12792e2.getClass();
        c12792e2.ad = c12792e.ad;
        c12792e2.vip = c12792e.vip;
        c12792e2.metrica = c12792e.metrica;
        c12792e2.license = c12792e.license;
        c12792e2.appmetrica = c12792e.appmetrica;
        c12792e2.purchase = c12792e.purchase;
        c12792e2.billing = c12792e.billing;
        c12792e2.yandex = c12792e.yandex;
        c12792e2.startapp = c12792e.startapp;
        float f = c10122e.f19999e;
        c12792e.ad = f;
        c12792e.vip = c10122e.f19994e;
        c12792e.metrica = c10122e.f19991e;
        c12792e.license = c10122e.f20011e;
        c12792e.appmetrica = c10122e.f19995e;
        c12792e.purchase = c10122e.f20004e;
        c12792e.billing = c10122e.f19993e;
        c12792e.yandex = c10122e.f19992e;
        long j = c10122e.f19997e;
        c12792e.startapp = j;
        C5048e c5048e = (C5048e) interfaceC0983e;
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e2 = c5048e.f10758e;
        int i2 = c10122e.f20009e | c5048e.f10761e;
        c5048e.f10757e = c10122e.f20012e;
        c5048e.f10768e = c10122e.f20006e;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            c5048e.f10765e = j;
        }
        if ((i2 & 1) != 0) {
            InterfaceC3828e interfaceC3828e = c5048e.f10772e.ad;
            if (interfaceC3828e.metrica() != f) {
                interfaceC3828e.applovin(f);
            }
        }
        if ((i2 & 2) != 0) {
            C16446e c16446e = c5048e.f10772e;
            float f2 = c10122e.f19994e;
            InterfaceC3828e interfaceC3828e2 = c16446e.ad;
            if (interfaceC3828e2.mo285while() != f2) {
                interfaceC3828e2.loadAd(f2);
            }
        }
        if ((i2 & 4) != 0) {
            c5048e.f10772e.purchase(c10122e.f20007e);
        }
        if ((i2 & 8) != 0) {
            C16446e c16446e2 = c5048e.f10772e;
            float f3 = c10122e.f19991e;
            InterfaceC3828e interfaceC3828e3 = c16446e2.ad;
            if (interfaceC3828e3.subs() != f3) {
                interfaceC3828e3.mo278goto(f3);
            }
        }
        if ((i2 & 16) != 0) {
            C16446e c16446e3 = c5048e.f10772e;
            float f4 = c10122e.f20011e;
            InterfaceC3828e interfaceC3828e4 = c16446e3.ad;
            if (interfaceC3828e4.tapsense() != f4) {
                interfaceC3828e4.billing(f4);
            }
        }
        if ((i2 & 32) != 0) {
            C16446e c16446e4 = c5048e.f10772e;
            float f5 = c10122e.f20010e;
            InterfaceC3828e interfaceC3828e5 = c16446e4.ad;
            if (interfaceC3828e5.mo283throw() != f5) {
                interfaceC3828e5.license(f5);
                c16446e4.billing = true;
                c16446e4.ad();
            }
            if (c10122e.f20010e > 0.0f && !c5048e.f10775e && (function02 = c5048e.f10755e) != null) {
                function02.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            C16446e c16446e5 = c5048e.f10772e;
            long j2 = c10122e.f20003e;
            InterfaceC3828e interfaceC3828e6 = c16446e5.ad;
            if (!C3618e.metrica(j2, interfaceC3828e6.pro())) {
                interfaceC3828e6.inmobi(j2);
            }
        }
        if ((i2 & 128) != 0) {
            C16446e c16446e6 = c5048e.f10772e;
            long j3 = c10122e.f20008e;
            InterfaceC3828e interfaceC3828e7 = c16446e6.ad;
            if (!C3618e.metrica(j3, interfaceC3828e7.isVip())) {
                interfaceC3828e7.mo282this(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            C16446e c16446e7 = c5048e.f10772e;
            float f6 = c10122e.f19993e;
            InterfaceC3828e interfaceC3828e8 = c16446e7.ad;
            if (interfaceC3828e8.subscription() != f6) {
                interfaceC3828e8.purchase(f6);
            }
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            C16446e c16446e8 = c5048e.f10772e;
            float f7 = c10122e.f19995e;
            InterfaceC3828e interfaceC3828e9 = c16446e8.ad;
            if (interfaceC3828e9.firebase() != f7) {
                interfaceC3828e9.mo284try(f7);
            }
        }
        if ((i2 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            C16446e c16446e9 = c5048e.f10772e;
            float f8 = c10122e.f20004e;
            InterfaceC3828e interfaceC3828e10 = c16446e9.ad;
            if (interfaceC3828e10.Signature() != f8) {
                interfaceC3828e10.vip(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            C16446e c16446e10 = c5048e.f10772e;
            float f9 = c10122e.f19992e;
            InterfaceC3828e interfaceC3828e11 = c16446e10.ad;
            if (interfaceC3828e11.ads() != f9) {
                interfaceC3828e11.mo277extends(f9);
            }
        }
        if (i3 != 0) {
            c = ' ';
            if (C13220e.ad(c5048e.f10765e, C13220e.vip)) {
                C16446e c16446e11 = c5048e.f10772e;
                if (!C2152e.vip(c16446e11.tapsense, 9205357640488583168L)) {
                    c16446e11.tapsense = 9205357640488583168L;
                    c16446e11.ad.remoteconfig(9205357640488583168L);
                }
            } else {
                C16446e c16446e12 = c5048e.f10772e;
                long floatToRawIntBits = (Float.floatToRawIntBits(C13220e.vip(c5048e.f10765e) * ((int) (c5048e.f10774e >> 32))) << 32) | (Float.floatToRawIntBits(C13220e.metrica(c5048e.f10765e) * ((int) (c5048e.f10774e & 4294967295L))) & 4294967295L);
                if (!C2152e.vip(c16446e12.tapsense, floatToRawIntBits)) {
                    c16446e12.tapsense = floatToRawIntBits;
                    c16446e12.ad.remoteconfig(floatToRawIntBits);
                }
            }
        } else {
            c = ' ';
        }
        if ((i2 & 16384) != 0) {
            c5048e.f10772e.billing(c10122e.f20002e);
        }
        if ((131072 & i2) != 0) {
            c5048e.f10772e.yandex(null);
        }
        if ((262144 & i2) != 0) {
            InterfaceC3828e interfaceC3828e12 = c5048e.f10772e.ad;
            if (!AbstractC7890e.billing(interfaceC3828e12.amazon(), null)) {
                interfaceC3828e12.isPro();
            }
        }
        if ((524288 & i2) != 0) {
            C16446e c16446e13 = c5048e.f10772e;
            int i4 = c10122e.f19996e;
            InterfaceC3828e interfaceC3828e13 = c16446e13.ad;
            if (interfaceC3828e13.mo281protected() != i4) {
                interfaceC3828e13.startapp(i4);
            }
        }
        if ((32768 & i2) != 0) {
            C16446e c16446e14 = c5048e.f10772e;
            int i5 = c10122e.f20000e;
            if (i5 == 0) {
                i = 0;
            } else if (i5 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i5 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            InterfaceC3828e interfaceC3828e14 = c16446e14.ad;
            if (interfaceC3828e14.smaato() != i) {
                interfaceC3828e14.mo279interface(i);
            }
        }
        if ((i2 & 7963) != 0) {
            c5048e.f10764e = true;
            c5048e.f10762e = true;
        }
        if (AbstractC7890e.billing(c5048e.f10766e, c10122e.f20005e)) {
            viewTreeObserverOnGlobalLayoutListenerC5014e = viewTreeObserverOnGlobalLayoutListenerC5014e2;
            z2 = false;
        } else {
            AbstractC14073e abstractC14073e = c10122e.f20005e;
            c5048e.f10766e = abstractC14073e;
            if (abstractC14073e == null) {
                viewTreeObserverOnGlobalLayoutListenerC5014e = viewTreeObserverOnGlobalLayoutListenerC5014e2;
            } else {
                C16446e c16446e15 = c5048e.f10772e;
                if (abstractC14073e instanceof C14340e) {
                    C0763e c0763e = ((C14340e) abstractC14073e).appmetrica;
                    float f10 = c0763e.ad;
                    float f11 = c0763e.vip;
                    viewTreeObserverOnGlobalLayoutListenerC5014e = viewTreeObserverOnGlobalLayoutListenerC5014e2;
                    c16446e15.startapp((Float.floatToRawIntBits(f10) << c) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(c0763e.metrica - f10) << c) | (Float.floatToRawIntBits(c0763e.license - f11) & 4294967295L), 0.0f);
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC5014e = viewTreeObserverOnGlobalLayoutListenerC5014e2;
                    if (abstractC14073e instanceof C10435e) {
                        C17985e c17985e = ((C10435e) abstractC14073e).appmetrica;
                        c16446e15.mopub = null;
                        c16446e15.startapp = 9205357640488583168L;
                        c16446e15.yandex = 0L;
                        c16446e15.adcel = 0.0f;
                        c16446e15.billing = true;
                        c16446e15.amazon = false;
                        c16446e15.advert = c17985e;
                        c16446e15.ad();
                    } else {
                        if (!(abstractC14073e instanceof C2904e)) {
                            throw new C14803e(10);
                        }
                        C2904e c2904e = (C2904e) abstractC14073e;
                        C17985e c17985e2 = c2904e.purchase;
                        if (c17985e2 != null) {
                            c16446e15.mopub = null;
                            c16446e15.startapp = 9205357640488583168L;
                            c16446e15.yandex = 0L;
                            c16446e15.adcel = 0.0f;
                            c16446e15.billing = true;
                            c16446e15.amazon = false;
                            c16446e15.advert = c17985e2;
                            c16446e15.ad();
                        } else {
                            c16446e15.startapp((Float.floatToRawIntBits(r8.ad) << c) | (Float.floatToRawIntBits(r8.vip) & 4294967295L), (Float.floatToRawIntBits(r8.vip()) << c) | (Float.floatToRawIntBits(r8.ad()) & 4294967295L), Float.intBitsToFloat((int) (c2904e.appmetrica.yandex >> c)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((abstractC14073e instanceof C10435e) || ((abstractC14073e instanceof C2904e) && !AbstractC13336e.yandex(((C2904e) abstractC14073e).appmetrica))) && (function0 = c5048e.f10755e) != null)) {
                    function0.invoke();
                }
            }
            z2 = true;
        }
        c5048e.f10761e = c10122e.f20009e;
        if (i2 != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0551e.appmetrica(viewTreeObserverOnGlobalLayoutListenerC5014e);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC5014e.invalidate();
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC5014e.loadAd()) {
                viewTreeObserverOnGlobalLayoutListenerC5014e.m1704protected(0.0f);
            }
        }
        boolean z3 = this.f34776e;
        this.f34776e = c10122e.f20002e;
        this.f34789e = c10122e.f20007e;
        boolean z4 = c12792e2.ad == c12792e.ad && c12792e2.vip == c12792e.vip && c12792e2.metrica == c12792e.metrica && c12792e2.license == c12792e.license && c12792e2.appmetrica == c12792e.appmetrica && c12792e2.purchase == c12792e.purchase && c12792e2.billing == c12792e.billing && c12792e2.yandex == c12792e.yandex && C13220e.ad(c12792e2.startapp, c12792e.startapp);
        if (z && ((!z4 || z3 != this.f34776e) && (interfaceC16590e = c13915e.f27599e) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5014e) interfaceC16590e).ads(c13915e);
        }
        if (z4) {
            return;
        }
        c13915e.m3701abstract(this);
        if (c13915e.f27595e > 0) {
            ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e3 = (ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e);
            C5891e c5891e = viewTreeObserverOnGlobalLayoutListenerC5014e3.f10636e.appmetrica;
            c5891e.getClass();
            if (c13915e.f27595e > 0) {
                ((C12431e) c5891e.f12440e).license(c13915e);
                c13915e.f27600e = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC5014e3.m1701goto(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r7v7, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: eًْٕ, reason: contains not printable characters */
    public final void m4407e() {
        AbstractC13616e abstractC13616e;
        boolean billing = AbstractC5180e.billing(128);
        AbstractC13616e m4403e = m4403e(billing);
        if (m4403e == null || (m4403e.f27022e.f27020e & 128) == 0) {
            return;
        }
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            if (billing) {
                abstractC13616e = mo2524e();
            } else {
                abstractC13616e = mo2524e().f27011e;
                if (abstractC13616e == null) {
                    Unit unit = Unit.INSTANCE;
                    AbstractC12640e.Signature(adcel, smaato, appmetrica);
                }
            }
            for (AbstractC13616e m4403e2 = m4403e(billing); m4403e2 != null && (m4403e2.f27020e & 128) != 0; m4403e2 = m4403e2.f27024e) {
                if ((m4403e2.f27014e & 128) != 0) {
                    AbstractC6126e abstractC6126e = m4403e2;
                    ?? r8 = 0;
                    while (abstractC6126e != 0) {
                        if (abstractC6126e instanceof InterfaceC12415e) {
                            ((InterfaceC12415e) abstractC6126e).signatures(this.f6803e);
                        } else if ((abstractC6126e.f27014e & 128) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                            AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e;
                            int i = 0;
                            abstractC6126e = abstractC6126e;
                            r8 = r8;
                            while (abstractC13616e2 != null) {
                                if ((abstractC13616e2.f27014e & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        abstractC6126e = abstractC13616e2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new C12431e(0, new AbstractC13616e[16]);
                                        }
                                        if (abstractC6126e != 0) {
                                            r8.license(abstractC6126e);
                                            abstractC6126e = 0;
                                        }
                                        r8.license(abstractC13616e2);
                                    }
                                }
                                abstractC13616e2 = abstractC13616e2.f27024e;
                                abstractC6126e = abstractC6126e;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC6126e = AbstractC5851e.vip(r8);
                    }
                }
                if (m4403e2 == abstractC13616e) {
                    break;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
        } catch (Throwable th) {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: eْٗۚ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4408e(long r26) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17732e.m4408e(long):boolean");
    }

    /* renamed from: eْۢؕ, reason: contains not printable characters */
    public final void m4409e(AbstractC13616e abstractC13616e, InterfaceC11124e interfaceC11124e, long j, C2106e c2106e, int i, boolean z) {
        if (abstractC13616e == null) {
            mo3841e(interfaceC11124e, j, c2106e, i, z);
            return;
        }
        if (!interfaceC11124e.billing(abstractC13616e)) {
            m4409e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z);
            return;
        }
        int i2 = c2106e.f5431e;
        C12328e c12328e = c2106e.f5433e;
        c2106e.billing(i2 + 1, c12328e.vip);
        c2106e.f5431e++;
        c12328e.ad(abstractC13616e);
        c2106e.f5432e.ad(AbstractC9528e.ad(-1.0f, z, false));
        m4409e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z);
        c2106e.f5431e = i2;
    }

    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public final AbstractC13616e m4410e(int i) {
        boolean billing = AbstractC5180e.billing(i);
        AbstractC13616e mo2524e = mo2524e();
        if (!billing && (mo2524e = mo2524e.f27011e) == null) {
            return null;
        }
        for (AbstractC13616e m4403e = m4403e(billing); m4403e != null && (m4403e.f27020e & i) != 0; m4403e = m4403e.f27024e) {
            if ((m4403e.f27014e & i) != 0) {
                return m4403e;
            }
            if (m4403e == mo2524e) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* renamed from: eٔؖۘ, reason: contains not printable characters */
    public final void m4411e(AbstractC13616e abstractC13616e, InterfaceC11124e interfaceC11124e, long j, C2106e c2106e, int i, boolean z, float f, boolean z2) {
        AbstractC13616e vip;
        if (abstractC13616e == null) {
            mo3841e(interfaceC11124e, j, c2106e, i, z);
            return;
        }
        if (!interfaceC11124e.billing(abstractC13616e)) {
            m4411e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z, f, z2);
            return;
        }
        int i2 = i;
        boolean z3 = z;
        char c = 3;
        if (i2 == 3 || i2 == 4) {
            AbstractC6126e abstractC6126e = abstractC13616e;
            C12431e c12431e = null;
            while (true) {
                if (abstractC6126e == 0) {
                    break;
                }
                if (abstractC6126e instanceof InterfaceC4890e) {
                    long pro = ((InterfaceC4890e) abstractC6126e).pro();
                    int i3 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i3);
                    C13915e c13915e = this.f34782e;
                    EnumC7792e enumC7792e = c13915e.f27610e;
                    int i4 = AbstractC15287e.vip;
                    long j2 = Long.MIN_VALUE & pro;
                    EnumC7792e enumC7792e2 = EnumC7792e.f15794e;
                    if (intBitsToFloat >= (-((j2 == 0 || enumC7792e == enumC7792e2) ? C10215e.metrica(0, pro) : C10215e.metrica(2, pro)))) {
                        if (Float.intBitsToFloat(i3) < mo1206break() + ((j2 == 0 || c13915e.f27610e == enumC7792e2) ? C10215e.metrica(2, pro) : C10215e.metrica(0, pro))) {
                            int i5 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i5) >= (-C10215e.metrica(1, pro))) {
                                if (Float.intBitsToFloat(i5) < C10215e.metrica(3, pro) + mo1209protected()) {
                                    C2805e c2805e = c2106e.f5432e;
                                    C12328e c12328e = c2106e.f5433e;
                                    if (c2106e.f5431e == AbstractC6874e.billing(c2106e)) {
                                        int i6 = c2106e.f5431e;
                                        c2106e.billing(i6 + 1, c12328e.vip);
                                        c2106e.f5431e++;
                                        c12328e.ad(abstractC13616e);
                                        c2805e.ad(AbstractC9528e.ad(0.0f, z3, true));
                                        m4411e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i2, z3, f, z2);
                                        Unit unit = Unit.INSTANCE;
                                        c2106e.f5431e = i6;
                                        return;
                                    }
                                    long appmetrica = c2106e.appmetrica();
                                    int i7 = c2106e.f5431e;
                                    if (!AbstractC1574e.appmetrica(appmetrica)) {
                                        if (AbstractC1574e.license(appmetrica) > 0.0f) {
                                            int i8 = c2106e.f5431e;
                                            c2106e.billing(i8 + 1, c12328e.vip);
                                            c2106e.f5431e++;
                                            c12328e.ad(abstractC13616e);
                                            c2805e.ad(AbstractC9528e.ad(0.0f, z3, true));
                                            m4411e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z3, f, z2);
                                            Unit unit2 = Unit.INSTANCE;
                                            c2106e.f5431e = i8;
                                            return;
                                        }
                                        return;
                                    }
                                    int billing = AbstractC6874e.billing(c2106e);
                                    c2106e.f5431e = billing;
                                    c2106e.billing(billing + 1, c12328e.vip);
                                    c2106e.f5431e++;
                                    c12328e.ad(abstractC13616e);
                                    c2805e.ad(AbstractC9528e.ad(0.0f, z3, true));
                                    m4411e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z3, f, z2);
                                    Unit unit3 = Unit.INSTANCE;
                                    c2106e.f5431e = billing;
                                    if (AbstractC1574e.license(c2106e.appmetrica()) < 0.0f) {
                                        c2106e.billing(i7 + 1, c2106e.f5431e + 1);
                                    }
                                    c2106e.f5431e = i7;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    char c2 = c;
                    if ((abstractC6126e.f27014e & 16) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                        AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e;
                        int i9 = 0;
                        vip = abstractC6126e;
                        c12431e = c12431e;
                        while (abstractC13616e2 != null) {
                            if ((abstractC13616e2.f27014e & 16) != 0) {
                                i9++;
                                c12431e = c12431e;
                                if (i9 == 1) {
                                    vip = abstractC13616e2;
                                } else {
                                    if (c12431e == null) {
                                        c12431e = new C12431e(0, new AbstractC13616e[16]);
                                    }
                                    if (vip != null) {
                                        c12431e.license(vip);
                                        vip = null;
                                    }
                                    c12431e.license(abstractC13616e2);
                                }
                            }
                            abstractC13616e2 = abstractC13616e2.f27024e;
                            vip = vip;
                            c12431e = c12431e;
                        }
                        if (i9 == 1) {
                            i2 = i;
                            z3 = z;
                            c = c2;
                            abstractC6126e = vip;
                            c12431e = c12431e;
                        }
                    }
                    vip = AbstractC5851e.vip(c12431e);
                    i2 = i;
                    z3 = z;
                    c = c2;
                    abstractC6126e = vip;
                    c12431e = c12431e;
                }
            }
        }
        if (z2) {
            m4390e(abstractC13616e, interfaceC11124e, j, c2106e, i, z, f);
        } else {
            m4417e(abstractC13616e, interfaceC11124e, j, c2106e, i, z, f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (defpackage.AbstractC1574e.metrica(r18.appmetrica(), defpackage.AbstractC9528e.ad(r2, r7, false)) > 0) goto L38;
     */
    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4412e(defpackage.InterfaceC11124e r15, long r16, defpackage.C2106e r18, int r19, boolean r20) {
        /*
            r14 = this;
            r3 = r16
            r5 = r18
            r6 = r19
            int r0 = r15.purchase()
            eْۤۡ r1 = r14.m4410e(r0)
            boolean r0 = r14.m4408e(r3)
            r8 = 0
            r9 = 2139095040(0x7f800000, float:Infinity)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r0 != 0) goto L4b
            if (r6 != r11) goto L4a
            long r11 = r14.m4386e()
            float r0 = r14.m4394e(r3, r11)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r10
            if (r2 >= r9) goto L4a
            int r2 = r5.f5431e
            int r7 = defpackage.AbstractC6874e.billing(r5)
            if (r2 != r7) goto L35
            goto L43
        L35:
            long r7 = defpackage.AbstractC9528e.ad(r0, r8, r8)
            long r9 = r5.appmetrica()
            int r2 = defpackage.AbstractC1574e.metrica(r9, r7)
            if (r2 <= 0) goto L4a
        L43:
            r7 = 0
            r2 = r15
            r8 = r0
            r0 = r14
            r0.m4390e(r1, r2, r3, r5, r6, r7, r8)
        L4a:
            return
        L4b:
            if (r1 != 0) goto L51
            r14.mo3841e(r15, r16, r18, r19, r20)
            return
        L51:
            r0 = 32
            long r2 = r16 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r16 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L8f
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L8f
            int r3 = r14.mo1206break()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L8f
            int r0 = r14.mo1209protected()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8f
            r0 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.m4409e(r1, r2, r3, r5, r6, r7)
            return
        L8f:
            r3 = r16
            r5 = r18
            r6 = r19
            if (r6 != r11) goto La0
            long r12 = r14.m4386e()
            float r2 = r14.m4394e(r3, r12)
            goto La2
        La0:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La2:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r10
            if (r7 >= r9) goto Lc9
            int r7 = r5.f5431e
            int r9 = defpackage.AbstractC6874e.billing(r5)
            if (r7 != r9) goto Lb4
            r7 = r20
            goto Lc4
        Lb4:
            r7 = r20
            long r9 = defpackage.AbstractC9528e.ad(r2, r7, r8)
            long r12 = r5.appmetrica()
            int r9 = defpackage.AbstractC1574e.metrica(r12, r9)
            if (r9 <= 0) goto Lcb
        Lc4:
            r9 = r11
        Lc5:
            r0 = r14
            r8 = r2
            r2 = r15
            goto Lcd
        Lc9:
            r7 = r20
        Lcb:
            r9 = r8
            goto Lc5
        Lcd:
            r0.m4411e(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17732e.m4412e(eُٜ۟, long, eُؓۜ, int, boolean):void");
    }

    /* renamed from: eّٔؗ, reason: contains not printable characters */
    public final C0763e m4413e() {
        if (mo2524e().f27016e) {
            InterfaceC0043e metrica = AbstractC0890e.metrica(this);
            C2359e c2359e = this.f34780e;
            if (c2359e == null) {
                c2359e = new C2359e();
                this.f34780e = c2359e;
            }
            long m4388e = m4388e(m4386e());
            int i = (int) (m4388e >> 32);
            c2359e.vip = -Float.intBitsToFloat(i);
            int i2 = (int) (m4388e & 4294967295L);
            c2359e.metrica = -Float.intBitsToFloat(i2);
            c2359e.license = Float.intBitsToFloat(i) + mo1206break();
            c2359e.appmetrica = Float.intBitsToFloat(i2) + mo1209protected();
            for (AbstractC17732e abstractC17732e = this; abstractC17732e != metrica; abstractC17732e = abstractC17732e.f34794e) {
                abstractC17732e.m4393e(c2359e, false, true);
                if (!c2359e.vip()) {
                }
            }
            return new C0763e(c2359e.vip, c2359e.metrica, c2359e.license, c2359e.appmetrica);
        }
        return C0763e.appmetrica;
    }

    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public final void m4414e(InterfaceC14576e interfaceC14576e, C16446e c16446e) {
        InterfaceC0983e interfaceC0983e = this.f34778e;
        if (interfaceC0983e == null) {
            long j = this.f34793e;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            interfaceC14576e.loadAd(f, f2);
            m4391e(interfaceC14576e, c16446e);
            interfaceC14576e.loadAd(-f, -f2);
            return;
        }
        C5048e c5048e = (C5048e) interfaceC0983e;
        C14434e c14434e = c5048e.f10756e;
        c5048e.purchase();
        c5048e.f10775e = c5048e.f10772e.ad.mo283throw() > 0.0f;
        C18478e c18478e = c14434e.f28537e;
        c18478e.m4541finally(interfaceC14576e);
        c18478e.f36227e = c16446e;
        C17138e.metrica(c14434e, c5048e.f10772e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: eٕٙؗ, reason: contains not printable characters */
    public final void m4415e() {
        boolean billing = AbstractC5180e.billing(4194304);
        AbstractC13616e mo2524e = mo2524e();
        if (!billing && (mo2524e = mo2524e.f27011e) == null) {
            return;
        }
        for (AbstractC13616e m4403e = m4403e(billing); m4403e != null && (m4403e.f27020e & 4194304) != 0; m4403e = m4403e.f27024e) {
            if ((m4403e.f27014e & 4194304) != 0) {
                AbstractC6126e abstractC6126e = m4403e;
                ?? r5 = 0;
                while (abstractC6126e != 0) {
                    if (abstractC6126e instanceof InterfaceC18105e) {
                        ((InterfaceC18105e) abstractC6126e).Signature(this);
                    } else if ((abstractC6126e.f27014e & 4194304) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                        AbstractC13616e abstractC13616e = abstractC6126e.f12873e;
                        int i = 0;
                        abstractC6126e = abstractC6126e;
                        r5 = r5;
                        while (abstractC13616e != null) {
                            if ((abstractC13616e.f27014e & 4194304) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    abstractC6126e = abstractC13616e;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new C12431e(0, new AbstractC13616e[16]);
                                    }
                                    if (abstractC6126e != 0) {
                                        r5.license(abstractC6126e);
                                        abstractC6126e = 0;
                                    }
                                    r5.license(abstractC13616e);
                                }
                            }
                            abstractC13616e = abstractC13616e.f27024e;
                            abstractC6126e = abstractC6126e;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC6126e = AbstractC5851e.vip(r5);
                }
            }
            if (m4403e == mo2524e) {
                return;
            }
        }
    }

    /* renamed from: eؘٖؗ */
    public abstract AbstractC4134e mo2526e();

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final boolean m4416e() {
        if (this.f34778e != null && this.f34789e <= 0.0f) {
            return true;
        }
        AbstractC17732e abstractC17732e = this.f34794e;
        if (abstractC17732e != null) {
            return abstractC17732e.m4416e();
        }
        return false;
    }

    /* renamed from: eٕٗٛ, reason: contains not printable characters */
    public final void m4417e(AbstractC13616e abstractC13616e, InterfaceC11124e interfaceC11124e, long j, C2106e c2106e, int i, boolean z, float f) {
        int i2;
        if (abstractC13616e == null) {
            mo3841e(interfaceC11124e, j, c2106e, i, z);
            return;
        }
        if (!interfaceC11124e.billing(abstractC13616e)) {
            m4417e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z, f);
            return;
        }
        if (!interfaceC11124e.license(abstractC13616e)) {
            m4411e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z, f, false);
            return;
        }
        C2805e c2805e = c2106e.f5432e;
        C12328e c12328e = c2106e.f5433e;
        if (c2106e.f5431e != AbstractC6874e.billing(c2106e)) {
            long appmetrica = c2106e.appmetrica();
            int i3 = c2106e.f5431e;
            int billing = AbstractC6874e.billing(c2106e);
            c2106e.f5431e = billing;
            c2106e.billing(billing + 1, c12328e.vip);
            c2106e.f5431e++;
            c12328e.ad(abstractC13616e);
            c2805e.ad(AbstractC9528e.ad(f, z, false));
            m4411e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z, f, false);
            Unit unit = Unit.INSTANCE;
            c2106e.f5431e = billing;
            long appmetrica2 = c2106e.appmetrica();
            if (c2106e.f5431e + 1 >= AbstractC6874e.billing(c2106e) || AbstractC1574e.metrica(appmetrica, appmetrica2) <= 0) {
                c2106e.billing(c2106e.f5431e + 1, c12328e.vip);
            } else {
                c2106e.billing(i3 + 1, AbstractC1574e.appmetrica(appmetrica2) ? c2106e.f5431e + 2 : c2106e.f5431e + 1);
            }
            c2106e.f5431e = i3;
            return;
        }
        int i4 = c2106e.f5431e;
        int i5 = i4 + 1;
        c2106e.billing(i5, c12328e.vip);
        c2106e.f5431e++;
        c12328e.ad(abstractC13616e);
        c2805e.ad(AbstractC9528e.ad(f, z, false));
        m4411e(AbstractC4584e.ad(abstractC13616e, interfaceC11124e.purchase()), interfaceC11124e, j, c2106e, i, z, f, false);
        Unit unit2 = Unit.INSTANCE;
        c2106e.f5431e = i4;
        if (i5 == AbstractC6874e.billing(c2106e) || AbstractC1574e.appmetrica(c2106e.appmetrica())) {
            int i6 = c2106e.f5431e;
            int i7 = i6 + 1;
            c12328e.smaato(i7);
            if (i7 < 0 || i7 >= (i2 = c2805e.vip)) {
                AbstractC14783e.yandex("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = c2805e.ad;
            long j2 = jArr[i7];
            if (i7 != i2 - 1) {
                AbstractC1660e.adcel(i7, i6 + 2, i2, jArr, jArr);
            }
            c2805e.vip--;
        }
    }

    /* renamed from: e٘ٔ٘ */
    public abstract void mo2527e();

    @Override // defpackage.AbstractC9292e
    /* renamed from: eؙٟ٘ */
    public final InterfaceC17242e mo1469e() {
        InterfaceC17242e interfaceC17242e = this.f34787e;
        if (interfaceC17242e != null) {
            return interfaceC17242e;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [eّّؔ] */
    /* renamed from: e۠۟, reason: contains not printable characters */
    public final void m4418e(InterfaceC17242e interfaceC17242e) {
        AbstractC17732e abstractC17732e;
        InterfaceC17242e interfaceC17242e2 = this.f34787e;
        if (interfaceC17242e != interfaceC17242e2) {
            this.f34787e = interfaceC17242e;
            C13915e c13915e = this.f34782e;
            int i = 0;
            if (interfaceC17242e2 == null || interfaceC17242e.getWidth() != interfaceC17242e2.getWidth() || interfaceC17242e.vip() != interfaceC17242e2.vip()) {
                int width = interfaceC17242e.getWidth();
                int vip = interfaceC17242e.vip();
                InterfaceC0983e interfaceC0983e = this.f34778e;
                if (interfaceC0983e != null) {
                    ((C5048e) interfaceC0983e).appmetrica((width << 32) | (vip & 4294967295L));
                } else if (c13915e.m3724throw() && (abstractC17732e = this.f34794e) != null) {
                    abstractC17732e.m4404e();
                }
                m1211super((vip & 4294967295L) | (width << 32));
                if (this.f34790e != null) {
                    m4406e(false);
                }
                boolean billing = AbstractC5180e.billing(4);
                AbstractC13616e mo2524e = mo2524e();
                if (billing || (mo2524e = mo2524e.f27011e) != null) {
                    for (AbstractC13616e m4403e = m4403e(billing); m4403e != null && (m4403e.f27020e & 4) != 0; m4403e = m4403e.f27024e) {
                        if ((m4403e.f27014e & 4) != 0) {
                            AbstractC6126e abstractC6126e = m4403e;
                            ?? r9 = 0;
                            while (abstractC6126e != 0) {
                                if (abstractC6126e instanceof InterfaceC8501e) {
                                    ((InterfaceC8501e) abstractC6126e).mo292case();
                                } else if ((abstractC6126e.f27014e & 4) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                                    AbstractC13616e abstractC13616e = abstractC6126e.f12873e;
                                    int i2 = 0;
                                    abstractC6126e = abstractC6126e;
                                    r9 = r9;
                                    while (abstractC13616e != null) {
                                        if ((abstractC13616e.f27014e & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                abstractC6126e = abstractC13616e;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new C12431e(0, new AbstractC13616e[16]);
                                                }
                                                if (abstractC6126e != 0) {
                                                    r9.license(abstractC6126e);
                                                    abstractC6126e = 0;
                                                }
                                                r9.license(abstractC13616e);
                                            }
                                        }
                                        abstractC13616e = abstractC13616e.f27024e;
                                        abstractC6126e = abstractC6126e;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC6126e = AbstractC5851e.vip(r9);
                            }
                        }
                        if (m4403e == mo2524e) {
                            break;
                        }
                    }
                }
                InterfaceC16590e interfaceC16590e = c13915e.f27599e;
                if (interfaceC16590e != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC5014e) interfaceC16590e).ads(c13915e);
                }
                c13915e.m3701abstract(this);
            }
            C17866e c17866e = this.f34788e;
            if ((c17866e == null || c17866e.appmetrica == 0) && interfaceC17242e.ad().isEmpty()) {
                return;
            }
            C17866e c17866e2 = this.f34788e;
            Map ad = interfaceC17242e.ad();
            if (c17866e2 != null && c17866e2.appmetrica == ad.size()) {
                Object[] objArr = c17866e2.vip;
                int[] iArr = c17866e2.metrica;
                long[] jArr = c17866e2.ad;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) ad.get((AbstractC17016e) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            c13915e.f27612e.Signature.f25208e.purchase();
            C17866e c17866e3 = this.f34788e;
            if (c17866e3 == null) {
                C17866e c17866e4 = AbstractC8809e.ad;
                c17866e3 = new C17866e();
                this.f34788e = c17866e3;
            }
            c17866e3.ad();
            for (Map.Entry entry : interfaceC17242e.ad().entrySet()) {
                c17866e3.billing(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: for */
    public final boolean mo1470for() {
        return this.f34787e != null;
    }

    @Override // defpackage.InterfaceC0732e
    public final EnumC7792e getLayoutDirection() {
        return this.f34782e.f27610e;
    }

    @Override // defpackage.InterfaceC0043e
    /* renamed from: goto */
    public final C0763e mo208goto(InterfaceC0043e interfaceC0043e, boolean z) {
        if (!mo2524e().f27016e) {
            AbstractC14070e.metrica("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC0043e.billing()) {
            AbstractC14070e.metrica("LayoutCoordinates " + interfaceC0043e + " is not attached!");
        }
        AbstractC17732e m4385e = m4385e(interfaceC0043e);
        m4385e.m4395e();
        AbstractC17732e m4401e = m4401e(m4385e);
        C2359e c2359e = this.f34780e;
        if (c2359e == null) {
            c2359e = new C2359e();
            this.f34780e = c2359e;
        }
        c2359e.vip = 0.0f;
        c2359e.metrica = 0.0f;
        c2359e.license = (int) (interfaceC0043e.advert() >> 32);
        c2359e.appmetrica = (int) (interfaceC0043e.advert() & 4294967295L);
        while (m4385e != m4401e) {
            m4385e.m4393e(c2359e, z, false);
            if (c2359e.vip()) {
                return C0763e.appmetrica;
            }
            m4385e = m4385e.f34794e;
        }
        m4402e(m4401e, c2359e, z);
        return new C0763e(c2359e.vip, c2359e.metrica, c2359e.license, c2359e.appmetrica);
    }

    @Override // defpackage.InterfaceC0043e
    /* renamed from: interface */
    public final long mo209interface(long j) {
        if (!mo2524e().f27016e) {
            AbstractC14070e.metrica("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo210native(AbstractC0890e.metrica(this), ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(this.f34782e)).m1706this(j), true);
    }

    @Override // defpackage.InterfaceC10614e
    public final boolean isPro() {
        return (this.f34778e == null || this.f34801e || !this.f34782e.m3708extends()) ? false : true;
    }

    @Override // defpackage.InterfaceC0043e
    public final InterfaceC0043e isVip() {
        boolean z = mo2524e().f27016e;
        C13915e c13915e = this.f34782e;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (C13915e c13915e2 = c13915e; c13915e2 != null; c13915e2 = c13915e2.tapsense()) {
                sb.append("\n|");
                sb.append(c13915e2);
                sb.append(" isAttached=");
                sb.append(c13915e2.m3708extends());
                sb.append(" modifier=");
                sb.append(c13915e2.f27623e);
                sb.append(" tail=");
                sb.append(mo2524e());
            }
            AbstractC14070e.metrica(sb.toString());
        }
        m4395e();
        return ((AbstractC17732e) c13915e.f27592e.appmetrica).f34794e;
    }

    @Override // defpackage.InterfaceC0043e
    public final long license(long j) {
        long mo211this = mo211this(j);
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = (ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(this.f34782e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.firebase();
        return C6739e.vip(mo211this, viewTreeObserverOnGlobalLayoutListenerC5014e.f10673e);
    }

    @Override // defpackage.InterfaceC0043e
    /* renamed from: native */
    public final long mo210native(InterfaceC0043e interfaceC0043e, long j, boolean z) {
        if (interfaceC0043e instanceof C13221e) {
            C13221e c13221e = (C13221e) interfaceC0043e;
            c13221e.f26246e.f9109e.m4395e();
            return c13221e.mo210native(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        AbstractC17732e m4385e = m4385e(interfaceC0043e);
        m4385e.m4395e();
        AbstractC17732e m4401e = m4401e(m4385e);
        while (m4385e != m4401e) {
            InterfaceC0983e interfaceC0983e = m4385e.f34778e;
            if (interfaceC0983e != null) {
                j = ((C5048e) interfaceC0983e).metrica(j, false);
            }
            if (z || !m4385e.f18515e) {
                j = AbstractC17324e.appmetrica(j, m4385e.f34793e);
            }
            m4385e = m4385e.f34794e;
        }
        return m4396e(m4401e, j, z);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f34782e.f27604e.mo499package();
    }

    @Override // defpackage.InterfaceC0043e
    public final long pro(long j) {
        if (!mo2524e().f27016e) {
            AbstractC14070e.metrica("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC0043e metrica = AbstractC0890e.metrica(this);
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = (ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(this.f34782e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.firebase();
        return mo210native(metrica, C2152e.yandex(C6739e.vip(j, viewTreeObserverOnGlobalLayoutListenerC5014e.f10672e), metrica.mo211this(0L)), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.AbstractC2832e, defpackage.InterfaceC16719e
    public final Object signatures() {
        C13915e c13915e = this.f34782e;
        if (!c13915e.f27592e.yandex(64)) {
            return null;
        }
        mo2524e();
        Object obj = null;
        for (AbstractC13616e abstractC13616e = (C9011e) c13915e.f27592e.purchase; abstractC13616e != null; abstractC13616e = abstractC13616e.f27011e) {
            if ((abstractC13616e.f27014e & 64) != 0) {
                AbstractC6126e abstractC6126e = abstractC13616e;
                ?? r6 = 0;
                while (abstractC6126e != 0) {
                    if (abstractC6126e instanceof InterfaceC0862e) {
                        obj = ((InterfaceC0862e) abstractC6126e).metrica(c13915e.f27604e, obj);
                    } else if ((abstractC6126e.f27014e & 64) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                        AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e;
                        int i = 0;
                        abstractC6126e = abstractC6126e;
                        r6 = r6;
                        while (abstractC13616e2 != null) {
                            if ((abstractC13616e2.f27014e & 64) != 0) {
                                i++;
                                r6 = r6;
                                if (i == 1) {
                                    abstractC6126e = abstractC13616e2;
                                } else {
                                    if (r6 == 0) {
                                        r6 = new C12431e(0, new AbstractC13616e[16]);
                                    }
                                    if (abstractC6126e != 0) {
                                        r6.license(abstractC6126e);
                                        abstractC6126e = 0;
                                    }
                                    r6.license(abstractC13616e2);
                                }
                            }
                            abstractC13616e2 = abstractC13616e2.f27024e;
                            abstractC6126e = abstractC6126e;
                            r6 = r6;
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC6126e = AbstractC5851e.vip(r6);
                }
            }
        }
        return obj;
    }

    @Override // defpackage.InterfaceC0043e
    public final void startapp(float[] fArr) {
        InterfaceC16590e ad = AbstractC10501e.ad(this.f34782e);
        AbstractC17732e m4385e = m4385e(AbstractC0890e.metrica(this));
        m4387e(m4385e, fArr);
        if (ad instanceof InterfaceC10010e) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5014e) ((InterfaceC10010e) ad)).pro(fArr);
            return;
        }
        long Signature = m4385e.Signature(0L);
        if ((9223372034707292159L & Signature) != 9205357640488583168L) {
            C6739e.adcel(fArr, Float.intBitsToFloat((int) (Signature >> 32)), Float.intBitsToFloat((int) (Signature & 4294967295L)));
        }
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: switch */
    public final AbstractC9292e mo1471switch() {
        return this.f34777e;
    }

    @Override // defpackage.InterfaceC0043e
    /* renamed from: this */
    public final long mo211this(long j) {
        if (!mo2524e().f27016e) {
            AbstractC14070e.metrica("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m4395e();
        for (AbstractC17732e abstractC17732e = this; abstractC17732e != null; abstractC17732e = abstractC17732e.f34794e) {
            C13915e c13915e = abstractC17732e.f34782e;
            if (abstractC17732e == ((AbstractC17732e) c13915e.f27592e.appmetrica) && !c13915e.f27586e) {
                long vip = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getRectManager().vip(c13915e);
                if (!C11490e.vip(vip, 9223372034707292159L)) {
                    return AbstractC17324e.appmetrica(j, vip);
                }
            }
            InterfaceC0983e interfaceC0983e = abstractC17732e.f34778e;
            if (interfaceC0983e != null) {
                j = ((C5048e) interfaceC0983e).metrica(j, false);
            }
            j = AbstractC17324e.appmetrica(j, abstractC17732e.f34793e);
        }
        return j;
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f34782e.f27604e.vip();
    }

    @Override // defpackage.AbstractC9292e
    /* renamed from: volatile */
    public final InterfaceC0043e mo1472volatile() {
        return this;
    }
}
