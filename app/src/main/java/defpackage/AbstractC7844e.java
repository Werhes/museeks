package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7844e {
    public static final C2892e ad = new C2892e(-942249008, false, new C14234e(20));
    public static final C2892e vip = new C2892e(-866005904, false, new C14234e(23));
    public static final C2892e metrica = new C2892e(-178126935, false, new C14234e(24));
    public static final C2892e license = new C2892e(1912750781, false, new C14234e(25));
    public static final C2892e appmetrica = new C2892e(-807991070, false, new C14234e(26));
    public static final C2892e purchase = new C2892e(258122638, false, new C17240e(26));
    public static final C2892e billing = new C2892e(-159347324, false, new C17240e(27));
    public static final C2892e yandex = new C2892e(1157792424, false, new C17240e(28));
    public static final C2892e startapp = new C2892e(35946994, false, new C17240e(29));
    public static final C2892e adcel = new C2892e(-1206527493, false, new C14234e(21));
    public static final C2892e mopub = new C2892e(-1375695819, false, new C14234e(22));

    public static final void Signature(C17142e c17142e, C16747e c16747e) {
        c16747e.f32835e.setValue(c17142e.appmetrica.getValue());
        AbstractC3424e abstractC3424e = c16747e.f32834e;
        AbstractC3424e abstractC3424e2 = c17142e.purchase;
        int vip2 = abstractC3424e.vip();
        for (int i = 0; i < vip2; i++) {
            abstractC3424e.appmetrica(i, abstractC3424e2.ad(i));
        }
        c16747e.f32833e = c17142e.yandex;
        c16747e.f32836e = c17142e.billing;
        c16747e.f32838e = ((Boolean) c17142e.startapp.getValue()).booleanValue();
    }

    public static final boolean ad(C7556e c7556e, long j) {
        if (!c7556e.f27022e.f27016e) {
            return false;
        }
        C14747e c14747e = (C14747e) AbstractC5851e.mopub(c7556e).f27592e.license;
        if (!c14747e.f29169e.f27016e) {
            return false;
        }
        long mo211this = c14747e.mo211this(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (mo211this >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo211this & 4294967295L));
        long j2 = c7556e.f15383e;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    public static final void adcel(C17142e c17142e, long j, float f, InterfaceC8377e interfaceC8377e, C16747e c16747e, Function1 function1) {
        long vip2 = f == 0.0f ? interfaceC8377e.vip() : ((float) (j - c17142e.metrica)) / f;
        c17142e.billing = j;
        c17142e.appmetrica.setValue(interfaceC8377e.purchase(vip2));
        c17142e.purchase = interfaceC8377e.license(vip2);
        if (interfaceC8377e.appmetrica(vip2)) {
            c17142e.yandex = c17142e.billing;
            c17142e.startapp.setValue(Boolean.FALSE);
        }
        Signature(c17142e, c16747e);
        function1.invoke(c17142e);
    }

    public static final float advert(InterfaceC8850e interfaceC8850e) {
        InterfaceC17083e interfaceC17083e = (InterfaceC17083e) interfaceC8850e.mo397public(C5107e.f10971e);
        float mo2509new = interfaceC17083e != null ? interfaceC17083e.mo2509new() : 1.0f;
        if (mo2509new >= 0.0f) {
            return mo2509new;
        }
        AbstractC2878e.vip("negative scale factor");
        return mo2509new;
    }

    public static final long amazon(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final Object appmetrica(C16747e c16747e, C15217e c15217e, boolean z, Function1 function1, AbstractC10731e abstractC10731e) {
        Object metrica2 = metrica(c16747e, new C7940e(c15217e, c16747e.f32837e, c16747e.f32835e.getValue(), c16747e.f32834e), z ? c16747e.f32836e : Long.MIN_VALUE, function1, abstractC10731e);
        return metrica2 == EnumC2821e.f6782e ? metrica2 : Unit.INSTANCE;
    }

    public static /* synthetic */ Object billing(C16747e c16747e, Float f, InterfaceC2869e interfaceC2869e, boolean z, Function1 function1, AbstractC10731e abstractC10731e, int i) {
        if ((i & 2) != 0) {
            interfaceC2869e = AbstractC12696e.purchase(0.0f, 0.0f, null, 7);
        }
        InterfaceC2869e interfaceC2869e2 = interfaceC2869e;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = new C4671e(5);
        }
        return purchase(c16747e, f, interfaceC2869e2, z2, function1, abstractC10731e);
    }

    public static /* synthetic */ Object license(float f, float f2, InterfaceC2869e interfaceC2869e, Function2 function2, AbstractC7185e abstractC7185e, int i) {
        if ((i & 8) != 0) {
            interfaceC2869e = AbstractC12696e.purchase(0.0f, 0.0f, null, 7);
        }
        return vip(f, f2, 0.0f, interfaceC2869e, function2, abstractC7185e);
    }

    public static final String loadAd(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = AbstractC6494e.vip;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return AbstractC6507e.startapp(cArr2, i2, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010d A[Catch: CancellationException -> 0x003d, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x003d, blocks: (B:16:0x0038, B:18:0x00f9, B:20:0x010d, B:25:0x012c, B:27:0x013c, B:29:0x0146, B:36:0x0153, B:37:0x0158, B:39:0x0159), top: B:15:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v24, types: [eٌۤؕ] */
    /* JADX WARN: Type inference failed for: r0v31, types: [eٌۤؕ] */
    /* JADX WARN: Type inference failed for: r0v9, types: [eٌۤؕ] */
    /* JADX WARN: Type inference failed for: r1v10, types: [eٌۤؕ] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [eّؖٝ] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [eّؖٝ] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [eّؖٝ] */
    /* JADX WARN: Type inference failed for: r1v26, types: [eّؖٝ] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [eًؗۖ, eُؔۤ, eُؑ۠] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(defpackage.C16747e r24, defpackage.InterfaceC8377e r25, long r26, final kotlin.jvm.functions.Function1 r28, defpackage.AbstractC10731e r29) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7844e.metrica(eْٗؔ, eًۨٚ, long, kotlin.jvm.functions.Function1, eُؑ۠):java.lang.Object");
    }

    public static C7666e mopub(C7666e c7666e, EnumC7792e enumC7792e, C1839e c1839e, InterfaceC14388e interfaceC14388e, InterfaceC2141e interfaceC2141e) {
        if (c7666e != null && enumC7792e == c7666e.ad && AbstractC15890e.license(c1839e, enumC7792e).equals(c7666e.vip) && interfaceC14388e.vip() == c7666e.metrica.f22708e && interfaceC2141e == c7666e.license) {
            return c7666e;
        }
        C7666e c7666e2 = C7666e.yandex;
        if (c7666e2 != null && enumC7792e == c7666e2.ad && AbstractC15890e.license(c1839e, enumC7792e).equals(c7666e2.vip) && interfaceC14388e.vip() == c7666e2.metrica.f22708e && interfaceC2141e == c7666e2.license) {
            return c7666e2;
        }
        C7666e c7666e3 = new C7666e(enumC7792e, AbstractC15890e.license(c1839e, enumC7792e), new C11315e(interfaceC14388e.vip(), interfaceC14388e.mo499package()), interfaceC2141e);
        C7666e.yandex = c7666e3;
        return c7666e3;
    }

    public static final Object purchase(C16747e c16747e, Float f, InterfaceC2869e interfaceC2869e, boolean z, Function1 function1, AbstractC10731e abstractC10731e) {
        Object metrica2 = metrica(c16747e, new C9260e(interfaceC2869e, c16747e.f32837e, c16747e.f32835e.getValue(), f, c16747e.f32834e), z ? c16747e.f32836e : Long.MIN_VALUE, function1, abstractC10731e);
        return metrica2 == EnumC2821e.f6782e ? metrica2 : Unit.INSTANCE;
    }

    public static final int smaato(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final void startapp(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder inmobi = AbstractC1786e.inmobi(j, "size=", " offset=");
            inmobi.append(j2);
            inmobi.append(" byteCount=");
            inmobi.append(j3);
            throw new ArrayIndexOutOfBoundsException(inmobi.toString());
        }
    }

    public static final Object vip(float f, float f2, float f3, InterfaceC2869e interfaceC2869e, Function2 function2, AbstractC7185e abstractC7185e) {
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        C11139e c11139e = AbstractC9546e.ad;
        Function1 function1 = c11139e.ad;
        AbstractC3424e abstractC3424e = (AbstractC3424e) function1.invoke(f6);
        if (abstractC3424e == null) {
            abstractC3424e = ((AbstractC3424e) function1.invoke(f4)).metrica();
        }
        AbstractC3424e abstractC3424e2 = abstractC3424e;
        Object metrica2 = metrica(new C16747e(c11139e, f4, abstractC3424e2, 56), new C9260e(interfaceC2869e, c11139e, f4, f5, abstractC3424e2), Long.MIN_VALUE, new C17955e(7, function2), abstractC7185e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (metrica2 != enumC2821e) {
            metrica2 = Unit.INSTANCE;
        }
        return metrica2 == enumC2821e ? metrica2 : Unit.INSTANCE;
    }

    public static final boolean yandex(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
