package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13985e implements InterfaceC8467e {
    public static final C12742e appmetrica;
    public static final List billing;
    public static final ArrayList license;
    public static final C17651e metrica;
    public static final C15024e purchase;
    public static final /* synthetic */ InterfaceC8614e[] vip = {AbstractC3820e.ad.purchase(new C13506e(C13985e.class, "lastSelected", "getLastSelected()Ljava/lang/String;", 0))};
    public static final C13985e ad = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [eٓٔۗ, java.lang.Object] */
    static {
        Math.log10(220.0d);
        Math.log10(20000.0d);
        metrica = AbstractC12751e.ad();
        license = new ArrayList();
        appmetrica = new C12742e();
        SharedPreferences sharedPreferences = AbstractC16082e.appmetrica;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        purchase = new C15024e(6, sharedPreferences, "eq2_last_selected", "flat");
        billing = AbstractC6874e.startapp(50, 100, 200, 400, 800, 1000, 2500, 5000, 15000);
    }

    public static Object appmetrica(C10620e c10620e, AbstractC7185e abstractC7185e) {
        C12742e c12742e = appmetrica;
        ListIterator listIterator = c12742e.listIterator();
        int i = 0;
        while (true) {
            C11045e c11045e = (C11045e) listIterator;
            if (!c11045e.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC7890e.billing(((C10620e) c11045e.next()).ad, c10620e.ad)) {
                break;
            }
            i++;
        }
        Integer num = new Integer(i);
        if (num.intValue() < 0) {
            num = null;
        }
        if (num != null) {
            c12742e.set(num.intValue(), c10620e);
        } else {
            c12742e.add(c10620e);
        }
        Object metrica2 = metrica(abstractC7185e);
        return metrica2 == EnumC2821e.f6782e ? metrica2 : Unit.INSTANCE;
    }

    public static Object metrica(AbstractC7185e abstractC7185e) {
        C15420e c15420e = AbstractC6731e.ad;
        Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C9754e(2, 18, null), abstractC7185e);
        return advert == EnumC2821e.f6782e ? advert : Unit.INSTANCE;
    }

    public static C10620e vip(C10620e c10620e) {
        return C10620e.ad(c10620e, UUID.randomUUID().toString(), AbstractC1786e.signatures(new StringBuilder(), c10620e.vip, " 2"), 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096 A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:52:0x008d, B:55:0x0096), top: B:51:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r11v0, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12, types: [eؚؗؔ] */
    /* JADX WARN: Type inference failed for: r6v7, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13985e.ad(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C9420e
            if (r0 == 0) goto L13
            r0 = r6
            eٍِۢ r0 = (defpackage.C9420e) r0
            int r1 = r0.f18757e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18757e = r1
            goto L18
        L13:
            eٍِۢ r0 = new eٍِۢ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f18756e
            int r1 = r0.f18757e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L3b
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f18757e = r2
            java.lang.Object r6 = r5.ad(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L3b
            return r0
        L3b:
            java.util.ArrayList r6 = defpackage.C13985e.license
            eِّۛ r0 = defpackage.C13985e.appmetrica
            java.util.ArrayList r6 = defpackage.AbstractC13480e.m3584final(r6, r0)
            java.util.Iterator r6 = r6.iterator()
        L47:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r6.next()
            r1 = r0
            eَؘۣ r1 = (defpackage.C10620e) r1
            java.lang.String r1 = r1.ad
            eٓٔۗ r2 = defpackage.C13985e.ad
            r2.getClass()
            eٌَۧ[] r3 = defpackage.C13985e.vip
            r4 = 0
            r3 = r3[r4]
            eُٔۡ r3 = defpackage.C13985e.purchase
            java.lang.Object r2 = r3.tapsense(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = defpackage.AbstractC7890e.billing(r1, r2)
            if (r1 == 0) goto L47
            goto L70
        L6f:
            r0 = 0
        L70:
            eَؘۣ r0 = (defpackage.C10620e) r0
            if (r0 != 0) goto L7c
            eٍؖۨ r6 = defpackage.C10620e.Companion
            r6.getClass()
            eَؘۣ r6 = defpackage.C10620e.billing
            return r6
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13985e.license(eُؑ۠):java.lang.Object");
    }
}
