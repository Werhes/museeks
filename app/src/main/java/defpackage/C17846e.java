package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17846e {
    public static final Range purchase = new Range(120, 120);
    public final InterfaceC2531e ad;
    public final C5363e appmetrica;
    public final C5363e license;
    public final C5363e metrica;
    public final C5363e vip;

    public C17846e(InterfaceC2531e interfaceC2531e) {
        this.ad = interfaceC2531e;
        final int i = 0;
        this.vip = new C5363e(new Function0(this) { // from class: eؒۡٗ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C17846e f4176e;

            {
                this.f4176e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int[] iArr = (int[]) ((C9000e) this.f4176e.ad).metrica(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    if (iArr[i2] == 9) {
                                        z = true;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) this.f4176e.appmetrica.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int ad = AbstractC2084e.ad((Size) next);
                            do {
                                Object next2 = it.next();
                                int ad2 = AbstractC2084e.ad((Size) next2);
                                if (ad < ad2) {
                                    next = next2;
                                    ad = ad2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        InterfaceC2531e interfaceC2531e2 = this.f4176e.ad;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C9000e) interfaceC2531e2).metrica(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new C15436e(streamConfigurationMap, new C3031e(interfaceC2531e2));
                        }
                        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((C15436e) this.f4176e.license.getValue()).metrica.f35233e;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? AbstractC1660e.m670implements(highSpeedVideoSizes) : C13664e.f27089e;
                }
            }
        });
        final int i2 = 1;
        this.metrica = new C5363e(new Function0(this) { // from class: eؒۡٗ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C17846e f4176e;

            {
                this.f4176e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int[] iArr = (int[]) ((C9000e) this.f4176e.ad).metrica(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    if (iArr[i22] == 9) {
                                        z = true;
                                    } else {
                                        i22++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) this.f4176e.appmetrica.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int ad = AbstractC2084e.ad((Size) next);
                            do {
                                Object next2 = it.next();
                                int ad2 = AbstractC2084e.ad((Size) next2);
                                if (ad < ad2) {
                                    next = next2;
                                    ad = ad2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        InterfaceC2531e interfaceC2531e2 = this.f4176e.ad;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C9000e) interfaceC2531e2).metrica(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new C15436e(streamConfigurationMap, new C3031e(interfaceC2531e2));
                        }
                        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((C15436e) this.f4176e.license.getValue()).metrica.f35233e;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? AbstractC1660e.m670implements(highSpeedVideoSizes) : C13664e.f27089e;
                }
            }
        });
        final int i3 = 2;
        this.license = new C5363e(new Function0(this) { // from class: eؒۡٗ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C17846e f4176e;

            {
                this.f4176e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int[] iArr = (int[]) ((C9000e) this.f4176e.ad).metrica(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    if (iArr[i22] == 9) {
                                        z = true;
                                    } else {
                                        i22++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) this.f4176e.appmetrica.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int ad = AbstractC2084e.ad((Size) next);
                            do {
                                Object next2 = it.next();
                                int ad2 = AbstractC2084e.ad((Size) next2);
                                if (ad < ad2) {
                                    next = next2;
                                    ad = ad2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        InterfaceC2531e interfaceC2531e2 = this.f4176e.ad;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C9000e) interfaceC2531e2).metrica(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new C15436e(streamConfigurationMap, new C3031e(interfaceC2531e2));
                        }
                        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((C15436e) this.f4176e.license.getValue()).metrica.f35233e;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? AbstractC1660e.m670implements(highSpeedVideoSizes) : C13664e.f27089e;
                }
            }
        });
        final int i4 = 3;
        this.appmetrica = new C5363e(new Function0(this) { // from class: eؒۡٗ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C17846e f4176e;

            {
                this.f4176e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        int[] iArr = (int[]) ((C9000e) this.f4176e.ad).metrica(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 < length) {
                                    if (iArr[i22] == 9) {
                                        z = true;
                                    } else {
                                        i22++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) this.f4176e.appmetrica.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int ad = AbstractC2084e.ad((Size) next);
                            do {
                                Object next2 = it.next();
                                int ad2 = AbstractC2084e.ad((Size) next2);
                                if (ad < ad2) {
                                    next = next2;
                                    ad = ad2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        InterfaceC2531e interfaceC2531e2 = this.f4176e.ad;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C9000e) interfaceC2531e2).metrica(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new C15436e(streamConfigurationMap, new C3031e(interfaceC2531e2));
                        }
                        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((C15436e) this.f4176e.license.getValue()).metrica.f35233e;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? AbstractC1660e.m670implements(highSpeedVideoSizes) : C13664e.f27089e;
                }
            }
        });
    }

    public static List ad(List list) {
        if (list.isEmpty()) {
            return C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList((Collection) AbstractC13480e.m3591interface(list));
        Iterator it = AbstractC13480e.subs(1, list).iterator();
        while (it.hasNext()) {
            arrayList.retainAll((List) it.next());
        }
        return arrayList;
    }

    public final List metrica(Size size) {
        Object c12763e;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C15436e) this.license.getValue()).metrica.f35233e;
            c12763e = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size) : null;
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        Range<Integer>[] rangeArr = (Range[]) (c12763e instanceof C12763e ? null : c12763e);
        return rangeArr != null ? AbstractC13480e.m3575continue(AbstractC1660e.isPro(rangeArr)) : C13664e.f27089e;
    }

    public final Range[] vip(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && AbstractC13480e.premium(list).size() == 1) {
            List metrica = metrica((Size) list.get(0));
            if (metrica.isEmpty()) {
                metrica = null;
            }
            if (metrica != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : metrica) {
                        Range range = (Range) obj;
                        if (AbstractC7890e.billing(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    metrica = arrayList;
                }
                return (Range[]) metrica.toArray(new Range[0]);
            }
        }
        return null;
    }
}
