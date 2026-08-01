package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17073e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f33410e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f33411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17073e(int i, Object obj) {
        super(0);
        this.f33411e = i;
        this.f33410e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C17489e c17489e;
        InterfaceC0043e parentLayoutCoordinates;
        int i = this.f33411e;
        InterfaceC0043e interfaceC0043e = null;
        boolean z = false;
        Object obj = this.f33410e;
        switch (i) {
            case 0:
                AbstractC9743e.license(((C12747e) obj).f25501e, null);
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                C13119e c13119e = (C13119e) obj;
                Object metrica = c13119e.metrica();
                EnumC10292e enumC10292e = EnumC10292e.f20308e;
                if (metrica == enumC10292e && c13119e.license.getValue() == enumC10292e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return (C0763e) obj;
            case 4:
                return AbstractC14533e.startapp((C15036e) obj);
            case 5:
                View view = ((C14843e) obj).ad;
                return C12729e.vip(0L, 0L) ? AbstractC8508e.ad(view) : new C0931e(0L, AbstractC4653e.metrica(AbstractC8116e.startapp(0L), AbstractC12315e.ad(view.getContext())));
            case 6:
                ((C11795e) obj).m3238e();
                return Unit.INSTANCE;
            case 7:
                return (InputMethodManager) ((View) ((C12894e) obj).f25751e).getContext().getSystemService("input_method");
            case 8:
                C11874e c11874e = ((C13915e) obj).f27612e;
                c11874e.Signature.f25196e = true;
                C17596e c17596e = c11874e.admob;
                if (c17596e != null) {
                    c17596e.f34461e = true;
                }
                return Unit.INSTANCE;
            case 9:
                C5017e c5017e = (C5017e) obj;
                if (!((Boolean) c5017e.billing.getValue()).booleanValue() && (c17489e = c5017e.metrica) != null) {
                    c17489e.smaato();
                }
                return Unit.INSTANCE;
            case 10:
                C13245e c13245e = (C13245e) ((C16965e) obj).ad.f5914e;
                if (!c13245e.f26276e) {
                    if (c13245e.f26275e) {
                        AbstractC0143e.ad("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c13245e.ad();
                    c13245e.f26275e = true;
                }
                return Unit.INSTANCE;
            case 11:
                return ((C10663e) obj).license;
            case 12:
                return ((C1507e) obj).m618e();
            case 13:
                C5385e c5385e = (C5385e) obj;
                parentLayoutCoordinates = c5385e.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.billing()) {
                    interfaceC0043e = parentLayoutCoordinates;
                }
                if (interfaceC0043e != null && c5385e.m1893getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                C4930e c4930e = (C4930e) obj;
                c4930e.yandex = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c4930e.ad();
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 15:
                return new C2152e(((C2152e) ((InterfaceC3314e) obj).getValue()).ad);
            case 16:
                Collection values = ((AbstractC15582e) ((C13610e) obj).f27002e.metrica().metrica).values();
                if (!values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext() && !((C7589e) it.next()).license()) {
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C10014e ad = ((C15533e) obj).ad();
                C13915e c13915e = ad.f19781e;
                if (ad.f19773e != ((C12431e) ((C8794e) c13915e.Signature()).f17708e).f24868e) {
                    C0583e c0583e = ad.f19783e;
                    Object[] objArr = c0583e.metrica;
                    long[] jArr = c0583e.ad;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ((C5017e) objArr[(i2 << 3) + i4]).license = true;
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    if (c13915e.f27587e != null) {
                        if (!c13915e.f27612e.appmetrica) {
                            C13915e.m3700super(c13915e, false, 7);
                        }
                    } else if (!c13915e.subscription()) {
                        C13915e.m3699strictfp(c13915e, false, 7);
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new BaseInputConnection(((C13094e) obj).ad, false);
            default:
                Unit unit2 = Unit.INSTANCE;
                ((C14156e) obj).f27988e.setValue(unit2);
                return unit2;
        }
    }
}
