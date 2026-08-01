package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11439e extends AbstractC16625e {

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C0576e f23004e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C16607e f23005e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f23006e = AbstractC14533e.startapp(Boolean.TRUE);

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C0576e f23007e;

    public C11439e(C16607e c16607e) {
        this.f23005e = c16607e;
        C10327e c10327e = C10327e.f20377e;
        this.f23007e = AbstractC14533e.startapp(c10327e);
        this.f23004e = AbstractC14533e.startapp(c10327e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: transient, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3206transient(defpackage.C11439e r6, defpackage.AbstractC10731e r7) {
        /*
            eؑۜٝ r0 = r6.f23006e
            boolean r1 = r7 instanceof defpackage.C4901e
            if (r1 == 0) goto L15
            r1 = r7
            eٕؗؖ r1 = (defpackage.C4901e) r1
            int r2 = r1.f10394e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f10394e = r2
            goto L1a
        L15:
            eٕؗؖ r1 = new eٕؗؖ
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.f10393e
            int r2 = r1.f10394e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.AbstractC2003e.purchase(r7)
            goto L4e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0.setValue(r7)
            eّٕٓ r7 = defpackage.AbstractC6731e.ad
            eؕۙۜ r7 = defpackage.ExecutorC3603e.f8134e
            eٌۡٔ r2 = new eٌۡٔ
            r4 = 0
            r5 = 24
            r2.<init>(r6, r4, r5)
            r1.f10394e = r3
            java.lang.Object r6 = defpackage.AbstractC5336e.advert(r7, r2, r1)
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r6 != r7) goto L4e
            return r7
        L4e:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r0.setValue(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11439e.m3206transient(eِٕؑ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(1954124309);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C16600e(this, null, 23);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw);
            byte b = 0;
            AbstractC13348e.ad(null, AbstractC16653e.license(1940121305, new C10592e(this, 0, b), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(2016331172, new C5049e(this, b), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C10592e(this, i);
        }
    }
}
