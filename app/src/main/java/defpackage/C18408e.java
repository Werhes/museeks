package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18408e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4034e f36091e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36092e;

    public /* synthetic */ C18408e(C4034e c4034e, int i) {
        this.f36092e = i;
        this.f36091e = c4034e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [eؚٓٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [int] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC0043e interfaceC0043e;
        C0763e c0763e;
        int i;
        ArrayList arrayList;
        int i2;
        int[] iArr;
        int i3;
        C12850e c12850e;
        boolean z;
        long j;
        int i4;
        InterfaceC18435e interfaceC18435e;
        C9106e c9106e;
        ArrayList arrayList2;
        int i5;
        int i6;
        int i7 = this.f36092e;
        C4034e c4034e = this.f36091e;
        switch (i7) {
            case 0:
                C2152e c2152e = (C2152e) c4034e.admob.getValue();
                return new C2152e(c2152e != null ? c2152e.ad : 9205357640488583168L);
            case 1:
                C2152e c2152e2 = (C2152e) c4034e.Signature.getValue();
                return new C2152e(c2152e2 != null ? c2152e2.ad : 9205357640488583168L);
            case 2:
                c4034e.startapp();
                return Unit.INSTANCE;
            case 3:
                C0971e c0971e = c4034e.ad;
                c4034e.smaato.getValue();
                Unit unit = Unit.INSTANCE;
                if (c4034e.purchase() != null && (interfaceC0043e = c4034e.advert) != null && interfaceC0043e.billing()) {
                    ArrayList metrica = c0971e.metrica(c4034e.adcel());
                    ArrayList arrayList3 = new ArrayList(metrica.size());
                    int size = metrica.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        C12850e c12850e2 = (C12850e) metrica.get(i8);
                        C9106e c9106e2 = (C9106e) c0971e.ad().appmetrica(c12850e2.ad);
                        C6571e c6571e = c9106e2 != null ? new C6571e(c12850e2, c9106e2) : null;
                        if (c6571e != null) {
                            arrayList3.add(c6571e);
                        }
                    }
                    int size2 = arrayList3.size();
                    ArrayList arrayList4 = arrayList3;
                    arrayList4 = arrayList3;
                    if (size2 != 0 && size2 != 1) {
                        arrayList4 = AbstractC6874e.startapp(AbstractC13480e.m3591interface(arrayList3), AbstractC13480e.m3570break(arrayList3));
                    }
                    if (!arrayList4.isEmpty()) {
                        boolean isEmpty = arrayList4.isEmpty();
                        C0763e c0763e2 = AbstractC14520e.ad;
                        if (isEmpty) {
                            c0763e = c0763e2;
                        } else {
                            int size3 = arrayList4.size();
                            int i9 = 0;
                            float f = Float.POSITIVE_INFINITY;
                            float f2 = Float.POSITIVE_INFINITY;
                            float f3 = Float.NEGATIVE_INFINITY;
                            float f4 = Float.NEGATIVE_INFINITY;
                            ArrayList arrayList5 = arrayList4;
                            while (i9 < size3) {
                                C6571e c6571e2 = (C6571e) arrayList5.get(i9);
                                C12850e c12850e3 = (C12850e) c6571e2.f13544e;
                                C9106e c9106e3 = (C9106e) c6571e2.f13543e;
                                int i10 = c9106e3.ad.vip;
                                int i11 = c9106e3.vip.vip;
                                if (i10 != i11) {
                                    boolean z2 = r7;
                                    InterfaceC0043e metrica2 = c12850e3.metrica();
                                    if (metrica2 != null) {
                                        int min = Math.min(i10, i11);
                                        int max = Math.max(i10, i11) - r8;
                                        if (min == max) {
                                            iArr = new int[r8];
                                            iArr[z2 ? 1 : 0] = min;
                                            i2 = r8;
                                        } else {
                                            i2 = r8;
                                            int[] iArr2 = new int[2];
                                            iArr2[z2 ? 1 : 0] = min;
                                            iArr2[i2] = max;
                                            iArr = iArr2;
                                        }
                                        int length = iArr.length;
                                        i = size3;
                                        int[] iArr3 = iArr;
                                        int i12 = z2 ? 1 : 0;
                                        float f5 = Float.POSITIVE_INFINITY;
                                        float f6 = Float.NEGATIVE_INFINITY;
                                        float f7 = Float.NEGATIVE_INFINITY;
                                        float f8 = Float.POSITIVE_INFINITY;
                                        ArrayList arrayList6 = arrayList5;
                                        while (i12 < length) {
                                            int i13 = length;
                                            int i14 = iArr3[i12];
                                            ArrayList arrayList7 = arrayList6;
                                            C12476e c12476e = (C12476e) c12850e3.metrica.invoke();
                                            C0763e c0763e3 = C0763e.appmetrica;
                                            if (c12476e == null) {
                                                i3 = i12;
                                                c12850e = c12850e3;
                                            } else {
                                                i3 = i12;
                                                int length2 = c12476e.ad.ad.f20850e.length();
                                                c12850e = c12850e3;
                                                if (length2 >= i2) {
                                                    ?? r9 = z2;
                                                    c0763e3 = c12476e.vip(AbstractC3062e.metrica(i14, r9, length2 - 1));
                                                    z = r9;
                                                    C0763e c0763e4 = c0763e3;
                                                    f8 = Math.min(f8, c0763e4.ad);
                                                    f5 = Math.min(f5, c0763e4.vip);
                                                    f6 = Math.max(f6, c0763e4.metrica);
                                                    f7 = Math.max(f7, c0763e4.license);
                                                    i12 = i3 + 1;
                                                    z2 = z;
                                                    length = i13;
                                                    arrayList6 = arrayList7;
                                                    c12850e3 = c12850e;
                                                    i2 = 1;
                                                }
                                            }
                                            z = z2;
                                            C0763e c0763e42 = c0763e3;
                                            f8 = Math.min(f8, c0763e42.ad);
                                            f5 = Math.min(f5, c0763e42.vip);
                                            f6 = Math.max(f6, c0763e42.metrica);
                                            f7 = Math.max(f7, c0763e42.license);
                                            i12 = i3 + 1;
                                            z2 = z;
                                            length = i13;
                                            arrayList6 = arrayList7;
                                            c12850e3 = c12850e;
                                            i2 = 1;
                                        }
                                        arrayList = arrayList6;
                                        long floatToRawIntBits = (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
                                        long floatToRawIntBits2 = Float.floatToRawIntBits(f6);
                                        long mo207class = interfaceC0043e.mo207class(metrica2, floatToRawIntBits);
                                        long mo207class2 = interfaceC0043e.mo207class(metrica2, (Float.floatToRawIntBits(f7) & 4294967295L) | (floatToRawIntBits2 << 32));
                                        f = Math.min(f, Float.intBitsToFloat((int) (mo207class >> 32)));
                                        f2 = Math.min(f2, Float.intBitsToFloat((int) (mo207class & 4294967295L)));
                                        f3 = Math.max(f3, Float.intBitsToFloat((int) (mo207class2 >> 32)));
                                        f4 = Math.max(f4, Float.intBitsToFloat((int) (mo207class2 & 4294967295L)));
                                        i9++;
                                        size3 = i;
                                        arrayList5 = arrayList;
                                        r7 = false;
                                        r8 = 1;
                                    }
                                }
                                i = size3;
                                arrayList = arrayList5;
                                i9++;
                                size3 = i;
                                arrayList5 = arrayList;
                                r7 = false;
                                r8 = 1;
                            }
                            c0763e = new C0763e(f, f2, f3, f4);
                        }
                        if (!c0763e.equals(c0763e2)) {
                            C0763e adcel = AbstractC14520e.startapp(interfaceC0043e).adcel(c0763e);
                            if (adcel.metrica - adcel.ad >= 0.0f && adcel.license - adcel.vip >= 0.0f) {
                                C0763e amazon = adcel.amazon(interfaceC0043e.mo211this(0L));
                                return C0763e.vip(amazon, 0.0f, 0.0f, (AbstractC1163e.vip * 4) + amazon.license, 7);
                            }
                        }
                    }
                }
                return null;
            case 4:
                C4034e c4034e2 = this.f36091e;
                c4034e2.inmobi = true;
                c4034e2.loadAd();
                c4034e2.subscription.setValue(null);
                c4034e2.remoteconfig.setValue(null);
                if (c4034e2.signatures && c4034e2.yandex()) {
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    ?? obj3 = new Object();
                    C0971e c0971e2 = c4034e2.ad;
                    ArrayList metrica3 = c0971e2.metrica(c4034e2.adcel());
                    ListIterator listIterator = metrica3.listIterator(metrica3.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            j = 0;
                            C9106e c9106e4 = (C9106e) c0971e2.ad().appmetrica(((C12850e) listIterator.previous()).ad);
                            if (c9106e4 != null && c9106e4.ad.vip != c9106e4.vip.vip) {
                                i4 = listIterator.nextIndex();
                            }
                        } else {
                            j = 0;
                            i4 = -1;
                        }
                    }
                    if (i4 != -1) {
                        int size4 = metrica3.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size4) {
                                C12850e c12850e4 = (C12850e) metrica3.get(i15);
                                C9106e c9106e5 = (C9106e) c0971e2.ad().appmetrica(c12850e4.ad);
                                if (c9106e5 != null) {
                                    C10566e license = c12850e4.license();
                                    long metrica4 = AbstractC9262e.metrica(c9106e5.ad.vip, c9106e5.vip.vip);
                                    r8 = i15 < i4 ? 0 : 1;
                                    long j2 = c12850e4.ad;
                                    if (r8 != 0) {
                                        obj.f9318e = license;
                                        obj2.f9318e = new C12347e(metrica4);
                                        obj3.f14622e = j2;
                                    }
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    Object obj4 = obj.f9318e;
                    if (obj4 != null && obj2.f9318e != null && obj3.f14622e != j && ((CharSequence) obj4).length() > 0 && (interfaceC18435e = c4034e2.tapsense) != null) {
                        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C7914e(c4034e2, obj, obj2, obj3, null, 2), 3);
                    }
                }
                c4034e2.signatures = false;
                return Unit.INSTANCE;
            case 5:
                c4034e.vip();
                if (c4034e.billing()) {
                    c4034e.startapp();
                }
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf((c4034e.inmobi && c4034e.billing()) ? false : true);
            default:
                C0971e c0971e3 = c4034e.ad;
                ArrayList metrica5 = c0971e3.metrica(c4034e.adcel());
                if (!metrica5.isEmpty()) {
                    C16529e c16529e = AbstractC2800e.ad;
                    C16529e c16529e2 = new C16529e();
                    int size5 = metrica5.size();
                    int i16 = 0;
                    C9106e c9106e6 = null;
                    C9106e c9106e7 = null;
                    while (i16 < size5) {
                        C12850e c12850e5 = (C12850e) metrica5.get(i16);
                        long j3 = c12850e5.ad;
                        C12476e c12476e2 = (C12476e) c12850e5.metrica.invoke();
                        if (c12476e2 == null) {
                            arrayList2 = metrica5;
                            i5 = size5;
                            i6 = i16;
                            c9106e = null;
                        } else {
                            int length3 = c12476e2.ad.ad.f20850e.length();
                            arrayList2 = metrica5;
                            i5 = size5;
                            i6 = i16;
                            c9106e = new C9106e(new C14980e(c12476e2.ad(0), j3, 0), new C14980e(c12476e2.ad(Math.max(length3 - 1, 0)), j3, length3), false);
                        }
                        if (c9106e != null) {
                            if (c9106e6 == null) {
                                c9106e6 = c9106e;
                            }
                            long j4 = c12850e5.ad;
                            int metrica6 = c16529e2.metrica(j4);
                            Object[] objArr = c16529e2.metrica;
                            Object obj5 = objArr[metrica6];
                            c16529e2.vip[metrica6] = j4;
                            objArr[metrica6] = c9106e;
                            c9106e7 = c9106e;
                        }
                        i16 = i6 + 1;
                        metrica5 = arrayList2;
                        size5 = i5;
                    }
                    if (c16529e2.appmetrica != 0) {
                        if (c9106e6 != c9106e7) {
                            c9106e6 = new C9106e(c9106e6.ad, c9106e7.vip, false);
                        }
                        c0971e3.mopub.setValue(c16529e2);
                        c4034e.license.invoke(c9106e6);
                        c4034e.pro = null;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
