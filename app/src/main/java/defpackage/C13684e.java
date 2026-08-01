package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؐۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13684e implements InterfaceC12424e, InterfaceC15070e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C8928e f27106e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C5241e f27107e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C5363e f27108e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6140e f27109e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C15436e f27110e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C3887e f27111e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5363e f27112e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13825e f27113e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC6744e f27114e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C1209e f27115e;

    public C13684e(C13825e c13825e, C6140e c6140e, C5241e c5241e, C3887e c3887e, C8928e c8928e, C1209e c1209e, InterfaceC6744e interfaceC6744e, C15436e c15436e) {
        String str;
        this.f27113e = c13825e;
        this.f27109e = c6140e;
        this.f27107e = c5241e;
        this.f27111e = c3887e;
        this.f27106e = c8928e;
        this.f27115e = c1209e;
        this.f27114e = interfaceC6744e;
        this.f27110e = c15436e;
        Object metrica = ((C9000e) c13825e.vip).metrica(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Integer num = (Integer) (metrica != null ? metrica : -1);
        if (num.intValue() == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (num.intValue() == 4) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else if (num.intValue() == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (num.intValue() == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (num.intValue() == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else {
            str = "Unknown value: " + num;
        }
        if (AbstractC9464e.loadAd()) {
            Log.i("CXCP", "Device Level: " + str);
        }
        final int i = 0;
        this.f27112e = new C5363e(new Function0(this) { // from class: eٌٕٕ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C13684e f30267e;

            {
                this.f30267e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        C6434e c6434e = InterfaceC2531e.yandex;
                        InterfaceC2531e interfaceC2531e = this.f30267e.f27113e.vip;
                        c6434e.getClass();
                        return Boolean.valueOf(C6434e.vip(interfaceC2531e));
                    default:
                        C13825e c13825e2 = this.f30267e.f27113e;
                        Object obj = new Object();
                        String str2 = c13825e2.ad.f12912e;
                        return obj;
                }
            }
        });
        final int i2 = 1;
        this.f27108e = new C5363e(new Function0(this) { // from class: eٌٕٕ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C13684e f30267e;

            {
                this.f30267e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        C6434e c6434e = InterfaceC2531e.yandex;
                        InterfaceC2531e interfaceC2531e = this.f30267e.f27113e.vip;
                        c6434e.getClass();
                        return Boolean.valueOf(C6434e.vip(interfaceC2531e));
                    default:
                        C13825e c13825e2 = this.f30267e.f27113e;
                        Object obj = new Object();
                        String str2 = c13825e2.ad.f12912e;
                        return obj;
                }
            }
        });
    }

    @Override // defpackage.InterfaceC12424e
    public final AbstractC9790e ad() {
        return this.f27107e.metrica;
    }

    @Override // defpackage.InterfaceC12424e
    public final List adcel(Range range) {
        Object c12763e;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f27110e.metrica.f35233e;
            Size[] highSpeedVideoSizesFor = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoSizesFor(range) : null;
            c12763e = highSpeedVideoSizesFor != null ? AbstractC1660e.m670implements(highSpeedVideoSizesFor) : null;
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        List list = (List) (c12763e instanceof C12763e ? null : c12763e);
        return list == null ? C13664e.f27089e : list;
    }

    @Override // defpackage.InterfaceC12424e
    public final int admob() {
        int intValue = ((Number) ((C9000e) this.f27113e.vip).metrica(CameraCharacteristics.LENS_FACING)).intValue();
        if (intValue == 0) {
            return 0;
        }
        int i = 1;
        if (intValue != 1) {
            i = 2;
            if (intValue != 2) {
                if (!AbstractC9464e.admob()) {
                    return -1;
                }
                Log.w("CXCP", "Unrecognized lens facing: " + intValue + '!');
                return -1;
            }
        }
        return i;
    }

    @Override // defpackage.InterfaceC12424e
    public final void amazon(C11106e c11106e) {
        AbstractC8433e.metrica = c11106e;
    }

    @Override // defpackage.InterfaceC12424e
    public final List applovin() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f27110e.metrica.f35233e;
        Size[] highSpeedVideoSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoSizes() : null;
        return highSpeedVideoSizes != null ? AbstractC1660e.m670implements(highSpeedVideoSizes) : C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC12424e
    public final boolean appmetrica() {
        if (admob() == 2) {
            return true;
        }
        Integer num = (Integer) ((C9000e) this.f27113e.vip).metrica(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 4;
    }

    @Override // defpackage.InterfaceC12424e
    public final String billing() {
        return this.f27109e.f12912e;
    }

    @Override // defpackage.InterfaceC12424e
    /* renamed from: class */
    public final List mo3341class(int i) {
        Size[] ad = this.f27110e.ad(i);
        return ad != null ? AbstractC1660e.m670implements(ad) : C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC12424e
    public final C3909e firebase() {
        return this.f27115e.ad();
    }

    @Override // defpackage.InterfaceC12424e
    /* renamed from: interface */
    public final AbstractC9790e mo3342interface() {
        return (C1326e) this.f27111e.ad.appmetrica.getValue();
    }

    @Override // defpackage.InterfaceC12424e
    public final InterfaceC6744e isPro() {
        return this.f27114e;
    }

    @Override // defpackage.InterfaceC12424e
    public final int metrica() {
        return signatures(0);
    }

    @Override // defpackage.InterfaceC12424e
    public final Rect mopub() {
        Rect rect = (Rect) ((C9000e) this.f27113e.vip).metrica(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : rect;
    }

    @Override // defpackage.InterfaceC12424e
    /* renamed from: native */
    public final Set mo3343native() {
        Integer[] admob = this.f27110e.metrica.admob();
        return admob != null ? AbstractC1660e.m664case(admob) : C3295e.f7451e;
    }

    @Override // defpackage.InterfaceC12424e
    public final void premium(Executor executor, C4396e c4396e) {
        this.f27106e.ad(c4396e, executor);
    }

    @Override // defpackage.InterfaceC12424e
    public final String pro() {
        return ((Boolean) this.f27112e.getValue()).booleanValue() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.InterfaceC12424e
    public final boolean purchase() {
        int[] iArr = (int[]) ((C9000e) this.f27113e.vip).metrica(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        return iArr != null && AbstractC1660e.startapp(iArr, 1);
    }

    @Override // defpackage.InterfaceC12424e
    public final EnumC14627e remoteconfig() {
        int intValue = ((Number) ((C9000e) this.f27113e.vip).metrica(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)).intValue();
        EnumC14627e enumC14627e = EnumC14627e.f28861e;
        return (intValue == 0 || intValue != 1) ? enumC14627e : EnumC14627e.f28860e;
    }

    @Override // defpackage.InterfaceC12424e
    public final int signatures(int i) {
        return AbstractC3425e.vip(AbstractC3425e.billing(i), ((Number) ((C9000e) this.f27113e.vip).metrica(CameraCharacteristics.SENSOR_ORIENTATION)).intValue(), 1 == admob());
    }

    @Override // defpackage.InterfaceC12424e
    public final boolean smaato() {
        C6434e c6434e = InterfaceC2531e.yandex;
        InterfaceC2531e interfaceC2531e = this.f27113e.vip;
        c6434e.getClass();
        int[] iArr = (int[]) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            iArr = C6434e.vip;
        }
        return AbstractC1660e.startapp(iArr, 9);
    }

    @Override // defpackage.InterfaceC12424e
    public final InterfaceC12424e startapp() {
        return this;
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        C12232e c12232e = AbstractC3820e.ad;
        if (interfaceC7227e.equals(c12232e.vip(C0255e.class))) {
            return (C0255e) this.f27108e.getValue();
        }
        boolean equals = interfaceC7227e.equals(c12232e.vip(C13825e.class));
        C13825e c13825e = this.f27113e;
        return equals ? c13825e : interfaceC7227e.equals(c12232e.vip(InterfaceC2531e.class)) ? c13825e.vip : ((C9000e) c13825e.vip).mo754static(interfaceC7227e);
    }

    @Override // defpackage.InterfaceC12424e
    public final Object tapsense() {
        return (CameraCharacteristics) ((C9000e) this.f27113e.vip).mo754static(AbstractC3820e.ad.vip(CameraCharacteristics.class));
    }

    @Override // defpackage.InterfaceC12424e
    /* renamed from: this */
    public final Set mo3344this() {
        int length;
        int[] iArr = (int[]) ((C9000e) this.f27113e.vip).metrica(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        C3295e c3295e = C3295e.f7451e;
        if (iArr == null || (length = iArr.length) == 0) {
            return c3295e;
        }
        if (length == 1) {
            return Collections.singleton(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC10064e.appmetrica(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC12424e
    /* renamed from: throw */
    public final void mo3345throw(AbstractC1037e abstractC1037e) {
        C8928e c8928e = this.f27106e;
        synchronized (c8928e.f17892e) {
            c8928e.f17892e.remove(abstractC1037e);
            c8928e.f17890e = AbstractC10064e.advert(c8928e.f17892e);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.f27109e + ".cameraId>";
    }

    @Override // defpackage.InterfaceC12424e
    public final Set vip() {
        return ((InterfaceC2489e) AbstractC14380e.appmetrica(this.f27113e.vip).f6570e).vip();
    }

    @Override // defpackage.InterfaceC12424e
    /* renamed from: while */
    public final /* synthetic */ boolean mo3346while(C2362e c2362e, C17469e c17469e) {
        return AbstractC17861e.ad(this, c17469e, c2362e);
    }

    @Override // defpackage.InterfaceC12424e
    public final AbstractC9790e yandex() {
        return this.f27111e.vip.appmetrica;
    }
}
