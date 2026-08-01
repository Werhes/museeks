package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15367e {
    public static final int[] ad = {-6803, -2, -1, -1, -1, -1, -1};
    public static final int[] vip = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    public static final int[] metrica = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static final boolean ad(C0763e c0763e, float f, float f2) {
        float f3 = c0763e.ad;
        if (f > c0763e.metrica || f3 > f) {
            return false;
        }
        return f2 <= c0763e.license && c0763e.vip <= f2;
    }

    public static void adcel(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        AbstractC12947e.isVip(iArr, iArr3);
        while (true) {
            purchase(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC12947e.isVip(iArr2, iArr3);
            }
        }
    }

    public static String advert(Context context, String str) {
        AbstractC9528e.startapp(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = AbstractC10003e.amazon(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static void appmetrica(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        AbstractC12947e.subscription(iArr, iArr2, iArr4);
        purchase(iArr4, iArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (((r2 >>> 32) != 0 ? defpackage.AbstractC12797e.isVip(7, 3, r12) : 0) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void billing(int[] r12, int r13) {
        /*
            r0 = 7
            r1 = 6803(0x1a93, float:9.533E-42)
            if (r13 == 0) goto L3f
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r13
            long r6 = r6 & r4
            long r2 = r2 * r6
            r13 = 0
            r8 = r12[r13]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r2 = r2 + r8
            int r8 = (int) r2
            r12[r13] = r8
            r8 = 32
            long r2 = r2 >>> r8
            r9 = 1
            r10 = r12[r9]
            long r10 = (long) r10
            long r10 = r10 & r4
            long r6 = r6 + r10
            long r6 = r6 + r2
            int r2 = (int) r6
            r12[r9] = r2
            long r2 = r6 >>> r8
            r6 = 2
            r7 = r12[r6]
            long r9 = (long) r7
            long r4 = r4 & r9
            long r2 = r2 + r4
            int r4 = (int) r2
            r12[r6] = r4
            long r2 = r2 >>> r8
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L38
            goto L3d
        L38:
            r13 = 3
            int r13 = defpackage.AbstractC12797e.isVip(r0, r13, r12)
        L3d:
            if (r13 != 0) goto L4d
        L3f:
            r13 = 6
            r13 = r12[r13]
            r2 = -1
            if (r13 != r2) goto L50
            int[] r13 = defpackage.AbstractC15367e.ad
            boolean r13 = defpackage.AbstractC12947e.amazon(r12, r13)
            if (r13 == 0) goto L50
        L4d:
            defpackage.AbstractC12797e.vip(r0, r1, r12)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15367e.billing(int[], int):void");
    }

    public static final InterfaceC5372e license(Object obj, C10068e c10068e) {
        if (obj == null) {
            return AbstractC6069e.purchase(C9582e.ad);
        }
        if (obj instanceof List) {
            return new C13758e(vip((Collection) obj, c10068e), 0);
        }
        if (obj instanceof Object[]) {
            Object ads = AbstractC1660e.ads((Object[]) obj);
            return ads != null ? license(ads, c10068e) : new C13758e(C9582e.ad, 0);
        }
        if (obj instanceof Set) {
            return new C13758e(vip((Collection) obj, c10068e), 2);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return new C17327e(vip(map.keySet(), c10068e), vip(map.values(), c10068e), 1);
        }
        Class<?> cls = obj.getClass();
        C12232e c12232e = AbstractC3820e.ad;
        c12232e.vip(cls);
        c10068e.getClass();
        InterfaceC7227e vip2 = c12232e.vip(obj.getClass());
        InterfaceC5372e mopub = AbstractC17808e.mopub(vip2);
        if (mopub != null) {
            return mopub;
        }
        AbstractC14161e.yandex(vip2);
        throw null;
    }

    public static final Drawable metrica(Context context, int i) {
        Drawable purchase = AbstractC4628e.purchase(context, i);
        if (purchase != null) {
            return purchase;
        }
        throw new IllegalStateException(AbstractC1786e.admob(i, "Invalid resource ID: ").toString());
    }

    public static void mopub(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC12947e.inmobi(iArr, iArr2, iArr3) != 0) {
            AbstractC12797e.m3400interface(7, 6803, iArr3);
        }
    }

    public static void purchase(int[] iArr, int[] iArr2) {
        long j = 6803 & 4294967295L;
        long j2 = iArr[7] & 4294967295L;
        long j3 = (j * j2) + (iArr[0] & 4294967295L);
        int i = (int) j3;
        iArr2[0] = i;
        long j4 = iArr[8] & 4294967295L;
        long j5 = (j * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr2[1] = i2;
        long j6 = iArr[9] & 4294967295L;
        long j7 = (j * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr2[2] = i3;
        long j8 = iArr[10] & 4294967295L;
        long j9 = (j * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i4 = (int) j9;
        iArr2[3] = i4;
        long j10 = iArr[11] & 4294967295L;
        long j11 = (j * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = iArr[12] & 4294967295L;
        long j13 = (j * j12) + j10 + (iArr[5] & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = iArr[13] & 4294967295L;
        long j15 = (j * j14) + j12 + (iArr[6] & 4294967295L) + (j13 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = (j15 >>> 32) + j14;
        long j17 = j16 & 4294967295L;
        long j18 = (j * j17) + (i & 4294967295L);
        iArr2[0] = (int) j18;
        long j19 = j16 >>> 32;
        long j20 = (j * j19) + j17 + (i2 & 4294967295L) + (j18 >>> 32);
        iArr2[1] = (int) j20;
        long j21 = j19 + (i3 & 4294967295L) + (j20 >>> 32);
        iArr2[2] = (int) j21;
        long j22 = (j21 >>> 32) + (i4 & 4294967295L);
        iArr2[3] = (int) j22;
        if (((j22 >>> 32) == 0 ? 0 : AbstractC12797e.isVip(7, 4, iArr2)) != 0 || (iArr2[6] == -1 && AbstractC12947e.amazon(iArr2, ad))) {
            AbstractC12797e.vip(7, 6803, iArr2);
        }
    }

    public static String smaato(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static void startapp(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        AbstractC12947e.isVip(iArr, iArr3);
        purchase(iArr3, iArr2);
    }

    public static final InterfaceC5372e vip(Collection collection, C10068e c10068e) {
        Collection collection2 = collection;
        ArrayList firebase = AbstractC13480e.firebase(collection2);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(firebase, 10));
        Iterator it = firebase.iterator();
        while (it.hasNext()) {
            arrayList.add(license(it.next(), c10068e));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((InterfaceC5372e) next).appmetrica().ad())) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((InterfaceC5372e) it3.next()).appmetrica().ad());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        InterfaceC5372e interfaceC5372e = (InterfaceC5372e) AbstractC13480e.m3603synchronized(arrayList2);
        if (interfaceC5372e == null) {
            interfaceC5372e = C9582e.ad;
        }
        if (!interfaceC5372e.appmetrica().metrica() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator it4 = collection2.iterator();
            while (it4.hasNext()) {
                if (it4.next() == null) {
                    return AbstractC6069e.purchase(interfaceC5372e);
                }
            }
        }
        return interfaceC5372e;
    }

    public static final InterfaceC5372e yandex(C10068e c10068e, C12025e c12025e) {
        InterfaceC7227e interfaceC7227e = c12025e.ad;
        InterfaceC13984e interfaceC13984e = c12025e.vip;
        if (interfaceC13984e != null) {
            InterfaceC5372e adcel = interfaceC13984e.signatures().isEmpty() ? null : AbstractC11866e.adcel(c10068e, interfaceC13984e, false);
            if (adcel != null) {
                return adcel;
            }
        }
        c10068e.getClass();
        InterfaceC5372e mopub = AbstractC17808e.mopub(interfaceC7227e);
        if (mopub != null) {
            return (interfaceC13984e == null || !interfaceC13984e.startapp()) ? mopub : AbstractC6069e.purchase(mopub);
        }
        AbstractC14161e.yandex(interfaceC7227e);
        throw null;
    }
}
