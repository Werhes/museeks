package defpackage;

import android.util.Log;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۢۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13583e implements InterfaceC14230e {
    public final C11744e ad;
    public C8823e license;
    public volatile int metrica = 2;
    public InterfaceC7865e vip;

    public C13583e(C13825e c13825e, C11744e c11744e, C8591e c8591e, C17425e c17425e, InterfaceC2726e interfaceC2726e) {
        this.ad = c11744e;
        AbstractC16565e.ad(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C5005e
            if (r0 == 0) goto L13
            r0 = r6
            eًؗٛ r0 = (defpackage.C5005e) r0
            int r1 = r0.f10595e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10595e = r1
            goto L18
        L13:
            eًؗٛ r0 = new eًؗٛ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10593e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f10595e
            r3 = 1
            java.lang.String r4 = "CXCP"
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r0 = r0.f10594e
            defpackage.AbstractC2003e.purchase(r6)
            goto L5a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.AbstractC2003e.purchase(r6)
            boolean r6 = defpackage.AbstractC9464e.smaato(r4)
            if (r6 == 0) goto L41
            java.lang.String r6 = "FlashControl: Waiting for any ongoing update to be completed"
            android.util.Log.d(r4, r6)
        L41:
            int r6 = r5.metrica
            eٌٝؐ r2 = r5.license
            if (r2 == 0) goto L48
            goto L4e
        L48:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            eٌٝؐ r2 = defpackage.AbstractC16565e.ad(r2)
        L4e:
            r0.f10594e = r6
            r0.f10595e = r3
            java.lang.Object r0 = r2.mo696protected(r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            r0 = r6
        L5a:
            boolean r6 = defpackage.AbstractC9464e.smaato(r4)
            if (r6 == 0) goto L71
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "awaitFlashModeUpdate: initialFlashMode = "
            r6.<init>(r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r4, r6)
        L71:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13583e.ad(eُؑ۠):java.lang.Object");
    }

    public final C8823e metrica(int i, boolean z) {
        if (AbstractC9464e.smaato("CXCP")) {
            StringBuilder premium = AbstractC4653e.premium("setFlashAsync: flashMode = ", i, ", requestControl = ");
            premium.append(this.vip);
            Log.d("CXCP", premium.toString());
        }
        C8823e c8823e = new C8823e();
        if (this.vip == null) {
            AbstractC17861e.isPro("Camera is not active.", c8823e);
            return c8823e;
        }
        this.metrica = i;
        if (z) {
            C8823e c8823e2 = this.license;
            if (c8823e2 != null) {
                AbstractC17861e.isPro("There is a new flash mode being set or camera was closed", c8823e2);
            }
            this.license = null;
        } else {
            C8823e c8823e3 = this.license;
            if (c8823e3 != null) {
                AbstractC16398e.metrica(c8823e, c8823e3);
            }
        }
        this.license = c8823e;
        C11744e c11744e = this.ad;
        synchronized (c11744e.license) {
            c11744e.yandex = i;
            Unit unit = Unit.INSTANCE;
        }
        AbstractC16398e.metrica(c11744e.purchase(), c8823e);
        return c8823e;
    }

    @Override // defpackage.InterfaceC14230e
    public final void reset() {
        this.metrica = 2;
        C8823e c8823e = this.license;
        if (c8823e != null) {
            AbstractC17861e.isPro("There is a new flash mode being set or camera was closed", c8823e);
        }
        this.license = null;
        metrica(2, true);
    }

    @Override // defpackage.InterfaceC14230e
    public final void vip(InterfaceC7865e interfaceC7865e) {
        this.vip = interfaceC7865e;
        metrica(this.metrica, false);
    }
}
