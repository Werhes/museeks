package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14514e {
    public static final C0136e license;
    public static final C14514e metrica;
    public static final List vip = AbstractC13480e.m3575continue(ServiceLoader.load(InterfaceC12822e.class, InterfaceC12822e.class.getClassLoader()));
    public final InterfaceC15558e ad;

    static {
        C0136e c0136e = new C0136e(5);
        license = c0136e;
        metrica = new C14514e(c0136e);
    }

    public C14514e(InterfaceC15558e interfaceC15558e) {
        if (interfaceC15558e != null) {
            this.ad = interfaceC15558e;
        } else {
            ad(5);
            throw null;
        }
    }

    public static boolean Signature(InterfaceC6647e interfaceC6647e, InterfaceC6647e interfaceC6647e2) {
        if (interfaceC6647e == null) {
            ad(67);
            throw null;
        }
        if (interfaceC6647e2 != null) {
            Integer vip2 = AbstractC6050e.vip(interfaceC6647e.advert(), interfaceC6647e2.advert());
            return vip2 == null || vip2.intValue() >= 0;
        }
        ad(68);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x0263. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x0266. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x0269. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0275 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void ad(int r25) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14514e.ad(int):void");
    }

    public static int adcel(InterfaceC6647e interfaceC6647e, InterfaceC6647e interfaceC6647e2) {
        C14514e c14514e = metrica;
        int vip2 = c14514e.advert(interfaceC6647e2, interfaceC6647e, null).vip();
        int vip3 = c14514e.smaato(interfaceC6647e, interfaceC6647e2, null, false).vip();
        if (vip2 == 1 && vip3 == 1) {
            return 1;
        }
        return (vip2 == 3 || vip3 == 3) ? 3 : 2;
    }

    public static boolean admob(InterfaceC6647e interfaceC6647e, InterfaceC6647e interfaceC6647e2) {
        C5438e c5438e = C5438e.f11673e;
        if (interfaceC6647e == null) {
            ad(13);
            throw null;
        }
        if (interfaceC6647e2 == null) {
            ad(14);
            throw null;
        }
        if (!interfaceC6647e.equals(interfaceC6647e2) && c5438e.amazon(interfaceC6647e.vip(), interfaceC6647e2.vip(), false)) {
            return true;
        }
        InterfaceC6647e vip2 = interfaceC6647e2.vip();
        int i = AbstractC14300e.ad;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC14300e.vip(interfaceC6647e.vip(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (c5438e.amazon(vip2, (InterfaceC6647e) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void appmetrica(Collection collection, InterfaceC5052e interfaceC5052e, AbstractC15890e abstractC15890e) {
        if (collection == null) {
            ad(83);
            throw null;
        }
        if (interfaceC5052e == null) {
            ad(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            int i = 3;
            boolean z = false;
            if (!it.hasNext()) {
                boolean isEmpty = arrayList.isEmpty();
                if (!isEmpty) {
                    collection = arrayList;
                }
                Iterator it2 = collection.iterator();
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (it2.hasNext()) {
                        InterfaceC0390e interfaceC0390e = (InterfaceC0390e) it2.next();
                        int m2467class = AbstractC8703e.m2467class(interfaceC0390e.mo1718extends());
                        if (m2467class == 0) {
                            i = 1;
                            break;
                        }
                        if (m2467class == 1) {
                            throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC0390e);
                        }
                        if (m2467class == 2) {
                            z2 = true;
                        } else if (m2467class == 3) {
                            z3 = true;
                        }
                    } else {
                        if (interfaceC5052e.mo1942e() && interfaceC5052e.mo1718extends() != 4 && interfaceC5052e.mo1718extends() != 2) {
                            z = true;
                        }
                        if (!z2 || z3) {
                            if (z2 || !z3) {
                                HashSet<InterfaceC0390e> hashSet = new HashSet();
                                for (InterfaceC0390e interfaceC0390e2 : collection) {
                                    if (interfaceC0390e2 == null) {
                                        ad(15);
                                        throw null;
                                    }
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    metrica(interfaceC0390e2, linkedHashSet);
                                    hashSet.addAll(linkedHashSet);
                                }
                                if (!hashSet.isEmpty()) {
                                    InterfaceC15498e interfaceC15498e = (InterfaceC15498e) hashSet.iterator().next();
                                    int i2 = AbstractC2876e.ad;
                                    if (AbstractC14300e.metrica(interfaceC15498e).mo1887e(AbstractC7763e.ad) != null) {
                                        throw new ClassCastException();
                                    }
                                }
                                if (hashSet.size() > 1) {
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                    Iterator it3 = hashSet.iterator();
                                    while (it3.hasNext()) {
                                        Object next = it3.next();
                                        Iterator it4 = linkedHashSet2.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                linkedHashSet2.add(next);
                                                break;
                                            }
                                            InterfaceC6647e interfaceC6647e = (InterfaceC6647e) next;
                                            InterfaceC6647e interfaceC6647e2 = (InterfaceC6647e) it4.next();
                                            if (!admob(interfaceC6647e, interfaceC6647e2)) {
                                                if (admob(interfaceC6647e2, interfaceC6647e)) {
                                                    break;
                                                }
                                            } else {
                                                it4.remove();
                                            }
                                        }
                                    }
                                    hashSet = linkedHashSet2;
                                }
                                int mo1718extends = interfaceC5052e.mo1718extends();
                                if (mo1718extends == 0) {
                                    ad(92);
                                    throw null;
                                }
                                i = 4;
                                for (InterfaceC0390e interfaceC0390e3 : hashSet) {
                                    int mo1718extends2 = (z && interfaceC0390e3.mo1718extends() == 4) ? mo1718extends : interfaceC0390e3.mo1718extends();
                                    if (AbstractC8703e.yandex(mo1718extends2, i) < 0) {
                                        i = mo1718extends2;
                                    }
                                }
                                if (i == 0) {
                                    ad(93);
                                    throw null;
                                }
                            } else {
                                i = z ? interfaceC5052e.mo1718extends() : 4;
                                if (i == 0) {
                                    ad(90);
                                    throw null;
                                }
                            }
                        }
                    }
                }
                InterfaceC0390e mo335e = ((InterfaceC0390e) remoteconfig(collection, new C3801e(6))).mo335e(interfaceC5052e, i, isEmpty ? AbstractC6050e.yandex : AbstractC6050e.billing);
                abstractC15890e.appmetrica(mo335e, collection);
                abstractC15890e.ad(mo335e);
                return;
            }
            Object next2 = it.next();
            InterfaceC0390e interfaceC0390e4 = (InterfaceC0390e) next2;
            if (!AbstractC6050e.appmetrica(interfaceC0390e4.advert())) {
                if (interfaceC0390e4 == null) {
                    AbstractC6050e.ad(2);
                    throw null;
                }
                if (interfaceC5052e == null) {
                    AbstractC6050e.ad(3);
                    throw null;
                }
                if (AbstractC6050e.metrica(AbstractC6050e.advert, interfaceC0390e4, interfaceC5052e) == null) {
                    z = true;
                }
            }
            if (z) {
                arrayList.add(next2);
            }
        }
    }

    public static ArrayList billing(Object obj, LinkedList linkedList, Function1 function1, Function1 function12) {
        if (obj == null) {
            ad(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC6647e interfaceC6647e = (InterfaceC6647e) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC6647e interfaceC6647e2 = (InterfaceC6647e) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int adcel = adcel(interfaceC6647e, interfaceC6647e2);
                if (adcel == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (adcel == 3) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static ArrayList license(InterfaceC6647e interfaceC6647e) {
        C16169e mo327e = interfaceC6647e.mo327e();
        ArrayList arrayList = new ArrayList();
        if (mo327e != null) {
            arrayList.add(mo327e.ad());
        }
        Iterator it = interfaceC6647e.mo330e().iterator();
        while (it.hasNext()) {
            arrayList.add(((C13043e) it.next()).ad());
        }
        return arrayList;
    }

    public static boolean loadAd(InterfaceC6647e interfaceC6647e, AbstractC1186e abstractC1186e, InterfaceC6647e interfaceC6647e2, AbstractC1186e abstractC1186e2, C17611e c17611e) {
        if (interfaceC6647e == null) {
            ad(71);
            throw null;
        }
        if (abstractC1186e == null) {
            ad(72);
            throw null;
        }
        if (interfaceC6647e2 == null) {
            ad(73);
            throw null;
        }
        if (abstractC1186e2 != null) {
            return C5170e.remoteconfig(C5170e.f11072e, c17611e, abstractC1186e.subscription(), abstractC1186e2.subscription());
        }
        ad(74);
        throw null;
    }

    public static void metrica(InterfaceC0390e interfaceC0390e, LinkedHashSet linkedHashSet) {
        if (interfaceC0390e == null) {
            ad(17);
            throw null;
        }
        if (interfaceC0390e.mo334e() != 2) {
            linkedHashSet.add(interfaceC0390e);
            return;
        }
        if (interfaceC0390e.mo337finally().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC0390e);
        }
        Iterator it = interfaceC0390e.mo337finally().iterator();
        while (it.hasNext()) {
            metrica((InterfaceC0390e) it.next(), linkedHashSet);
        }
    }

    public static boolean mopub(InterfaceC6647e interfaceC6647e, InterfaceC6647e interfaceC6647e2) {
        if (interfaceC6647e == null) {
            ad(65);
            throw null;
        }
        if (interfaceC6647e2 == null) {
            ad(66);
            throw null;
        }
        AbstractC1186e inmobi = interfaceC6647e.inmobi();
        AbstractC1186e inmobi2 = interfaceC6647e2.inmobi();
        if (!Signature(interfaceC6647e, interfaceC6647e2)) {
            return false;
        }
        C17611e purchase = metrica.purchase(interfaceC6647e.getTypeParameters(), interfaceC6647e2.getTypeParameters());
        if (interfaceC6647e instanceof InterfaceC16528e) {
            return loadAd(interfaceC6647e, inmobi, interfaceC6647e2, inmobi2, purchase);
        }
        if (!(interfaceC6647e instanceof InterfaceC2188e)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC6647e.getClass());
        }
        InterfaceC2188e interfaceC2188e = (InterfaceC2188e) interfaceC6647e;
        InterfaceC2188e interfaceC2188e2 = (InterfaceC2188e) interfaceC6647e2;
        C2042e appmetrica = interfaceC2188e.appmetrica();
        C2042e appmetrica2 = interfaceC2188e2.appmetrica();
        if ((appmetrica == null || appmetrica2 == null) ? true : Signature(appmetrica, appmetrica2)) {
            return (interfaceC2188e.mo2386e() && interfaceC2188e2.mo2386e()) ? C5170e.adcel(purchase, inmobi.subscription(), inmobi2.subscription()) : (interfaceC2188e.mo2386e() || !interfaceC2188e2.mo2386e()) && loadAd(interfaceC6647e, inmobi, interfaceC6647e2, inmobi2, purchase);
        }
        return false;
    }

    public static Object remoteconfig(Collection collection, Function1 function1) {
        Object obj;
        if (collection.size() == 1) {
            Object m3573class = AbstractC13480e.m3573class(collection);
            if (m3573class != null) {
                return m3573class;
            }
            ad(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        Object m3573class2 = AbstractC13480e.m3573class(collection);
        InterfaceC6647e interfaceC6647e = (InterfaceC6647e) function1.invoke(m3573class2);
        for (Object obj2 : collection) {
            InterfaceC6647e interfaceC6647e2 = (InterfaceC6647e) function1.invoke(obj2);
            if (interfaceC6647e2 == null) {
                ad(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj2);
                    break;
                }
                if (!mopub(interfaceC6647e2, (InterfaceC6647e) it2.next())) {
                    break;
                }
            }
            if (mopub(interfaceC6647e2, interfaceC6647e) && !mopub(interfaceC6647e, interfaceC6647e2)) {
                m3573class2 = obj2;
            }
        }
        if (arrayList.isEmpty()) {
            if (m3573class2 != null) {
                return m3573class2;
            }
            ad(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object m3573class3 = AbstractC13480e.m3573class(arrayList);
            if (m3573class3 != null) {
                return m3573class3;
            }
            ad(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (!(((InterfaceC6647e) function1.invoke(obj)).inmobi().subscription() instanceof AbstractC14773e)) {
                break;
            }
        }
        if (obj != null) {
            return obj;
        }
        Object m3573class4 = AbstractC13480e.m3573class(arrayList);
        if (m3573class4 != null) {
            return m3573class4;
        }
        ad(82);
        throw null;
    }

    public static C6700e startapp(InterfaceC6647e interfaceC6647e, InterfaceC6647e interfaceC6647e2) {
        boolean z;
        if (interfaceC6647e == null) {
            ad(38);
            throw null;
        }
        if (interfaceC6647e2 == null) {
            ad(39);
            throw null;
        }
        boolean z2 = interfaceC6647e instanceof InterfaceC16528e;
        if ((z2 && !(interfaceC6647e2 instanceof InterfaceC16528e)) || (((z = interfaceC6647e instanceof InterfaceC2188e)) && !(interfaceC6647e2 instanceof InterfaceC2188e))) {
            return C6700e.metrica("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC6647e);
        }
        if (!interfaceC6647e.getName().equals(interfaceC6647e2.getName())) {
            return C6700e.metrica("Name mismatch");
        }
        C6700e metrica2 = (interfaceC6647e.mo327e() == null) != (interfaceC6647e2.mo327e() == null) ? C6700e.metrica("Receiver presence mismatch") : interfaceC6647e.mo330e().size() != interfaceC6647e2.mo330e().size() ? C6700e.metrica("Value parameter number mismatch") : null;
        if (metrica2 != null) {
            return metrica2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void subscription(defpackage.InterfaceC0390e r6, kotlin.jvm.functions.Function1 r7) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14514e.subscription(eؑٚؐ, kotlin.jvm.functions.Function1):void");
    }

    public static boolean vip(AbstractC1186e abstractC1186e, AbstractC1186e abstractC1186e2, C17611e c17611e) {
        if (abstractC1186e == null) {
            ad(44);
            throw null;
        }
        if (abstractC1186e2 == null) {
            ad(45);
            throw null;
        }
        if (AbstractC4520e.purchase(abstractC1186e) && AbstractC4520e.purchase(abstractC1186e2)) {
            return true;
        }
        return C5170e.adcel(c17611e, abstractC1186e.subscription(), abstractC1186e2.subscription());
    }

    public final C6700e advert(InterfaceC6647e interfaceC6647e, InterfaceC6647e interfaceC6647e2, InterfaceC5052e interfaceC5052e) {
        if (interfaceC6647e == null) {
            ad(19);
            throw null;
        }
        if (interfaceC6647e2 != null) {
            return smaato(interfaceC6647e, interfaceC6647e2, interfaceC5052e, false);
        }
        ad(20);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r15.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C6700e amazon(defpackage.InterfaceC6647e r19, defpackage.InterfaceC6647e r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14514e.amazon(eٍؙۛ, eٍؙۛ, boolean):eؙ۠ۤ");
    }

    public final C17611e purchase(List list, List list2) {
        Object obj = null;
        if (list == null) {
            ad(40);
            throw null;
        }
        if (list2 == null) {
            ad(41);
            throw null;
        }
        boolean isEmpty = list.isEmpty();
        InterfaceC15558e interfaceC15558e = this.ad;
        if (isEmpty) {
            return new C3168e(obj, interfaceC15558e, 7).m1254e();
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(((InterfaceC16046e) list.get(i)).mo1459goto(), ((InterfaceC16046e) list2.get(i)).mo1459goto());
        }
        return new C3168e(hashMap, interfaceC15558e, 7).m1254e();
    }

    public final C6700e smaato(InterfaceC6647e interfaceC6647e, InterfaceC6647e interfaceC6647e2, InterfaceC5052e interfaceC5052e, boolean z) {
        if (interfaceC6647e == null) {
            ad(22);
            throw null;
        }
        if (interfaceC6647e2 == null) {
            ad(23);
            throw null;
        }
        C6700e amazon = amazon(interfaceC6647e, interfaceC6647e2, z);
        boolean z2 = amazon.vip() == 1;
        List<InterfaceC12822e> list = vip;
        for (InterfaceC12822e interfaceC12822e : list) {
            if (interfaceC12822e.ad() != 1 && (!z2 || interfaceC12822e.ad() != 2)) {
                int m2467class = AbstractC8703e.m2467class(interfaceC12822e.vip(interfaceC6647e, interfaceC6647e2, interfaceC5052e));
                if (m2467class == 0) {
                    z2 = true;
                } else if (m2467class == 1) {
                    return C6700e.metrica("External condition");
                }
            }
        }
        if (!z2) {
            return amazon;
        }
        for (InterfaceC12822e interfaceC12822e2 : list) {
            if (interfaceC12822e2.ad() == 1) {
                int m2467class2 = AbstractC8703e.m2467class(interfaceC12822e2.vip(interfaceC6647e, interfaceC6647e2, interfaceC5052e));
                if (m2467class2 == 0) {
                    throw new IllegalStateException("Contract violation in " + interfaceC12822e2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (m2467class2 == 1) {
                    return C6700e.metrica("External condition");
                }
            }
        }
        C6700e c6700e = C6700e.metrica;
        if (c6700e != null) {
            return c6700e;
        }
        C6700e.ad(0);
        throw null;
    }

    public final void yandex(C0520e c0520e, Collection collection, Collection collection2, InterfaceC5052e interfaceC5052e, AbstractC15890e abstractC15890e) {
        Integer vip2;
        if (c0520e == null) {
            ad(50);
            throw null;
        }
        if (collection == null) {
            ad(51);
            throw null;
        }
        if (collection2 == null) {
            ad(52);
            throw null;
        }
        if (interfaceC5052e == null) {
            ad(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC0390e interfaceC0390e = (InterfaceC0390e) it.next();
            if (interfaceC0390e == null) {
                ad(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            int i = C7495e.f15273e;
            C7495e billing = AbstractC9464e.billing();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC0390e interfaceC0390e2 = (InterfaceC0390e) it2.next();
                int vip3 = advert(interfaceC0390e2, interfaceC0390e, interfaceC5052e).vip();
                boolean z = !AbstractC6050e.appmetrica(interfaceC0390e2.advert()) && AbstractC6050e.metrica(AbstractC6050e.advert, interfaceC0390e2, interfaceC0390e) == null;
                int m2467class = AbstractC8703e.m2467class(vip3);
                if (m2467class == 0) {
                    if (z) {
                        billing.add(interfaceC0390e2);
                    }
                    arrayList.add(interfaceC0390e2);
                } else if (m2467class == 2) {
                    if (z) {
                        abstractC15890e.vip(interfaceC0390e2, interfaceC0390e);
                    }
                    arrayList.add(interfaceC0390e2);
                }
            }
            abstractC15890e.appmetrica(interfaceC0390e, billing);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            InterfaceC15498e mo1351switch = ((InterfaceC0390e) linkedHashSet.iterator().next()).mo1351switch();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC0390e) it3.next()).mo1351switch() != mo1351switch) {
                        LinkedList<InterfaceC0390e> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            InterfaceC0390e interfaceC0390e3 = null;
                            for (InterfaceC0390e interfaceC0390e4 : linkedList) {
                                if (interfaceC0390e3 == null || ((vip2 = AbstractC6050e.vip(interfaceC0390e3.advert(), interfaceC0390e4.advert())) != null && vip2.intValue() < 0)) {
                                    interfaceC0390e3 = interfaceC0390e4;
                                }
                            }
                            if (interfaceC0390e3 == null) {
                                ad(102);
                                throw null;
                            }
                            appmetrica(billing(interfaceC0390e3, linkedList, new C3801e(7), new C17874e(abstractC15890e, interfaceC0390e3, 18)), interfaceC5052e, abstractC15890e);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            appmetrica(Collections.singleton((InterfaceC0390e) it4.next()), interfaceC5052e, abstractC15890e);
        }
    }
}
