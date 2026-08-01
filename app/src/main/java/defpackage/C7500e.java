package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7500e implements InterfaceC15070e, InterfaceC8500e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC15070e f15283e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f15284e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15285e = 0;

    public C7500e(TotalCaptureResult totalCaptureResult, String str) {
        this.f15284e = totalCaptureResult;
        this.f15283e = new C10224e(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            int i = Build.VERSION.SDK_INT;
            Map Signature = i >= 31 ? AbstractC16048e.Signature(totalCaptureResult) : i >= 28 ? AbstractC17305e.inmobi(totalCaptureResult) : C9139e.f18290e;
            if (Signature != null && !Signature.isEmpty()) {
                ArrayMap arrayMap = new ArrayMap(Signature.size());
                for (Map.Entry entry : Signature.entrySet()) {
                    String str2 = (String) entry.getKey();
                    C5060e.ad(str2);
                    arrayMap.put(new C5060e(str2), new C10224e((CaptureResult) entry.getValue(), str2));
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public C7500e(InterfaceC9610e interfaceC9610e, C7500e c7500e) {
        this.f15284e = interfaceC9610e;
        this.f15283e = c7500e;
    }

    @Override // defpackage.InterfaceC8500e
    public C18543e ad() {
        return (C18543e) ((InterfaceC9610e) this.f15284e).ad(AbstractC9212e.ad, C18543e.vip);
    }

    @Override // defpackage.InterfaceC8500e
    public EnumC11039e appmetrica() {
        C10224e yandex = ((C7500e) this.f15283e).yandex();
        Integer num = (Integer) yandex.f20233e.get(CaptureResult.CONTROL_AWB_STATE);
        if (num != null && num.intValue() == 0) {
            return EnumC11039e.f21868e;
        }
        if (num != null && num.intValue() == 1) {
            return EnumC11039e.f21867e;
        }
        if (num != null && num.intValue() == 2) {
            return EnumC11039e.f21869e;
        }
        if (num != null && num.intValue() == 3) {
            return EnumC11039e.f21866e;
        }
        EnumC11039e enumC11039e = EnumC11039e.f21870e;
        if (num != null && AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "Unknown AWB state (" + num.intValue() + ") for " + ((Object) C5125e.ad(yandex.f20233e.getFrameNumber())) + '!');
        }
        return enumC11039e;
    }

    @Override // defpackage.InterfaceC8500e
    public EnumC14802e billing() {
        C10224e yandex = ((C7500e) this.f15283e).yandex();
        Integer num = (Integer) yandex.f20233e.get(CaptureResult.CONTROL_AF_STATE);
        if (num != null && num.intValue() == 0) {
            return EnumC14802e.f29325e;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return EnumC14802e.f29324e;
        }
        if (num != null && num.intValue() == 4) {
            return EnumC14802e.f29330e;
        }
        if (num != null && num.intValue() == 5) {
            return EnumC14802e.f29329e;
        }
        if (num != null && num.intValue() == 2) {
            return EnumC14802e.f29327e;
        }
        if (num != null && num.intValue() == 6) {
            return EnumC14802e.f29323e;
        }
        EnumC14802e enumC14802e = EnumC14802e.f29328e;
        if (num != null && AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "Unknown AF state (" + num.intValue() + ") for " + ((Object) C5125e.ad(yandex.f20233e.getFrameNumber())) + '!');
        }
        return enumC14802e;
    }

    @Override // defpackage.InterfaceC8500e
    public long metrica() {
        Object obj = ((C7500e) this.f15283e).yandex().f20233e.get(CaptureResult.SENSOR_TIMESTAMP);
        return ((Number) (obj != null ? obj : -1L)).longValue();
    }

    @Override // defpackage.InterfaceC8500e
    public EnumC13761e purchase() {
        C10224e yandex = ((C7500e) this.f15283e).yandex();
        Integer num = (Integer) yandex.f20233e.get(CaptureResult.CONTROL_AE_STATE);
        if (num != null && num.intValue() == 0) {
            return EnumC13761e.f27263e;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return EnumC13761e.f27262e;
        }
        if (num != null && num.intValue() == 4) {
            return EnumC13761e.f27264e;
        }
        if (num != null && num.intValue() == 2) {
            return EnumC13761e.f27261e;
        }
        if (num != null && num.intValue() == 3) {
            return EnumC13761e.f27267e;
        }
        EnumC13761e enumC13761e = EnumC13761e.f27265e;
        if (num != null && AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "Unknown AE state (" + num.intValue() + ") for " + ((Object) C5125e.ad(yandex.f20233e.getFrameNumber())) + '!');
        }
        return enumC13761e;
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        switch (this.f15285e) {
            case 0:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.f15284e;
                C12232e c12232e = AbstractC3820e.ad;
                if (interfaceC7227e.equals(c12232e.vip(CaptureResult.class)) || interfaceC7227e.equals(c12232e.vip(TotalCaptureResult.class))) {
                    return totalCaptureResult;
                }
                return null;
            default:
                C7500e c7500e = (C7500e) this.f15283e;
                return interfaceC7227e.equals(AbstractC3820e.ad.vip(C7500e.class)) ? c7500e : c7500e.mo754static(interfaceC7227e);
        }
    }

    public String toString() {
        switch (this.f15285e) {
            case 0:
                StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
                C10224e c10224e = (C10224e) this.f15283e;
                sb.append((Object) C5060e.vip(c10224e.f20232e));
                sb.append(", frameNumber: ");
                sb.append(c10224e.f20233e.getFrameNumber());
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC8500e
    public int vip() {
        C10224e yandex = ((C7500e) this.f15283e).yandex();
        Integer num = (Integer) yandex.f20233e.get(CaptureResult.FLASH_STATE);
        int i = 2;
        if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 2) {
                return 3;
            }
            i = 4;
            if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 4)) {
                if (num != null && AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "Unknown flash state (" + num.intValue() + ") for " + ((Object) C5125e.ad(yandex.f20233e.getFrameNumber())) + '!');
                }
                return 1;
            }
        }
        return i;
    }

    public C10224e yandex() {
        return (C10224e) this.f15283e;
    }
}
