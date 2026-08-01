package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘۠ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18057e implements InterfaceC14239e, InterfaceC1145e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final IdentityHashMap f35412e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C14301e f35413e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean[] f35414e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C12931e f35415e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C1400e f35416e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public InterfaceC14239e[] f35417e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC14239e[] f35418e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InterfaceC1145e f35419e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ArrayList f35411e = new ArrayList();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final HashMap f35420e = new HashMap();

    public C18057e(C1400e c1400e, long[] jArr, InterfaceC14239e... interfaceC14239eArr) {
        this.f35416e = c1400e;
        this.f35418e = interfaceC14239eArr;
        c1400e.getClass();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        this.f35413e = new C14301e(c1410e, c1410e);
        this.f35412e = new IdentityHashMap();
        this.f35417e = new InterfaceC14239e[0];
        this.f35414e = new boolean[interfaceC14239eArr.length];
        for (int i = 0; i < interfaceC14239eArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f35414e[i] = true;
                this.f35418e[i] = new C14852e(interfaceC14239eArr[i], j);
            }
        }
    }

    @Override // defpackage.InterfaceC1145e
    public final void ad(InterfaceC14239e interfaceC14239e) {
        ArrayList arrayList = this.f35411e;
        arrayList.remove(interfaceC14239e);
        if (arrayList.isEmpty()) {
            InterfaceC14239e[] interfaceC14239eArr = this.f35418e;
            int i = 0;
            for (InterfaceC14239e interfaceC14239e2 : interfaceC14239eArr) {
                i += interfaceC14239e2.amazon().ad;
            }
            C16437e[] c16437eArr = new C16437e[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC14239eArr.length; i3++) {
                C12931e amazon = interfaceC14239eArr[i3].amazon();
                int i4 = amazon.ad;
                int i5 = 0;
                while (i5 < i4) {
                    C16437e ad = amazon.ad(i5);
                    int i6 = ad.ad;
                    C16975e[] c16975eArr = new C16975e[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        C16975e c16975e = ad.license[i7];
                        C11445e ad2 = c16975e.ad();
                        String str = c16975e.smaato;
                        InterfaceC14239e[] interfaceC14239eArr2 = interfaceC14239eArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str2 = c16975e.ad;
                        if (str2 == null) {
                            str2 = BuildConfig.FLAVOR;
                        }
                        sb.append(str2);
                        ad2.ad = sb.toString();
                        if (str != null) {
                            ad2.advert = i3 + ":" + str;
                        }
                        c16975eArr[i7] = new C16975e(ad2);
                        i7++;
                        interfaceC14239eArr = interfaceC14239eArr2;
                    }
                    InterfaceC14239e[] interfaceC14239eArr3 = interfaceC14239eArr;
                    C16437e c16437e = new C16437e(i3 + ":" + ad.vip, c16975eArr);
                    this.f35420e.put(c16437e, ad);
                    c16437eArr[i2] = c16437e;
                    i5++;
                    i2++;
                    interfaceC14239eArr = interfaceC14239eArr3;
                }
            }
            this.f35415e = new C12931e(c16437eArr);
            InterfaceC1145e interfaceC1145e = this.f35419e;
            interfaceC1145e.getClass();
            interfaceC1145e.ad(this);
        }
    }

    @Override // defpackage.InterfaceC14585e
    public final long admob() {
        return this.f35413e.admob();
    }

    @Override // defpackage.InterfaceC14239e
    public final long advert() {
        long j = -9223372036854775807L;
        for (InterfaceC14239e interfaceC14239e : this.f35417e) {
            long advert = interfaceC14239e.advert();
            if (advert != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (InterfaceC14239e interfaceC14239e2 : this.f35417e) {
                        if (interfaceC14239e2 == interfaceC14239e) {
                            break;
                        }
                        if (interfaceC14239e2.yandex(advert) != advert) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = advert;
                } else if (advert != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && interfaceC14239e.yandex(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC14239e
    public final C12931e amazon() {
        C12931e c12931e = this.f35415e;
        c12931e.getClass();
        return c12931e;
    }

    @Override // defpackage.InterfaceC14239e
    public final long appmetrica(long j, C1198e c1198e) {
        InterfaceC14239e[] interfaceC14239eArr = this.f35417e;
        return (interfaceC14239eArr.length > 0 ? interfaceC14239eArr[0] : this.f35418e[0]).appmetrica(j, c1198e);
    }

    @Override // defpackage.InterfaceC14239e
    public final void billing() {
        for (InterfaceC14239e interfaceC14239e : this.f35418e) {
            interfaceC14239e.billing();
        }
    }

    @Override // defpackage.InterfaceC14585e
    public final long license() {
        return this.f35413e.license();
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean loadAd(C6576e c6576e) {
        ArrayList arrayList = this.f35411e;
        if (arrayList.isEmpty()) {
            return this.f35413e.loadAd(c6576e);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC14239e) arrayList.get(i)).loadAd(c6576e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC14239e
    public final long metrica(InterfaceC17119e[] interfaceC17119eArr, boolean[] zArr, InterfaceC4543e[] interfaceC4543eArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[interfaceC17119eArr.length];
        int[] iArr3 = new int[interfaceC17119eArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = interfaceC17119eArr.length;
            identityHashMap = this.f35412e;
            if (i2 >= length) {
                break;
            }
            InterfaceC4543e interfaceC4543e = interfaceC4543eArr[i2];
            Integer num = interfaceC4543e == null ? null : (Integer) identityHashMap.get(interfaceC4543e);
            iArr2[i2] = num == null ? -1 : num.intValue();
            InterfaceC17119e interfaceC17119e = interfaceC17119eArr[i2];
            if (interfaceC17119e != null) {
                String str = interfaceC17119e.adcel().vip;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = interfaceC17119eArr.length;
        InterfaceC4543e[] interfaceC4543eArr2 = new InterfaceC4543e[length2];
        InterfaceC4543e[] interfaceC4543eArr3 = new InterfaceC4543e[interfaceC17119eArr.length];
        InterfaceC17119e[] interfaceC17119eArr2 = new InterfaceC17119e[interfaceC17119eArr.length];
        InterfaceC14239e[] interfaceC14239eArr = this.f35418e;
        ArrayList arrayList = new ArrayList(interfaceC14239eArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < interfaceC14239eArr.length) {
            int i4 = i;
            while (i4 < interfaceC17119eArr.length) {
                interfaceC4543eArr3[i4] = iArr2[i4] == i3 ? interfaceC4543eArr[i4] : null;
                if (iArr3[i4] == i3) {
                    InterfaceC17119e interfaceC17119e2 = interfaceC17119eArr[i4];
                    interfaceC17119e2.getClass();
                    iArr = iArr2;
                    C16437e c16437e = (C16437e) this.f35420e.get(interfaceC17119e2.adcel());
                    c16437e.getClass();
                    interfaceC17119eArr2[i4] = new C15680e(interfaceC17119e2, c16437e);
                } else {
                    iArr = iArr2;
                    interfaceC17119eArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            InterfaceC14239e[] interfaceC14239eArr2 = interfaceC14239eArr;
            int i5 = i3;
            long metrica = interfaceC14239eArr2[i3].metrica(interfaceC17119eArr2, zArr, interfaceC4543eArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = metrica;
            } else if (metrica != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < interfaceC17119eArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    InterfaceC4543e interfaceC4543e2 = interfaceC4543eArr3[i6];
                    interfaceC4543e2.getClass();
                    interfaceC4543eArr2[i6] = interfaceC4543eArr3[i6];
                    identityHashMap.put(interfaceC4543e2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    AbstractC2301e.subscription(interfaceC4543eArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(interfaceC14239eArr2[i5]);
            }
            i3 = i5 + 1;
            interfaceC14239eArr = interfaceC14239eArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(interfaceC4543eArr2, i7, interfaceC4543eArr, i7, length2);
        this.f35417e = (InterfaceC14239e[]) arrayList.toArray(new InterfaceC14239e[i7]);
        AbstractList purchase = AbstractC10589e.purchase(new C10612e(14), arrayList);
        this.f35416e.getClass();
        this.f35413e = new C14301e(arrayList, purchase);
        return j2;
    }

    @Override // defpackage.InterfaceC13344e
    public final void mopub(InterfaceC14585e interfaceC14585e) {
        InterfaceC1145e interfaceC1145e = this.f35419e;
        interfaceC1145e.getClass();
        interfaceC1145e.mopub(this);
    }

    @Override // defpackage.InterfaceC14239e
    public final void smaato(InterfaceC1145e interfaceC1145e, long j) {
        this.f35419e = interfaceC1145e;
        ArrayList arrayList = this.f35411e;
        InterfaceC14239e[] interfaceC14239eArr = this.f35418e;
        Collections.addAll(arrayList, interfaceC14239eArr);
        for (InterfaceC14239e interfaceC14239e : interfaceC14239eArr) {
            interfaceC14239e.smaato(this, j);
        }
    }

    @Override // defpackage.InterfaceC14239e
    public final void startapp(long j) {
        for (InterfaceC14239e interfaceC14239e : this.f35417e) {
            interfaceC14239e.startapp(j);
        }
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean subscription() {
        return this.f35413e.subscription();
    }

    @Override // defpackage.InterfaceC14585e
    public final void tapsense(long j) {
        this.f35413e.tapsense(j);
    }

    @Override // defpackage.InterfaceC14239e
    public final long yandex(long j) {
        long yandex = this.f35417e[0].yandex(j);
        int i = 1;
        while (true) {
            InterfaceC14239e[] interfaceC14239eArr = this.f35417e;
            if (i >= interfaceC14239eArr.length) {
                return yandex;
            }
            if (interfaceC14239eArr[i].yandex(yandex) != yandex) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }
}
