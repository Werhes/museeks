package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11099e {
    public final C14542e ad;
    public final C16320e appmetrica;
    public final boolean billing;
    public final C14542e license;
    public final int metrica;
    public final C4335e purchase;
    public final List vip;

    public C11099e(C14542e c14542e, List list, int i, C14542e c14542e2, C16320e c16320e, C4335e c4335e, boolean z) {
        this.ad = c14542e;
        this.vip = list;
        this.metrica = i;
        this.license = c14542e2;
        this.appmetrica = c16320e;
        this.purchase = c4335e;
        this.billing = z;
    }

    public static C11099e vip(C11099e c11099e, int i, C14542e c14542e, int i2) {
        if ((i2 & 1) != 0) {
            i = c11099e.metrica;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c14542e = c11099e.license;
        }
        C16320e c16320e = c11099e.appmetrica;
        return new C11099e(c11099e.ad, c11099e.vip, i3, c14542e, c16320e, c11099e.purchase, c11099e.billing);
    }

    public final void ad(C14542e c14542e, InterfaceC16643e interfaceC16643e) {
        Context context = c14542e.ad;
        C14542e c14542e2 = this.ad;
        if (context != c14542e2.ad) {
            throw new IllegalStateException(("Interceptor '" + interfaceC16643e + "' cannot modify the request's context.").toString());
        }
        if (c14542e.vip == C10734e.ad) {
            throw new IllegalStateException(("Interceptor '" + interfaceC16643e + "' cannot set the request's data to null.").toString());
        }
        if (c14542e.metrica != c14542e2.metrica) {
            throw new IllegalStateException(("Interceptor '" + interfaceC16643e + "' cannot modify the request's target.").toString());
        }
        if (c14542e.subscription == c14542e2.subscription) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interfaceC16643e + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public final C11099e license(C14542e c14542e) {
        int i = this.metrica;
        if (i > 0) {
            ad(c14542e, (InterfaceC16643e) this.vip.get(i - 1));
        }
        return vip(this, 0, c14542e, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.AbstractC10731e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C9711e
            if (r0 == 0) goto L13
            r0 = r7
            eًٍۙ r0 = (defpackage.C9711e) r0
            int r1 = r0.f19211e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19211e = r1
            goto L18
        L13:
            eًٍۙ r0 = new eًٍۙ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f19209e
            int r1 = r0.f19211e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eٖۦٍ r0 = r0.f19210e
            defpackage.AbstractC2003e.purchase(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
            java.util.List r7 = r6.vip
            int r1 = r6.metrica
            java.lang.Object r7 = r7.get(r1)
            eٖۦٍ r7 = (defpackage.InterfaceC16643e) r7
            int r1 = r1 + r2
            r3 = 0
            r4 = 6
            eُٚۧ r1 = vip(r6, r1, r3, r4)
            r0.f19210e = r7
            r0.f19211e = r2
            java.lang.Object r0 = r7.ad(r1, r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L50
            return r1
        L50:
            r5 = r0
            r0 = r7
            r7 = r5
        L53:
            eؚٜ٘ r7 = (defpackage.InterfaceC17873e) r7
            eؘٔؕ r1 = r7.license()
            r6.ad(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11099e.metrica(eُؑ۠):java.lang.Object");
    }
}
