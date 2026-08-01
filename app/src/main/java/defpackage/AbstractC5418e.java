package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5418e {
    public static final int[] ad = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] vip = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.ArrayList] */
    public static final void ad(int i, final long j, C13770e c13770e, InterfaceC3997e interfaceC3997e, Function2 function2) {
        Collection collection;
        Object next;
        C6571e c6571e;
        ?? singletonList;
        Collection collection2;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(361732211);
        int i2 = 16;
        Function2 function22 = function2;
        int i3 = i | (c13770e.purchase(interfaceC3997e) ? 4 : 2) | (c13770e2.appmetrica(j) ? 32 : 16) | (c13770e2.yandex(function22) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if ((i3 & 147) == 146 && c13770e2.ads()) {
            c13770e2.m3659default();
        } else {
            if (interfaceC3997e instanceof C6883e) {
                collection2 = Collections.singletonList(new C16109e(j));
            } else {
                boolean z = false;
                if (!(interfaceC3997e instanceof C14724e)) {
                    if (!(interfaceC3997e instanceof C16576e)) {
                        throw new C14803e(10);
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        c13770e2.m3676strictfp(292006649);
                        c13770e2.Signature(false);
                        collection2 = ((C16576e) interfaceC3997e).ad;
                    } else {
                        c13770e2.m3676strictfp(292075221);
                        Set set = ((C16576e) interfaceC3997e).ad;
                        long j2 = ((C16109e) AbstractC13480e.m3577else(set, AbstractC0258e.ad(new C14099e(15), new C14099e(i2))).get(0)).ad;
                        ArrayList metrica = AbstractC14114e.metrica((Bundle) c13770e2.adcel(AbstractC3860e.ad));
                        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(metrica, 10));
                        Iterator it = metrica.iterator();
                        while (it.hasNext()) {
                            Set set2 = set;
                            long j3 = ((C16109e) it.next()).ad;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = set2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                boolean z2 = z;
                                long j4 = j2;
                                long j5 = ((C16109e) it2.next()).ad;
                                ArrayList arrayList3 = arrayList2;
                                float f = 1;
                                if (((float) Math.ceil(C16109e.vip(j3))) + f <= C16109e.vip(j5) || ((float) Math.ceil(C16109e.ad(j3))) + f <= C16109e.ad(j5)) {
                                    c6571e = null;
                                } else {
                                    C16109e c16109e = new C16109e(j5);
                                    float vip2 = C16109e.vip(j3) - C16109e.vip(j5);
                                    float ad2 = C16109e.ad(j3) - C16109e.ad(j5);
                                    c6571e = new C6571e(c16109e, Float.valueOf((ad2 * ad2) + (vip2 * vip2)));
                                }
                                if (c6571e != null) {
                                    arrayList3.add(c6571e);
                                }
                                arrayList2 = arrayList3;
                                z = z2;
                                j2 = j4;
                            }
                            boolean z3 = z;
                            long j6 = j2;
                            Iterator it3 = arrayList2.iterator();
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (it3.hasNext()) {
                                    float floatValue = ((Number) ((C6571e) next).f13543e).floatValue();
                                    do {
                                        Object next2 = it3.next();
                                        float floatValue2 = ((Number) ((C6571e) next2).f13543e).floatValue();
                                        if (Float.compare(floatValue, floatValue2) > 0) {
                                            next = next2;
                                            floatValue = floatValue2;
                                        }
                                    } while (it3.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            C6571e c6571e2 = (C6571e) next;
                            C16109e c16109e2 = c6571e2 != null ? (C16109e) c6571e2.f13544e : null;
                            arrayList.add(new C16109e(c16109e2 != null ? c16109e2.ad : j6));
                            set = set2;
                            z = z3;
                            j2 = j6;
                        }
                        boolean z4 = z;
                        long j7 = j2;
                        if (arrayList.isEmpty()) {
                            C16109e c16109e3 = new C16109e(j7);
                            C16109e c16109e4 = new C16109e(j7);
                            C16109e[] c16109eArr = new C16109e[2];
                            c16109eArr[z4 ? 1 : 0] = c16109e3;
                            c16109eArr[1] = c16109e4;
                            collection = AbstractC6874e.startapp(c16109eArr);
                        } else {
                            collection = arrayList;
                        }
                        c13770e2.Signature(z4);
                        collection2 = collection;
                    }
                } else if (Build.VERSION.SDK_INT >= 31) {
                    c13770e2.m3676strictfp(291633998);
                    Bundle bundle = (Bundle) c13770e2.adcel(AbstractC3860e.ad);
                    boolean z5 = (i3 & 112) == 32;
                    Object m3681throw = c13770e2.m3681throw();
                    if (z5 || m3681throw == C2987e.ad) {
                        m3681throw = new Function0() { // from class: eؑۘۥ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return new C16109e(j);
                            }
                        };
                        c13770e2.m3682throws(m3681throw);
                    }
                    Function0 function0 = (Function0) m3681throw;
                    ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i4 = bundle.getInt("appWidgetMinHeight", 0);
                        int i5 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i6 = bundle.getInt("appWidgetMinWidth", 0);
                        int i7 = bundle.getInt("appWidgetMaxWidth", 0);
                        singletonList = (i4 == 0 || i5 == 0 || i6 == 0 || i7 == 0) ? Collections.singletonList(function0.invoke()) : AbstractC6874e.startapp(new C16109e(AbstractC11160e.ad(i6, i5)), new C16109e(AbstractC11160e.ad(i7, i4)));
                    } else {
                        singletonList = new ArrayList(AbstractC0746e.subscription(parcelableArrayList, 10));
                        for (SizeF sizeF : parcelableArrayList) {
                            singletonList.add(new C16109e(AbstractC11160e.ad(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    c13770e2.Signature(false);
                    collection2 = singletonList;
                } else {
                    c13770e2.m3676strictfp(291738344);
                    ArrayList metrica2 = AbstractC14114e.metrica((Bundle) c13770e2.adcel(AbstractC3860e.ad));
                    boolean isEmpty = metrica2.isEmpty();
                    Collection collection3 = metrica2;
                    if (isEmpty) {
                        collection3 = Collections.singletonList(new C16109e(j));
                    }
                    c13770e2.Signature(false);
                    collection2 = collection3;
                }
            }
            List premium = AbstractC13480e.premium(collection2);
            ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(premium, 10));
            Iterator it4 = premium.iterator();
            while (it4.hasNext()) {
                vip((i3 & 896) | ((i3 << 3) & 112), ((C16109e) it4.next()).ad, c13770e2, interfaceC3997e, function22);
                arrayList4.add(Unit.INSTANCE);
                c13770e2 = c13770e;
                function22 = function2;
            }
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4554e(interfaceC3997e, j, function2, i);
        }
    }

    public static void adcel(C2125e c2125e) {
        int billing = c2125e.billing(6);
        if (billing < 2 || billing > 42) {
            throw C15125e.metrica(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(billing)));
        }
        c2125e.loadAd(billing * 8);
    }

    public static boolean appmetrica(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (vip[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static void billing(C2125e c2125e, C11420e c11420e) {
        int billing = c2125e.billing(5);
        c2125e.loadAd(2);
        if (c2125e.purchase()) {
            c2125e.loadAd(5);
        }
        if (billing >= 7 && billing <= 10) {
            c2125e.amazon();
        }
        if (c2125e.purchase()) {
            int billing2 = c2125e.billing(3);
            if (c11420e.vip == -1 && billing >= 0 && billing <= 15 && (billing2 == 0 || billing2 == 1)) {
                c11420e.vip = billing;
            }
            if (c2125e.purchase()) {
                adcel(c2125e);
            }
        }
    }

    public static void license(int i, C1292e c1292e) {
        c1292e.m564extends(7);
        byte[] bArr = c1292e.ad;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static final Object metrica(ListenableFuture listenableFuture, AbstractC10731e abstractC10731e) {
        try {
            if (listenableFuture.isDone()) {
                return AbstractC7904e.billing(listenableFuture);
            }
            C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(abstractC10731e));
            c13578e.tapsense();
            listenableFuture.ad(new RunnableC17144e(listenableFuture, c13578e, 23), EnumC11588e.f23273e);
            c13578e.inmobi(new C17097e(24, listenableFuture));
            return c13578e.signatures();
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC5204e mopub(InterfaceC2283e interfaceC2283e, boolean z, boolean z2) {
        InterfaceC5204e interfaceC5204e;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        long j2;
        int i5;
        int[] iArr;
        long length = interfaceC2283e.getLength();
        long j3 = -1;
        int i6 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j4 = 4096;
        if (i6 != 0 && length <= 4096) {
            j4 = length;
        }
        int i7 = (int) j4;
        C1292e c1292e = new C1292e(64);
        int i8 = 0;
        int i9 = 0;
        boolean z3 = false;
        while (i9 < i7) {
            c1292e.m564extends(8);
            if (!interfaceC2283e.billing(c1292e.ad, i8, 8, true)) {
                break;
            }
            long subs = c1292e.subs();
            int smaato = c1292e.smaato();
            if (subs == 1) {
                j = j3;
                interfaceC2283e.ad(8, 8, c1292e.ad);
                i3 = 16;
                c1292e.m572while(16);
                subs = c1292e.signatures();
                i2 = i9;
            } else {
                j = j3;
                if (subs == 0) {
                    long length2 = interfaceC2283e.getLength();
                    if (length2 != j) {
                        i2 = i9;
                        subs = (length2 - interfaceC2283e.yandex()) + 8;
                        i3 = 8;
                    }
                }
                i2 = i9;
                i3 = 8;
            }
            long j5 = subs;
            long j6 = i3;
            if (j5 < j6) {
                interfaceC5204e = null;
                if (smaato != 1718773093 || i3 != 8) {
                    return new C9128e(smaato, j5, i3);
                }
                j5 = j6;
            } else {
                interfaceC5204e = null;
            }
            int i10 = i2 + i3;
            if (smaato == 1836019574 || smaato == 1970628964) {
                i7 += (int) j5;
                i4 = i6;
                if (i6 != 0 && i7 > length) {
                    i7 = (int) length;
                }
                if (smaato == 1836019574) {
                    i9 = i10;
                    i6 = i4;
                    j3 = j;
                    i8 = 0;
                }
            } else {
                i4 = i6;
            }
            if (smaato != 1953653099 && smaato != 1835297121 && smaato != 1835626086) {
                if (smaato != 1836019558 && smaato != 1836475768) {
                    if (smaato == 1835295092) {
                        z3 = true;
                    }
                    if (smaato != 1937007212 || j5 <= 1000000) {
                        j2 = length;
                        if ((i10 + j5) - j6 < i7) {
                            int i11 = (int) (j5 - j6);
                            i9 = i10 + i11;
                            if (smaato != 1718909296) {
                                i5 = 0;
                                if (i11 != 0) {
                                    interfaceC2283e.startapp(i11);
                                }
                            } else {
                                if (i11 < 8) {
                                    return new C9128e(smaato, i11, 8);
                                }
                                c1292e.m564extends(i11);
                                i5 = 0;
                                interfaceC2283e.ad(0, i11, c1292e.ad);
                                int smaato2 = c1292e.smaato();
                                if (appmetrica(smaato2, z2)) {
                                    z3 = true;
                                }
                                c1292e.m568protected(4);
                                int ad2 = c1292e.ad() / 4;
                                if (!z3 && ad2 > 0) {
                                    iArr = new int[ad2];
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= ad2) {
                                            break;
                                        }
                                        int smaato3 = c1292e.smaato();
                                        iArr[i12] = smaato3;
                                        if (appmetrica(smaato3, z2)) {
                                            z3 = true;
                                            break;
                                        }
                                        i12++;
                                    }
                                } else {
                                    iArr = interfaceC5204e;
                                }
                                if (!z3) {
                                    return new C13572e(iArr, smaato2);
                                }
                            }
                        }
                    }
                    i = 0;
                    break;
                }
                i = 1;
                break;
            }
            j2 = length;
            i5 = 0;
            i9 = i10;
            i8 = i5;
            i6 = i4;
            j3 = j;
            length = j2;
        }
        interfaceC5204e = null;
        i = i8;
        return !z3 ? C6114e.f12854e : z != i ? i != 0 ? C13875e.f27484e : C13875e.f27482e : interfaceC5204e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9.purchase() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r9.billing(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r9.purchase() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r9.billing(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r9.loadAd(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9.purchase() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r9 = r9.billing(4);
        r8 = defpackage.AbstractC5418e.ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r5 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r9 != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r9 = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        return new defpackage.C3900e(r5, r0, r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r5 != 48000) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r9 >= 14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        r6 = r8[r9];
        r2 = r2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r2 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r2 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r2 == 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r2 == 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        r9 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0055, code lost:
    
        r5 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r9.billing(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r9.billing(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C3900e purchase(defpackage.C2125e r9) {
        /*
            r0 = 16
            int r1 = r9.billing(r0)
            int r0 = r9.billing(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.billing(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.billing(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.billing(r1)
            boolean r2 = r9.purchase()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.billing(r2)
            boolean r5 = r9.purchase()
            if (r5 == 0) goto L47
            int r5 = r9.billing(r4)
            if (r5 <= 0) goto L47
            r9.loadAd(r1)
        L47:
            boolean r5 = r9.purchase()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.billing(r3)
            int[] r8 = defpackage.AbstractC5418e.ad
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            eؖؗؖ r1 = new eؖؗؖ
            r2 = 0
            r1.<init>(r5, r0, r9, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5418e.purchase(eَؓ۟):eؖؗؖ");
    }

    public static Object startapp(Function2 function2) {
        return AbstractC5336e.yandex(C2693e.f6576e, function2);
    }

    public static final void vip(int i, long j, C13770e c13770e, InterfaceC3997e interfaceC3997e, Function2 function2) {
        c13770e.m3671package(-771692794);
        int i2 = (c13770e.appmetrica(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c13770e.purchase(interfaceC3997e) : c13770e.yandex(interfaceC3997e) ? 32 : 16;
        }
        if (((i2 | (c13770e.yandex(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128)) & 147) == 146 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            AbstractC1101e.ad(AbstractC4449e.ad.ad(new C16109e(j)), AbstractC16653e.license(-367769018, new C4554e(function2, j, interfaceC3997e), c13770e), c13770e, 56);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16309e(j, interfaceC3997e, function2, i, 2);
        }
    }

    public static void yandex(C2125e c2125e, C11420e c11420e) {
        c2125e.loadAd(2);
        boolean purchase = c2125e.purchase();
        int billing = c2125e.billing(8);
        for (int i = 0; i < billing; i++) {
            c2125e.loadAd(2);
            if (c2125e.purchase()) {
                c2125e.loadAd(5);
            }
            if (purchase) {
                c2125e.loadAd(24);
            } else {
                if (c2125e.purchase()) {
                    if (!c2125e.purchase()) {
                        c2125e.loadAd(4);
                    }
                    c11420e.metrica = c2125e.billing(6) + 1;
                }
                c2125e.loadAd(4);
            }
        }
        if (c2125e.purchase()) {
            c2125e.loadAd(3);
            if (c2125e.purchase()) {
                adcel(c2125e);
            }
        }
    }
}
