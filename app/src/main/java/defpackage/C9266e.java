package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9266e {
    public static final HashMap metrica;
    public static final HashMap vip;
    public final HashMap ad = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        vip = hashMap;
        hashMap.put(C18525e.yandex, Range.create(2160, 4319));
        hashMap.put(C18525e.billing, Range.create(1080, 1439));
        hashMap.put(C18525e.purchase, Range.create(720, 1079));
        hashMap.put(C18525e.appmetrica, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        metrica = hashMap2;
        hashMap2.put(0, AbstractC1146e.ad);
        hashMap2.put(1, AbstractC1146e.metrica);
    }

    public C9266e(List list, HashMap hashMap) {
        HashMap hashMap2;
        Integer num;
        C18525e c18525e;
        HashMap hashMap3 = vip;
        Iterator it = hashMap3.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap2 = metrica;
            if (!hasNext) {
                break;
            }
            C18525e c18525e2 = (C18525e) it.next();
            this.ad.put(new C14283e(c18525e2, -1), new ArrayList());
            Iterator it2 = hashMap2.keySet().iterator();
            while (it2.hasNext()) {
                this.ad.put(new C14283e(c18525e2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list2 = (List) this.ad.get(new C14283e((C18525e) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = hashMap3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    c18525e = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    c18525e = (C18525e) entry2.getKey();
                    break;
                }
            }
            if (c18525e != null) {
                Iterator it5 = hashMap2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (AbstractC1146e.ad(size, (Rational) entry3.getValue(), AbstractC2084e.vip)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.ad.get(new C14283e(c18525e, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.ad.entrySet()) {
            Size size2 = (Size) hashMap.get(((C14283e) entry4.getKey()).ad);
            if (size2 != null) {
                Size size3 = AbstractC2084e.ad;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: eٍْۘ
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int ad = AbstractC2084e.ad((Size) obj);
                        int i = height;
                        return Math.abs(ad - i) - Math.abs(AbstractC2084e.ad((Size) obj2) - i);
                    }
                });
            }
        }
    }
}
