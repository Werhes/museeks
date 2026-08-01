package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7763e {
    public static final C16372e ad = new C16372e("KotlinTypeRefiner", 2);
    public static C17149e vip;

    /* JADX WARN: Type inference failed for: r1v0, types: [eٔۦۗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eَؑۥ, eِٙٙ] */
    public static C11817e ad(Function1 function1) {
        C8028e c8028e = AbstractC0232e.license;
        ?? obj = new Object();
        C10195e c10195e = c8028e.ad;
        obj.ad = c10195e.ad;
        boolean z = c10195e.appmetrica;
        obj.vip = c10195e.vip;
        obj.metrica = c10195e.metrica;
        String str = c10195e.purchase;
        obj.license = c10195e.billing;
        String str2 = c10195e.yandex;
        int i = c10195e.mopub;
        boolean z2 = c10195e.adcel;
        obj.appmetrica = c10195e.startapp;
        obj.purchase = c10195e.license;
        C10068e c10068e = c8028e.vip;
        function1.invoke(obj);
        if (!AbstractC7890e.billing(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        ?? abstractC0232e = new AbstractC0232e(new C10195e(obj.ad, obj.vip, obj.metrica, obj.purchase, z, str, obj.license, str2, obj.appmetrica, z2, i), c10068e);
        AbstractC7890e.billing(c10068e, AbstractC16398e.ad);
        return abstractC0232e;
    }

    public static final C10743e appmetrica(C4993e c4993e, Function4 function4, C13770e c13770e) {
        C14865e c14865e;
        c13770e.m3676strictfp(-645045624);
        float f = 0;
        C16005e c16005e = new C16005e(f, f, f, f);
        float f2 = AbstractC9114e.ad;
        c13770e.m3676strictfp(1347434050);
        boolean purchase = c13770e.purchase(c4993e);
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (purchase || m3681throw == obj) {
            m3681throw = new C15778e(c4993e, 0);
            c13770e.m3682throws(m3681throw);
        }
        Function0 function0 = (Function0) m3681throw;
        c13770e.Signature(false);
        c13770e.m3676strictfp(996643712);
        Object m3681throw2 = c13770e.m3681throw();
        if (m3681throw2 == obj) {
            Object c12261e = new C12261e(AbstractC17680e.startapp(c13770e));
            c13770e.m3682throws(c12261e);
            m3681throw2 = c12261e;
        }
        InterfaceC18435e interfaceC18435e = ((C12261e) m3681throw2).f24591e;
        InterfaceC3314e mopub = AbstractC14533e.mopub(function0, c13770e);
        InterfaceC3314e mopub2 = AbstractC14533e.mopub(100L, c13770e);
        c13770e.m3676strictfp(1852585201);
        boolean appmetrica = c13770e.appmetrica(100L) | c13770e.purchase(c4993e) | c13770e.purchase(interfaceC18435e);
        Object m3681throw3 = c13770e.m3681throw();
        if (appmetrica || m3681throw3 == obj) {
            m3681throw3 = new C5659e(c4993e, interfaceC18435e, new C14194e(mopub, mopub2, 11));
            c13770e.m3682throws(m3681throw3);
        }
        C5659e c5659e = (C5659e) m3681throw3;
        c13770e.Signature(false);
        c13770e.Signature(false);
        InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
        float mo497instanceof = interfaceC14388e.mo497instanceof(f2);
        Object m3681throw4 = c13770e.m3681throw();
        if (m3681throw4 == obj) {
            Object c12261e2 = new C12261e(AbstractC17680e.startapp(c13770e));
            c13770e.m3682throws(c12261e2);
            m3681throw4 = c12261e2;
        }
        InterfaceC18435e interfaceC18435e2 = ((C12261e) m3681throw4).f24591e;
        InterfaceC3314e mopub3 = AbstractC14533e.mopub(function4, c13770e);
        EnumC7792e enumC7792e = (EnumC7792e) c13770e.adcel(AbstractC11473e.amazon);
        C3922e c3922e = new C3922e(interfaceC14388e.mo497instanceof(AbstractC12220e.billing(c16005e, enumC7792e)), interfaceC14388e.mo497instanceof(AbstractC12220e.purchase(c16005e, enumC7792e)), interfaceC14388e.mo497instanceof(f), interfaceC14388e.mo497instanceof(f));
        c13770e.m3676strictfp(1347465600);
        boolean purchase2 = c13770e.purchase(c4993e);
        Object m3681throw5 = c13770e.m3681throw();
        if (purchase2 || m3681throw5 == obj) {
            m3681throw5 = new C15778e(c4993e, 1);
            c13770e.m3682throws(m3681throw5);
        }
        c13770e.Signature(false);
        C6656e purchase3 = AbstractC14533e.purchase((Function0) m3681throw5);
        Object obj2 = (EnumC17426e) purchase3.getValue();
        c13770e.m3676strictfp(1347468268);
        boolean purchase4 = c13770e.purchase(c16005e) | c13770e.metrica(f2) | c13770e.purchase(interfaceC18435e2) | c13770e.purchase(c4993e) | c13770e.purchase(c5659e) | c13770e.purchase(obj2);
        Object m3681throw6 = c13770e.m3681throw();
        if (purchase4 || m3681throw6 == obj) {
            int ordinal = ((EnumC17426e) purchase3.getValue()).ordinal();
            if (ordinal == 0) {
                c14865e = C14865e.f29427e;
            } else {
                if (ordinal != 1) {
                    throw new C14803e(10);
                }
                c14865e = C14865e.f29424e;
            }
            Object c10743e = new C10743e(new C5389e(23, c4993e), interfaceC18435e2, mopub3, mo497instanceof, c3922e, c5659e, enumC7792e, c14865e);
            c13770e.m3682throws(c10743e);
            m3681throw6 = c10743e;
        }
        C10743e c10743e2 = (C10743e) m3681throw6;
        c13770e.Signature(false);
        c13770e.Signature(false);
        return c10743e2;
    }

    public static final C17149e license() {
        C17149e c17149e = vip;
        if (c17149e != null) {
            return c17149e;
        }
        C18373e c18373e = new C18373e("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC13069e.ad;
        C18466e c18466e = new C18466e(C3618e.vip);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C8664e(9.0f, 16.17f));
        arrayList.add(new C5161e(4.83f, 12.0f));
        arrayList.add(new C11098e(-1.42f, 1.41f));
        arrayList.add(new C5161e(9.0f, 19.0f));
        arrayList.add(new C5161e(21.0f, 7.0f));
        arrayList.add(new C11098e(-1.41f, -1.41f));
        arrayList.add(C11621e.metrica);
        C18373e.ad(c18373e, arrayList, c18466e);
        C17149e vip2 = c18373e.vip();
        vip = vip2;
        return vip2;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(defpackage.C18055e r17, defpackage.C10743e r18, java.lang.Object r19, defpackage.InterfaceC12864e r20, boolean r21, defpackage.InterfaceC12864e r22, defpackage.C2892e r23, defpackage.C13770e r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7763e.vip(e٘۠ۜ, eُؒ٘, java.lang.Object, eّۤۧ, boolean, eّۤۧ, eؔ۟ٓ, eٓؕۥ, int, int):void");
    }

    public void metrica(C13654e c13654e) {
        List singletonList = Collections.singletonList(c13654e);
        C15899e c15899e = (C15899e) this;
        if (singletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new C6117e(c15899e, null, 2, singletonList).mopub();
    }
}
