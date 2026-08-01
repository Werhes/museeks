package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* renamed from: eٍٟٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9648e implements Serializable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ArrayList f19120e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f19121e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f19122e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f19123e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final TreeMap f19124e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public transient int f19125e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f19126e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f19127e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final transient C11467e f19128e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Stack f19129e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final TreeMap f19130e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9648e(defpackage.C0368e r5, byte[] r6, byte[] r7, defpackage.C16450e r8) {
        /*
            r4 = this;
            eِؒۜ r0 = new eِؒۜ
            eُؙۙ r1 = r5.billing
            r0.<init>(r1)
            int r1 = r5.vip
            int r5 = r5.metrica
            r2 = 1
            int r3 = r2 << r1
            int r3 = r3 - r2
            r4.<init>(r0, r1, r5, r3)
            r4.ad(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9648e.<init>(eٕؑ٘, byte[], byte[], eّٖۘ):void");
    }

    public C9648e(C9648e c9648e) {
        this.f19128e = new C11467e((C11226e) c9648e.f19128e.f23072e);
        this.f19123e = c9648e.f19123e;
        this.f19126e = c9648e.f19126e;
        ArrayList arrayList = new ArrayList();
        this.f19120e = arrayList;
        arrayList.addAll(c9648e.f19120e);
        this.f19130e = new TreeMap();
        for (Integer num : c9648e.f19130e.keySet()) {
            this.f19130e.put(num, (LinkedList) ((LinkedList) c9648e.f19130e.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f19129e = stack;
        stack.addAll(c9648e.f19129e);
        this.f19121e = new ArrayList();
        Iterator it = c9648e.f19121e.iterator();
        while (it.hasNext()) {
            this.f19121e.add(((C9244e) it.next()).clone());
        }
        this.f19124e = new TreeMap((Map) c9648e.f19124e);
        this.f19127e = c9648e.f19127e;
        this.f19125e = c9648e.f19125e;
        this.f19122e = c9648e.f19122e;
    }

    public C9648e(C9648e c9648e, Ctry ctry) {
        this.f19128e = new C11467e(new C11226e(ctry));
        this.f19123e = c9648e.f19123e;
        this.f19126e = c9648e.f19126e;
        ArrayList arrayList = new ArrayList();
        this.f19120e = arrayList;
        arrayList.addAll(c9648e.f19120e);
        this.f19130e = new TreeMap();
        for (Integer num : c9648e.f19130e.keySet()) {
            this.f19130e.put(num, (LinkedList) ((LinkedList) c9648e.f19130e.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f19129e = stack;
        stack.addAll(c9648e.f19129e);
        this.f19121e = new ArrayList();
        Iterator it = c9648e.f19121e.iterator();
        while (it.hasNext()) {
            this.f19121e.add(((C9244e) it.next()).clone());
        }
        this.f19124e = new TreeMap((Map) c9648e.f19124e);
        int i = c9648e.f19127e;
        this.f19127e = i;
        this.f19125e = c9648e.f19125e;
        this.f19122e = c9648e.f19122e;
        if (this.f19120e == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.f19130e == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.f19129e == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.f19121e == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (!AbstractC16947e.startapp(this.f19123e, i)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    public C9648e(C9648e c9648e, byte[] bArr, byte[] bArr2, C16450e c16450e) {
        this.f19128e = new C11467e((C11226e) c9648e.f19128e.f23072e);
        this.f19123e = c9648e.f19123e;
        this.f19126e = c9648e.f19126e;
        ArrayList arrayList = new ArrayList();
        this.f19120e = arrayList;
        arrayList.addAll(c9648e.f19120e);
        this.f19130e = new TreeMap();
        for (Integer num : c9648e.f19130e.keySet()) {
            this.f19130e.put(num, (LinkedList) ((LinkedList) c9648e.f19130e.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f19129e = stack;
        stack.addAll(c9648e.f19129e);
        this.f19121e = new ArrayList();
        Iterator it = c9648e.f19121e.iterator();
        while (it.hasNext()) {
            this.f19121e.add(((C9244e) it.next()).clone());
        }
        this.f19124e = new TreeMap((Map) c9648e.f19124e);
        this.f19127e = c9648e.f19127e;
        this.f19125e = c9648e.f19125e;
        this.f19122e = false;
        vip(bArr, bArr2, c16450e);
    }

    public C9648e(C11467e c11467e, int i, int i2, int i3) {
        this.f19128e = c11467e;
        this.f19123e = i;
        this.f19125e = i3;
        this.f19126e = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.f19120e = new ArrayList();
                this.f19130e = new TreeMap();
                this.f19129e = new Stack();
                this.f19121e = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.f19121e.add(new C9244e(i5));
                }
                this.f19124e = new TreeMap();
                this.f19127e = 0;
                this.f19122e = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public final void ad(byte[] bArr, byte[] bArr2, C16450e c16450e) {
        C16450e c16450e2;
        int i;
        C16450e c16450e3 = c16450e;
        long j = c16450e3.vip;
        int i2 = c16450e3.ad;
        C11145e c11145e = new C11145e(0);
        c11145e.metrica = i2;
        c11145e.vip = j;
        C3802e c3802e = new C3802e(c11145e);
        C7017e c7017e = new C7017e();
        c7017e.metrica = i2;
        c7017e.vip = j;
        C15281e c15281e = new C15281e(c7017e);
        int i3 = 0;
        while (true) {
            int i4 = this.f19123e;
            int i5 = 1 << i4;
            Stack stack = this.f19129e;
            if (i3 >= i5) {
                return;
            }
            C11145e c11145e2 = new C11145e(1);
            c11145e2.metrica = c16450e3.ad;
            c11145e2.vip = c16450e3.vip;
            c11145e2.appmetrica = i3;
            c11145e2.purchase = c16450e3.purchase;
            c11145e2.billing = c16450e3.billing;
            c11145e2.license = c16450e3.license;
            C16450e c16450e4 = new C16450e(c11145e2);
            C11467e c11467e = this.f19128e;
            c11467e.premium(c11467e.ads(bArr2, c16450e4), bArr);
            C17974e applovin = c11467e.applovin(c16450e4);
            C11145e c11145e3 = new C11145e(0);
            c11145e3.metrica = c3802e.ad;
            c11145e3.vip = c3802e.vip;
            c11145e3.appmetrica = i3;
            c11145e3.purchase = c3802e.purchase;
            c11145e3.billing = c3802e.billing;
            c11145e3.license = c3802e.license;
            c3802e = new C3802e(c11145e3);
            C11557e license = AbstractC10888e.license(c11467e, applovin, c3802e);
            C7017e c7017e2 = new C7017e();
            c7017e2.metrica = c15281e.ad;
            c7017e2.vip = c15281e.vip;
            c7017e2.purchase = i3;
            c7017e2.license = c15281e.license;
            c15281e = new C15281e(c7017e2);
            while (!stack.isEmpty()) {
                int i6 = ((C11557e) stack.peek()).f23217e;
                int i7 = license.f23217e;
                if (i6 == i7) {
                    int i8 = i3 / (1 << i7);
                    if (i8 == 1) {
                        this.f19120e.add(license);
                    }
                    int i9 = this.f19126e;
                    if (i8 == 3) {
                        if (i7 < i4 - i9) {
                            C9244e c9244e = (C9244e) this.f19121e.get(i7);
                            c9244e.f18454e = license;
                            c9244e.f18451e = i7;
                            c16450e2 = c16450e4;
                            if (i7 == c9244e.f18452e) {
                                c9244e.f18455e = true;
                            }
                        } else {
                            c16450e2 = c16450e4;
                        }
                        i = 3;
                    } else {
                        c16450e2 = c16450e4;
                        i = 3;
                    }
                    if (i8 >= i && (i8 & 1) == 1 && i7 >= i4 - i9 && i7 <= i4 - 2) {
                        Integer valueOf = Integer.valueOf(i7);
                        TreeMap treeMap = this.f19130e;
                        if (treeMap.get(valueOf) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(license);
                            treeMap.put(Integer.valueOf(i7), linkedList);
                        } else {
                            ((LinkedList) treeMap.get(Integer.valueOf(i7))).add(license);
                        }
                    }
                    C7017e c7017e3 = new C7017e();
                    c7017e3.metrica = c15281e.ad;
                    c7017e3.vip = c15281e.vip;
                    c7017e3.appmetrica = c15281e.appmetrica;
                    c7017e3.purchase = (c15281e.purchase - 1) / 2;
                    c7017e3.license = c15281e.license;
                    C15281e c15281e2 = new C15281e(c7017e3);
                    C11557e appmetrica = AbstractC10888e.appmetrica(c11467e, (C11557e) stack.pop(), license, c15281e2);
                    license = new C11557e(appmetrica.f23217e + 1, AbstractC16947e.license(appmetrica.f23216e));
                    C7017e c7017e4 = new C7017e();
                    c7017e4.metrica = c15281e2.ad;
                    c7017e4.vip = c15281e2.vip;
                    c7017e4.appmetrica = c15281e2.appmetrica + 1;
                    c7017e4.purchase = c15281e2.purchase;
                    c7017e4.license = c15281e2.license;
                    c15281e = new C15281e(c7017e4);
                    c16450e4 = c16450e2;
                }
            }
            stack.push(license);
            i3++;
            c16450e3 = c16450e4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [boolean] */
    public final void vip(byte[] bArr, byte[] bArr2, C16450e c16450e) {
        int i;
        ?? r7;
        C16450e c16450e2;
        int i2;
        int i3;
        int i4;
        long j;
        Stack stack;
        int i5;
        int i6;
        int i7;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        C16450e c16450e3 = c16450e;
        long j2 = c16450e3.vip;
        int i8 = c16450e3.ad;
        if (this.f19122e) {
            throw new IllegalStateException("index already used");
        }
        int i9 = this.f19127e;
        if (i9 > this.f19125e - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = this.f19123e;
            if (i11 >= i) {
                i11 = 0;
                break;
            } else if (((i9 >> i11) & 1) == 0) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = (this.f19127e >> (i11 + 1)) & 1;
        TreeMap treeMap = this.f19124e;
        ArrayList arrayList = this.f19120e;
        if (i12 == 0 && i11 < i - 1) {
            treeMap.put(Integer.valueOf(i11), arrayList.get(i11));
        }
        ArrayList arrayList2 = this.f19121e;
        int i13 = this.f19126e;
        int i14 = 1;
        C11467e c11467e = this.f19128e;
        if (i11 == 0) {
            C11145e c11145e = new C11145e(1);
            c11145e.metrica = i8;
            c11145e.vip = j2;
            c11145e.appmetrica = this.f19127e;
            c11145e.purchase = c16450e3.purchase;
            c11145e.billing = c16450e3.billing;
            c11145e.license = c16450e3.license;
            c16450e3 = new C16450e(c11145e);
            c11467e.premium(c11467e.ads(bArr4, c16450e3), bArr3);
            C17974e applovin = c11467e.applovin(c16450e3);
            C11145e c11145e2 = new C11145e(0);
            c11145e2.metrica = i8;
            c11145e2.vip = j2;
            c11145e2.appmetrica = this.f19127e;
            c11145e2.purchase = 0;
            c11145e2.billing = 0;
            c11145e2.license = 0;
            arrayList.set(0, AbstractC10888e.license(c11467e, applovin, new C3802e(c11145e2)));
        } else {
            C7017e c7017e = new C7017e();
            c7017e.metrica = i8;
            c7017e.vip = j2;
            int i15 = i11 - 1;
            c7017e.appmetrica = i15;
            c7017e.purchase = this.f19127e >> i11;
            c7017e.license = 0;
            C15281e c15281e = new C15281e(c7017e);
            c11467e.premium(c11467e.ads(bArr4, c16450e3), bArr3);
            C11557e appmetrica = AbstractC10888e.appmetrica(c11467e, (C11557e) arrayList.get(i15), (C11557e) treeMap.get(Integer.valueOf(i15)), c15281e);
            arrayList.set(i11, new C11557e(appmetrica.f23217e + 1, AbstractC16947e.license(appmetrica.f23216e)));
            treeMap.remove(Integer.valueOf(i15));
            int i16 = 0;
            while (i16 < i11) {
                arrayList.set(i16, i16 < i - i13 ? ((C9244e) arrayList2.get(i16)).f18454e : ((LinkedList) this.f19130e.get(Integer.valueOf(i16))).removeFirst());
                i16++;
            }
            int min = Math.min(i11, i - i13);
            int i17 = 0;
            while (i17 < min) {
                int i18 = ((i14 << i17) * 3) + this.f19127e + 1;
                if (i18 < (i14 << i)) {
                    C9244e c9244e = (C9244e) arrayList2.get(i17);
                    c9244e.f18454e = null;
                    c9244e.f18451e = c9244e.f18452e;
                    c9244e.f18453e = i18;
                    r7 = i14;
                    c9244e.f18450e = r7;
                    c9244e.f18455e = false;
                } else {
                    r7 = i14;
                }
                i17++;
                i14 = r7;
            }
        }
        for (int i19 = i14; i10 < ((i - i13) >> i19); i19 = 1) {
            Iterator it = arrayList2.iterator();
            C9244e c9244e2 = null;
            while (it.hasNext()) {
                C9244e c9244e3 = (C9244e) it.next();
                if (!c9244e3.f18455e && c9244e3.f18450e && (c9244e2 == null || c9244e3.vip() < c9244e2.vip() || (c9244e3.vip() == c9244e2.vip() && c9244e3.f18453e < c9244e2.f18453e))) {
                    c9244e2 = c9244e3;
                }
            }
            if (c9244e2 != null) {
                int i20 = c9244e2.f18452e;
                if (c9244e2.f18455e || !c9244e2.f18450e) {
                    throw new IllegalStateException("finished or not initialized");
                }
                C11145e c11145e3 = new C11145e(1);
                c11145e3.metrica = c16450e3.ad;
                c11145e3.vip = c16450e3.vip;
                int i21 = c9244e2.f18453e;
                c11145e3.appmetrica = i21;
                c11145e3.purchase = c16450e3.purchase;
                c11145e3.billing = c16450e3.billing;
                c11145e3.license = c16450e3.license;
                C16450e c16450e4 = new C16450e(c11145e3);
                long j3 = c16450e4.vip;
                c16450e2 = c16450e3;
                C11145e c11145e4 = new C11145e(0);
                int i22 = c16450e4.ad;
                c11145e4.metrica = i22;
                c11145e4.vip = j3;
                c11145e4.appmetrica = i21;
                i3 = i;
                C3802e c3802e = new C3802e(c11145e4);
                C7017e c7017e2 = new C7017e();
                c7017e2.metrica = i22;
                c7017e2.vip = j3;
                c7017e2.purchase = i21;
                C15281e c15281e2 = new C15281e(c7017e2);
                c11467e.premium(c11467e.ads(bArr4, c16450e4), bArr3);
                C11557e license = AbstractC10888e.license(c11467e, c11467e.applovin(c16450e4), c3802e);
                while (true) {
                    i4 = c15281e2.license;
                    j = c15281e2.vip;
                    stack = this.f19129e;
                    boolean isEmpty = stack.isEmpty();
                    i5 = c15281e2.purchase;
                    i6 = c15281e2.appmetrica;
                    i7 = c15281e2.ad;
                    if (isEmpty || ((C11557e) stack.peek()).f23217e != license.f23217e || ((C11557e) stack.peek()).f23217e == i20) {
                        break;
                    }
                    C7017e c7017e3 = new C7017e();
                    c7017e3.metrica = i7;
                    c7017e3.vip = j;
                    c7017e3.appmetrica = i6;
                    c7017e3.purchase = (i5 - 1) / 2;
                    c7017e3.license = i4;
                    C15281e c15281e3 = new C15281e(c7017e3);
                    C11557e appmetrica2 = AbstractC10888e.appmetrica(c11467e, (C11557e) stack.pop(), license, c15281e3);
                    license = new C11557e(appmetrica2.f23217e + 1, AbstractC16947e.license(appmetrica2.f23216e));
                    C7017e c7017e4 = new C7017e();
                    c7017e4.metrica = c15281e3.ad;
                    c7017e4.vip = c15281e3.vip;
                    c7017e4.appmetrica = c15281e3.appmetrica + 1;
                    c7017e4.purchase = c15281e3.purchase;
                    c7017e4.license = c15281e3.license;
                    c15281e2 = new C15281e(c7017e4);
                }
                C11557e c11557e = c9244e2.f18454e;
                if (c11557e == null) {
                    c9244e2.f18454e = license;
                    i2 = i10;
                } else {
                    i2 = i10;
                    if (c11557e.f23217e == license.f23217e) {
                        C7017e c7017e5 = new C7017e();
                        c7017e5.metrica = i7;
                        c7017e5.vip = j;
                        c7017e5.appmetrica = i6;
                        c7017e5.purchase = (i5 - 1) / 2;
                        c7017e5.license = i4;
                        license = new C11557e(c9244e2.f18454e.f23217e + 1, AbstractC16947e.license(AbstractC10888e.appmetrica(c11467e, c11557e, license, new C15281e(c7017e5)).f23216e));
                        c9244e2.f18454e = license;
                    } else {
                        stack.push(license);
                    }
                }
                if (c9244e2.f18454e.f23217e == i20) {
                    c9244e2.f18455e = true;
                } else {
                    c9244e2.f18451e = license.f23217e;
                    c9244e2.f18453e++;
                }
            } else {
                c16450e2 = c16450e3;
                i2 = i10;
                i3 = i;
            }
            i10 = i2 + 1;
            bArr3 = bArr;
            bArr4 = bArr2;
            c16450e3 = c16450e2;
            i = i3;
        }
        this.f19127e++;
    }
}
