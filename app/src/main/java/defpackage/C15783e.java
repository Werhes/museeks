package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15783e implements InterfaceC3772e {
    public final ArrayList ad;

    public C15783e(int i) {
        switch (i) {
            case 1:
                this.ad = new ArrayList();
                return;
            default:
                this.ad = new ArrayList(20);
                return;
        }
    }

    @Override // defpackage.InterfaceC3772e
    public long ad(long j) {
        ArrayList arrayList = this.ad;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C17169e) arrayList.get(0)).vip) {
            return ((C17169e) arrayList.get(0)).vip;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C17169e c17169e = (C17169e) arrayList.get(i);
            long j2 = c17169e.vip;
            long j3 = c17169e.vip;
            if (j < j2) {
                long j4 = ((C17169e) arrayList.get(i - 1)).license;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((C17169e) AbstractC4306e.appmetrica(arrayList)).license;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    public void adcel(String str, String str2) {
        AbstractC3149e.appmetrica(str);
        AbstractC3149e.purchase(str2, str);
        startapp(str);
        AbstractC3149e.metrica(this, str, str2);
    }

    @Override // defpackage.InterfaceC3772e
    public void appmetrica(long j) {
        int yandex = yandex(j);
        if (yandex == 0) {
            return;
        }
        ArrayList arrayList = this.ad;
        long j2 = ((C17169e) arrayList.get(yandex - 1)).license;
        if (j2 == -9223372036854775807L || j2 >= j) {
            yandex--;
        }
        arrayList.subList(0, yandex).clear();
    }

    public C15793e billing() {
        return new C15793e((String[]) this.ad.toArray(new String[0]));
    }

    @Override // defpackage.InterfaceC3772e
    public void clear() {
        this.ad.clear();
    }

    @Override // defpackage.InterfaceC3772e
    public long license(long j) {
        ArrayList arrayList = this.ad;
        if (arrayList.isEmpty() || j < ((C17169e) arrayList.get(0)).vip) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C17169e) arrayList.get(i)).vip;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C17169e c17169e = (C17169e) arrayList.get(i - 1);
                long j3 = c17169e.license;
                return (j3 == -9223372036854775807L || j3 > j) ? c17169e.vip : j3;
            }
        }
        C17169e c17169e2 = (C17169e) AbstractC4306e.appmetrica(arrayList);
        long j4 = c17169e2.license;
        return (j4 == -9223372036854775807L || j < j4) ? c17169e2.vip : j4;
    }

    @Override // defpackage.InterfaceC3772e
    public AbstractC17475e metrica(long j) {
        int yandex = yandex(j);
        if (yandex == 0) {
            C2171e c2171e = AbstractC17475e.f34223e;
            return C1410e.f4222e;
        }
        C17169e c17169e = (C17169e) this.ad.get(yandex - 1);
        long j2 = c17169e.license;
        if (j2 == -9223372036854775807L || j < j2) {
            return c17169e.ad;
        }
        C2171e c2171e2 = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    public void purchase(String str, String str2) {
        AbstractC3149e.appmetrica(str);
        AbstractC3149e.purchase(str2, str);
        AbstractC3149e.metrica(this, str, str2);
    }

    public void startapp(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.ad;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.InterfaceC3772e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean vip(defpackage.C17169e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.vip
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            defpackage.AbstractC2301e.billing(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.license
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.ad
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            eٕٗٞ r7 = (defpackage.C17169e) r7
            long r7 = r7.vip
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            eٕٗٞ r7 = (defpackage.C17169e) r7
            long r7 = r7.vip
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15783e.vip(eٕٗٞ, long):boolean");
    }

    public int yandex(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.ad;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C17169e) arrayList.get(i)).vip) {
                return i;
            }
            i++;
        }
    }
}
