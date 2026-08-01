package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14301e implements InterfaceC14585e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f28286e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1410e f28287e;

    public C14301e(List list, List list2) {
        C13304e Signature = AbstractC17475e.Signature();
        AbstractC2301e.billing(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            Signature.metrica(new C7978e((InterfaceC14585e) list.get(i), (List) list2.get(i)));
        }
        this.f28287e = Signature.billing();
        this.f28286e = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC14585e
    public final long admob() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            C1410e c1410e = this.f28287e;
            if (i >= c1410e.f4224e) {
                break;
            }
            C7978e c7978e = (C7978e) c1410e.get(i);
            long admob = c7978e.f16157e.admob();
            AbstractC17475e abstractC17475e = c7978e.f16156e;
            if ((abstractC17475e.contains(1) || abstractC17475e.contains(2) || abstractC17475e.contains(4)) && admob != Long.MIN_VALUE) {
                j = Math.min(j, admob);
            }
            if (admob != Long.MIN_VALUE) {
                j2 = Math.min(j2, admob);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.f28286e = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.f28286e;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // defpackage.InterfaceC14585e
    public final long license() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            C1410e c1410e = this.f28287e;
            if (i >= c1410e.f4224e) {
                break;
            }
            long license = ((C7978e) c1410e.get(i)).f16157e.license();
            if (license != Long.MIN_VALUE) {
                j = Math.min(j, license);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean loadAd(C6576e c6576e) {
        boolean z;
        boolean z2 = false;
        do {
            long license = license();
            if (license == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            z = false;
            while (true) {
                C1410e c1410e = this.f28287e;
                if (i >= c1410e.f4224e) {
                    break;
                }
                long license2 = ((C7978e) c1410e.get(i)).f16157e.license();
                boolean z3 = license2 != Long.MIN_VALUE && license2 <= c6576e.ad;
                if (license2 == license || z3) {
                    z |= ((C7978e) c1410e.get(i)).f16157e.loadAd(c6576e);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean subscription() {
        int i = 0;
        while (true) {
            C1410e c1410e = this.f28287e;
            if (i >= c1410e.f4224e) {
                return false;
            }
            if (((C7978e) c1410e.get(i)).f16157e.subscription()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC14585e
    public final void tapsense(long j) {
        int i = 0;
        while (true) {
            C1410e c1410e = this.f28287e;
            if (i >= c1410e.f4224e) {
                return;
            }
            ((C7978e) c1410e.get(i)).tapsense(j);
            i++;
        }
    }
}
