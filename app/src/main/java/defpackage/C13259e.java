package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13259e implements InterfaceC5142e {
    public final List ad;
    public final boolean metrica;
    public final int vip;

    public C13259e(List list) {
        boolean z;
        boolean z2;
        int i;
        this.ad = list;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((AbstractC1675e) it.next()).ad;
            if (num != null) {
                i3 = num.intValue();
            }
            i2 += i3;
        }
        this.vip = i2;
        List list2 = this.ad;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((AbstractC1675e) it2.next()).ad == null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.metrica = z;
        List list3 = this.ad;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer num2 = ((AbstractC1675e) it3.next()).ad;
                if (!((num2 != null ? num2.intValue() : Alert.DURATION_SHOW_INDEFINITELY) > 0)) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        if (!z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List list4 = this.ad;
        if ((list4 != null) && list4.isEmpty()) {
            i = 0;
        } else {
            Iterator it4 = list4.iterator();
            i = 0;
            while (it4.hasNext()) {
                if ((((AbstractC1675e) it4.next()).ad == null) && (i = i + 1) < 0) {
                    AbstractC6874e.loadAd();
                    throw null;
                }
            }
        }
        if (i <= 1) {
            return;
        }
        List list5 = this.ad;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((AbstractC1675e) obj).ad == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((AbstractC1675e) it5.next()).vip);
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eؚؖٞ, java.lang.Object] */
    @Override // defpackage.InterfaceC5142e
    public final Object ad(InterfaceC5374e interfaceC5374e, CharSequence charSequence, int i) {
        int i2 = this.vip;
        if (i + i2 > charSequence.length()) {
            return new C7883e(i, new C13465e(4, this));
        }
        ?? obj = new Object();
        while (obj.f8852e + i < charSequence.length() && AbstractC11613e.subscription(charSequence.charAt(obj.f8852e + i))) {
            obj.f8852e++;
        }
        if (obj.f8852e < i2) {
            return new C7883e(i, new C1708e(obj, this, 19));
        }
        List list = this.ad;
        int size = list.size();
        final int i3 = 0;
        while (i3 < size) {
            Integer num = ((AbstractC1675e) list.get(i3)).ad;
            int intValue = (num != null ? num.intValue() : (obj.f8852e - i2) + 1) + i;
            final InterfaceC10459e ad = ((AbstractC1675e) list.get(i3)).ad(interfaceC5374e, charSequence, i, intValue);
            if (ad != null) {
                final String obj2 = charSequence.subSequence(i, intValue).toString();
                return new C7883e(i, new Function0() { // from class: eٗٞٝ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        StringBuilder applovin = AbstractC8703e.applovin("Can not interpret the string '", obj2, "' as ");
                        applovin.append(((AbstractC1675e) this.ad.get(i3)).vip);
                        applovin.append(": ");
                        applovin.append(ad.signatures());
                        return applovin.toString();
                    }
                });
            }
            i3++;
            i = intValue;
        }
        return Integer.valueOf(i);
    }

    public final String toString() {
        return vip();
    }

    public final String vip() {
        List<AbstractC1675e> list = this.ad;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        for (AbstractC1675e abstractC1675e : list) {
            StringBuilder sb = new StringBuilder();
            Integer num = abstractC1675e.ad;
            sb.append(num == null ? "at least one digit" : num + " digits");
            sb.append(" for ");
            sb.append(abstractC1675e.vip);
            arrayList.add(sb.toString());
        }
        boolean z = this.metrica;
        int i = this.vip;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }
}
