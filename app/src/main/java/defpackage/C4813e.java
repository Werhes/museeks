package defpackage;

import java.io.Serializable;
import java.math.BigInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4813e {
    public final /* synthetic */ int ad = 0;
    public final Serializable appmetrica;
    public final Serializable billing;
    public final Object license;
    public final Object metrica;
    public final Serializable purchase;
    public final int vip;
    public final Object yandex;

    /* JADX WARN: Multi-variable type inference failed */
    public C4813e(EnumC5730e enumC5730e, C16308e c16308e, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        this.metrica = enumC5730e;
        this.license = c16308e;
        this.appmetrica = strArr;
        this.purchase = strArr2;
        this.billing = strArr3;
        this.yandex = str;
        this.vip = i;
    }

    public C4813e(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i) {
        ad(bigIntegerArr, "v1");
        ad(bigIntegerArr2, "v2");
        this.metrica = bigIntegerArr[0];
        this.license = bigIntegerArr[1];
        this.appmetrica = bigIntegerArr2[0];
        this.purchase = bigIntegerArr2[1];
        this.billing = bigInteger;
        this.yandex = bigInteger2;
        this.vip = i;
    }

    public static void ad(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }

    public String toString() {
        switch (this.ad) {
            case 0:
                return ((EnumC5730e) this.metrica) + " version=" + ((C16308e) this.license);
            default:
                return super.toString();
        }
    }
}
