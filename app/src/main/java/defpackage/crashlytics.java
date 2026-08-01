package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class crashlytics implements InterfaceC18180e, InterfaceC2227e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final subs[] f1115e = new subs[0];

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final int[] f1116e = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f1117e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f1118e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f1119e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1120e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public crashlytics(byte b, int i) {
        this(10, 0);
        this.f1120e = i;
        switch (i) {
            case 9:
                this.f1117e = 12;
                this.f1119e = null;
                return;
            case 12:
                this.f1119e = new Object[4];
                this.f1117e = 0;
                return;
            default:
                return;
        }
    }

    public /* synthetic */ crashlytics(char c, int i) {
        this.f1120e = i;
    }

    public crashlytics(int i, int i2) {
        this.f1120e = i2;
        switch (i2) {
            case 3:
                this.f1118e = false;
                this.f1119e = EnumC3438e.f7693e;
                this.f1117e = i;
                return;
            default:
                if (i < 0) {
                    throw new IllegalArgumentException("'initialCapacity' must not be negative");
                }
                this.f1119e = i == 0 ? f1115e : new subs[i];
                this.f1117e = 0;
                this.f1118e = false;
                return;
        }
    }

    public crashlytics(Context context) {
        this.f1120e = 6;
        this.f1119e = context;
        this.f1117e = -1;
    }

    public crashlytics(ActionBarContextView actionBarContextView) {
        this.f1120e = 2;
        this.f1119e = actionBarContextView;
        this.f1118e = false;
    }

    public crashlytics(C10195e c10195e, AbstractC8712e abstractC8712e) {
        this.f1120e = 8;
        this.f1119e = abstractC8712e;
        this.f1118e = c10195e.metrica;
    }

    public crashlytics(AbstractC10226e abstractC10226e, int i, boolean z) {
        this.f1120e = 7;
        this.f1119e = abstractC10226e;
        this.f1117e = i;
        this.f1118e = z;
    }

    public crashlytics(C17041e c17041e, boolean z) {
        this.f1120e = 4;
        this.f1119e = c17041e;
        this.f1118e = z;
        this.f1117e = -1;
        inmobi();
    }

    public crashlytics(C17059e c17059e) {
        this.f1120e = 11;
        C0997e c0997e = C0997e.billing;
        this.f1117e = c17059e.ad;
        this.f1119e = c17059e.vip;
        this.f1118e = c17059e.metrica;
    }

    public static ArrayList Signature(C6095e c6095e) {
        ArrayList arrayList = new ArrayList();
        while (!c6095e.premium()) {
            String str = (String) c6095e.license;
            String str2 = null;
            if (!c6095e.premium()) {
                int i = c6095e.vip;
                char charAt = str.charAt(i);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    c6095e.vip = i;
                } else {
                    int startapp = c6095e.startapp();
                    while (true) {
                        if ((startapp < 65 || startapp > 90) && (startapp < 97 || startapp > 122)) {
                            break;
                        }
                        startapp = c6095e.startapp();
                    }
                    str2 = str.substring(i, c6095e.vip);
                }
            }
            if (str2 == null) {
                break;
            }
            try {
                arrayList.add(EnumC3438e.valueOf(str2));
            } catch (IllegalArgumentException unused) {
            }
            if (!c6095e.m2713throws()) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: abstract, reason: not valid java name */
    public static void m186abstract(int i, long j, byte[] bArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) j;
            j >>>= 8;
        }
    }

    public static byte[] ads(C17041e c17041e, int i) {
        byte[] bArr = c17041e.ad;
        int length = bArr.length;
        int i2 = c17041e.vip;
        if (i > length - i2) {
            throw new IllegalStateException(("Unexpected EOF, available " + (bArr.length - c17041e.vip) + " bytes, requested: " + i).toString());
        }
        byte[] bArr2 = new byte[i];
        if (i < 0 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 >= bArr.length || i == 0) {
            return bArr2;
        }
        if (bArr.length - i2 < i) {
            i = bArr.length - i2;
        }
        AbstractC1660e.smaato(bArr, 0, i2, bArr2, i2 + i);
        c17041e.vip += i;
        return bArr2;
    }

    public static long billing(int i, byte[] bArr) {
        long j = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            j = (j << 8) + (bArr[i2 + i] & 255);
        }
        return j;
    }

    /* renamed from: break, reason: not valid java name */
    public static void m187break(long[] jArr, long[] jArr2) {
        String m3608try;
        String str = null;
        if (Arrays.equals(jArr, jArr2 == null ? null : jArr2)) {
            return;
        }
        StringBuilder sb = new StringBuilder("CBOR tags ");
        String str2 = "null";
        if (jArr2 != null) {
            String m3608try2 = AbstractC13480e.m3608try(new C15571e(jArr2), ", ", "[", "]", null, 56);
            str = m3608try2 == null ? "null" : m3608try2;
        }
        sb.append(str);
        sb.append(" do not match expected tags ");
        if (jArr != null && (m3608try = AbstractC13480e.m3608try(new C15571e(jArr), ", ", "[", "]", null, 56)) != null) {
            str2 = m3608try;
        }
        sb.append(str2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: class, reason: not valid java name */
    public static long m188class(long j, long j2) {
        long j3 = j2 & 63;
        return (j >>> ((int) (64 - j3))) | (j << ((int) j3));
    }

    private final void crashlytics() {
    }

    /* renamed from: default, reason: not valid java name */
    public static void m189default(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    /* renamed from: extends, reason: not valid java name */
    public static boolean m190extends(C4523e c4523e, AbstractC14697e abstractC14697e) {
        ArrayList arrayList;
        String str = c4523e.vip;
        if (str != null && !str.equals(abstractC14697e.amazon().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = c4523e.metrica;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C13847e c13847e = (C13847e) it.next();
                String str2 = c13847e.ad;
                String str3 = c13847e.metrica;
                if (str2.equals("id")) {
                    if (!str3.equals(abstractC14697e.metrica)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = abstractC14697e.billing) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = c4523e.license;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((InterfaceC13140e) it2.next()).ad(abstractC14697e)) {
                return false;
            }
        }
        return true;
    }

    private final void firebase() {
    }

    /* renamed from: goto, reason: not valid java name */
    public static boolean m191goto(C11026e c11026e, int i, ArrayList arrayList, int i2, AbstractC14697e abstractC14697e) {
        C4523e c4523e = (C4523e) c11026e.ad.get(i);
        if (!m190extends(c4523e, abstractC14697e)) {
            return false;
        }
        int i3 = c4523e.ad;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!m193native(c11026e, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return m193native(c11026e, i - 1, arrayList, i2);
        }
        int mopub = mopub(arrayList, i2, abstractC14697e);
        if (mopub <= 0) {
            return false;
        }
        return m191goto(c11026e, i - 1, arrayList, i2, (AbstractC14697e) abstractC14697e.vip.getChildren().get(mopub - 1));
    }

    /* renamed from: interface, reason: not valid java name */
    public static int m192interface(int i, int i2) {
        int i3 = i2 & 31;
        return (i >>> (32 - i3)) | (i << i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(defpackage.crashlytics r10, defpackage.C17195e r11, defpackage.AbstractC9049e r12) {
        /*
            java.lang.Object r0 = r10.f1119e
            eٌٕۗ r0 = (defpackage.AbstractC8712e) r0
            boolean r1 = r12 instanceof defpackage.C6180e
            if (r1 == 0) goto L17
            r1 = r12
            eؙٟؕ r1 = (defpackage.C6180e) r1
            int r2 = r1.f12955e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f12955e = r2
            goto L1c
        L17:
            eؙٟؕ r1 = new eؙٟؕ
            r1.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r1.f12957e
            int r2 = r1.f12955e
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5e
            if (r2 != r8) goto L56
            int r10 = r1.f12954e
            java.lang.String r11 = r1.f12958e
            java.util.LinkedHashMap r0 = r1.f12959e
            crashlytics r2 = r1.f12952e
            eّٗۖ r9 = r1.f12956e
            defpackage.AbstractC2003e.purchase(r12)
            eَٜؓ r12 = (defpackage.AbstractC1948e) r12
            r0.put(r11, r12)
            java.lang.Object r11 = r2.f1119e
            eٌٕۗ r11 = (defpackage.AbstractC8712e) r11
            byte r11 = r11.purchase()
            if (r11 == r7) goto L53
            if (r11 != r6) goto L49
            goto La3
        L49:
            java.lang.Object r10 = r2.f1119e
            eٌٕۗ r10 = (defpackage.AbstractC8712e) r10
            java.lang.String r11 = "Expected end of the object or comma"
            defpackage.AbstractC8712e.admob(r10, r11, r5, r3, r4)
            throw r3
        L53:
            r5 = r10
            r10 = r2
            goto L72
        L56:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L5e:
            defpackage.AbstractC2003e.purchase(r12)
            byte r12 = r0.billing(r4)
            byte r2 = r0.isVip()
            if (r2 == r7) goto Lb9
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9 = r11
            r11 = r12
        L72:
            java.lang.Object r12 = r10.f1119e
            eٌٕۗ r12 = (defpackage.AbstractC8712e) r12
            boolean r2 = r12.metrica()
            if (r2 == 0) goto La2
            boolean r11 = r10.f1118e
            if (r11 == 0) goto L85
            java.lang.String r11 = r12.advert()
            goto L89
        L85:
            java.lang.String r11 = r12.adcel()
        L89:
            r2 = 5
            r12.billing(r2)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            r1.f12956e = r9
            r1.f12952e = r10
            r1.f12959e = r0
            r1.f12958e = r11
            r1.f12954e = r5
            r1.f12955e = r8
            r9.f33709e = r1
            r9.f33710e = r12
            eٟؔۙ r10 = defpackage.EnumC2821e.f6782e
            return r10
        La2:
            r2 = r10
        La3:
            java.lang.Object r10 = r2.f1119e
            eٌٕۗ r10 = (defpackage.AbstractC8712e) r10
            if (r11 != r4) goto Lad
            r10.billing(r6)
            goto Laf
        Lad:
            if (r11 == r7) goto Lb5
        Laf:
            eُؖؔ r10 = new eُؖؔ
            r10.<init>(r0)
            return r10
        Lb5:
            defpackage.AbstractC3421e.startapp(r10)
            throw r3
        Lb9:
            java.lang.String r10 = "Unexpected leading comma"
            defpackage.AbstractC8712e.admob(r0, r10, r5, r3, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crashlytics.license(crashlytics, eّٗۖ, eٌۡۖ):java.lang.Object");
    }

    public static int mopub(ArrayList arrayList, int i, AbstractC14697e abstractC14697e) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        InterfaceC18321e interfaceC18321e = abstractC14697e.vip;
        if (obj != interfaceC18321e) {
            return -1;
        }
        Iterator it = interfaceC18321e.getChildren().iterator();
        while (it.hasNext()) {
            if (((AbstractC16408e) it.next()) == abstractC14697e) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r5 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r7 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (m193native(r4, r5 - 1, r6, r7) == false) goto L25;
     */
    /* renamed from: native, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m193native(defpackage.C11026e r4, int r5, java.util.ArrayList r6, int r7) {
        /*
            java.util.ArrayList r0 = r4.ad
            java.lang.Object r0 = r0.get(r5)
            eًؖۧ r0 = (defpackage.C4523e) r0
            java.lang.Object r1 = r6.get(r7)
            eٔٓؐ r1 = (defpackage.AbstractC14697e) r1
            boolean r2 = m190extends(r0, r1)
            if (r2 != 0) goto L15
            goto L3a
        L15:
            int r0 = r0.ad
            r2 = 1
            if (r0 != r2) goto L2a
            if (r5 != 0) goto L1d
            goto L29
        L1d:
            if (r7 <= 0) goto L3a
            int r0 = r5 + (-1)
            int r7 = r7 + (-1)
            boolean r0 = m193native(r4, r0, r6, r7)
            if (r0 == 0) goto L1d
        L29:
            return r2
        L2a:
            r3 = 2
            if (r0 != r3) goto L34
            int r5 = r5 - r2
            int r7 = r7 - r2
            boolean r4 = m193native(r4, r5, r6, r7)
            return r4
        L34:
            int r0 = mopub(r6, r7, r1)
            if (r0 > 0) goto L3c
        L3a:
            r4 = 0
            return r4
        L3c:
            eۗۜ r1 = r1.vip
            java.util.List r1 = r1.getChildren()
            int r0 = r0 - r2
            java.lang.Object r0 = r1.get(r0)
            eٔٓؐ r0 = (defpackage.AbstractC14697e) r0
            int r5 = r5 - r2
            boolean r4 = m191goto(r4, r5, r6, r7, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crashlytics.m193native(eُٖٕ, int, java.util.ArrayList, int):boolean");
    }

    public static void pro(ArrayList arrayList) {
        int intValue;
        for (int billing = AbstractC6874e.billing(arrayList); -1 < billing && (intValue = ((Number) arrayList.get(billing)).intValue()) != -1; billing--) {
            if (intValue != 1) {
                arrayList.set(billing, Integer.valueOf(((Number) arrayList.get(billing)).intValue() - 1));
                return;
            }
            ((Number) arrayList.remove(billing)).intValue();
        }
    }

    public static void purchase(int i, ArrayList arrayList) {
        if (AbstractC10509e.advert(i, 0, 7, f1116e) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public static subs[] startapp(subs[] subsVarArr) {
        return subsVarArr.length < 1 ? f1115e : (subs[]) subsVarArr.clone();
    }

    /* renamed from: this, reason: not valid java name */
    public static boolean m194this(C11026e c11026e, AbstractC14697e abstractC14697e) {
        ArrayList arrayList = new ArrayList();
        Object obj = abstractC14697e.vip;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((AbstractC16408e) obj).vip;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = c11026e.ad;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return m190extends((C4523e) c11026e.ad.get(0), abstractC14697e);
        }
        ArrayList arrayList3 = c11026e.ad;
        return m191goto(c11026e, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, abstractC14697e);
    }

    public static int yandex(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // defpackage.InterfaceC18180e
    public void ad() {
        this.f1118e = true;
    }

    public subs adcel(int i) {
        if (i < this.f1117e) {
            return ((subs[]) this.f1119e)[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.f1117e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [eُؒؕ, java.lang.Object] */
    public boolean admob(C1720e c1720e, C6095e c6095e) {
        ArrayList m2021e = c6095e.m2021e();
        if (m2021e == null || m2021e.isEmpty()) {
            return false;
        }
        if (!c6095e.inmobi('{')) {
            throw new Exception("Malformed rule block: expected '{'");
        }
        c6095e.m2694finally();
        C17619e c17619e = new C17619e();
        do {
            String m2020e = c6095e.m2020e();
            c6095e.m2694finally();
            if (!c6095e.inmobi(':')) {
                throw new Exception("Expected ':'");
            }
            c6095e.m2694finally();
            String str = (String) c6095e.license;
            String str2 = null;
            if (!c6095e.premium()) {
                int i = c6095e.vip;
                int charAt = str.charAt(i);
                int i2 = i;
                while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && charAt != 10 && charAt != 13) {
                    if (!C9831e.m2673try(charAt)) {
                        i2 = c6095e.vip + 1;
                    }
                    charAt = c6095e.startapp();
                }
                if (c6095e.vip > i) {
                    str2 = str.substring(i, i2);
                } else {
                    c6095e.vip = i;
                }
            }
            if (str2 == null) {
                throw new Exception("Expected property value");
            }
            c6095e.m2694finally();
            if (c6095e.inmobi('!')) {
                c6095e.m2694finally();
                if (!c6095e.isPro("important")) {
                    throw new Exception("Malformed rule set: found unexpected '!'");
                }
                c6095e.m2694finally();
            }
            c6095e.inmobi(';');
            C10913e.crashlytics(c17619e, m2020e, str2);
            c6095e.m2694finally();
            if (c6095e.premium()) {
                break;
            }
        } while (!c6095e.inmobi('}'));
        c6095e.m2694finally();
        Iterator it = m2021e.iterator();
        while (it.hasNext()) {
            C11026e c11026e = (C11026e) it.next();
            int i3 = this.f1117e;
            ?? obj = new Object();
            obj.ad = c11026e;
            obj.vip = c17619e;
            obj.metrica = i3;
            c1720e.ad(obj);
        }
        return true;
    }

    public C16975e advert(C16975e c16975e) {
        if (!this.f1118e || !((C4524e) this.f1119e).mopub(c16975e)) {
            return c16975e;
        }
        C11445e ad = c16975e.ad();
        String str = c16975e.mopub;
        ad.amazon = AbstractC8542e.amazon("application/x-media3-cues");
        ad.f23025throw = ((C4524e) this.f1119e).inmobi(c16975e);
        StringBuilder sb = new StringBuilder();
        sb.append(c16975e.loadAd);
        sb.append(str != null ? " ".concat(str) : BuildConfig.FLAVOR);
        ad.adcel = sb.toString();
        ad.remoteconfig = Long.MAX_VALUE;
        return new C16975e(ad);
    }

    public C10985e amazon() {
        long[] remoteconfig = remoteconfig(null);
        if ((this.f1117e & 224) == 96) {
            String mopub = AbstractC6507e.mopub(applovin());
            inmobi();
            return new C10985e(mopub, null, remoteconfig != null ? new C15571e(remoteconfig) : null);
        }
        long premium = premium();
        inmobi();
        return new C10985e(null, Long.valueOf(premium), remoteconfig != null ? new C15571e(remoteconfig) : null);
    }

    public byte[] applovin() {
        if ((this.f1117e & 31) != 31) {
            return ads((C17041e) this.f1119e, (int) premium());
        }
        inmobi();
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(applovin());
            inmobi();
        } while (this.f1117e != 255);
        int i = AbstractC1020e.ad;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((byte[]) it.next()).length;
        }
        byte[] bArr = new byte[i2];
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            AbstractC1660e.admob(bArr2, i3, 0, bArr, 0, 12);
            i3 += bArr2.length;
        }
        return bArr;
    }

    public void appmetrica(subs subsVar) {
        if (subsVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        subs[] subsVarArr = (subs[]) this.f1119e;
        int length = subsVarArr.length;
        int i = this.f1117e + 1;
        if (this.f1118e | (i > length)) {
            subs[] subsVarArr2 = new subs[Math.max(subsVarArr.length, (i >> 1) + i)];
            System.arraycopy((subs[]) this.f1119e, 0, subsVarArr2, 0, this.f1117e);
            this.f1119e = subsVarArr2;
            this.f1118e = false;
        }
        ((subs[]) this.f1119e)[this.f1117e] = subsVar;
        this.f1117e = i;
    }

    /* renamed from: case, reason: not valid java name */
    public void m195case(int i) {
        Object[] objArr = (Object[]) this.f1119e;
        int length = objArr.length;
        if (length >= i) {
            if (this.f1118e) {
                this.f1119e = (Object[]) objArr.clone();
                this.f1118e = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            i2 = highestOneBit + highestOneBit;
        }
        if (i2 < 0) {
            i2 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        this.f1119e = Arrays.copyOf(objArr, i2);
        this.f1118e = false;
    }

    /* renamed from: catch, reason: not valid java name */
    public C7895e m196catch() {
        this.f1118e = true;
        Object[] objArr = (Object[]) this.f1119e;
        int i = this.f1117e;
        C1911e c1911e = AbstractC2358e.f5902e;
        return i == 0 ? C7895e.f15970e : new C7895e(i, objArr);
    }

    @Override // defpackage.InterfaceC2227e
    public String getAlgorithmName() {
        switch (this.f1120e) {
            case 9:
                return "RC5-32";
            default:
                return "RC5-64";
        }
    }

    /* renamed from: implements, reason: not valid java name */
    public void m197implements(Object obj) {
        obj.getClass();
        m195case(this.f1117e + 1);
        Object[] objArr = (Object[]) this.f1119e;
        int i = this.f1117e;
        this.f1117e = i + 1;
        objArr[i] = obj;
    }

    @Override // defpackage.InterfaceC2227e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        switch (this.f1120e) {
            case 9:
                if (interfaceC3894e instanceof C13059e) {
                    C13059e c13059e = (C13059e) interfaceC3894e;
                    this.f1117e = c13059e.f25987e;
                    m199throw(c13059e.f25988e);
                } else {
                    if (!(interfaceC3894e instanceof C14915e)) {
                        throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to RC532 init - ", interfaceC3894e));
                    }
                    m199throw(((C14915e) interfaceC3894e).f29591e);
                }
                this.f1118e = z;
                if (interfaceC3894e instanceof EnumC0300e) {
                    throw new IllegalArgumentException("params should not be CryptoServicePurpose");
                }
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                return;
            default:
                if (!(interfaceC3894e instanceof C13059e)) {
                    throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to RC564 init - ", interfaceC3894e));
                }
                C13059e c13059e2 = (C13059e) interfaceC3894e;
                this.f1118e = z;
                this.f1117e = c13059e2.f25987e;
                byte[] bArr = c13059e2.f25988e;
                int length = (bArr.length + 7) / 8;
                long[] jArr = new long[length];
                for (int i = 0; i != bArr.length; i++) {
                    int i2 = i / 8;
                    jArr[i2] = jArr[i2] + ((bArr[i] & 255) << ((i % 8) * 8));
                }
                long[] jArr2 = new long[(this.f1117e + 1) * 2];
                this.f1119e = jArr2;
                jArr2[0] = -5196783011329398165L;
                int i3 = 1;
                while (true) {
                    long[] jArr3 = (long[]) this.f1119e;
                    if (i3 >= jArr3.length) {
                        int length2 = length > jArr3.length ? length * 3 : jArr3.length * 3;
                        long j = 0;
                        long j2 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        for (int i6 = 0; i6 < length2; i6++) {
                            long[] jArr4 = (long[]) this.f1119e;
                            j = m188class(jArr4[i4] + j + j2, 3L);
                            jArr4[i4] = j;
                            j2 = m188class(jArr[i5] + j + j2, j2 + j);
                            jArr[i5] = j2;
                            i4 = (i4 + 1) % ((long[]) this.f1119e).length;
                            i5 = (i5 + 1) % length;
                        }
                        if (interfaceC3894e instanceof EnumC0300e) {
                            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
                        }
                        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                        return;
                    }
                    jArr3[i3] = jArr3[i3 - 1] - 7046029254386353131L;
                    i3++;
                }
        }
    }

    public void inmobi() {
        this.f1117e = ((C17041e) this.f1119e).vip();
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        switch (this.f1120e) {
            case 9:
                return 8;
            default:
                return 16;
        }
    }

    public C7960e isVip() {
        AbstractC8712e abstractC8712e = (AbstractC8712e) this.f1119e;
        byte purchase = abstractC8712e.purchase();
        if (abstractC8712e.isVip() == 4) {
            AbstractC8712e.admob(abstractC8712e, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (abstractC8712e.metrica()) {
            arrayList.add(signatures());
            purchase = abstractC8712e.purchase();
            if (purchase != 4) {
                boolean z = purchase == 9;
                int i = abstractC8712e.vip;
                if (!z) {
                    AbstractC8712e.admob(abstractC8712e, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (purchase == 8) {
            abstractC8712e.billing((byte) 9);
        } else if (purchase == 4) {
            AbstractC3421e.yandex(abstractC8712e, "array");
            throw null;
        }
        return new C7960e(arrayList);
    }

    public void loadAd(C1720e c1720e, C6095e c6095e) {
        int intValue;
        char charAt;
        int m2018e;
        String m2020e = c6095e.m2020e();
        c6095e.m2694finally();
        if (m2020e == null) {
            throw new Exception("Invalid '@' rule");
        }
        int i = 0;
        if (!this.f1118e && m2020e.equals("media")) {
            ArrayList Signature = Signature(c6095e);
            if (!c6095e.inmobi('{')) {
                throw new Exception("Invalid @media rule: missing rule set");
            }
            c6095e.m2694finally();
            EnumC3438e enumC3438e = (EnumC3438e) this.f1119e;
            Iterator it = Signature.iterator();
            while (it.hasNext()) {
                EnumC3438e enumC3438e2 = (EnumC3438e) it.next();
                if (enumC3438e2 == EnumC3438e.f7694e || enumC3438e2 == enumC3438e) {
                    this.f1118e = true;
                    c1720e.vip(subscription(c6095e));
                    this.f1118e = false;
                    break;
                }
            }
            subscription(c6095e);
            if (!c6095e.premium() && !c6095e.inmobi('}')) {
                throw new Exception("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f1118e || !m2020e.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + m2020e + " rule");
            while (!c6095e.premium() && ((intValue = c6095e.m2674abstract().intValue()) != 59 || i != 0)) {
                if (intValue == 123) {
                    i++;
                } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                    break;
                }
            }
        } else {
            String str = null;
            if (!c6095e.premium()) {
                int i2 = c6095e.vip;
                if (c6095e.isPro("url(")) {
                    c6095e.m2694finally();
                    String m2019e = c6095e.m2019e();
                    if (m2019e == null) {
                        String str2 = (String) c6095e.license;
                        StringBuilder sb = new StringBuilder();
                        while (!c6095e.premium() && (charAt = str2.charAt(c6095e.vip)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !C9831e.m2673try(charAt) && !Character.isISOControl((int) charAt)) {
                            c6095e.vip++;
                            if (charAt == '\\') {
                                if (!c6095e.premium()) {
                                    int i3 = c6095e.vip;
                                    c6095e.vip = i3 + 1;
                                    charAt = str2.charAt(i3);
                                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                        int m2018e2 = C6095e.m2018e(charAt);
                                        if (m2018e2 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !c6095e.premium() && (m2018e = C6095e.m2018e(str2.charAt(c6095e.vip))) != -1; i4++) {
                                                c6095e.vip++;
                                                m2018e2 = (m2018e2 * 16) + m2018e;
                                            }
                                            sb.append((char) m2018e2);
                                        }
                                    }
                                }
                            }
                            sb.append(charAt);
                        }
                        m2019e = sb.length() == 0 ? null : sb.toString();
                    }
                    if (m2019e == null) {
                        c6095e.vip = i2;
                    } else {
                        c6095e.m2694finally();
                        if (c6095e.premium() || c6095e.isPro(")")) {
                            str = m2019e;
                        } else {
                            c6095e.vip = i2;
                        }
                    }
                }
            }
            if (str == null) {
                str = c6095e.m2019e();
            }
            if (str == null) {
                throw new Exception("Invalid @import rule: expected string or url()");
            }
            c6095e.m2694finally();
            Signature(c6095e);
            if (!c6095e.premium() && !c6095e.inmobi(';')) {
                throw new Exception("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        c6095e.m2694finally();
    }

    @Override // defpackage.InterfaceC18180e
    public void metrica() {
        if (this.f1118e) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f1119e;
        actionBarContextView.f118e = null;
        ActionBarContextView.vip(actionBarContextView, this.f1117e);
    }

    public long premium() {
        int i;
        int i2 = this.f1117e;
        int i3 = i2 & 31;
        boolean z = (i2 & 224) == 32;
        switch (i3) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                i = 1;
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                i = 2;
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                i = 4;
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                i = 8;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return z ? -(i3 + 1) : i3;
        }
        byte[] ads = ads((C17041e) this.f1119e, i);
        long j = 0;
        for (int i4 = 0; i4 < i; i4++) {
            j = (j << 8) | (ads[i4] & 255);
        }
        return z ? -(j + 1) : j;
    }

    /* renamed from: protected, reason: not valid java name */
    public subs[] m198protected() {
        int i = this.f1117e;
        if (i == 0) {
            return f1115e;
        }
        subs[] subsVarArr = (subs[]) this.f1119e;
        if (subsVarArr.length == i) {
            this.f1118e = true;
            return subsVarArr;
        }
        subs[] subsVarArr2 = new subs[i];
        System.arraycopy(subsVarArr, 0, subsVarArr2, 0, i);
        return subsVarArr2;
    }

    public long[] remoteconfig(long[] jArr) {
        long[] jArr2;
        boolean z = this.f1118e;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while ((this.f1117e & 224) == 192) {
            arrayList.add(new C10994e(premium()));
            if (z && jArr != null) {
                int i2 = i + 1;
                if (i >= jArr.length) {
                    throw new IllegalArgumentException(AbstractC17861e.smaato(jArr.length, " tags specified", new StringBuilder("More tags found than the ")));
                }
                i = i2;
            }
            inmobi();
        }
        if (arrayList.isEmpty()) {
            jArr2 = null;
        } else {
            jArr2 = new long[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                jArr2[i3] = ((C10994e) it.next()).f21777e;
                i3++;
            }
        }
        C15571e c15571e = jArr2 != null ? new C15571e(jArr2) : null;
        long[] jArr3 = c15571e != null ? c15571e.f30738e : null;
        if (jArr != null) {
            if (z) {
                m187break(jArr, jArr3);
            } else if (arrayList.size() < jArr.length || !AbstractC7890e.billing(arrayList.subList(0, jArr.length), new C8805e(1, jArr))) {
                throw new IllegalArgumentException("CBOR tags " + arrayList + " do not start with specified tags " + ((Object) C15571e.appmetrica(jArr)));
            }
        }
        if (c15571e != null) {
            return c15571e.f30738e;
        }
        return null;
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
        int i = this.f1120e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [eًؗۖ, java.lang.Object, eّٗۖ] */
    public AbstractC1948e signatures() {
        AbstractC1948e c4030e;
        Object obj;
        AbstractC8712e abstractC8712e = (AbstractC8712e) this.f1119e;
        byte isVip = abstractC8712e.isVip();
        if (isVip == 1) {
            return subs(true);
        }
        if (isVip == 0) {
            return subs(false);
        }
        if (isVip != 6) {
            if (isVip == 8) {
                return isVip();
            }
            AbstractC8712e.admob(abstractC8712e, "Cannot read Json element because of unexpected ".concat(AbstractC7700e.appmetrica(isVip)), 0, null, 6);
            throw null;
        }
        int i = this.f1117e + 1;
        this.f1117e = i;
        if (i == 200) {
            C2778e c2778e = new C2778e(this, null);
            Unit unit = Unit.INSTANCE;
            ?? obj2 = new Object();
            obj2.f33712e = c2778e;
            obj2.f33710e = unit;
            obj2.f33709e = obj2;
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            obj2.f33711e = enumC2821e;
            while (true) {
                obj = obj2.f33711e;
                InterfaceC5083e interfaceC5083e = obj2.f33709e;
                if (interfaceC5083e == null) {
                    break;
                }
                if (enumC2821e.equals(obj)) {
                    try {
                        C2778e c2778e2 = obj2.f33712e;
                        Unit unit2 = obj2.f33710e;
                        AbstractC9476e.purchase(3, c2778e2);
                        Object invoke = c2778e2.invoke(obj2, unit2, interfaceC5083e);
                        if (invoke != enumC2821e) {
                            interfaceC5083e.billing(invoke);
                        }
                    } catch (Throwable th) {
                        interfaceC5083e.billing(new C12763e(th));
                    }
                } else {
                    obj2.f33711e = enumC2821e;
                    interfaceC5083e.billing(obj);
                }
            }
            AbstractC2003e.purchase(obj);
            c4030e = (AbstractC1948e) obj;
        } else {
            byte billing = abstractC8712e.billing((byte) 6);
            if (abstractC8712e.isVip() == 4) {
                AbstractC8712e.admob(abstractC8712e, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!abstractC8712e.metrica()) {
                    break;
                }
                String advert = this.f1118e ? abstractC8712e.advert() : abstractC8712e.adcel();
                abstractC8712e.billing((byte) 5);
                linkedHashMap.put(advert, signatures());
                billing = abstractC8712e.purchase();
                if (billing != 4) {
                    if (billing != 7) {
                        AbstractC8712e.admob(abstractC8712e, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (billing == 6) {
                abstractC8712e.billing((byte) 7);
            } else if (billing == 4) {
                AbstractC3421e.startapp(abstractC8712e);
                throw null;
            }
            c4030e = new C4030e(linkedHashMap);
        }
        this.f1117e--;
        return c4030e;
    }

    public String smaato(long[] jArr) {
        remoteconfig(jArr);
        int i = this.f1117e;
        if ((i & 224) != 96) {
            throw AbstractC18489e.ad(i, "start of string");
        }
        String mopub = AbstractC6507e.mopub(applovin());
        inmobi();
        return mopub;
    }

    public AbstractC16920e subs(boolean z) {
        AbstractC8712e abstractC8712e = (AbstractC8712e) this.f1119e;
        String advert = (this.f1118e || !z) ? abstractC8712e.advert() : abstractC8712e.adcel();
        return (z || !AbstractC7890e.billing(advert, "null")) ? new C3093e(advert, z) : C11549e.INSTANCE;
    }

    public C1720e subscription(C6095e c6095e) {
        C1720e c1720e = new C1720e(0);
        while (!c6095e.premium()) {
            try {
                if (!c6095e.isPro("<!--") && !c6095e.isPro("-->")) {
                    if (!c6095e.inmobi('@')) {
                        if (!admob(c1720e, c6095e)) {
                            break;
                        }
                    } else {
                        loadAd(c1720e, c6095e);
                    }
                }
            } catch (C6726e e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return c1720e;
            }
        }
        return c1720e;
    }

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        switch (this.f1120e) {
            case 9:
                if (this.f1118e) {
                    int yandex = yandex(i, bArr) + ((int[]) this.f1119e)[0];
                    int yandex2 = yandex(i + 4, bArr) + ((int[]) this.f1119e)[1];
                    for (int i3 = 1; i3 <= this.f1117e; i3++) {
                        int i4 = i3 * 2;
                        yandex = m192interface(yandex ^ yandex2, yandex2) + ((int[]) this.f1119e)[i4];
                        yandex2 = m192interface(yandex2 ^ yandex, yandex) + ((int[]) this.f1119e)[i4 + 1];
                    }
                    m189default(yandex, i2, bArr2);
                    m189default(yandex2, i2 + 4, bArr2);
                    return 8;
                }
                int yandex3 = yandex(i, bArr);
                int yandex4 = yandex(i + 4, bArr);
                for (int i5 = this.f1117e; i5 >= 1; i5--) {
                    int[] iArr = (int[]) this.f1119e;
                    int i6 = i5 * 2;
                    int i7 = yandex4 - iArr[i6 + 1];
                    int i8 = yandex3 & 31;
                    yandex4 = ((i7 << (32 - i8)) | (i7 >>> i8)) ^ yandex3;
                    int i9 = yandex3 - iArr[i6];
                    int i10 = yandex4 & 31;
                    yandex3 = ((i9 << (32 - i10)) | (i9 >>> i10)) ^ yandex4;
                }
                m189default(yandex3 - ((int[]) this.f1119e)[0], i2, bArr2);
                m189default(yandex4 - ((int[]) this.f1119e)[1], i2 + 4, bArr2);
                return 8;
            default:
                int i11 = 1;
                if (this.f1118e) {
                    long billing = billing(i, bArr) + ((long[]) this.f1119e)[0];
                    long billing2 = billing(i + 8, bArr) + ((long[]) this.f1119e)[1];
                    int i12 = 1;
                    while (i12 <= this.f1117e) {
                        int i13 = i12 * 2;
                        long m188class = m188class(billing ^ billing2, billing2) + ((long[]) this.f1119e)[i13];
                        i12++;
                        billing2 = m188class(billing2 ^ m188class, m188class) + ((long[]) this.f1119e)[i13 + 1];
                        billing = m188class;
                    }
                    m186abstract(i2, billing, bArr2);
                    m186abstract(i2 + 8, billing2, bArr2);
                    return 16;
                }
                long billing3 = billing(i, bArr);
                long billing4 = billing(i + 8, bArr);
                int i14 = this.f1117e;
                while (i14 >= i11) {
                    long[] jArr = (long[]) this.f1119e;
                    int i15 = i14 * 2;
                    long j = billing4 - jArr[i15 + 1];
                    long j2 = billing3 & 63;
                    billing4 = ((j >>> ((int) j2)) | (j << ((int) (64 - j2)))) ^ billing3;
                    long j3 = billing3 - jArr[i15];
                    long j4 = billing4 & 63;
                    billing3 = ((j3 << ((int) (64 - j4))) | (j3 >>> ((int) j4))) ^ billing4;
                    i14--;
                    i11 = i11;
                }
                m186abstract(i2, billing3 - ((long[]) this.f1119e)[0], bArr2);
                m186abstract(i2 + 8, billing4 - ((long[]) this.f1119e)[i11], bArr2);
                return 16;
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public void m199throw(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 4;
            iArr2[i2] = iArr2[i2] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        int[] iArr3 = new int[(this.f1117e + 1) * 2];
        this.f1119e = iArr3;
        iArr3[0] = -1209970333;
        int i3 = 1;
        while (true) {
            iArr = (int[]) this.f1119e;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = iArr[i3 - 1] - 1640531527;
            i3++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length2; i8++) {
            int[] iArr4 = (int[]) this.f1119e;
            i5 = m192interface(iArr4[i4] + i5 + i6, 3);
            iArr4[i4] = i5;
            i6 = m192interface(iArr2[i7] + i5 + i6, i6 + i5);
            iArr2[i7] = i6;
            i4 = (i4 + 1) % ((int[]) this.f1119e).length;
            i7 = (i7 + 1) % length;
        }
    }

    /* renamed from: try, reason: not valid java name */
    public int m200try(long[] jArr, int i, int i2, String str) {
        remoteconfig(jArr);
        int i3 = this.f1117e;
        if (i3 == i) {
            m201while(i);
            return -1;
        }
        if ((i3 & 224) != i2) {
            throw AbstractC18489e.ad(this.f1117e, "start of ".concat(str));
        }
        int premium = (int) premium();
        inmobi();
        return premium;
    }

    @Override // defpackage.InterfaceC18180e
    public void vip() {
        ActionBarContextView.ad((ActionBarContextView) this.f1119e);
        this.f1118e = false;
    }

    /* renamed from: while, reason: not valid java name */
    public void m201while(int i) {
        if (this.f1117e == i) {
            inmobi();
            return;
        }
        throw AbstractC18489e.ad(this.f1117e, "byte " + AbstractC18489e.adcel(i));
    }
}
