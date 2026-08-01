package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5273e implements Iterable, InterfaceC2268e, InterfaceC11320e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final TreeMap f11361e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final TreeMap f11362e;

    public C5273e() {
        this.f11362e = new TreeMap();
        this.f11361e = new TreeMap();
    }

    public C5273e(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                isVip(i, (InterfaceC2268e) list.get(i));
            }
        }
    }

    public final int Signature() {
        TreeMap treeMap = this.f11362e;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    @Override // defpackage.InterfaceC11320e
    public final void adcel(String str, InterfaceC2268e interfaceC2268e) {
        TreeMap treeMap = this.f11361e;
        if (interfaceC2268e == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC2268e);
        }
    }

    public final InterfaceC2268e admob(int i) {
        InterfaceC2268e interfaceC2268e;
        if (i < Signature()) {
            return (!inmobi(i) || (interfaceC2268e = (InterfaceC2268e) this.f11362e.get(Integer.valueOf(i))) == null) ? InterfaceC2268e.f5755e : interfaceC2268e;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void ads(int i) {
        TreeMap treeMap = this.f11362e;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == intValue) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            treeMap.put(valueOf, InterfaceC2268e.f5755e);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i);
            InterfaceC2268e interfaceC2268e = (InterfaceC2268e) treeMap.get(valueOf2);
            if (interfaceC2268e != null) {
                treeMap.put(Integer.valueOf(i - 1), interfaceC2268e);
                treeMap.remove(valueOf2);
            }
        }
    }

    @Override // defpackage.InterfaceC11320e
    public final boolean advert(String str) {
        return "length".equals(str) || this.f11361e.containsKey(str);
    }

    @Override // defpackage.InterfaceC2268e
    public final Iterator appmetrica() {
        return new C11322e(this, this.f11362e.keySet().iterator(), this.f11361e.keySet().iterator());
    }

    @Override // defpackage.InterfaceC11320e
    public final InterfaceC2268e billing(String str) {
        InterfaceC2268e interfaceC2268e;
        return "length".equals(str) ? new C6020e(Double.valueOf(Signature())) : (!advert(str) || (interfaceC2268e = (InterfaceC2268e) this.f11361e.get(str)) == null) ? InterfaceC2268e.f5755e : interfaceC2268e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5273e)) {
            return false;
        }
        C5273e c5273e = (C5273e) obj;
        if (Signature() != c5273e.Signature()) {
            return false;
        }
        TreeMap treeMap = this.f11362e;
        if (treeMap.isEmpty()) {
            return c5273e.f11362e.isEmpty();
        }
        for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
            if (!admob(intValue).equals(c5273e.admob(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f11362e.hashCode() * 31;
    }

    public final boolean inmobi(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f11362e;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(AbstractC8647e.isPro(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
    }

    public final void isVip(int i, InterfaceC2268e interfaceC2268e) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC8647e.isPro(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        }
        TreeMap treeMap = this.f11362e;
        if (interfaceC2268e == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), interfaceC2268e);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C8146e(2, this);
    }

    public final Iterator loadAd() {
        return this.f11362e.keySet().iterator();
    }

    public final String premium(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f11362e.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? BuildConfig.FLAVOR : str;
                if (i >= Signature()) {
                    break;
                }
                InterfaceC2268e admob = admob(i);
                sb.append(str2);
                if (!(admob instanceof C1058e) && !(admob instanceof C12157e)) {
                    sb.append(admob.startapp());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e5, code lost:
    
        if (defpackage.AbstractC4520e.loadAd(r7, r2, (defpackage.C1105e) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).Signature() == r7.Signature()) goto L169;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0126. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f7  */
    @Override // defpackage.InterfaceC2268e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.InterfaceC2268e remoteconfig(java.lang.String r38, defpackage.C11467e r39, java.util.ArrayList r40) {
        /*
            Method dump skipped, instructions count: 2200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5273e.remoteconfig(java.lang.String, eِؒۜ, java.util.ArrayList):eٜؓۨ");
    }

    public final List smaato() {
        ArrayList arrayList = new ArrayList(Signature());
        for (int i = 0; i < Signature(); i++) {
            arrayList.add(admob(i));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC2268e
    public final String startapp() {
        return premium(",");
    }

    @Override // defpackage.InterfaceC2268e
    public final Double subscription() {
        TreeMap treeMap = this.f11362e;
        return treeMap.size() == 1 ? admob(0).subscription() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e tapsense() {
        C5273e c5273e = new C5273e();
        for (Map.Entry entry : this.f11362e.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC11320e;
            TreeMap treeMap = c5273e.f11362e;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC2268e) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC2268e) entry.getValue()).tapsense());
            }
        }
        return c5273e;
    }

    public final String toString() {
        return premium(",");
    }

    @Override // defpackage.InterfaceC2268e
    public final Boolean yandex() {
        return Boolean.TRUE;
    }
}
