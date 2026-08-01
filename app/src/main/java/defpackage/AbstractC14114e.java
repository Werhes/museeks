package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14114e {
    public static final C2892e ad = new C2892e(1110955941, false, new C6039e(9));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [eِٖۢ, java.lang.Object, eّؔۜ] */
    /* JADX WARN: Type inference failed for: r4v9, types: [eِٖۢ, java.lang.Object, eّؔۜ] */
    public static void ad(long j, C16151e c16151e, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((C0193e) arrayList4.get(i8)).license() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0193e c0193e = (C0193e) arrayList.get(i2);
        C0193e c0193e2 = (C0193e) arrayList4.get(i3 - 1);
        if (i7 == c0193e.license()) {
            int intValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            C0193e c0193e3 = (C0193e) arrayList4.get(i9);
            i4 = i9;
            i5 = intValue;
            c0193e = c0193e3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c0193e.startapp(i7) == c0193e2.startapp(i7)) {
            int min = Math.min(c0193e.license(), c0193e2.license());
            int i10 = 0;
            for (int i11 = i7; i11 < min && c0193e.startapp(i11) == c0193e2.startapp(i11); i11++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (c16151e.f31731e / j3) + j + 2 + i10 + 1;
            c16151e.m4124else(-i10);
            c16151e.m4124else(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c16151e.m4124else(c0193e.startapp(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 != ((C0193e) arrayList4.get(i4)).license()) {
                    throw new IllegalStateException("Check failed.");
                }
                c16151e.m4124else(((Number) arrayList5.get(i4)).intValue());
                return;
            } else {
                ?? obj = new Object();
                c16151e.m4124else(((int) ((obj.f31731e / j3) + j4)) * (-1));
                ad(j4, obj, i12, arrayList4, i4, i3, arrayList5);
                c16151e.mo2629class(obj);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((C0193e) arrayList4.get(i14 - 1)).startapp(i7) != ((C0193e) arrayList4.get(i14)).startapp(i7)) {
                i13++;
            }
        }
        long j5 = 4;
        long j6 = (c16151e.f31731e / j5) + j + 2 + (i13 * 2);
        c16151e.m4124else(i13);
        c16151e.m4124else(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            byte startapp = ((C0193e) arrayList4.get(i15)).startapp(i7);
            if (i15 == i4 || startapp != ((C0193e) arrayList4.get(i15 - 1)).startapp(i7)) {
                c16151e.m4124else(startapp & 255);
            }
        }
        ?? obj2 = new Object();
        int i16 = i4;
        while (i16 < i3) {
            byte startapp2 = ((C0193e) arrayList4.get(i16)).startapp(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (startapp2 != ((C0193e) arrayList4.get(i18)).startapp(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((C0193e) arrayList4.get(i16)).license()) {
                c16151e.m4124else(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
            } else {
                c16151e.m4124else(((int) ((obj2.f31731e / j5) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
                ad(j2, obj2, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        c16151e.mo2629class(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void adcel(AbstractC13616e abstractC13616e, String str, Function1 function1) {
        if (!abstractC13616e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitSubtreeIf called on an unattached node");
        }
        C12431e c12431e = new C12431e(0, new AbstractC13616e[16]);
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27022e;
        AbstractC13616e abstractC13616e3 = abstractC13616e2.f27024e;
        if (abstractC13616e3 == null) {
            AbstractC5851e.ad(c12431e, abstractC13616e2);
        } else {
            c12431e.license(abstractC13616e3);
        }
        while (true) {
            int i = c12431e.f24868e;
            if (i == 0) {
                return;
            }
            AbstractC13616e abstractC13616e4 = (AbstractC13616e) c12431e.amazon(i - 1);
            if ((abstractC13616e4.f27020e & 262144) != 0) {
                for (AbstractC13616e abstractC13616e5 = abstractC13616e4; abstractC13616e5 != null && abstractC13616e5.f27016e; abstractC13616e5 = abstractC13616e5.f27024e) {
                    if ((abstractC13616e5.f27014e & 262144) != 0) {
                        AbstractC6126e abstractC6126e = abstractC13616e5;
                        ?? r7 = 0;
                        while (abstractC6126e != 0) {
                            if (abstractC6126e instanceof InterfaceC6459e) {
                                InterfaceC6459e interfaceC6459e = (InterfaceC6459e) abstractC6126e;
                                EnumC9253e enumC9253e = str.equals(interfaceC6459e.admob()) ? (EnumC9253e) function1.invoke(interfaceC6459e) : EnumC9253e.f18468e;
                                if (enumC9253e == EnumC9253e.f18465e) {
                                    return;
                                }
                                if (enumC9253e == EnumC9253e.f18466e) {
                                    break;
                                }
                            } else if ((abstractC6126e.f27014e & 262144) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                                AbstractC13616e abstractC13616e6 = abstractC6126e.f12873e;
                                int i2 = 0;
                                abstractC6126e = abstractC6126e;
                                r7 = r7;
                                while (abstractC13616e6 != null) {
                                    if ((abstractC13616e6.f27014e & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            abstractC6126e = abstractC13616e6;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC6126e != 0) {
                                                r7.license(abstractC6126e);
                                                abstractC6126e = 0;
                                            }
                                            r7.license(abstractC13616e6);
                                        }
                                    }
                                    abstractC13616e6 = abstractC13616e6.f27024e;
                                    abstractC6126e = abstractC6126e;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC6126e = AbstractC5851e.vip(r7);
                        }
                    }
                }
            }
            AbstractC5851e.ad(c12431e, abstractC13616e4);
        }
    }

    public static final C8780e appmetrica(InterfaceC1108e interfaceC1108e, AbstractC0003e abstractC0003e, EnumC7785e enumC7785e) {
        return AbstractC7535e.metrica(new C1247e(abstractC0003e, enumC7785e, interfaceC1108e, (InterfaceC5083e) null, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [eِٖۢ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C3128e billing(defpackage.C0193e... r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14114e.billing(eًؑۤ[]):eٟؕؕ");
    }

    public static final InterfaceC6459e license(AbstractC13616e abstractC13616e, Object obj) {
        C14742e c14742e;
        if (!abstractC13616e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitAncestors called on an unattached node");
        }
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27022e.f27011e;
        C13915e mopub = AbstractC5851e.mopub(abstractC13616e);
        while (mopub != null) {
            if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 262144) != 0) {
                while (abstractC13616e2 != null) {
                    if ((abstractC13616e2.f27014e & 262144) != 0) {
                        AbstractC13616e abstractC13616e3 = abstractC13616e2;
                        C12431e c12431e = null;
                        while (abstractC13616e3 != null) {
                            if (abstractC13616e3 instanceof InterfaceC6459e) {
                                InterfaceC6459e interfaceC6459e = (InterfaceC6459e) abstractC13616e3;
                                if (obj.equals(interfaceC6459e.admob())) {
                                    return interfaceC6459e;
                                }
                            }
                            if ((abstractC13616e3.f27014e & 262144) != 0 && (abstractC13616e3 instanceof AbstractC6126e)) {
                                int i = 0;
                                for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e3).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                    if ((abstractC13616e4.f27014e & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC13616e3 = abstractC13616e4;
                                        } else {
                                            if (c12431e == null) {
                                                c12431e = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e3 != null) {
                                                c12431e.license(abstractC13616e3);
                                                abstractC13616e3 = null;
                                            }
                                            c12431e.license(abstractC13616e4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC13616e3 = AbstractC5851e.vip(c12431e);
                        }
                    }
                    abstractC13616e2 = abstractC13616e2.f27011e;
                }
            }
            mopub = mopub.tapsense();
            abstractC13616e2 = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
        }
        return null;
    }

    public static final ArrayList metrica(Bundle bundle) {
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxWidth", 0);
        C16109e c16109e = null;
        C16109e c16109e2 = (i == 0 || i2 == 0) ? null : new C16109e(AbstractC11160e.ad(i2, i));
        int i3 = bundle.getInt("appWidgetMaxHeight", 0);
        int i4 = bundle.getInt("appWidgetMinWidth", 0);
        if (i3 != 0 && i4 != 0) {
            c16109e = new C16109e(AbstractC11160e.ad(i4, i3));
        }
        return AbstractC1660e.isPro(new C16109e[]{c16109e2, c16109e});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [eؙٖ٘, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void mopub(InterfaceC6459e interfaceC6459e, Function1 function1) {
        AbstractC13616e abstractC13616e = (AbstractC13616e) interfaceC6459e;
        if (!abstractC13616e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitSubtreeIf called on an unattached node");
        }
        C12431e c12431e = new C12431e(0, new AbstractC13616e[16]);
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27022e;
        AbstractC13616e abstractC13616e3 = abstractC13616e2.f27024e;
        if (abstractC13616e3 == null) {
            AbstractC5851e.ad(c12431e, abstractC13616e2);
        } else {
            c12431e.license(abstractC13616e3);
        }
        while (true) {
            int i = c12431e.f24868e;
            if (i == 0) {
                return;
            }
            AbstractC13616e abstractC13616e4 = (AbstractC13616e) c12431e.amazon(i - 1);
            if ((abstractC13616e4.f27020e & 262144) != 0) {
                for (AbstractC13616e abstractC13616e5 = abstractC13616e4; abstractC13616e5 != null && abstractC13616e5.f27016e; abstractC13616e5 = abstractC13616e5.f27024e) {
                    if ((abstractC13616e5.f27014e & 262144) != 0) {
                        AbstractC6126e abstractC6126e = abstractC13616e5;
                        ?? r8 = 0;
                        while (abstractC6126e != 0) {
                            if (abstractC6126e instanceof InterfaceC6459e) {
                                InterfaceC6459e interfaceC6459e2 = (InterfaceC6459e) abstractC6126e;
                                EnumC9253e enumC9253e = (AbstractC7890e.billing(interfaceC6459e.admob(), interfaceC6459e2.admob()) && interfaceC6459e.getClass() == interfaceC6459e2.getClass()) ? (EnumC9253e) function1.invoke(interfaceC6459e2) : EnumC9253e.f18468e;
                                if (enumC9253e == EnumC9253e.f18465e) {
                                    return;
                                }
                                if (enumC9253e == EnumC9253e.f18466e) {
                                    break;
                                }
                            } else if ((abstractC6126e.f27014e & 262144) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                                AbstractC13616e abstractC13616e6 = abstractC6126e.f12873e;
                                int i2 = 0;
                                abstractC6126e = abstractC6126e;
                                r8 = r8;
                                while (abstractC13616e6 != null) {
                                    if ((abstractC13616e6.f27014e & 262144) != 0) {
                                        i2++;
                                        r8 = r8;
                                        if (i2 == 1) {
                                            abstractC6126e = abstractC13616e6;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC6126e != 0) {
                                                r8.license(abstractC6126e);
                                                abstractC6126e = 0;
                                            }
                                            r8.license(abstractC13616e6);
                                        }
                                    }
                                    abstractC13616e6 = abstractC13616e6.f27024e;
                                    abstractC6126e = abstractC6126e;
                                    r8 = r8;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC6126e = AbstractC5851e.vip(r8);
                        }
                    }
                }
            }
            AbstractC5851e.ad(c12431e, abstractC13616e4);
        }
    }

    public static final boolean purchase(C10838e c10838e) {
        int i = c10838e.ad;
        return Integer.MIN_VALUE <= i && i < -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void startapp(InterfaceC6459e interfaceC6459e, Function1 function1) {
        C14742e c14742e;
        boolean z;
        AbstractC13616e abstractC13616e = (AbstractC13616e) interfaceC6459e;
        if (!abstractC13616e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitAncestors called on an unattached node");
        }
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27022e.f27011e;
        C13915e mopub = AbstractC5851e.mopub(interfaceC6459e);
        while (mopub != null) {
            if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 262144) != 0) {
                while (abstractC13616e2 != null) {
                    if ((abstractC13616e2.f27014e & 262144) != 0) {
                        AbstractC13616e abstractC13616e3 = abstractC13616e2;
                        C12431e c12431e = null;
                        while (abstractC13616e3 != null) {
                            if (abstractC13616e3 instanceof InterfaceC6459e) {
                                InterfaceC6459e interfaceC6459e2 = (InterfaceC6459e) abstractC13616e3;
                                if (!((AbstractC7890e.billing(interfaceC6459e.admob(), interfaceC6459e2.admob()) && interfaceC6459e.getClass() == interfaceC6459e2.getClass()) ? ((Boolean) function1.invoke(interfaceC6459e2)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((abstractC13616e3.f27014e & 262144) != 0) && (abstractC13616e3 instanceof AbstractC6126e)) {
                                    int i = 0;
                                    for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e3).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                        if ((abstractC13616e4.f27014e & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC13616e3 = abstractC13616e4;
                                            } else {
                                                if (c12431e == null) {
                                                    c12431e = new C12431e(0, new AbstractC13616e[16]);
                                                }
                                                if (abstractC13616e3 != null) {
                                                    c12431e.license(abstractC13616e3);
                                                    abstractC13616e3 = null;
                                                }
                                                c12431e.license(abstractC13616e4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            abstractC13616e3 = AbstractC5851e.vip(c12431e);
                        }
                    }
                    abstractC13616e2 = abstractC13616e2.f27011e;
                }
            }
            mopub = mopub.tapsense();
            abstractC13616e2 = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
        }
    }

    public static final String vip(int i) {
        return AbstractC1786e.admob(i, "appWidget-");
    }

    public static final void yandex(InterfaceC5077e interfaceC5077e, Object obj, Function1 function1) {
        C14742e c14742e;
        boolean z;
        AbstractC13616e abstractC13616e = (AbstractC13616e) interfaceC5077e;
        if (!abstractC13616e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitAncestors called on an unattached node");
        }
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27022e.f27011e;
        C13915e mopub = AbstractC5851e.mopub(interfaceC5077e);
        while (mopub != null) {
            if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 262144) != 0) {
                while (abstractC13616e2 != null) {
                    if ((abstractC13616e2.f27014e & 262144) != 0) {
                        AbstractC13616e abstractC13616e3 = abstractC13616e2;
                        C12431e c12431e = null;
                        while (abstractC13616e3 != null) {
                            if (abstractC13616e3 instanceof InterfaceC6459e) {
                                InterfaceC6459e interfaceC6459e = (InterfaceC6459e) abstractC13616e3;
                                if (!(obj.equals(interfaceC6459e.admob()) ? ((Boolean) function1.invoke(interfaceC6459e)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((abstractC13616e3.f27014e & 262144) != 0) && (abstractC13616e3 instanceof AbstractC6126e)) {
                                    int i = 0;
                                    for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e3).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                        if ((abstractC13616e4.f27014e & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC13616e3 = abstractC13616e4;
                                            } else {
                                                if (c12431e == null) {
                                                    c12431e = new C12431e(0, new AbstractC13616e[16]);
                                                }
                                                if (abstractC13616e3 != null) {
                                                    c12431e.license(abstractC13616e3);
                                                    abstractC13616e3 = null;
                                                }
                                                c12431e.license(abstractC13616e4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            abstractC13616e3 = AbstractC5851e.vip(c12431e);
                        }
                    }
                    abstractC13616e2 = abstractC13616e2.f27011e;
                }
            }
            mopub = mopub.tapsense();
            abstractC13616e2 = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
        }
    }
}
