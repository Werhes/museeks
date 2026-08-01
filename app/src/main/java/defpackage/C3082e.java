package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؒٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3082e {
    public final C8591e ad;
    public final Rational appmetrica;
    public C17735e billing;
    public final boolean license;
    public final Range metrica;
    public C8823e purchase;
    public final C3154e vip;

    public C3082e(C13825e c13825e, C8591e c8591e, C3154e c3154e) {
        Integer num;
        this.ad = c8591e;
        this.vip = c3154e;
        InterfaceC2531e interfaceC2531e = c13825e.vip;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        Object obj = AbstractC15542e.ad;
        Object metrica = ((C9000e) interfaceC2531e).metrica(key);
        Range range = (Range) (metrica != null ? metrica : obj);
        this.metrica = range;
        Integer num2 = (Integer) range.getUpper();
        boolean z = (num2 == null || num2.intValue() != 0) && ((num = (Integer) range.getLower()) == null || num.intValue() != 0);
        this.license = z;
        this.appmetrica = !z ? Rational.ZERO : (Rational) ((C9000e) c13825e.vip).metrica(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }
}
