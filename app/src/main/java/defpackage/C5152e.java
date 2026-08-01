package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۛؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5152e {
    public static final C5152e metrica = new C5152e(0);
    public final C15497e ad = new C15497e(16);
    public boolean vip;

    public C5152e() {
    }

    public C5152e(int i) {
        purchase();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if ((r3 instanceof defpackage.InterfaceC2102e) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void adcel(defpackage.EnumC0337e r2, java.lang.Object r3) {
        /*
            r3.getClass()
            eؚٝؔ r2 = r2.f2368e
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L36;
                case 1: goto L33;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L27;
                case 6: goto L1e;
                case 7: goto L12;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L38
        Lf:
            boolean r1 = r3 instanceof defpackage.AbstractC6649e
            goto L38
        L12:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof defpackage.InterfaceC2102e
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r1 = r0
            goto L38
        L1e:
            boolean r2 = r3 instanceof defpackage.AbstractC6732e
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1b
            goto L1c
        L27:
            boolean r1 = r3 instanceof java.lang.String
            goto L38
        L2a:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L38
        L2d:
            boolean r1 = r3 instanceof java.lang.Double
            goto L38
        L30:
            boolean r1 = r3 instanceof java.lang.Float
            goto L38
        L33:
            boolean r1 = r3 instanceof java.lang.Long
            goto L38
        L36:
            boolean r1 = r3 instanceof java.lang.Integer
        L38:
            if (r1 == 0) goto L3b
            return
        L3b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5152e.adcel(eٖٖؑ, java.lang.Object):void");
    }

    public static boolean appmetrica(Map.Entry entry) {
        C1808e c1808e = (C1808e) entry.getKey();
        if (c1808e.f4882e.f2368e != EnumC7310e.f14962e) {
            return true;
        }
        if (!c1808e.f4881e) {
            Object value = entry.getValue();
            if (value instanceof AbstractC6649e) {
                return ((AbstractC6649e) value).ad();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((AbstractC6649e) it.next()).ad()) {
                return false;
            }
        }
        return true;
    }

    public static int license(C1808e c1808e, Object obj) {
        EnumC0337e enumC0337e = c1808e.f4882e;
        int i = c1808e.f4883e;
        if (!c1808e.f4881e) {
            int tapsense = C9831e.tapsense(i);
            if (enumC0337e == EnumC0337e.f2361e) {
                tapsense *= 2;
            }
            return metrica(enumC0337e, obj) + tapsense;
        }
        int i2 = 0;
        for (Object obj2 : (List) obj) {
            int tapsense2 = C9831e.tapsense(i);
            if (enumC0337e == EnumC0337e.f2361e) {
                tapsense2 *= 2;
            }
            i2 += metrica(enumC0337e, obj2) + tapsense2;
        }
        return i2;
    }

    public static int metrica(EnumC0337e enumC0337e, Object obj) {
        switch (enumC0337e.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return C9831e.signatures(((Long) obj).longValue());
            case 3:
                return C9831e.signatures(((Long) obj).longValue());
            case 4:
                return C9831e.admob(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return C9831e.pro(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((AbstractC6649e) obj).metrica();
            case 10:
                return C9831e.remoteconfig((AbstractC6649e) obj);
            case 11:
                if (obj instanceof AbstractC6732e) {
                    AbstractC6732e abstractC6732e = (AbstractC6732e) obj;
                    return abstractC6732e.size() + C9831e.pro(abstractC6732e.size());
                }
                byte[] bArr = (byte[]) obj;
                return C9831e.pro(bArr.length) + bArr.length;
            case 12:
                return C9831e.pro(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC2102e ? C9831e.admob(((InterfaceC2102e) obj).ad()) : C9831e.admob(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return C9831e.pro((intValue >> 31) ^ (intValue << 1));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long longValue = ((Long) obj).longValue();
                return C9831e.signatures((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void mopub(C9831e c9831e, EnumC0337e enumC0337e, Object obj) {
        switch (enumC0337e.ordinal()) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                c9831e.getClass();
                c9831e.m2686e(Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                c9831e.getClass();
                c9831e.m2684e(Float.floatToRawIntBits(floatValue));
                return;
            case 2:
                c9831e.m2687e(((Long) obj).longValue());
                return;
            case 3:
                c9831e.m2687e(((Long) obj).longValue());
                return;
            case 4:
                c9831e.m2680continue(((Integer) obj).intValue());
                return;
            case 5:
                c9831e.m2686e(((Long) obj).longValue());
                return;
            case 6:
                c9831e.m2684e(((Integer) obj).intValue());
                return;
            case 7:
                c9831e.m2688e(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                c9831e.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                c9831e.m2689e(bytes.length);
                c9831e.m2685e(bytes);
                return;
            case 9:
                c9831e.getClass();
                ((AbstractC6649e) obj).purchase(c9831e);
                return;
            case 10:
                c9831e.m2692e((AbstractC6649e) obj);
                return;
            case 11:
                if (obj instanceof AbstractC6732e) {
                    AbstractC6732e abstractC6732e = (AbstractC6732e) obj;
                    c9831e.getClass();
                    c9831e.m2689e(abstractC6732e.size());
                    c9831e.m2690e(abstractC6732e);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                c9831e.getClass();
                c9831e.m2689e(bArr.length);
                c9831e.m2685e(bArr);
                return;
            case 12:
                c9831e.m2689e(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof InterfaceC2102e) {
                    c9831e.m2680continue(((InterfaceC2102e) obj).ad());
                    return;
                } else {
                    c9831e.m2680continue(((Integer) obj).intValue());
                    return;
                }
            case 14:
                c9831e.m2684e(((Integer) obj).intValue());
                return;
            case 15:
                c9831e.m2686e(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c9831e.m2689e((intValue >> 31) ^ (intValue << 1));
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long longValue = ((Long) obj).longValue();
                c9831e.m2687e((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public static Object yandex(C4285e c4285e, EnumC0337e enumC0337e) {
        switch (enumC0337e.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c4285e.smaato()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c4285e.advert()));
            case 2:
                return Long.valueOf(c4285e.loadAd());
            case 3:
                return Long.valueOf(c4285e.loadAd());
            case 4:
                return Integer.valueOf(c4285e.amazon());
            case 5:
                return Long.valueOf(c4285e.smaato());
            case 6:
                return Integer.valueOf(c4285e.advert());
            case 7:
                return Boolean.valueOf(c4285e.loadAd() != 0);
            case 8:
                int amazon = c4285e.amazon();
                int i = c4285e.ad;
                int i2 = c4285e.metrica;
                if (amazon > i - i2 || amazon <= 0) {
                    return amazon == 0 ? BuildConfig.FLAVOR : new String(c4285e.mopub(amazon), "UTF-8");
                }
                String str = new String((byte[]) c4285e.yandex, i2, amazon, "UTF-8");
                c4285e.metrica += amazon;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c4285e.yandex();
            case 12:
                return Integer.valueOf(c4285e.amazon());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c4285e.advert());
            case 15:
                return Long.valueOf(c4285e.smaato());
            case 16:
                int amazon2 = c4285e.amazon();
                return Integer.valueOf((-(amazon2 & 1)) ^ (amazon2 >>> 1));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long loadAd = c4285e.loadAd();
                return Long.valueOf((-(loadAd & 1)) ^ (loadAd >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public final void ad(C1808e c1808e, Object obj) {
        List list;
        if (!c1808e.f4881e) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        adcel(c1808e.f4882e, obj);
        C15497e c15497e = this.ad;
        Object obj2 = c15497e.get(c1808e);
        if (obj2 == null) {
            list = new ArrayList();
            c15497e.put(c1808e, list);
        } else {
            list = (List) obj2;
        }
        list.add(obj);
    }

    public final void billing(Map.Entry entry) {
        C1808e c1808e = (C1808e) entry.getKey();
        Object value = entry.getValue();
        boolean z = c1808e.f4881e;
        C15497e c15497e = this.ad;
        if (z) {
            Object obj = c15497e.get(c1808e);
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                List list = (List) obj;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            c15497e.put(c1808e, obj);
            return;
        }
        if (c1808e.f4882e.f2368e != EnumC7310e.f14962e) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c15497e.put(c1808e, value);
            return;
        }
        Object obj3 = c15497e.get(c1808e);
        if (obj3 != null) {
            c15497e.put(c1808e, ((AbstractC6649e) obj3).appmetrica().appmetrica((AbstractC2649e) ((AbstractC6649e) value)).metrica());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c15497e.put(c1808e, value);
    }

    public final void purchase() {
        if (this.vip) {
            return;
        }
        C15497e c15497e = this.ad;
        if (!c15497e.f30614e) {
            for (int i = 0; i < c15497e.f30613e.size(); i++) {
                Map.Entry entry = (Map.Entry) c15497e.f30613e.get(i);
                if (((C1808e) entry.getKey()).f4881e) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c15497e.metrica()) {
                if (((C1808e) entry2.getKey()).f4881e) {
                    entry2.setValue(DesugarCollections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c15497e.f30614e) {
            c15497e.f30612e = c15497e.f30612e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c15497e.f30612e);
            c15497e.f30614e = true;
        }
        this.vip = true;
    }

    public final void startapp(C1808e c1808e, Object obj) {
        if (!c1808e.f4881e) {
            adcel(c1808e.f4882e, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                adcel(c1808e.f4882e, it.next());
            }
            obj = arrayList;
        }
        this.ad.put(c1808e, obj);
    }

    /* renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final C5152e clone() {
        C15497e c15497e;
        C5152e c5152e = new C5152e();
        int i = 0;
        while (true) {
            c15497e = this.ad;
            if (i >= c15497e.f30613e.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c15497e.f30613e.get(i);
            c5152e.startapp((C1808e) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c15497e.metrica()) {
            c5152e.startapp((C1808e) entry2.getKey(), entry2.getValue());
        }
        return c5152e;
    }
}
