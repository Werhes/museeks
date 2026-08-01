package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12339e implements InterfaceC3239e {
    public final int ad;
    public final C0576e adcel;
    public final C2616e advert;
    public final C16822e amazon;
    public Function1 appmetrica;
    public final C16330e billing;
    public final C2616e license;
    public final C10684e loadAd;
    public Function0 metrica;
    public final C12851e mopub;
    public final float[] purchase;
    public final C2616e smaato;
    public final C2616e startapp;
    public final C3721e vip;
    public boolean yandex;

    public C12339e(float f, int i, C3721e c3721e, Function0 function0, Function1 function1) {
        float[] fArr;
        this.ad = i;
        this.vip = c3721e;
        this.metrica = function0;
        this.license = new C2616e(f);
        this.appmetrica = new C10869e(this, function1, 6);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.purchase = fArr;
        this.billing = new C16330e(0);
        this.startapp = new C2616e(0.0f);
        this.adcel = AbstractC14533e.startapp(Boolean.FALSE);
        this.mopub = new C12851e(25, this);
        float purchase = this.license.purchase();
        C3721e c3721e2 = this.vip;
        float f2 = c3721e2.ad;
        float f3 = c3721e2.vip - f2;
        this.advert = new C2616e(AbstractC15842e.startapp(0.0f, 0.0f, AbstractC3062e.vip(f3 == 0.0f ? 0.0f : (purchase - f2) / f3, 0.0f, 1.0f)));
        this.smaato = new C2616e(0.0f);
        this.amazon = new C16822e(this, 1);
        this.loadAd = new C10684e();
    }

    @Override // defpackage.InterfaceC3239e
    public final Object ad(EnumC6955e enumC6955e, Function2 function2, AbstractC7185e abstractC7185e) {
        Object appmetrica = AbstractC9743e.appmetrica(new C8857e(this, enumC6955e, function2, (InterfaceC5083e) null), abstractC7185e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }

    public final void license(float f) {
        C3721e c3721e = this.vip;
        float f2 = c3721e.ad;
        float f3 = c3721e.vip;
        this.license.startapp(AbstractC12547e.license(AbstractC3062e.vip(f, f2, f3), f2, f3, this.purchase));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|(1:20)(1:26)|21|22|23|(1:25))|11|12|13))|28|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r2.startapp(0.0f);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.C14307e r5, long r6, defpackage.AbstractC10731e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.C4146e
            if (r0 == 0) goto L13
            r0 = r8
            eٖؖۛ r0 = (defpackage.C4146e) r0
            int r1 = r0.f9149e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9149e = r1
            goto L18
        L13:
            eٖؖۛ r0 = new eٖؖۛ
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f9148e
            int r1 = r0.f9149e
            eٖؔ٘ r2 = r4.smaato
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L27
            defpackage.AbstractC2003e.purchase(r8)     // Catch: defpackage.C6468e -> L62
            goto L66
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r8)
            boolean r8 = r4.yandex
            r1 = 32
            if (r8 == 0) goto L47
            eٖٛ٘ r8 = r4.billing
            int r8 = r8.purchase()
            float r8 = (float) r8
            long r6 = r6 >> r1
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r8 = r8 - r6
            goto L4d
        L47:
            long r6 = r6 >> r1
            int r6 = (int) r6
            float r8 = java.lang.Float.intBitsToFloat(r6)
        L4d:
            eٖؔ٘ r6 = r4.advert
            float r6 = r6.purchase()
            float r8 = r8 - r6
            r2.startapp(r8)
            r0.f9149e = r3     // Catch: defpackage.C6468e -> L62
            java.lang.Object r5 = r5.ad(r0)     // Catch: defpackage.C6468e -> L62
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L66
            return r6
        L62:
            r5 = 0
            r2.startapp(r5)
        L66:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12339e.metrica(eٓۡٙ, long, eُؑ۠):java.lang.Object");
    }

    public final void vip(float f) {
        float purchase = this.billing.purchase();
        C2616e c2616e = this.startapp;
        float f2 = 2;
        float max = Math.max(purchase - (c2616e.purchase() / f2), 0.0f);
        float min = Math.min(c2616e.purchase() / f2, max);
        C2616e c2616e2 = this.advert;
        float purchase2 = c2616e2.purchase() + f;
        C2616e c2616e3 = this.smaato;
        c2616e2.startapp(c2616e3.purchase() + purchase2);
        c2616e3.startapp(0.0f);
        float license = AbstractC12547e.license(c2616e2.purchase(), min, max, this.purchase);
        Function1 function1 = this.appmetrica;
        C3721e c3721e = this.vip;
        float f3 = max - min;
        function1.invoke(Float.valueOf(AbstractC15842e.startapp(c3721e.ad, c3721e.vip, AbstractC3062e.vip(f3 == 0.0f ? 0.0f : (license - min) / f3, 0.0f, 1.0f))));
    }
}
