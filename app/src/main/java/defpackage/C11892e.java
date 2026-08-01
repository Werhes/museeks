package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.HashMap;

/* renamed from: eِٞۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11892e {
    public static final C0679e billing;
    public final int ad;
    public final int appmetrica;
    public final int license;
    public final int metrica;
    public final Ctry purchase;
    public final int vip;

    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.AbstractMap, eؑۤۥ, java.util.HashMap] */
    static {
        Ctry ctry = InterfaceC0760e.ad;
        C11892e c11892e = new C11892e(1, 32, 1, 265, 7, ctry);
        C11892e c11892e2 = new C11892e(2, 32, 2, 133, 6, ctry);
        C11892e c11892e3 = new C11892e(3, 32, 4, 67, 4, ctry);
        C11892e c11892e4 = new C11892e(4, 32, 8, 34, 0, ctry);
        C11892e c11892e5 = new C11892e(5, 24, 1, 200, 8, ctry);
        C11892e c11892e6 = new C11892e(6, 24, 2, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 6, ctry);
        C11892e c11892e7 = new C11892e(7, 24, 4, 51, 4, ctry);
        C11892e c11892e8 = new C11892e(8, 24, 8, 26, 0, ctry);
        Ctry ctry2 = InterfaceC0760e.admob;
        C11892e c11892e9 = new C11892e(9, 32, 1, 265, 7, ctry2);
        C11892e c11892e10 = new C11892e(10, 32, 2, 133, 6, ctry2);
        C11892e c11892e11 = new C11892e(11, 32, 4, 67, 4, ctry2);
        C11892e c11892e12 = new C11892e(12, 32, 8, 34, 0, ctry2);
        C11892e c11892e13 = new C11892e(13, 24, 1, 200, 8, ctry2);
        C11892e c11892e14 = new C11892e(14, 24, 2, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 6, ctry2);
        C11892e c11892e15 = new C11892e(15, 24, 4, 51, 4, ctry2);
        C11892e c11892e16 = new C11892e(16, 24, 8, 26, 0, ctry2);
        ?? hashMap = new HashMap();
        hashMap.put(1, c11892e);
        hashMap.put(2, c11892e2);
        hashMap.put(3, c11892e3);
        hashMap.put(4, c11892e4);
        hashMap.put(5, c11892e5);
        hashMap.put(6, c11892e6);
        hashMap.put(7, c11892e7);
        hashMap.put(8, c11892e8);
        hashMap.put(9, c11892e9);
        hashMap.put(10, c11892e10);
        hashMap.put(11, c11892e11);
        hashMap.put(12, c11892e12);
        hashMap.put(13, c11892e13);
        hashMap.put(14, c11892e14);
        hashMap.put(15, c11892e15);
        hashMap.put(16, c11892e16);
        billing = hashMap;
    }

    public C11892e(int i, int i2, int i3, int i4, int i5, Ctry ctry) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
        this.appmetrica = i5;
        this.purchase = ctry;
    }
}
