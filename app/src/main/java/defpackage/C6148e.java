package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* renamed from: eؙؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6148e implements InterfaceC11306e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Serializable f12914e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f12915e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f12916e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f12917e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12918e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f12919e;

    public /* synthetic */ C6148e(int i) {
        this.f12918e = i;
    }

    public C6148e(Context context) {
        this.f12918e = 2;
        this.f12915e = 0;
        this.f12917e = context;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [byte[], java.io.Serializable] */
    public C6148e(InterfaceC2227e interfaceC2227e) {
        this.f12918e = 0;
        int isPro = (interfaceC2227e.isPro() * 8) / 2;
        if (isPro % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.f12917e = new byte[interfaceC2227e.isPro()];
        C10379e c10379e = new C10379e(4);
        c10379e.f20512e = interfaceC2227e;
        c10379e.f20509e = 1;
        c10379e.f20508e = new byte[interfaceC2227e.isPro()];
        c10379e.f20510e = new byte[interfaceC2227e.isPro()];
        c10379e.f20507e = new byte[interfaceC2227e.isPro()];
        this.f12919e = c10379e;
        this.f12915e = isPro / 8;
        this.f12914e = new byte[1];
        this.f12916e = 0;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [eِٓۖ, java.lang.Object] */
    public C6148e(InterfaceC12424e interfaceC12424e, Size size) {
        Rational rational;
        this.f12918e = 5;
        this.f12917e = interfaceC12424e;
        this.f12916e = interfaceC12424e.metrica();
        this.f12915e = interfaceC12424e.admob();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List mo3341class = interfaceC12424e.mo3341class(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            if (mo3341class.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(mo3341class, new C14912e(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f12914e = rational;
        ?? obj = new Object();
        obj.ad = interfaceC12424e.metrica();
        obj.vip = interfaceC12424e.admob();
        obj.license = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        obj.metrica = z;
        this.f12919e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6148e(byte[] bArr, byte[] bArr2, InterfaceC0293e interfaceC0293e) {
        this.f12918e = 3;
        this.f12917e = bArr;
        this.f12914e = bArr2;
        this.f12919e = interfaceC0293e;
    }

    public static HashMap adcel(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = billing(arrayList).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (AbstractC1146e.ad(size, rational, AbstractC2084e.metrica)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void amazon(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static String appmetrica(C14679e c14679e) {
        c14679e.ad();
        C18094e c18094e = c14679e.metrica;
        String str = c18094e.appmetrica;
        if (str != null) {
            return str;
        }
        c14679e.ad();
        String str2 = c18094e.vip;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static ArrayList billing(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(AbstractC1146e.ad);
        arrayList2.add(AbstractC1146e.metrica);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                    if (AbstractC1146e.ad(size, (Rational) it2.next(), AbstractC2084e.metrica)) {
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static void smaato(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static Rational startapp(int i, boolean z) {
        if (i == -1 || i == 0) {
            return z ? AbstractC1146e.ad : AbstractC1146e.vip;
        }
        if (i == 1) {
            return z ? AbstractC1146e.metrica : AbstractC1146e.license;
        }
        AbstractC9464e.adcel("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int ad(long j) {
        int i = this.f12916e + 1;
        long[] jArr = (long[]) this.f12917e;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            ?? r2 = new int[i2];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            AbstractC1660e.Signature(0, 0, (int[]) this.f12914e, r2, 14);
            this.f12917e = jArr2;
            this.f12914e = r2;
        }
        int i3 = this.f12916e;
        this.f12916e = i3 + 1;
        int length2 = ((int[]) this.f12919e).length;
        if (this.f12915e >= length2) {
            int i4 = length2 * 2;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr[i5] = i6;
                i5 = i6;
            }
            AbstractC1660e.Signature(0, 0, (int[]) this.f12919e, iArr, 14);
            this.f12919e = iArr;
        }
        int i7 = this.f12915e;
        int[] iArr2 = (int[]) this.f12919e;
        this.f12915e = iArr2[i7];
        long[] jArr3 = (long[]) this.f12917e;
        jArr3[i3] = j;
        ((int[]) this.f12914e)[i3] = i7;
        iArr2[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (AbstractC7890e.startapp(jArr3[i8], j) <= 0) {
                break;
            }
            loadAd(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public synchronized void advert() {
        PackageInfo purchase = purchase(((Context) this.f12917e).getPackageName());
        if (purchase != null) {
            this.f12914e = Integer.toString(purchase.versionCode);
            this.f12919e = purchase.versionName;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        int i2 = this.f12915e;
        byte[] bArr2 = (byte[]) this.f12917e;
        byte[] bArr3 = (byte[]) this.f12914e;
        C10379e c10379e = (C10379e) this.f12919e;
        int i3 = c10379e.f20509e;
        while (true) {
            int i4 = this.f12916e;
            if (i4 >= i3) {
                c10379e.m2805this(bArr3, 0, bArr2);
                ((InterfaceC2227e) c10379e.f20512e).tapsense(0, 0, (byte[]) c10379e.f20510e, bArr2);
                System.arraycopy(bArr2, 0, bArr, 0, i2);
                reset();
                return i2;
            }
            bArr3[i4] = 0;
            this.f12916e = i4 + 1;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        C10379e c10379e = (C10379e) this.f12919e;
        return ((InterfaceC2227e) c10379e.f20512e).getAlgorithmName() + "/CFB" + (c10379e.f20509e * 8);
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return this.f12915e;
    }

    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        reset();
        C10379e c10379e = (C10379e) this.f12919e;
        InterfaceC2227e interfaceC2227e = (InterfaceC2227e) c10379e.f20512e;
        InterfaceC2227e interfaceC2227e2 = (InterfaceC2227e) c10379e.f20512e;
        byte[] bArr = (byte[]) c10379e.f20510e;
        byte[] bArr2 = (byte[]) c10379e.f20508e;
        if (interfaceC3894e instanceof C11494e) {
            C11494e c11494e = (C11494e) interfaceC3894e;
            byte[] bArr3 = c11494e.f23095e;
            if (bArr3.length < bArr2.length) {
                System.arraycopy(bArr3, 0, bArr2, bArr2.length - bArr3.length, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr2, 0, bArr2.length);
            }
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            interfaceC2227e2.reset();
            interfaceC3894e = c11494e.f23094e;
        } else {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            interfaceC2227e2.reset();
        }
        interfaceC2227e.init(true, interfaceC3894e);
    }

    public synchronized String license() {
        try {
            if (((String) this.f12919e) == null) {
                advert();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f12919e;
    }

    public void loadAd(int i, int i2) {
        long[] jArr = (long[]) this.f12917e;
        int[] iArr = (int[]) this.f12914e;
        int[] iArr2 = (int[]) this.f12919e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public synchronized String metrica() {
        try {
            if (((String) this.f12914e) == null) {
                advert();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f12914e;
    }

    public boolean mopub() {
        int i;
        synchronized (this) {
            i = this.f12915e;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f12917e).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!AbstractC11765e.metrica()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f12915e = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (AbstractC11765e.metrica()) {
                            this.f12915e = 2;
                        } else {
                            this.f12915e = 1;
                        }
                        i = this.f12915e;
                    } else {
                        this.f12915e = 2;
                        i = 2;
                    }
                }
            }
        }
        return i != 0;
    }

    public PackageInfo purchase(String str) {
        try {
            return ((Context) this.f12917e).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f12914e;
            if (i >= bArr.length) {
                this.f12916e = 0;
                C10379e c10379e = (C10379e) this.f12919e;
                byte[] bArr2 = (byte[]) c10379e.f20508e;
                System.arraycopy(bArr2, 0, (byte[]) c10379e.f20510e, 0, bArr2.length);
                ((InterfaceC2227e) c10379e.f20512e).reset();
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    public String toString() {
        switch (this.f12918e) {
            case 1:
                StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
                int i = this.f12916e;
                if (i == 0) {
                    i = 0;
                }
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "UNKNOWN" : "API_VERSION" : "COMPILER_VERSION" : "LANGUAGE_VERSION");
                sb.append(", level=");
                int i2 = this.f12915e;
                int i3 = i2 != 0 ? i2 : 0;
                sb.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "HIDDEN" : "ERROR" : "WARNING");
                sb.append(", version=");
                C15486e c15486e = (C15486e) this.f12919e;
                if (c15486e == null) {
                    c15486e = null;
                }
                sb.append(c15486e);
                sb.append(", errorCode=");
                sb.append((Integer) this.f12917e);
                sb.append(", message=");
                return AbstractC4653e.applovin(sb, (String) this.f12914e, ')');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        int i = this.f12916e;
        byte[] bArr = (byte[]) this.f12914e;
        if (i == bArr.length) {
            ((C10379e) this.f12919e).m2805this(bArr, 0, (byte[]) this.f12917e);
            this.f12916e = 0;
        }
        int i2 = this.f12916e;
        this.f12916e = i2 + 1;
        bArr[i2] = b;
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.f12917e;
        byte[] bArr3 = (byte[]) this.f12914e;
        C10379e c10379e = (C10379e) this.f12919e;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i3 = c10379e.f20509e;
        int i4 = this.f12916e;
        int i5 = i3 - i4;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            c10379e.m2805this(bArr3, 0, bArr2);
            this.f12916e = 0;
            i2 -= i5;
            i += i5;
            while (i2 > i3) {
                c10379e.m2805this(bArr, i, bArr2);
                i2 -= i3;
                i += i3;
            }
        }
        System.arraycopy(bArr, i, bArr3, this.f12916e, i2);
        this.f12916e += i2;
    }

    public void vip(int i, boolean z, byte[] bArr) {
        int length = bArr.length - i;
        InterfaceC0293e interfaceC0293e = (InterfaceC0293e) this.f12919e;
        if (length < interfaceC0293e.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        byte[] bArr2 = (byte[]) this.f12917e;
        interfaceC0293e.update(bArr2, 0, bArr2.length);
        interfaceC0293e.update((byte) (this.f12916e >>> 24));
        interfaceC0293e.update((byte) (this.f12916e >>> 16));
        interfaceC0293e.update((byte) (this.f12916e >>> 8));
        interfaceC0293e.update((byte) this.f12916e);
        interfaceC0293e.update((byte) (this.f12915e >>> 8));
        interfaceC0293e.update((byte) this.f12915e);
        interfaceC0293e.update((byte) -1);
        byte[] bArr3 = (byte[]) this.f12914e;
        interfaceC0293e.update(bArr3, 0, bArr3.length);
        interfaceC0293e.doFinal(bArr, i);
        if (z) {
            this.f12915e++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (defpackage.AbstractC2084e.ad(r3) < (r4.getHeight() * r4.getWidth())) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List yandex(defpackage.InterfaceC12438e r14) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6148e.yandex(eّّٗ):java.util.List");
    }
}
