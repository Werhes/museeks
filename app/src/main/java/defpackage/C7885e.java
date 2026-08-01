package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* renamed from: eًِۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7885e {
    public Set ad;
    public HashSet adcel;
    public HashSet advert;
    public Set appmetrica;
    public HashSet billing;
    public Set license;
    public Set metrica;
    public HashSet mopub;
    public HashSet purchase;
    public HashSet startapp;
    public Set vip;
    public HashSet yandex;

    public static boolean adcel(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr4[i] = (byte) (bArr2[i] & bArr3[i]);
            bArr5[i] = (byte) (bArr[i] & bArr3[i]);
        }
        return Arrays.equals(bArr4, bArr5);
    }

    public static String advert(Set set) {
        StringBuilder inmobi = AbstractC8703e.inmobi("[");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            boolean z = true;
            if (inmobi.length() > 1) {
                inmobi.append(",");
            }
            byte[] bArr = (byte[]) it.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length / 2; i++) {
                if (sb.length() > 0) {
                    sb.append(".");
                }
                sb.append(Integer.toString(bArr[i] & 255));
            }
            sb.append("/");
            for (int length = bArr.length / 2; length < bArr.length; length++) {
                if (z) {
                    z = false;
                } else {
                    sb.append(".");
                }
                sb.append(Integer.toString(bArr[length] & 255));
            }
            inmobi.append(sb.toString());
        }
        inmobi.append("]");
        return inmobi.toString();
    }

    public static boolean amazon(Ccatch ccatch, Ccatch ccatch2) {
        if (ccatch2.size() >= 1 && ccatch2.size() <= ccatch.size()) {
            C16221e Signature = C16221e.Signature(ccatch2.mo171interface(0));
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= ccatch.size()) {
                    i = i2;
                    break;
                }
                if (AbstractC1358e.yandex(Signature, C16221e.Signature(ccatch.mo171interface(i)))) {
                    break;
                }
                i2 = i;
                i++;
            }
            if (ccatch2.size() <= ccatch.size() - i) {
                for (int i3 = 0; i3 < ccatch2.size(); i3++) {
                    C16221e Signature2 = C16221e.Signature(ccatch2.mo171interface(i3));
                    C16221e Signature3 = C16221e.Signature(ccatch.mo171interface(i + i3));
                    if (Signature2.f31872e.f36388e.length == Signature3.f31872e.f36388e.length && Signature2.loadAd().f1387e.isVip(Signature3.loadAd().f1387e)) {
                        if (Signature2.f31872e.f36388e.length == 1 && Signature2.loadAd().f1387e.isVip(C5989e.appmetrica)) {
                            if (Signature3.loadAd().f1386e.toString().startsWith(Signature2.loadAd().f1386e.toString())) {
                            }
                        } else if (AbstractC1358e.yandex(Signature2, Signature3)) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean appmetrica(Collection collection, Collection collection2) {
        boolean z;
        if (collection != collection2) {
            if (collection != null && collection2 != null && collection.size() == collection2.size()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = collection2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        }
                        Object next2 = it2.next();
                        if (next == next2 ? true : (next == null || next2 == null) ? false : ((next instanceof byte[]) && (next2 instanceof byte[])) ? Arrays.equals((byte[]) next, (byte[]) next2) : next.equals(next2)) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static String billing(C5547e c5547e) {
        return AbstractC1433e.ad(C10911e.subs(c5547e.f11878e).f21614e);
    }

    public static boolean loadAd(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] vip = AbstractC1433e.vip(str2);
        String[] vip2 = AbstractC1433e.vip(str);
        if (vip2.length <= vip.length) {
            return false;
        }
        int length = vip2.length - vip.length;
        for (int i = -1; i < vip.length; i++) {
            if (i == -1) {
                if (vip2[i + length].equals(BuildConfig.FLAVOR)) {
                    return false;
                }
            } else if (!vip[i].equalsIgnoreCase(vip2[i + length])) {
                return false;
            }
        }
        return true;
    }

    public static boolean mopub(String str, String str2) {
        String substring = str.substring(str.indexOf(58) + 1);
        if (substring.indexOf("//") != -1) {
            substring = substring.substring(substring.indexOf("//") + 2);
        }
        if (substring.lastIndexOf(58) != -1) {
            substring = substring.substring(0, substring.lastIndexOf(58));
        }
        String substring2 = substring.substring(substring.indexOf(58) + 1);
        String substring3 = substring2.substring(substring2.indexOf(64) + 1);
        if (substring3.indexOf(47) != -1) {
            substring3 = substring3.substring(0, substring3.indexOf(47));
        }
        return str2.startsWith(".") ? loadAd(substring3, str2) : substring3.equalsIgnoreCase(str2);
    }

    public static boolean purchase(String str, String str2) {
        String substring = str.substring(str.indexOf(64) + 1);
        return str2.indexOf(64) == -1 ? !(str2.charAt(0) == '.' ? !loadAd(substring, str2) : !substring.equalsIgnoreCase(str2)) : str.equalsIgnoreCase(str2) || substring.equalsIgnoreCase(str2.substring(1));
    }

    public static String smaato(HashSet hashSet) {
        StringBuilder inmobi = AbstractC8703e.inmobi("[");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (inmobi.length() > 1) {
                inmobi.append(",");
            }
            C12181e loadAd = C12181e.loadAd(it.next());
            inmobi.append(loadAd.f24480e.m4673class());
            inmobi.append(":");
            try {
                byte[] encoded = loadAd.f24479e.billing().getEncoded();
                C2873e c2873e = AbstractC7240e.ad;
                inmobi.append(AbstractC7240e.appmetrica(0, encoded.length, encoded));
            } catch (IOException e) {
                inmobi.append(e.toString());
            }
        }
        inmobi.append("]");
        return inmobi.toString();
    }

    public static int yandex(Collection collection) {
        int i = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            i = (obj instanceof byte[] ? AbstractC12442e.isVip((byte[]) obj) : obj.hashCode()) + i;
        }
        return i;
    }

    public final void ad(C5547e c5547e) {
        int i = c5547e.f11877e;
        subs subsVar = c5547e.f11878e;
        if (i == 0) {
            HashSet hashSet = this.purchase;
            C12181e loadAd = C12181e.loadAd(subsVar);
            if (hashSet.isEmpty()) {
                return;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (C12181e.loadAd(it.next()).equals(loadAd)) {
                    throw new Exception("OtherName is from an excluded subtree.");
                }
            }
            return;
        }
        if (i == 1) {
            Set set = this.metrica;
            String billing = billing(c5547e);
            if (set.isEmpty()) {
                return;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                if (purchase(billing, (String) it2.next())) {
                    throw new Exception("Email address is from an excluded subtree.");
                }
            }
            return;
        }
        if (i == 2) {
            Set<String> set2 = this.vip;
            String billing2 = billing(c5547e);
            if (set2.isEmpty()) {
                return;
            }
            for (String str : set2) {
                if (loadAd(billing2, str) || billing2.equalsIgnoreCase(str)) {
                    throw new Exception("DNS is from an excluded subtree.");
                }
            }
            return;
        }
        if (i == 4) {
            vip(C15466e.Signature(subsVar));
            return;
        }
        if (i == 6) {
            Set set3 = this.license;
            String billing3 = billing(c5547e);
            if (set3.isEmpty()) {
                return;
            }
            Iterator it3 = set3.iterator();
            while (it3.hasNext()) {
                if (mopub(billing3, (String) it3.next())) {
                    throw new Exception("URI is from an excluded subtree.");
                }
            }
            return;
        }
        if (i != 7) {
            return;
        }
        Set set4 = this.appmetrica;
        byte[] bArr = Cprotected.subs(subsVar).f36449e;
        if (set4.isEmpty()) {
            return;
        }
        Iterator it4 = set4.iterator();
        while (it4.hasNext()) {
            if (adcel(bArr, (byte[]) it4.next())) {
                throw new Exception("IP is from an excluded subtree.");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7885e)) {
            return false;
        }
        C7885e c7885e = (C7885e) obj;
        return appmetrica(c7885e.ad, this.ad) && appmetrica(c7885e.vip, this.vip) && appmetrica(c7885e.metrica, this.metrica) && appmetrica(c7885e.appmetrica, this.appmetrica) && appmetrica(c7885e.license, this.license) && appmetrica(c7885e.purchase, this.purchase) && appmetrica(c7885e.billing, this.billing) && appmetrica(c7885e.yandex, this.yandex) && appmetrica(c7885e.startapp, this.startapp) && appmetrica(c7885e.mopub, this.mopub) && appmetrica(c7885e.adcel, this.adcel) && appmetrica(c7885e.advert, this.advert);
    }

    public final int hashCode() {
        return yandex(this.advert) + yandex(this.adcel) + yandex(this.mopub) + yandex(this.startapp) + yandex(this.yandex) + yandex(this.billing) + yandex(this.purchase) + yandex(this.license) + yandex(this.appmetrica) + yandex(this.metrica) + yandex(this.vip) + yandex(this.ad);
    }

    public final void license(C15466e c15466e) {
        HashSet hashSet = this.billing;
        Ccatch m168class = Ccatch.m168class(c15466e.f30555e);
        if (hashSet == null) {
            return;
        }
        if (hashSet.isEmpty() && m168class.size() == 0) {
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (amazon(m168class, (Ccatch) it.next())) {
                return;
            }
        }
        throw new Exception("Subject distinguished name is not from a permitted subtree");
    }

    public final void metrica(C5547e c5547e) {
        int i = c5547e.f11877e;
        subs subsVar = c5547e.f11878e;
        if (i == 0) {
            HashSet hashSet = this.advert;
            C12181e loadAd = C12181e.loadAd(subsVar);
            if (hashSet == null) {
                return;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (C12181e.loadAd(it.next()).equals(loadAd)) {
                    return;
                }
            }
            throw new Exception("Subject OtherName is not from a permitted subtree.");
        }
        if (i == 1) {
            HashSet hashSet2 = this.startapp;
            String billing = billing(c5547e);
            if (hashSet2 == null) {
                return;
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                if (purchase(billing, (String) it2.next())) {
                    return;
                }
            }
            if (billing.length() != 0 || hashSet2.size() != 0) {
                throw new Exception("Subject email address is not from a permitted subtree.");
            }
            return;
        }
        if (i == 2) {
            HashSet hashSet3 = this.yandex;
            String billing2 = billing(c5547e);
            if (hashSet3 == null) {
                return;
            }
            Iterator it3 = hashSet3.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (loadAd(billing2, str) || billing2.equalsIgnoreCase(str)) {
                    return;
                }
            }
            if (billing2.length() != 0 || hashSet3.size() != 0) {
                throw new Exception("DNS is not from a permitted subtree.");
            }
            return;
        }
        if (i == 4) {
            license(C15466e.Signature(subsVar));
            return;
        }
        if (i == 6) {
            HashSet hashSet4 = this.adcel;
            String billing3 = billing(c5547e);
            if (hashSet4 == null) {
                return;
            }
            Iterator it4 = hashSet4.iterator();
            while (it4.hasNext()) {
                if (mopub(billing3, (String) it4.next())) {
                    return;
                }
            }
            if (billing3.length() != 0 || hashSet4.size() != 0) {
                throw new Exception("URI is not from a permitted subtree.");
            }
            return;
        }
        if (i != 7) {
            return;
        }
        HashSet hashSet5 = this.mopub;
        byte[] bArr = Cprotected.subs(subsVar).f36449e;
        if (hashSet5 == null) {
            return;
        }
        Iterator it5 = hashSet5.iterator();
        while (it5.hasNext()) {
            if (adcel(bArr, (byte[]) it5.next())) {
                return;
            }
        }
        if (bArr.length != 0 || hashSet5.size() != 0) {
            throw new Exception("IP is not from a permitted subtree.");
        }
    }

    public final void startapp(C12950e[] c12950eArr) {
        Iterator it;
        int i;
        char c;
        int i2;
        Iterator it2;
        int i3;
        Set singleton;
        HashMap hashMap = new HashMap();
        int i4 = 0;
        for (int i5 = 0; i5 != c12950eArr.length; i5++) {
            C12950e c12950e = c12950eArr[i5];
            Integer valueOf = Integer.valueOf(c12950e.f25808e.f11877e);
            if (hashMap.get(valueOf) == null) {
                hashMap.put(valueOf, new HashSet());
            }
            ((Set) hashMap.get(valueOf)).add(c12950e);
        }
        Iterator it3 = hashMap.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue != 0) {
                char c2 = 1;
                if (intValue != 1) {
                    int i6 = 2;
                    if (intValue != 2) {
                        int i7 = 4;
                        if (intValue == 4) {
                            it = it3;
                            i = i4;
                            HashSet hashSet = this.billing;
                            Set set = (Set) entry.getValue();
                            HashSet hashSet2 = new HashSet();
                            Iterator it4 = set.iterator();
                            while (it4.hasNext()) {
                                Ccatch m168class = Ccatch.m168class(((C12950e) it4.next()).f25808e.f11878e.billing());
                                if (hashSet != null) {
                                    Iterator it5 = hashSet.iterator();
                                    while (it5.hasNext()) {
                                        Ccatch ccatch = (Ccatch) it5.next();
                                        if (amazon(m168class, ccatch)) {
                                            hashSet2.add(m168class);
                                        } else if (amazon(ccatch, m168class)) {
                                            hashSet2.add(ccatch);
                                        }
                                    }
                                } else if (m168class != null) {
                                    hashSet2.add(m168class);
                                }
                            }
                            this.billing = hashSet2;
                        } else if (intValue == 6) {
                            it = it3;
                            i = i4;
                            HashSet hashSet3 = this.adcel;
                            Set set2 = (Set) entry.getValue();
                            HashSet hashSet4 = new HashSet();
                            Iterator it6 = set2.iterator();
                            while (it6.hasNext()) {
                                String billing = billing(((C12950e) it6.next()).f25808e);
                                if (hashSet3 == null) {
                                    hashSet4.add(billing);
                                } else {
                                    Iterator it7 = hashSet3.iterator();
                                    while (it7.hasNext()) {
                                        String str = (String) it7.next();
                                        if (str.indexOf(64) != -1) {
                                            String substring = str.substring(str.indexOf(64) + 1);
                                            if (billing.indexOf(64) != -1) {
                                                if (str.equalsIgnoreCase(billing)) {
                                                    hashSet4.add(str);
                                                }
                                            } else if (billing.startsWith(".")) {
                                                if (loadAd(substring, billing)) {
                                                    hashSet4.add(str);
                                                }
                                            } else if (substring.equalsIgnoreCase(billing)) {
                                                hashSet4.add(str);
                                            }
                                        } else if (str.startsWith(".")) {
                                            if (billing.indexOf(64) != -1) {
                                                if (loadAd(billing.substring(str.indexOf(64) + 1), str)) {
                                                    hashSet4.add(billing);
                                                }
                                            } else if (billing.startsWith(".")) {
                                                if (!loadAd(str, billing) && !str.equalsIgnoreCase(billing)) {
                                                    if (loadAd(billing, str)) {
                                                        hashSet4.add(billing);
                                                    }
                                                }
                                                hashSet4.add(str);
                                            } else if (loadAd(billing, str)) {
                                                hashSet4.add(billing);
                                            }
                                        } else if (billing.indexOf(64) != -1) {
                                            if (billing.substring(billing.indexOf(64) + 1).equalsIgnoreCase(str)) {
                                                hashSet4.add(billing);
                                            }
                                        } else if (billing.startsWith(".")) {
                                            if (loadAd(str, billing)) {
                                                hashSet4.add(str);
                                            }
                                        } else if (str.equalsIgnoreCase(billing)) {
                                            hashSet4.add(str);
                                        }
                                    }
                                }
                            }
                            this.adcel = hashSet4;
                        } else {
                            if (intValue != 7) {
                                throw new IllegalStateException(AbstractC1786e.admob(intValue, "Unknown tag encountered: "));
                            }
                            HashSet hashSet5 = this.mopub;
                            Set set3 = (Set) entry.getValue();
                            HashSet hashSet6 = new HashSet();
                            Iterator it8 = set3.iterator();
                            while (it8.hasNext()) {
                                byte[] bArr = Cprotected.subs(((C12950e) it8.next()).f25808e.f11878e).f36449e;
                                if (hashSet5 != null) {
                                    Iterator it9 = hashSet5.iterator();
                                    while (it9.hasNext()) {
                                        byte[] bArr2 = (byte[]) it9.next();
                                        if (bArr2.length != bArr.length) {
                                            singleton = Collections.EMPTY_SET;
                                            it2 = it3;
                                            i3 = i4;
                                            c = c2;
                                            i2 = i6;
                                        } else {
                                            int length = bArr2.length / i6;
                                            byte[] bArr3 = new byte[length];
                                            byte[] bArr4 = new byte[length];
                                            System.arraycopy(bArr2, i4, bArr3, i4, length);
                                            System.arraycopy(bArr2, length, bArr4, i4, length);
                                            byte[] bArr5 = new byte[length];
                                            byte[] bArr6 = new byte[length];
                                            System.arraycopy(bArr, i4, bArr5, i4, length);
                                            System.arraycopy(bArr, length, bArr6, i4, length);
                                            byte[][] bArr7 = new byte[i7];
                                            bArr7[i4] = bArr3;
                                            bArr7[c2] = bArr4;
                                            bArr7[i6] = bArr5;
                                            bArr7[3] = bArr6;
                                            byte[] bArr8 = bArr7[i4];
                                            byte[] bArr9 = bArr7[c2];
                                            byte[] bArr10 = bArr7[i6];
                                            byte[] bArr11 = bArr7[3];
                                            c = c2;
                                            int length2 = bArr8.length;
                                            i2 = i6;
                                            byte[] bArr12 = new byte[length2];
                                            byte[] bArr13 = new byte[length2];
                                            int i8 = i4;
                                            byte[] bArr14 = new byte[length2];
                                            byte[] bArr15 = new byte[length2];
                                            it2 = it3;
                                            int i9 = i8;
                                            while (i9 < length2) {
                                                int i10 = i9;
                                                bArr12[i10] = (byte) (bArr8[i9] & bArr9[i9]);
                                                byte b = bArr8[i10];
                                                byte b2 = bArr9[i10];
                                                bArr13[i10] = (byte) ((b & b2) | (~b2));
                                                bArr14[i10] = (byte) (bArr10[i10] & bArr11[i10]);
                                                byte b3 = bArr10[i10];
                                                byte b4 = bArr11[i10];
                                                bArr15[i10] = (byte) ((b3 & b4) | (~b4));
                                                i9 = i10 + 1;
                                            }
                                            byte[][] bArr16 = new byte[4];
                                            bArr16[i8] = bArr12;
                                            bArr16[c] = bArr13;
                                            bArr16[i2] = bArr14;
                                            bArr16[3] = bArr15;
                                            byte[] bArr17 = bArr16[c];
                                            byte[] bArr18 = bArr16[3];
                                            int i11 = i8;
                                            while (true) {
                                                if (i11 >= bArr17.length) {
                                                    bArr17 = bArr18;
                                                    break;
                                                } else if ((bArr17[i11] & 65535) < (bArr18[i11] & 65535)) {
                                                    break;
                                                } else {
                                                    i11++;
                                                }
                                            }
                                            byte[] bArr19 = bArr16[i8];
                                            byte[] bArr20 = bArr16[i2];
                                            int i12 = i8;
                                            while (true) {
                                                if (i12 >= bArr19.length) {
                                                    bArr19 = bArr20;
                                                    break;
                                                } else if ((bArr19[i12] & 65535) > (bArr20[i12] & 65535)) {
                                                    break;
                                                } else {
                                                    i12++;
                                                }
                                            }
                                            if (!Arrays.equals(bArr19, bArr17)) {
                                                int i13 = i8;
                                                while (true) {
                                                    if (i13 >= bArr19.length) {
                                                        break;
                                                    }
                                                    if ((bArr19[i13] & 65535) > (bArr17[i13] & 65535)) {
                                                        bArr17 = bArr19;
                                                        break;
                                                    }
                                                    i13++;
                                                }
                                                if (Arrays.equals(bArr17, bArr19)) {
                                                    singleton = Collections.EMPTY_SET;
                                                    i3 = i8;
                                                }
                                            }
                                            byte[] bArr21 = bArr16[i8];
                                            byte[] bArr22 = bArr16[i2];
                                            int length3 = bArr21.length;
                                            byte[] bArr23 = new byte[length3];
                                            for (int i14 = i8; i14 < bArr21.length; i14++) {
                                                bArr23[i14] = (byte) (bArr21[i14] | bArr22[i14]);
                                            }
                                            byte[] bArr24 = new byte[bArr9.length];
                                            for (int i15 = i8; i15 < bArr9.length; i15++) {
                                                bArr24[i15] = (byte) (bArr9[i15] | bArr11[i15]);
                                            }
                                            byte[] bArr25 = new byte[length3 * 2];
                                            i3 = i8;
                                            System.arraycopy(bArr23, i3, bArr25, i3, length3);
                                            System.arraycopy(bArr24, i3, bArr25, length3, length3);
                                            singleton = Collections.singleton(bArr25);
                                        }
                                        hashSet6.addAll(singleton);
                                        c2 = c;
                                        i4 = i3;
                                        i6 = i2;
                                        it3 = it2;
                                        i7 = 4;
                                    }
                                } else if (bArr != null) {
                                    hashSet6.add(bArr);
                                }
                                c2 = c2;
                                i4 = i4;
                                i6 = i6;
                                it3 = it3;
                                i7 = 4;
                            }
                            it = it3;
                            i = i4;
                            this.mopub = hashSet6;
                        }
                    } else {
                        it = it3;
                        i = i4;
                        HashSet hashSet7 = this.yandex;
                        Set set4 = (Set) entry.getValue();
                        HashSet hashSet8 = new HashSet();
                        Iterator it10 = set4.iterator();
                        while (it10.hasNext()) {
                            String billing2 = billing(((C12950e) it10.next()).f25808e);
                            if (hashSet7 == null) {
                                hashSet8.add(billing2);
                            } else {
                                Iterator it11 = hashSet7.iterator();
                                while (it11.hasNext()) {
                                    String str2 = (String) it11.next();
                                    if (loadAd(str2, billing2)) {
                                        hashSet8.add(str2);
                                    } else if (loadAd(billing2, str2)) {
                                        hashSet8.add(billing2);
                                    }
                                }
                            }
                        }
                        this.yandex = hashSet8;
                    }
                } else {
                    it = it3;
                    i = i4;
                    HashSet hashSet9 = this.startapp;
                    Set set5 = (Set) entry.getValue();
                    HashSet hashSet10 = new HashSet();
                    Iterator it12 = set5.iterator();
                    while (it12.hasNext()) {
                        String billing3 = billing(((C12950e) it12.next()).f25808e);
                        if (hashSet9 == null) {
                            hashSet10.add(billing3);
                        } else {
                            Iterator it13 = hashSet9.iterator();
                            while (it13.hasNext()) {
                                String str3 = (String) it13.next();
                                if (billing3.indexOf(64) != -1) {
                                    String substring2 = billing3.substring(billing3.indexOf(64) + 1);
                                    if (str3.indexOf(64) != -1) {
                                        if (billing3.equalsIgnoreCase(str3)) {
                                            hashSet10.add(billing3);
                                        }
                                    } else if (str3.startsWith(".")) {
                                        if (loadAd(substring2, str3)) {
                                            hashSet10.add(billing3);
                                        }
                                    } else if (substring2.equalsIgnoreCase(str3)) {
                                        hashSet10.add(billing3);
                                    }
                                } else if (billing3.startsWith(".")) {
                                    if (str3.indexOf(64) != -1) {
                                        if (loadAd(str3.substring(billing3.indexOf(64) + 1), billing3)) {
                                            hashSet10.add(str3);
                                        }
                                    } else if (str3.startsWith(".")) {
                                        if (!loadAd(billing3, str3) && !billing3.equalsIgnoreCase(str3)) {
                                            if (loadAd(str3, billing3)) {
                                                hashSet10.add(str3);
                                            }
                                        }
                                        hashSet10.add(billing3);
                                    } else if (loadAd(str3, billing3)) {
                                        hashSet10.add(str3);
                                    }
                                } else if (str3.indexOf(64) != -1) {
                                    if (str3.substring(str3.indexOf(64) + 1).equalsIgnoreCase(billing3)) {
                                        hashSet10.add(str3);
                                    }
                                } else if (str3.startsWith(".")) {
                                    if (loadAd(billing3, str3)) {
                                        hashSet10.add(billing3);
                                    }
                                } else if (billing3.equalsIgnoreCase(str3)) {
                                    hashSet10.add(billing3);
                                }
                            }
                        }
                    }
                    this.startapp = hashSet10;
                }
            } else {
                it = it3;
                i = i4;
                HashSet hashSet11 = this.advert;
                Set set6 = (Set) entry.getValue();
                HashSet hashSet12 = new HashSet();
                Iterator it14 = set6.iterator();
                while (it14.hasNext()) {
                    C12181e loadAd = C12181e.loadAd(((C12950e) it14.next()).f25808e.f11878e);
                    if (hashSet11 != null) {
                        Iterator it15 = hashSet11.iterator();
                        while (it15.hasNext()) {
                            if (loadAd.equals(C12181e.loadAd(it15.next()))) {
                                hashSet12.add(loadAd);
                            }
                        }
                    } else if (loadAd != null) {
                        hashSet12.add(loadAd);
                    }
                }
                this.advert = hashSet12;
            }
            i4 = i;
            it3 = it;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("permitted:");
        String str = AbstractC1433e.ad;
        sb.append(str);
        if (this.billing != null) {
            sb.append("DN:");
            sb.append(str);
            sb.append(this.billing.toString());
            sb.append(str);
        }
        if (this.yandex != null) {
            sb.append("DNS:");
            sb.append(str);
            sb.append(this.yandex.toString());
            sb.append(str);
        }
        if (this.startapp != null) {
            sb.append("Email:");
            sb.append(str);
            sb.append(this.startapp.toString());
            sb.append(str);
        }
        if (this.adcel != null) {
            sb.append("URI:");
            sb.append(str);
            sb.append(this.adcel.toString());
            sb.append(str);
        }
        if (this.mopub != null) {
            sb.append("IP:");
            sb.append(str);
            sb.append(advert(this.mopub));
            sb.append(str);
        }
        if (this.advert != null) {
            sb.append("OtherName:");
            sb.append(str);
            sb.append(smaato(this.advert));
            sb.append(str);
        }
        sb.append("excluded:");
        sb.append(str);
        if (!this.ad.isEmpty()) {
            sb.append("DN:");
            sb.append(str);
            sb.append(this.ad.toString());
            sb.append(str);
        }
        if (!this.vip.isEmpty()) {
            sb.append("DNS:");
            sb.append(str);
            sb.append(this.vip.toString());
            sb.append(str);
        }
        if (!this.metrica.isEmpty()) {
            sb.append("Email:");
            sb.append(str);
            sb.append(this.metrica.toString());
            sb.append(str);
        }
        if (!this.license.isEmpty()) {
            sb.append("URI:");
            sb.append(str);
            sb.append(this.license.toString());
            sb.append(str);
        }
        if (!this.appmetrica.isEmpty()) {
            sb.append("IP:");
            sb.append(str);
            sb.append(advert(this.appmetrica));
            sb.append(str);
        }
        if (!this.purchase.isEmpty()) {
            sb.append("OtherName:");
            sb.append(str);
            sb.append(smaato(this.purchase));
            sb.append(str);
        }
        return sb.toString();
    }

    public final void vip(C15466e c15466e) {
        Set set = this.ad;
        Ccatch m168class = Ccatch.m168class(c15466e);
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (amazon(m168class, (Ccatch) it.next())) {
                throw new Exception("Subject distinguished name is from an excluded subtree");
            }
        }
    }
}
