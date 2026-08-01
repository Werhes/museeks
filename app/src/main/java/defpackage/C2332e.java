package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2332e {
    public final float ad;
    public final float appmetrica;
    public final float license;
    public final float metrica;
    public final float purchase;
    public final float vip;

    public C2332e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        this.appmetrica = f5;
        this.purchase = f6;
    }

    public final InterfaceC16132e ad(boolean z, C15274e c15274e, C13770e c13770e, int i) {
        C7558e c7558e;
        InterfaceC16132e interfaceC16132e;
        c13770e.m3676strictfp(-1763481333);
        float f = this.ad;
        Object obj = C2987e.ad;
        if (c15274e == null) {
            c13770e.m3676strictfp(167726411);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == obj) {
                m3681throw = AbstractC14533e.startapp(new C15765e(f));
                c13770e.m3682throws(m3681throw);
            }
            interfaceC16132e = (InterfaceC3314e) m3681throw;
            c13770e.Signature(false);
        } else {
            c13770e.m3676strictfp(167799447);
            c13770e.Signature(false);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = new C12742e();
                c13770e.m3682throws(m3681throw2);
            }
            C12742e c12742e = (C12742e) m3681throw2;
            boolean z2 = true;
            boolean z3 = (((i & 112) ^ 48) > 32 && c13770e.purchase(c15274e)) || (i & 48) == 32;
            Object m3681throw3 = c13770e.m3681throw();
            InterfaceC5083e interfaceC5083e = null;
            if (z3 || m3681throw3 == obj) {
                m3681throw3 = new C1638e(c15274e, c12742e, interfaceC5083e, 1);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC17680e.license(c13770e, c15274e, (Function2) m3681throw3);
            InterfaceC13352e interfaceC13352e = (InterfaceC13352e) AbstractC13480e.m3569abstract(c12742e);
            if (!z) {
                f = this.purchase;
            } else if (interfaceC13352e instanceof C17612e) {
                f = this.vip;
            } else if (interfaceC13352e instanceof C1639e) {
                f = this.license;
            } else if (interfaceC13352e instanceof C16906e) {
                f = this.metrica;
            } else if (interfaceC13352e instanceof C3877e) {
                f = this.appmetrica;
            }
            Object m3681throw4 = c13770e.m3681throw();
            if (m3681throw4 == obj) {
                m3681throw4 = new C7558e(new C15765e(f), AbstractC9546e.metrica, null, 12);
                c13770e.m3682throws(m3681throw4);
            }
            C7558e c7558e2 = (C7558e) m3681throw4;
            C15765e c15765e = new C15765e(f);
            boolean yandex = c13770e.yandex(c7558e2) | c13770e.metrica(f) | ((((i & 14) ^ 6) > 4 && c13770e.billing(z)) || (i & 6) == 4);
            if ((((i & 896) ^ 384) <= 256 || !c13770e.purchase(this)) && (i & 384) != 256) {
                z2 = false;
            }
            boolean yandex2 = yandex | z2 | c13770e.yandex(interfaceC13352e);
            Object m3681throw5 = c13770e.m3681throw();
            if (yandex2 || m3681throw5 == obj) {
                c7558e = c7558e2;
                Object c12680e = new C12680e(c7558e, f, z, this, interfaceC13352e, null, 1);
                c13770e.m3682throws(c12680e);
                m3681throw5 = c12680e;
            } else {
                c7558e = c7558e2;
            }
            AbstractC17680e.license(c13770e, c15765e, (Function2) m3681throw5);
            interfaceC16132e = c7558e.metrica;
        }
        c13770e.Signature(false);
        return interfaceC16132e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2332e)) {
            return false;
        }
        C2332e c2332e = (C2332e) obj;
        return C15765e.vip(this.ad, c2332e.ad) && C15765e.vip(this.vip, c2332e.vip) && C15765e.vip(this.metrica, c2332e.metrica) && C15765e.vip(this.license, c2332e.license) && C15765e.vip(this.purchase, c2332e.purchase);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.purchase) + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31);
    }
}
