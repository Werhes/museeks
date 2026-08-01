package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11008e {
    public static final C2892e ad = new C2892e(-345526027, false, new C14123e(18));

    public static double ad(C13797e c13797e, double[] dArr, double[] dArr2) {
        double d;
        int min = Math.min(dArr.length - 1, dArr2.length);
        double d2 = c13797e.vip;
        int i = 0;
        while (true) {
            if (i >= min) {
                d = d2;
                break;
            }
            if (d2 < dArr[i] || d2 >= dArr[i + 1]) {
                i++;
            } else {
                d = dArr2[i] % 360.0d;
                if (d < 0.0d) {
                    d += 360.0d;
                }
            }
        }
        if (Math.min(dArr.length - 1, dArr2.length) <= 0) {
            d = 0.0d;
        }
        double d3 = (d2 + d) % 360.0d;
        return d3 < 0.0d ? d3 + 360.0d : d3;
    }

    public static final InterfaceC6512e metrica(C13770e c13770e, int i) {
        InterfaceC17372e interfaceC17372e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).license;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return interfaceC17372e.purchase();
        }
        if (m2467class == 1) {
            return interfaceC17372e.metrica();
        }
        if (m2467class == 2) {
            return interfaceC17372e.appmetrica();
        }
        if (m2467class == 3) {
            return interfaceC17372e.license();
        }
        if (m2467class == 4) {
            return interfaceC17372e.vip();
        }
        if (m2467class == 5) {
            return interfaceC17372e.ad();
        }
        throw new C14803e(10);
    }

    public static final boolean vip(C10566e c10566e) {
        int length = c10566e.f20850e.length();
        List list = c10566e.f20852e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C9363e c9363e = (C9363e) list.get(i);
                if ((c9363e.ad instanceof AbstractC9606e) && AbstractC13195e.vip(0, length, c9363e.vip, c9363e.metrica)) {
                    return true;
                }
            }
        }
        return false;
    }
}
