package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6227e {
    public static final List ad(C10068e c10068e, int i, int i2, ArrayList arrayList, C12452e c12452e, int i3, int i4, int i5, Function1 function1) {
        int i6;
        C12452e c12452e2;
        int i7;
        long j;
        Object obj;
        int i8;
        if (c10068e == null || arrayList.isEmpty() || (i6 = c12452e.vip) == 0) {
            return C13664e.f27089e;
        }
        int i9 = -1;
        int i10 = 0;
        if (i2 - i < 0 || i6 == 0) {
            c12452e2 = AbstractC13570e.ad;
        } else {
            C15926e admob = AbstractC3062e.admob(0, i6);
            int i11 = admob.f22523e;
            int i12 = admob.f22522e;
            int i13 = -1;
            if (i11 <= i12) {
                while (c12452e.metrica(i11) <= i) {
                    i13 = c12452e.metrica(i11);
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                }
            }
            if (i13 == -1) {
                c12452e2 = AbstractC13570e.ad;
            } else {
                C12452e c12452e3 = AbstractC13570e.ad;
                c12452e2 = new C12452e(1);
                c12452e2.ad(i13);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj2 = arrayList.get(i14);
            int index = ((InterfaceC8848e) obj2).getIndex();
            int[] iArr = c12452e.ad;
            int i15 = c12452e.vip;
            int i16 = 0;
            while (true) {
                if (i16 >= i15) {
                    break;
                }
                if (iArr[i16] == index) {
                    arrayList3.add(obj2);
                    break;
                }
                i16++;
            }
        }
        int[] iArr2 = c12452e2.ad;
        int i17 = c12452e2.vip;
        int i18 = 0;
        while (i18 < i17) {
            int i19 = iArr2[i18];
            Iterator it = arrayList.iterator();
            int i20 = i10;
            while (true) {
                if (!it.hasNext()) {
                    i20 = i9;
                    break;
                }
                if (((InterfaceC8848e) it.next()).getIndex() == i19) {
                    break;
                }
                i20++;
            }
            InterfaceC8848e interfaceC8848e = i20 == i9 ? (InterfaceC8848e) function1.invoke(Integer.valueOf(i19)) : (InterfaceC8848e) arrayList.remove(i20);
            int billing = interfaceC8848e.billing();
            long j2 = 4294967295L;
            if (i20 == i9) {
                i7 = Integer.MIN_VALUE;
            } else {
                long smaato = interfaceC8848e.smaato(i10);
                i7 = (int) (interfaceC8848e.mopub() ? smaato & 4294967295L : smaato >> 32);
            }
            int size2 = arrayList3.size();
            int i21 = 0;
            while (true) {
                if (i21 >= size2) {
                    j = j2;
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i21);
                j = j2;
                if (((InterfaceC8848e) obj).getIndex() != i19) {
                    break;
                }
                i21++;
                j2 = j;
            }
            InterfaceC8848e interfaceC8848e2 = (InterfaceC8848e) obj;
            if (interfaceC8848e2 != null) {
                long smaato2 = interfaceC8848e2.smaato(0);
                i8 = (int) (interfaceC8848e2.mopub() ? smaato2 & j : smaato2 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int max = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                max = Math.min(max, i8 - billing);
            }
            interfaceC8848e.advert();
            interfaceC8848e.purchase(max, 0, i4, i5);
            arrayList2.add(interfaceC8848e);
            i18++;
            i10 = 0;
            i9 = -1;
        }
        return arrayList2;
    }

    public static int appmetrica(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, InterfaceC10481e interfaceC10481e, EnumC17426e enumC17426e, C11644e c11644e, boolean z, InterfaceC8642e interfaceC8642e, C15274e c15274e, C17535e c17535e) {
        float f = AbstractC6461e.ad;
        EnumC17426e enumC17426e2 = EnumC17426e.f34146e;
        C0115e c0115e = C0115e.f1276e;
        return interfaceC12864e.premium(enumC17426e == enumC17426e2 ? AbstractC12447e.vip(c0115e, C5100e.metrica) : AbstractC12447e.vip(c0115e, C5100e.vip)).premium(new C11169e(c11644e, c17535e, interfaceC8642e, c15274e, enumC17426e, interfaceC10481e, z, false));
    }

    public static C1622e metrica(String str) {
        if (AbstractC5304e.m1866native(str)) {
            return C1622e.f4539e;
        }
        C16855e c16855e = (C16855e) AbstractC13480e.m3570break(AbstractC16082e.vip(str));
        String str2 = c16855e.ad;
        List list = c16855e.vip;
        int m1865interface = AbstractC5304e.m1865interface(str2, '/', 0, 6);
        if (m1865interface == -1) {
            if (AbstractC7890e.billing(AbstractC5304e.m1855const(str2).toString(), "*")) {
                return C1622e.f4539e;
            }
            throw new C18445e(str);
        }
        String obj = AbstractC5304e.m1855const(AbstractC5304e.m1860finally(m1865interface, str2)).toString();
        if (obj.length() == 0) {
            throw new C18445e(str);
        }
        String obj2 = AbstractC5304e.m1855const(str2.substring(m1865interface + 1)).toString();
        if (AbstractC5304e.isPro(obj, ' ') || AbstractC5304e.isPro(obj2, ' ')) {
            throw new C18445e(str);
        }
        if (obj2.length() == 0 || AbstractC5304e.isPro(obj2, '/')) {
            throw new C18445e(str);
        }
        return new C1622e(obj, obj2, list);
    }
}
