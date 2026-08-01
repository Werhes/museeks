package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۡۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C9821e implements InterfaceC4716e, InterfaceC1598e, InterfaceC5483e, InterfaceC12457e, InterfaceC14187e, InterfaceC9347e, InterfaceC14454e, InterfaceC5808e, InterfaceC13204e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19391e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C9821e f19385e = new C9821e(14);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C9821e f19383e = new C9821e(15);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C9821e f19387e = new C9821e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C9821e f19382e = new C9821e(17);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C9821e f19390e = new C9821e(18);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C9821e f19389e = new C9821e(19);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C9821e f19386e = new C9821e(20);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C9821e f19388e = new C9821e(21);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ C9821e f19384e = new C9821e(22);

    public /* synthetic */ C9821e(int i) {
        this.f19391e = i;
    }

    public static C11913e license(C9821e c9821e, List list, int i, int i2) {
        char c;
        long j;
        List list2;
        char c2;
        int i3;
        float f;
        float floatValue;
        ArrayList arrayList;
        char c3 = ' ';
        long j2 = 4294967295L;
        long floatToRawIntBits = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);
        float f2 = 360.0f;
        if ((i2 & 8) == 0) {
            C1169e license = AbstractC6874e.license();
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                C16017e c16017e = (C16017e) list.get(i4);
                C9821e c9821e2 = AbstractC11786e.ad;
                long j3 = j2;
                long yandex = C2152e.yandex(c16017e.ad, floatToRawIntBits);
                arrayList2.add(Float.valueOf((((float) Math.atan2(Float.intBitsToFloat((int) (yandex & j3)), Float.intBitsToFloat((int) (yandex >> 32)))) * 180.0f) / 3.1415927f));
                i4++;
                j2 = j3;
            }
            j = j2;
            int i5 = 2;
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList3.add(Float.valueOf(C2152e.metrica(C2152e.yandex(((C16017e) list.get(i6)).ad, floatToRawIntBits))));
            }
            int i7 = i * 2;
            float f3 = 360.0f / i7;
            int i8 = 0;
            while (i8 < i7) {
                Iterator it = AbstractC6874e.purchase(list).iterator();
                while (true) {
                    C3296e c3296e = (C3296e) it;
                    if (c3296e.f7452e) {
                        int nextInt = c3296e.nextInt();
                        int i9 = i8 % 2;
                        if (i9 != 0) {
                            nextInt = AbstractC6874e.billing(list) - nextInt;
                        }
                        if (nextInt > 0 || i9 == 0) {
                            C9821e c9821e3 = AbstractC11786e.ad;
                            float f4 = i8 * f3;
                            if (i9 == 0) {
                                floatValue = ((Number) arrayList2.get(nextInt)).floatValue();
                                c2 = c3;
                                f = f2;
                                i3 = i5;
                            } else {
                                c2 = c3;
                                i3 = i5;
                                f = f2;
                                floatValue = (((Number) arrayList2.get(0)).floatValue() * i3) + (f3 - ((Number) arrayList2.get(nextInt)).floatValue());
                            }
                            double d = ((f4 + floatValue) / f) * i3 * 3.1415927f;
                            arrayList = arrayList2;
                            float cos = (float) Math.cos(d);
                            license.add(new C16017e(C2152e.startapp(C2152e.adcel(((Number) arrayList3.get(nextInt)).floatValue(), (Float.floatToRawIntBits((float) Math.sin(d)) & j) | (Float.floatToRawIntBits(cos) << c2)), floatToRawIntBits), ((C16017e) list.get(nextInt)).vip));
                        } else {
                            c2 = c3;
                            f = f2;
                            arrayList = arrayList2;
                        }
                        arrayList2 = arrayList;
                        c3 = c2;
                        f2 = f;
                        i5 = 2;
                    }
                }
                i8++;
                c3 = c3;
                i5 = 2;
            }
            c = c3;
            list2 = AbstractC6874e.metrica(license);
        } else {
            c = ' ';
            j = 4294967295L;
            int size3 = list.size();
            C15926e admob = AbstractC3062e.admob(0, size3 * i);
            ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(admob, 10));
            Iterator it2 = admob.iterator();
            while (true) {
                C3296e c3296e2 = (C3296e) it2;
                if (!c3296e2.f7452e) {
                    break;
                }
                int nextInt2 = c3296e2.nextInt();
                C9821e c9821e4 = AbstractC11786e.ad;
                int i10 = nextInt2 % size3;
                long yandex2 = C2152e.yandex(((C16017e) list.get(i10)).ad, floatToRawIntBits);
                double d2 = ((((nextInt2 / size3) * 360.0f) / i) / 360.0f) * 2 * 3.1415927f;
                float intBitsToFloat = (Float.intBitsToFloat((int) (yandex2 >> 32)) * ((float) Math.cos(d2))) - (Float.intBitsToFloat((int) (yandex2 & 4294967295L)) * ((float) Math.sin(d2)));
                arrayList4.add(new C16017e(C2152e.startapp((Float.floatToRawIntBits((Float.intBitsToFloat(r10) * ((float) Math.cos(d2))) + (Float.intBitsToFloat(r9) * ((float) Math.sin(d2)))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), floatToRawIntBits), ((C16017e) list.get(i10)).vip));
            }
            list2 = arrayList4;
        }
        int size4 = list2.size() * 2;
        float[] fArr = new float[size4];
        for (int i11 = 0; i11 < size4; i11++) {
            long j4 = ((C16017e) list2.get(i11 / 2)).ad;
            fArr[i11] = Float.intBitsToFloat((int) (i11 % 2 == 0 ? j4 >> c : j4 & j));
        }
        C1169e license2 = AbstractC6874e.license();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            license2.add(((C16017e) it3.next()).vip);
        }
        Unit unit = Unit.INSTANCE;
        return AbstractC4465e.metrica(fArr, C17307e.vip, AbstractC6874e.metrica(license2), Float.intBitsToFloat((int) (floatToRawIntBits >> c)), Float.intBitsToFloat((int) (floatToRawIntBits & j)));
    }

    @Override // defpackage.InterfaceC5483e
    public InterfaceC18147e Signature(int i, int i2) {
        return new C6891e();
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f19391e) {
            case 15:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(10L, 74, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(5000L, 50, "measurement.sgtm.upload.min_delay_after_startup").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(15000L, 64, "measurement.upload.initial_upload_delay_time").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C3973e.f8863e.get();
                C7302e c7302e = C16868e.ad;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) c7302e.f14916e;
                AbstractC6124e abstractC6124e = (AbstractC6124e) atomicReferenceArray.get(2);
                if (abstractC6124e == null) {
                    AbstractC6124e abstractC6124e2 = new AbstractC6124e("measurement.test.double_flag", (C2580e) ((C8383e) c7302e.f14915e).f17149e);
                    while (true) {
                        if (atomicReferenceArray.compareAndSet(2, null, abstractC6124e2)) {
                            abstractC6124e = abstractC6124e2;
                        } else if (atomicReferenceArray.get(2) != null) {
                            abstractC6124e = (AbstractC6124e) atomicReferenceArray.get(2);
                            abstractC6124e.getClass();
                        }
                    }
                }
                return (Double) abstractC6124e.get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.rb.attribution.app_allowlist", 32, BuildConfig.FLAVOR).get();
            case 20:
                List list6 = AbstractC17254e.ad;
                return (Boolean) C0945e.vip.get();
            case 21:
                List list7 = AbstractC17254e.ad;
                return (Boolean) C8297e.ad.get();
            default:
                return new Boolean(((Boolean) C5527e.ad.get()).booleanValue());
        }
    }

    public AbstractC10226e adcel(AbstractC10226e abstractC10226e, C11106e c11106e, int i) {
        InterfaceC5021e loadAd = abstractC10226e.loadAd();
        List mopub = abstractC10226e.mopub();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mopub, 10));
        int i2 = 0;
        for (Object obj : mopub) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            AbstractC16232e abstractC16232e = (AbstractC16232e) obj;
            AbstractC16232e purchase = purchase(abstractC16232e, c11106e, (InterfaceC16046e) loadAd.getParameters().get(i2), i + 1);
            if (!purchase.metrica()) {
                purchase = new C7878e(purchase.ad(), AbstractC11957e.yandex(purchase.vip(), abstractC16232e.vip().Signature()));
            }
            arrayList.add(purchase);
            i2 = i3;
        }
        return AbstractC14430e.mopub(abstractC10226e, arrayList, null, 2);
    }

    @Override // defpackage.InterfaceC14454e
    public int admob(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        int i2 = -1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i2 &= ((bArr[length] & 255) - 1) >> 31;
            i -= i2;
        }
    }

    @Override // defpackage.InterfaceC12457e
    public StackTraceElement[] advert(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i5 = i2 - intValue;
                if (i2 + i5 <= stackTraceElementArr.length) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (stackTraceElementArr[intValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        }
                    }
                    int intValue2 = i2 - num.intValue();
                    if (i4 < 10) {
                        System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, intValue2);
                        i3 += intValue2;
                        i4++;
                    }
                    i = (intValue2 - 1) + i2;
                    hashMap.put(stackTraceElement, Integer.valueOf(i2));
                    i2 = i + 1;
                }
            }
            stackTraceElementArr2[i3] = stackTraceElementArr[i2];
            i3++;
            i4 = 1;
            i = i2;
            hashMap.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    public AbstractC10226e appmetrica(C11106e c11106e, C6557e c6557e, boolean z, int i, boolean z2) {
        InterfaceC2460e interfaceC2460e;
        C6557e amazon;
        boolean z3;
        InterfaceC9794e interfaceC9794e = (InterfaceC9794e) c11106e.f22007e;
        AbstractC10226e abstractC10226e = ((C14457e) interfaceC9794e).f28576e;
        if (abstractC10226e == null) {
            abstractC10226e = null;
        }
        AbstractC16232e purchase = purchase(new C7878e(1, abstractC10226e), c11106e, null, i);
        AbstractC10226e vip = AbstractC14430e.vip(purchase.vip());
        if (AbstractC4520e.purchase(vip)) {
            return vip;
        }
        purchase.ad();
        InterfaceC2460e annotations = vip.getAnnotations();
        C5401e c5401e = AbstractC16662e.vip;
        boolean z4 = false;
        InterfaceC8614e interfaceC8614e = AbstractC16662e.ad[0];
        C11720e c11720e = (C11720e) c5401e.ads(c6557e);
        if (c11720e == null || (interfaceC2460e = c11720e.ad) == null) {
            interfaceC2460e = C4590e.f9885e;
        }
        metrica(annotations, interfaceC2460e);
        if (!AbstractC4520e.purchase(vip)) {
            if (AbstractC4520e.purchase(vip)) {
                amazon = vip.smaato();
            } else {
                C6557e smaato = vip.smaato();
                C10312e c10312e = C6557e.f13492e;
                if (c6557e.isEmpty() && smaato.isEmpty()) {
                    amazon = c6557e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ConcurrentHashMap) c10312e.f20361e).values().iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        C11720e c11720e2 = (C11720e) c6557e.f27639e.get(intValue);
                        C11720e c11720e3 = (C11720e) smaato.f27639e.get(intValue);
                        if (c11720e2 != null) {
                            z3 = z4;
                            if (c11720e3 != null) {
                                InterfaceC2460e interfaceC2460e2 = c11720e2.ad;
                                InterfaceC2460e interfaceC2460e3 = c11720e3.ad;
                                if (interfaceC2460e2.isEmpty()) {
                                    interfaceC2460e2 = interfaceC2460e3;
                                } else if (!interfaceC2460e3.isEmpty()) {
                                    InterfaceC2460e[] interfaceC2460eArr = new InterfaceC2460e[2];
                                    interfaceC2460eArr[z3 ? 1 : 0] = interfaceC2460e2;
                                    interfaceC2460eArr[1] = interfaceC2460e3;
                                    interfaceC2460e2 = new C4155e(interfaceC2460eArr);
                                }
                                c11720e2 = new C11720e(interfaceC2460e2);
                            }
                            c11720e3 = c11720e2;
                        } else if (c11720e3 == null) {
                            z3 = z4;
                            c11720e3 = null;
                        } else if (c11720e2 == null) {
                            z3 = z4;
                        } else {
                            InterfaceC2460e interfaceC2460e4 = c11720e3.ad;
                            InterfaceC2460e interfaceC2460e5 = c11720e2.ad;
                            if (interfaceC2460e4.isEmpty()) {
                                z3 = z4;
                                interfaceC2460e4 = interfaceC2460e5;
                            } else if (interfaceC2460e5.isEmpty()) {
                                z3 = z4;
                            } else {
                                z3 = z4;
                                InterfaceC2460e[] interfaceC2460eArr2 = new InterfaceC2460e[2];
                                interfaceC2460eArr2[z3 ? 1 : 0] = interfaceC2460e4;
                                interfaceC2460eArr2[1] = interfaceC2460e5;
                                interfaceC2460e4 = new C4155e(interfaceC2460eArr2);
                            }
                            c11720e3 = new C11720e(interfaceC2460e4);
                        }
                        AbstractC9386e.vip(arrayList, c11720e3);
                        z4 = z3;
                    }
                    amazon = C10312e.amazon(arrayList);
                }
            }
            vip = AbstractC14430e.mopub(vip, null, amazon, 1);
        }
        AbstractC10226e startapp = AbstractC11957e.startapp(vip, z);
        return z2 ? AbstractC16481e.startapp(startapp, AbstractC1596e.appmetrica(C9494e.vip, c6557e, ((C14457e) interfaceC9794e).f28580e, (List) c11106e.f22009e, z)) : startapp;
    }

    public C11913e billing() {
        C11913e c11913e = AbstractC11786e.smaato;
        if (c11913e != null) {
            return c11913e;
        }
        C11913e vip = license(this, AbstractC6874e.startapp(new C16017e((Float.floatToRawIntBits(0.193f) << 32) | (Float.floatToRawIntBits(0.277f) & 4294967295L), new C17307e(2, 0.053f)), new C16017e((Float.floatToRawIntBits(0.176f) << 32) | (4294967295L & Float.floatToRawIntBits(0.055f)), new C17307e(2, 0.053f))), 10, 12).vip();
        AbstractC11786e.smaato = vip;
        return vip;
    }

    @Override // defpackage.InterfaceC14187e
    public void inmobi(IOException iOException) {
    }

    @Override // defpackage.InterfaceC14454e
    public void isPro(SecureRandom secureRandom) {
    }

    @Override // defpackage.InterfaceC14454e
    public int loadAd(int i, byte[] bArr) {
        int length = bArr.length - i;
        while (i < bArr.length) {
            bArr[i] = 0;
            i++;
        }
        return length;
    }

    public void metrica(InterfaceC2460e interfaceC2460e, InterfaceC2460e interfaceC2460e2) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC2460e.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC16566e) it.next()).mopub());
        }
        Iterator it2 = interfaceC2460e2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC16566e) it2.next()).mopub());
        }
    }

    @Override // defpackage.InterfaceC5483e
    public void mopub() {
    }

    @Override // defpackage.InterfaceC5483e
    public void pro(InterfaceC6347e interfaceC6347e) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC16232e purchase(AbstractC16232e abstractC16232e, C11106e c11106e, InterfaceC16046e interfaceC16046e, int i) {
        int i2;
        InterfaceC15633e interfaceC15633e = (InterfaceC9794e) c11106e.f22007e;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((AbstractC2214e) interfaceC15633e).getName());
        }
        if (abstractC16232e.metrica()) {
            return AbstractC11957e.adcel(interfaceC16046e);
        }
        AbstractC1186e vip = abstractC16232e.vip();
        InterfaceC4077e advert = vip.loadAd().advert();
        AbstractC16232e abstractC16232e2 = advert instanceof InterfaceC16046e ? (AbstractC16232e) ((Map) c11106e.f22006e).get(advert) : null;
        if (abstractC16232e2 == null) {
            AbstractC15728e subscription = abstractC16232e.vip().subscription();
            subscription.getClass();
            AbstractC10226e vip2 = AbstractC14430e.vip(subscription);
            if (!AbstractC4520e.purchase(vip2) && AbstractC11957e.metrica(vip2, C15146e.f29967e, null)) {
                InterfaceC5021e loadAd = vip2.loadAd();
                InterfaceC4077e advert2 = loadAd.advert();
                loadAd.getParameters().size();
                vip2.mopub().size();
                if (!(advert2 instanceof InterfaceC16046e)) {
                    if (!(advert2 instanceof InterfaceC9794e)) {
                        int i3 = 0;
                        AbstractC10226e adcel = adcel(vip2, c11106e, i);
                        C4542e.license(adcel);
                        for (Object obj : adcel.mopub()) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                AbstractC6874e.Signature();
                                throw null;
                            }
                            AbstractC16232e abstractC16232e3 = (AbstractC16232e) obj;
                            if (!abstractC16232e3.metrica() && !AbstractC11957e.metrica(abstractC16232e3.vip(), C15146e.f29956e, null)) {
                            }
                            i3 = i4;
                        }
                        return new C7878e(abstractC16232e.ad(), adcel);
                    }
                    InterfaceC9794e interfaceC9794e = (InterfaceC9794e) advert2;
                    if (c11106e.m3022super(interfaceC9794e)) {
                        return new C7878e(1, C18139e.vip(EnumC16799e.f32932e, ((AbstractC2214e) interfaceC9794e).getName().f2667e));
                    }
                    List mopub = vip2.mopub();
                    int i5 = 0;
                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mopub, 10));
                    for (Object obj2 : mopub) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            AbstractC6874e.Signature();
                            throw null;
                        }
                        arrayList.add(purchase((AbstractC16232e) obj2, c11106e, (InterfaceC16046e) loadAd.getParameters().get(i5), i + 1));
                        i5 = i6;
                    }
                    List parameters = ((C14457e) interfaceC9794e).f28580e.getParameters();
                    ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(parameters, 10));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((InterfaceC16046e) it.next()).vip());
                    }
                    return new C7878e(abstractC16232e.ad(), AbstractC16481e.startapp(appmetrica(new C11106e(c11106e, interfaceC9794e, arrayList, AbstractC10064e.mopub(AbstractC13480e.m3579e(arrayList, arrayList2)), 20), vip2.smaato(), vip2.Signature(), i + 1, false), adcel(vip2, c11106e, i)));
                }
            }
            return abstractC16232e;
        }
        if (abstractC16232e2.metrica()) {
            return AbstractC11957e.adcel(interfaceC16046e);
        }
        AbstractC15728e subscription2 = abstractC16232e2.vip().subscription();
        int ad = abstractC16232e2.ad();
        int ad2 = abstractC16232e.ad();
        if (ad2 != ad && ad2 != 1 && ad == 1) {
            ad = ad2;
        }
        if (interfaceC16046e == null || (i2 = interfaceC16046e.mo2738e()) == 0) {
            i2 = 1;
        }
        if (i2 != ad && i2 != 1 && ad == 1) {
            ad = 1;
        }
        metrica(vip.getAnnotations(), subscription2.getAnnotations());
        AbstractC10226e startapp = AbstractC11957e.startapp(AbstractC14430e.vip(subscription2), vip.Signature());
        C6557e smaato = vip.smaato();
        if (!AbstractC4520e.purchase(startapp)) {
            if (AbstractC4520e.purchase(startapp)) {
                smaato = startapp.smaato();
            } else {
                C6557e smaato2 = startapp.smaato();
                C10312e c10312e = C6557e.f13492e;
                if (!smaato.isEmpty() || !smaato2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = ((ConcurrentHashMap) c10312e.f20361e).values().iterator();
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        C11720e c11720e = (C11720e) smaato.f27639e.get(intValue);
                        C11720e c11720e2 = (C11720e) smaato2.f27639e.get(intValue);
                        if (c11720e != null) {
                            if (c11720e2 != null) {
                                InterfaceC2460e interfaceC2460e = c11720e.ad;
                                InterfaceC2460e interfaceC2460e2 = c11720e2.ad;
                                if (interfaceC2460e.isEmpty()) {
                                    interfaceC2460e = interfaceC2460e2;
                                } else if (!interfaceC2460e2.isEmpty()) {
                                    interfaceC2460e = new C4155e(new InterfaceC2460e[]{interfaceC2460e, interfaceC2460e2});
                                }
                                c11720e = new C11720e(interfaceC2460e);
                            }
                            c11720e2 = c11720e;
                        } else if (c11720e2 == null) {
                            c11720e2 = null;
                        } else if (c11720e != null) {
                            InterfaceC2460e interfaceC2460e3 = c11720e2.ad;
                            InterfaceC2460e interfaceC2460e4 = c11720e.ad;
                            if (interfaceC2460e3.isEmpty()) {
                                interfaceC2460e3 = interfaceC2460e4;
                            } else if (!interfaceC2460e4.isEmpty()) {
                                interfaceC2460e3 = new C4155e(new InterfaceC2460e[]{interfaceC2460e3, interfaceC2460e4});
                            }
                            c11720e2 = new C11720e(interfaceC2460e3);
                        }
                        AbstractC9386e.vip(arrayList3, c11720e2);
                    }
                    smaato = C10312e.amazon(arrayList3);
                }
            }
            startapp = AbstractC14430e.mopub(startapp, null, smaato, 1);
        }
        return new C7878e(ad, startapp);
    }

    @Override // defpackage.InterfaceC4716e
    public boolean signatures(C11469e c11469e) {
        return false;
    }

    @Override // defpackage.InterfaceC5808e
    public /* synthetic */ Object smaato(C18464e c18464e) {
        return AnalyticsConnectorRegistrar.zza(c18464e);
    }

    public void startapp(C5385e c5385e, int i, int i2) {
    }

    @Override // defpackage.InterfaceC14187e
    public void subscription(C4602e c4602e, C11058e c11058e) {
        c11058e.close();
    }

    public String toString() {
        switch (this.f19391e) {
            case 9:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9347e
    public InterfaceC1108e vip(C10872e c10872e) {
        return new C10250e(new C7602e(c10872e, null, 20));
    }

    public void yandex(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
