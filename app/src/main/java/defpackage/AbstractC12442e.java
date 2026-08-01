package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12442e {
    public static final C2892e ad = new C2892e(1600855987, false, new C11402e(17));
    public static final C2892e vip = new C2892e(-901648969, false, new C11402e(18));
    public static final C2892e metrica = new C2892e(246545514, false, new C11402e(19));
    public static final C2892e license = new C2892e(520968558, false, new C11402e(20));

    public static byte[] Signature(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        return bArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.metrica;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.ad - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.license;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.vip - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean ad(defpackage.C0763e r18, defpackage.C0763e r19, defpackage.C0763e r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = vip(r3, r2, r0)
            float r5 = r2.vip
            float r6 = r2.license
            float r7 = r2.ad
            float r2 = r2.metrica
            float r8 = r0.license
            float r9 = r0.vip
            float r10 = r0.metrica
            float r11 = r0.ad
            r12 = 0
            if (r4 != 0) goto La3
            boolean r0 = vip(r3, r1, r0)
            if (r0 != 0) goto L27
            goto La3
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L9c
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L44:
            if (r3 != r13) goto L9d
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L9c
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.metrica
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.ad
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.license
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L96
            float r1 = r1.vip
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L9c:
            return r18
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        La3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12442e.ad(eؒؐۥ, eؒؐۥ, eؒؐۥ, int):boolean");
    }

    public static byte[] adcel(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return license(bArr2);
        }
        if (bArr2 == null) {
            return license(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] admob(int i, int i2, byte[] bArr) {
        int tapsense = tapsense(i, i2);
        byte[] bArr2 = new byte[tapsense];
        System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, tapsense));
        return bArr2;
    }

    public static final boolean ads(int i, C0763e c0763e, C0763e c0763e2) {
        if (i == 3) {
            float f = c0763e2.metrica;
            float f2 = c0763e2.ad;
            float f3 = c0763e.metrica;
            return (f > f3 || f2 >= f3) && f2 > c0763e.ad;
        }
        if (i == 4) {
            float f4 = c0763e2.ad;
            float f5 = c0763e2.metrica;
            float f6 = c0763e.ad;
            return (f4 < f6 || f5 <= f6) && f5 < c0763e.metrica;
        }
        if (i == 5) {
            float f7 = c0763e2.license;
            float f8 = c0763e2.vip;
            float f9 = c0763e.license;
            return (f7 > f9 || f8 >= f9) && f8 > c0763e.vip;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f10 = c0763e2.vip;
        float f11 = c0763e2.license;
        float f12 = c0763e.vip;
        return (f10 < f12 || f11 <= f12) && f11 < c0763e.license;
    }

    public static byte[] advert(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null) {
            return mopub(bArr2, bArr3, bArr4);
        }
        if (bArr2 == null) {
            return mopub(bArr, bArr3, bArr4);
        }
        if (bArr3 == null) {
            return mopub(bArr, bArr2, bArr4);
        }
        if (bArr4 == null) {
            return mopub(bArr, bArr2, bArr3);
        }
        byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr5, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr5, length2, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, length2 + bArr3.length, bArr4.length);
        return bArr5;
    }

    public static boolean amazon(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("'a' cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (bArr.length - i < 0) {
            throw new IndexOutOfBoundsException("'aOff' value invalid for specified length");
        }
        if (i2 > bArr2.length - i) {
            throw new IndexOutOfBoundsException("'bOff' value invalid for specified length");
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 |= bArr[i4] ^ bArr2[i2 + i4];
        }
        return i3 == 0;
    }

    public static final boolean applovin(C0763e c0763e, C0763e c0763e2, C0763e c0763e3, int i) {
        if (!ads(i, c0763e, c0763e3)) {
            return false;
        }
        if (ads(i, c0763e2, c0763e3) && !ad(c0763e3, c0763e, c0763e2, i)) {
            return !ad(c0763e3, c0763e2, c0763e, i) && premium(i, c0763e3, c0763e) < premium(i, c0763e3, c0763e2);
        }
        return true;
    }

    public static int[] appmetrica(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static long[] billing(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length != jArr.length) {
            return purchase(jArr);
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        return jArr2;
    }

    /* renamed from: class, reason: not valid java name */
    public static boolean m3347class(int i, int i2, int i3, int i4) {
        return i2 > 0 && i4 > 0 && i - i3 < i4 && i3 - i < i2;
    }

    public static void crashlytics(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[length];
            bArr[length] = b;
            length--;
        }
    }

    public static final boolean firebase(int i, C7314e c7314e, C11795e c11795e, C0763e c0763e) {
        C11795e remoteconfig;
        C12431e c12431e = new C12431e(0, new C11795e[16]);
        if (!c11795e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitChildren called on an unattached node");
        }
        C12431e c12431e2 = new C12431e(0, new AbstractC13616e[16]);
        AbstractC13616e abstractC13616e = c11795e.f27022e;
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27024e;
        if (abstractC13616e2 == null) {
            AbstractC5851e.ad(c12431e2, abstractC13616e);
        } else {
            c12431e2.license(abstractC13616e2);
        }
        while (true) {
            int i2 = c12431e2.f24868e;
            if (i2 == 0) {
                break;
            }
            AbstractC13616e abstractC13616e3 = (AbstractC13616e) c12431e2.amazon(i2 - 1);
            if ((abstractC13616e3.f27020e & 1024) == 0) {
                AbstractC5851e.ad(c12431e2, abstractC13616e3);
            } else {
                while (true) {
                    if (abstractC13616e3 == null) {
                        break;
                    }
                    if ((abstractC13616e3.f27014e & 1024) != 0) {
                        C12431e c12431e3 = null;
                        while (abstractC13616e3 != null) {
                            if (abstractC13616e3 instanceof C11795e) {
                                C11795e c11795e2 = (C11795e) abstractC13616e3;
                                if (c11795e2.f27016e) {
                                    c12431e.license(c11795e2);
                                }
                            } else if ((abstractC13616e3.f27014e & 1024) != 0 && (abstractC13616e3 instanceof AbstractC6126e)) {
                                int i3 = 0;
                                for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e3).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                    if ((abstractC13616e4.f27014e & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC13616e3 = abstractC13616e4;
                                        } else {
                                            if (c12431e3 == null) {
                                                c12431e3 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e3 != null) {
                                                c12431e3.license(abstractC13616e3);
                                                abstractC13616e3 = null;
                                            }
                                            c12431e3.license(abstractC13616e4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC13616e3 = AbstractC5851e.vip(c12431e3);
                        }
                    } else {
                        abstractC13616e3 = abstractC13616e3.f27024e;
                    }
                }
            }
        }
        while (c12431e.f24868e != 0 && (remoteconfig = remoteconfig(c12431e, c0763e, i)) != null) {
            if (remoteconfig.m3238e().ad) {
                return ((Boolean) c7314e.invoke(remoteconfig)).booleanValue();
            }
            if (signatures(i, c7314e, remoteconfig, c0763e)) {
                return true;
            }
            c12431e.smaato(remoteconfig);
        }
        return false;
    }

    /* renamed from: goto, reason: not valid java name */
    public static final Boolean m3348goto(int i, C7314e c7314e, C11795e c11795e, C0763e c0763e) {
        int ordinal = c11795e.m3239e().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C11795e appmetrica = AbstractC11267e.appmetrica(c11795e);
                if (appmetrica == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = appmetrica.m3239e().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean m3348goto = m3348goto(i, c7314e, appmetrica, c0763e);
                        if (!AbstractC7890e.billing(m3348goto, Boolean.FALSE)) {
                            return m3348goto;
                        }
                        if (c0763e == null) {
                            if (appmetrica.m3239e() != EnumC16488e.f32314e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            C11795e metrica2 = AbstractC11267e.metrica(appmetrica);
                            if (metrica2 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            c0763e = AbstractC11267e.license(metrica2);
                        }
                        return Boolean.valueOf(signatures(i, c7314e, c11795e, c0763e));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new C14803e(10);
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (c0763e == null) {
                    c0763e = AbstractC11267e.license(appmetrica);
                }
                return Boolean.valueOf(signatures(i, c7314e, c11795e, c0763e));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c11795e.m3238e().ad ? (Boolean) c7314e.invoke(c11795e) : c0763e == null ? Boolean.valueOf(pro(c11795e, i, c7314e)) : Boolean.valueOf(firebase(i, c7314e, c11795e, c0763e));
                }
                throw new C14803e(10);
            }
        }
        return Boolean.valueOf(pro(c11795e, i, c7314e));
    }

    public static int inmobi(int[] iArr, int i) {
        if (iArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ iArr[i];
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public static final Collection m3349interface(Collection collection, Function1 function1) {
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i = C7495e.f15273e;
        C7495e billing = AbstractC9464e.billing();
        while (!linkedList.isEmpty()) {
            Object m3591interface = AbstractC13480e.m3591interface(linkedList);
            int i2 = C7495e.f15273e;
            C7495e billing2 = AbstractC9464e.billing();
            ArrayList billing3 = C14514e.billing(m3591interface, linkedList, function1, new C14772e(0, billing2));
            if (billing3.size() == 1 && billing2.isEmpty()) {
                billing.add(AbstractC13480e.m3589import(billing3));
            } else {
                Object remoteconfig = C14514e.remoteconfig(billing3, function1);
                InterfaceC6647e interfaceC6647e = (InterfaceC6647e) function1.invoke(remoteconfig);
                Iterator it = billing3.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!C14514e.mopub(interfaceC6647e, (InterfaceC6647e) function1.invoke(next))) {
                        billing2.add(next);
                    }
                }
                if (!billing2.isEmpty()) {
                    billing.addAll(billing2);
                }
                billing.add(remoteconfig);
            }
        }
        return billing;
    }

    public static int isPro(long[] jArr, int i) {
        if (jArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            long j = jArr[i];
            i2 = (((i2 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    public static int isVip(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static byte[] license(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static boolean loadAd(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr == bArr2) {
                return true;
            }
            int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
            int length2 = bArr.length ^ bArr2.length;
            for (int i = 0; i != length; i++) {
                length2 |= bArr[i] ^ bArr2[i];
            }
            while (length < bArr2.length) {
                byte b = bArr2[length];
                length2 |= b ^ (~b);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void metrica(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public static byte[] mopub(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return adcel(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return adcel(bArr, bArr3);
        }
        if (bArr3 == null) {
            return adcel(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static final long premium(int i, C0763e c0763e, C0763e c0763e2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f = c0763e.ad;
            f2 = c0763e2.metrica;
        } else if (i == 4) {
            f = c0763e2.ad;
            f2 = c0763e.metrica;
        } else if (i == 5) {
            f = c0763e.vip;
            f2 = c0763e2.license;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = c0763e2.vip;
            f2 = c0763e.license;
        }
        float f7 = f - f2;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        long j = f7;
        if (i == 3 || i == 4) {
            float f8 = c0763e.vip;
            f3 = 2;
            f4 = ((c0763e.license - f8) / f3) + f8;
            f5 = c0763e2.vip;
            f6 = c0763e2.license;
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f9 = c0763e.ad;
            f3 = 2;
            f4 = ((c0763e.metrica - f9) / f3) + f9;
            f5 = c0763e2.ad;
            f6 = c0763e2.metrica;
        }
        long j2 = f4 - (((f6 - f5) / f3) + f5);
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean pro(C11795e c11795e, int i, Function1 function1) {
        C0763e c0763e;
        C12431e c12431e = new C12431e(0, new C11795e[16]);
        startapp(c11795e, c12431e);
        int i2 = c12431e.f24868e;
        if (i2 <= 1) {
            C11795e c11795e2 = (C11795e) (i2 == 0 ? null : c12431e.f24870e[0]);
            if (c11795e2 != null) {
                return ((Boolean) function1.invoke(c11795e2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                C0763e license2 = AbstractC11267e.license(c11795e);
                float f = license2.ad;
                float f2 = license2.vip;
                c0763e = new C0763e(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                C0763e license3 = AbstractC11267e.license(c11795e);
                float f3 = license3.metrica;
                float f4 = license3.license;
                c0763e = new C0763e(f3, f4, f3, f4);
            }
            C11795e remoteconfig = remoteconfig(c12431e, c0763e, i);
            if (remoteconfig != null) {
                return ((Boolean) function1.invoke(remoteconfig)).booleanValue();
            }
        }
        return false;
    }

    public static long[] purchase(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static final C11795e remoteconfig(C12431e c12431e, C0763e c0763e, int i) {
        C0763e smaato;
        if (i == 3) {
            smaato = c0763e.smaato((c0763e.metrica - c0763e.ad) + 1, 0.0f);
        } else if (i == 4) {
            smaato = c0763e.smaato(-((c0763e.metrica - c0763e.ad) + 1), 0.0f);
        } else if (i == 5) {
            smaato = c0763e.smaato(0.0f, (c0763e.license - c0763e.vip) + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            smaato = c0763e.smaato(0.0f, -((c0763e.license - c0763e.vip) + 1));
        }
        Object[] objArr = c12431e.f24870e;
        int i2 = c12431e.f24868e;
        C11795e c11795e = null;
        for (int i3 = 0; i3 < i2; i3++) {
            C11795e c11795e2 = (C11795e) objArr[i3];
            if (AbstractC11267e.purchase(c11795e2)) {
                C0763e license2 = AbstractC11267e.license(c11795e2);
                if (applovin(license2, smaato, c0763e, i)) {
                    c11795e = c11795e2;
                    smaato = license2;
                }
            }
        }
        return c11795e;
    }

    public static final boolean signatures(int i, C7314e c7314e, C11795e c11795e, C0763e c0763e) {
        if (firebase(i, c7314e, c11795e, c0763e)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC8433e.vip(c11795e, i, new C5909e(((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner()).purchase(), c11795e, c0763e, i, c7314e, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static byte[] smaato(byte[][] bArr) {
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i += bArr[i2].length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 != bArr.length; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr[i4].length;
        }
        return bArr2;
    }

    public static final void startapp(C11795e c11795e, C12431e c12431e) {
        if (!c11795e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitChildren called on an unattached node");
        }
        C12431e c12431e2 = new C12431e(0, new AbstractC13616e[16]);
        AbstractC13616e abstractC13616e = c11795e.f27022e;
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27024e;
        if (abstractC13616e2 == null) {
            AbstractC5851e.ad(c12431e2, abstractC13616e);
        } else {
            c12431e2.license(abstractC13616e2);
        }
        while (true) {
            int i = c12431e2.f24868e;
            if (i == 0) {
                return;
            }
            AbstractC13616e abstractC13616e3 = (AbstractC13616e) c12431e2.amazon(i - 1);
            if ((abstractC13616e3.f27020e & 1024) == 0) {
                AbstractC5851e.ad(c12431e2, abstractC13616e3);
            } else {
                while (true) {
                    if (abstractC13616e3 == null) {
                        break;
                    }
                    if ((abstractC13616e3.f27014e & 1024) != 0) {
                        C12431e c12431e3 = null;
                        while (abstractC13616e3 != null) {
                            if (abstractC13616e3 instanceof C11795e) {
                                C11795e c11795e2 = (C11795e) abstractC13616e3;
                                if (c11795e2.f27016e && !AbstractC5851e.mopub(c11795e2).f27620e) {
                                    if (c11795e2.m3238e().ad) {
                                        c12431e.license(c11795e2);
                                    } else {
                                        startapp(c11795e2, c12431e);
                                    }
                                }
                            } else if ((abstractC13616e3.f27014e & 1024) != 0 && (abstractC13616e3 instanceof AbstractC6126e)) {
                                int i2 = 0;
                                for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e3).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                    if ((abstractC13616e4.f27014e & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            abstractC13616e3 = abstractC13616e4;
                                        } else {
                                            if (c12431e3 == null) {
                                                c12431e3 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e3 != null) {
                                                c12431e3.license(abstractC13616e3);
                                                abstractC13616e3 = null;
                                            }
                                            c12431e3.license(abstractC13616e4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC13616e3 = AbstractC5851e.vip(c12431e3);
                        }
                    } else {
                        abstractC13616e3 = abstractC13616e3.f27024e;
                    }
                }
            }
        }
    }

    public static byte[] subs(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i];
            i++;
        }
    }

    public static int[] subscription(int i, int i2, int[] iArr) {
        int tapsense = tapsense(i, i2);
        int[] iArr2 = new int[tapsense];
        System.arraycopy(iArr, i, iArr2, 0, Math.min(iArr.length - i, tapsense));
        return iArr2;
    }

    public static int tapsense(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        throw new IllegalArgumentException(i + " > " + i2);
    }

    /* renamed from: this, reason: not valid java name */
    public static C8780e m3350this(InterfaceC1108e interfaceC1108e, InterfaceC10540e interfaceC10540e, int i) {
        EnumC10668e enumC10668e = EnumC10668e.f21008e;
        if ((i & 2) != 0) {
            enumC10668e = EnumC10668e.f21011e;
        }
        EnumC10668e enumC10668e2 = enumC10668e;
        C15420e c15420e = AbstractC6731e.ad;
        C12940e c12940e = AbstractC1497e.ad;
        if (AbstractC3265e.amazon) {
            try {
                c12940e = c12940e.f25795e;
            } catch (C14596e | UnsupportedOperationException unused) {
                AbstractC3265e.amazon = false;
            }
        }
        return AbstractC7535e.metrica(new C14164e(interfaceC10540e, enumC10668e2, c12940e, interfaceC1108e, null, 7));
    }

    public static final boolean vip(int i, C0763e c0763e, C0763e c0763e2) {
        if (i == 3 || i == 4) {
            return c0763e.license > c0763e2.vip && c0763e.vip < c0763e2.license;
        }
        if (i == 5 || i == 6) {
            return c0763e.metrica > c0763e2.ad && c0763e.ad < c0763e2.metrica;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static short[] yandex(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }
}
