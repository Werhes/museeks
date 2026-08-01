package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092e {
    public static final double yandex = Math.sqrt(2.3703703703703702d);
    public final Size ad;
    public final C6148e appmetrica;
    public final HashMap billing;
    public final HashSet license;
    public final Rational metrica;
    public final InterfaceC12424e purchase;
    public final Rational vip;

    public C0092e(InterfaceC2881e interfaceC2881e, HashSet hashSet) {
        Size purchase = AbstractC8261e.purchase(interfaceC2881e.subscription().mopub());
        InterfaceC12424e subscription = interfaceC2881e.subscription();
        C6148e c6148e = new C6148e(subscription, purchase);
        this.billing = new HashMap();
        this.ad = purchase;
        Rational rational = ((double) purchase.getWidth()) / ((double) purchase.getHeight()) > yandex ? AbstractC1146e.metrica : AbstractC1146e.ad;
        AbstractC9464e.yandex("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + purchase + ") is " + rational + ".");
        this.vip = rational;
        Rational rational2 = AbstractC1146e.ad;
        if (rational.equals(rational2)) {
            rational2 = AbstractC1146e.metrica;
        } else if (!rational.equals(AbstractC1146e.metrica)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.metrica = rational2;
        this.purchase = subscription;
        this.license = hashSet;
        this.appmetrica = c6148e;
    }

    public static Rect ad(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational yandex2 = yandex(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational yandex3 = yandex(size);
        if (yandex2.floatValue() == yandex3.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (yandex2.floatValue() > yandex3.floatValue()) {
                float f = width;
                float floatValue = f / yandex2.floatValue();
                float f2 = (height - floatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, floatValue + f2);
            } else {
                float f3 = height;
                float floatValue2 = yandex2.floatValue() * f3;
                float f4 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, floatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean license(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational yandex(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final boolean appmetrica(Rational rational, Size size) {
        Rational rational2 = this.vip;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = AbstractC1146e.ad;
        Size size2 = AbstractC2084e.metrica;
        if (AbstractC1146e.ad(size, rational, size2)) {
            return false;
        }
        float floatValue = rational2.floatValue();
        float floatValue2 = rational.floatValue();
        Rational rational4 = AbstractC1146e.ad;
        if (!AbstractC1146e.ad(size, rational4, size2)) {
            rational4 = AbstractC1146e.metrica;
            if (!AbstractC1146e.ad(size, rational4, size2)) {
                rational4 = yandex(size);
            }
        }
        float floatValue3 = rational4.floatValue();
        if (floatValue == floatValue2 || floatValue2 == floatValue3) {
            return false;
        }
        return floatValue > floatValue2 ? floatValue2 < floatValue3 : floatValue2 > floatValue3;
    }

    public final ArrayList billing(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = AbstractC1146e.ad;
            if (AbstractC1146e.ad(size, rational, AbstractC2084e.metrica)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new C14912e(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.license.iterator();
        while (it2.hasNext()) {
            List<Size> metrica = metrica((InterfaceC12438e) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : metrica) {
                    if (!appmetrica(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                metrica = arrayList3;
            }
            if (metrica.isEmpty()) {
                return new ArrayList();
            }
            if (metrica.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = metrica.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!license((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (metrica.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = metrica.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (license((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }

    public final List metrica(InterfaceC12438e interfaceC12438e) {
        Rational rational;
        if (!this.license.contains(interfaceC12438e)) {
            throw new IllegalArgumentException("Invalid child config: " + interfaceC12438e);
        }
        HashMap hashMap = this.billing;
        if (hashMap.containsKey(interfaceC12438e)) {
            List list = (List) hashMap.get(interfaceC12438e);
            Objects.requireNonNull(list);
            return list;
        }
        List yandex2 = this.appmetrica.yandex(interfaceC12438e);
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) yandex2).iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = hashMap2.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it2.next();
                Rational rational2 = AbstractC1146e.ad;
                if (AbstractC1146e.ad(size, rational, AbstractC2084e.metrica)) {
                    break;
                }
            }
            if (rational != null) {
                Size size2 = (Size) hashMap2.get(rational);
                Objects.requireNonNull(size2);
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = yandex(size);
            }
            arrayList.add(size);
            hashMap2.put(rational, size);
        }
        hashMap.put(interfaceC12438e, arrayList);
        return arrayList;
    }

    public final ArrayList purchase(List list, boolean z) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = AbstractC1146e.ad;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = AbstractC1146e.metrica;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list2 = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (AbstractC1146e.ad(size, rational3, AbstractC2084e.metrica)) {
                        list2 = (List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational yandex2 = yandex(size);
                    arrayList.add(yandex2);
                    hashMap.put(yandex2, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new C3751e(2, yandex(this.ad)));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(AbstractC1146e.metrica) && !rational4.equals(AbstractC1146e.ad)) {
                List list3 = (List) hashMap.get(rational4);
                Objects.requireNonNull(list3);
                arrayList3.addAll(billing(rational4, list3, z));
            }
        }
        return arrayList3;
    }

    public final C0516e vip(InterfaceC12438e interfaceC12438e, Rect rect, int i, boolean z) {
        boolean z2;
        Size size;
        Size size2;
        Pair create;
        if (AbstractC8261e.metrica(i)) {
            z2 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z2 = false;
        }
        if (z) {
            Size purchase = AbstractC8261e.purchase(rect);
            Iterator it = metrica(interfaceC12438e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    create = Pair.create(purchase, purchase);
                    break;
                }
                Size size3 = (Size) it.next();
                Size purchase2 = AbstractC8261e.purchase(ad(size3, purchase));
                if (!license(purchase2, purchase)) {
                    create = Pair.create(size3, purchase2);
                    break;
                }
            }
            size = (Size) create.first;
            size2 = (Size) create.second;
        } else {
            Size purchase3 = AbstractC8261e.purchase(rect);
            List metrica = metrica(interfaceC12438e);
            Iterator it2 = metrica.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = metrica.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = purchase3;
                            break;
                        }
                        size = (Size) it3.next();
                        if (!license(size, purchase3)) {
                            break;
                        }
                    }
                } else {
                    Size size4 = (Size) it2.next();
                    Rational rational = AbstractC1146e.ad;
                    Size size5 = AbstractC2084e.metrica;
                    if (!AbstractC1146e.ad(purchase3, rational, size5)) {
                        rational = AbstractC1146e.metrica;
                        if (!AbstractC1146e.ad(purchase3, rational, size5)) {
                            rational = yandex(purchase3);
                        }
                    }
                    if (!appmetrica(rational, size4) && !license(size4, purchase3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = ad(purchase3, size);
            size2 = size;
        }
        return z2 ? new C0516e(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size) : new C0516e(rect, size2, size);
    }
}
