package defpackage;

import android.content.SharedPreferences;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17808e {
    public static final int[] ad = {1, 0, 0, -1, -1, -1, -1};
    public static final int[] vip = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    public static final int[] metrica = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static final void Signature(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        RunnableC11327e runnableC11327e = new RunnableC11327e(10, level, exc, str, objArr, false);
        int i = AbstractC9855e.ad;
        C17823e vip2 = AbstractC5076e.vip();
        Object obj = vip2.vip;
        if (obj == null || obj == C13169e.f26148e) {
            obj = C5517e.license(vip2);
        }
        executor.execute(new RunnableC11666e(24, new Object(), obj, runnableC11327e));
    }

    public static void ad(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC12947e.vip(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && AbstractC12947e.amazon(iArr3, ad))) {
            vip(iArr3);
        }
    }

    public static void adcel(C17424e c17424e, C10312e c10312e, C4536e c4536e, byte[] bArr) {
        C3599e ads = c17424e.ads();
        byte[] ad2 = c4536e.ad(ads.appmetrica(), bArr);
        C7813e subs = C2456e.subs();
        C2096e yandex = AbstractC10498e.yandex(0, ad2.length, ad2);
        subs.appmetrica();
        C2456e.applovin((C2456e) subs.f9709e, yandex);
        C12859e ad3 = AbstractC4200e.ad(ads);
        subs.appmetrica();
        C2456e.ads((C2456e) subs.f9709e, ad3);
        if (!((SharedPreferences.Editor) c10312e.f20360e).putString((String) c10312e.f20361e, AbstractC5706e.license(((C2456e) subs.ad()).appmetrica())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public static final ArrayList advert(C10068e c10068e, List list, boolean z) {
        if (!z) {
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC5372e adcel = AbstractC11866e.adcel(c10068e, (InterfaceC13984e) it.next(), false);
                if (adcel == null) {
                    return null;
                }
                arrayList.add(adcel);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC13984e interfaceC13984e = (InterfaceC13984e) it2.next();
            InterfaceC5372e adcel2 = AbstractC11866e.adcel(c10068e, interfaceC13984e, true);
            if (adcel2 == null) {
                AbstractC14161e.yandex(AbstractC14161e.appmetrica(interfaceC13984e));
                throw null;
            }
            arrayList2.add(adcel2);
        }
        return arrayList2;
    }

    public static void amazon(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC12947e.inmobi(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) + 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = ((4294967295L & iArr3[3]) - 1) + j2;
            iArr3[3] = (int) j5;
            if ((j5 >> 32) != 0) {
                AbstractC12797e.yandex(7, 4, iArr3);
            }
        }
    }

    public static void appmetrica(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        AbstractC12947e.subscription(iArr, iArr2, iArr4);
        yandex(iArr4, iArr3);
    }

    public static C17424e billing(C7850e c7850e, C4536e c4536e, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) c7850e.f15896e;
        try {
            C2456e crashlytics = C2456e.crashlytics(byteArrayInputStream, C5712e.ad());
            byteArrayInputStream.close();
            if (crashlytics.premium().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                C3599e m1381goto = C3599e.m1381goto(c4536e.vip(crashlytics.premium().adcel(), bArr), C5712e.ad());
                if (m1381goto == null || m1381goto.subs() <= 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                return C17424e.isVip(m1381goto);
            } catch (C8868e unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static InterfaceC8850e license(InterfaceC5972e interfaceC5972e, InterfaceC1598e interfaceC1598e) {
        if (interfaceC1598e instanceof C15553e) {
            C15553e c15553e = (C15553e) interfaceC1598e;
            InterfaceC1598e key = interfaceC5972e.getKey();
            if ((key != c15553e && c15553e.f30707e != key) || ((InterfaceC4595e) c15553e.f30708e.invoke(interfaceC5972e)) == null) {
                return interfaceC5972e;
            }
        } else if (C12575e.f25235e != interfaceC1598e) {
            return interfaceC5972e;
        }
        return C2693e.f6576e;
    }

    public static void loadAd(int[] iArr, int[] iArr2) {
        if (AbstractC12797e.subs(7, 0, iArr, iArr2) != 0 || (iArr2[6] == -1 && AbstractC12947e.amazon(iArr2, ad))) {
            vip(iArr2);
        }
    }

    public static InterfaceC4595e metrica(InterfaceC5972e interfaceC5972e, InterfaceC1598e interfaceC1598e) {
        InterfaceC4595e interfaceC4595e;
        if (!(interfaceC1598e instanceof C15553e)) {
            if (C12575e.f25235e == interfaceC1598e) {
                return interfaceC5972e;
            }
            return null;
        }
        C15553e c15553e = (C15553e) interfaceC1598e;
        InterfaceC1598e key = interfaceC5972e.getKey();
        if ((key == c15553e || c15553e.f30707e == key) && (interfaceC4595e = (InterfaceC4595e) c15553e.f30708e.invoke(interfaceC5972e)) != null) {
            return interfaceC4595e;
        }
        return null;
    }

    public static final InterfaceC5372e mopub(InterfaceC7227e interfaceC7227e) {
        InterfaceC5372e ad2 = AbstractC7354e.ad(interfaceC7227e, new InterfaceC5372e[0]);
        return ad2 == null ? (InterfaceC5372e) AbstractC7396e.ad.get(interfaceC7227e) : ad2;
    }

    public static final InterfaceC5372e purchase(InterfaceC7227e interfaceC7227e, ArrayList arrayList, Function0 function0) {
        InterfaceC5372e c13758e;
        InterfaceC5372e c10721e;
        C12232e c12232e = AbstractC3820e.ad;
        if (AbstractC7890e.billing(interfaceC7227e, c12232e.vip(Collection.class)) || AbstractC7890e.billing(interfaceC7227e, c12232e.vip(List.class)) || AbstractC7890e.billing(interfaceC7227e, c12232e.vip(List.class)) || AbstractC7890e.billing(interfaceC7227e, c12232e.vip(ArrayList.class))) {
            c13758e = new C13758e((InterfaceC5372e) arrayList.get(0), 0);
        } else if (AbstractC7890e.billing(interfaceC7227e, c12232e.vip(HashSet.class))) {
            c13758e = new C13758e((InterfaceC5372e) arrayList.get(0), 1);
        } else if (AbstractC7890e.billing(interfaceC7227e, c12232e.vip(Set.class)) || AbstractC7890e.billing(interfaceC7227e, c12232e.vip(Set.class)) || AbstractC7890e.billing(interfaceC7227e, c12232e.vip(LinkedHashSet.class))) {
            c13758e = new C13758e((InterfaceC5372e) arrayList.get(0), 2);
        } else if (AbstractC7890e.billing(interfaceC7227e, c12232e.vip(HashMap.class))) {
            c13758e = new C17327e((InterfaceC5372e) arrayList.get(0), (InterfaceC5372e) arrayList.get(1), 0);
        } else if (AbstractC7890e.billing(interfaceC7227e, c12232e.vip(Map.class)) || AbstractC7890e.billing(interfaceC7227e, c12232e.vip(Map.class)) || AbstractC7890e.billing(interfaceC7227e, c12232e.vip(LinkedHashMap.class))) {
            c13758e = new C17327e((InterfaceC5372e) arrayList.get(0), (InterfaceC5372e) arrayList.get(1), 1);
        } else {
            if (AbstractC7890e.billing(interfaceC7227e, c12232e.vip(Map.Entry.class))) {
                c10721e = new C4336e((InterfaceC5372e) arrayList.get(0), (InterfaceC5372e) arrayList.get(1), 0);
            } else if (AbstractC7890e.billing(interfaceC7227e, c12232e.vip(C6571e.class))) {
                c10721e = new C4336e((InterfaceC5372e) arrayList.get(0), (InterfaceC5372e) arrayList.get(1), 1);
            } else if (AbstractC7890e.billing(interfaceC7227e, c12232e.vip(C10985e.class))) {
                c13758e = new C2699e((InterfaceC5372e) arrayList.get(0), (InterfaceC5372e) arrayList.get(1), (InterfaceC5372e) arrayList.get(2));
            } else if (((InterfaceC18155e) interfaceC7227e).subs().isArray()) {
                c10721e = new C10721e((InterfaceC7227e) function0.invoke(), (InterfaceC5372e) arrayList.get(0));
            } else {
                c13758e = null;
            }
            c13758e = c10721e;
        }
        if (c13758e != null) {
            return c13758e;
        }
        InterfaceC5372e[] interfaceC5372eArr = (InterfaceC5372e[]) arrayList.toArray(new InterfaceC5372e[0]);
        return AbstractC7354e.ad(interfaceC7227e, (InterfaceC5372e[]) Arrays.copyOf(interfaceC5372eArr, interfaceC5372eArr.length));
    }

    public static void smaato(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        AbstractC12947e.isVip(iArr, iArr3);
        yandex(iArr3, iArr2);
    }

    public static void startapp(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) - j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = (4294967295L & iArr[3]) + j2 + j4;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || AbstractC12797e.tapsense(7, 4, iArr) == 0) && !(iArr[6] == -1 && AbstractC12947e.amazon(iArr, ad))) {
            return;
        }
        vip(iArr);
    }

    public static void vip(int[] iArr) {
        long j = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = (4294967295L & iArr[3]) + 1 + j2;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            AbstractC12797e.tapsense(7, 4, iArr);
        }
    }

    public static void yandex(int[] iArr, int[] iArr2) {
        long j = iArr[10] & 4294967295L;
        long j2 = iArr[11] & 4294967295L;
        long j3 = iArr[12] & 4294967295L;
        long j4 = iArr[13] & 4294967295L;
        long j5 = ((iArr[7] & 4294967295L) + j2) - 1;
        long j6 = (iArr[8] & 4294967295L) + j3;
        long j7 = (iArr[9] & 4294967295L) + j4;
        long j8 = (iArr[0] & 4294967295L) - j5;
        long j9 = j8 & 4294967295L;
        long j10 = ((iArr[1] & 4294967295L) - j6) + (j8 >> 32);
        int i = (int) j10;
        iArr2[1] = i;
        long j11 = ((iArr[2] & 4294967295L) - j7) + (j10 >> 32);
        int i2 = (int) j11;
        iArr2[2] = i2;
        long j12 = (((iArr[3] & 4294967295L) + j5) - j) + (j11 >> 32);
        long j13 = j12 & 4294967295L;
        long j14 = (((iArr[4] & 4294967295L) + j6) - j2) + (j12 >> 32);
        iArr2[4] = (int) j14;
        long j15 = (((iArr[5] & 4294967295L) + j7) - j3) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = (((iArr[6] & 4294967295L) + j) - j4) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = (j16 >> 32) + 1;
        long j18 = j13 + j17;
        long j19 = j9 - j17;
        iArr2[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (i & 4294967295L);
            iArr2[1] = (int) j21;
            long j22 = (j21 >> 32) + (i2 & 4294967295L);
            iArr2[2] = (int) j22;
            j18 += j22 >> 32;
        }
        iArr2[3] = (int) j18;
        if (((j18 >> 32) == 0 || AbstractC12797e.tapsense(7, 4, iArr2) == 0) && !(iArr2[6] == -1 && AbstractC12947e.amazon(iArr2, ad))) {
            return;
        }
        vip(iArr2);
    }
}
