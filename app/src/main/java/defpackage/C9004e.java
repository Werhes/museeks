package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9004e implements InterfaceC3772e {
    public static final C4545e vip = new C4545e(new C3426e(new C10612e(12), C5949e.f12529e), new C3426e(new C10612e(13), C5949e.f12528e));
    public final ArrayList ad = new ArrayList();

    @Override // defpackage.InterfaceC3772e
    public final long ad(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.ad;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((C17169e) arrayList.get(i)).vip;
            long j4 = ((C17169e) arrayList.get(i)).license;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.InterfaceC3772e
    public final void appmetrica(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.ad;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((C17169e) arrayList.get(i)).vip;
            if (j > j2 && j > ((C17169e) arrayList.get(i)).license) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC3772e
    public final void clear() {
        this.ad.clear();
    }

    @Override // defpackage.InterfaceC3772e
    public final long license(long j) {
        ArrayList arrayList = this.ad;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C17169e) arrayList.get(0)).vip) {
            return -9223372036854775807L;
        }
        long j2 = ((C17169e) arrayList.get(0)).vip;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((C17169e) arrayList.get(i)).vip;
            long j4 = ((C17169e) arrayList.get(i)).license;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    @Override // defpackage.InterfaceC3772e
    public final AbstractC17475e metrica(long j) {
        ArrayList arrayList = this.ad;
        if (!arrayList.isEmpty()) {
            if (j >= ((C17169e) arrayList.get(0)).vip) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C17169e c17169e = (C17169e) arrayList.get(i);
                    if (j >= c17169e.vip && j < c17169e.license) {
                        arrayList2.add(c17169e);
                    }
                    if (j < c17169e.vip) {
                        break;
                    }
                }
                C1410e firebase = AbstractC17475e.firebase(vip, arrayList2);
                C13304e Signature = AbstractC17475e.Signature();
                for (int i2 = 0; i2 < firebase.f4224e; i2++) {
                    Signature.license(((C17169e) firebase.get(i2)).ad);
                }
                return Signature.billing();
            }
        }
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.InterfaceC3772e
    public final boolean vip(C17169e c17169e, long j) {
        long j2 = c17169e.vip;
        AbstractC2301e.billing(j2 != -9223372036854775807L);
        AbstractC2301e.billing(c17169e.metrica != -9223372036854775807L);
        boolean z = j2 <= j && j < c17169e.license;
        ArrayList arrayList = this.ad;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C17169e) arrayList.get(size)).vip) {
                arrayList.add(size + 1, c17169e);
                return z;
            }
        }
        arrayList.add(0, c17169e);
        return z;
    }
}
