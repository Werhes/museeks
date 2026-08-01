package defpackage;

import androidx.car.app.model.Alert;
import java.util.Collections;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16342e {
    public static final C7983e ad = new C7983e(5);
    public static final C3018e vip = new Object();
    public static final C8931e metrica = new C8931e(2);
    public static final C11699e license = new C11699e(1);

    public static final C18045e ad(String str) {
        return new C18045e(Collections.singleton(str));
    }

    public static InterfaceC12864e appmetrica(InterfaceC12864e interfaceC12864e, InterfaceC10481e interfaceC10481e, EnumC17426e enumC17426e, boolean z, boolean z2, C15274e c15274e) {
        return interfaceC12864e.premium(new C14997e(interfaceC10481e, enumC17426e, z, z2, c15274e));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًؗۖ, java.lang.Object, eۣؖۖ] */
    public static C4300e license(Function2 function2) {
        ?? obj = new Object();
        obj.f9403e = AbstractC10558e.yandex(obj, obj, function2);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, eٔۦْ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(defpackage.C11950e r10, long r11, defpackage.AbstractC10731e r13) {
        /*
            boolean r0 = r13 instanceof defpackage.C18299e
            if (r0 == 0) goto L13
            r0 = r13
            eۖٗ r0 = (defpackage.C18299e) r0
            int r1 = r0.f35946e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35946e = r1
            goto L18
        L13:
            eۖٗ r0 = new eۖٗ
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f35947e
            int r1 = r0.f35946e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            eٔۦْ r10 = r0.f35944e
            eِۙ r11 = r0.f35945e
            defpackage.AbstractC2003e.purchase(r13)
            r7 = r10
            r10 = r11
            goto L56
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.AbstractC2003e.purchase(r13)
            eٔۦْ r7 = new eٔۦْ
            r7.<init>()
            eؘۗٚ r3 = new eؘۗٚ
            r8 = 0
            r9 = 5
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r7, r8, r9)
            r0.f35945e = r4
            r0.f35944e = r7
            r0.f35946e = r2
            eؚؗۨ r10 = defpackage.EnumC6955e.f14256e
            java.lang.Object r10 = r4.purchase(r10, r3, r0)
            eٟؔۙ r11 = defpackage.EnumC2821e.f6782e
            if (r10 != r11) goto L55
            return r11
        L55:
            r10 = r4
        L56:
            float r11 = r7.f29883e
            long r10 = r10.yandex(r11)
            eؓۡؖ r12 = new eؓۡؖ
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16342e.metrica(eِۙ, long, eُؑ۠):java.lang.Object");
    }

    public static int purchase(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        return i3 < 0 ? Alert.DURATION_SHOW_INDEFINITELY : i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Type inference failed for: r6v18, types: [e٘۠ۜ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final defpackage.InterfaceC12864e r39, defpackage.C4993e r40, final defpackage.InterfaceC12123e r41, final boolean r42, final defpackage.InterfaceC8642e r43, final boolean r44, final defpackage.C11644e r45, defpackage.InterfaceC3886e r46, defpackage.InterfaceC6428e r47, defpackage.C14544e r48, defpackage.InterfaceC10260e r49, final kotlin.jvm.functions.Function1 r50, defpackage.C13770e r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16342e.vip(eّۤۧ, eؗٚٝ, eِۦۦ, boolean, eٌّؐ, boolean, eَِؚ, eؖؖؖ, eؙٖ٘, eؘِٔ, eَٔؔ, kotlin.jvm.functions.Function1, eٓؕۥ, int, int, int):void");
    }
}
