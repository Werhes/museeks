package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8305e {
    public final int ad;
    public final boolean appmetrica;
    public final int billing;
    public final List license;
    public final C12854e metrica;
    public final int purchase;
    public final C6564e[] vip;
    public final int yandex;

    public C8305e(int i, C6564e[] c6564eArr, C12854e c12854e, List list, boolean z, int i2) {
        this.ad = i;
        this.vip = c6564eArr;
        this.metrica = c12854e;
        this.license = list;
        this.appmetrica = z;
        this.purchase = i2;
        int i3 = 0;
        for (C6564e c6564e : c6564eArr) {
            i3 = Math.max(i3, c6564e.loadAd);
        }
        this.billing = i3;
        int i4 = i3 + this.purchase;
        this.yandex = i4 >= 0 ? i4 : 0;
    }

    public final C6564e[] ad(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        C6564e[] c6564eArr = this.vip;
        int length = c6564eArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            C6564e c6564e = c6564eArr[i8];
            int i11 = i9 + 1;
            int i12 = (int) ((C5177e) this.license.get(i9)).ad;
            int i13 = this.metrica.vip[i10];
            int i14 = this.ad;
            boolean z = this.appmetrica;
            int i15 = z ? i14 : i10;
            if (z) {
                i4 = i10;
                i7 = i;
                i5 = i2;
                i6 = i3;
            } else {
                i4 = i14;
                i5 = i2;
                i6 = i3;
                i7 = i;
            }
            c6564e.license(i7, i13, i5, i6, i15, i4);
            Unit unit = Unit.INSTANCE;
            i10 += i12;
            i8++;
            i9 = i11;
        }
        return c6564eArr;
    }
}
