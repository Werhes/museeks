package defpackage;

import android.content.Context;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12988e implements InterfaceC2541e {
    public static boolean yandex = true;
    public final C15074e ad;
    public C8419e appmetrica;
    public final C16446e billing;
    public final C14434e license = new C14434e();
    public C7044e metrica;
    public boolean purchase;
    public final RenderScript vip;

    public C12988e(C15074e c15074e) {
        this.ad = c15074e;
        this.vip = RenderScript.create((Context) AbstractC10432e.vip(c15074e, AbstractC2676e.vip));
        this.billing = ((InterfaceC2661e) AbstractC10432e.vip(c15074e, AbstractC11473e.billing)).metrica();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(defpackage.C12988e r16, defpackage.C16446e r17, float r18, defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12988e.metrica(eْؒ۠, eٖۘؗ, float, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, eٔۦْ] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, eٔۦْ] */
    @Override // defpackage.InterfaceC2541e
    public final void ad(C4017e c4017e) {
        C15074e c15074e;
        C8419e c8419e;
        C12988e c12988e = this;
        C15492e c15492e = AbstractC2676e.vip;
        C15074e c15074e2 = c12988e.ad;
        Context context = (Context) AbstractC10432e.vip(c15074e2, c15492e);
        long j = c15074e2.f29852e;
        ?? obj = new Object();
        float ad = AbstractC15384e.ad(c15074e2);
        obj.f29883e = ad;
        ?? obj2 = new Object();
        c4017e.vip();
        float mo497instanceof = c4017e.mo497instanceof(AbstractC15384e.license(c15074e2)) * ad;
        obj2.f29883e = mo497instanceof;
        if (mo497instanceof > 25.0f) {
            obj.f29883e = (25.0f / mo497instanceof) * obj.f29883e;
            obj2.f29883e = 25.0f;
        }
        C16446e c16446e = c12988e.billing;
        if (C12729e.vip(c16446e.signatures, 0L) || (c8419e = c12988e.appmetrica) == null || !c8419e.purchase()) {
            c12988e.purchase = false;
            C16446e purchase = AbstractC1798e.purchase(c4017e, c15074e2, obj.f29883e, c15074e2.f29847e, j);
            c15074e = c15074e2;
            if (purchase != null) {
                purchase.billing(c15074e.f29835e != null);
                InterfaceC5083e interfaceC5083e = null;
                if (C12729e.vip(c16446e.signatures, 0L)) {
                    AbstractC5336e.yandex(C2693e.f6576e, new C18400e(c12988e, purchase, obj2, interfaceC5083e, 0));
                    c12988e = this;
                } else {
                    InterfaceC18435e m3623e = c15074e.m3623e();
                    C15420e c15420e = AbstractC6731e.ad;
                    c12988e = this;
                    c12988e.appmetrica = AbstractC5336e.purchase(m3623e, AbstractC1497e.ad.f25795e, 0, new C18400e(c12988e, purchase, obj2, interfaceC5083e, 1), 2);
                }
            }
        } else {
            c12988e.purchase = true;
            c15074e = c15074e2;
        }
        AbstractC12662e.purchase(c15074e, new C4949e(c12988e, c4017e, j, (C15096e) obj, context));
    }

    @Override // defpackage.InterfaceC2541e
    public final void vip() {
        C8419e c8419e = this.appmetrica;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        ((InterfaceC2661e) AbstractC10432e.vip(this.ad, AbstractC11473e.billing)).ad(this.billing);
        C7044e c7044e = this.metrica;
        if (c7044e != null) {
            c7044e.vip = true;
            ((ScriptIntrinsicBlur) c7044e.license).destroy();
            ((Allocation) c7044e.appmetrica).destroy();
            ((Allocation) c7044e.purchase).destroy();
            ((RenderScript) c7044e.metrica).destroy();
        }
    }
}
