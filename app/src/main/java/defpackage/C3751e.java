package defpackage;

import android.util.Rational;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3751e implements Comparator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f8340e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8341e;

    public /* synthetic */ C3751e(int i, Object obj) {
        this.f8341e = i;
        this.f8340e = obj;
    }

    public C3751e(Comparator comparator) {
        this.f8341e = 6;
        this.f8340e = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8341e) {
            case 0:
                Function1 function1 = (Function1) this.f8340e;
                return AbstractC0258e.vip(function1.invoke((AbstractC1186e) obj).toString(), function1.invoke((AbstractC1186e) obj2).toString());
            case 1:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f8340e;
                int compareTo = Boolean.valueOf(materialButton.f812e).compareTo(Boolean.valueOf(materialButton2.f812e));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return compareTo2 != 0 ? compareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            case 2:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.f8340e;
                float floatValue = ((Rational) obj).floatValue();
                float floatValue2 = rational2.floatValue();
                float f = floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
                float floatValue3 = rational.floatValue();
                float floatValue4 = rational2.floatValue();
                return Float.compare(floatValue3 > floatValue4 ? floatValue4 / floatValue3 : floatValue3 / floatValue4, f);
            case 3:
                int compare = ((C11797e) this.f8340e).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                C1622e c1622e = ((C3546e) obj).ad;
                int i = AbstractC7890e.billing(c1622e.f4541e, "*") ? 2 : 0;
                if (AbstractC7890e.billing(c1622e.f4540e, "*")) {
                    i++;
                }
                Integer valueOf = Integer.valueOf(i);
                C1622e c1622e2 = ((C3546e) obj2).ad;
                int i2 = AbstractC7890e.billing(c1622e2.f4541e, "*") ? 2 : 0;
                if (AbstractC7890e.billing(c1622e2.f4540e, "*")) {
                    i2++;
                }
                return AbstractC0258e.vip(valueOf, Integer.valueOf(i2));
            case 4:
                int compare2 = ((C3751e) this.f8340e).compare(obj, obj2);
                return compare2 != 0 ? compare2 : AbstractC0258e.vip(Integer.valueOf(((List) ((C3546e) obj2).ad.f22046e).size()), Integer.valueOf(((List) ((C3546e) obj).ad.f22046e).size()));
            case 5:
                long longValue = ((Number) obj).longValue();
                C14789e c14789e = (C14789e) this.f8340e;
                return AbstractC0258e.vip(Integer.valueOf(c14789e.metrica(longValue)), Integer.valueOf(c14789e.metrica(((Number) obj2).longValue())));
            case 6:
                int compare3 = ((Comparator) this.f8340e).compare(obj, obj2);
                if (compare3 != 0) {
                    return compare3;
                }
                return C13915e.f27579e.compare(((C6071e) obj).metrica, ((C6071e) obj2).metrica);
            case 7:
                int compare4 = ((C3751e) this.f8340e).compare(obj, obj2);
                return compare4 != 0 ? compare4 : AbstractC0258e.vip(Integer.valueOf(((C6071e) obj).purchase), Integer.valueOf(((C6071e) obj2).purchase));
            case 8:
                ArrayList arrayList = ((C2107e) this.f8340e).f5449e;
                Iterator it = ((C12730e) obj).mopub.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer valueOf2 = Integer.valueOf(arrayList.indexOf((C12550e) it.next()));
                while (it.hasNext()) {
                    Integer valueOf3 = Integer.valueOf(arrayList.indexOf((C12550e) it.next()));
                    if (valueOf2.compareTo(valueOf3) > 0) {
                        valueOf2 = valueOf3;
                    }
                }
                Iterator it2 = ((C12730e) obj2).mopub.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer valueOf4 = Integer.valueOf(arrayList.indexOf((C12550e) it2.next()));
                while (it2.hasNext()) {
                    Integer valueOf5 = Integer.valueOf(arrayList.indexOf((C12550e) it2.next()));
                    if (valueOf4.compareTo(valueOf5) > 0) {
                        valueOf4 = valueOf5;
                    }
                }
                return AbstractC0258e.vip(valueOf2, valueOf4);
            default:
                C9639e c9639e = (C9639e) this.f8340e;
                return AbstractC0258e.vip((Comparable) ((HashMap) c9639e.license()).get((C13797e) obj), (Comparable) ((HashMap) c9639e.license()).get((C13797e) obj2));
        }
    }
}
