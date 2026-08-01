package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9546e {
    public static final C11139e ad = new C11139e(new C9369e(1), new C9369e(18));
    public static final C11139e vip = new C11139e(new C9369e(2), new C9369e(3));
    public static final C11139e metrica = new C11139e(new C9369e(4), new C9369e(5));
    public static final C11139e license = new C11139e(new C9369e(6), new C9369e(7));
    public static final C11139e appmetrica = new C11139e(new C9369e(8), new C9369e(9));
    public static final C11139e purchase = new C11139e(new C9369e(10), new C9369e(11));
    public static final C11139e billing = new C11139e(new C9369e(12), new C9369e(13));
    public static final C11139e yandex = new C11139e(new C9369e(14), new C9369e(15));
    public static final C11139e startapp = new C11139e(new C9369e(16), new C9369e(17));

    public static final boolean Signature(KeyEvent keyEvent) {
        long startapp2 = AbstractC9835e.startapp(keyEvent);
        int i = AbstractC13232e.f26265protected;
        return AbstractC13232e.ad(startapp2, AbstractC13232e.yandex) || AbstractC13232e.ad(startapp2, AbstractC13232e.subscription) || AbstractC13232e.ad(startapp2, AbstractC13232e.firebase) || AbstractC13232e.ad(startapp2, AbstractC13232e.admob);
    }

    public static final String ad(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        InterfaceC9093e advert = AbstractC7762e.advert(type, C5182e.f11089e);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) AbstractC7762e.amazon(advert)).getName());
        Iterator it = advert.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AbstractC6874e.loadAd();
                throw null;
            }
        }
        sb.append(AbstractC6507e.admob(i, "[]"));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (r9 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r9 != r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r9 == r6) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object adcel(defpackage.C18046e r8, defpackage.AbstractC10731e r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C9627e
            if (r0 == 0) goto L13
            r0 = r9
            eٌٍٞ r0 = (defpackage.C9627e) r0
            int r1 = r0.f19105e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19105e = r1
            goto L18
        L13:
            eٌٍٞ r0 = new eٌٍٞ
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19103e
            int r1 = r0.f19105e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L44
            if (r1 == r4) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            eؘٗٙ r8 = r0.f19104e
            defpackage.AbstractC2003e.purchase(r9)
            goto L99
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            defpackage.AbstractC2003e.purchase(r9)
            goto L76
        L3c:
            eؘٗٙ r8 = r0.f19104e
            eٍُۘ r8 = (defpackage.C9398e) r8
            defpackage.AbstractC2003e.purchase(r9)
            goto L69
        L44:
            defpackage.AbstractC2003e.purchase(r9)
            eٍُۘ r8 = r8.startapp
            eَٔٔ r9 = new eَٔٔ
            r9.<init>()
            java.lang.String r1 = "/v1/account/acquireOmniWrench"
            defpackage.AbstractC4882e.ad(r9, r1)
            eؕ٘٘ r1 = defpackage.C3434e.vip
            r9.vip = r1
            eْٝۜ r1 = new eْٝۜ
            r7 = 26
            r1.<init>(r9, r8, r7)
            r0.f19104e = r5
            r0.f19105e = r4
            java.lang.Object r9 = r1.loadAd(r0)
            if (r9 != r6) goto L69
            goto L98
        L69:
            eؘٗٙ r9 = (defpackage.AbstractC16824e) r9
            r0.f19104e = r5
            r0.f19105e = r3
            java.lang.Object r9 = subscription(r9, r0)
            if (r9 != r6) goto L76
            goto L98
        L76:
            r8 = r9
            eؘٗٙ r8 = (defpackage.AbstractC16824e) r8
            eؗٝٝ r9 = r8.vip()
            eؙّؔ r1 = defpackage.AbstractC3820e.ad
            java.lang.Class<eؑؒ> r3 = defpackage.C0029e.class
            eؚ٘ٚ r1 = r1.vip(r3)
            eٓٔۖ r5 = defpackage.AbstractC3820e.ad(r3)     // Catch: java.lang.Throwable -> L89
        L89:
            eِ۟ۥ r3 = new eِ۟ۥ
            r3.<init>(r1, r5)
            r0.f19104e = r8
            r0.f19105e = r2
            java.lang.Object r9 = r9.ad(r3, r0)
            if (r9 != r6) goto L99
        L98:
            return r6
        L99:
            if (r9 == 0) goto Lb1
            eؑؒ r9 = (defpackage.C0029e) r9
            eً٘ۤ r8 = r8.ad()
            java.lang.String r0 = "X-Hash"
            java.lang.String r8 = r8.mo459e(r0)
            if (r8 != 0) goto Lab
            java.lang.String r8 = ""
        Lab:
            eؓؒؐ r0 = new eؓؒؐ
            r0.<init>(r9, r8)
            return r0
        Lb1:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type bruhcollective.itaysonlab.spark.objects.account.SparkAccount"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9546e.adcel(e٘۠ؒ, eُؑ۠):java.lang.Object");
    }

    public static int admob(int i, float f, int i2) {
        return AbstractC3898e.billing(AbstractC3898e.startapp(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int advert(View view, int i) {
        Context context = view.getContext();
        TypedValue loadAd = AbstractC9476e.loadAd(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = loadAd.resourceId;
        return i2 != 0 ? context.getColor(i2) : loadAd.data;
    }

    public static final Type amazon(C5538e c5538e) {
        int i = c5538e.ad;
        if (i == 0) {
            return C6841e.f14090e;
        }
        InterfaceC13984e interfaceC13984e = c5538e.vip;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return yandex(interfaceC13984e, true);
        }
        if (m2467class == 1) {
            return new C6841e(null, yandex(interfaceC13984e, true));
        }
        if (m2467class == 2) {
            return new C6841e(yandex(interfaceC13984e, true), null);
        }
        throw new C14803e(10);
    }

    public static InterfaceC12864e appmetrica(InterfaceC12864e interfaceC12864e, C15274e c15274e, InterfaceC17220e interfaceC17220e, boolean z, Function0 function0, Function0 function02, int i) {
        InterfaceC12864e premium;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            function0 = null;
        }
        Function0 function03 = function0;
        if (interfaceC17220e instanceof InterfaceC17220e) {
            premium = new C14269e(interfaceC17220e, c15274e, function02, function03, false, z2);
        } else if (interfaceC17220e == null) {
            premium = new C14269e(null, c15274e, function02, function03, false, z2);
        } else {
            C0115e c0115e = C0115e.f1276e;
            premium = c15274e != null ? AbstractC10746e.ad(c0115e, c15274e, interfaceC17220e).premium(new C14269e(null, c15274e, function02, function03, false, z2)) : AbstractC5679e.metrica(c0115e, new C5855e(interfaceC17220e, z2, function02, function03));
        }
        return interfaceC12864e.premium(premium);
    }

    public static int billing(int i, int i2) {
        return AbstractC3898e.startapp(i, (Color.alpha(i) * i2) / 255);
    }

    public static InterfaceC12864e license(InterfaceC12864e interfaceC12864e, boolean z, String str, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return interfaceC12864e.premium(new C7152e(null, null, true, z2, str, null, function0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
    
        if (r13 != r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r13 == r5) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object loadAd(defpackage.C18046e r8, java.lang.String r9, boolean r10, int r11, int r12, defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9546e.loadAd(e٘۠ؒ, java.lang.String, boolean, int, int, eُؑ۠):java.lang.Object");
    }

    public static InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, C15274e c15274e, InterfaceC17220e interfaceC17220e, boolean z, C11796e c11796e, Function0 function0, int i) {
        InterfaceC12864e premium;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            c11796e = null;
        }
        C11796e c11796e2 = c11796e;
        if (interfaceC17220e instanceof InterfaceC17220e) {
            premium = new C7152e(c15274e, interfaceC17220e, false, z2, null, c11796e2, function0);
        } else if (interfaceC17220e == null) {
            premium = new C7152e(c15274e, null, false, z2, null, c11796e2, function0);
        } else {
            C0115e c0115e = C0115e.f1276e;
            premium = c15274e != null ? AbstractC10746e.ad(c0115e, c15274e, interfaceC17220e).premium(new C7152e(c15274e, null, false, z2, null, c11796e2, function0)) : AbstractC5679e.metrica(c0115e, new C5855e(interfaceC17220e, z2, c11796e2, function0));
        }
        return interfaceC12864e.premium(premium);
    }

    public static int mopub(Context context, int i, int i2) {
        Integer num;
        TypedValue smaato = AbstractC9476e.smaato(context, i);
        if (smaato != null) {
            int i3 = smaato.resourceId;
            num = Integer.valueOf(i3 != 0 ? context.getColor(i3) : smaato.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static InterfaceC12864e purchase(InterfaceC12864e interfaceC12864e, Function0 function0, Function0 function02) {
        return interfaceC12864e.premium(new C14269e(null, null, function02, function0, true, true));
    }

    public static final Type smaato(InterfaceC13984e interfaceC13984e) {
        if (interfaceC13984e instanceof AbstractC8761e) {
            C13475e c13475e = ((AbstractC8761e) interfaceC13984e).f17665e;
            Type type = c13475e != null ? (Type) c13475e.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return yandex(interfaceC13984e, false);
    }

    public static final C13820e startapp(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(amazon((C5538e) it.next()));
            }
            return new C13820e(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(amazon((C5538e) it2.next()));
            }
            return new C13820e(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C13820e startapp2 = startapp(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(subList, 10));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(amazon((C5538e) it3.next()));
        }
        return new C13820e(cls, startapp2, arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object subscription(defpackage.AbstractC16824e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C2346e
            if (r0 == 0) goto L13
            r0 = r5
            eؙؔؔ r0 = (defpackage.C2346e) r0
            int r1 = r0.f5872e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5872e = r1
            goto L18
        L13:
            eؙؔؔ r0 = new eؙؔؔ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f5873e
            int r1 = r0.f5872e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L5f
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            eۣؔؗ r5 = r4.billing()
            eۣؔؗ r1 = defpackage.C2394e.f6116e
            boolean r5 = defpackage.AbstractC7890e.billing(r5, r1)
            if (r5 == 0) goto L3d
            return r4
        L3d:
            eؗٝٝ r4 = r4.vip()
            eؙّؔ r5 = defpackage.AbstractC3820e.ad
            java.lang.Class<eَِ٘> r1 = defpackage.C11649e.class
            eؚ٘ٚ r5 = r5.vip(r1)
            eٓٔۖ r1 = defpackage.AbstractC3820e.ad(r1)     // Catch: java.lang.Throwable -> L4e
            goto L4f
        L4e:
            r1 = 0
        L4f:
            eِ۟ۥ r3 = new eِ۟ۥ
            r3.<init>(r5, r1)
            r0.f5872e = r2
            java.lang.Object r5 = r4.ad(r3, r0)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r5 != r4) goto L5f
            return r4
        L5f:
            if (r5 != 0) goto L69
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type bruhcollective.itaysonlab.spark.objects.SparkError"
            r4.<init>(r5)
            throw r4
        L69:
            eَِ٘ r5 = (defpackage.C11649e) r5
            eًؓ۟ r4 = new eًؓ۟
            int r0 = r5.ad
            java.lang.String r5 = r5.vip
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Spark API: ["
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "] "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0 = 13
            r4.<init>(r5, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9546e.subscription(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    public static final float vip(C15217e c15217e, float f, float f2) {
        InterfaceC4317e interfaceC4317e = c15217e.ad;
        C2493e c2493e = new C2493e(0.0f);
        int vip2 = c2493e.vip();
        int i = 0;
        while (i < vip2) {
            c2493e.appmetrica(i, interfaceC4317e.advert(i == 0 ? f : 0.0f, i == 0 ? f2 : 0.0f));
            i++;
        }
        return c2493e.ad;
    }

    public static final Type yandex(InterfaceC13984e interfaceC13984e, boolean z) {
        InterfaceC0861e isVip = interfaceC13984e.isVip();
        if (isVip instanceof InterfaceC12635e) {
            return new C14273e((InterfaceC12635e) isVip);
        }
        if (!(isVip instanceof InterfaceC7227e)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + interfaceC13984e);
        }
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) isVip;
        Class purchase2 = z ? AbstractC14437e.purchase(interfaceC7227e) : ((InterfaceC18155e) interfaceC7227e).subs();
        List signatures = interfaceC13984e.signatures();
        if (signatures.isEmpty()) {
            return purchase2;
        }
        if (!purchase2.isArray()) {
            return startapp(purchase2, signatures);
        }
        if (purchase2.getComponentType().isPrimitive()) {
            return purchase2;
        }
        C5538e c5538e = (C5538e) AbstractC13480e.m3603synchronized(signatures);
        if (c5538e == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + interfaceC13984e);
        }
        int i = c5538e.ad;
        InterfaceC13984e interfaceC13984e2 = c5538e.vip;
        int i2 = i == 0 ? -1 : AbstractC11193e.ad[AbstractC8703e.m2467class(i)];
        if (i2 == -1 || i2 == 1) {
            return purchase2;
        }
        if (i2 != 2 && i2 != 3) {
            throw new C14803e(10);
        }
        Type yandex2 = yandex(interfaceC13984e2, false);
        return yandex2 instanceof Class ? purchase2 : new C15539e(yandex2);
    }
}
