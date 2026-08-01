package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٞۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9639e {
    public final C13797e ad;
    public HashMap appmetrica;
    public ArrayList license;
    public ArrayList metrica;
    public C13797e vip;

    public C9639e(C13797e c13797e) {
        this.ad = c13797e;
    }

    public final List ad() {
        ArrayList arrayList = this.license;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            C13797e c13797e = this.ad;
            arrayList2.add(new C13797e(AbstractC5190e.adcel(d, c13797e.metrica, c13797e.license)));
        }
        ArrayList remoteconfig = AbstractC0746e.remoteconfig(Collections.singletonList(arrayList2));
        this.license = remoteconfig;
        return remoteconfig;
    }

    public final C13797e appmetrica() {
        return (C13797e) vip().get(vip().size() - 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9639e) && AbstractC7890e.billing(this.ad, ((C9639e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.ad;
    }

    public final Map license() {
        HashMap hashMap = this.appmetrica;
        if (hashMap != null) {
            return hashMap;
        }
        ArrayList<C13797e> arrayList = new ArrayList(ad());
        arrayList.add(this.ad);
        HashMap hashMap2 = new HashMap();
        for (C13797e c13797e : arrayList) {
            int i = c13797e.ad;
            double purchase = AbstractC8210e.purchase((i >> 16) & 255);
            double purchase2 = AbstractC8210e.purchase((i >> 8) & 255);
            double purchase3 = AbstractC8210e.purchase(i & 255);
            double[][] dArr = AbstractC8210e.ad;
            double[] dArr2 = dArr[0];
            double d = (dArr2[2] * purchase3) + (dArr2[1] * purchase2) + (dArr2[0] * purchase);
            double[] dArr3 = dArr[1];
            double d2 = (dArr3[2] * purchase3) + (dArr3[1] * purchase2) + (dArr3[0] * purchase);
            double[] dArr4 = dArr[2];
            double d3 = (dArr4[2] * purchase3) + (dArr4[1] * purchase2) + (dArr4[0] * purchase);
            double[] dArr5 = AbstractC8210e.vip;
            double d4 = d / dArr5[0];
            double d5 = d2 / dArr5[1];
            double d6 = d3 / dArr5[2];
            double appmetrica = AbstractC8210e.appmetrica(d4);
            double appmetrica2 = AbstractC8210e.appmetrica(d5);
            double[] dArr6 = {(116.0d * appmetrica2) - 16, (appmetrica - appmetrica2) * 500.0d, (appmetrica2 - AbstractC8210e.appmetrica(d6)) * 200.0d};
            double atan2 = (Math.atan2(dArr6[2], dArr6[1]) * 57.29577951308232d) % 360.0d;
            if (atan2 < 0.0d) {
                atan2 += 360.0d;
            }
            double pow = Math.pow(Math.hypot(dArr6[1], dArr6[2]), 1.07d) * 0.02d;
            double d7 = (atan2 - 50.0d) % 360.0d;
            if (d7 < 0.0d) {
                d7 += 360.0d;
            }
            hashMap2.put(c13797e, Double.valueOf((Math.cos(d7 * 0.017453292519943295d) * pow) - 0.5d));
        }
        this.appmetrica = hashMap2;
        return hashMap2;
    }

    public final double metrica(C13797e c13797e) {
        double doubleValue = ((Number) ((HashMap) license()).get(appmetrica())).doubleValue() - ((Number) ((HashMap) license()).get((C13797e) vip().get(0))).doubleValue();
        double doubleValue2 = ((Number) ((HashMap) license()).get(c13797e)).doubleValue() - ((Number) ((HashMap) license()).get((C13797e) vip().get(0))).doubleValue();
        if (doubleValue == 0.0d) {
            return 0.5d;
        }
        return doubleValue2 / doubleValue;
    }

    public final String toString() {
        return "TemperatureCache(input=" + this.ad + ")";
    }

    public final List vip() {
        ArrayList arrayList = this.metrica;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(ad());
        arrayList2.add(this.ad);
        AbstractC5167e.signatures(new C3751e(9, this), arrayList2);
        this.metrica = arrayList2;
        return arrayList2;
    }
}
