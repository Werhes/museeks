package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17994e {
    public final ArrayList ad;

    public C17994e(C11913e c11913e, C11913e c11913e2) {
        float f;
        float f2;
        List list;
        Iterator it;
        char c;
        float f3;
        int i;
        int i2;
        float license;
        int i3;
        C6571e c6571e;
        C6571e c6571e2;
        float admob;
        C3847e vip = AbstractC9460e.vip(new C10068e(3), c11913e);
        C3847e vip2 = AbstractC9460e.vip(new C10068e(3), c11913e2);
        List list2 = vip.f8505e;
        List list3 = vip2.f8505e;
        List list4 = AbstractC8533e.ad;
        C1169e license2 = AbstractC6874e.license();
        int size = list2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (((C5573e) list2.get(i5)).vip instanceof C2089e) {
                license2.add(list2.get(i5));
            }
        }
        C1169e metrica = AbstractC6874e.metrica(license2);
        C1169e license3 = AbstractC6874e.license();
        int size2 = list3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (((C5573e) list3.get(i6)).vip instanceof C2089e) {
                license3.add(list3.get(i6));
            }
        }
        C1169e metrica2 = AbstractC6874e.metrica(license3);
        C1169e license4 = AbstractC6874e.license();
        ListIterator listIterator = metrica.listIterator(0);
        while (true) {
            C11045e c11045e = (C11045e) listIterator;
            if (!c11045e.hasNext()) {
                break;
            }
            C5573e c5573e = (C5573e) c11045e.next();
            ListIterator listIterator2 = metrica2.listIterator(0);
            while (true) {
                C11045e c11045e2 = (C11045e) listIterator2;
                if (c11045e2.hasNext()) {
                    C5573e c5573e2 = (C5573e) c11045e2.next();
                    AbstractC8835e abstractC8835e = c5573e.vip;
                    AbstractC8835e abstractC8835e2 = c5573e2.vip;
                    if ((abstractC8835e instanceof C2089e) && (abstractC8835e2 instanceof C2089e) && ((C2089e) abstractC8835e).vip != ((C2089e) abstractC8835e2).vip) {
                        admob = Float.MAX_VALUE;
                    } else {
                        long tapsense = AbstractC11613e.tapsense(AbstractC8533e.ad(abstractC8835e), AbstractC8533e.ad(abstractC8835e2));
                        admob = (AbstractC11613e.admob(tapsense) * AbstractC11613e.admob(tapsense)) + (AbstractC11613e.Signature(tapsense) * AbstractC11613e.Signature(tapsense));
                    }
                    if (admob != Float.MAX_VALUE) {
                        license4.add(new C8060e(admob, c5573e, c5573e2));
                    }
                }
            }
        }
        List m3577else = AbstractC13480e.m3577else(AbstractC6874e.metrica(license4), new C11021e(22));
        char c2 = 2;
        float f4 = 1.0f;
        int i7 = 1;
        if (m3577else.isEmpty()) {
            list = AbstractC8533e.ad;
        } else {
            if (m3577else.size() != 1) {
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = m3577else.iterator();
                while (it2.hasNext()) {
                    C8060e c8060e = (C8060e) it2.next();
                    C5573e c5573e3 = c8060e.vip;
                    C5573e c5573e4 = c8060e.metrica;
                    float f5 = c5573e3.ad;
                    float f6 = c5573e4.ad;
                    if (linkedHashSet.contains(c5573e3) || linkedHashSet2.contains(c5573e4)) {
                        it = it2;
                        c = c2;
                        f3 = f4;
                    } else {
                        c = c2;
                        Float valueOf = Float.valueOf(f5);
                        int size3 = arrayList.size();
                        f3 = f4;
                        AbstractC6874e.amazon(arrayList.size(), size3);
                        int i8 = size3 - i7;
                        int i9 = i4;
                        while (true) {
                            if (i9 > i8) {
                                i = i7;
                                i2 = -(i9 + 1);
                                break;
                            }
                            i2 = (i9 + i8) >>> 1;
                            i = i7;
                            int vip3 = AbstractC0258e.vip((Float) ((C6571e) arrayList.get(i2)).f13544e, valueOf);
                            if (vip3 < 0) {
                                i9 = i2 + 1;
                            } else if (vip3 <= 0) {
                                break;
                            } else {
                                i8 = i2 - 1;
                            }
                            i7 = i;
                        }
                        if (i2 >= 0) {
                            throw new IllegalArgumentException("There can't be two features with the same progress");
                        }
                        int i10 = (-i2) - 1;
                        int size4 = arrayList.size();
                        int i11 = i;
                        if (size4 >= i11) {
                            C6571e c6571e3 = (C6571e) arrayList.get(((i10 + size4) - i11) % size4);
                            float floatValue = ((Number) c6571e3.f13544e).floatValue();
                            float floatValue2 = ((Number) c6571e3.f13543e).floatValue();
                            C6571e c6571e4 = (C6571e) arrayList.get(i10 % size4);
                            it = it2;
                            float floatValue3 = ((Number) c6571e4.f13544e).floatValue();
                            float floatValue4 = ((Number) c6571e4.f13543e).floatValue();
                            if (AbstractC9931e.purchase(f5, floatValue) >= 1.0E-4f && AbstractC9931e.purchase(f5, floatValue3) >= 1.0E-4f && AbstractC9931e.purchase(f6, floatValue2) >= 1.0E-4f && AbstractC9931e.purchase(f6, floatValue4) >= 1.0E-4f) {
                                if (size4 > 1) {
                                    if (floatValue4 >= floatValue2) {
                                        if (floatValue2 <= f6) {
                                            if (f6 > floatValue4) {
                                            }
                                        }
                                    } else if (f6 < floatValue2 && f6 > floatValue4) {
                                    }
                                }
                            }
                        } else {
                            it = it2;
                        }
                        arrayList.add(i10, new C6571e(Float.valueOf(f5), Float.valueOf(f6)));
                        linkedHashSet.add(c5573e3);
                        linkedHashSet2.add(c5573e4);
                    }
                    c2 = c;
                    f4 = f3;
                    it2 = it;
                    i4 = 0;
                    i7 = 1;
                }
                f = f4;
                f2 = 1.0E-4f;
                list = arrayList;
                C6571e[] c6571eArr = (C6571e[]) list.toArray(new C6571e[0]);
                C4294e c4294e = new C4294e((C6571e[]) Arrays.copyOf(c6571eArr, c6571eArr.length));
                C1543e c1543e = c4294e.ad;
                C1543e c1543e2 = c4294e.vip;
                license = AbstractC9931e.license(c1543e, c1543e2, 0.0f);
                ArrayList arrayList2 = vip2.f8506e;
                if (0.0f <= license || license > f) {
                    throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
                }
                if (license < f2) {
                    i3 = 1;
                } else {
                    Iterator it3 = arrayList2.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        C0787e c0787e = (C0787e) it3.next();
                        float f7 = c0787e.metrica;
                        if (license <= c0787e.license && f7 <= license) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    C6571e ad = ((C0787e) arrayList2.get(i12)).ad(license);
                    C0787e c0787e2 = (C0787e) ad.f13544e;
                    ArrayList mopub = AbstractC6874e.mopub(((C0787e) ad.f13543e).ad);
                    int size5 = arrayList2.size();
                    for (int i13 = 1; i13 < size5; i13++) {
                        mopub.add(((C0787e) arrayList2.get((i13 + i12) % arrayList2.size())).ad);
                    }
                    mopub.add(c0787e2.ad);
                    C1543e c1543e3 = new C1543e(arrayList2.size() + 2);
                    int size6 = arrayList2.size() + 2;
                    int i14 = 0;
                    while (i14 < size6) {
                        c1543e3.ad(i14 == 0 ? 0.0f : i14 == arrayList2.size() + 1 ? f : AbstractC4424e.metrica(((C0787e) arrayList2.get(((i12 + i14) - 1) % arrayList2.size())).license - license));
                        i14++;
                    }
                    i3 = 1;
                    C1169e license5 = AbstractC6874e.license();
                    int size7 = list3.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        license5.add(new C5573e(AbstractC4424e.metrica(((C5573e) list3.get(i15)).ad - license), ((C5573e) list3.get(i15)).vip));
                    }
                    vip2 = new C3847e(vip2.f8507e, AbstractC6874e.metrica(license5), mopub, c1543e3);
                }
                ArrayList arrayList3 = new ArrayList();
                C0787e c0787e3 = (C0787e) AbstractC13480e.m3592native(0, vip);
                C0787e c0787e4 = (C0787e) AbstractC13480e.m3592native(0, vip2);
                int i16 = i3;
                int i17 = i16;
                while (c0787e3 != null && c0787e4 != null) {
                    float f8 = i17 == vip.f8506e.size() ? f : c0787e3.license;
                    float license6 = i16 == vip2.f8506e.size() ? f : AbstractC9931e.license(c1543e2, c1543e, AbstractC4424e.metrica(c0787e4.license + license));
                    float min = Math.min(f8, license6);
                    float f9 = 1.0E-6f + min;
                    if (f8 > f9) {
                        c6571e = c0787e3.ad(min);
                    } else {
                        C6571e c6571e5 = new C6571e(c0787e3, AbstractC13480e.m3592native(i17, vip));
                        i17++;
                        c6571e = c6571e5;
                    }
                    C0787e c0787e5 = (C0787e) c6571e.f13544e;
                    c0787e3 = (C0787e) c6571e.f13543e;
                    if (license6 > f9) {
                        c6571e2 = c0787e4.ad(AbstractC4424e.metrica(AbstractC9931e.license(c1543e, c1543e2, min) - license));
                    } else {
                        C6571e c6571e6 = new C6571e(c0787e4, AbstractC13480e.m3592native(i16, vip2));
                        i16++;
                        c6571e2 = c6571e6;
                    }
                    C0787e c0787e6 = (C0787e) c6571e2.f13544e;
                    c0787e4 = (C0787e) c6571e2.f13543e;
                    arrayList3.add(new C6571e(c0787e5.ad, c0787e6.ad));
                }
                if (c0787e3 != null || c0787e4 != null) {
                    throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
                }
                this.ad = arrayList3;
                return;
            }
            C8060e c8060e2 = (C8060e) AbstractC13480e.m3591interface(m3577else);
            float f10 = c8060e2.vip.ad;
            float f11 = c8060e2.metrica.ad;
            list = AbstractC6874e.startapp(new C6571e(Float.valueOf(f10), Float.valueOf(f11)), new C6571e(Float.valueOf((f10 + 0.5f) % 1.0f), Float.valueOf((f11 + 0.5f) % 1.0f)));
        }
        f = 1.0f;
        f2 = 1.0E-4f;
        C6571e[] c6571eArr2 = (C6571e[]) list.toArray(new C6571e[0]);
        C4294e c4294e2 = new C4294e((C6571e[]) Arrays.copyOf(c6571eArr2, c6571eArr2.length));
        C1543e c1543e4 = c4294e2.ad;
        C1543e c1543e22 = c4294e2.vip;
        license = AbstractC9931e.license(c1543e4, c1543e22, 0.0f);
        ArrayList arrayList22 = vip2.f8506e;
        if (0.0f <= license) {
        }
        throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
    }
}
